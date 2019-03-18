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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisBySignatureResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisBySignatureResponse.ApiInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApisBySignatureResponseUnmarshaller {

	public static DescribeApisBySignatureResponse unmarshall(DescribeApisBySignatureResponse describeApisBySignatureResponse, UnmarshallerContext context) {
		
		describeApisBySignatureResponse.setRequestId(context.stringValue("DescribeApisBySignatureResponse.RequestId"));
		describeApisBySignatureResponse.setTotalCount(context.integerValue("DescribeApisBySignatureResponse.TotalCount"));
		describeApisBySignatureResponse.setPageSize(context.integerValue("DescribeApisBySignatureResponse.PageSize"));
		describeApisBySignatureResponse.setPageNumber(context.integerValue("DescribeApisBySignatureResponse.PageNumber"));

		List<ApiInfo> apiInfos = new ArrayList<ApiInfo>();
		for (int i = 0; i < context.lengthValue("DescribeApisBySignatureResponse.ApiInfos.Length"); i++) {
			ApiInfo apiInfo = new ApiInfo();
			apiInfo.setRegionId(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].RegionId"));
			apiInfo.setGroupId(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].GroupId"));
			apiInfo.setGroupName(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].GroupName"));
			apiInfo.setStageName(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].StageName"));
			apiInfo.setApiId(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].ApiId"));
			apiInfo.setApiName(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].ApiName"));
			apiInfo.setDescription(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].Description"));
			apiInfo.setVisibility(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].Visibility"));
			apiInfo.setBoundTime(context.stringValue("DescribeApisBySignatureResponse.ApiInfos["+ i +"].BoundTime"));

			apiInfos.add(apiInfo);
		}
		describeApisBySignatureResponse.setApiInfos(apiInfos);
	 
	 	return describeApisBySignatureResponse;
	}
}