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

import com.aliyuncs.cms.model.v20150801.BatchCreateMetricsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateMetricsResponseUnmarshaller {

	public static BatchCreateMetricsResponse unmarshall(BatchCreateMetricsResponse batchCreateMetricsResponse, UnmarshallerContext context) {
		
		batchCreateMetricsResponse.setCode(context.stringValue("BatchCreateMetricsResponse.Code"));
		batchCreateMetricsResponse.setMessage(context.stringValue("BatchCreateMetricsResponse.Message"));
		batchCreateMetricsResponse.setSuccess(context.stringValue("BatchCreateMetricsResponse.Success"));
		batchCreateMetricsResponse.setTraceId(context.stringValue("BatchCreateMetricsResponse.TraceId"));
		batchCreateMetricsResponse.setResult(context.stringValue("BatchCreateMetricsResponse.Result"));
	 
	 	return batchCreateMetricsResponse;
	}
}