package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 15/12/7.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstanceResult {


    @JsonProperty("ExitCode")
    private int exitCode;

    @JsonProperty("ErrorCode")
    private String errorCode;

    @JsonProperty("ErrorMessage")
    private String errorMessage;


    @JsonProperty("Detail")
    private String detail;


    @JsonIgnore
    public int getExitCode() {
        return exitCode;
    }

    @JsonIgnore
    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }

    @JsonIgnore
    public String getErrorCode() {
        return errorCode;
    }

    @JsonIgnore
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonIgnore
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @JsonIgnore
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonIgnore
    public String getDetail() {
        return this.detail;
    }

    @JsonIgnore
    public void setDetail(String detail) {
        this.detail = detail;
    }
}
