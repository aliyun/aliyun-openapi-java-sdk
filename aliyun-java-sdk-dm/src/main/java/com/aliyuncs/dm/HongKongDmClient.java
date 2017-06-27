package com.aliyuncs.dm;

/**
 * Created by libingkui on 2017/6/24.
 */
public class HongKongDmClient extends DmClient {
    final String REGION_HONGKONG = "cn-hongkong";
    final String HONGKONGENDPOINT = "dm.cn-hongkong.aliyuncs.com";

    public HongKongDmClient(String accessKey, String accessSecret) {
        super(accessKey, accessSecret);
    }

    @Override
    public String getRegion() {
        return REGION_HONGKONG;
    }

    @Override
    public String getEndpoint() {
        return HONGKONGENDPOINT;
    }
}
