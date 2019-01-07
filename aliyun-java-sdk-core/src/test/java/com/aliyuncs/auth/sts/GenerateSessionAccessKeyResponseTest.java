package com.aliyuncs.auth.sts;

import com.aliyuncs.transform.UnmarshallerContext;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GenerateSessionAccessKeyResponseTest {

    @Test
    public void testSessionAccessKey() {

        GenerateSessionAccessKeyResponse.SessionAccessKey sessionAccessKey = new GenerateSessionAccessKeyResponse.SessionAccessKey();
        Assert.assertNull(sessionAccessKey.getSessionAccessKeyId());
        sessionAccessKey.setSessionAccessKeyId("sessionAccessKeyId");
        Assert.assertEquals("sessionAccessKeyId", sessionAccessKey.getSessionAccessKeyId());

        Assert.assertNull(sessionAccessKey.getSessionAccessKeySecert());
        sessionAccessKey.setSessionAccessKeySecert("sessionAccessKeySecert");
        Assert.assertEquals("sessionAccessKeySecert", sessionAccessKey.getSessionAccessKeySecert());

        Assert.assertNull(sessionAccessKey.getExpiration());
        sessionAccessKey.setExpiration("expiration");
        Assert.assertEquals("expiration", sessionAccessKey.getExpiration());
    }


    @Test
    public void testGenerateSessionAccessKeyResponse() {

        GenerateSessionAccessKeyResponse generateSessionAccessKeyResponse = new GenerateSessionAccessKeyResponse();
        Assert.assertNull(generateSessionAccessKeyResponse.getRequestId());
        generateSessionAccessKeyResponse.setRequestId("requestId");
        Assert.assertEquals("requestId", generateSessionAccessKeyResponse.getRequestId());

        Assert.assertNull(generateSessionAccessKeyResponse.getSessionAccessKey());
        GenerateSessionAccessKeyResponse.SessionAccessKey sessionAccessKey = new GenerateSessionAccessKeyResponse.SessionAccessKey();
        generateSessionAccessKeyResponse.setSessionAccessKey(sessionAccessKey);
        Assert.assertTrue(generateSessionAccessKeyResponse.getSessionAccessKey() instanceof GenerateSessionAccessKeyResponse.SessionAccessKey);

        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("key", "3");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(generateSessionAccessKeyResponse.getInstance(unmarshallerContext) instanceof GenerateSessionAccessKeyResponse);
    }

}
