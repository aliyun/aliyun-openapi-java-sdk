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

import com.aliyuncs.codeup.model.v20200414.UpdateGroupMemberResponse;
import com.aliyuncs.codeup.model.v20200414.UpdateGroupMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGroupMemberResponseUnmarshaller {

	public static UpdateGroupMemberResponse unmarshall(UpdateGroupMemberResponse updateGroupMemberResponse, UnmarshallerContext _ctx) {
		
		updateGroupMemberResponse.setRequestId(_ctx.stringValue("UpdateGroupMemberResponse.RequestId"));
		updateGroupMemberResponse.setErrorCode(_ctx.stringValue("UpdateGroupMemberResponse.ErrorCode"));
		updateGroupMemberResponse.setSuccess(_ctx.booleanValue("UpdateGroupMemberResponse.Success"));
		updateGroupMemberResponse.setErrorMessage(_ctx.stringValue("UpdateGroupMemberResponse.ErrorMessage"));

		Result result = new Result();
		result.setAccessLevel(_ctx.integerValue("UpdateGroupMemberResponse.Result.AccessLevel"));
		result.setExternUserId(_ctx.stringValue("UpdateGroupMemberResponse.Result.ExternUserId"));
		result.setId(_ctx.longValue("UpdateGroupMemberResponse.Result.Id"));
		result.setState(_ctx.stringValue("UpdateGroupMemberResponse.Result.State"));
		result.setAvatarUrl(_ctx.stringValue("UpdateGroupMemberResponse.Result.AvatarUrl"));
		result.setEmail(_ctx.stringValue("UpdateGroupMemberResponse.Result.Email"));
		updateGroupMemberResponse.setResult(result);
	 
	 	return updateGroupMemberResponse;
	}
}