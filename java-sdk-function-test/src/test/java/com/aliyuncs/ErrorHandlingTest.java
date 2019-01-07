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

package com.aliyuncs;

import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Test;

public class ErrorHandlingTest extends BaseTest {

    @Test
    public void parameterErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setVersion("2014-05-26");
        request.setAction("actionError");
        CommonResponse response = null;
        try {
            response = this.client.getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("InvalidParameter", e.getErrCode());
            Assert.assertEquals("The specified parameter \"Action or Version\" is not valid.",
                    e.getErrMsg()
            );
        }
    }

    @Test
    public void timeOutErrorTest() {
        CommonRequest request = new CommonRequest();
        request.setDomain("ecs-cn-hangzhou.aliyuncs.com");
        request.setVersion("2014-05-26");
        request.setAction("DescribeAccessPoints");
        request.setReadTimeout(1);
        CommonResponse response = null;
        try {
            response = this.client.getCommonResponse(request);
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.ServerUnreachable", e.getErrCode());
            Assert.assertEquals("SocketTimeoutException has occurred on a socket read or accept.",
                    e.getErrMsg()
            );
        }
    }
}
