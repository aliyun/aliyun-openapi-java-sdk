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

import com.aliyuncs.cd.model.v2021127.AddShopsToGroupResponse;
import com.aliyuncs.cd.model.v2021127.AddShopsToGroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddShopsToGroupResponseUnmarshaller {

	public static AddShopsToGroupResponse unmarshall(AddShopsToGroupResponse addShopsToGroupResponse, UnmarshallerContext _ctx) {
		
		addShopsToGroupResponse.setRequestId(_ctx.stringValue("AddShopsToGroupResponse.RequestId"));
		addShopsToGroupResponse.setSuccess(_ctx.booleanValue("AddShopsToGroupResponse.Success"));
		addShopsToGroupResponse.setMessage(_ctx.stringValue("AddShopsToGroupResponse.Message"));
		addShopsToGroupResponse.setCode(_ctx.stringValue("AddShopsToGroupResponse.Code"));
		addShopsToGroupResponse.setHttpStatusCode(_ctx.integerValue("AddShopsToGroupResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("AddShopsToGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setShopId(_ctx.stringValue("AddShopsToGroupResponse.Data["+ i +"].ShopId"));
			dataItem.setCode(_ctx.stringValue("AddShopsToGroupResponse.Data["+ i +"].Code"));
			dataItem.setMessage(_ctx.stringValue("AddShopsToGroupResponse.Data["+ i +"].Message"));

			data.add(dataItem);
		}
		addShopsToGroupResponse.setData(data);
	 
	 	return addShopsToGroupResponse;
	}
}