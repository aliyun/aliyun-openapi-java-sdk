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

import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApisResponse.DeployedApiItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeDeployedApisResponseUnmarshaller {

	public static DescribeDeployedApisResponse unmarshall(DescribeDeployedApisResponse describeDeployedApisResponse, UnmarshallerContext context) {
		
		describeDeployedApisResponse.setRequestId(context.stringValue("DescribeDeployedApisResponse.RequestId"));
		describeDeployedApisResponse.setTotalCount(context.integerValue("DescribeDeployedApisResponse.TotalCount"));
		describeDeployedApisResponse.setPageSize(context.integerValue("DescribeDeployedApisResponse.PageSize"));
		describeDeployedApisResponse.setPageNumber(context.integerValue("DescribeDeployedApisResponse.PageNumber"));

		List<DeployedApiItem> deployedApis = new ArrayList<DeployedApiItem>();
		for (int i = 0; i < context.lengthValue("DescribeDeployedApisResponse.DeployedApis.Length"); i++) {
			DeployedApiItem deployedApiItem = new DeployedApiItem();
			deployedApiItem.setRegionId(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].RegionId"));
			deployedApiItem.setApiId(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiId"));
			deployedApiItem.setApiName(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiName"));
			deployedApiItem.setGroupId(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].GroupId"));
			deployedApiItem.setGroupName(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].GroupName"));
			deployedApiItem.setStageName(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].StageName"));
			deployedApiItem.setVisibility(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].Visibility"));
			deployedApiItem.setDescription(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].Description"));
			deployedApiItem.setDeployedTime(context.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].DeployedTime"));

			deployedApis.add(deployedApiItem);
		}
		describeDeployedApisResponse.setDeployedApis(deployedApis);
	 
	 	return describeDeployedApisResponse;
	}
}