package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 2017/10/13.
 */
public class InstanceError {

    @JsonProperty("Code")
    private String code;


    @JsonProperty("Message")
    private String message;


    @JsonIgnore
    public String getCode() {
        return code;
    }
    @JsonIgnore
    public void setCode(String code) {
        this.code = code;
    }
    @JsonIgnore
    public String getMessage() {
        return message;
    }
    @JsonIgnore
    public void setMessage(String message) {
        this.message = message;
    }

}
