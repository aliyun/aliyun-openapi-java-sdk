package com.aliyuncs;


import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import org.junit.Assert;
import org.junit.Test;

public class CoreTest extends BaseTest {


    @Test
    public void basicRpcConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setVersion("2014-05-26");
        request.setAction("DescribeAccessPoints");
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void basicRoaConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ros.aliyuncs.com");
        request.setVersion("2015-09-01");
        request.setAction("DescribeResourceTypes");
        request.setUriPattern("/resource_types");
        request.setMethod(MethodType.GET);
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void basicRpcStsTokenConnectionsTest() throws ClientException {
        DefaultAcsClient client = this.creatDefaultAcsClient();
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response = client.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(0 <= response.getTotalCount());
    }

    @Test
    public void basicRoaTokenConnectionsTest() throws ClientException {
        DefaultAcsClient client = creatDefaultAcsClient();
        CommonRequest request = new CommonRequest();
        request.setDomain("ros.aliyuncs.com");
        request.setVersion("2015-09-01");
        request.setAction("DescribeResourceTypes");
        request.setUriPattern("/resource_types");
        request.setMethod(MethodType.GET);
        CommonResponse response = client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void httpsModeOfRpcConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setVersion("2014-05-26");
        request.setAction("DescribeAccessPoints");
        request.setProtocol(ProtocolType.HTTPS);
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void httpsModeOfRoaConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ros.aliyuncs.com");
        request.setVersion("2015-09-01");
        request.setAction("DescribeResourceTypes");
        request.setUriPattern("/resource_types");
        request.setMethod(MethodType.GET);
        request.setProtocol(ProtocolType.HTTPS);
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void serverUnreachableTest() {
        CommonRequest request = new CommonRequest();
        request.setDomain("www.serverUnreachableTest.com");
        request.setVersion("2018-11-28");
        request.setAction("serverUnreachableTest");
        CommonResponse response = null;
        try {
            response = client.getCommonResponse(request);
            Assert.fail("No exceptions thrown");
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertEquals(
                    "Server unreachable: java.net.UnknownHostException: www.serverUnreachableTest.com",
                    e.getErrMsg()
            );
        }
    }

    @Test
    public void unicodeAndQueryTest() throws ClientException {
        DefaultAcsClient client = this.creatDefaultAcsClient();
        CommonRequest request = new CommonRequest();
        request.setDomain("ros.aliyuncs.com");
        request.setVersion("2015-09-01");
        request.setAction("DescribeResourceTypes");
        request.setUriPattern("/resource_types");
        request.setMethod(MethodType.GET);
        request.putQueryParameter("testParam", "O(∩_∩)O&&&&&哈&&&哈~");
        CommonResponse response = client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }
}
