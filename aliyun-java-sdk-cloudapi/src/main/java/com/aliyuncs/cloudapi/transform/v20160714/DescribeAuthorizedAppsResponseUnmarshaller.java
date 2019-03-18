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

import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedAppsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAuthorizedAppsResponse.AuthorizedApp;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeAuthorizedAppsResponseUnmarshaller {

	public static DescribeAuthorizedAppsResponse unmarshall(DescribeAuthorizedAppsResponse describeAuthorizedAppsResponse, UnmarshallerContext context) {
		
		describeAuthorizedAppsResponse.setRequestId(context.stringValue("DescribeAuthorizedAppsResponse.RequestId"));
		describeAuthorizedAppsResponse.setTotalCount(context.integerValue("DescribeAuthorizedAppsResponse.TotalCount"));
		describeAuthorizedAppsResponse.setPageSize(context.integerValue("DescribeAuthorizedAppsResponse.PageSize"));
		describeAuthorizedAppsResponse.setPageNumber(context.integerValue("DescribeAuthorizedAppsResponse.PageNumber"));

		List<AuthorizedApp> authorizedApps = new ArrayList<AuthorizedApp>();
		for (int i = 0; i < context.lengthValue("DescribeAuthorizedAppsResponse.AuthorizedApps.Length"); i++) {
			AuthorizedApp authorizedApp = new AuthorizedApp();
			authorizedApp.setStageName(context.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].StageName"));
			authorizedApp.setAppId(context.longValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AppId"));
			authorizedApp.setAppName(context.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AppName"));
			authorizedApp.setOperator(context.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].Operator"));
			authorizedApp.setAuthorizationSource(context.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AuthorizationSource"));
			authorizedApp.setDescription(context.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].Description"));
			authorizedApp.setAuthorizedTime(context.stringValue("DescribeAuthorizedAppsResponse.AuthorizedApps["+ i +"].AuthorizedTime"));

			authorizedApps.add(authorizedApp);
		}
		describeAuthorizedAppsResponse.setAuthorizedApps(authorizedApps);
	 
	 	return describeAuthorizedAppsResponse;
	}
}