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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse.ApiGroupAttribute;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse.ApiGroupAttribute.BillingStatus;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiGroupsResponse.ApiGroupAttribute.IllegalStatus;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiGroupsResponseUnmarshaller {

	public static DescribeApiGroupsResponse unmarshall(DescribeApiGroupsResponse describeApiGroupsResponse, UnmarshallerContext context) {
		
		describeApiGroupsResponse.setRequestId(context.stringValue("DescribeApiGroupsResponse.RequestId"));
		describeApiGroupsResponse.setTotalCount(context.integerValue("DescribeApiGroupsResponse.TotalCount"));
		describeApiGroupsResponse.setPageSize(context.integerValue("DescribeApiGroupsResponse.PageSize"));
		describeApiGroupsResponse.setPageNumber(context.integerValue("DescribeApiGroupsResponse.PageNumber"));

		List<ApiGroupAttribute> apiGroupAttributes = new ArrayList<ApiGroupAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeApiGroupsResponse.ApiGroupAttributes.Length"); i++) {
			ApiGroupAttribute apiGroupAttribute = new ApiGroupAttribute();
			apiGroupAttribute.setGroupId(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].GroupId"));
			apiGroupAttribute.setGroupName(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].GroupName"));
			apiGroupAttribute.setSubDomain(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].SubDomain"));
			apiGroupAttribute.setDescription(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].Description"));
			apiGroupAttribute.setCreatedTime(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].CreatedTime"));
			apiGroupAttribute.setModifiedTime(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].ModifiedTime"));
			apiGroupAttribute.setRegionId(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].RegionId"));
			apiGroupAttribute.setTrafficLimit(context.integerValue("DescribeApiGroupsResponse.ApiGroupAttributes["+ i +"].TrafficLimit"));
			apiGroupAttribute.setBillingStatus(BillingStatus.getEnum(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes[" + i + "].BillingStatus")));
			apiGroupAttribute.setIllegalStatus(IllegalStatus.getEnum(context.stringValue("DescribeApiGroupsResponse.ApiGroupAttributes[" + i + "].IllegalStatus")));

			apiGroupAttributes.add(apiGroupAttribute);
		}
		describeApiGroupsResponse.setApiGroupAttributes(apiGroupAttributes);
	 
	 	return describeApiGroupsResponse;
	}
}