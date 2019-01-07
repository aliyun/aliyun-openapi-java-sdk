package com.aliyuncs.auth.sts;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.transform.UnmarshallerContext;

public class AssumeRoleResponse extends AcsResponse {

    private String requestId;

    private Credentials credentials;

    private AssumedRoleUser assumedRoleUser;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }

    @Override
    public AssumeRoleResponse getInstance(UnmarshallerContext context) {
        return AssumeRoleResponseUnmarshaller.unmarshall(this, context);
    }

    public static class Credentials {

        private String securityToken;

        private String accessKeySecret;

        private String accessKeyId;

        private String expiration;

        public String getSecurityToken() {
            return this.securityToken;
        }

        public void setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
        }

        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public void setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
        }

        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public void setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
        }

        public String getExpiration() {
            return this.expiration;
        }

        public void setExpiration(String expiration) {
            this.expiration = expiration;
        }
    }

    public static class AssumedRoleUser {

        private String arn;

        private String assumedRoleId;

        public String getArn() {
            return this.arn;
        }

        public void setArn(String arn) {
            this.arn = arn;
        }

        public String getAssumedRoleId() {
            return this.assumedRoleId;
        }

        public void setAssumedRoleId(String assumedRoleId) {
            this.assumedRoleId = assumedRoleId;
        }
    }
}
