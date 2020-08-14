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

import com.aliyuncs.idrsservice.model.v20200630.CreateDepartmentResponse;
import com.aliyuncs.idrsservice.model.v20200630.CreateDepartmentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDepartmentResponseUnmarshaller {

	public static CreateDepartmentResponse unmarshall(CreateDepartmentResponse createDepartmentResponse, UnmarshallerContext _ctx) {
		
		createDepartmentResponse.setRequestId(_ctx.stringValue("CreateDepartmentResponse.RequestId"));
		createDepartmentResponse.setCode(_ctx.stringValue("CreateDepartmentResponse.Code"));
		createDepartmentResponse.setMessage(_ctx.stringValue("CreateDepartmentResponse.Message"));

		Data data = new Data();
		data.setCreatedAt(_ctx.stringValue("CreateDepartmentResponse.Data.CreatedAt"));
		data.setDescription(_ctx.stringValue("CreateDepartmentResponse.Data.Description"));
		data.setId(_ctx.stringValue("CreateDepartmentResponse.Data.Id"));
		data.setName(_ctx.stringValue("CreateDepartmentResponse.Data.Name"));
		createDepartmentResponse.setData(data);
	 
	 	return createDepartmentResponse;
	}
}