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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByTrafficControlResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByTrafficControlResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApisByTrafficControlResponseUnmarshaller {

	public static DescribeApisByTrafficControlResponse unmarshall(DescribeApisByTrafficControlResponse describeApisByTrafficControlResponse, UnmarshallerContext context) {
		
		describeApisByTrafficControlResponse.setRequestId(context.stringValue("DescribeApisByTrafficControlResponse.RequestId"));
		describeApisByTrafficControlResponse.setTotalCount(context.integerValue("DescribeApisByTrafficControlResponse.TotalCount"));
		describeApisByTrafficControlResponse.setPageSize(context.integerValue("DescribeApisByTrafficControlResponse.PageSize"));
		describeApisByTrafficControlResponse.setPageNumber(context.integerValue("DescribeApisByTrafficControlResponse.PageNumber"));

		List<ApiInfo> apiInfos = new ArrayList<ApiInfo>();
		for (int i = 0; i < context.lengthValue("DescribeApisByTrafficControlResponse.ApiInfos.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setRegionId(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].RegionId"));
			apiInfo.setGroupId(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].GroupId"));
			apiInfo.setGroupName(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].GroupName"));
			apiInfo.setStageName(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].StageName"));
			apiInfo.setApiId(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].ApiId"));
			apiInfo.setApiName(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].ApiName"));
			apiInfo.setDescription(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].Description"));
			apiInfo.setVisibility(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].Visibility"));
			apiInfo.setBoundTime(context.stringValue("DescribeApisByTrafficControlResponse.ApiInfos["+ i +"].BoundTime"));

			apiInfos.add(apiInfo);
		}
		describeApisByTrafficControlResponse.setApiInfos(apiInfos);
	 
	 	return describeApisByTrafficControlResponse;
	}
}