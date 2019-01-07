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
package com.aliyuncs.utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class ParameterHelperTest {

    @Test
    public void parseISO8601DateTest() throws ParseException {
        Assert.assertNull(ParameterHelper.parseISO8601(null));
        String iso8601Date = "2014-12-22T10:33:40Z";
        Date date = ParameterHelper.parseISO8601(iso8601Date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Assert.assertEquals(2014, calendar.get(Calendar.YEAR));
        Assert.assertEquals(11, calendar.get(Calendar.MONTH));
        Assert.assertEquals(22, calendar.get(Calendar.DATE));
        Assert.assertEquals(6, calendar.get(Calendar.HOUR));
        Assert.assertEquals(33, calendar.get(Calendar.MINUTE));
        Assert.assertEquals(40, calendar.get(Calendar.SECOND));

        Assert.assertTrue(iso8601Date.equals(ParameterHelper.getISO8601Time(date)));
    }

    @Test
    public void parseRFC2616DateTest() throws ParseException {
        Assert.assertNull(ParameterHelper.parseRFC2616(null));
        String rfc2616Date = "Wed, 16 Jan 2013 19:01:18 GMT";
        Date date = ParameterHelper.parseRFC2616(rfc2616Date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Assert.assertEquals(2013, calendar.get(Calendar.YEAR));
        Assert.assertEquals(0, calendar.get(Calendar.MONTH));
        Assert.assertEquals(17, calendar.get(Calendar.DATE));
        Assert.assertEquals(3, calendar.get(Calendar.HOUR));
        Assert.assertEquals(01, calendar.get(Calendar.MINUTE));
        Assert.assertEquals(18, calendar.get(Calendar.SECOND));
        Assert.assertTrue(rfc2616Date.equals(ParameterHelper.getRFC2616Date(date)));
    }

    @Test
    public void getUniqueNonceTest() {
        Assert.assertNotNull(ParameterHelper.getUniqueNonce());
        Assert.assertFalse(ParameterHelper.getUniqueNonce().equals(ParameterHelper.getUniqueNonce()));
    }
}
