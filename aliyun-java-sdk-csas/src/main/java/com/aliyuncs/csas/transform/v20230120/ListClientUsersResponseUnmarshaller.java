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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListClientUsersResponse;
import com.aliyuncs.csas.model.v20230120.ListClientUsersResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListClientUsersResponse.Data.DataListItem;
import com.aliyuncs.csas.model.v20230120.ListClientUsersResponse.Data.DataListItem.Department;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClientUsersResponseUnmarshaller {

	public static ListClientUsersResponse unmarshall(ListClientUsersResponse listClientUsersResponse, UnmarshallerContext _ctx) {
		
		listClientUsersResponse.setRequestId(_ctx.stringValue("ListClientUsersResponse.RequestId"));

		Data data = new Data();
		data.setTotalNum(_ctx.longValue("ListClientUsersResponse.Data.TotalNum"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClientUsersResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setId(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].Id"));
			dataListItem.setIdpConfigId(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].IdpConfigId"));
			dataListItem.setUsername(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].Username"));
			dataListItem.setUserId(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].UserId"));
			dataListItem.setDescription(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].Description"));
			dataListItem.setEmail(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].Email"));
			dataListItem.setMobileNumber(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].MobileNumber"));
			dataListItem.setDepartmentId(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].DepartmentId"));
			dataListItem.setStatus(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].Status"));

			Department department = new Department();
			department.setId(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].Department.Id"));
			department.setName(_ctx.stringValue("ListClientUsersResponse.Data.DataList["+ i +"].Department.Name"));
			dataListItem.setDepartment(department);

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listClientUsersResponse.setData(data);
	 
	 	return listClientUsersResponse;
	}
}