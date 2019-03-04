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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceListResponse.Data.Module;
import com.aliyuncs.bssopenapi.model.v20171214.QueryPriceListResponse.Data.Module.TierPrice;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPriceListResponseUnmarshaller {

	public static QueryPriceListResponse unmarshall(QueryPriceListResponse queryPriceListResponse, UnmarshallerContext context) {
		
		queryPriceListResponse.setRequestId(context.stringValue("QueryPriceListResponse.RequestId"));
		queryPriceListResponse.setSuccess(context.booleanValue("QueryPriceListResponse.Success"));
		queryPriceListResponse.setCode(context.stringValue("QueryPriceListResponse.Code"));
		queryPriceListResponse.setMessage(context.stringValue("QueryPriceListResponse.Message"));

		Data data = new Data();
		data.setCurrency(context.stringValue("QueryPriceListResponse.Data.Currency"));

		List<Module> modules = new ArrayList<Module>();
		for (int i = 0; i < context.lengthValue("QueryPriceListResponse.Data.Modules.Length"); i++) {
			Module module = new Module();
			module.setModuleCode(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].ModuleCode"));
			module.setRegion(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].Region"));
			module.setConfig(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].Config"));
			module.setPriceUnitQuantity(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].PriceUnitQuantity"));
			module.setPriceUnit(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].PriceUnit"));

			List<TierPrice> tierPrices = new ArrayList<TierPrice>();
			for (int j = 0; j < context.lengthValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices.Length"); j++) {
				TierPrice tierPrice = new TierPrice();
				tierPrice.setTierStart(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices["+ j +"].TierStart"));
				tierPrice.setStartSymbol(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices["+ j +"].StartSymbol"));
				tierPrice.setTierEnd(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices["+ j +"].TierEnd"));
				tierPrice.setEndSymbol(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices["+ j +"].EndSymbol"));
				tierPrice.setTierType(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices["+ j +"].TierType"));
				tierPrice.setPriceType(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices["+ j +"].PriceType"));
				tierPrice.setPrice(context.stringValue("QueryPriceListResponse.Data.Modules["+ i +"].TierPrices["+ j +"].Price"));

				tierPrices.add(tierPrice);
			}
			module.setTierPrices(tierPrices);

			modules.add(module);
		}
		data.setModules(modules);
		queryPriceListResponse.setData(data);
	 
	 	return queryPriceListResponse;
	}
}