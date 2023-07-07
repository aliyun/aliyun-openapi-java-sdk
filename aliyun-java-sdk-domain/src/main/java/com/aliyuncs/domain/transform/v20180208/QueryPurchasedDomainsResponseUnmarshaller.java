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

package com.aliyuncs.domain.transform.v20180208;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180208.QueryPurchasedDomainsResponse;
import com.aliyuncs.domain.model.v20180208.QueryPurchasedDomainsResponse.PurchasedDomains;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPurchasedDomainsResponseUnmarshaller {

	public static QueryPurchasedDomainsResponse unmarshall(QueryPurchasedDomainsResponse queryPurchasedDomainsResponse, UnmarshallerContext _ctx) {
		
		queryPurchasedDomainsResponse.setRequestId(_ctx.stringValue("QueryPurchasedDomainsResponse.RequestId"));
		queryPurchasedDomainsResponse.setTotalItemNum(_ctx.integerValue("QueryPurchasedDomainsResponse.TotalItemNum"));
		queryPurchasedDomainsResponse.setCurrentPageNum(_ctx.integerValue("QueryPurchasedDomainsResponse.CurrentPageNum"));
		queryPurchasedDomainsResponse.setPageSize(_ctx.integerValue("QueryPurchasedDomainsResponse.PageSize"));
		queryPurchasedDomainsResponse.setTotalPageNum(_ctx.integerValue("QueryPurchasedDomainsResponse.TotalPageNum"));

		List<PurchasedDomains> data = new ArrayList<PurchasedDomains>();
		for (int i = 0; i < _ctx.lengthValue("QueryPurchasedDomainsResponse.Data.Length"); i++) {
			PurchasedDomains purchasedDomains = new PurchasedDomains();
			purchasedDomains.setDomainName(_ctx.stringValue("QueryPurchasedDomainsResponse.Data["+ i +"].DomainName"));
			purchasedDomains.setOperationTime(_ctx.stringValue("QueryPurchasedDomainsResponse.Data["+ i +"].OperationTime"));
			purchasedDomains.setDeliveryTime(_ctx.stringValue("QueryPurchasedDomainsResponse.Data["+ i +"].DeliveryTime"));
			purchasedDomains.setTradeMoney(_ctx.doubleValue("QueryPurchasedDomainsResponse.Data["+ i +"].TradeMoney"));
			purchasedDomains.setProductType(_ctx.stringValue("QueryPurchasedDomainsResponse.Data["+ i +"].ProductType"));
			purchasedDomains.setOperationStatus(_ctx.stringValue("QueryPurchasedDomainsResponse.Data["+ i +"].OperationStatus"));

			data.add(purchasedDomains);
		}
		queryPurchasedDomainsResponse.setData(data);
	 
	 	return queryPurchasedDomainsResponse;
	}
}