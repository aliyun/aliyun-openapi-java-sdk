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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.CreateUserResponse;
import com.aliyuncs.unimkt.model.v20181212.CreateUserResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserResponseUnmarshaller {

	public static CreateUserResponse unmarshall(CreateUserResponse createUserResponse, UnmarshallerContext _ctx) {
		
		createUserResponse.setRequestId(_ctx.stringValue("CreateUserResponse.RequestId"));
		createUserResponse.setCode(_ctx.stringValue("CreateUserResponse.Code"));
		createUserResponse.setSuccess(_ctx.booleanValue("CreateUserResponse.Success"));
		createUserResponse.setMessage(_ctx.stringValue("CreateUserResponse.Message"));

		Model model = new Model();
		model.setSspUserId(_ctx.stringValue("CreateUserResponse.Model.SspUserId"));
		model.setGmtCreateTime(_ctx.longValue("CreateUserResponse.Model.GmtCreateTime"));
		model.setGmtModifiedTime(_ctx.longValue("CreateUserResponse.Model.GmtModifiedTime"));
		model.setIsDeleteTag(_ctx.stringValue("CreateUserResponse.Model.IsDeleteTag"));
		model.setUserName(_ctx.stringValue("CreateUserResponse.Model.UserName"));
		model.setYunUid(_ctx.stringValue("CreateUserResponse.Model.YunUid"));
		model.setYunPersonsId(_ctx.stringValue("CreateUserResponse.Model.YunPersonsId"));
		model.setMobilePhone(_ctx.stringValue("CreateUserResponse.Model.MobilePhone"));
		model.setEmail(_ctx.stringValue("CreateUserResponse.Model.Email"));
		model.setStatus(_ctx.stringValue("CreateUserResponse.Model.Status"));
		model.setTenantId(_ctx.stringValue("CreateUserResponse.Model.TenantId"));
		model.setTenantUserId(_ctx.stringValue("CreateUserResponse.Model.TenantUserId"));
		model.setRoleCode(_ctx.stringValue("CreateUserResponse.Model.RoleCode"));
		createUserResponse.setModel(model);
	 
	 	return createUserResponse;
	}
}