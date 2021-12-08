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

import com.aliyuncs.unimkt.model.v20181212.QueryUserResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryUserResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserResponseUnmarshaller {

	public static QueryUserResponse unmarshall(QueryUserResponse queryUserResponse, UnmarshallerContext _ctx) {
		
		queryUserResponse.setRequestId(_ctx.stringValue("QueryUserResponse.RequestId"));
		queryUserResponse.setCode(_ctx.stringValue("QueryUserResponse.Code"));
		queryUserResponse.setMessage(_ctx.stringValue("QueryUserResponse.Message"));
		queryUserResponse.setSuccess(_ctx.booleanValue("QueryUserResponse.Success"));

		Model model = new Model();
		model.setStatus(_ctx.stringValue("QueryUserResponse.Model.Status"));
		model.setYunPersonsId(_ctx.stringValue("QueryUserResponse.Model.YunPersonsId"));
		model.setSspUserId(_ctx.stringValue("QueryUserResponse.Model.SspUserId"));
		model.setTenantUserId(_ctx.stringValue("QueryUserResponse.Model.TenantUserId"));
		model.setMobilePhone(_ctx.stringValue("QueryUserResponse.Model.MobilePhone"));
		model.setRoleCode(_ctx.stringValue("QueryUserResponse.Model.RoleCode"));
		model.setGmtModifiedTime(_ctx.longValue("QueryUserResponse.Model.GmtModifiedTime"));
		model.setGmtCreateTime(_ctx.longValue("QueryUserResponse.Model.GmtCreateTime"));
		model.setEmail(_ctx.stringValue("QueryUserResponse.Model.Email"));
		model.setUserName(_ctx.stringValue("QueryUserResponse.Model.UserName"));
		model.setYunUid(_ctx.stringValue("QueryUserResponse.Model.YunUid"));
		model.setIsDeleteTag(_ctx.stringValue("QueryUserResponse.Model.IsDeleteTag"));
		model.setTenantId(_ctx.stringValue("QueryUserResponse.Model.TenantId"));
		queryUserResponse.setModel(model);
	 
	 	return queryUserResponse;
	}
}