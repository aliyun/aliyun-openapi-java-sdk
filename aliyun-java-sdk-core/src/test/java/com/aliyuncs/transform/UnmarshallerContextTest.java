/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.transform;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnmarshallerContextTest {

    @Test
    public void integerValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("IntegerValueKey", String.valueOf(Integer.MAX_VALUE));
        responseMap.put("IntegerValueKeyEmpty", "");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(Integer.MAX_VALUE == unmarshallerContext.integerValue("IntegerValueKey"));
        Assert.assertNull(unmarshallerContext.integerValue("NullIntegerValueKey"));
        Assert.assertNull(unmarshallerContext.integerValue("IntegerValueKeyEmpty"));
    }

    @Test
    public void stringValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("StringValueKey", "this is a string test");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue("this is a string test".equals(unmarshallerContext.stringValue("StringValueKey")));
        Assert.assertNull(unmarshallerContext.stringValue("NullStringValueKey"));
    }

    @Test
    public void longValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("LongValueKey", String.valueOf(Long.MAX_VALUE));
        responseMap.put("LongValueKeyEmpty", "");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(Long.MAX_VALUE == unmarshallerContext.longValue("LongValueKey"));
        Assert.assertNull(unmarshallerContext.longValue("NullLongValueKey"));
        Assert.assertNull(unmarshallerContext.longValue("LongValueKeyEmpty"));
    }

    @Test
    public void booleanValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("BooleanValueKey", String.valueOf(Boolean.TRUE));
        responseMap.put("BooleanValueKeyEmpty", "");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(Boolean.TRUE == unmarshallerContext.booleanValue("BooleanValueKey"));
        Assert.assertNull(unmarshallerContext.booleanValue("NullBooleanValueKey"));
        Assert.assertNull(unmarshallerContext.booleanValue("BooleanValueKeyEmpty"));
    }

    @Test
    public void lengthValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("LengthValueKey", "100");
        responseMap.put("LengthValueKeyEmpty", "");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(100 == unmarshallerContext.lengthValue("LengthValueKey"));
        Assert.assertTrue(0 == unmarshallerContext.lengthValue("NullLengthValueKey"));
        Assert.assertTrue(0 == unmarshallerContext.lengthValue("LengthValueKeyEmpty"));
    }

    @Test
    public void doubleValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("doubleValueKey", "100.5");
        responseMap.put("doubleValueKeyEmpty", "");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(100.5 == unmarshallerContext.doubleValue("doubleValueKey"));
        Assert.assertNull(unmarshallerContext.doubleValue("NullLengthValueKey"));
        Assert.assertNull(unmarshallerContext.doubleValue("doubleValueKeyEmpty"));
    }

    @Test
    public void floatValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("floatValueKey", "100.5");
        responseMap.put("floatValueKeyEmpty", "");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(100.5 == unmarshallerContext.floatValue("floatValueKey"));
        Assert.assertNull(unmarshallerContext.floatValue("NullLengthValueKey"));
        Assert.assertNull(unmarshallerContext.floatValue("floatValueKeyEmpty"));
    }

    @Test
    public void responseMapTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("floatValueKey", "100.5");
        unmarshallerContext.setResponseMap(responseMap);
        Map<String, String> map = unmarshallerContext.getResponseMap();
        Assert.assertTrue("100.5".equals(map.get("floatValueKey")));
    }

    @Test
    public void httpStatusTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        unmarshallerContext.setHttpStatus(200);
        Assert.assertEquals(200, unmarshallerContext.getHttpStatus());
    }

    @Test
    public void httpResponseTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        unmarshallerContext.setHttpResponse(null);
        Assert.assertEquals(null, unmarshallerContext.getHttpResponse());
    }

    @Test
    public void listMapValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("TestResponse.Array[0].ObjectA.MemberA", "Value0AA");
        responseMap.put("TestResponse.Array.Length", "1");
        unmarshallerContext.setResponseMap(responseMap);
        List<Map<Object, Object>> list = unmarshallerContext.listMapValue("TestResponse.Array");
        Assert.assertEquals(1, list.size());
        Map<Object, Object> item = list.get(0);
        Map<?, ?> objectA = (Map<?, ?>) item.get("ObjectA");
        Assert.assertEquals("Value0AA", objectA.get("MemberA"));
    }

    @Test
    public void mapValueTest() {
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("TestResponse.ObjectA", "Value0AA");
        unmarshallerContext.setResponseMap(responseMap);
        Map<Object, Object> map = unmarshallerContext.mapValue("TestResponse");
        Assert.assertEquals("Value0AA", map.get("ObjectA"));
    }

}
