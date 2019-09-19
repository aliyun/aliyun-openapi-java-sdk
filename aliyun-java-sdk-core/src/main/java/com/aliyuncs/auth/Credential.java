package com.aliyuncs.auth;

import java.util.Calendar;
import java.util.Date;

@Deprecated
public class Credential {

    private final Date refreshDate;
    private Date expiredDate;
    private String accessKeyId;
    private String accessSecret;
    private String securityToken;

    public Credential() {
        this.refreshDate = new Date();
    }

    public Credential(String keyId, String secret) {
        this.accessKeyId = keyId;
        this.accessSecret = secret;
        this.refreshDate = new Date();
    }

    public Credential(String keyId, String secret, String securityToken) {
        this.accessKeyId = keyId;
        this.accessSecret = secret;
        this.securityToken = securityToken;
        this.refreshDate = new Date();
    }

    public Credential(String keyId, String secret, int expiredHours) {
        this.accessKeyId = keyId;
        this.accessSecret = secret;
        this.refreshDate = new Date();

        setExpiredDate(expiredHours);
    }

    public Credential(String keyId, String secret, String securityToken, int expiredHours) {
        this.accessKeyId = keyId;
        this.accessSecret = secret;
        this.securityToken = securityToken;
        this.refreshDate = new Date();

        setExpiredDate(expiredHours);
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }

    public boolean isExpired() {
        return this.expiredDate == null || this.expiredDate.after(new Date());
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public Date getRefreshDate() {
        return refreshDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    private void setExpiredDate(int expiredHours) {
        if (expiredHours > 0) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.add(Calendar.HOUR, expiredHours);
            expiredDate = cal.getTime();
        }
    }

}
