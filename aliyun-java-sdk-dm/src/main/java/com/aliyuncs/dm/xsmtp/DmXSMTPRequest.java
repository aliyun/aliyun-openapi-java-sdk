package com.aliyuncs.dm.xsmtp;

/**
 * Created by libingkui on 2017/8/21.
 */
public class DmXSMTPRequest {
    private final String userName;
    private final String password;
    private final String to;

    private DmXSMTPRequest(String userName, String password, String to) {
        this.userName = userName;
        this.password = password;
        this.to = null;
    }

    public static class DmXSMTPRequestBuilder {

    }

}
