package com.aliyuncs;

import com.aliyuncs.auth.BasicSessionCredentials;
import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.sts.AssumeRoleRequest;
import com.aliyuncs.auth.sts.AssumeRoleResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.HttpClientType;
import com.aliyuncs.http.clients.ApacheHttpClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@SuppressWarnings("deprecation")
public class BaseTest {
    protected DefaultAcsClient client = null;
    protected Credential dailyEnvCredentail = null;
    protected String accesskeyId = null;
    protected String accesskeySecret = null;
    protected String tokenAccesskeyId = null;
    protected String tokenAccesskeySecret = null;
    protected String roleArn = null;
    protected String regionId = null;

    protected Logger logger = LoggerFactory.getLogger(BaseTest.class);


    public DefaultAcsClient getClientWithRegionIdAndLogger(String regionId) throws ClientException, IOException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        profile.setLogger(logger);
        profile.setLogFormat("{request} \n" +
                "{response} \n" +
                "{ts} \n" +
                "{date_iso_8601} \n" +
                "{date_common_log}\n" +
                "{host}\n" +
                "{method} \n" +
                "{uri}\n" +
                "{version}\n" +
                "{target} \n" +
                "{hostname}\n" +
                "{code}\n" +
                "{phrase} \n" +
                "{req_header_Accept}\n" +
                "{res_header_Access-Control-Allow-Methods}\n" +
                "{req_headers} \n" +
                "{res_headers}\n" +
                "{req_body}\n" +
                "{res_body}\n" +
                "{pid}\n" +
                "{cost}\n" +
                "{start_time}\n" +
                "{time}\n" +
                "");

        return new DefaultAcsClient(profile);
    }

    public DefaultAcsClient getClientWithRegionId(String regionId) throws ClientException, IOException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        return new DefaultAcsClient(profile);
    }

    protected DefaultAcsClient getReadTimeoutClientWithRegionId(String regionId, Long readTimeoutMillis)
            throws ClientException, IOException {
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setReadTimeoutMillis(readTimeoutMillis);
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    protected DefaultAcsClient getConnectTimeoutClientWithRegionId(String regionId, Long connectionTimeoutMillis)
            throws ClientException, IOException {
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setConnectionTimeoutMillis(connectionTimeoutMillis);
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    protected DefaultAcsClient getCompatibleUrlConnClient(String regionId) {
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setClientType(HttpClientType.Compatible);
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    protected DefaultAcsClient getReadTimeoutCompatibleUrlConnClient(String regionId, Long readTimeoutMillis)
            throws ClientException, IOException {
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setClientType(HttpClientType.Compatible);
        clientConfig.setReadTimeoutMillis(readTimeoutMillis);
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    protected DefaultAcsClient getConnectTimeoutCompatibleUrlConnClient(String regionId, Long connectionTimeoutMillis) {
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setClientType(HttpClientType.Compatible);
        clientConfig.setConnectionTimeoutMillis(connectionTimeoutMillis);
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    @Before
    public void init() throws IOException, ClientException {
        this.accesskeyId = System.getenv("daily_accessKeyId");
        this.accesskeySecret = System.getenv("daily_accessSecret");
        this.tokenAccesskeyId = System.getenv("RAMAccessKeyId");
        this.tokenAccesskeySecret = System.getenv("RAMAccessKeySecret");
        this.roleArn = System.getenv("roleArn");
        this.regionId = "cn-hangzhou";
        this.client = getClientWithRegionId(this.regionId);
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

    @After
    public void destroy() throws IOException {
        ApacheHttpClient.getInstance().close();
    }
}
