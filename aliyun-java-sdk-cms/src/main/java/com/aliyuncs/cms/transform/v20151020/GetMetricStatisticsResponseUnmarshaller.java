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

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.cms.model.v20151020.GetMetricStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetricStatisticsResponseUnmarshaller {

	public static GetMetricStatisticsResponse unmarshall(GetMetricStatisticsResponse getMetricStatisticsResponse, UnmarshallerContext context) {
		
		getMetricStatisticsResponse.setNextToken(context.stringValue("GetMetricStatisticsResponse.NextToken"));
		getMetricStatisticsResponse.setCode(context.stringValue("GetMetricStatisticsResponse.Code"));
		getMetricStatisticsResponse.setMessage(context.stringValue("GetMetricStatisticsResponse.Message"));
		getMetricStatisticsResponse.setNextToken(context.stringValue("GetMetricStatisticsResponse.NextToken"));

		List<JSONObject> datapoints = JSONParser.parseJSONArray(context, context.lengthValue("GetMetricStatisticsResponse.Datapoints.Length"));

		getMetricStatisticsResponse.setDatapoints(datapoints);
	 
	 	return getMetricStatisticsResponse;
	}
}