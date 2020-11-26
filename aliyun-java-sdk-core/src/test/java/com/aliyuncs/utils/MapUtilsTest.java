package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapUtilsTest {

    @Test
    public void convertMapToListMapTest() {
        Map<String, String> testMap = new HashMap<String, String>();
        testMap.put("DescribeAntChainNodesResponse.Result.Length", "2");
        testMap.put("DescribeAntChainNodesResponse.Result[0].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[0].nodeType", "test");

        testMap.put("DescribeAntChainNodesResponse.Result[1].nodeId", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].publicKey", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].endpoints.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.Result[1].endpoints[0].ip", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].endpoints[0].port", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].nodeState", "test");
        testMap.put("DescribeAntChainNodesResponse.Result[1].nodeType", "test");

        testMap.put("DescribeAntChainNodesResponse.List[0].key", "ListKey");
        testMap.put("DescribeAntChainNodesResponse.List[0].map.key.List[0]", "ListMapKeyList00");
        testMap.put("DescribeAntChainNodesResponse.List[0].map.key.List[1]", "ListMapKeyList01");
        testMap.put("DescribeAntChainNodesResponse.List[1].map.key.List[0]", "ListMapKeyList10");
        testMap.put("DescribeAntChainNodesResponse.List[1].map.key.List[1]", "ListMapKeyList11");
        testMap.put("DescribeAntChainNodesResponse.ListMulti.Length", "1");
        testMap.put("DescribeAntChainNodesResponse.ListMulti[0]", "1");
        testMap.put("DescribeAntChainNodesResponse.ListMulti[1].a.list[0]", "1");
        testMap.put("DescribeAntChainNodesResponse.ListMulti[1].a.list.Length", "1");

        MapUtils mapUtils = new MapUtils();
        List<Map<Object, Object>> list = mapUtils.convertMapToListMap(testMap, "DescribeAntChainNodesResponse.Result");
        Assert.assertEquals("test", list.get(0).get("nodeState"));
        Assert.assertTrue(list.get(0).get("endpoints") instanceof List);

        list = mapUtils.convertMapToListMap(testMap, "DescribeAntChainNodesResponse.ListMulti");
        Assert.assertEquals("1", list.get(0));
        Map<Object, Object> listMultiAMap = (Map<Object, Object>) list.get(1).get("a");
        Assert.assertEquals(1, ((List) listMultiAMap.get("list")).size());

        list = mapUtils.convertMapToListMap(testMap, "DescribeAntChainNodesResponse.List");
        Assert.assertEquals(list.get(0).get("key"), "ListKey");

        // DescribeAntChainNodesResponse.List[0].map is Map
        Assert.assertTrue(list.get(0).get("map") instanceof Map);

        // DescribeAntChainNodesResponse.List[0].map.key is Map
        Map m = (Map) list.get(0).get("map");
        Assert.assertTrue(m.get("key") instanceof Map);

        // DescribeAntChainNodesResponse.List[0].map.key.List is List
        Map mm = (Map) m.get("key");
        Assert.assertTrue(mm.get("List") instanceof List);

        List<String> l = (List) mm.get("List");
        // DescribeAntChainNodesResponse.List[0].map.key.List[0] value is ListMapKeyList00
        Assert.assertEquals(l.get(0), "ListMapKeyList00");
        // DescribeAntChainNodesResponse.List[0].map.key.List[1] value is ListMapKeyList01
        Assert.assertEquals(l.get(1), "ListMapKeyList01");

        // DescribeAntChainNodesResponse.List[1].map.key is Map
        m = (Map) list.get(1).get("map");
        Assert.assertTrue(m.get("key") instanceof Map);

        // DescribeAntChainNodesResponse.List[1].map.key.List is List
        mm = (Map) m.get("key");
        Assert.assertTrue(mm.get("List") instanceof List);

        l = (List) mm.get("List");
        // DescribeAntChainNodesResponse.List[1].map.key.List[0] value is ListMapKeyList10
        Assert.assertEquals(l.get(0), "ListMapKeyList10");
        // DescribeAntChainNodesResponse.List[1].map.key.List[0] value is ListMapKeyList10
        Assert.assertEquals(l.get(1), "ListMapKeyList11");
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
        testMap.put("DescribeAntChainNodesResponse.Data.arrayTest[0]", "0");
        testMap.put("DescribeAntChainNodesResponse.Data.arrayTest[1]", "1.0");
        testMap.put("DescribeAntChainNodesResponse.Data.arrayTest[2]", "test");
        testMap.put("DescribeAntChainNodesResponse.Data.arrayTest[3]", "test.test");
        MapUtils mapUtils = new MapUtils();
        Map<Object, Object> map = mapUtils.convertMapToMap(testMap, "DescribeAntChainNodesResponse.Data");
        List resultList = (List) map.get("Result");
        List arrayTestList = (List) map.get("arrayTest");
        Assert.assertEquals("test", map.get("nodeState"));
        Assert.assertEquals("test", ((Map) resultList.get(0)).get("publicKey"));
        Assert.assertEquals("0", arrayTestList.get(0));
        Assert.assertEquals("1.0", arrayTestList.get(1));
        Assert.assertEquals("test", arrayTestList.get(2));
        Assert.assertEquals("test.test", arrayTestList.get(3));
    }
}
