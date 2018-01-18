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

import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlPolicyItemsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeIpControlPolicyItemsResponse.IpControlPolicyItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeIpControlPolicyItemsResponseUnmarshaller {

	public static DescribeIpControlPolicyItemsResponse unmarshall(DescribeIpControlPolicyItemsResponse describeIpControlPolicyItemsResponse, UnmarshallerContext context) {
		
		describeIpControlPolicyItemsResponse.setRequestId(context.stringValue("DescribeIpControlPolicyItemsResponse.RequestId"));
		describeIpControlPolicyItemsResponse.setTotalCount(context.integerValue("DescribeIpControlPolicyItemsResponse.TotalCount"));
		describeIpControlPolicyItemsResponse.setPageSize(context.integerValue("DescribeIpControlPolicyItemsResponse.PageSize"));
		describeIpControlPolicyItemsResponse.setPageNumber(context.integerValue("DescribeIpControlPolicyItemsResponse.PageNumber"));

		List<IpControlPolicyItem> ipControlPolicyItems = new ArrayList<IpControlPolicyItem>();
		for (int i = 0; i < context.lengthValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems.Length"); i++) {
			IpControlPolicyItem ipControlPolicyItem = new IpControlPolicyItem();
			ipControlPolicyItem.setAppId(context.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].AppId"));
			ipControlPolicyItem.setCidrIp(context.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].CidrIp"));
			ipControlPolicyItem.setPolicyItemId(context.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].PolicyItemId"));
			ipControlPolicyItem.setCreateTime(context.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].CreateTime"));
			ipControlPolicyItem.setModifiedTime(context.stringValue("DescribeIpControlPolicyItemsResponse.IpControlPolicyItems["+ i +"].ModifiedTime"));

			ipControlPolicyItems.add(ipControlPolicyItem);
		}
		describeIpControlPolicyItemsResponse.setIpControlPolicyItems(ipControlPolicyItems);
	 
	 	return describeIpControlPolicyItemsResponse;
	}
}