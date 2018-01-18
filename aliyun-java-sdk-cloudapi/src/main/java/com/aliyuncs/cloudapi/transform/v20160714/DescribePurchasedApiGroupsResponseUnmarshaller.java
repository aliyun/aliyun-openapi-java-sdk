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

import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApiGroupsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePurchasedApiGroupsResponseUnmarshaller {

	public static DescribePurchasedApiGroupsResponse unmarshall(DescribePurchasedApiGroupsResponse describePurchasedApiGroupsResponse, UnmarshallerContext context) {
		
		describePurchasedApiGroupsResponse.setRequestId(context.stringValue("DescribePurchasedApiGroupsResponse.RequestId"));
		describePurchasedApiGroupsResponse.setTotalCount(context.integerValue("DescribePurchasedApiGroupsResponse.TotalCount"));
		describePurchasedApiGroupsResponse.setPageSize(context.integerValue("DescribePurchasedApiGroupsResponse.PageSize"));
		describePurchasedApiGroupsResponse.setPageNumber(context.integerValue("DescribePurchasedApiGroupsResponse.PageNumber"));

		List<PurchasedApiGroupAttribute> purchasedApiGroupAttributes = new ArrayList<PurchasedApiGroupAttribute>();
		for (int i = 0; i < context.lengthValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes.Length"); i++) {
			PurchasedApiGroupAttribute purchasedApiGroupAttribute = new PurchasedApiGroupAttribute();
			purchasedApiGroupAttribute.setGroupId(context.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].GroupId"));
			purchasedApiGroupAttribute.setGroupName(context.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].GroupName"));
			purchasedApiGroupAttribute.setDescription(context.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].Description"));
			purchasedApiGroupAttribute.setPurchasedTime(context.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].PurchasedTime"));
			purchasedApiGroupAttribute.setExpireTime(context.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].ExpireTime"));
			purchasedApiGroupAttribute.setRegionId(context.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].RegionId"));
			purchasedApiGroupAttribute.setBillingType(context.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].BillingType"));
			purchasedApiGroupAttribute.setInvokeTimesMax(context.longValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].InvokeTimesMax"));
			purchasedApiGroupAttribute.setInvokeTimesNow(context.longValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].InvokeTimesNow"));

			purchasedApiGroupAttributes.add(purchasedApiGroupAttribute);
		}
		describePurchasedApiGroupsResponse.setPurchasedApiGroupAttributes(purchasedApiGroupAttributes);
	 
	 	return describePurchasedApiGroupsResponse;
	}
}