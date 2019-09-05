/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApiGroupsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePurchasedApiGroupsResponseUnmarshaller {

	public static DescribePurchasedApiGroupsResponse unmarshall(DescribePurchasedApiGroupsResponse describePurchasedApiGroupsResponse, UnmarshallerContext _ctx) {
		
		describePurchasedApiGroupsResponse.setRequestId(_ctx.stringValue("DescribePurchasedApiGroupsResponse.RequestId"));
		describePurchasedApiGroupsResponse.setTotalCount(_ctx.integerValue("DescribePurchasedApiGroupsResponse.TotalCount"));
		describePurchasedApiGroupsResponse.setPageSize(_ctx.integerValue("DescribePurchasedApiGroupsResponse.PageSize"));
		describePurchasedApiGroupsResponse.setPageNumber(_ctx.integerValue("DescribePurchasedApiGroupsResponse.PageNumber"));

		List<PurchasedApiGroupAttribute> purchasedApiGroupAttributes = new ArrayList<PurchasedApiGroupAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes.Length"); i++) {
			PurchasedApiGroupAttribute purchasedApiGroupAttribute = new PurchasedApiGroupAttribute();
			purchasedApiGroupAttribute.setGroupId(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].GroupId"));
			purchasedApiGroupAttribute.setGroupName(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].GroupName"));
			purchasedApiGroupAttribute.setDescription(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].Description"));
			purchasedApiGroupAttribute.setPurchasedTime(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].PurchasedTime"));
			purchasedApiGroupAttribute.setExpireTime(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].ExpireTime"));
			purchasedApiGroupAttribute.setRegionId(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].RegionId"));
			purchasedApiGroupAttribute.setBillingType(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].BillingType"));
			purchasedApiGroupAttribute.setInvokeTimesMax(_ctx.longValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].InvokeTimesMax"));
			purchasedApiGroupAttribute.setInvokeTimesNow(_ctx.longValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].InvokeTimesNow"));
			purchasedApiGroupAttribute.setStatus(_ctx.stringValue("DescribePurchasedApiGroupsResponse.PurchasedApiGroupAttributes["+ i +"].Status"));

			purchasedApiGroupAttributes.add(purchasedApiGroupAttribute);
		}
		describePurchasedApiGroupsResponse.setPurchasedApiGroupAttributes(purchasedApiGroupAttributes);
	 
	 	return describePurchasedApiGroupsResponse;
	}
}