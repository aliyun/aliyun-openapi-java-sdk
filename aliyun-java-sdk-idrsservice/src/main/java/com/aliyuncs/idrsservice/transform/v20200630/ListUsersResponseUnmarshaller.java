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

import com.aliyuncs.idrsservice.model.v20200630.ListUsersResponse;
import com.aliyuncs.idrsservice.model.v20200630.ListUsersResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.ListUsersResponse.Data.ItemsItem;
import com.aliyuncs.idrsservice.model.v20200630.ListUsersResponse.Data.ItemsItem.DepartmentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsersResponseUnmarshaller {

	public static ListUsersResponse unmarshall(ListUsersResponse listUsersResponse, UnmarshallerContext _ctx) {
		
		listUsersResponse.setRequestId(_ctx.stringValue("ListUsersResponse.RequestId"));
		listUsersResponse.setCode(_ctx.stringValue("ListUsersResponse.Code"));
		listUsersResponse.setMessage(_ctx.stringValue("ListUsersResponse.Message"));

		Data data = new Data();
		data.setTotalElements(_ctx.longValue("ListUsersResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("ListUsersResponse.Data.TotalPages"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUsersResponse.Data.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCreatedAt(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].CreatedAt"));
			itemsItem.setEmail(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Email"));
			itemsItem.setId(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Name"));
			itemsItem.setPhoneNumber(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].PhoneNumber"));
			itemsItem.setRamUsername(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].RamUsername"));
			itemsItem.setRole(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Role"));
			itemsItem.setSource(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Source"));
			itemsItem.setUpdatedAt(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].UpdatedAt"));
			itemsItem.setUsername(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Username"));

			List<DepartmentsItem> departments = new ArrayList<DepartmentsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUsersResponse.Data.Items["+ i +"].Departments.Length"); j++) {
				DepartmentsItem departmentsItem = new DepartmentsItem();
				departmentsItem.setCreatedAt(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Departments["+ j +"].CreatedAt"));
				departmentsItem.setDescription(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Departments["+ j +"].Description"));
				departmentsItem.setId(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Departments["+ j +"].Id"));
				departmentsItem.setName(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Departments["+ j +"].Name"));
				departmentsItem.setUpdatedAt(_ctx.stringValue("ListUsersResponse.Data.Items["+ i +"].Departments["+ j +"].UpdatedAt"));

				departments.add(departmentsItem);
			}
			itemsItem.setDepartments(departments);

			items.add(itemsItem);
		}
		data.setItems(items);
		listUsersResponse.setData(data);
	 
	 	return listUsersResponse;
	}
}