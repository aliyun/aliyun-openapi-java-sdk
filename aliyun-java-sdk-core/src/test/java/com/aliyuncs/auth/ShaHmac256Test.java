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

import java.security.InvalidKeyException;

import org.junit.Assert;
import org.junit.Test;

public class ShaHmac256Test {

    @Test
    public void signStringTest() {
        ShaHmac256 shaHmac256 = new ShaHmac256();
        try {
            Assert.assertTrue("P0MHB3wlta/4BOKa5xt+Pii9WnDM6S+jgCbQ42p0KEg="
                .equals(shaHmac256.signString("this is a ShaHmac256 test.", "AccessSecret")));
        } catch (InvalidKeyException e) {
            Assert.assertTrue(false);
        } catch (IllegalStateException e) {
            Assert.assertTrue(false);
        }
    }
}
