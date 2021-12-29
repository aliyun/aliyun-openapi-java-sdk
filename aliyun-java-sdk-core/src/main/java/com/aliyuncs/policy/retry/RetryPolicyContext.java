package com.aliyuncs.policy.retry;


import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;

import java.util.Map;

public final class RetryPolicyContext {

    private final String coordinate;
    private final HttpRequest httpRequest;
    private final HttpResponse httpResponse;
    private Throwable exception;
    private final int retriesAttempted;
    private final Integer httpStatusCode;
    private final Map<String, String> httpHeaders;

    private RetryPolicyContext(Builder builder) {
        this.coordinate = builder.coordinate;
        this.httpRequest = builder.httpRequest;
        this.httpResponse = builder.httpResponse;
        this.exception = builder.exception;
        this.retriesAttempted = builder.retriesAttempted;
        this.httpStatusCode = this.httpResponse != null ? this.httpResponse.getStatus() : null;
        this.httpHeaders = this.httpResponse != null ? this.httpResponse.getSysHeaders() : null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String coordinate() {
        return this.coordinate;
    }

    public HttpRequest httpRequest() {
        return this.httpRequest;
    }

    public HttpResponse httpResponse() {
        return this.httpResponse;
    }

    public Throwable exception() {
        return this.exception;
    }

    public RetryPolicyContext updateException(Throwable exception) {
        this.exception = exception;
        return this;
    }

    public int retriesAttempted() {
        return this.retriesAttempted;
    }

    public Integer httpStatusCode() {
        return this.httpStatusCode;
    }

    public Map<String, String> httpHeaders() {
        return this.httpHeaders;
    }

    public static final class Builder {
        private String coordinate;
        private HttpRequest httpRequest;
        private HttpResponse httpResponse;
        private Throwable exception;
        private int retriesAttempted;

        private Builder() {
        }

        public Builder coordinate(String coordinate) {
            this.coordinate = coordinate;
            return this;
        }

        public Builder httpRequest(HttpRequest httpRequest) {
            this.httpRequest = httpRequest;
            return this;
        }

        public Builder httpResponse(HttpResponse httpResponse) {
            this.httpResponse = httpResponse;
            return this;
        }

        public Builder exception(Throwable exception) {
            this.exception = exception;
            return this;
        }

        public Builder retriesAttempted(int retriesAttempted) {
            this.retriesAttempted = retriesAttempted;
            return this;
        }

        public RetryPolicyContext build() {
            return new RetryPolicyContext(this);
        }

    }

}
