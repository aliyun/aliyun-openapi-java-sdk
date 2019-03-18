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

import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedApisResponse.AuthorizedApi;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeAuthorizedApisResponseUnmarshaller {

	public static DescribeAuthorizedApisResponse unmarshall(DescribeAuthorizedApisResponse describeAuthorizedApisResponse, UnmarshallerContext context) {
		
		describeAuthorizedApisResponse.setRequestId(context.stringValue("DescribeAuthorizedApisResponse.RequestId"));
		describeAuthorizedApisResponse.setTotalCount(context.integerValue("DescribeAuthorizedApisResponse.TotalCount"));
		describeAuthorizedApisResponse.setPageSize(context.integerValue("DescribeAuthorizedApisResponse.PageSize"));
		describeAuthorizedApisResponse.setPageNumber(context.integerValue("DescribeAuthorizedApisResponse.PageNumber"));

		List<AuthorizedApi> authorizedApis = new ArrayList<AuthorizedApi>();
		for (int i = 0; i < context.lengthValue("DescribeAuthorizedApisResponse.AuthorizedApis.Length"); i++) {
			AuthorizedApi authorizedApi = new AuthorizedApi();
			authorizedApi.setRegionId(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].RegionId"));
			authorizedApi.setGroupId(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].GroupId"));
			authorizedApi.setGroupName(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].GroupName"));
			authorizedApi.setStageName(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].StageName"));
			authorizedApi.setOperator(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].Operator"));
			authorizedApi.setApiId(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].ApiId"));
			authorizedApi.setApiName(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].ApiName"));
			authorizedApi.setAuthorizationSource(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].AuthorizationSource"));
			authorizedApi.setDescription(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].Description"));
			authorizedApi.setAuthorizedTime(context.stringValue("DescribeAuthorizedApisResponse.AuthorizedApis["+ i +"].AuthorizedTime"));

			authorizedApis.add(authorizedApi);
		}
		describeAuthorizedApisResponse.setAuthorizedApis(authorizedApis);
	 
	 	return describeAuthorizedApisResponse;
	}
}