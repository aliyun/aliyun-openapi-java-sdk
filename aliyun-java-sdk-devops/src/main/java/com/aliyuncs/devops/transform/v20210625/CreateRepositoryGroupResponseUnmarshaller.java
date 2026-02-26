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

import com.aliyuncs.devops.model.v20210625.CreateRepositoryGroupResponse;
import com.aliyuncs.devops.model.v20210625.CreateRepositoryGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRepositoryGroupResponseUnmarshaller {

	public static CreateRepositoryGroupResponse unmarshall(CreateRepositoryGroupResponse createRepositoryGroupResponse, UnmarshallerContext _ctx) {
		
		createRepositoryGroupResponse.setRequestId(_ctx.stringValue("CreateRepositoryGroupResponse.requestId"));
		createRepositoryGroupResponse.setErrorMessage(_ctx.stringValue("CreateRepositoryGroupResponse.errorMessage"));
		createRepositoryGroupResponse.setErrorCode(_ctx.stringValue("CreateRepositoryGroupResponse.errorCode"));
		createRepositoryGroupResponse.setSuccess(_ctx.booleanValue("CreateRepositoryGroupResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateRepositoryGroupResponse.result.id"));
		result.setName(_ctx.stringValue("CreateRepositoryGroupResponse.result.name"));
		result.setPath(_ctx.stringValue("CreateRepositoryGroupResponse.result.path"));
		result.setDescription(_ctx.stringValue("CreateRepositoryGroupResponse.result.description"));
		result.setAvatarUrl(_ctx.stringValue("CreateRepositoryGroupResponse.result.avatarUrl"));
		result.setWebUrl(_ctx.stringValue("CreateRepositoryGroupResponse.result.webUrl"));
		result.setPathWithNamespace(_ctx.stringValue("CreateRepositoryGroupResponse.result.pathWithNamespace"));
		result.setNameWithNamespace(_ctx.stringValue("CreateRepositoryGroupResponse.result.nameWithNamespace"));
		result.setType(_ctx.stringValue("CreateRepositoryGroupResponse.result.type"));
		result.setVisibilityLevel(_ctx.integerValue("CreateRepositoryGroupResponse.result.visibilityLevel"));
		result.setParentId(_ctx.longValue("CreateRepositoryGroupResponse.result.parentId"));
		result.setOwnerId(_ctx.longValue("CreateRepositoryGroupResponse.result.ownerId"));
		createRepositoryGroupResponse.setResult(result);
	 
	 	return createRepositoryGroupResponse;
	}
}