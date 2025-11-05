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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryDomainRealTimePriceResponse;
import com.aliyuncs.domain.model.v20180129.QueryDomainRealTimePriceResponse.Module;
import com.aliyuncs.domain.model.v20180129.QueryDomainRealTimePriceResponse.Module.DomainPricesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainRealTimePriceResponseUnmarshaller {

	public static QueryDomainRealTimePriceResponse unmarshall(QueryDomainRealTimePriceResponse queryDomainRealTimePriceResponse, UnmarshallerContext _ctx) {
		
		queryDomainRealTimePriceResponse.setRequestId(_ctx.stringValue("QueryDomainRealTimePriceResponse.RequestId"));
		queryDomainRealTimePriceResponse.setHttpStatusCode(_ctx.integerValue("QueryDomainRealTimePriceResponse.HttpStatusCode"));
		queryDomainRealTimePriceResponse.setDynamicCode(_ctx.stringValue("QueryDomainRealTimePriceResponse.DynamicCode"));
		queryDomainRealTimePriceResponse.setDynamicMessage(_ctx.stringValue("QueryDomainRealTimePriceResponse.DynamicMessage"));
		queryDomainRealTimePriceResponse.setSynchro(_ctx.booleanValue("QueryDomainRealTimePriceResponse.Synchro"));
		queryDomainRealTimePriceResponse.setErrorMsg(_ctx.stringValue("QueryDomainRealTimePriceResponse.ErrorMsg"));
		queryDomainRealTimePriceResponse.setErrorCode(_ctx.stringValue("QueryDomainRealTimePriceResponse.ErrorCode"));
		queryDomainRealTimePriceResponse.setSuccess(_ctx.booleanValue("QueryDomainRealTimePriceResponse.Success"));

		Module module = new Module();

		List<DomainPricesItem> domainPrices = new ArrayList<DomainPricesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainRealTimePriceResponse.Module.DomainPrices.Length"); i++) {
			DomainPricesItem domainPricesItem = new DomainPricesItem();
			domainPricesItem.setDomainName(_ctx.stringValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].DomainName"));
			domainPricesItem.setAction(_ctx.stringValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].Action"));
			domainPricesItem.setPeriod(_ctx.integerValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].Period"));
			domainPricesItem.setPrice(_ctx.doubleValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].Price"));
			domainPricesItem.setCurrency(_ctx.stringValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].Currency"));
			domainPricesItem.setPremium(_ctx.booleanValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].Premium"));
			domainPricesItem.setAvail(_ctx.integerValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].Avail"));
			domainPricesItem.setReason(_ctx.stringValue("QueryDomainRealTimePriceResponse.Module.DomainPrices["+ i +"].Reason"));

			domainPrices.add(domainPricesItem);
		}
		module.setDomainPrices(domainPrices);
		queryDomainRealTimePriceResponse.setModule(module);
	 
	 	return queryDomainRealTimePriceResponse;
	}
}