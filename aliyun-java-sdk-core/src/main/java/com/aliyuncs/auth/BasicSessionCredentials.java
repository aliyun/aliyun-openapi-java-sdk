package com.aliyuncs.auth;

public class BasicSessionCredentials implements AlibabaCloudCredentials {

    protected final long roleSessionDurationSeconds;
    private final String accessKeyId;
    private final String accessKeySecret;
    private final String sessionToken;
    private final double expireFact = 0.95;
    private long sessionStartedTimeInMilliSeconds = 0;

    public BasicSessionCredentials(String accessKeyId, String accessKeySecret, String sessionToken) {
        this(accessKeyId, accessKeySecret, sessionToken, 0);
    }

    public BasicSessionCredentials(String accessKeyId, String accessKeySecret, String sessionToken,
            long roleSessionDurationSeconds) {
        if (accessKeyId == null) {
            throw new IllegalArgumentException("Access key ID cannot be null.");
        }
        if (accessKeySecret == null) {
            throw new IllegalArgumentException("Access key secret cannot be null.");
        }

        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
        this.sessionToken = sessionToken;
        this.roleSessionDurationSeconds = roleSessionDurationSeconds;
        this.sessionStartedTimeInMilliSeconds = System.currentTimeMillis();
    }

    @Override
    public String getAccessKeyId() {
        return accessKeyId;
    }

    @Override
    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public boolean willSoonExpire() {
        if (roleSessionDurationSeconds == 0) {
            return false;
        }
        long now = System.currentTimeMillis();
        return roleSessionDurationSeconds * expireFact < (now - sessionStartedTimeInMilliSeconds) / 1000.0;
    }
}
