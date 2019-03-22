package com.aliyuncs;

import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.clients.ApacheHttpClient;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

public class ProxyTest extends BaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private DefaultAcsClient getRightApacheProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        ApacheHttpClient.getInstance().close();
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setHttpProxy("http://test:test@localhost:8989");
        clientConfig.setHttpsProxy("http://test:test@localhost:8989");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getWrongApacheProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        ApacheHttpClient.getInstance().close();
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
        ApacheHttpClient.getInstance().close();
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setHttpProxy("http://localhost:9898");
        clientConfig.setHttpsProxy("http://localhost:9898");
        clientConfig.setNoProxy("ecs-cn-hangzhou.aliyuncs.com");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getRightAuthProxyApacheClientWithRegionId(String regionId) throws ClientException, IOException {
        ApacheHttpClient.getInstance().close();
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setHttpProxy("http://username:right@localhost:3000");
        clientConfig.setHttpsProxy("http://username:right@localhost:3000");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getWrongAuthProxyApacheClientWithRegionId(String regionId) throws ClientException, IOException {
        ApacheHttpClient.getInstance().close();
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setHttpProxy("http://username:wrong@localhost:3000");
        clientConfig.setHttpsProxy("http://username:wrong@localhost:3000");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getRightAuthCompatibleProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setCompatibleMode(true);
        clientConfig.setHttpProxy("http://username:right@localhost:3000");
        clientConfig.setHttpsProxy("http://username:right@localhost:3000");
        profile.setHttpClientConfig(clientConfig);
        return new DefaultAcsClient(profile);
    }

    private DefaultAcsClient getWrongAuthCompatibleProxyClientWithRegionId(String regionId) throws ClientException, IOException {
        IClientProfile profile = DefaultProfile.getProfile(regionId, accesskeyId, accesskeySecret);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        clientConfig.setCompatibleMode(true);
        clientConfig.setHttpProxy("http://username:wrong@localhost:3000");
        clientConfig.setHttpsProxy("http://username:wrong@localhost:3000");
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
    public void apacheRightProxyAssertHeaderTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        HttpResponse response = getRightApacheProxyClientWithRegionId(regionId).doAction(request);
        Assert.assertNotNull(response);
        Assert.assertEquals("HTTP/1.1 o_o", response.getHeaderValue("Via"));

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
    public void compatibleRightProxyAssertHeaderTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        HttpResponse response = getRightCompatibleProxyClientWithRegionId(regionId).doAction(request);
        Assert.assertNotNull(response);
        Assert.assertEquals("HTTP/1.1 o_o", response.getHeaderValue("Via"));
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

    @Test
    public void ignoreWrongApacheProxyAssertHeaderTest() throws IOException, ClientException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        HttpResponse response = getIgnoreWrongApacheProxyClientWithRegionId(regionId).doAction(request);
        Assert.assertNotNull(response);
        Assert.assertNull(response.getHeaderValue("Via"));
    }

    // only test auth proxy server in local environment
    @Ignore
    @Test
    public void apacheRightAuthLocalProxyTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        HttpResponse response = getRightAuthProxyApacheClientWithRegionId(regionId).doAction(request);
        Assert.assertEquals(200, response.getStatus());

    }

    // only test auth proxy server in local environment
    @Ignore
    @Test
    public void apacheWrongAuthLocalProxyTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        HttpResponse response = getWrongAuthProxyApacheClientWithRegionId(regionId).doAction(request);
        Assert.assertEquals(401, response.getStatus());

    }

    // only test auth proxy server in local environment
    @Ignore
    @Test
    public void compatibleRightAuthLocalProxyTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        HttpResponse response = getRightAuthCompatibleProxyClientWithRegionId(regionId).doAction(request);
        Assert.assertEquals(200, response.getStatus());
    }

    // only test auth proxy server in local environment
    @Ignore
    @Test
    public void compatibleWrongAuthLocalProxyTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        HttpResponse response = getWrongAuthCompatibleProxyClientWithRegionId(regionId).doAction(request);
        Assert.assertEquals(401, response.getStatus());
    }

}
