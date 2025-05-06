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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.GetTntUserRoleResponse;
import com.aliyuncs.itag.model.v20210517.GetTntUserRoleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTntUserRoleResponseUnmarshaller {

	public static GetTntUserRoleResponse unmarshall(GetTntUserRoleResponse getTntUserRoleResponse, UnmarshallerContext _ctx) {
		
		getTntUserRoleResponse.setRequestId(_ctx.stringValue("GetTntUserRoleResponse.RequestId"));
		getTntUserRoleResponse.setCode(_ctx.stringValue("GetTntUserRoleResponse.Code"));
		getTntUserRoleResponse.setErrInfo(_ctx.stringValue("GetTntUserRoleResponse.ErrInfo"));
		getTntUserRoleResponse.setMsg(_ctx.stringValue("GetTntUserRoleResponse.Msg"));
		getTntUserRoleResponse.setSucc(_ctx.booleanValue("GetTntUserRoleResponse.Succ"));
		getTntUserRoleResponse.setErrorCode(_ctx.stringValue("GetTntUserRoleResponse.ErrorCode"));

		Result result = new Result();
		result.setRole(_ctx.stringValue("GetTntUserRoleResponse.Result.Role"));
		result.setSelf(_ctx.booleanValue("GetTntUserRoleResponse.Result.Self"));
		result.setTntInstId(_ctx.stringValue("GetTntUserRoleResponse.Result.TntInstId"));
		result.setEmail(_ctx.stringValue("GetTntUserRoleResponse.Result.Email"));
		result.setPhone(_ctx.stringValue("GetTntUserRoleResponse.Result.Phone"));
		result.setSupplierId(_ctx.stringValue("GetTntUserRoleResponse.Result.SupplierId"));
		result.setOrg(_ctx.stringValue("GetTntUserRoleResponse.Result.Org"));
		result.setRefUserId(_ctx.stringValue("GetTntUserRoleResponse.Result.RefUserId"));
		result.setUserId(_ctx.stringValue("GetTntUserRoleResponse.Result.UserId"));
		result.setUserName(_ctx.stringValue("GetTntUserRoleResponse.Result.UserName"));
		result.setAccountType(_ctx.stringValue("GetTntUserRoleResponse.Result.AccountType"));
		result.setAccountNo(_ctx.stringValue("GetTntUserRoleResponse.Result.AccountNo"));
		result.setBizNo(_ctx.stringValue("GetTntUserRoleResponse.Result.BizNo"));
		getTntUserRoleResponse.setResult(result);
	 
	 	return getTntUserRoleResponse;
	}
}