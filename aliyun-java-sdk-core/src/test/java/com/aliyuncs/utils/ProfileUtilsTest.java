package com.aliyuncs.utils;

import org.ini4j.Wini;
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
        Wini ini = new Wini(new StringReader(context));
        Map<String, Map<String, String>> iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(4, ini.size());
        Assert.assertEquals(4, iniMap.size());
        Assert.assertEquals("false #comment", ini.get("profile1").get("enable"));
        Assert.assertEquals("false", iniMap.get("profile1").get("enable"));
        Assert.assertEquals(ini.get("profile2").get("region"), iniMap.get("profile2").get("region"));
        Assert.assertEquals(ini.get("default").get("default_property"), iniMap.get("default").get("default_property"));
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
        ini = new Wini(new StringReader(context));
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(7, ini.size());
        Assert.assertEquals(7, iniMap.size());
        Assert.assertEquals(false, ini.get("profile1").get("enable", Boolean.class));
        Assert.assertEquals(false, Boolean.parseBoolean(iniMap.get("profile1").get("enable")));
        Assert.assertEquals(true, ini.get("profile2").get("enable", Boolean.class));
        Assert.assertEquals(true, Boolean.parseBoolean(iniMap.get("profile2").get("enable")));
        Assert.assertEquals(false, ini.get("profile3").get("enable", Boolean.class));
        Assert.assertEquals(false, Boolean.parseBoolean(iniMap.get("profile3").get("enable")));
        Assert.assertEquals(false, ini.get("profile4").get("enable", Boolean.class));
        Assert.assertEquals(false, Boolean.parseBoolean(iniMap.get("profile4").get("enable")));
        Assert.assertEquals(false, ini.get("profile5").get("enable", Boolean.class));
        Assert.assertEquals(false, Boolean.parseBoolean(iniMap.get("profile5").get("enable")));
        Assert.assertEquals(true, ini.get("profile6").get("enable", Boolean.class));
        Assert.assertEquals(true, Boolean.parseBoolean(iniMap.get("profile6").get("enable")));
        Assert.assertEquals(false, ini.get("profile7").get("enable", Boolean.class));
        Assert.assertEquals(false, Boolean.parseBoolean(iniMap.get("profile7").get("enable")));

        context = "[invalid\n"
                + "enable = false\n";
        try {
            new Wini(new StringReader(context));
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("parse error"));
        }
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
        ;
        try {
            new Wini(new StringReader(context));
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("parse error"));
        }
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(0, iniMap.size());

        context = "[profile1]\n"
                + "[profile2]\n";
        ini = new Wini(new StringReader(context));
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(2, ini.size());
        Assert.assertEquals(2, iniMap.size());
        Assert.assertEquals(ini.get("profile1").size(), iniMap.get("profile1").size());
        Assert.assertEquals(ini.get("profile2").size(), iniMap.get("profile2").size());

        context = "enable=true\n"
                + "key=value\n"
                + "str = \n"
                + "\ttest\n";
        ini = new Wini(new StringReader(context));
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, ini.size());
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals(4, ini.get("?").size());
        Assert.assertEquals(3, iniMap.get("?").size());
        Assert.assertEquals("true", ini.get("?").get("enable"));
        Assert.assertEquals("true", iniMap.get("?").get("enable"));
        Assert.assertEquals("value", ini.get("?").get("key"));
        Assert.assertEquals("value", iniMap.get("?").get("key"));

        context = "\ttest\n";
        ini = new Wini(new StringReader(context));
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, ini.size());
        Assert.assertEquals(1, iniMap.size());
        Assert.assertEquals(1, ini.get("?").size());
        Assert.assertEquals(1, iniMap.get("?").size());

        context = "[profile1]\n"
                + "key \n";
        ini = new Wini(new StringReader(context));
        iniMap = ProfileUtils.parseFile(new StringReader(context));
        Assert.assertEquals(1, ini.size());
        Assert.assertEquals(1, iniMap.size());
        Assert.assertNull(ini.get("profile1").get("key"));
        Assert.assertNull(iniMap.get("profile1").get("key"));

        context = "[profile1]\n"
                + " = value\n";
        try {
            new Wini(new StringReader(context));
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("parse error"));
        }
        try {
            ProfileUtils.parseFile(new StringReader(context));
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Property did not have a name on line 2", e.getMessage());
        }
    }

}
