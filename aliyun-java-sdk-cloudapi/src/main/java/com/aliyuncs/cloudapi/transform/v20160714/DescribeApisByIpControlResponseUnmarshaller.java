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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByIpControlResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByIpControlResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApisByIpControlResponseUnmarshaller {

	public static DescribeApisByIpControlResponse unmarshall(DescribeApisByIpControlResponse describeApisByIpControlResponse, UnmarshallerContext context) {
		
		describeApisByIpControlResponse.setRequestId(context.stringValue("DescribeApisByIpControlResponse.RequestId"));
		describeApisByIpControlResponse.setTotalCount(context.integerValue("DescribeApisByIpControlResponse.TotalCount"));
		describeApisByIpControlResponse.setPageSize(context.integerValue("DescribeApisByIpControlResponse.PageSize"));
		describeApisByIpControlResponse.setPageNumber(context.integerValue("DescribeApisByIpControlResponse.PageNumber"));

		List<ApiInfo> apiInfos = new ArrayList<ApiInfo>();
		for (int i = 0; i < context.lengthValue("DescribeApisByIpControlResponse.ApiInfos.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setRegionId(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].RegionId"));
			apiInfo.setGroupId(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].GroupId"));
			apiInfo.setGroupName(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].GroupName"));
			apiInfo.setStageName(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].StageName"));
			apiInfo.setApiId(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].ApiId"));
			apiInfo.setApiName(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].ApiName"));
			apiInfo.setDescription(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].Description"));
			apiInfo.setVisibility(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].Visibility"));
			apiInfo.setBoundTime(context.stringValue("DescribeApisByIpControlResponse.ApiInfos["+ i +"].BoundTime"));

			apiInfos.add(apiInfo);
		}
		describeApisByIpControlResponse.setApiInfos(apiInfos);
	 
	 	return describeApisByIpControlResponse;
	}
}