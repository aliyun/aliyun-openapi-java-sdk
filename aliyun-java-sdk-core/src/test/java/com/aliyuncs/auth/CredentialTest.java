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
package com.aliyuncs.auth;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

public class CredentialTest {

    @Test
    public void setExpiredDateTest() {
        Credential credential = new Credential("<accessKeyId>", "<accessSecret>");
        Method method;
        try {
            Assert.assertFalse(credential.isExpired());
            int expiredHours = 1;
            method = Credential.class.getDeclaredMethod("setExpiredDate", int.class);
            method.setAccessible(true);
            method.invoke(credential, expiredHours);
            Assert.assertFalse(credential.isExpired());
        } catch (SecurityException e) {
            Assert.fail();
        } catch (NoSuchMethodException e) {
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.fail();
        } catch (IllegalAccessException e) {
            Assert.fail();
        } catch (InvocationTargetException e) {
            Assert.fail();
        }

    }
}
