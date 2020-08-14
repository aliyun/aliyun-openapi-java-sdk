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

import com.aliyuncs.idrsservice.model.v20200630.DeleteUserDepartmentsResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteUserDepartmentsResponseUnmarshaller {

	public static DeleteUserDepartmentsResponse unmarshall(DeleteUserDepartmentsResponse deleteUserDepartmentsResponse, UnmarshallerContext _ctx) {
		
		deleteUserDepartmentsResponse.setRequestId(_ctx.stringValue("DeleteUserDepartmentsResponse.RequestId"));
		deleteUserDepartmentsResponse.setCode(_ctx.stringValue("DeleteUserDepartmentsResponse.Code"));
		deleteUserDepartmentsResponse.setData(_ctx.mapValue("DeleteUserDepartmentsResponse.Data"));
		deleteUserDepartmentsResponse.setMessage(_ctx.stringValue("DeleteUserDepartmentsResponse.Message"));
	 
	 	return deleteUserDepartmentsResponse;
	}
}