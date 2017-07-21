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

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void test() {
        testBase64();
        testMd5();
    }

    private void testBase64() {
        try {
            String encoding = "UTF-8";
            String encode1 = Base64Helper.encode("1234567890", encoding);
            String encode2 = Base64Helper.encode("abcdefghijklmnopqrstuvwxyz", encoding);
            assertEquals("MTIzNDU2Nzg5MA==", encode1);
            assertEquals("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXo=", encode2);
            String decode1 = Base64Helper.decode(encode1, encoding);
            String decode2 = Base64Helper.decode(encode2, encoding);
            assertEquals("1234567890", decode1);
            assertEquals("abcdefghijklmnopqrstuvwxyz", decode2);
        } catch (UnsupportedEncodingException e) {
            fail(e.toString());
            e.printStackTrace();
        }
    }

    private void testMd5() {
        String encoding = "UTF-8";
        String source = "<Product name=\"Yundun\" domain=\"yundun.aliyuncs.com\"/>";
        String md5;
        try {
            md5 = ParameterHelper.md5Sum(source.getBytes(encoding));
            assertEquals("+J93MVb8RzUp4M+yNoFtLg==", md5);
        } catch (UnsupportedEncodingException e) {
            fail(e.toString());
            e.printStackTrace();
        }

    }
}
