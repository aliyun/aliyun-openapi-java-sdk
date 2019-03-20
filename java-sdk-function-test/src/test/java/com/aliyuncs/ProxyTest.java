package com.aliyuncs;

import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.clients.ApacheHttpClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

public class ProxyTest extends BaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private DefaultAcsClient getRightApacheProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setHttpProxy("http://localhost:8989");
        clientConfig.setHttpsProxy("http://localhost:8989");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getWrongApacheProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setHttpProxy("http://localhost:9898");
        clientConfig.setHttpsProxy("http://localhost:9898");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getRightCompatibleProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setCompatibleMode(true);
        clientConfig.setHttpProxy("http://localhost:8989");
        clientConfig.setHttpsProxy("http://localhost:8989");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getWrongCompatibleProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setCompatibleMode(true);
        clientConfig.setHttpProxy("http://localhost:9898");
        clientConfig.setHttpsProxy("http://localhost:9898");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getIgnoreWrongApacheProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setHttpProxy("http://localhost:9898");
        clientConfig.setHttpsProxy("http://localhost:9898");
        clientConfig.setNoProxy("ecs-cn-hangzhou.aliyuncs.com");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    @Test
    public void apacheRightProxyTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = getRightApacheProxyClientWithRegionId(regionId).getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

    @Test
    public void apacheWrongProxyTest() throws ClientException, IOException {
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ServerUnreachable");
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = getWrongApacheProxyClientWithRegionId(regionId).getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

    @Test
    public void compatibleRightProxyTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = getRightCompatibleProxyClientWithRegionId(regionId).getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

    @Test
    public void compatibleWrongProxyTest() throws ClientException, IOException {
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ServerUnreachable");
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = getWrongCompatibleProxyClientWithRegionId(regionId).getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

    @Test
    public void ignoreWrongApacheProxyTest() throws IOException, ClientException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = getIgnoreWrongApacheProxyClientWithRegionId(regionId).getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

}
