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

import com.aliyuncs.codeup.model.v20200414.DeleteGroupMemberResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteGroupMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGroupMemberResponseUnmarshaller {

	public static DeleteGroupMemberResponse unmarshall(DeleteGroupMemberResponse deleteGroupMemberResponse, UnmarshallerContext _ctx) {
		
		deleteGroupMemberResponse.setRequestId(_ctx.stringValue("DeleteGroupMemberResponse.RequestId"));
		deleteGroupMemberResponse.setErrorCode(_ctx.stringValue("DeleteGroupMemberResponse.ErrorCode"));
		deleteGroupMemberResponse.setSuccess(_ctx.booleanValue("DeleteGroupMemberResponse.Success"));
		deleteGroupMemberResponse.setErrorMessage(_ctx.stringValue("DeleteGroupMemberResponse.ErrorMessage"));

		Result result = new Result();
		result.setAccessLevel(_ctx.integerValue("DeleteGroupMemberResponse.Result.AccessLevel"));
		result.setId(_ctx.longValue("DeleteGroupMemberResponse.Result.Id"));
		result.setExternUserId(_ctx.stringValue("DeleteGroupMemberResponse.Result.ExternUserId"));
		result.setState(_ctx.stringValue("DeleteGroupMemberResponse.Result.State"));
		result.setAvatarUrl(_ctx.stringValue("DeleteGroupMemberResponse.Result.AvatarUrl"));
		result.setEmail(_ctx.stringValue("DeleteGroupMemberResponse.Result.Email"));
		deleteGroupMemberResponse.setResult(result);
	 
	 	return deleteGroupMemberResponse;
	}
}