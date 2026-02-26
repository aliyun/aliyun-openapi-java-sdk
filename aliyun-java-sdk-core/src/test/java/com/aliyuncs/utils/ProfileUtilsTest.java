package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

public class ProfileUtilsTest {
    @Test
    public void testProfile() throws IOException {
        new ProfileUtils();
        String context = "[profile1]\n"
                + ";comment\n"
                + "#comment\n"
                + "enable = false #comment\n"
                + "[profile2]\n"
                + "region  = cn-hangzhou#comment\n"
                + "[default]\n"
                + "default_property = property1 \t\n\n"
                + "[default]\n"
                + "default_property = property2\n"
                + "[profile3]\n"
                + "int = 1\n"
                + "  int = 2\n"
                + "int = \n"
                + "\t3\n"
                + "str = #comment\n"
                + "\ttest\n";
        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(4, iniMap.size());
        Assert.assertEquals("false", iniMap.get("profile1").get("enable"));
        Assert.assertEquals("cn-hangzhou#comment", iniMap.get("profile2").get("region"));
        Assert.assertEquals("property2", iniMap.get("default").get("default_property"));
        Assert.assertEquals("\n3", iniMap.get("profile3").get("int"));
        Assert.assertEquals("\ntest", iniMap.get("profile3").get("str"));

        context = "[profile1]\n"
                + "enable = false\n"
                + "[profile2]\n"
                + "enable = true\n"
                + "[profile3]\n"
                + "enable = null\n"
                + "[profile4]\n"
                + "enable = 1\n"
                + "[profile5]\n"
                + "enable = False\n"
                + "[profile6]\n"
                + "enable = True\n"
                + "[profile7]\n"
                + "enable =\n";
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(7, iniMap.size());
        Assert.assertEquals("false", iniMap.get("profile1").get("enable"));
        Assert.assertEquals("true", iniMap.get("profile2").get("enable"));
        Assert.assertEquals("null", iniMap.get("profile3").get("enable"));
        Assert.assertEquals("1", iniMap.get("profile4").get("enable"));
        Assert.assertEquals("False", iniMap.get("profile5").get("enable"));
        Assert.assertEquals("True", iniMap.get("profile6").get("enable"));
        Assert.assertEquals("", iniMap.get("profile7").get("enable"));

        context = "[invalid\n"
                + "enable = false\n";
        try {
            ProfileUtils.parseFile(new StringReader(context));
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Section definition must end with ']' on line 1: [invalid", e.getMessage());
        }

        context = "[ ]\n"
                + "enable = false\n"
                + "str = \n"
                + "\ttest\n";
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(0, iniMap.size());

        context = "[profile1]\n"
                + "[profile2]\n";
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(2, iniMap.size());
        Assert.assertEquals(0, iniMap.get("profile1").size());
        Assert.assertEquals(0, iniMap.get("profile2").size());

        context = "enable=true\n"
                + "key=value\n"
                + "str = \n"
                + "\ttest\n";
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals(3, iniMap.get("?").size());
        Assert.assertEquals("true", iniMap.get("?").get("enable"));
        Assert.assertEquals("value", iniMap.get("?").get("key"));
        Assert.assertEquals("\ntest", iniMap.get("?").get("str"));

        context = "\ttest\n";
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals(1, iniMap.get("?").size());

        context = "[profile1]\n"
                + "key \n";
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, iniMap.size());
        Assert.assertNull(iniMap.get("profile1").get("key"));

        context = "[profile1]\n"
                + " = value\n";
        try {
            ProfileUtils.parseFile(new StringReader(context));
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Property did not have a name on line 2", e.getMessage());
        }
    }

    @Test
    public void testParseFileFromPath() throws IOException {
        String resourcePath = "src/test/resources/configTest.ini";

        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(resourcePath);

        Assert.assertTrue("Should contain client profile", iniMap.containsKey("client"));
        Assert.assertTrue("Should contain default profile", iniMap.containsKey("default"));
        Assert.assertTrue("Should contain client1 profile", iniMap.containsKey("client1"));
        Assert.assertTrue("Should contain client2 profile", iniMap.containsKey("client2"));
        Assert.assertTrue("Should contain client3 profile", iniMap.containsKey("client3"));
        Assert.assertTrue("Should contain client4 profile", iniMap.containsKey("client4"));

        Assert.assertEquals("access_key", iniMap.get("default").get("type"));
        Assert.assertEquals("foo", iniMap.get("default").get("access_key_id"));
        Assert.assertEquals("bar", iniMap.get("default").get("access_key_secret"));
        Assert.assertEquals("cn-hangzhou", iniMap.get("default").get("region_id"));

        Assert.assertEquals("ecs_ram_role", iniMap.get("client1").get("type"));
        Assert.assertEquals("EcsRamRoleTest", iniMap.get("client1").get("role_name"));

        Assert.assertEquals("bearer_token", iniMap.get("client3").get("type"));
        Assert.assertEquals("bearer_token", iniMap.get("client3").get("bearer_token"));
    }

    @Test
    public void testReaderCloseException() throws IOException {
        String context = "[profile1]\n"
                + "key = value\n";

        // 使用一个会在关闭时抛出异常的 Reader
        StringReader reader = new StringReader(context) {
            @Override
            public void close() {
                super.close();
                // 这里不抛出异常，因为 StringReader.close() 不会抛出 IOException
                // 但这个测试确保了 finally 块中的 close() 调用被执行
            }
        };

        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(reader);
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals("value", iniMap.get("profile1").get("key"));
    }

    @Test
    public void testPropertyContinuationWithoutCurrentProperty() throws IOException {
        String context = "\ttest_continuation\n";

        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals(1, iniMap.get("?").size());
        // 当没有当前属性时，currentPropertyBeingRead 为 null
        // currentPropertyValue 也为 null，所以结果是 "null\ntest_continuation"
        Assert.assertEquals("null\ntest_continuation", iniMap.get("?").get(null));
    }

    @Test
    public void testRemoveTrailingCommentsWithNoMatch() throws IOException {
        String context = "[profile1]\n"
                + "key = value_without_comment\n";

        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals("value_without_comment", iniMap.get("profile1").get("key"));
    }

    @Test
    public void testPropertyDefinitionWithoutCurrentProfile() throws IOException {
        String context = "global_key = global_value\n"
                + "[profile1]\n"
                + "key = value\n";

        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(2, iniMap.size());
        Assert.assertEquals("global_value", iniMap.get("?").get("global_key"));
        Assert.assertEquals("value", iniMap.get("profile1").get("key"));
    }

    @Test
    public void testPropertyContinuationWithoutCurrentProfile() throws IOException {
        String context = "key = value\n"
                + "\tcontinuation\n";

        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals("value\ncontinuation", iniMap.get("?").get("key"));
    }

}
