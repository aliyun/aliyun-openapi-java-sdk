package com.aliyuncs.auth.sts;

import com.aliyuncs.transform.UnmarshallerContext;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GetSessionAccessKeyResponseUnmarshallerTest {

    @Test
    public void testGetSessionAccessKeyResponseUnmarshaller() {
        GetSessionAccessKeyResponseUnmarshaller getSessionAccessKeyResponseUnmarshaller = new GetSessionAccessKeyResponseUnmarshaller();
        GenerateSessionAccessKeyResponse generateSessionAccessKeyResponse = new GenerateSessionAccessKeyResponse();
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("key", "3");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(GetSessionAccessKeyResponseUnmarshaller.unmarshall(generateSessionAccessKeyResponse, unmarshallerContext) instanceof GenerateSessionAccessKeyResponse);
    }
}
