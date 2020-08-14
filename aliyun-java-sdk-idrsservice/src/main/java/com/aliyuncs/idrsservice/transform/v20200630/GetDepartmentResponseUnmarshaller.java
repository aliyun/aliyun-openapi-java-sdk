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

import com.aliyuncs.idrsservice.model.v20200630.GetDepartmentResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetDepartmentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDepartmentResponseUnmarshaller {

	public static GetDepartmentResponse unmarshall(GetDepartmentResponse getDepartmentResponse, UnmarshallerContext _ctx) {
		
		getDepartmentResponse.setRequestId(_ctx.stringValue("GetDepartmentResponse.RequestId"));
		getDepartmentResponse.setCode(_ctx.stringValue("GetDepartmentResponse.Code"));
		getDepartmentResponse.setMessage(_ctx.stringValue("GetDepartmentResponse.Message"));

		Data data = new Data();
		data.setCreatedAt(_ctx.stringValue("GetDepartmentResponse.Data.CreatedAt"));
		data.setDescription(_ctx.stringValue("GetDepartmentResponse.Data.Description"));
		data.setId(_ctx.stringValue("GetDepartmentResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetDepartmentResponse.Data.Name"));
		data.setUpdatedAt(_ctx.stringValue("GetDepartmentResponse.Data.UpdatedAt"));
		getDepartmentResponse.setData(data);
	 
	 	return getDepartmentResponse;
	}
}