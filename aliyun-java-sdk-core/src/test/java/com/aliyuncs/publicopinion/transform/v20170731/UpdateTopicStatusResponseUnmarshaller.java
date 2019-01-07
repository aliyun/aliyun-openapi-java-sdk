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
package com.aliyuncs.publicopinion.transform.v20170731;

import com.aliyuncs.publicopinion.model.v20170731.UpdateTopicStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTopicStatusResponseUnmarshaller {

    public static UpdateTopicStatusResponse unmarshall(UpdateTopicStatusResponse updateTopicStatusResponse, UnmarshallerContext context) {

        updateTopicStatusResponse.setTraceId(context.stringValue("UpdateTopicStatusResponse.traceId"));
        updateTopicStatusResponse.setSuccess(context.booleanValue("UpdateTopicStatusResponse.success"));
        updateTopicStatusResponse.setResult(context.booleanValue("UpdateTopicStatusResponse.result"));
        updateTopicStatusResponse.setErrCode(context.integerValue("UpdateTopicStatusResponse.errCode"));

        return updateTopicStatusResponse;
    }
}