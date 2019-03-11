package com.aliyuncs;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.clients.ApacheHttpClient;

public class TimeoutTest extends BaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testApacheHttpClientSocketTimeoutException() throws IOException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
        this.getClientWithRegionId(regionId).getCommonResponse(request);

        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ServerUnreachable : SocketTimeoutException has occurred on a socket read or accept.");
        this.getReadTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);

        request.setSysReadTimeout(10000);
        this.getReadTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);

        ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
    }

    @Test
    public void testApacheHttpClientConnectTimeoutException() throws IOException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
        this.getClientWithRegionId(regionId).getCommonResponse(request);

        thrown.expect(ClientException.class);
        thrown.expectMessage(
                "SDK.ServerUnreachable : Server unreachable: org.apache.http.conn.ConnectTimeoutException");
        this.getConnectTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);

        request.setSysConnectTimeout(5000);
        this.getConnectTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);

        ApacheHttpClient.getInstance(HttpClientConfig.getDefault()).close();
    }

    @Test
    public void testCompatibleUrlConnClientSocketTimeoutException() throws IOException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        this.getCompatibleUrlConnClient(regionId).getCommonResponse(request);

        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ServerUnreachable : SocketTimeoutException has occurred on a socket read or accept.");
        this.getReadTimeoutCompatibleUrlConnClient(regionId, 1L).getCommonResponse(request);

        request.setSysReadTimeout(10000);
        this.getReadTimeoutCompatibleUrlConnClient(regionId, 1L).getCommonResponse(request);
    }

    @Test
    public void testCompatibleUrlConnClientConnectTimeoutException() throws IOException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        this.getCompatibleUrlConnClient(regionId).getCommonResponse(request);

        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ServerUnreachable : SocketTimeoutException has occurred on a socket read or accept.");
        this.getConnectTimeoutCompatibleUrlConnClient(regionId, 1L).getCommonResponse(request);

        request.setSysConnectTimeout(5000);
        this.getConnectTimeoutCompatibleUrlConnClient(regionId, 1L).getCommonResponse(request);
    }

}
