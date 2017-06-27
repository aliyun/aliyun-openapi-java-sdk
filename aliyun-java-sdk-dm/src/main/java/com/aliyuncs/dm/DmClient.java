package com.aliyuncs.dm;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

/**
 * Created by libingkui on 2017/6/24.
 */
public abstract class DmClient {
    final String PRODUCTNAME = "Dm";

    public abstract String getRegion();

    public abstract String getEndpoint();

    private final String accessKey;
    private final String accessSecret;

    DmClient(String accessKey, String accessSecret) {
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
    }

    public IAcsClient get() {
        return getClient(accessKey, accessSecret);
    }

    protected IAcsClient getClient(String accessKey, String accessSecret) {
        DefaultProfile profile = DefaultProfile.getProfile(getRegion(), accessKey, accessSecret);
        try {
            DefaultProfile.addEndpoint(getEndpoint(), getRegion(), PRODUCTNAME, getEndpoint());
        } catch (ClientException e) {
            e.printStackTrace();
        }
        IAcsClient client = new DefaultAcsClient(profile);
        return client;
    }
}
