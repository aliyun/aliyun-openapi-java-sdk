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

import com.aliyuncs.cms.model.v20150801.DescribeMetricResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricResponseUnmarshaller {

	public static DescribeMetricResponse unmarshall(DescribeMetricResponse describeMetricResponse, UnmarshallerContext context) {
		
		describeMetricResponse.setCode(context.stringValue("DescribeMetricResponse.Code"));
		describeMetricResponse.setMessage(context.stringValue("DescribeMetricResponse.Message"));
		describeMetricResponse.setSuccess(context.stringValue("DescribeMetricResponse.Success"));
		describeMetricResponse.setTraceId(context.stringValue("DescribeMetricResponse.TraceId"));

		List<String> datapoints = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeMetricResponse.Datapoints.Length"); i++) {
			datapoints.add(context.stringValue("DescribeMetricResponse.Datapoints["+ i +"]"));
		}
		describeMetricResponse.setDatapoints(datapoints);
	 
	 	return describeMetricResponse;
	}
}