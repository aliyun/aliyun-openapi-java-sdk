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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.CreateRoleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRoleResponseUnmarshaller {

	public static CreateRoleResponse unmarshall(CreateRoleResponse createRoleResponse, UnmarshallerContext _ctx) {
		
		createRoleResponse.setRequestId(_ctx.stringValue("CreateRoleResponse.RequestId"));
		createRoleResponse.setMessage(_ctx.stringValue("CreateRoleResponse.Message"));
		createRoleResponse.setHttpStatusCode(_ctx.longValue("CreateRoleResponse.HttpStatusCode"));
		createRoleResponse.setData(_ctx.longValue("CreateRoleResponse.Data"));
		createRoleResponse.setCode(_ctx.stringValue("CreateRoleResponse.Code"));
		createRoleResponse.setSuccess(_ctx.booleanValue("CreateRoleResponse.Success"));
	 
	 	return createRoleResponse;
	}
}