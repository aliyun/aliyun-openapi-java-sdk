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

import com.aliyuncs.idrsservice.model.v20200630.ListDepartmentsResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListDepartmentsResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListDepartmentsResponse.Data.ItemsItem;
import com.aliyuncs.idrsservice.model.v20200630.ListDepartmentsResponse.Data.ItemsItem.AdministratorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDepartmentsResponseUnmarshaller {

	public static ListDepartmentsResponse unmarshall(ListDepartmentsResponse listDepartmentsResponse, UnmarshallerContext _ctx) {
		
		listDepartmentsResponse.setRequestId(_ctx.stringValue("ListDepartmentsResponse.RequestId"));
		listDepartmentsResponse.setCode(_ctx.stringValue("ListDepartmentsResponse.Code"));
		listDepartmentsResponse.setMessage(_ctx.stringValue("ListDepartmentsResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListDepartmentsResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListDepartmentsResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDepartmentsResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCreatedAt(_ctx.stringValue("ListDepartmentsResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setDescription(_ctx.stringValue("ListDepartmentsResponse.Data.Items["+ i +"].Description"));
			itemsItem.setId(_ctx.stringValue("ListDepartmentsResponse.Data.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("ListDepartmentsResponse.Data.Items["+ i +"].Name"));
			itemsItem.setUpdatedAt(_ctx.stringValue("ListDepartmentsResponse.Data.Items["+ i +"].UpdatedAt"));

			List<AdministratorsItem> administrators = new ArrayList<AdministratorsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDepartmentsResponse.Data.Items["+ i +"].Administrators.Length"); j++) {
				AdministratorsItem administratorsItem = new AdministratorsItem();
				administratorsItem.setId(_ctx.stringValue("ListDepartmentsResponse.Data.Items["+ i +"].Administrators["+ j +"].Id"));
				administratorsItem.setName(_ctx.stringValue("ListDepartmentsResponse.Data.Items["+ i +"].Administrators["+ j +"].Name"));

				administrators.add(administratorsItem);
			}
			itemsItem.setAdministrators(administrators);

			items.add(itemsItem);
		}
		data.setItems(items);
		listDepartmentsResponse.setData(data);
	 
	 	return listDepartmentsResponse;
	}
}