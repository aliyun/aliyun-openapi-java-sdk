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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficControlsResponse.ApiTrafficControlItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiTrafficControlsResponseUnmarshaller {

	public static DescribeApiTrafficControlsResponse unmarshall(DescribeApiTrafficControlsResponse describeApiTrafficControlsResponse, UnmarshallerContext context) {
		
		describeApiTrafficControlsResponse.setRequestId(context.stringValue("DescribeApiTrafficControlsResponse.RequestId"));
		describeApiTrafficControlsResponse.setTotalCount(context.integerValue("DescribeApiTrafficControlsResponse.TotalCount"));
		describeApiTrafficControlsResponse.setPageSize(context.integerValue("DescribeApiTrafficControlsResponse.PageSize"));
		describeApiTrafficControlsResponse.setPageNumber(context.integerValue("DescribeApiTrafficControlsResponse.PageNumber"));

		List<ApiTrafficControlItem> apiTrafficControls = new ArrayList<ApiTrafficControlItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiTrafficControlsResponse.ApiTrafficControls.Length"); i++) {
			ApiTrafficControlItem apiTrafficControlItem = new ApiTrafficControlItem();
			apiTrafficControlItem.setApiId(context.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].ApiId"));
			apiTrafficControlItem.setApiName(context.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].ApiName"));
			apiTrafficControlItem.setTrafficControlId(context.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].TrafficControlId"));
			apiTrafficControlItem.setTrafficControlName(context.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].TrafficControlName"));
			apiTrafficControlItem.setBoundTime(context.stringValue("DescribeApiTrafficControlsResponse.ApiTrafficControls["+ i +"].BoundTime"));

			apiTrafficControls.add(apiTrafficControlItem);
		}
		describeApiTrafficControlsResponse.setApiTrafficControls(apiTrafficControls);
	 
	 	return describeApiTrafficControlsResponse;
	}
}