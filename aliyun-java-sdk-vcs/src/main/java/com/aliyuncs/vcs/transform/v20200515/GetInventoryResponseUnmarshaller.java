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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetInventoryResponse;
import com.aliyuncs.vcs.model.v20200515.GetInventoryResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetInventoryResponse.Data.ResultObjectItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInventoryResponseUnmarshaller {

	public static GetInventoryResponse unmarshall(GetInventoryResponse getInventoryResponse, UnmarshallerContext _ctx) {
		
		getInventoryResponse.setSuccess(_ctx.booleanValue("GetInventoryResponse.Success"));

		Data data = new Data();

		List<ResultObjectItem> resultObject = new ArrayList<ResultObjectItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInventoryResponse.Data.ResultObject.Length"); i++) {
			ResultObjectItem resultObjectItem = new ResultObjectItem();
			resultObjectItem.setBuyerId(_ctx.stringValue("GetInventoryResponse.Data.ResultObject["+ i +"].BuyerId"));
			resultObjectItem.setCommodityCode(_ctx.stringValue("GetInventoryResponse.Data.ResultObject["+ i +"].CommodityCode"));
			resultObjectItem.setCurrentInventory(_ctx.stringValue("GetInventoryResponse.Data.ResultObject["+ i +"].CurrentInventory"));
			resultObjectItem.setValidEndTime(_ctx.stringValue("GetInventoryResponse.Data.ResultObject["+ i +"].ValidEndTime"));
			resultObjectItem.setValidStartTime(_ctx.stringValue("GetInventoryResponse.Data.ResultObject["+ i +"].ValidStartTime"));
			resultObjectItem.setInstanceId(_ctx.stringValue("GetInventoryResponse.Data.ResultObject["+ i +"].InstanceId"));
			resultObjectItem.setInventoryId(_ctx.stringValue("GetInventoryResponse.Data.ResultObject["+ i +"].InventoryId"));

			resultObject.add(resultObjectItem);
		}
		data.setResultObject(resultObject);
		getInventoryResponse.setData(data);
	 
	 	return getInventoryResponse;
	}
}