package com.aliyuncs.green.model.v20180509;

import java.io.Serializable;

public class UploadCredentials implements Serializable {

    private String accessKeyId;
    private String  accessKeySecret;
    private String  securityToken;
    private Long  expiredTime;
    private String  ossEndpoint;
    private String  uploadBucket;
    private String  uploadFolder;

    public UploadCredentials(String accessKeyId, String accessKeySecret, String securityToken, Long expiredTime, String ossEndpoint, String uploadBucket, String uploadFolder) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.securityToken = securityToken;
        this.expiredTime = expiredTime;
        this.ossEndpoint = ossEndpoint;
        this.uploadBucket = uploadBucket;
        this.uploadFolder = uploadFolder;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public Long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getOssEndpoint() {
        return ossEndpoint;
    }

    public void setOssEndpoint(String ossEndpoint) {
        this.ossEndpoint = ossEndpoint;
    }

    public String getUploadBucket() {
        return uploadBucket;
    }

    public void setUploadBucket(String uploadBucket) {
        this.uploadBucket = uploadBucket;
    }

    public String getUploadFolder() {
        return uploadFolder;
    }

    public void setUploadFolder(String uploadFolder) {
        this.uploadFolder = uploadFolder;
    }
}
