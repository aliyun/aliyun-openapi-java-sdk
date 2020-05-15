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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetSubAccountInfoResponse;
import com.aliyuncs.edas.model.v20170801.GetSubAccountInfoResponse.Authorization;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubAccountInfoResponseUnmarshaller {

	public static GetSubAccountInfoResponse unmarshall(GetSubAccountInfoResponse getSubAccountInfoResponse, UnmarshallerContext _ctx) {
		
		getSubAccountInfoResponse.setRequestId(_ctx.stringValue("GetSubAccountInfoResponse.RequestId"));
		getSubAccountInfoResponse.setCode(_ctx.integerValue("GetSubAccountInfoResponse.Code"));
		getSubAccountInfoResponse.setMessage(_ctx.stringValue("GetSubAccountInfoResponse.Message"));

		Authorization authorization = new Authorization();
		authorization.setAdminUserId(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.AdminUserId"));
		authorization.setAdminEdasId(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.AdminEdasId"));
		authorization.setUserId(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.UserId"));
		authorization.setEdasId(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.EdasId"));
		authorization.setAppIdData(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.AppIdData"));
		authorization.setRoleIdData(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.RoleIdData"));
		authorization.setCreateTime(_ctx.longValue("GetSubAccountInfoResponse.Authorization.CreateTime"));
		authorization.setUpdateTime(_ctx.longValue("GetSubAccountInfoResponse.Authorization.UpdateTime"));
		authorization.setResGroupId(_ctx.longValue("GetSubAccountInfoResponse.Authorization.ResGroupId"));
		authorization.setResGroupIdData(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.ResGroupIdData"));
		authorization.setIsRamSlave(_ctx.booleanValue("GetSubAccountInfoResponse.Authorization.IsRamSlave"));
		authorization.setIsRamDel(_ctx.booleanValue("GetSubAccountInfoResponse.Authorization.IsRamDel"));
		authorization.setSubUserKp(_ctx.stringValue("GetSubAccountInfoResponse.Authorization.SubUserKp"));
		authorization.setRamOperation(_ctx.booleanValue("GetSubAccountInfoResponse.Authorization.RamOperation"));
		authorization.setDelegateAdmin(_ctx.booleanValue("GetSubAccountInfoResponse.Authorization.DelegateAdmin"));
		authorization.setSts(_ctx.booleanValue("GetSubAccountInfoResponse.Authorization.Sts"));
		getSubAccountInfoResponse.setAuthorization(authorization);
	 
	 	return getSubAccountInfoResponse;
	}
}