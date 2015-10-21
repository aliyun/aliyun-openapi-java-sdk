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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20150801.QueryIncrementalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIncrementalResponseUnmarshaller {

	public static QueryIncrementalResponse unmarshall(QueryIncrementalResponse queryIncrementalResponse, UnmarshallerContext context) {
		
		queryIncrementalResponse.setCode(context.stringValue("QueryIncrementalResponse.Code"));
		queryIncrementalResponse.setMessage(context.stringValue("QueryIncrementalResponse.Message"));
		queryIncrementalResponse.setSuccess(context.stringValue("QueryIncrementalResponse.Success"));
		queryIncrementalResponse.setTraceId(context.stringValue("QueryIncrementalResponse.TraceId"));

		List<String> datapoints = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryIncrementalResponse.Datapoints.Length"); i++) {
			datapoints.add(context.stringValue("QueryIncrementalResponse.Datapoints["+ i +"]"));
		}
		queryIncrementalResponse.setDatapoints(datapoints);
	 
	 	return queryIncrementalResponse;
	}
}