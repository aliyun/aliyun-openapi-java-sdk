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

import com.aliyuncs.cloudapi.model.v20160714.DescribeHistoryApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeHistoryApisResponse.ApiHisItem;
import com.aliyuncs.cloudapi.model.v20160714.DescribeHistoryApisResponse.ApiHisItem.Status;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeHistoryApisResponseUnmarshaller {

	public static DescribeHistoryApisResponse unmarshall(DescribeHistoryApisResponse describeHistoryApisResponse, UnmarshallerContext context) {
		
		describeHistoryApisResponse.setRequestId(context.stringValue("DescribeHistoryApisResponse.RequestId"));
		describeHistoryApisResponse.setTotalCount(context.integerValue("DescribeHistoryApisResponse.TotalCount"));
		describeHistoryApisResponse.setPageSize(context.integerValue("DescribeHistoryApisResponse.PageSize"));
		describeHistoryApisResponse.setPageNumber(context.integerValue("DescribeHistoryApisResponse.PageNumber"));

		List<ApiHisItem> apiHisItems = new ArrayList<ApiHisItem>();
		for (int i = 0; i < context.lengthValue("DescribeHistoryApisResponse.ApiHisItems.Length"); i++) {
			ApiHisItem apiHisItem = new ApiHisItem();
			apiHisItem.setRegionId(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].RegionId"));
			apiHisItem.setApiId(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].ApiId"));
			apiHisItem.setApiName(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].ApiName"));
			apiHisItem.setGroupId(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].GroupId"));
			apiHisItem.setGroupName(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].GroupName"));
			apiHisItem.setStageName(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].StageName"));
			apiHisItem.setHistoryVersion(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].HistoryVersion"));
			apiHisItem.setStatus(Status.getEnum(context.stringValue("DescribeHistoryApisResponse.ApiHisItems[" + i + "].Status")));
			apiHisItem.setDescription(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].Description"));
			apiHisItem.setDeployedTime(context.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].DeployedTime"));

			apiHisItems.add(apiHisItem);
		}
		describeHistoryApisResponse.setApiHisItems(apiHisItems);
	 
	 	return describeHistoryApisResponse;
	}
}