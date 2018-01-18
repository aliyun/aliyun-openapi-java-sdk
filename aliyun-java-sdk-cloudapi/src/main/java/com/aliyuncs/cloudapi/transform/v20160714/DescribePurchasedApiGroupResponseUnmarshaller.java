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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApiGroupResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApiGroupResponse.DomainItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePurchasedApiGroupResponseUnmarshaller {

	public static DescribePurchasedApiGroupResponse unmarshall(DescribePurchasedApiGroupResponse describePurchasedApiGroupResponse, UnmarshallerContext context) {
		
		describePurchasedApiGroupResponse.setRequestId(context.stringValue("DescribePurchasedApiGroupResponse.RequestId"));
		describePurchasedApiGroupResponse.setGroupId(context.stringValue("DescribePurchasedApiGroupResponse.GroupId"));
		describePurchasedApiGroupResponse.setGroupName(context.stringValue("DescribePurchasedApiGroupResponse.GroupName"));
		describePurchasedApiGroupResponse.setDescription(context.stringValue("DescribePurchasedApiGroupResponse.Description"));
		describePurchasedApiGroupResponse.setPurchasedTime(context.stringValue("DescribePurchasedApiGroupResponse.PurchasedTime"));
		describePurchasedApiGroupResponse.setRegionId(context.stringValue("DescribePurchasedApiGroupResponse.RegionId"));
		describePurchasedApiGroupResponse.setStatus(context.stringValue("DescribePurchasedApiGroupResponse.Status"));

		List<DomainItem> domains = new ArrayList<DomainItem>();
		for (int i = 0; i < context.lengthValue("DescribePurchasedApiGroupResponse.Domains.Length"); i++) {
			DomainItem domainItem = new DomainItem();
			domainItem.setDomainName(context.stringValue("DescribePurchasedApiGroupResponse.Domains["+ i +"].DomainName"));

			domains.add(domainItem);
		}
		describePurchasedApiGroupResponse.setDomains(domains);
	 
	 	return describePurchasedApiGroupResponse;
	}
}