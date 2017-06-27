package com.aliyuncs.dm;

/**
 * Created by libingkui on 2017/6/24.
 */
public class HangZhouDmClient extends DmClient {
    final String REGION_HANGZHOU = "cn-hangzhou";
    final String HANGZHOUENDPOINT = "dm.aliyuncs.com";

    public HangZhouDmClient(String accessKey, String accessSecret) {
        super(accessKey, accessSecret);
    }

    @Override
    public String getRegion() {
        return REGION_HANGZHOU;
    }

    @Override
    public String getEndpoint() {
        return HANGZHOUENDPOINT;
    }

}
