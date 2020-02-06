package com.aliyuncs;

import com.aliyuncs.transform.UnmarshallerContext;

public class AcsError extends AcsResponse {

    private int statusCode;
    private String errorCode;
    private String errorMessage;
    private String requestId;
    private String errorDescription;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public AcsError getInstance(UnmarshallerContext context) {
        return AcsErrorUnmarshaller.unmarshall(this, context);
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AcsError{");
        sb.append("statusCode=").append(statusCode);
        sb.append(", errorCode='").append(errorCode).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", requestId='").append(requestId).append('\'');
        sb.append(", errorDescription='").append(errorDescription).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
