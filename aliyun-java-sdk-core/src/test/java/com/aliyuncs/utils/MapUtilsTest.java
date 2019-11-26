package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapUtilsTest {
    @Test
    public void setListTest() throws Exception {
        MapUtils mapUtils = new MapUtils();
        Class clazz = MapUtils.class;
        Method setList = clazz.getDeclaredMethod("setList", List.class, int.class, String.class, String.class);
        setList.setAccessible(true);
        List<Map<Object, Object>> list = null;
        list = (List<Map<Object, Object>>) setList.invoke(mapUtils, list, 0, "test", "test");
        Assert.assertEquals("test", list.get(0).get("test"));

        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("test", "test");
        list = new ArrayList<Map<Object, Object>>();
        list.add(map);
        list = (List<Map<Object, Object>>) setList.invoke(mapUtils, list, 0, "test", "test");
        Assert.assertEquals("test", list.get(0).get("test"));
    }

    @Test
    public void setMapTest() throws Exception {
        MapUtils mapUtils = new MapUtils();
        Class clazz = MapUtils.class;
        Method setMap = clazz.getDeclaredMethod("setMap", Map.class, String.class, String.class);
        setMap.setAccessible(true);
        Map<Object, Object> map = null;
        map = (Map<Object, Object>) setMap.invoke(mapUtils, map, "test", "test");
        Assert.assertEquals("test", map.get("test"));

        map.put("test", new HashMap<Object, Object>());
        map = (Map<Object, Object>) setMap.invoke(mapUtils, map, "test.test1", "test");
        Assert.assertEquals("{test1=test}", map.get("test").toString());
    }

    @Test
    public void convertMapToListMapTest() {
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("DescribeAntChainNodesResponse.Result.Length", "4");
        testMap.put("DescribeAntChainNodesResponse.Result[1].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[3].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Result[3].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints[1].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints[1].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[2].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[3].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[3].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Result[2].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[3].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[3].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[2].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[2].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[2].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[2].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[2].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Result[0].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.RequestId", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[3].nodeState", "test");
        MapUtils mapUtils = new MapUtils();
        List<Map<Object, Object>> list = mapUtils.convertMapToListMap(testMap, "DescribeAntChainNodesResponse.Result");
        Assert.assertEquals("test", list.get(0).get("nodeState"));
        Assert.assertTrue(list.get(0).get("endpoints") instanceof List);
    }

    @Test
    public void convertMapToMapTest() {
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("DescribeAntChainNodesResponse.Data.Result.Length", "4");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[1].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[3].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[3].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].endpoints[1].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].endpoints[1].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[2].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[1].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[3].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[1].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[3].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[1].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[1].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[2].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[3].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[3].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[1].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[2].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[2].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[1].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[2].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[2].nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[2].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.RequestId", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[0].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.Result[3].nodeState", "test");

        testMap.put("DescribeAntChainNodesResponse.Data.port", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.nodeType", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.publicKey", "test");

        MapUtils mapUtils = new MapUtils();
        Map<Object, Object> map = mapUtils.convertMapToMap(testMap, "DescribeAntChainNodesResponse.Data");
        Assert.assertEquals("test", map.get("nodeState"));
        Assert.assertTrue(map.get("Result") instanceof List);
    }
}
