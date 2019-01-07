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

public class DeleteDBSourceResponseUnmarshaller {

    public static DeleteDBSourceResponse unmarshall(DeleteDBSourceResponse deleteDBSourceResponse,
                                                    UnmarshallerContext context) {

        deleteDBSourceResponse.setCode(context.stringValue("DeleteDBSourceResponse.Code"));
        deleteDBSourceResponse.setMessage(context.stringValue("DeleteDBSourceResponse.Message"));
        deleteDBSourceResponse.setSuccess(context.stringValue("DeleteDBSourceResponse.Success"));
        deleteDBSourceResponse.setTraceId(context.stringValue("DeleteDBSourceResponse.TraceId"));

        return deleteDBSourceResponse;
    }
}