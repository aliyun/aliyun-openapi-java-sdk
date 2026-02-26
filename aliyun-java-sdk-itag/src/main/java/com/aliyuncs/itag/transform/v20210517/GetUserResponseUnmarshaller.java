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

import com.aliyuncs.itag.model.v20210517.GetUserResponse;
import com.aliyuncs.itag.model.v20210517.GetUserResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserResponseUnmarshaller {

	public static GetUserResponse unmarshall(GetUserResponse getUserResponse, UnmarshallerContext _ctx) {
		
		getUserResponse.setRequestId(_ctx.stringValue("GetUserResponse.RequestId"));
		getUserResponse.setCode(_ctx.stringValue("GetUserResponse.Code"));
		getUserResponse.setErrInfo(_ctx.stringValue("GetUserResponse.ErrInfo"));
		getUserResponse.setMsg(_ctx.stringValue("GetUserResponse.Msg"));
		getUserResponse.setSucc(_ctx.booleanValue("GetUserResponse.Succ"));
		getUserResponse.setErrorCode(_ctx.stringValue("GetUserResponse.ErrorCode"));

		Result result = new Result();
		result.setEmail(_ctx.stringValue("GetUserResponse.Result.Email"));
		result.setPhone(_ctx.stringValue("GetUserResponse.Result.Phone"));
		result.setSupplierId(_ctx.stringValue("GetUserResponse.Result.SupplierId"));
		result.setOrg(_ctx.stringValue("GetUserResponse.Result.Org"));
		result.setRefUserId(_ctx.stringValue("GetUserResponse.Result.RefUserId"));
		result.setUserId(_ctx.stringValue("GetUserResponse.Result.UserId"));
		result.setUserName(_ctx.stringValue("GetUserResponse.Result.UserName"));
		result.setAccountType(_ctx.stringValue("GetUserResponse.Result.AccountType"));
		result.setAccountNo(_ctx.stringValue("GetUserResponse.Result.AccountNo"));
		getUserResponse.setResult(result);
	 
	 	return getUserResponse;
	}
}