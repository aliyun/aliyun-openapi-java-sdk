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

import com.aliyuncs.cms.model.v20150801.updateSQLMetricsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class updateSQLMetricsResponseUnmarshaller {

	public static updateSQLMetricsResponse unmarshall(updateSQLMetricsResponse updateSQLMetricsResponse, UnmarshallerContext context) {
		
		updateSQLMetricsResponse.setCode(context.stringValue("updateSQLMetricsResponse.Code"));
		updateSQLMetricsResponse.setMessage(context.stringValue("updateSQLMetricsResponse.Message"));
		updateSQLMetricsResponse.setSuccess(context.stringValue("updateSQLMetricsResponse.Success"));
		updateSQLMetricsResponse.setTraceId(context.stringValue("updateSQLMetricsResponse.TraceId"));
	 
	 	return updateSQLMetricsResponse;
	}
}