package com.aliyuncs;

import com.aliyuncs.http.HttpClientConfig;
import org.junit.Before;

import com.aliyuncs.auth.BasicSessionCredentials;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.sts.AssumeRoleRequest;
import com.aliyuncs.auth.sts.AssumeRoleResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

@SuppressWarnings("deprecation")
public class BaseTest {

    protected DefaultAcsClient client = null;
    protected IAcsClient timeoutClient = null;
    protected Credential dailyEnvCredentail = null;
    protected String accesskeyId = null;
    protected String accesskeySecret = null;
    protected String tokenAccesskeyId = null;
    protected String tokenAccesskeySecret = null;
    protected String roleArn = null;
    protected String regionId = null;

    public DefaultAcsClient getClientWithRegionId(String regionId) {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getTimeoutClientWithRegionId(String regionId) {
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setReadTimeoutMillis(1);
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    @Before
    public void init() {
        this.accesskeyId = System.getenv("daily_accessKeyId");
        this.accesskeySecret = System.getenv("daily_accessSecret");
        this.tokenAccesskeyId = System.getenv("RAMAccessKeyId");
        this.tokenAccesskeySecret = System.getenv("RAMAccessKeySecret");
        this.roleArn = System.getenv("roleArn");
        this.regionId = "cn-hangzhou";
        client = getClientWithRegionId(this.regionId);
        timeoutClient = getTimeoutClientWithRegionId(this.regionId);
        dailyEnvCredentail = new Credential(accesskeyId, accesskeySecret);

    }

    protected String getToken() throws ClientException {
        DefaultProfile profile = DefaultProfile.getProfile(this.regionId, this.tokenAccesskeyId,
                this.tokenAccesskeySecret);
        IAcsClient client = new DefaultAcsClient(profile);
        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest();
        assumeRoleRequest.setRoleArn(this.roleArn);
        assumeRoleRequest.setRoleSessionName("alice_test");
        AssumeRoleResponse assumeRoleResponse = client.getAcsResponse(assumeRoleRequest);
        return assumeRoleResponse.getCredentials().getSecurityToken();
    }

    protected DefaultAcsClient createDefaultAcsClient() throws ClientException {
        BasicSessionCredentials credentials = new BasicSessionCredentials(this.tokenAccesskeyId,
                this.tokenAccesskeySecret, getToken());
        DefaultProfile profile = DefaultProfile.getProfile(this.regionId);
        return new DefaultAcsClient(profile, credentials);
    }
}
