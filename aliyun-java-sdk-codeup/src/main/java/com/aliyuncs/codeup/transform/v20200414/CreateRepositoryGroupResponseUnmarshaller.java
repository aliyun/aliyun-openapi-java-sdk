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

import com.aliyuncs.codeup.model.v20200414.CreateRepositoryGroupResponse;
import com.aliyuncs.codeup.model.v20200414.CreateRepositoryGroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRepositoryGroupResponseUnmarshaller {

	public static CreateRepositoryGroupResponse unmarshall(CreateRepositoryGroupResponse createRepositoryGroupResponse, UnmarshallerContext _ctx) {
		
		createRepositoryGroupResponse.setRequestId(_ctx.stringValue("CreateRepositoryGroupResponse.RequestId"));
		createRepositoryGroupResponse.setErrorCode(_ctx.integerValue("CreateRepositoryGroupResponse.ErrorCode"));
		createRepositoryGroupResponse.setErrorMessage(_ctx.stringValue("CreateRepositoryGroupResponse.ErrorMessage"));
		createRepositoryGroupResponse.setSuccess(_ctx.booleanValue("CreateRepositoryGroupResponse.Success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateRepositoryGroupResponse.Result.Id"));
		result.setDescription(_ctx.stringValue("CreateRepositoryGroupResponse.Result.Description"));
		result.setVisibilityLevel(_ctx.stringValue("CreateRepositoryGroupResponse.Result.VisibilityLevel"));
		result.setWebUrl(_ctx.stringValue("CreateRepositoryGroupResponse.Result.WebUrl"));
		result.setName(_ctx.stringValue("CreateRepositoryGroupResponse.Result.Name"));
		result.setNameWithNamespace(_ctx.stringValue("CreateRepositoryGroupResponse.Result.NameWithNamespace"));
		result.setPath(_ctx.stringValue("CreateRepositoryGroupResponse.Result.Path"));
		result.setPathWithNamespace(_ctx.stringValue("CreateRepositoryGroupResponse.Result.PathWithNamespace"));
		result.setParentId(_ctx.longValue("CreateRepositoryGroupResponse.Result.ParentId"));
		result.setOwnerId(_ctx.longValue("CreateRepositoryGroupResponse.Result.OwnerId"));
		result.setAvatarUrl(_ctx.stringValue("CreateRepositoryGroupResponse.Result.AvatarUrl"));
		result.setType(_ctx.stringValue("CreateRepositoryGroupResponse.Result.Type"));
		createRepositoryGroupResponse.setResult(result);
	 
	 	return createRepositoryGroupResponse;
	}
}