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

import com.aliyuncs.cloudapi.model.v20160714.DescribeAppsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAppsResponse.AppItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeAppsResponseUnmarshaller {

	public static DescribeAppsResponse unmarshall(DescribeAppsResponse describeAppsResponse, UnmarshallerContext context) {
		
		describeAppsResponse.setRequestId(context.stringValue("DescribeAppsResponse.RequestId"));
		describeAppsResponse.setTotalCount(context.integerValue("DescribeAppsResponse.TotalCount"));
		describeAppsResponse.setPageSize(context.integerValue("DescribeAppsResponse.PageSize"));
		describeAppsResponse.setPageNumber(context.integerValue("DescribeAppsResponse.PageNumber"));

		List<AppItem> apps = new ArrayList<AppItem>();
		for (int i = 0; i < context.lengthValue("DescribeAppsResponse.Apps.Length"); i++) {
			AppItem appItem = new AppItem();
			appItem.setAppId(context.longValue("DescribeAppsResponse.Apps["+ i +"].AppId"));
			appItem.setAppName(context.stringValue("DescribeAppsResponse.Apps["+ i +"].AppName"));
			appItem.setDescription(context.stringValue("DescribeAppsResponse.Apps["+ i +"].Description"));

			apps.add(appItem);
		}
		describeAppsResponse.setApps(apps);
	 
	 	return describeAppsResponse;
	}
}