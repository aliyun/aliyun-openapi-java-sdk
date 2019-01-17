package com.aliyuncs.reader;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.StringCharacterIterator;
import java.util.Map;

public class JsonReaderTest {
    String json
            = "{\"Instances\":{\"Instance\":[{\"CreationTime\":\"2015-01-14T03:31:26Z\",\"Description\":\"test escape "
            + "\\\"Timeout\\\"\",\"EipAddress\":{\"AllocationId\":\"\",\"IpAddress\":\"127.0.0.1\","
            + "\"InternetChargeType\":\"\"},\"HostName\":\"iZ25dbbj9izZ\","
            + "\"ImageId\":\"centos7u0_64_20G_aliaegis_20141117.vhd\",\"InnerIpAddress\":{\"IpAddress\":[\"127.0.0.101\","
            + "\"127.0.0.102\"]},\"InstanceId\":\"i-25dbbj9iz\",\"InstanceName\":\"iZ25dbbj9izZ-vnc-260755\","
            + "\"InstanceNetworkType\":\"classic\",\"InstanceType\":\"ecs.t1.xsmall\","
            + "\"InternetChargeType\":\"PayByBandwidth\",\"InternetMaxBandwidthIn\":200,\"InternetMaxBandwidthOut\":200,"
            + "\"OperationLocks\":{\"LockReason\":[]},\"PublicIpAddress\":{\"IpAddress\":[]},\"RegionId\":\"cn-beijing\","
            + "\"SecurityGroupIds\":{\"SecurityGroupId\":[\"sg-259bpu24m\"]},\"Status\":\"Running\",\"VlanId\":\"\","
            + "\"VpcAttributes\":{\"NatIpAddress\":\"\",\"PrivateIpAddress\":{\"IpAddress\":[]},\"VSwitchId\":\"\","
            + "\"VpcId\":\"\"},\"ZoneId\":\"cn-beijing-a\",\"ClusterId\":\"\"},{\"CreationTime\":\"2015-01-05T03:43:02Z\","
            + "\"Description\":\"\",\"EipAddress\":{\"AllocationId\":\"\",\"IpAddress\":\"\",\"InternetChargeType\":\"\"},"
            + "\"HostName\":\"iZ25fk8a1ngZ\",\"ImageId\":\"centos7u0_64_20G_aliaegis_20141117.vhd\","
            + "\"InnerIpAddress\":{\"IpAddress\":[]},\"InstanceId\":\"i-25fk8a1ng\","
            + "\"InstanceName\":\"ESS-sg-vpc??????2-ecs-i-25fk8a1ng\",\"InstanceNetworkType\":\"vpc\","
            + "\"InstanceType\":\"ecs.t1.xsmall\",\"InternetChargeType\":\"\",\"InternetMaxBandwidthIn\":0,"
            + "\"InternetMaxBandwidthOut\":0,\"OperationLocks\":{\"LockReason\":[]},"
            + "\"PublicIpAddress\":{\"IpAddress\":[]},\"RegionId\":\"cn-beijing\","
            + "\"SecurityGroupIds\":{\"SecurityGroupId\":[\"sg-25k9r0l1s\"]},\"Status\":\"Running\",\"VlanId\":\"\","
            + "\"VpcAttributes\":{\"NatIpAddress\":\"10.175.65.9\",\"PrivateIpAddress\":{\"IpAddress\":[\"172.16.0.7\"]},"
            + "\"VSwitchId\":\"vsw-25y0u4t0d\",\"VpcId\":\"vpc-25nhkqvej\"},\"ZoneId\":\"cn-beijing-a\","
            + "\"ClusterId\":\"\"}]},\"PageNumber\":1,\"PageSize\":10,\"TotalCount\":2,"
            + "\"RequestId\":\"A11D2D03-8DE3-43E6-B362-625DEBF3F88F\"}";
    Map<String, String> map = null;

    @Test
    public void readTest() {
        String json = "{{\"test\":\"test\"}";
        Map<String, String> map;
        JsonReader reader = new JsonReader();
        map = reader.read(new StringCharacterIterator(json), "test", 1);
        Assert.assertEquals("test", map.get("test.test"));

        map.clear();
        reader = new JsonReader();
        map = reader.read(new StringCharacterIterator(json), "test", 2);
        Assert.assertEquals("test", map.get("test.test"));

        map.clear();
        reader = new JsonReader();
        map = reader.read(new StringCharacterIterator(json), "test", 10);
        Assert.assertEquals("{}", map.toString());
    }

