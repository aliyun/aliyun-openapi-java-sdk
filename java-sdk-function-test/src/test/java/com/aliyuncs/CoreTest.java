package com.aliyuncs;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.rds.model.v20140815.DescribeAccountsRequest;

public class CoreTest extends BaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void basicRpcConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ots.us-east-1.aliyuncs.com");
        request.setSysVersion("2016-06-20");
        request.setSysAction("ListClusterType");
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void basicRoaConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("imagesearch.ap-southeast-2.aliyuncs.com");
        request.setSysVersion("2018-01-20");
        request.setSysAction("SearchItem");
        request.setSysUriPattern("/item/search");
        request.setSysMethod(MethodType.POST);
        thrown.expect(ClientException.class);
        thrown.expectMessage("MissinginstanceName : instanceName is mandatory for this action.");
        this.client.getCommonResponse(request);
    }

    @Test
    public void basicRpcStsTokenConnectionsTest() throws ClientException, IOException {
        DefaultAcsClient client = this.createDefaultAcsClient();
        DescribeAccountsRequest request = new DescribeAccountsRequest();
        thrown.expect(ClientException.class);
        thrown.expectMessage("MissingParameter : The input parameter \"DBInstanceId\" that is mandatory for processing "
                + "this request is not supplied.");
        client.getAcsResponse(request);
    }

    @Test
    public void basicRoaTokenConnectionsTest() throws ClientException, IOException {
        DefaultAcsClient client = createDefaultAcsClient();
        CommonRequest request = new CommonRequest();
        request.setSysDomain("imagesearch.ap-southeast-2.aliyuncs.com");
        request.setSysVersion("2018-01-20");
        request.setSysAction("SearchItem");
        request.setSysUriPattern("/item/search");
        request.setSysMethod(MethodType.POST);
        thrown.expect(ClientException.class);
        thrown.expectMessage("MissinginstanceName : instanceName is mandatory for this action.");
        client.getCommonResponse(request);
    }

    @Test
    public void httpsModeOfRpcConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ots.us-east-1.aliyuncs.com");
        request.setSysVersion("2016-06-20");
        request.setSysAction("ListClusterType");
        request.setSysProtocol(ProtocolType.HTTPS);
        CommonResponse response = this.client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }

    @Test
    public void httpsModeOfRoaConnectionsTest() throws ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("imagesearch.ap-southeast-2.aliyuncs.com");
        request.setSysVersion("2018-01-20");
        request.setSysAction("SearchItem");
        request.setSysUriPattern("/item/search");
        request.setSysMethod(MethodType.POST);
        request.setSysProtocol(ProtocolType.HTTPS);
        thrown.expect(ClientException.class);
        thrown.expectMessage("MissinginstanceName : instanceName is mandatory for this action.");
        this.client.getCommonResponse(request);
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
            Assert.assertTrue(e.getErrMsg().contains(
                    "Server unreachable: java.net.UnknownHostException: www.serverUnreachableTest.com"));
        }
    }

    @Test
    public void unicodeAndQueryTest() throws ClientException, IOException {
        DefaultAcsClient client = this.createDefaultAcsClient();
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ots.us-east-1.aliyuncs.com");
        request.setSysVersion("2016-06-20");
        request.setSysAction("ListInstance");
        request.putQueryParameter("testParam", "O(∩_∩)O&&&&&哈&&&哈~");
        CommonResponse response = client.getCommonResponse(request);
        Assert.assertEquals(200, response.getHttpStatus());
        Assert.assertNotNull(response.getData());
    }
}
