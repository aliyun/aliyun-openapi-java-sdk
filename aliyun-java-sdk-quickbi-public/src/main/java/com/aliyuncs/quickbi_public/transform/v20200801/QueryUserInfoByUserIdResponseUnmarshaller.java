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

package com.aliyuncs.quickbi_public.transform.v20200801;

import com.aliyuncs.quickbi_public.model.v20200801.QueryUserInfoByUserIdResponse;
import com.aliyuncs.quickbi_public.model.v20200801.QueryUserInfoByUserIdResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserInfoByUserIdResponseUnmarshaller {

	public static QueryUserInfoByUserIdResponse unmarshall(QueryUserInfoByUserIdResponse queryUserInfoByUserIdResponse, UnmarshallerContext _ctx) {
		
		queryUserInfoByUserIdResponse.setRequestId(_ctx.stringValue("QueryUserInfoByUserIdResponse.RequestId"));
		queryUserInfoByUserIdResponse.setSuccess(_ctx.booleanValue("QueryUserInfoByUserIdResponse.Success"));

		Result result = new Result();
		result.setAccountId(_ctx.stringValue("QueryUserInfoByUserIdResponse.Result.AccountId"));
		result.setAccountName(_ctx.stringValue("QueryUserInfoByUserIdResponse.Result.AccountName"));
		result.setAdminUser(_ctx.booleanValue("QueryUserInfoByUserIdResponse.Result.AdminUser"));
		result.setAuthAdminUser(_ctx.booleanValue("QueryUserInfoByUserIdResponse.Result.AuthAdminUser"));
		result.setEmail(_ctx.stringValue("QueryUserInfoByUserIdResponse.Result.Email"));
		result.setNickName(_ctx.stringValue("QueryUserInfoByUserIdResponse.Result.NickName"));
		result.setPhone(_ctx.stringValue("QueryUserInfoByUserIdResponse.Result.Phone"));
		result.setUserId(_ctx.stringValue("QueryUserInfoByUserIdResponse.Result.UserId"));
		result.setUserType(_ctx.integerValue("QueryUserInfoByUserIdResponse.Result.UserType"));
		queryUserInfoByUserIdResponse.setResult(result);
	 
	 	return queryUserInfoByUserIdResponse;
	}
}