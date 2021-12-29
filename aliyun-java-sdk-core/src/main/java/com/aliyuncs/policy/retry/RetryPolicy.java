package com.aliyuncs.policy.retry;

import com.aliyuncs.exceptions.ThrottlingException;
import com.aliyuncs.policy.cache.ThrottlingPool;
import com.aliyuncs.policy.retry.backoff.BackoffStrategy;
import com.aliyuncs.policy.retry.backoff.EqualJitterBackoffStrategy;
import com.aliyuncs.policy.retry.conditions.ExceptionsCondition;
import com.aliyuncs.policy.retry.conditions.HeadersCondition;
import com.aliyuncs.policy.retry.conditions.RetryCondition;
import com.aliyuncs.policy.retry.conditions.StatusCodeCondition;

import java.text.SimpleDateFormat;
import java.util.*;

public final class RetryPolicy {
    private final int maxNumberOfRetries;
    private final int maxDelayTimeMillis;
    private final BackoffStrategy backoffStrategy;
    private final Set<RetryCondition> retryConditions;
    private final Set<RetryCondition> throttlingConditions;
    private final Boolean enableAliyunThrottlingControl;

    private RetryPolicy(BuilderImpl builder) {
        this.maxNumberOfRetries = builder.maxNumberOfRetries;
        this.maxDelayTimeMillis = builder.maxDelayTimeMillis;
        this.backoffStrategy = builder.backoffStrategy;
        this.retryConditions = builder.retryConditions;
        this.throttlingConditions = builder.throttlingConditions;
        this.enableAliyunThrottlingControl = builder.enableAliyunThrottlingControl;
    }

    /**
     * Use default retry policy
     *
     * @param enableAliyunThrottlingControl use or not use aliyun gateway throttling
     * @return retryPolicy
     */
    public static RetryPolicy defaultRetryPolicy(Boolean enableAliyunThrottlingControl) {
        return builder().enableAliyunThrottlingControl(enableAliyunThrottlingControl).build();
    }

    public static RetryPolicy none() {
        return builder()
                .maxNumberOfRetries(0)
                .build();
    }

    public Boolean shouldRetry(RetryPolicyContext context) {
        if (context.retriesAttempted() > maxNumberOfRetries) {
            return false;
        }
        if (throttlingConditions != null && !throttlingConditions.isEmpty()) {
            for (RetryCondition throttlingCondition : throttlingConditions) {
                if (throttlingCondition.meetState(context)) {
                    if (throttlingCondition.escapeTime(context) <= RetryUtil.DEFAULT_ESCAPE_TIME) {
                        return false;
                    }
                    if (enableAliyunThrottlingControl) {
                        long current = System.currentTimeMillis();
                        int escapeTime = throttlingCondition.escapeTime(context);
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
                        String endTime = df.format(new Date(current + escapeTime));
                        ThrottlingPool.put(context.coordinate(), endTime, escapeTime);
                        if (context.exception() == null || !ThrottlingException.class.isAssignableFrom(context.exception().getClass())) {
                            context.updateException(new ThrottlingException("SDK.TriggerThrottlingPolicy",
                                    "Client triggered throttling policy, server cannot be accessed before " + endTime
                                            + (context.exception() != null ? ". Error message: \n" + context.exception().getMessage() : "."), context.exception()));
                        }
                    }
                }
            }
        }
        if (getBackoffDelay(context) > maxDelayTimeMillis) {
            return false;
        }
        if (retryConditions != null && !retryConditions.isEmpty()) {
            for (RetryCondition retryCondition : retryConditions) {
                if (retryCondition.meetState(context)) {
                    return true;
                }
            }
        }
        return context.retriesAttempted() == RetryUtil.FIRST_ATTEMPTED;
    }

    public int getBackoffDelay(RetryPolicyContext context) {
        if (context.retriesAttempted() == RetryUtil.FIRST_ATTEMPTED) {
            if (ThrottlingPool.get(context.coordinate()) != null) {
                long current = System.currentTimeMillis();
                int escapeTime = ThrottlingPool.getExpire(context.coordinate());
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
                String endTime = df.format(new Date(current + escapeTime));
                if (context.exception() == null || !ThrottlingException.class.isAssignableFrom(context.exception().getClass())) {
                    context.updateException(new ThrottlingException("SDK.TriggerThrottlingPolicy",
                            "Client triggered throttling policy, server cannot be accessed before " + endTime
                                    + (context.exception() != null ? ". Error message: \n" + context.exception().getMessage() : "."), context.exception()));
                }
                return escapeTime;
            } else {
                return RetryUtil.DEFAULT_ESCAPE_TIME;
            }
        }
        int delayTimeMillis = this.backoffStrategy.computeDelayBeforeNextRetry(context);
        if (throttlingConditions != null && !throttlingConditions.isEmpty()) {
            for (RetryCondition throttlingCondition : throttlingConditions) {
                if (throttlingCondition.meetState(context)) {
                    delayTimeMillis = Math.max(delayTimeMillis, throttlingCondition.escapeTime(context));
                }
            }
        }
        return delayTimeMillis;
    }

