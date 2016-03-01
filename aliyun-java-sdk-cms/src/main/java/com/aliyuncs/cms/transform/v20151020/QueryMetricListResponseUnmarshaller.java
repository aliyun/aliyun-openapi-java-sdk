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
package com.aliyuncs.cms.transform.v20151020;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.cms.model.v20151020.QueryMetricListResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;


public class QueryMetricListResponseUnmarshaller {

	public static QueryMetricListResponse unmarshall(QueryMetricListResponse queryMetricListResponse, UnmarshallerContext context) {
		
		queryMetricListResponse.setCode(context.stringValue("QueryMetricListResponse.Code"));
		queryMetricListResponse.setMessage(context.stringValue("QueryMetricListResponse.Message"));
		queryMetricListResponse.setSuccess(context.stringValue("QueryMetricListResponse.Success"));
		queryMetricListResponse.setTraceId(context.stringValue("QueryMetricListResponse.TraceId"));
		queryMetricListResponse.setNextToken(context.integerValue("QueryMetricListResponse.NextToken"));
		queryMetricListResponse.setPeriod(context.stringValue("QueryMetricListResponse.Period"));
		List<JSONObject> datapoints = JSONParser.parseJSONArray(context);
		queryMetricListResponse.setDatapoints(datapoints);
	 
	 	return queryMetricListResponse;
	}
}