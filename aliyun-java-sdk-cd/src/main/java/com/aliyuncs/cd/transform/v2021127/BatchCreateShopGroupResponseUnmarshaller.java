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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.BatchCreateShopGroupResponse;
import com.aliyuncs.cd.model.v2021127.BatchCreateShopGroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateShopGroupResponseUnmarshaller {

	public static BatchCreateShopGroupResponse unmarshall(BatchCreateShopGroupResponse batchCreateShopGroupResponse, UnmarshallerContext _ctx) {
		
		batchCreateShopGroupResponse.setRequestId(_ctx.stringValue("BatchCreateShopGroupResponse.RequestId"));
		batchCreateShopGroupResponse.setSuccess(_ctx.booleanValue("BatchCreateShopGroupResponse.Success"));
		batchCreateShopGroupResponse.setMessage(_ctx.stringValue("BatchCreateShopGroupResponse.Message"));
		batchCreateShopGroupResponse.setCode(_ctx.stringValue("BatchCreateShopGroupResponse.Code"));
		batchCreateShopGroupResponse.setHttpStatusCode(_ctx.integerValue("BatchCreateShopGroupResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateShopGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setShopGroupId(_ctx.stringValue("BatchCreateShopGroupResponse.Data["+ i +"].ShopGroupId"));
			dataItem.setCode(_ctx.stringValue("BatchCreateShopGroupResponse.Data["+ i +"].Code"));
			dataItem.setMessage(_ctx.stringValue("BatchCreateShopGroupResponse.Data["+ i +"].Message"));

			data.add(dataItem);
		}
		batchCreateShopGroupResponse.setData(data);
	 
	 	return batchCreateShopGroupResponse;
	}
}