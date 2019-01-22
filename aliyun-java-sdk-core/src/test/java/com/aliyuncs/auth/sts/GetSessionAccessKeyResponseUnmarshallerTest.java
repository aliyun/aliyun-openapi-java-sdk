package com.aliyuncs.auth.sts;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.transform.UnmarshallerContext;

public class GetSessionAccessKeyResponseUnmarshallerTest {

    @Test
    public void testGetSessionAccessKeyResponseUnmarshaller() {
        GetSessionAccessKeyResponseUnmarshaller getSessionAccessKeyResponseUnmarshaller = new GetSessionAccessKeyResponseUnmarshaller();
        Assert.assertTrue(getSessionAccessKeyResponseUnmarshaller instanceof GetSessionAccessKeyResponseUnmarshaller);
        GenerateSessionAccessKeyResponse generateSessionAccessKeyResponse = new GenerateSessionAccessKeyResponse();
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("key", "3");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(GetSessionAccessKeyResponseUnmarshaller.unmarshall(generateSessionAccessKeyResponse,
                unmarshallerContext) instanceof GenerateSessionAccessKeyResponse);
    }
}
