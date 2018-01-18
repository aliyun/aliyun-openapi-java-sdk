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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisResponse.ApiSummary;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApisResponseUnmarshaller {

	public static DescribeApisResponse unmarshall(DescribeApisResponse describeApisResponse, UnmarshallerContext context) {
		
		describeApisResponse.setRequestId(context.stringValue("DescribeApisResponse.RequestId"));
		describeApisResponse.setTotalCount(context.integerValue("DescribeApisResponse.TotalCount"));
		describeApisResponse.setPageSize(context.integerValue("DescribeApisResponse.PageSize"));
		describeApisResponse.setPageNumber(context.integerValue("DescribeApisResponse.PageNumber"));

		List<ApiSummary> apiSummarys = new ArrayList<ApiSummary>();
		for (int i = 0; i < context.lengthValue("DescribeApisResponse.ApiSummarys.Length"); i++) {
			ApiSummary apiSummary = new ApiSummary();
			apiSummary.setRegionId(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].RegionId"));
			apiSummary.setGroupId(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].GroupId"));
			apiSummary.setGroupName(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].GroupName"));
			apiSummary.setApiId(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiId"));
			apiSummary.setApiName(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ApiName"));
			apiSummary.setVisibility(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].Visibility"));
			apiSummary.setDescription(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].Description"));
			apiSummary.setCreatedTime(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].CreatedTime"));
			apiSummary.setModifiedTime(context.stringValue("DescribeApisResponse.ApiSummarys["+ i +"].ModifiedTime"));

			apiSummarys.add(apiSummary);
		}
		describeApisResponse.setApiSummarys(apiSummarys);
	 
	 	return describeApisResponse;
	}
}