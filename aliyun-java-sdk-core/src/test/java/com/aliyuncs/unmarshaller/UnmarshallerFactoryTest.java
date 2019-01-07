package com.aliyuncs.unmarshaller;

import com.aliyuncs.http.FormatType;
import org.junit.Assert;
import org.junit.Test;

public class UnmarshallerFactoryTest {
    @Test
    public void testConstructor() {
        new UnmarshallerFactory();
    }

    @Test
    public void getUnmarshallerTest() {
        Unmarshaller unmarshaller = UnmarshallerFactory.getUnmarshaller(FormatType.XML);
        Assert.assertTrue("is xml unmarshaller", unmarshaller.getClass() == XmlUnmashaller.class);
        Unmarshaller unmarshaller2 = UnmarshallerFactory.getUnmarshaller(FormatType.JSON);
        Assert.assertTrue("is json unmarshaller", unmarshaller2.getClass() == JsonUnmashaller.class);
        try {
            UnmarshallerFactory.getUnmarshaller(FormatType.FORM);
        } catch (Exception e) {
            Assert.assertEquals("Unsupported response format: FORM", e.getMessage());
            return;
        }
        Assert.fail();
    }
}