package com.aliyuncs.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlattenMapUtilTest {

    private Map<String, String> flattenMap = new HashMap<String, String>();
    private static Gson gson = new Gson();

    @Before
    public void setUp() throws Exception {
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

    }

    @Test
    public void toListMap() {
        List<Map<Object, Object>> listMap = FlattenMapUtil.toListMap(flattenMap, "TestResponse.Array");

        System.out.println(gson.toJson(listMap));

        Map<Object, Object> map0A = (Map<Object, Object>)listMap.get(0).get("ObjectA");
        Assert.assertEquals("Value0AA", map0A.get("MemberA"));
        Assert.assertEquals("Value0AB", map0A.get("MemberB"));

        Map<Object, Object> map0B = (Map<Object, Object>)listMap.get(0).get("ObjectB");
        Assert.assertEquals("Value0BA", map0B.get("MemberA"));
        Assert.assertEquals("Value0BB", map0B.get("MemberB"));

        Map<Object, Object> map0BA = (Map<Object, Object>)map0B.get("ObjectA");
        Assert.assertEquals("Value0BAA", map0BA.get("MemberA"));
        Assert.assertEquals("Value0BAB", map0BA.get("MemberB"));

        Map<Object, Object> map1A = (Map<Object, Object>)listMap.get(1).get("ObjectA");
        Assert.assertEquals("Value1AA", map1A.get("MemberA"));
        Assert.assertEquals("Value1AB", map1A.get("MemberB"));

        Map<Object, Object> map1B = (Map<Object, Object>)listMap.get(1).get("ObjectB");
        Assert.assertEquals("Value1BA", map1B.get("MemberA"));
        Assert.assertEquals("Value1BB", map1B.get("MemberB"));

        Map<Object, Object> map2A = (Map<Object, Object>)listMap.get(2).get("ObjectA");
        Assert.assertEquals("Value2AA", map2A.get("MemberA"));
        Assert.assertEquals("Value2AB", map2A.get("MemberB"));

        Map<Object, Object> map2B = (Map<Object, Object>)listMap.get(2).get("ObjectB");
        Assert.assertEquals("Value2BA", map2B.get("MemberA"));
        Assert.assertEquals("Value2BB", map2B.get("MemberB"));

    }

    @Test
    public void toMap() {
        Map<Object, Object> map = FlattenMapUtil.toMap(flattenMap, "TestResponse");

        System.out.println(gson.toJson(map));

        Map<Object, Object> testMap = (Map<Object, Object>)map.get("TestResponse");

        List<Map<Object, Object>> listMap = (List<Map<Object, Object>>)testMap.get("Array");

        Map<Object, Object> map0A = (Map<Object, Object>)listMap.get(0).get("ObjectA");
        Assert.assertEquals("Value0AA", map0A.get("MemberA"));
        Assert.assertEquals("Value0AB", map0A.get("MemberB"));

        Map<Object, Object> map0B = (Map<Object, Object>)listMap.get(0).get("ObjectB");
        Assert.assertEquals("Value0BA", map0B.get("MemberA"));
        Assert.assertEquals("Value0BB", map0B.get("MemberB"));

        Map<Object, Object> map0BA = (Map<Object, Object>)map0B.get("ObjectA");
        Assert.assertEquals("Value0BAA", map0BA.get("MemberA"));
        Assert.assertEquals("Value0BAB", map0BA.get("MemberB"));

        Map<Object, Object> map1A = (Map<Object, Object>)listMap.get(1).get("ObjectA");
        Assert.assertEquals("Value1AA", map1A.get("MemberA"));
        Assert.assertEquals("Value1AB", map1A.get("MemberB"));

        Map<Object, Object> map1B = (Map<Object, Object>)listMap.get(1).get("ObjectB");
        Assert.assertEquals("Value1BA", map1B.get("MemberA"));
        Assert.assertEquals("Value1BB", map1B.get("MemberB"));

        Map<Object, Object> map2A = (Map<Object, Object>)listMap.get(2).get("ObjectA");
        Assert.assertEquals("Value2AA", map2A.get("MemberA"));
        Assert.assertEquals("Value2AB", map2A.get("MemberB"));

        Map<Object, Object> map2B = (Map<Object, Object>)listMap.get(2).get("ObjectB");
        Assert.assertEquals("Value2BA", map2B.get("MemberA"));
        Assert.assertEquals("Value2BB", map2B.get("MemberB"));

    }
}