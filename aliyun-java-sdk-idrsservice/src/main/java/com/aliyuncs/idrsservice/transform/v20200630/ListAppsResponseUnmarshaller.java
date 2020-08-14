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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.ListAppsResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListAppsResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListAppsResponse.Data.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext _ctx) {
		
		listAppsResponse.setRequestId(_ctx.stringValue("ListAppsResponse.RequestId"));
		listAppsResponse.setCode(_ctx.stringValue("ListAppsResponse.Code"));
		listAppsResponse.setMessage(_ctx.stringValue("ListAppsResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListAppsResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListAppsResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppsResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCreatedAt(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setDepartmentId(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].DepartmentId"));
			itemsItem.setDepartmentName(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].DepartmentName"));
			itemsItem.setDisabled(_ctx.booleanValue("ListAppsResponse.Data.Items["+ i +"].Disabled"));
			itemsItem.setId(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].Name"));
			itemsItem.setPackageName(_ctx.stringValue("ListAppsResponse.Data.Items["+ i +"].PackageName"));

			items.add(itemsItem);
		}
		data.setItems(items);
		listAppsResponse.setData(data);
	 
	 	return listAppsResponse;
	}
}