    public static Builder builder() {
        return new BuilderImpl();
    }

    public int maxNumberOfRetries() {
        return maxNumberOfRetries;
    }

    public int maxDelayTimeMillis() {
        return maxDelayTimeMillis;
    }

    public BackoffStrategy backoffStrategy() {
        return backoffStrategy;
    }

    public Set<RetryCondition> retryConditions() {
        return retryConditions;
    }

    public Set<RetryCondition> throttlingConditions() {
        return throttlingConditions;
    }


    public Boolean enableAliyunThrottlingControl() {
        return enableAliyunThrottlingControl;
    }

    public Builder toBuilder() {
        return builder()
                .maxNumberOfRetries(maxNumberOfRetries)
                .maxDelayTimeMillis(maxDelayTimeMillis)
                .backoffStrategy(backoffStrategy)
                .retryConditions(retryConditions)
                .throttlingConditions(throttlingConditions)
                .enableAliyunThrottlingControl(enableAliyunThrottlingControl);
    }

    public interface Builder {

        Builder maxNumberOfRetries(int numRetries);

        Builder maxDelayTimeMillis(int delayTime);

        Builder backoffStrategy(BackoffStrategy backoffStrategy);

        Builder retryConditions(Set<RetryCondition> retryConditions);

        Builder throttlingConditions(Set<RetryCondition> throttlingConditions);

        Builder enableAliyunThrottlingControl(Boolean enableThrottlingControl);

        RetryPolicy build();
    }

    public static final class BuilderImpl implements Builder {
        private int maxNumberOfRetries;
        private int maxDelayTimeMillis;
        private BackoffStrategy backoffStrategy;
        private Set<RetryCondition> retryConditions = new HashSet<RetryCondition>();
        private Set<RetryCondition> throttlingConditions = new HashSet<RetryCondition>();
        private Boolean enableAliyunThrottlingControl = false;
        private static RetryCondition aliyunThrottlingCondition = HeadersCondition.create(RetryUtil.THROTTLING_PATTERNS);

        private BuilderImpl() {
            this.maxNumberOfRetries = RetryUtil.DEFAULT_MAX_RETRIES;
            this.maxDelayTimeMillis = RetryUtil.MAX_BACKOFF;
            this.backoffStrategy = new EqualJitterBackoffStrategy(RetryUtil.BASE_DELAY, this.maxDelayTimeMillis, new Random());
            this.retryConditions.add(ExceptionsCondition.create(RetryUtil.RETRYABLE_EXCEPTIONS));
            this.retryConditions.add(StatusCodeCondition.create(RetryUtil.RETRYABLE_STATUS_CODES));
        }

        @Override
        public Builder maxNumberOfRetries(int maxNumberOfRetries) {
            this.maxNumberOfRetries = maxNumberOfRetries;
            return this;
        }

        @Override
        public Builder maxDelayTimeMillis(int maxDelayTimeMillis) {
            this.maxDelayTimeMillis = maxDelayTimeMillis;
            return this;
        }

        @Override
        public Builder backoffStrategy(BackoffStrategy backoffStrategy) {
            this.backoffStrategy = backoffStrategy;
            return this;
        }

        @Override
        public Builder retryConditions(Set<RetryCondition> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }

        public Builder retryConditions(RetryCondition... retryCondition) {
            this.retryConditions = new HashSet<RetryCondition>(Arrays.asList(retryCondition));
            return this;
        }

        @Override
        public Builder throttlingConditions(Set<RetryCondition> throttlingConditions) {
            this.throttlingConditions = throttlingConditions;
            return this;
        }

        public Builder throttlingConditions(RetryCondition... throttlingCondition) {
            this.throttlingConditions = new HashSet<RetryCondition>(Arrays.asList(throttlingCondition));
            return this;
        }

        @Override
        public Builder enableAliyunThrottlingControl(Boolean enableAliyunThrottlingControl) {
            this.enableAliyunThrottlingControl = enableAliyunThrottlingControl;
            if (this.enableAliyunThrottlingControl) {
                if (!this.throttlingConditions.contains(aliyunThrottlingCondition)) {
                    this.throttlingConditions.add(aliyunThrottlingCondition);
                }
            } else {
                if (this.throttlingConditions.contains(aliyunThrottlingCondition)) {
                    this.throttlingConditions.remove(aliyunThrottlingCondition);
                }
            }
            return this;
        }

        @Override
        public RetryPolicy build() {
            return new RetryPolicy(this);
        }
    }
}