    @Test
    public void readJsonTest() throws NoSuchMethodException, NoSuchFieldException,
            IllegalAccessException, InvocationTargetException {
        JsonReader reader = new JsonReader();
        Class clazz = reader.getClass();
        Method readJson = clazz.getDeclaredMethod("readJson", String.class);
        Field c = clazz.getDeclaredField("c");
        Field ct = clazz.getDeclaredField("ct");
        readJson.setAccessible(true);
        c.setAccessible(true);
        ct.setAccessible(true);
        ct.set(reader, new StringCharacterIterator("tttte"));
        c.set(reader, 't');
        Object object = readJson.invoke(reader, "");
        Object charValue = c.get(reader);
        Assert.assertEquals("true", String.valueOf(object));
        Assert.assertEquals('e', charValue);

        c.set(reader, 'n');
        ct.set(reader, new StringCharacterIterator("ttttn"));
        object = readJson.invoke(reader, "");
        charValue = c.get(reader);
        Assert.assertNull(object);
        Assert.assertEquals('n', charValue);

        c.set(reader, 'f');
        ct.set(reader, new StringCharacterIterator("ttttff"));
        object = readJson.invoke(reader, "");
        charValue = c.get(reader);
        Assert.assertEquals("false", String.valueOf(object));
        Assert.assertEquals('f', charValue);

        c.set(reader, '+');
        ct.set(reader, new StringCharacterIterator("-tttf"));
        object = readJson.invoke(reader, "");
        charValue = c.get(reader);
        Assert.assertEquals("-", String.valueOf(object));
        Assert.assertEquals('t', charValue);
    }

    @Test
    public void trimFromLastTest() {
        String str = JsonReader.trimFromLast("abc", "c");
        Assert.assertEquals("ab", str);

        str = JsonReader.trimFromLast("abc", "h");
        Assert.assertEquals("abc", str);
    }

