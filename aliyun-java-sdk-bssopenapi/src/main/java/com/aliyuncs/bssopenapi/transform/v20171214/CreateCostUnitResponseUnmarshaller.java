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

import com.aliyuncs.bssopenapi.model.v20171214.CreateCostUnitResponse;
import com.aliyuncs.bssopenapi.model.v20171214.CreateCostUnitResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.CreateCostUnitResponse.Data.CostUnitDtoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCostUnitResponseUnmarshaller {

	public static CreateCostUnitResponse unmarshall(CreateCostUnitResponse createCostUnitResponse, UnmarshallerContext _ctx) {
		
		createCostUnitResponse.setRequestId(_ctx.stringValue("CreateCostUnitResponse.RequestId"));
		createCostUnitResponse.setMessage(_ctx.stringValue("CreateCostUnitResponse.Message"));
		createCostUnitResponse.setCode(_ctx.stringValue("CreateCostUnitResponse.Code"));
		createCostUnitResponse.setSuccess(_ctx.booleanValue("CreateCostUnitResponse.Success"));

		Data data = new Data();

		List<CostUnitDtoListItem> costUnitDtoList = new ArrayList<CostUnitDtoListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateCostUnitResponse.Data.CostUnitDtoList.Length"); i++) {
			CostUnitDtoListItem costUnitDtoListItem = new CostUnitDtoListItem();
			costUnitDtoListItem.setUnitId(_ctx.longValue("CreateCostUnitResponse.Data.CostUnitDtoList["+ i +"].UnitId"));
			costUnitDtoListItem.setParentUnitId(_ctx.longValue("CreateCostUnitResponse.Data.CostUnitDtoList["+ i +"].ParentUnitId"));
			costUnitDtoListItem.setOwnerUid(_ctx.longValue("CreateCostUnitResponse.Data.CostUnitDtoList["+ i +"].OwnerUid"));
			costUnitDtoListItem.setUnitName(_ctx.stringValue("CreateCostUnitResponse.Data.CostUnitDtoList["+ i +"].UnitName"));

			costUnitDtoList.add(costUnitDtoListItem);
		}
		data.setCostUnitDtoList(costUnitDtoList);
		createCostUnitResponse.setData(data);
	 
	 	return createCostUnitResponse;
	}
}