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

import com.aliyuncs.csas.model.v20230120.GetClientUserResponse;
import com.aliyuncs.csas.model.v20230120.GetClientUserResponse.Data;
import com.aliyuncs.csas.model.v20230120.GetClientUserResponse.Data.Department;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClientUserResponseUnmarshaller {

	public static GetClientUserResponse unmarshall(GetClientUserResponse getClientUserResponse, UnmarshallerContext _ctx) {
		
		getClientUserResponse.setRequestId(_ctx.stringValue("GetClientUserResponse.RequestId"));

		Data data = new Data();
		data.setId(_ctx.stringValue("GetClientUserResponse.Data.Id"));
		data.setIdpConfigId(_ctx.stringValue("GetClientUserResponse.Data.IdpConfigId"));
		data.setUsername(_ctx.stringValue("GetClientUserResponse.Data.Username"));
		data.setUserId(_ctx.stringValue("GetClientUserResponse.Data.UserId"));
		data.setDescription(_ctx.stringValue("GetClientUserResponse.Data.Description"));
		data.setEmail(_ctx.stringValue("GetClientUserResponse.Data.Email"));
		data.setMobileNumber(_ctx.stringValue("GetClientUserResponse.Data.MobileNumber"));
		data.setDepartmentId(_ctx.stringValue("GetClientUserResponse.Data.DepartmentId"));
		data.setStatus(_ctx.stringValue("GetClientUserResponse.Data.Status"));

		Department department = new Department();
		department.setId(_ctx.stringValue("GetClientUserResponse.Data.Department.Id"));
		department.setName(_ctx.stringValue("GetClientUserResponse.Data.Department.Name"));
		data.setDepartment(department);
		getClientUserResponse.setData(data);
	 
	 	return getClientUserResponse;
	}
}