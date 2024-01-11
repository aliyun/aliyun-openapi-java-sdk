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

import com.aliyuncs.devops.model.v20210625.GetProjectMemberResponse;
import com.aliyuncs.devops.model.v20210625.GetProjectMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectMemberResponseUnmarshaller {

	public static GetProjectMemberResponse unmarshall(GetProjectMemberResponse getProjectMemberResponse, UnmarshallerContext _ctx) {
		
		getProjectMemberResponse.setErrorMessage(_ctx.stringValue("GetProjectMemberResponse.errorMessage"));
		getProjectMemberResponse.setRequestId(_ctx.stringValue("GetProjectMemberResponse.requestId"));
		getProjectMemberResponse.setErrorCode(_ctx.stringValue("GetProjectMemberResponse.errorCode"));
		getProjectMemberResponse.setSuccess(_ctx.booleanValue("GetProjectMemberResponse.success"));

		Result result = new Result();
		result.setAccessLevel(_ctx.integerValue("GetProjectMemberResponse.result.accessLevel"));
		result.setExternUserId(_ctx.stringValue("GetProjectMemberResponse.result.externUserId"));
		result.setName(_ctx.stringValue("GetProjectMemberResponse.result.name"));
		result.setAvatarUrl(_ctx.stringValue("GetProjectMemberResponse.result.avatarUrl"));
		result.setId(_ctx.longValue("GetProjectMemberResponse.result.id"));
		result.setEmail(_ctx.stringValue("GetProjectMemberResponse.result.email"));
		getProjectMemberResponse.setResult(result);
	 
	 	return getProjectMemberResponse;
	}
}