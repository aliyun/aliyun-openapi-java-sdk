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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.CreateDepartmentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDepartmentResponseUnmarshaller {

	public static CreateDepartmentResponse unmarshall(CreateDepartmentResponse createDepartmentResponse, UnmarshallerContext _ctx) {
		
		createDepartmentResponse.setRequestId(_ctx.stringValue("CreateDepartmentResponse.RequestId"));
		createDepartmentResponse.setSuccess(_ctx.booleanValue("CreateDepartmentResponse.Success"));
		createDepartmentResponse.setCode(_ctx.stringValue("CreateDepartmentResponse.Code"));
		createDepartmentResponse.setMessage(_ctx.stringValue("CreateDepartmentResponse.Message"));
		createDepartmentResponse.setHttpStatusCode(_ctx.integerValue("CreateDepartmentResponse.HttpStatusCode"));
		createDepartmentResponse.setData(_ctx.longValue("CreateDepartmentResponse.Data"));
	 
	 	return createDepartmentResponse;
	}
}