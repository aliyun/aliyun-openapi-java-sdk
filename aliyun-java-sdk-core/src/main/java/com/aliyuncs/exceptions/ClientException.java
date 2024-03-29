package com.aliyuncs.exceptions;

import java.util.Map;

public class ClientException extends Exception {

    private static final long serialVersionUID = 534996425110290578L;

    private String requestId;

    private String errCode;

    private String errMsg;

    private ErrorType errorType;

    private String errorDescription;

    private Map<String, Object> accessDeniedDetail;

    public ClientException(String errorCode, String errorMessage, String requestId, String errorDescription, Map<String, Object> accessDeniedDetail) {
        this(errorCode, errorMessage);
        this.setErrorDescription(errorDescription);
        this.setRequestId(requestId);
        this.setAccessDeniedDetail(accessDeniedDetail);
    }

    public ClientException(String errorCode, String errorMessage, String requestId, String errorDescription) {
        this(errorCode, errorMessage);
        this.setErrorDescription(errorDescription);
        this.setRequestId(requestId);
    }

    public ClientException(String errCode, String errMsg, String requestId) {
        this(errCode, errMsg);
        this.requestId = requestId;
        this.setErrorType(ErrorType.Client);
    }

    public ClientException(String errCode, String errMsg, Throwable cause) {
        super(errCode + " : " + errMsg, cause);
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.setErrorType(ErrorType.Client);
    }

    public ClientException(String errCode, String errMsg) {
        super(errCode + " : " + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.setErrorType(ErrorType.Client);
    }

    public ClientException(String message) {
        super(message);
        this.setErrorType(ErrorType.Client);
    }

    public ClientException(Throwable cause) {
        super(cause);
        this.setErrorType(ErrorType.Client);
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public Map<String, Object> getAccessDeniedDetail() {
        return accessDeniedDetail;
    }

    public void setAccessDeniedDetail(Map<String, Object> accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + (null == getRequestId() ? "" : "\r\nRequestId : " + getRequestId()) +
                (null == getErrorDescription() ? "" : "\r\nDescription : " + getErrorDescription());
    }
}
