package com.aliyuncs.unmarshaller;

import com.aliyuncs.ecs.v20140526.model.DescribeRegionsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Test;

public class JsonUnmashallerTest {
    @Test
    public void unmarshalTest() throws ClientException {
        JsonUnmashaller unmashaller = new JsonUnmashaller();
        DescribeRegionsResponse response = unmashaller.unmarshal(DescribeRegionsResponse.class, "{}");
        Assert.assertNull(response.getRegions());

        try {
            unmashaller.unmarshal(DescribeRegionsResponse.class, "invalid json");
        } catch (ClientException ex) {
            Assert.assertEquals(
                    "SDK.UnmarshalFailed : unmarshal response from json content failed, clazz = DescribeRegionsResponse, origin response = invalid json",
                    ex.getMessage());
            return;
        }
        Assert.fail();
    }
}
