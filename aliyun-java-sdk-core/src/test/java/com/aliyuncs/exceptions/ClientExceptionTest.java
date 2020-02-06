package com.aliyuncs.exceptions;

import org.junit.Assert;
import org.junit.Test;

public class ClientExceptionTest {
    @Test
    public void constructorTest() {
        ClientException ex = new ClientException("client exception message");
        Assert.assertEquals("client exception message", ex.getMessage());
        Assert.assertEquals(ErrorType.Client, ex.getErrorType());
        ClientException ex2 = new ClientException("code", "message");
        Assert.assertEquals("code", ex2.getErrCode());
        Assert.assertEquals("message", ex2.getErrMsg());
        Assert.assertEquals("code : message", ex2.getMessage());
        Assert.assertEquals(ErrorType.Client, ex2.getErrorType());
        ClientException ex3 = new ClientException(new Throwable());
        Assert.assertEquals("java.lang.Throwable", ex3.getMessage());
        Assert.assertEquals(ErrorType.Client, ex3.getErrorType());
    }

    @Test
    public void requestIdTest() {
        ClientException ex = new ClientException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Client, ex.getErrorType());
        Assert.assertNull("current requestid is null", ex.getRequestId());
        ex.setRequestId("requestId");
        Assert.assertEquals("requestId", ex.getRequestId());
        ClientException ex2 = new ClientException("errCode", "errMsg", "requestId");
        Assert.assertEquals(ErrorType.Client, ex2.getErrorType());
        Assert.assertEquals("requestId", ex2.getRequestId());
        Assert.assertEquals("errCode : errMsg\r\nRequestId : requestId", ex2.getMessage());
    }

    @Test
    public void errCodeTest() {
        ClientException ex = new ClientException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Client, ex.getErrorType());
        Assert.assertEquals("errCode", ex.getErrCode());
        ex.setErrCode("newErrcode");
        Assert.assertEquals("newErrcode", ex.getErrCode());
    }

    @Test
    public void errMsgTest() {
        ClientException ex = new ClientException("errCode", "errMsg");
        Assert.assertEquals(ErrorType.Client, ex.getErrorType());
        Assert.assertEquals("errMsg", ex.getErrMsg());
        ex.setErrMsg("newErrMsg");
        Assert.assertEquals("newErrMsg", ex.getErrMsg());

        ex = new ClientException("errCode", "errMsg", "requestId", "errDescription");
        Assert.assertEquals("com.aliyuncs.exceptions.ClientException: errCode : errMsg\r\n" +
                "RequestId : requestId\r\nDescription : errDescription", ex.toString());
    }
}