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

import com.aliyuncs.codeup.model.v20200414.UpdateRepositoryMemberResponse;
import com.aliyuncs.codeup.model.v20200414.UpdateRepositoryMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRepositoryMemberResponseUnmarshaller {

	public static UpdateRepositoryMemberResponse unmarshall(UpdateRepositoryMemberResponse updateRepositoryMemberResponse, UnmarshallerContext _ctx) {
		
		updateRepositoryMemberResponse.setRequestId(_ctx.stringValue("UpdateRepositoryMemberResponse.RequestId"));
		updateRepositoryMemberResponse.setErrorCode(_ctx.stringValue("UpdateRepositoryMemberResponse.ErrorCode"));
		updateRepositoryMemberResponse.setSuccess(_ctx.booleanValue("UpdateRepositoryMemberResponse.Success"));
		updateRepositoryMemberResponse.setErrorMessage(_ctx.stringValue("UpdateRepositoryMemberResponse.ErrorMessage"));

		Result result = new Result();
		result.setAccessLevel(_ctx.integerValue("UpdateRepositoryMemberResponse.Result.AccessLevel"));
		result.setExternUserId(_ctx.stringValue("UpdateRepositoryMemberResponse.Result.ExternUserId"));
		result.setId(_ctx.longValue("UpdateRepositoryMemberResponse.Result.Id"));
		result.setState(_ctx.stringValue("UpdateRepositoryMemberResponse.Result.State"));
		result.setAvatarUrl(_ctx.stringValue("UpdateRepositoryMemberResponse.Result.AvatarUrl"));
		result.setEmail(_ctx.stringValue("UpdateRepositoryMemberResponse.Result.Email"));
		updateRepositoryMemberResponse.setResult(result);
	 
	 	return updateRepositoryMemberResponse;
	}
}