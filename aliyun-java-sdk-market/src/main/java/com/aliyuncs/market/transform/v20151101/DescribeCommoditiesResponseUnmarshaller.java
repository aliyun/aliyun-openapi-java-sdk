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

import com.aliyuncs.market.model.v20151101.DescribeCommoditiesResponse;
import com.aliyuncs.market.model.v20151101.DescribeCommoditiesResponse.Data;
import com.aliyuncs.market.model.v20151101.DescribeCommoditiesResponse.Data.Commodity;
import com.aliyuncs.market.model.v20151101.DescribeCommoditiesResponse.Data.Pageable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCommoditiesResponseUnmarshaller {

	public static DescribeCommoditiesResponse unmarshall(DescribeCommoditiesResponse describeCommoditiesResponse, UnmarshallerContext _ctx) {
		
		describeCommoditiesResponse.setRequestId(_ctx.stringValue("DescribeCommoditiesResponse.RequestId"));
		describeCommoditiesResponse.setSuccess(_ctx.booleanValue("DescribeCommoditiesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeCommoditiesResponse.Data.TotalCount"));

		Pageable pageable = new Pageable();
		pageable.setPageNumber(_ctx.integerValue("DescribeCommoditiesResponse.Data.Pageable.PageNumber"));
		pageable.setPageSize(_ctx.integerValue("DescribeCommoditiesResponse.Data.Pageable.PageSize"));
		data.setPageable(pageable);

		List<Commodity> commodities = new ArrayList<Commodity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCommoditiesResponse.Data.Commodities.Length"); i++) {
			Commodity commodity = new Commodity();
			commodity.setCommodityId(_ctx.stringValue("DescribeCommoditiesResponse.Data.Commodities["+ i +"].CommodityId"));
			commodity.setProperties(_ctx.stringValue("DescribeCommoditiesResponse.Data.Commodities["+ i +"].Properties"));
			commodity.setApplicationId(_ctx.stringValue("DescribeCommoditiesResponse.Data.Commodities["+ i +"].ApplicationId"));

			commodities.add(commodity);
		}
		data.setCommodities(commodities);
		describeCommoditiesResponse.setData(data);
	 
	 	return describeCommoditiesResponse;
	}
}