package com.aliyuncs.policy.retry;

import com.aliyuncs.policy.retry.pattern.AliyunThrottlingPattern;
import com.aliyuncs.policy.retry.pattern.Pattern;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.unmodifiableSet;
import static java.util.Collections.unmodifiableMap;

public class RetryUtil {
    public static final int FIRST_ATTEMPTED = 0;
    public static final int DEFAULT_ESCAPE_TIME = -1;
    public static final int BASE_DELAY = 100;
    public static final int MAX_BACKOFF = 2 * 60 * 1000;
    public static final int DEFAULT_MAX_RETRIES = 3;
    private static int HTTP_STATUS_TOO_MANY_REQUESTS = 429;
    public static final Set<Integer> RETRYABLE_STATUS_CODES;
    public static final Set<Class<? extends Exception>> RETRYABLE_EXCEPTIONS;
    public static final Map<String, Pattern> THROTTLING_PATTERNS;
    public static final String DEFAULT_USER_API_THROTTLING_KEY = "X-RateLimit-User-API";
    public static final String DEFAULT_PATTERNS = "Remain:1";
    public static final String DEFAULT_USER_THROTTLING_KEY = "X-RateLimit-User";

    static {
        Set<Integer> retryableStatusCodes = new HashSet<Integer>();
        retryableStatusCodes.add(HttpURLConnection.HTTP_CLIENT_TIMEOUT);
        retryableStatusCodes.add(HTTP_STATUS_TOO_MANY_REQUESTS);
        retryableStatusCodes.add(HttpURLConnection.HTTP_INTERNAL_ERROR);
        retryableStatusCodes.add(HttpURLConnection.HTTP_BAD_GATEWAY);
        retryableStatusCodes.add(HttpURLConnection.HTTP_UNAVAILABLE);
        retryableStatusCodes.add(HttpURLConnection.HTTP_GATEWAY_TIMEOUT);
        RETRYABLE_STATUS_CODES = unmodifiableSet(retryableStatusCodes);

        Set<Class<? extends Exception>> retryableExceptions = new HashSet<Class<? extends Exception>>();
        retryableExceptions.add(IOException.class);
        RETRYABLE_EXCEPTIONS = unmodifiableSet(retryableExceptions);

        Map<String, Pattern> throttlingPatterns = new HashMap<String, Pattern>();
        throttlingPatterns.put(DEFAULT_USER_API_THROTTLING_KEY, new AliyunThrottlingPattern(DEFAULT_PATTERNS));
        throttlingPatterns.put(DEFAULT_USER_THROTTLING_KEY, new AliyunThrottlingPattern(DEFAULT_PATTERNS));
        THROTTLING_PATTERNS = unmodifiableMap(throttlingPatterns);
    }
}
