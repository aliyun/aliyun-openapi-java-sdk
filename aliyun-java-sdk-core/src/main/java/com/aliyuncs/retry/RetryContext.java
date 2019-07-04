package com.aliyuncs.retry;

import com.aliyuncs.AcsRequest;

public class RetryContext {
    private int retriesAttempted = 0;
    private int maxRetryTimes;
    private String httpStatusCode = "0";
    private AcsRequest originalRequest;
    private Exception exception;
    private int retryDelay = 0;
    private String actionName;
    private String version;
    private String productCode;

    public RetryContext(int maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public int getRetriesAttempted() {
        return retriesAttempted;
    }

    public void autoIncrement() {
        this.retriesAttempted += 1;
    }

    public int getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(int maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public String getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(String httpStatusCode) {
        if (httpStatusCode == null){
            return;
        }
        this.httpStatusCode = httpStatusCode;
    }

    public AcsRequest getOriginalRequest() {
        return originalRequest;
    }

    public void setOriginalRequest(AcsRequest originalRequest) {
        this.originalRequest = originalRequest;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public int getRetryDelay() {
        return retryDelay;
    }

    public void setRetryDelay(int retryDelay) {
        this.retryDelay = retryDelay;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
