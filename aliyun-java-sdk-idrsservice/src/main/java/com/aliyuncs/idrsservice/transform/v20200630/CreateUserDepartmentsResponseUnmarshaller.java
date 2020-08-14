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

import com.aliyuncs.idrsservice.model.v20200630.CreateUserDepartmentsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserDepartmentsResponseUnmarshaller {

	public static CreateUserDepartmentsResponse unmarshall(CreateUserDepartmentsResponse createUserDepartmentsResponse, UnmarshallerContext _ctx) {
		
		createUserDepartmentsResponse.setRequestId(_ctx.stringValue("CreateUserDepartmentsResponse.RequestId"));
		createUserDepartmentsResponse.setCode(_ctx.stringValue("CreateUserDepartmentsResponse.Code"));
		createUserDepartmentsResponse.setData(_ctx.mapValue("CreateUserDepartmentsResponse.Data"));
		createUserDepartmentsResponse.setMessage(_ctx.stringValue("CreateUserDepartmentsResponse.Message"));
	 
	 	return createUserDepartmentsResponse;
	}
}