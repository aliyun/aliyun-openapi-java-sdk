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

import com.aliyuncs.devops.model.v20210625.UpdateProjectMemberResponse;
import com.aliyuncs.devops.model.v20210625.UpdateProjectMemberResponse.Member;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProjectMemberResponseUnmarshaller {

	public static UpdateProjectMemberResponse unmarshall(UpdateProjectMemberResponse updateProjectMemberResponse, UnmarshallerContext _ctx) {
		
		updateProjectMemberResponse.setRequestId(_ctx.stringValue("UpdateProjectMemberResponse.requestId"));
		updateProjectMemberResponse.setErrorMsg(_ctx.stringValue("UpdateProjectMemberResponse.errorMsg"));
		updateProjectMemberResponse.setErrorCode(_ctx.stringValue("UpdateProjectMemberResponse.errorCode"));
		updateProjectMemberResponse.setSuccess(_ctx.booleanValue("UpdateProjectMemberResponse.success"));

		Member member = new Member();
		member.setId(_ctx.stringValue("UpdateProjectMemberResponse.member.id"));
		member.setRoleIdentifier(_ctx.stringValue("UpdateProjectMemberResponse.member.roleIdentifier"));
		member.setUserIdentifier(_ctx.stringValue("UpdateProjectMemberResponse.member.userIdentifier"));
		member.setUserType(_ctx.stringValue("UpdateProjectMemberResponse.member.userType"));
		member.setTargetType(_ctx.stringValue("UpdateProjectMemberResponse.member.targetType"));
		member.setGmtCreate(_ctx.longValue("UpdateProjectMemberResponse.member.gmtCreate"));
		member.setGmtModified(_ctx.longValue("UpdateProjectMemberResponse.member.gmtModified"));
		member.setTargetIdentifier(_ctx.stringValue("UpdateProjectMemberResponse.member.targetIdentifier"));
		updateProjectMemberResponse.setMember(member);
	 
	 	return updateProjectMemberResponse;
	}
}