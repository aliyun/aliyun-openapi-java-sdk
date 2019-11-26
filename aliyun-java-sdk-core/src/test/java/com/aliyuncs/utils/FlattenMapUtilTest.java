package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FlattenMapUtilTest {

    @Test
    public void testConstructor() {
        new FlattenMapUtil();
    }

    @Test
    public void testPut() {
        Map<String, String> flattenMap = new HashMap<String, String>();
        // case 1 subKeysIndex >= subKeys.length
        String[] subKeys = {};
        Assert.assertEquals(null, FlattenMapUtil.put(flattenMap, null, subKeys, 0));
        // case 2 object is null
        String[] subKeys2 = {"key"};
        HashMap<?, ?> hashMap = (HashMap<?, ?>) FlattenMapUtil.put(flattenMap, null, subKeys2, 0);
        Assert.assertTrue("the hashmap has key", hashMap.containsKey("key"));
        Assert.assertEquals(null, hashMap.get("key"));
        // case 3 object is hashmap
        HashMap<String, String> input = new HashMap<String, String>();
        HashMap<?, ?> hashMap2 = (HashMap<?, ?>) FlattenMapUtil.put(flattenMap, input, subKeys2, 0);
        Assert.assertTrue("the hashmap has key", hashMap2.containsKey("key"));
        Assert.assertEquals(null, hashMap2.get("key"));
        Assert.assertEquals(input, hashMap2);
        // case 4
        String[] subKeys3 = {"key1", "key2"};
        HashMap<String, String> input2 = new HashMap<String, String>();
        HashMap<?, ?> hashMap3 = (HashMap<?, ?>) FlattenMapUtil.put(flattenMap, input2, subKeys3, 0);
        Assert.assertTrue("the hashmap has key1", hashMap3.containsKey("key1"));
        HashMap<?, ?> key2 = (HashMap<?, ?>) hashMap3.get("key1");
        Assert.assertTrue("the hashmap has key2", key2.containsKey("key2"));
        Assert.assertEquals(null, key2.get("key2"));
        Assert.assertEquals(input2, hashMap3);
    }

    @Test
    public void testPutForArrayCase() {
        Map<String, String> flattenMap = new HashMap<String, String>();
        // case: invalid index
        String[] subKeys = {"key[hehe]"};
        Assert.assertEquals(null, FlattenMapUtil.put(flattenMap, null, subKeys, 0));

        // case: no Length
        String[] subKeys2 = {"key[0]"};
        Assert.assertEquals(null, FlattenMapUtil.put(flattenMap, null, subKeys2, 0));
        String[] subKeys3 = {"first", "key[0]"};
        Assert.assertEquals(null, FlattenMapUtil.put(flattenMap, null, subKeys3, 1));

        flattenMap.put("key.Length", "1");
        ArrayList<?> array = (ArrayList<?>) FlattenMapUtil.put(flattenMap, null, subKeys2, 0);
        Assert.assertEquals(1, array.size());
        Assert.assertEquals(null, array.get(0));

        // case: input not null
        ArrayList<Object> input = new ArrayList<Object>(Collections.nCopies(1, null));
        ArrayList<?> array2 = (ArrayList<?>) FlattenMapUtil.put(flattenMap, input, subKeys2, 0);
        Assert.assertEquals(input, array2);
        Assert.assertEquals(1, array2.size());
        Assert.assertEquals(null, array2.get(0));

        // case: multi keys
        String[] subKeys4 = {"key[0]", "value"};
        ArrayList<?> array3 = (ArrayList<?>) FlattenMapUtil.put(flattenMap, null, subKeys4, 0);
        Assert.assertEquals(1, array3.size());
        HashMap<?, ?> item = (HashMap<?, ?>) array3.get(0);
        Assert.assertTrue(item.containsKey("value"));
        Assert.assertEquals(null, item.get("value"));
    }

    @Test
    public void toListMap() {
        Map<String, String> flattenMap = new HashMap<String, String>();
        flattenMap.put("DescribeAntChainNodesResponse.Result.Length", "4");
        flattenMap.put("DescribeAntChainNodesResponse.Result[1].nodeType", "test");
        flattenMap.put("DescribeAntChainNodesResponse.Result[3].nodeType", "test");
        flattenMap.put("DescribeAntChainNodesResponse.Result[0].nodeId", "test");
        flattenMap.put("DescribeAntChainNodesResponse.Result[0].endpoints[0].ip", "test");
        List<Map<Object, Object>> listMap = FlattenMapUtil.toListMap(flattenMap, "DescribeAntChainNodesResponse.Result");
        Assert.assertEquals("test", listMap.get(0).get("nodeId"));
        Assert.assertTrue(listMap.get(0).get("endpoints") instanceof List);
    }

    @Test
    public void testPutForMap() {
        Map<String, String> flattenMap = new HashMap<String, String>();
        // case 1 subKeysIndex >= subKeys.length
        String[] subKeys = {};
        Assert.assertEquals(null, FlattenMapUtil.putForMap(flattenMap, null, subKeys, 0));
        // case 2 object is null
        String[] subKeys2 = {"key"};
        HashMap<?, ?> hashMap = (HashMap<?, ?>) FlattenMapUtil.putForMap(flattenMap, null, subKeys2, 0);
        Assert.assertTrue("the hashmap has key", hashMap.containsKey("key"));
        Assert.assertEquals(null, hashMap.get("key"));
        // case 3 object is hashmap
        HashMap<String, String> input = new HashMap<String, String>();
        HashMap<?, ?> hashMap2 = (HashMap<?, ?>) FlattenMapUtil.putForMap(flattenMap, input, subKeys2, 0);
        Assert.assertTrue("the hashmap has key", hashMap2.containsKey("key"));
        Assert.assertEquals(null, hashMap2.get("key"));
        Assert.assertEquals(input, hashMap2);
        // case 4
        String[] subKeys3 = {"key1", "key2"};
        HashMap<String, String> input2 = new HashMap<String, String>();
        HashMap<?, ?> hashMap3 = (HashMap<?, ?>) FlattenMapUtil.putForMap(flattenMap, input2, subKeys3, 0);
        Assert.assertTrue("the hashmap has key1", hashMap3.containsKey("key1"));
        HashMap<?, ?> key2 = (HashMap<?, ?>) hashMap3.get("key1");
        Assert.assertTrue("the hashmap has key2", key2.containsKey("key2"));
        Assert.assertEquals(null, key2.get("key2"));
        Assert.assertEquals(input2, hashMap3);
    }

    @Test
    public void testPutForMapArrayCase() {
        Map<String, String> flattenMap = new HashMap<String, String>();
        // case: invalid index
        String[] subKeys = {"key[hehe]"};
        Assert.assertEquals(null, FlattenMapUtil.putForMap(flattenMap, null, subKeys, 0));

        // case: no Length
        String[] subKeys2 = {"key[0]"};
        // not null and not hashmap
        Assert.assertEquals(null, FlattenMapUtil.putForMap(flattenMap, "not null and hashmap", subKeys2, 0));
        // object is null but no length
        Assert.assertEquals(null, FlattenMapUtil.putForMap(flattenMap, null, subKeys2, 0));
        String[] subKeys3 = {"first", "key[0]"};
        Assert.assertEquals(null, FlattenMapUtil.putForMap(flattenMap, null, subKeys3, 1));
        Assert.assertEquals(null, FlattenMapUtil.putForMap(flattenMap, new HashMap<String, String>(), subKeys2, 0));

        // with Length
        flattenMap.put("key.Length", "1");
        // object is null
        HashMap<?, ?> hashMap = (HashMap<?, ?>) FlattenMapUtil.putForMap(flattenMap, null, subKeys2, 0);
        Assert.assertTrue(hashMap.containsKey("key"));
        ArrayList<?> array = (ArrayList<?>) hashMap.get("key");
        Assert.assertEquals(1, array.size());
        Assert.assertNull(array.get(0));
        // object is hashmap
        HashMap<?, ?> hashMap2 = (HashMap<?, ?>) FlattenMapUtil.putForMap(flattenMap, new HashMap<String, String>(),
                subKeys2, 0);
        Assert.assertTrue(hashMap2.containsKey("key"));
        ArrayList<?> array2 = (ArrayList<?>) hashMap2.get("key");
        Assert.assertEquals(1, array2.size());
        Assert.assertNull(array2.get(0));
        // object is hashmap and has key
        HashMap<String, Object> object = new HashMap<String, Object>();
        object.put("key", new ArrayList<Object>(Collections.nCopies(1, null)));
        HashMap<?, ?> hashMap3 = (HashMap<?, ?>) FlattenMapUtil.putForMap(flattenMap, object, subKeys2, 0);
        Assert.assertTrue(hashMap3.containsKey("key"));
        ArrayList<?> array3 = (ArrayList<?>) hashMap2.get("key");
        Assert.assertEquals(1, array3.size());
        Assert.assertNull(array3.get(0));
        // object is null
        String[] subKeys4 = {"key[0]", "value"};
        HashMap<?, ?> hashMap4 = (HashMap<?, ?>) FlattenMapUtil.putForMap(flattenMap, null, subKeys4, 0);
        Assert.assertTrue(hashMap4.containsKey("key"));
        ArrayList<?> array4 = (ArrayList<?>) hashMap4.get("key");
        Assert.assertEquals(1, array4.size());
        HashMap<?, ?> item = (HashMap<?, ?>) array4.get(0);
        Assert.assertTrue(item.containsKey("value"));
        Assert.assertNull(item.get("value"));
    }

    @Test
    public void toMap() {
        Map<String, String> flattenMap = new HashMap<String, String>();
        flattenMap.put("TestResponse.Array[0].ObjectA.MemberA", "Value0AA");
        flattenMap.put("TestResponse.Array[0].ObjectA.MemberB", "Value0AB");
        flattenMap.put("TestResponse.Array[0].ObjectB.MemberA", "Value0BA");
        flattenMap.put("TestResponse.Array[0].ObjectB.MemberB", "Value0BB");
        flattenMap.put("TestResponse.Array[0].ObjectB.ObjectA.MemberA", "Value0BAA");
        flattenMap.put("TestResponse.Array[0].ObjectB.ObjectA.MemberB", "Value0BAB");
        flattenMap.put("TestResponse.Array[0].MemberA", "Value0A");

        flattenMap.put("TestResponse.Array[1].ObjectA.MemberA", "Value1AA");
        flattenMap.put("TestResponse.Array[1].ObjectA.MemberB", "Value1AB");
        flattenMap.put("TestResponse.Array[1].ObjectB.MemberA", "Value1BA");
        flattenMap.put("TestResponse.Array[1].ObjectB.MemberB", "Value1BB");
        flattenMap.put("TestResponse.Array[1].MemberA", "Value1A");

        flattenMap.put("TestResponse.Array[2].ObjectA.MemberA", "Value2AA");
        flattenMap.put("TestResponse.Array[2].ObjectA.MemberB", "Value2AB");
        flattenMap.put("TestResponse.Array[2].ObjectB.MemberA", "Value2BA");
        flattenMap.put("TestResponse.Array[2].ObjectB.MemberB", "Value2BB");
        flattenMap.put("TestResponse.Array[2].MemberA", "Value2A");

        flattenMap.put("TestResponse.Array.Length", "3");
        flattenMap.put("Key", "3");
        Map<?, ?> map = FlattenMapUtil.toMap(flattenMap, "TestResponse");
        Assert.assertTrue(null == map.get("TestResponse"));

        List<?> listMap = (List<?>) map.get("Array");
        Map<?, ?> item0 = (Map<?, ?>) listMap.get(0);
        Map<?, ?> map0A = (Map<?, ?>) item0.get("ObjectA");
        Assert.assertEquals("Value0AA", map0A.get("MemberA"));
        Assert.assertEquals("Value0AB", map0A.get("MemberB"));

        Map<?, ?> map0B = (Map<?, ?>) item0.get("ObjectB");
        Assert.assertEquals("Value0BA", map0B.get("MemberA"));
        Assert.assertEquals("Value0BB", map0B.get("MemberB"));

        Map<?, ?> map0BA = (Map<?, ?>) map0B.get("ObjectA");
        Assert.assertEquals("Value0BAA", map0BA.get("MemberA"));
        Assert.assertEquals("Value0BAB", map0BA.get("MemberB"));

        Map<?, ?> item1 = (Map<?, ?>) listMap.get(1);
        Map<?, ?> map1A = (Map<?, ?>) item1.get("ObjectA");
        Assert.assertEquals("Value1AA", map1A.get("MemberA"));
        Assert.assertEquals("Value1AB", map1A.get("MemberB"));

        Map<?, ?> map1B = (Map<?, ?>) item1.get("ObjectB");
        Assert.assertEquals("Value1BA", map1B.get("MemberA"));
        Assert.assertEquals("Value1BB", map1B.get("MemberB"));

        Map<?, ?> item2 = (Map<?, ?>) listMap.get(2);
        Map<?, ?> map2A = (Map<?, ?>) item2.get("ObjectA");
        Assert.assertEquals("Value2AA", map2A.get("MemberA"));
        Assert.assertEquals("Value2AB", map2A.get("MemberB"));

        Map<?, ?> map2B = (Map<?, ?>) item2.get("ObjectB");
        Assert.assertEquals("Value2BA", map2B.get("MemberA"));
        Assert.assertEquals("Value2BB", map2B.get("MemberB"));
    }

    @Test

    public void testStringJoin() {
        Assert.assertEquals("1/2", FlattenMapUtil.stringJoin("/", "1", "2"));
        Assert.assertEquals("1", FlattenMapUtil.stringJoin("/", "1"));
    }

    @Test
    public void testParseArrayName() {
        Assert.assertEquals(null, FlattenMapUtil.parseArrayName(null));
        Assert.assertEquals(null, FlattenMapUtil.parseArrayName("123"));
        Assert.assertEquals("123", FlattenMapUtil.parseArrayName("123["));
    }

    @Test
    public void testParseLength() {
        Map<String, String> flattenMap = new HashMap<String, String>();
        flattenMap.put("key", "value");

        Assert.assertEquals(-1, FlattenMapUtil.parseLength(flattenMap, "key"));
        flattenMap.put("key.Length", "1");
        Assert.assertEquals(1, FlattenMapUtil.parseLength(flattenMap, "key[1]"));
        flattenMap.put("key2.Length", "hehe");
        Assert.assertEquals(-1, FlattenMapUtil.parseLength(flattenMap, "key2[1]"));
    }

    @Test
    public void testParseIndex() {
        Assert.assertEquals(-1, FlattenMapUtil.parseIndex(""));
        Assert.assertEquals(-1, FlattenMapUtil.parseIndex("["));
        Assert.assertEquals(-1, FlattenMapUtil.parseIndex("]["));
        Assert.assertEquals(-1, FlattenMapUtil.parseIndex("]["));
        Assert.assertEquals(-1, FlattenMapUtil.parseIndex("[hehe]"));
        Assert.assertEquals(1, FlattenMapUtil.parseIndex("[1]"));
    }
}
