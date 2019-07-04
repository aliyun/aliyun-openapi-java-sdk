package com.aliyuncs.retry.retrycondition;

import com.aliyuncs.retry.RetryContext;
import com.aliyuncs.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ResponseRetryCondition implements RetryCondition {
    private List<String> exceptions = new ArrayList<String>();
    private String[] defaultRetryableHttpStatusList = new String[]{"500","502","503","504"};
    private String successCode = "200";
    public ResponseRetryCondition() {
        exceptions.add("SocketTimeoutException");
        exceptions.add("timed out");
    }

    @Override
    public boolean shouldRetry(RetryContext context) {
        String httpStatusCode = context.getHttpStatusCode();
        if (this.successCode.equals(httpStatusCode)) {
            return false;
        }
        if (StringUtils.validateStringInArray(httpStatusCode, this.defaultRetryableHttpStatusList)){
            return true;
        }
        if (context.getException() == null) {
            return false;
        }
        String requestException = context.getException().getMessage();
        for (String exception : exceptions) {
            if (requestException.matches(exception)) {
                return true;
            }
        }
        return false;
    }
}
