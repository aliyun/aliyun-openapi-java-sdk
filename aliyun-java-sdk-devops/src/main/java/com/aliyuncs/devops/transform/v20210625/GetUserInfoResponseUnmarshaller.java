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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.GetUserInfoResponse;
import com.aliyuncs.devops.model.v20210625.GetUserInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserInfoResponseUnmarshaller {

	public static GetUserInfoResponse unmarshall(GetUserInfoResponse getUserInfoResponse, UnmarshallerContext _ctx) {
		
		getUserInfoResponse.setRequestId(_ctx.stringValue("GetUserInfoResponse.requestId"));
		getUserInfoResponse.setErrorCode(_ctx.stringValue("GetUserInfoResponse.errorCode"));
		getUserInfoResponse.setErrorMessage(_ctx.stringValue("GetUserInfoResponse.errorMessage"));
		getUserInfoResponse.setSuccess(_ctx.booleanValue("GetUserInfoResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetUserInfoResponse.result.id"));
		result.setName(_ctx.stringValue("GetUserInfoResponse.result.name"));
		result.setUsername(_ctx.stringValue("GetUserInfoResponse.result.username"));
		result.setEmail(_ctx.stringValue("GetUserInfoResponse.result.email"));
		result.setAvatarUrl(_ctx.stringValue("GetUserInfoResponse.result.avatarUrl"));
		result.setExternUid(_ctx.stringValue("GetUserInfoResponse.result.externUid"));
		getUserInfoResponse.setResult(result);
	 
	 	return getUserInfoResponse;
	}
}