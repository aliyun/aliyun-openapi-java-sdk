package com.aliyuncs.exceptions;

import org.junit.Assert;
import org.junit.Test;

public class ServerExceptionTest {
    @Test
    public void constructorTest() {
        ServerException ex2 = new ServerException("code", "message");
        Assert.assertEquals("code", ex2.getErrCode());
        Assert.assertEquals("message", ex2.getErrMsg());
        Assert.assertEquals("code : message", ex2.getMessage());
        Assert.assertEquals(ErrorType.Server, ex2.getErrorType());
    }

    @Test
    public void requestIdTest() {
        ServerException ex = new ServerException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Server, ex.getErrorType());
        Assert.assertNull("current requestid is null", ex.getRequestId());
        ex.setRequestId("requestId");
        Assert.assertEquals("requestId", ex.getRequestId());
        ServerException ex2 = new ServerException("errCode", "errMsg", "requestId");
        Assert.assertEquals(ErrorType.Server, ex2.getErrorType());
        Assert.assertEquals("requestId", ex2.getRequestId());
        Assert.assertEquals("errCode : errMsg\r\nRequestId : requestId", ex2.getMessage());
    }

    @Test
    public void errCodeTest() {
        ServerException ex = new ServerException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Server, ex.getErrorType());
        Assert.assertEquals("errCode", ex.getErrCode());
        ex.setErrCode("newErrcode");
        Assert.assertEquals("newErrcode", ex.getErrCode());
    }

    @Test
    public void errMsgTest() {
        ServerException ex = new ServerException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Server, ex.getErrorType());
        Assert.assertEquals("errMsg", ex.getErrMsg());
        ex.setErrMsg("newErrMsg");
        Assert.assertEquals("newErrMsg", ex.getErrMsg());
    }
}