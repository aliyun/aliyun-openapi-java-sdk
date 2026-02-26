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

import com.aliyuncs.cd.model.v2021127.BatchCreateShopResponse;
import com.aliyuncs.cd.model.v2021127.BatchCreateShopResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateShopResponseUnmarshaller {

	public static BatchCreateShopResponse unmarshall(BatchCreateShopResponse batchCreateShopResponse, UnmarshallerContext _ctx) {
		
		batchCreateShopResponse.setRequestId(_ctx.stringValue("BatchCreateShopResponse.RequestId"));
		batchCreateShopResponse.setSuccess(_ctx.booleanValue("BatchCreateShopResponse.Success"));
		batchCreateShopResponse.setMessage(_ctx.stringValue("BatchCreateShopResponse.Message"));
		batchCreateShopResponse.setCode(_ctx.stringValue("BatchCreateShopResponse.Code"));
		batchCreateShopResponse.setHttpStatusCode(_ctx.integerValue("BatchCreateShopResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateShopResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setShopId(_ctx.stringValue("BatchCreateShopResponse.Data["+ i +"].ShopId"));
			dataItem.setCode(_ctx.stringValue("BatchCreateShopResponse.Data["+ i +"].Code"));
			dataItem.setMessage(_ctx.stringValue("BatchCreateShopResponse.Data["+ i +"].Message"));

			data.add(dataItem);
		}
		batchCreateShopResponse.setData(data);
	 
	 	return batchCreateShopResponse;
	}
}