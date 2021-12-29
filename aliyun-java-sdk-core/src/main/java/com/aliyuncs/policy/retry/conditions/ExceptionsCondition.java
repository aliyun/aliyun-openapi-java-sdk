package com.aliyuncs.policy.retry.conditions;

import com.aliyuncs.policy.retry.RetryPolicyContext;
import com.aliyuncs.policy.retry.RetryUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public final class ExceptionsCondition implements RetryCondition {

    private final Set<Class<? extends Exception>> exceptionsToRetryOn;

    private ExceptionsCondition(Set<Class<? extends Exception>> exceptionsToRetryOn) {
        this.exceptionsToRetryOn = new HashSet<Class<? extends Exception>>(exceptionsToRetryOn);
    }

    @Override
    public boolean meetState(RetryPolicyContext context) {
        Throwable exception = context.exception();
        if (exception == null) {
            return false;
        }
        for (Class<? extends Exception> ex : exceptionsToRetryOn) {
            if (ex.isAssignableFrom(exception.getClass())
                    || (exception.getCause() != null && ex.isAssignableFrom(exception.getCause().getClass()))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int escapeTime(RetryPolicyContext context) {
        return RetryUtil.DEFAULT_ESCAPE_TIME;
    }

    public static ExceptionsCondition create(Set<Class<? extends Exception>> exceptionsToRetryOn) {
        return new ExceptionsCondition(exceptionsToRetryOn);
    }

    public static ExceptionsCondition create(Class<? extends Exception>... exceptionsToRetryOn) {
        return new ExceptionsCondition(new HashSet<Class<? extends Exception>>(Arrays.asList(exceptionsToRetryOn)));
    }
}
