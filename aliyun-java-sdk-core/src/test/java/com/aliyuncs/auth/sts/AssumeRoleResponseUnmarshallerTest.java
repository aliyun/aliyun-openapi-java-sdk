package com.aliyuncs.auth.sts;

import com.aliyuncs.transform.UnmarshallerContext;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AssumeRoleResponseUnmarshallerTest {

    @Test
    public void testAssumeRoleResponseUnmarshaller() {
        AssumeRoleResponseUnmarshaller assumeRoleResponseUnmarshaller = new AssumeRoleResponseUnmarshaller();
        AssumeRoleResponse assumeRoleResponse = new AssumeRoleResponse();
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("key", "3");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(AssumeRoleResponseUnmarshaller.unmarshall(assumeRoleResponse, unmarshallerContext) instanceof AssumeRoleResponse);

    }
}