    @Test
    public void readForHideArrayItemTest() {
        String json = "{\"RequestId\":\"A11D2D03-8DE3-43E6-B362-625DEBF3F88F\",\"tArray\":" +
                "{\"tTest\":[\"tTest\":\"tTest\",\"gTest\":[[\"g\":\"g\"]]]}}";
        JsonReader reader = new JsonReader();
        Map<String, String> map;
        map = reader.readForHideArrayItem(json, "test");
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][0]"));
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][1]"));
        Assert.assertEquals("3", map.get("test.tArray.tTest[0].Length"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[0]"));
        Assert.assertEquals("5", map.get("test.tArray.tTest.Length"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[1]"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[2]"));
        Assert.assertEquals("gTest", map.get("test.tArray.tTest[3]"));
        Assert.assertEquals("gTest", map.get("test.tArray.tTest[4]"));
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][2]"));
        Assert.assertEquals("A11D2D03-8DE3-43E6-B362-625DEBF3F88F", map.get("test.RequestId"));
    }

    @Test
    public void readForHideItemTest() {
        String json = "{{\"RequestId\":\"A11D2D03-8DE3-43E6-B362-625DEBF3F88F\",\"tArray\":" +
                "{\"tTest\":[\"tTest\":\"tTest\",\"gTest\":[[\"g\":\"g\"]]]}}";
        JsonReader reader = new JsonReader();
        Map<String, String> map;
        map = reader.readForHideItem(new StringCharacterIterator(json), "test", 1);
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][0]"));
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][1]"));
        Assert.assertEquals("3", map.get("test.tArray.tTest[0].Length"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[0]"));
        Assert.assertEquals("5", map.get("test.tArray.tTest.Length"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[1]"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[2]"));
        Assert.assertEquals("gTest", map.get("test.tArray.tTest[3]"));
        Assert.assertEquals("gTest", map.get("test.tArray.tTest[4]"));
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][2]"));
        Assert.assertEquals("A11D2D03-8DE3-43E6-B362-625DEBF3F88F", map.get("test.RequestId"));

        json = "{{{\"RequestId\":\"A11D2D03-8DE3-43E6-B362-625DEBF3F88F\",\"tArray\":" +
                "{\"tTest\":[\"tTest\":\"tTest\",\"gTest\":[[\"g\":\"g\"]]]}}";
        map = reader.readForHideItem(new StringCharacterIterator(json), "test", 2);
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][0]"));
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][1]"));
        Assert.assertEquals("3", map.get("test.tArray.tTest[0].Length"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[0]"));
        Assert.assertEquals("5", map.get("test.tArray.tTest.Length"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[1]"));
        Assert.assertEquals("tTest", map.get("test.tArray.tTest[2]"));
        Assert.assertEquals("gTest", map.get("test.tArray.tTest[3]"));
        Assert.assertEquals("gTest", map.get("test.tArray.tTest[4]"));
        Assert.assertEquals("g", map.get("test.tArray.tTest[0][2]"));
        Assert.assertEquals("A11D2D03-8DE3-43E6-B362-625DEBF3F88F", map.get("test.RequestId"));

        json = "{\"tTest\":\"test\"}";
        reader = new JsonReader();
        map.clear();
        map = reader.readForHideItem(new StringCharacterIterator(json), "test", 3);
        Assert.assertNull(map.get("test"));
    }

    @Test
    public void readJsonForHideItemTest() throws NoSuchMethodException, NoSuchFieldException,
            InvocationTargetException, IllegalAccessException {
        JsonReader reader = new JsonReader();
        Class clazz = reader.getClass();
        Method readJsonForHideItem = clazz.getDeclaredMethod("readJsonForHideItem", String.class);
        Field c = clazz.getDeclaredField("c");
        Field ct = clazz.getDeclaredField("ct");
        readJsonForHideItem.setAccessible(true);
        c.setAccessible(true);
        ct.setAccessible(true);
        ct.set(reader, new StringCharacterIterator("tttte"));
        c.set(reader, 't');
        Object object = readJsonForHideItem.invoke(reader, "");
        Object charValue = c.get(reader);
        Assert.assertEquals("true", String.valueOf(object));
        Assert.assertEquals('e', charValue);

        c.set(reader, 'n');
        ct.set(reader, new StringCharacterIterator("ttttn"));
        object = readJsonForHideItem.invoke(reader, "");
        charValue = c.get(reader);
        Assert.assertNull(object);
        Assert.assertEquals('n', charValue);

        c.set(reader, 'f');
        ct.set(reader, new StringCharacterIterator("ttttff"));
        object = readJsonForHideItem.invoke(reader, "");
        charValue = c.get(reader);
        Assert.assertEquals("false", String.valueOf(object));
        Assert.assertEquals('f', charValue);

        c.set(reader, '+');
        ct.set(reader, new StringCharacterIterator("-tttf"));
        object = readJsonForHideItem.invoke(reader, "");
        charValue = c.get(reader);
        Assert.assertEquals("-", String.valueOf(object));
        Assert.assertEquals('t', charValue);

        c.set(reader, '+');
        ct.set(reader, new StringCharacterIterator("8tttf"));
        object = readJsonForHideItem.invoke(reader, "");
        charValue = c.get(reader);
        Assert.assertEquals("8", String.valueOf(object));
        Assert.assertEquals('t', charValue);
    }


    @Before
    public void init() {
        JsonReader jsonReader = new JsonReader();
        map = jsonReader.read(json, "DescribeInstancesResponse");
    }

    @Test
    public void numberTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.TotalCount").equals("2"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InternetMaxBandwidthIn").equals("200"));
    }

    @Test
    public void structTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].EipAddress.AllocationId").equals(""));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].EipAddress.IpAddress").equals("127.0.0.1"));
    }

    @Test
    public void stringTest() {
        Assert.assertTrue(
                map.get("DescribeInstancesResponse.RequestId").equals("A11D2D03-8DE3-43E6-B362-625DEBF3F88F"));
        Assert.assertTrue(
                map.get("DescribeInstancesResponse.Instances[0].ImageId")
                        .equals("centos7u0_64_20G_aliaegis_20141117.vhd"));
        Assert.assertTrue(
                map.get("DescribeInstancesResponse.Instances[0].Description").equals("test escape \"Timeout\""));
    }

    @Test
    public void listTest() {
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances.Length").equals("2"));

        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress.Length").equals("2"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress[0]").equals("127.0.0.101"));
        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].InnerIpAddress[1]").equals("127.0.0.102"));

        Assert.assertTrue(map.get("DescribeInstancesResponse.Instances[0].OperationLocks.Length") == null);
    }

    @Test
    public void test() {
        Assert.assertEquals("JsonReaderTest", JsonReaderTest.class.getName().substring(
                JsonReaderTest.class.getName().lastIndexOf(".") + 1));

    }

    @Test
    public void skipWhiteSpaceTest() throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, NoSuchFieldException {
        JsonReader reader = new JsonReader();
        Class readerClass = reader.getClass();
        Field c = readerClass.getDeclaredField("c");
        Field ct = readerClass.getDeclaredField("ct");
        ct.setAccessible(true);
        c.setAccessible(true);
        c.set(reader, ' ');
        ct.set(reader, new StringCharacterIterator("test"));
        Method skipWhiteSpace = readerClass.getDeclaredMethod("skipWhiteSpace");
        skipWhiteSpace.setAccessible(true);
        skipWhiteSpace.invoke(reader);
        Assert.assertEquals("e", c.get(reader).toString());
    }

    @Test
    public void processNumberTest() throws NoSuchMethodException, NoSuchFieldException,
            IllegalAccessException, InvocationTargetException {
        JsonReader reader = new JsonReader();
        Class readerClass = reader.getClass();
        Method processNumber = readerClass.getDeclaredMethod("processNumber");
        Field stringBuffer = readerClass.getDeclaredField("stringBuffer");
        Field c = readerClass.getDeclaredField("c");
        Field ct = readerClass.getDeclaredField("ct");
        processNumber.setAccessible(true);
        stringBuffer.setAccessible(true);
        c.setAccessible(true);
        ct.setAccessible(true);
        stringBuffer.set(reader, new StringBuffer());
        c.set(reader, '-');
        ct.set(reader, new StringCharacterIterator("-.E+"));
        Object result = processNumber.invoke(reader);
        Assert.assertEquals("-.E+", result);

        ct.set(reader, new StringCharacterIterator("e-"));
        c.set(reader, 'e');
        result = processNumber.invoke(reader);
        Assert.assertEquals("e-", result);
    }

}
