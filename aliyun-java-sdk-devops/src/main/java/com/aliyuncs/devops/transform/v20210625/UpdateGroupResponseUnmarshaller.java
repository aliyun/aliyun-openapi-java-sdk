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

import com.aliyuncs.devops.model.v20210625.UpdateGroupResponse;
import com.aliyuncs.devops.model.v20210625.UpdateGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGroupResponseUnmarshaller {

	public static UpdateGroupResponse unmarshall(UpdateGroupResponse updateGroupResponse, UnmarshallerContext _ctx) {
		
		updateGroupResponse.setRequestId(_ctx.stringValue("UpdateGroupResponse.requestId"));
		updateGroupResponse.setErrorCode(_ctx.stringValue("UpdateGroupResponse.errorCode"));
		updateGroupResponse.setErrorMessage(_ctx.stringValue("UpdateGroupResponse.errorMessage"));
		updateGroupResponse.setSuccess(_ctx.booleanValue("UpdateGroupResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("UpdateGroupResponse.result.id"));
		result.setPathWithNamespace(_ctx.stringValue("UpdateGroupResponse.result.pathWithNamespace"));
		result.setNameWithNamespace(_ctx.stringValue("UpdateGroupResponse.result.nameWithNamespace"));
		result.setName(_ctx.stringValue("UpdateGroupResponse.result.name"));
		result.setPath(_ctx.stringValue("UpdateGroupResponse.result.path"));
		result.setOwnerId(_ctx.longValue("UpdateGroupResponse.result.ownerId"));
		result.setParentId(_ctx.longValue("UpdateGroupResponse.result.parentId"));
		result.setDescription(_ctx.stringValue("UpdateGroupResponse.result.description"));
		result.setAvatarUrl(_ctx.stringValue("UpdateGroupResponse.result.avatarUrl"));
		result.setWebUrl(_ctx.stringValue("UpdateGroupResponse.result.webUrl"));
		result.setType(_ctx.stringValue("UpdateGroupResponse.result.type"));
		result.setVisibilityLevel(_ctx.integerValue("UpdateGroupResponse.result.visibilityLevel"));
		updateGroupResponse.setResult(result);
	 
	 	return updateGroupResponse;
	}
}