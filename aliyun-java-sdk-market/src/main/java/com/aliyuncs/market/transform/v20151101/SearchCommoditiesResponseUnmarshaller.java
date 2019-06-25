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

package com.aliyuncs.market.transform.v20151101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market.model.v20151101.SearchCommoditiesResponse;
import com.aliyuncs.market.model.v20151101.SearchCommoditiesResponse.Data;
import com.aliyuncs.market.model.v20151101.SearchCommoditiesResponse.Data.Commodity;
import com.aliyuncs.market.model.v20151101.SearchCommoditiesResponse.Data.Pageable;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchCommoditiesResponseUnmarshaller {

	public static SearchCommoditiesResponse unmarshall(SearchCommoditiesResponse searchCommoditiesResponse, UnmarshallerContext context) {
		
		searchCommoditiesResponse.setRequestId(context.stringValue("SearchCommoditiesResponse.RequestId"));
		searchCommoditiesResponse.setSuccess(context.booleanValue("SearchCommoditiesResponse.Success"));

		Data data = new Data();
		data.setTotal(context.longValue("SearchCommoditiesResponse.Data.Total"));

		Pageable pageable = new Pageable();
		pageable.setPageIndex(context.integerValue("SearchCommoditiesResponse.Data.Pageable.PageIndex"));
		pageable.setPageSize(context.integerValue("SearchCommoditiesResponse.Data.Pageable.PageSize"));
		data.setPageable(pageable);

		List<Commodity> commodities = new ArrayList<Commodity>();
		for (int i = 0; i < context.lengthValue("SearchCommoditiesResponse.Data.Commodities.Length"); i++) {
			Commodity commodity = new Commodity();
			commodity.setCommodityId(context.stringValue("SearchCommoditiesResponse.Data.Commodities["+ i +"].CommodityId"));
			commodity.setProperties(context.stringValue("SearchCommoditiesResponse.Data.Commodities["+ i +"].Properties"));
			commodity.setCommoditySuggestedPrice(context.stringValue("SearchCommoditiesResponse.Data.Commodities["+ i +"].CommoditySuggestedPrice"));
			commodity.setCommodityScore(context.stringValue("SearchCommoditiesResponse.Data.Commodities["+ i +"].CommodityScore"));
			commodity.setSupplierId(context.stringValue("SearchCommoditiesResponse.Data.Commodities["+ i +"].SupplierId"));
			commodity.setSupplierName(context.stringValue("SearchCommoditiesResponse.Data.Commodities["+ i +"].SupplierName"));

			commodities.add(commodity);
		}
		data.setCommodities(commodities);
		searchCommoditiesResponse.setData(data);
	 
	 	return searchCommoditiesResponse;
	}
}