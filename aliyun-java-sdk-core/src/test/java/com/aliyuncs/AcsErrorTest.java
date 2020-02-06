package com.aliyuncs;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.transform.UnmarshallerContext;

public class AcsErrorTest {

    @Test
    public void toStringTest() {
        AcsError acsError = new AcsError();
        Assert.assertEquals("AcsError{statusCode=0, errorCode='null', errorMessage='null', " +
                        "requestId='null', errorDescription='null'}",
                acsError.toString());
    }

    @Test
    public void getInstanceAndGetSetTest() {
        AcsError acsError = new AcsError();
        UnmarshallerContext context = new UnmarshallerContext();
        Map<String, String> map = new HashMap<String, String>();
        map.put("Error.RequestId", "Error.RequestId");
        map.put("Error.Code", "Error.Code");
        map.put("Error.Message", "Error.Message");
        map.put("Error.description", "Error.description");
        context.setHttpStatus(200);
        context.setResponseMap(map);
        acsError.getInstance(context);
        Assert.assertEquals("Error.RequestId", acsError.getRequestId());
        Assert.assertEquals("Error.Code", acsError.getErrorCode());
        Assert.assertEquals("Error.Message", acsError.getErrorMessage());
        Assert.assertEquals("Error.description", acsError.getErrorDescription());
        Assert.assertEquals(200, acsError.getStatusCode());
    }

    @Test
    public void acsErrorUnmarshallerTest() {
        AcsError acsError = new AcsError();
        UnmarshallerContext context = new UnmarshallerContext();
        Map<String, String> map = new HashMap<String, String>();
        map.put("Error.requestId", "Error.requestId");
        map.put("Error.code", "Error.code");
        map.put("Error.message", "Error.message");
        map.put("Error.Description", "Error.Description");
        context.setHttpStatus(200);
        context.setResponseMap(map);
        AcsErrorUnmarshaller.unmarshall(acsError, context);
        Assert.assertEquals("Error.requestId", acsError.getRequestId());
        Assert.assertEquals("Error.code", acsError.getErrorCode());
        Assert.assertEquals("Error.message", acsError.getErrorMessage());
        Assert.assertEquals("Error.Description", acsError.getErrorDescription());
        Assert.assertEquals(200, acsError.getStatusCode());

        AcsErrorUnmarshaller unmarshaller = new AcsErrorUnmarshaller();
        Assert.assertTrue(unmarshaller instanceof AcsErrorUnmarshaller);
    }
}
