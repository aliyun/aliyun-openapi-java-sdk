package com.aliyuncs.exceptions;

import org.junit.Assert;
import org.junit.Test;

public class ThrottlingExceptionTest {
    @Test
    public void constructorTest() {
        ThrottlingException ex2 = new ThrottlingException("code", "message");
        Assert.assertEquals("code", ex2.getErrCode());
        Assert.assertEquals("message", ex2.getErrMsg());
        Assert.assertEquals("code : message", ex2.getMessage());
        Assert.assertEquals(ErrorType.Throttling, ex2.getErrorType());
        ThrottlingException ex3 = new ThrottlingException("code", "message", new Throwable());
        Assert.assertEquals("code : message", ex3.getMessage());
        Assert.assertEquals(ErrorType.Throttling, ex3.getErrorType());
    }

    @Test
    public void requestIdTest() {
        ThrottlingException ex = new ThrottlingException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Throttling, ex.getErrorType());
        Assert.assertNull("current requestid is null", ex.getRequestId());
        ex.setRequestId("requestId");
        Assert.assertEquals("requestId", ex.getRequestId());
        ThrottlingException ex2 = new ThrottlingException("errCode", "errMsg", "requestId");
        Assert.assertEquals(ErrorType.Throttling, ex2.getErrorType());
        Assert.assertEquals("requestId", ex2.getRequestId());
        Assert.assertEquals("errCode : errMsg\r\nRequestId : requestId", ex2.getMessage());
    }

    @Test
    public void errCodeTest() {
        ThrottlingException ex = new ThrottlingException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Throttling, ex.getErrorType());
        Assert.assertEquals("errCode", ex.getErrCode());
        ex.setErrCode("newErrcode");
        Assert.assertEquals("newErrcode", ex.getErrCode());
    }

    @Test
    public void errMsgTest() {
        ThrottlingException ex = new ThrottlingException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Throttling, ex.getErrorType());
        Assert.assertEquals("errMsg", ex.getErrMsg());
        ex.setErrMsg("newErrMsg");
        Assert.assertEquals("newErrMsg", ex.getErrMsg());
    }
}