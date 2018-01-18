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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiIpControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiIpControlsResponse.ApiIpControlItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiIpControlsResponseUnmarshaller {

	public static DescribeApiIpControlsResponse unmarshall(DescribeApiIpControlsResponse describeApiIpControlsResponse, UnmarshallerContext context) {
		
		describeApiIpControlsResponse.setRequestId(context.stringValue("DescribeApiIpControlsResponse.RequestId"));
		describeApiIpControlsResponse.setTotalCount(context.integerValue("DescribeApiIpControlsResponse.TotalCount"));
		describeApiIpControlsResponse.setPageSize(context.integerValue("DescribeApiIpControlsResponse.PageSize"));
		describeApiIpControlsResponse.setPageNumber(context.integerValue("DescribeApiIpControlsResponse.PageNumber"));

		List<ApiIpControlItem> apiIpControls = new ArrayList<ApiIpControlItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiIpControlsResponse.ApiIpControls.Length"); i++) {
			ApiIpControlItem apiIpControlItem = new ApiIpControlItem();
			apiIpControlItem.setApiId(context.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].ApiId"));
			apiIpControlItem.setApiName(context.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].ApiName"));
			apiIpControlItem.setIpControlId(context.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].IpControlId"));
			apiIpControlItem.setIpControlName(context.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].IpControlName"));
			apiIpControlItem.setBoundTime(context.stringValue("DescribeApiIpControlsResponse.ApiIpControls["+ i +"].BoundTime"));

			apiIpControls.add(apiIpControlItem);
		}
		describeApiIpControlsResponse.setApiIpControls(apiIpControls);
	 
	 	return describeApiIpControlsResponse;
	}
}