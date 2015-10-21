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

import com.aliyuncs.cms.model.v20150801.GetMetricsMetaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetricsMetaResponseUnmarshaller {

	public static GetMetricsMetaResponse unmarshall(GetMetricsMetaResponse getMetricsMetaResponse, UnmarshallerContext context) {
		
		getMetricsMetaResponse.setCode(context.stringValue("GetMetricsMetaResponse.Code"));
		getMetricsMetaResponse.setMessage(context.stringValue("GetMetricsMetaResponse.Message"));
		getMetricsMetaResponse.setSuccess(context.stringValue("GetMetricsMetaResponse.Success"));
		getMetricsMetaResponse.setTraceId(context.stringValue("GetMetricsMetaResponse.TraceId"));
		getMetricsMetaResponse.setResult(context.stringValue("GetMetricsMetaResponse.Result"));
	 
	 	return getMetricsMetaResponse;
	}
}