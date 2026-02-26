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

import com.aliyuncs.cd.model.v2021127.RemoveShopsFromGroupResponse;
import com.aliyuncs.cd.model.v2021127.RemoveShopsFromGroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveShopsFromGroupResponseUnmarshaller {

	public static RemoveShopsFromGroupResponse unmarshall(RemoveShopsFromGroupResponse removeShopsFromGroupResponse, UnmarshallerContext _ctx) {
		
		removeShopsFromGroupResponse.setRequestId(_ctx.stringValue("RemoveShopsFromGroupResponse.RequestId"));
		removeShopsFromGroupResponse.setSuccess(_ctx.booleanValue("RemoveShopsFromGroupResponse.Success"));
		removeShopsFromGroupResponse.setMessage(_ctx.stringValue("RemoveShopsFromGroupResponse.Message"));
		removeShopsFromGroupResponse.setCode(_ctx.stringValue("RemoveShopsFromGroupResponse.Code"));
		removeShopsFromGroupResponse.setHttpStatusCode(_ctx.integerValue("RemoveShopsFromGroupResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("RemoveShopsFromGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setShopId(_ctx.stringValue("RemoveShopsFromGroupResponse.Data["+ i +"].ShopId"));
			dataItem.setCode(_ctx.stringValue("RemoveShopsFromGroupResponse.Data["+ i +"].Code"));
			dataItem.setMessage(_ctx.stringValue("RemoveShopsFromGroupResponse.Data["+ i +"].Message"));

			data.add(dataItem);
		}
		removeShopsFromGroupResponse.setData(data);
	 
	 	return removeShopsFromGroupResponse;
	}
}