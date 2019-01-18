package com.aliyuncs.auth.sts;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.transform.UnmarshallerContext;

public class AssumeRoleResponseUnmarshallerTest {

    @Test
    public void testAssumeRoleResponseUnmarshaller() {
        AssumeRoleResponseUnmarshaller assumeRoleResponseUnmarshaller = new AssumeRoleResponseUnmarshaller();
        Assert.assertTrue(assumeRoleResponseUnmarshaller instanceof AssumeRoleResponseUnmarshaller);
        AssumeRoleResponse assumeRoleResponse = new AssumeRoleResponse();
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("key", "3");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(AssumeRoleResponseUnmarshaller.unmarshall(assumeRoleResponse,
                unmarshallerContext) instanceof AssumeRoleResponse);

    }
}
