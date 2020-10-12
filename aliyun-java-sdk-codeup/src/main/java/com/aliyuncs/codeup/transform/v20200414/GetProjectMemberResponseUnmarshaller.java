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

import com.aliyuncs.codeup.model.v20200414.GetProjectMemberResponse;
import com.aliyuncs.codeup.model.v20200414.GetProjectMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectMemberResponseUnmarshaller {

	public static GetProjectMemberResponse unmarshall(GetProjectMemberResponse getProjectMemberResponse, UnmarshallerContext _ctx) {
		
		getProjectMemberResponse.setRequestId(_ctx.stringValue("GetProjectMemberResponse.RequestId"));
		getProjectMemberResponse.setErrorCode(_ctx.stringValue("GetProjectMemberResponse.ErrorCode"));
		getProjectMemberResponse.setSuccess(_ctx.booleanValue("GetProjectMemberResponse.Success"));
		getProjectMemberResponse.setErrorMessage(_ctx.stringValue("GetProjectMemberResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetProjectMemberResponse.Result.Id"));
		result.setExternUserId(_ctx.stringValue("GetProjectMemberResponse.Result.ExternUserId"));
		result.setAvatarUrl(_ctx.stringValue("GetProjectMemberResponse.Result.AvatarUrl"));
		result.setName(_ctx.stringValue("GetProjectMemberResponse.Result.Name"));
		result.setAccessLevel(_ctx.integerValue("GetProjectMemberResponse.Result.AccessLevel"));
		getProjectMemberResponse.setResult(result);
	 
	 	return getProjectMemberResponse;
	}
}