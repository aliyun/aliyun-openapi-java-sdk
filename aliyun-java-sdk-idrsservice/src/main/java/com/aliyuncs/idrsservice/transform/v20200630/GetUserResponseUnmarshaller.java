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

import com.aliyuncs.idrsservice.model.v20200630.GetUserResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetUserResponse.Data;
import com.aliyuncs.idrsservice.model.v20200630.GetUserResponse.Data.DepartmentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setCode(_ctx.stringValue("GetUserResponse.Code"));
		getUserResponse.setMessage(_ctx.stringValue("GetUserResponse.Message"));

		Data data = new Data();
		data.setCreatedAt(_ctx.stringValue("GetUserResponse.Data.CreatedAt"));
		data.setEmail(_ctx.stringValue("GetUserResponse.Data.Email"));
		data.setId(_ctx.stringValue("GetUserResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetUserResponse.Data.Name"));
		data.setPhoneNumber(_ctx.stringValue("GetUserResponse.Data.PhoneNumber"));
		data.setRole(_ctx.stringValue("GetUserResponse.Data.Role"));
		data.setSource(_ctx.stringValue("GetUserResponse.Data.Source"));
		data.setUpdatedAt(_ctx.stringValue("GetUserResponse.Data.UpdatedAt"));
		data.setUsername(_ctx.stringValue("GetUserResponse.Data.Username"));

		List<DepartmentsItem> departments = new ArrayList<DepartmentsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserResponse.Data.Departments.Length"); i++) {
			DepartmentsItem departmentsItem = new DepartmentsItem();
			departmentsItem.setDescription(_ctx.stringValue("GetUserResponse.Data.Departments["+ i +"].Description"));
			departmentsItem.setGmtCreate(_ctx.stringValue("GetUserResponse.Data.Departments["+ i +"].GmtCreate"));
			departmentsItem.setGmtModified(_ctx.stringValue("GetUserResponse.Data.Departments["+ i +"].GmtModified"));
			departmentsItem.setId(_ctx.stringValue("GetUserResponse.Data.Departments["+ i +"].Id"));
			departmentsItem.setName(_ctx.stringValue("GetUserResponse.Data.Departments["+ i +"].Name"));

			departments.add(departmentsItem);
		}
		data.setDepartments(departments);
		getUserResponse.setData(data);
	 
	 	return getUserResponse;
	}
}