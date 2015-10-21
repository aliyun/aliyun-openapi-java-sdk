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
package com.aliyuncs.cms.transform.v20150801;

import com.aliyuncs.cms.model.v20150801.CreateMetricStreamResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMetricStreamResponseUnmarshaller {

	public static CreateMetricStreamResponse unmarshall(CreateMetricStreamResponse createMetricStreamResponse, UnmarshallerContext context) {
		
		createMetricStreamResponse.setCode(context.stringValue("CreateMetricStreamResponse.Code"));
		createMetricStreamResponse.setMessage(context.stringValue("CreateMetricStreamResponse.Message"));
		createMetricStreamResponse.setSuccess(context.stringValue("CreateMetricStreamResponse.Success"));
		createMetricStreamResponse.setTraceId(context.stringValue("CreateMetricStreamResponse.TraceId"));
		createMetricStreamResponse.setResult(context.stringValue("CreateMetricStreamResponse.Result"));
	 
	 	return createMetricStreamResponse;
	}
}