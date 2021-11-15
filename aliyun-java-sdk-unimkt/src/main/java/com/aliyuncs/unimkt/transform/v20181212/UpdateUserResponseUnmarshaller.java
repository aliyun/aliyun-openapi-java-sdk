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

import com.aliyuncs.unimkt.model.v20181212.UpdateUserResponse;
import com.aliyuncs.unimkt.model.v20181212.UpdateUserResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserResponseUnmarshaller {

	public static UpdateUserResponse unmarshall(UpdateUserResponse updateUserResponse, UnmarshallerContext _ctx) {
		
		updateUserResponse.setRequestId(_ctx.stringValue("UpdateUserResponse.RequestId"));
		updateUserResponse.setCode(_ctx.stringValue("UpdateUserResponse.Code"));
		updateUserResponse.setSuccess(_ctx.booleanValue("UpdateUserResponse.Success"));
		updateUserResponse.setMessage(_ctx.stringValue("UpdateUserResponse.Message"));

		Model model = new Model();
		model.setSspUserId(_ctx.stringValue("UpdateUserResponse.Model.SspUserId"));
		model.setGmtCreateTime(_ctx.longValue("UpdateUserResponse.Model.GmtCreateTime"));
		model.setGmtModifiedTime(_ctx.longValue("UpdateUserResponse.Model.GmtModifiedTime"));
		model.setIsDeleteTag(_ctx.stringValue("UpdateUserResponse.Model.IsDeleteTag"));
		model.setUserName(_ctx.stringValue("UpdateUserResponse.Model.UserName"));
		model.setYunUid(_ctx.stringValue("UpdateUserResponse.Model.YunUid"));
		model.setYunPersonsId(_ctx.stringValue("UpdateUserResponse.Model.YunPersonsId"));
		model.setMobilePhone(_ctx.stringValue("UpdateUserResponse.Model.MobilePhone"));
		model.setEmail(_ctx.stringValue("UpdateUserResponse.Model.Email"));
		model.setStatus(_ctx.stringValue("UpdateUserResponse.Model.Status"));
		model.setTenantId(_ctx.stringValue("UpdateUserResponse.Model.TenantId"));
		model.setTenantUserId(_ctx.stringValue("UpdateUserResponse.Model.TenantUserId"));
		model.setRoleCode(_ctx.stringValue("UpdateUserResponse.Model.RoleCode"));
		updateUserResponse.setModel(model);
	 
	 	return updateUserResponse;
	}
}