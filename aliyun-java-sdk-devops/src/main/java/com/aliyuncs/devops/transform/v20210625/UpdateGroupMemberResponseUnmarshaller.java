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

import com.aliyuncs.devops.model.v20210625.UpdateGroupMemberResponse;
import com.aliyuncs.devops.model.v20210625.UpdateGroupMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGroupMemberResponseUnmarshaller {

	public static UpdateGroupMemberResponse unmarshall(UpdateGroupMemberResponse updateGroupMemberResponse, UnmarshallerContext _ctx) {
		
		updateGroupMemberResponse.setRequestId(_ctx.stringValue("UpdateGroupMemberResponse.requestId"));
		updateGroupMemberResponse.setErrorCode(_ctx.stringValue("UpdateGroupMemberResponse.errorCode"));
		updateGroupMemberResponse.setErrorMessage(_ctx.stringValue("UpdateGroupMemberResponse.errorMessage"));
		updateGroupMemberResponse.setSuccess(_ctx.booleanValue("UpdateGroupMemberResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("UpdateGroupMemberResponse.result.id"));
		result.setName(_ctx.stringValue("UpdateGroupMemberResponse.result.name"));
		result.setUsername(_ctx.stringValue("UpdateGroupMemberResponse.result.username"));
		result.setState(_ctx.stringValue("UpdateGroupMemberResponse.result.state"));
		result.setAvatarUrl(_ctx.stringValue("UpdateGroupMemberResponse.result.avatarUrl"));
		result.setExternUid(_ctx.stringValue("UpdateGroupMemberResponse.result.externUid"));
		result.setEmail(_ctx.stringValue("UpdateGroupMemberResponse.result.email"));
		result.setAccessLevel(_ctx.integerValue("UpdateGroupMemberResponse.result.accessLevel"));
		result.setMemberType(_ctx.stringValue("UpdateGroupMemberResponse.result.memberType"));
		result.setSourceId(_ctx.longValue("UpdateGroupMemberResponse.result.sourceId"));
		updateGroupMemberResponse.setResult(result);
	 
	 	return updateGroupMemberResponse;
	}
}