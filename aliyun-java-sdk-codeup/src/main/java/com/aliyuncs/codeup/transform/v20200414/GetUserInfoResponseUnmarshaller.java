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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.GetUserInfoResponse;
import com.aliyuncs.codeup.model.v20200414.GetUserInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInfoResponseUnmarshaller {

	public static GetUserInfoResponse unmarshall(GetUserInfoResponse getUserInfoResponse, UnmarshallerContext _ctx) {
		
		getUserInfoResponse.setRequestId(_ctx.stringValue("GetUserInfoResponse.RequestId"));
		getUserInfoResponse.setErrorCode(_ctx.stringValue("GetUserInfoResponse.ErrorCode"));
		getUserInfoResponse.setSuccess(_ctx.booleanValue("GetUserInfoResponse.Success"));
		getUserInfoResponse.setErrorMessage(_ctx.stringValue("GetUserInfoResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetUserInfoResponse.Result.Id"));
		result.setExternalUserId(_ctx.stringValue("GetUserInfoResponse.Result.ExternalUserId"));
		result.setUsername(_ctx.stringValue("GetUserInfoResponse.Result.Username"));
		result.setName(_ctx.stringValue("GetUserInfoResponse.Result.Name"));
		result.setEmail(_ctx.stringValue("GetUserInfoResponse.Result.Email"));
		result.setAvatarUrl(_ctx.stringValue("GetUserInfoResponse.Result.AvatarUrl"));
		getUserInfoResponse.setResult(result);
	 
	 	return getUserInfoResponse;
	}
}