package com.aliyuncs;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.exceptions.ClientException;

public class ErrorHandlingTest extends BaseTest {

    @Test
    public void parameterErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("actionError");
        try {
            this.client.getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("InvalidParameter", e.getErrCode());
            Assert.assertEquals("The specified parameter \"Action or Version\" is not valid.", e.getErrMsg());
        }
    }

    @Test
    public void timeOutErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        request.setSysReadTimeout(1);
        try {
            this.client.getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertEquals("SocketTimeoutException has occurred on a socket read or accept.", e.getErrMsg());
        }
    }
}
