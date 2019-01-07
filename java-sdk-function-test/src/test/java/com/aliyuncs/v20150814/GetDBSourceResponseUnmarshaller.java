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
package com.aliyuncs.v20150814;

import com.aliyuncs.transform.UnmarshallerContext;

public class GetDBSourceResponseUnmarshaller {

    public static GetDBSourceResponse unmarshall(GetDBSourceResponse getDBSourceResponse, UnmarshallerContext context) {

        getDBSourceResponse.setCode(context.stringValue("GetDBSourceResponse.Code"));
        getDBSourceResponse.setMessage(context.stringValue("GetDBSourceResponse.Message"));
        getDBSourceResponse.setSuccess(context.stringValue("GetDBSourceResponse.Success"));
        getDBSourceResponse.setTraceId(context.stringValue("GetDBSourceResponse.TraceId"));
        getDBSourceResponse.setResult(context.stringValue("GetDBSourceResponse.Result"));

        return getDBSourceResponse;
    }
}