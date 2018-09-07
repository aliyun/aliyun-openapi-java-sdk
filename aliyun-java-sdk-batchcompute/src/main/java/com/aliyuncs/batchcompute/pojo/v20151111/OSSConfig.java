package com.aliyuncs.batchcompute.pojo.v20151111;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by guangchun.luo on 16/3/2.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OSSConfig {


    @JsonProperty("AccessKeyId")
    private String accessKeyId;

    @JsonProperty("AccessKeySecret")
    private String accessKeySecret;

    @JsonProperty("SecurityToken")
    private String securityToken;


    @JsonIgnore
    public String getAccessKeyId() {
        return accessKeyId;
    }
    @JsonIgnore
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }
    @JsonIgnore
    public String getAccessKeySecret() {
        return accessKeySecret;
    }
    @JsonIgnore
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }
    @JsonIgnore
    public String getSecurityToken() {
        return securityToken;
    }
    @JsonIgnore
    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }


}
