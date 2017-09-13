package com.aliyuncs.dm;

/**
 * Created by libingkui on 2017/7/11.
 */
public class SingaporeDmClient extends DmClient {
    final String REGION_SINGAPORE = "ap-southeast-1";
    final String SINGAPOREENDPOINT = "dm.ap-southeast-1.aliyuncs.com";

    public SingaporeDmClient(String accessKey, String accessSecret) {
        super(accessKey, accessSecret);
    }

    @Override
    public String getRegion() {
        return REGION_SINGAPORE;
    }

    @Override
    public String getEndpoint() {
        return SINGAPOREENDPOINT;
    }

}
