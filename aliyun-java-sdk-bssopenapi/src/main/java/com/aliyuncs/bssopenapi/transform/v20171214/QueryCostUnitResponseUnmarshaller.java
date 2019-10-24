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

import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResponse.Data.CostUnitDtoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCostUnitResponseUnmarshaller {

	public static QueryCostUnitResponse unmarshall(QueryCostUnitResponse queryCostUnitResponse, UnmarshallerContext _ctx) {
		
		queryCostUnitResponse.setRequestId(_ctx.stringValue("QueryCostUnitResponse.RequestId"));
		queryCostUnitResponse.setSuccess(_ctx.booleanValue("QueryCostUnitResponse.Success"));
		queryCostUnitResponse.setCode(_ctx.stringValue("QueryCostUnitResponse.Code"));
		queryCostUnitResponse.setMessage(_ctx.stringValue("QueryCostUnitResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryCostUnitResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryCostUnitResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryCostUnitResponse.Data.TotalCount"));

		List<CostUnitDtoListItem> costUnitDtoList = new ArrayList<CostUnitDtoListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCostUnitResponse.Data.CostUnitDtoList.Length"); i++) {
			CostUnitDtoListItem costUnitDtoListItem = new CostUnitDtoListItem();
			costUnitDtoListItem.setOwnerUid(_ctx.longValue("QueryCostUnitResponse.Data.CostUnitDtoList["+ i +"].OwnerUid"));
			costUnitDtoListItem.setParentUnitId(_ctx.longValue("QueryCostUnitResponse.Data.CostUnitDtoList["+ i +"].ParentUnitId"));
			costUnitDtoListItem.setUnitId(_ctx.longValue("QueryCostUnitResponse.Data.CostUnitDtoList["+ i +"].UnitId"));
			costUnitDtoListItem.setUnitName(_ctx.stringValue("QueryCostUnitResponse.Data.CostUnitDtoList["+ i +"].UnitName"));

			costUnitDtoList.add(costUnitDtoListItem);
		}
		data.setCostUnitDtoList(costUnitDtoList);
		queryCostUnitResponse.setData(data);
	 
	 	return queryCostUnitResponse;
	}
}