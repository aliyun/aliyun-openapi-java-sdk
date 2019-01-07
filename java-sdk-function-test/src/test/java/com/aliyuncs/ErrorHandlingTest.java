package com.aliyuncs;

import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Test;

public class ErrorHandlingTest extends BaseTest {

    @Test
    public void parameterErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setVersion("2014-05-26");
        request.setAction("actionError");
        CommonResponse response = null;
        try {
            response = this.client.getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("InvalidParameter", e.getErrCode());
            Assert.assertEquals("The specified parameter \"Action or Version\" is not valid.",
                    e.getErrMsg()
            );
        }
    }

    @Test
    public void timeOutErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setVersion("2014-05-26");
        request.setAction("DescribeAccessPoints");
        request.setReadTimeout(1);
        CommonResponse response = null;
        try {
            response = this.client.getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertEquals("SocketTimeoutException has occurred on a socket read or accept.",
                    e.getErrMsg()
            );
        }
    }
}
