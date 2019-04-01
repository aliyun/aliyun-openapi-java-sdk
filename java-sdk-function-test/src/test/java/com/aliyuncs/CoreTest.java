package com.aliyuncs;

import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.clients.ApacheHttpClient;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

public class CoreTest extends BaseTest {

    @Test
    public void basicRpcConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void basicRoaConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ros.aliyuncs.com");
        request.setSysVersion("2015-09-01");
        request.setSysAction("DescribeResourceTypes");
        request.setSysUriPattern("/resource_types");
        request.setSysMethod(MethodType.GET);
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void basicRpcStsTokenConnectionsTest() throws ClientException {
        DefaultAcsClient client = this.createDefaultAcsClient();
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

    @Test
    public void basicRoaTokenConnectionsTest() throws ClientException {
        DefaultAcsClient client = createDefaultAcsClient();
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ros.aliyuncs.com");
        request.setSysVersion("2015-09-01");
        request.setSysAction("DescribeResourceTypes");
        request.setSysUriPattern("/resource_types");
        request.setSysMethod(MethodType.GET);
        CommonResponse response = client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void httpsModeOfRpcConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        request.setSysProtocol(ProtocolType.HTTPS);
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void httpsModeOfRoaConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ros.aliyuncs.com");
        request.setSysVersion("2015-09-01");
        request.setSysAction("DescribeResourceTypes");
        request.setSysProtocol(ProtocolType.HTTPS);
        request.setSysUriPattern("/resource_types");
        request.setSysMethod(MethodType.GET);
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void serverUnreachableTest() {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("www.serverUnreachableTest.com");
        request.setSysVersion("2018-11-28");
        request.setSysAction("serverUnreachableTest");
        try {
            client.getCommonResponse(request);
            Assert.fail("No exceptions thrown");
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertTrue(e.getErrMsg().contains("Server unreachable: connection"));
            Assert.assertTrue(e.getErrMsg().contains("failed"));
        }
    }

    @Test
    public void unicodeAndQueryTest() throws ClientException {
        DefaultAcsClient client = this.createDefaultAcsClient();
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ros.aliyuncs.com");
        request.setSysVersion("2015-09-01");
        request.setSysAction("DescribeResourceTypes");
        request.setSysUriPattern("/resource_types");
        request.setSysMethod(MethodType.GET);
        request.putQueryParameter("testParam", "O(∩_∩)O&&&&&哈&&&哈~");
        CommonResponse response = client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void emptyPOSTHttpRequestTest() {
        CommonRequest request = new CommonRequest();
        request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("QuerySendDetails");
        request.putQueryParameter("PhoneNumber", "12345678900");
        request.putQueryParameter("SendDate", "2019-3-20");
        request.putQueryParameter("PageSize", "100");
        request.putQueryParameter("CurrentPage", "1");

        try {
            client.getCommonResponse(request);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    // only test logger in local environment
    @Ignore
    @Test
    public void loggerTest() throws ClientException, IOException {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = getClientWithRegionIdAndLogger(this.regionId).getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
        ApacheHttpClient.getInstance().close();
    }

}
