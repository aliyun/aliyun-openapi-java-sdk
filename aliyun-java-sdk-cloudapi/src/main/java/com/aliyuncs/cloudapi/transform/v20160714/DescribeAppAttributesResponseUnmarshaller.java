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

import com.aliyuncs.cloudapi.model.v20160714.DescribeAppAttributesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeAppAttributesResponse.AppAttribute;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeAppAttributesResponseUnmarshaller {

	public static DescribeAppAttributesResponse unmarshall(DescribeAppAttributesResponse describeAppAttributesResponse, UnmarshallerContext context) {
		
		describeAppAttributesResponse.setRequestId(context.stringValue("DescribeAppAttributesResponse.RequestId"));
		describeAppAttributesResponse.setTotalCount(context.integerValue("DescribeAppAttributesResponse.TotalCount"));
		describeAppAttributesResponse.setPageSize(context.integerValue("DescribeAppAttributesResponse.PageSize"));
		describeAppAttributesResponse.setPageNumber(context.integerValue("DescribeAppAttributesResponse.PageNumber"));

		List<AppAttribute> apps = new ArrayList<AppAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeAppAttributesResponse.Apps.Length"); i++) {
			AppAttribute appAttribute = new AppAttribute();
			appAttribute.setAppId(context.longValue("DescribeAppAttributesResponse.Apps["+ i +"].AppId"));
			appAttribute.setAppName(context.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].AppName"));
			appAttribute.setDescription(context.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].Description"));
			appAttribute.setCreatedTime(context.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].CreatedTime"));
			appAttribute.setModifiedTime(context.stringValue("DescribeAppAttributesResponse.Apps["+ i +"].ModifiedTime"));

			apps.add(appAttribute);
		}
		describeAppAttributesResponse.setApps(apps);
	 
	 	return describeAppAttributesResponse;
	}
}