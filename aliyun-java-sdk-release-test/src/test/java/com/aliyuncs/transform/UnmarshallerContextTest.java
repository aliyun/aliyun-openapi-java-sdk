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

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnmarshallerContextTest {

    UnmarshallerContext unmarshallerContext;

    @Before
    public void init() {
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("IntegerValueKey", String.valueOf(Integer.MAX_VALUE));
        responseMap.put("StringValueKey", "this is a string test");
        responseMap.put("LongValueKey", String.valueOf(Long.MAX_VALUE));
        responseMap.put("BooleanValueKey", String.valueOf(Boolean.TRUE));
        responseMap.put("LengthValueKey", "100");

        unmarshallerContext = new UnmarshallerContext();
        unmarshallerContext.setResponseMap(responseMap);
    }

    @Test
    public void integerValueTest() {
        Assert.assertTrue(Integer.MAX_VALUE == unmarshallerContext.integerValue("IntegerValueKey"));
        Assert.assertNull(unmarshallerContext.integerValue("NullIntegerValueKey"));
    }

    @Test
    public void stringValueTest() {
        Assert.assertTrue("this is a string test".equals(unmarshallerContext.stringValue("StringValueKey")));
    }

    @Test
    public void longValueTest() {
        Assert.assertTrue(Long.MAX_VALUE == unmarshallerContext.longValue("LongValueKey"));
        Assert.assertNull(unmarshallerContext.longValue("NullLongValueKey"));
    }

    @Test
    public void booleanValueTest() {
        Assert.assertTrue(Boolean.TRUE == unmarshallerContext.booleanValue("BooleanValueKey"));
        Assert.assertNull(unmarshallerContext.booleanValue("NullBooleanValueKey"));
    }

    @Test
    public void lengthValueTest() {
        Assert.assertTrue(100 == unmarshallerContext.lengthValue("LengthValueKey"));
        Assert.assertTrue(0 == unmarshallerContext.lengthValue("NullLengthValueKey"));
    }
}
