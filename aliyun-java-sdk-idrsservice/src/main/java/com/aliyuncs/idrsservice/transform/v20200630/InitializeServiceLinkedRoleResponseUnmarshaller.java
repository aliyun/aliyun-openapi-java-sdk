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

import com.aliyuncs.idrsservice.model.v20200630.InitializeServiceLinkedRoleResponse;
import com.aliyuncs.idrsservice.model.v20200630.InitializeServiceLinkedRoleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitializeServiceLinkedRoleResponseUnmarshaller {

	public static InitializeServiceLinkedRoleResponse unmarshall(InitializeServiceLinkedRoleResponse initializeServiceLinkedRoleResponse, UnmarshallerContext _ctx) {
		
		initializeServiceLinkedRoleResponse.setRequestId(_ctx.stringValue("InitializeServiceLinkedRoleResponse.RequestId"));
		initializeServiceLinkedRoleResponse.setCode(_ctx.stringValue("InitializeServiceLinkedRoleResponse.Code"));
		initializeServiceLinkedRoleResponse.setMessage(_ctx.stringValue("InitializeServiceLinkedRoleResponse.Message"));

		Data data = new Data();
		data.setCreateSuccess(_ctx.booleanValue("InitializeServiceLinkedRoleResponse.Data.CreateSuccess"));
		data.setErrorMessage(_ctx.stringValue("InitializeServiceLinkedRoleResponse.Data.ErrorMessage"));
		initializeServiceLinkedRoleResponse.setData(data);
	 
	 	return initializeServiceLinkedRoleResponse;
	}
}