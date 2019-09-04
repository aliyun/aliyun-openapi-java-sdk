package com.aliyuncs;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.clients.ApacheHttpClient;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;

public class TimeoutTest extends BaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testApacheHttpClientSocketTimeoutException() throws IOException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        this.client.getCommonResponse(request);
        ApacheHttpClient.getInstance().close();
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ReadTimeout : SocketTimeoutException has occurred on a socket read or accept.");
        this.getReadTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);
        request.setSysReadTimeout(10000);
        this.getReadTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);
    }

    @Test
    public void testApacheHttpClientConnectTimeoutException() throws IOException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        this.getClientWithRegionId(regionId).getCommonResponse(request);
        ApacheHttpClient.getInstance().close();
        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ServerUnreachable : Server unreachable");
        this.getConnectTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);

        request.setSysConnectTimeout(5000);
        this.getConnectTimeoutClientWithRegionId(regionId, 1L).getCommonResponse(request);
    }

    @Test
    public void testCompatibleUrlConnClientSocketTimeoutException() throws IOException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        this.getCompatibleUrlConnClient(regionId).getCommonResponse(request);

        thrown.expect(ClientException.class);
        thrown.expectMessage("SDK.ReadTimeout : SocketTimeoutException has occurred on a socket read or accept.");
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
        thrown.expectMessage("SDK.ReadTimeout : SocketTimeoutException has occurred on a socket read or accept.");
        request.setSysDomain("rds.aliyuncs.com");
        request.setSysVersion("2014-08-15");
        request.setSysAction("DescribeRegions");
        this.getConnectTimeoutCompatibleUrlConnClient(regionId, 1L).getCommonResponse(request);

        request.setSysConnectTimeout(5000);
        this.getConnectTimeoutCompatibleUrlConnClient(regionId, 1L).getCommonResponse(request);
    }

}
