package com.aliyuncs.unmarshaller;

import com.aliyuncs.ecs.v20140526.model.DescribeRegionsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Test;

public class XmlUnmashallerTest {
    @Test
    public void unmarshalTest() throws ClientException {
        XmlUnmashaller unmashaller = new XmlUnmashaller();
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><DescribeRegionsResponse>"
                + "<RequestId>38EC7366-F5A9-46B1-BDB1-0FDC2E296397</RequestId>" + "<Regions>" + "<Region>"
                + "<RegionId>cn-shanghai-et2-bo1</RegionId>" + "<LocalName>cn-shanghai</LocalName>" + "</Region>"
                + "<Region>" + "<RegionId>cn-qingdao-nebula</RegionId>" + "<LocalName>cn-qingdao-nebula</LocalName>"
                + "</Region>" + "</Regions>" + "</DescribeRegionsResponse>";
        DescribeRegionsResponse response = unmashaller.unmarshal(DescribeRegionsResponse.class, xml);
        Assert.assertNull(response.getRegions());

        try {
            unmashaller.unmarshal(DescribeRegionsResponse.class, "invalid xml");
        } catch (ClientException ex) {
            Assert.assertEquals(
                    "SDK.UnmarshalFailed : unmarshal response from xml content failed, clazz = DescribeRegionsResponse, origin response = invalid xml",
                    ex.getMessage());
            return;
        }
        Assert.fail();
    }
}
