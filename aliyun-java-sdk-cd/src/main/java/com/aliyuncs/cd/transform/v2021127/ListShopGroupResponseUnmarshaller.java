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

import com.aliyuncs.cd.model.v2021127.ListShopGroupResponse;
import com.aliyuncs.cd.model.v2021127.ListShopGroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListShopGroupResponseUnmarshaller {

	public static ListShopGroupResponse unmarshall(ListShopGroupResponse listShopGroupResponse, UnmarshallerContext _ctx) {
		
		listShopGroupResponse.setRequestId(_ctx.stringValue("ListShopGroupResponse.RequestId"));
		listShopGroupResponse.setSuccess(_ctx.booleanValue("ListShopGroupResponse.Success"));
		listShopGroupResponse.setMessage(_ctx.stringValue("ListShopGroupResponse.Message"));
		listShopGroupResponse.setCode(_ctx.stringValue("ListShopGroupResponse.Code"));
		listShopGroupResponse.setHttpStatusCode(_ctx.integerValue("ListShopGroupResponse.HttpStatusCode"));
		listShopGroupResponse.setTotalCount(_ctx.longValue("ListShopGroupResponse.TotalCount"));
		listShopGroupResponse.setPageNumber(_ctx.integerValue("ListShopGroupResponse.PageNumber"));
		listShopGroupResponse.setPageSize(_ctx.integerValue("ListShopGroupResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListShopGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setShopGroupId(_ctx.stringValue("ListShopGroupResponse.Data["+ i +"].ShopGroupId"));
			dataItem.setShopGroupName(_ctx.stringValue("ListShopGroupResponse.Data["+ i +"].ShopGroupName"));

			data.add(dataItem);
		}
		listShopGroupResponse.setData(data);
	 
	 	return listShopGroupResponse;
	}
}