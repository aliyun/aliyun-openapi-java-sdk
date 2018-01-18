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

import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApisResponse.PurchasedApi;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePurchasedApisResponseUnmarshaller {

	public static DescribePurchasedApisResponse unmarshall(DescribePurchasedApisResponse describePurchasedApisResponse, UnmarshallerContext context) {
		
		describePurchasedApisResponse.setRequestId(context.stringValue("DescribePurchasedApisResponse.RequestId"));
		describePurchasedApisResponse.setTotalCount(context.integerValue("DescribePurchasedApisResponse.TotalCount"));
		describePurchasedApisResponse.setPageSize(context.integerValue("DescribePurchasedApisResponse.PageSize"));
		describePurchasedApisResponse.setPageNumber(context.integerValue("DescribePurchasedApisResponse.PageNumber"));

		List<PurchasedApi> purchasedApis = new ArrayList<PurchasedApi>();
		for (int i = 0; i < context.lengthValue("DescribePurchasedApisResponse.PurchasedApis.Length"); i++) {
			PurchasedApi purchasedApi = new PurchasedApi();
			purchasedApi.setRegionId(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].RegionId"));
			purchasedApi.setGroupId(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].GroupId"));
			purchasedApi.setGroupName(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].GroupName"));
			purchasedApi.setApiId(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].ApiId"));
			purchasedApi.setApiName(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].ApiName"));
			purchasedApi.setStageName(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].StageName"));
			purchasedApi.setDescription(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].Description"));
			purchasedApi.setPurchasedTime(context.stringValue("DescribePurchasedApisResponse.PurchasedApis["+ i +"].PurchasedTime"));

			purchasedApis.add(purchasedApi);
		}
		describePurchasedApisResponse.setPurchasedApis(purchasedApis);
	 
	 	return describePurchasedApisResponse;
	}
}