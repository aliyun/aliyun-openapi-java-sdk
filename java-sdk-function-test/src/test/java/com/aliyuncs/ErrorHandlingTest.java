package com.aliyuncs;

import com.aliyuncs.airec.model.v20181012.PushDocumentRequest;
import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Test;

public class ErrorHandlingTest extends BaseTest {

    @Test
    public void parameterErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("actionError");
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
        request.setSysDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setSysVersion("2014-05-26");
        request.setSysAction("DescribeAccessPoints");
        request.setSysReadTimeout(1);
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

    @Test
    public void badFormatTypeTest() throws ClientException {
        PushDocumentRequest request = new PushDocumentRequest();
        request.setInstanceId("ff");
        request.setTableName("test");
        try {
            this.client.getAcsResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("InstanceNotExist", e.getErrCode());
            Assert.assertEquals("The specified instance does not exist.", e.getErrMsg());
        }
    }
}
