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
package com.aliyuncs.cms.transform.v20170301;

import com.aliyuncs.cms.model.v20170301.QueryCustomMetricListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomMetricListResponseUnmarshaller {

	public static QueryCustomMetricListResponse unmarshall(QueryCustomMetricListResponse queryCustomMetricListResponse, UnmarshallerContext context) {
		
		queryCustomMetricListResponse.setRequestId(context.stringValue("QueryCustomMetricListResponse.RequestId"));
		queryCustomMetricListResponse.setCode(context.stringValue("QueryCustomMetricListResponse.Code"));
		queryCustomMetricListResponse.setMessage(context.stringValue("QueryCustomMetricListResponse.Message"));
		queryCustomMetricListResponse.setResult(context.stringValue("QueryCustomMetricListResponse.Result"));
	 
	 	return queryCustomMetricListResponse;
	}
}