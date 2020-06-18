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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyuncvc.model.v20190919.ListCommoditiesResponse;
import com.aliyuncs.aliyuncvc.model.v20190919.ListCommoditiesResponse.Data;
import com.aliyuncs.aliyuncvc.model.v20190919.ListCommoditiesResponse.Data.Commodity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommoditiesResponseUnmarshaller {

	public static ListCommoditiesResponse unmarshall(ListCommoditiesResponse listCommoditiesResponse, UnmarshallerContext _ctx) {
		
		listCommoditiesResponse.setRequestId(_ctx.stringValue("ListCommoditiesResponse.RequestId"));
		listCommoditiesResponse.setErrorCode(_ctx.integerValue("ListCommoditiesResponse.ErrorCode"));
		listCommoditiesResponse.setMessage(_ctx.stringValue("ListCommoditiesResponse.Message"));
		listCommoditiesResponse.setSuccess(_ctx.booleanValue("ListCommoditiesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListCommoditiesResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListCommoditiesResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("ListCommoditiesResponse.Data.PageNumber"));

		List<Commodity> commodities = new ArrayList<Commodity>();
		for (int i = 0; i < _ctx.lengthValue("ListCommoditiesResponse.Data.Commodities.Length"); i++) {
			Commodity commodity = new Commodity();
			commodity.setEndTime(_ctx.stringValue("ListCommoditiesResponse.Data.Commodities["+ i +"].EndTime"));
			commodity.setInstancepropertyvalue(_ctx.stringValue("ListCommoditiesResponse.Data.Commodities["+ i +"].Instancepropertyvalue"));
			commodity.setStartTime(_ctx.stringValue("ListCommoditiesResponse.Data.Commodities["+ i +"].StartTime"));

			commodities.add(commodity);
		}
		data.setCommodities(commodities);
		listCommoditiesResponse.setData(data);
	 
	 	return listCommoditiesResponse;
	}
}