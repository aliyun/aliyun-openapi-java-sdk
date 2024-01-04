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

import com.aliyuncs.devops.model.v20210625.GetGroupByPathResponse;
import com.aliyuncs.devops.model.v20210625.GetGroupByPathResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupByPathResponseUnmarshaller {

	public static GetGroupByPathResponse unmarshall(GetGroupByPathResponse getGroupByPathResponse, UnmarshallerContext _ctx) {
		
		getGroupByPathResponse.setRequestId(_ctx.stringValue("GetGroupByPathResponse.requestId"));
		getGroupByPathResponse.setSuccess(_ctx.booleanValue("GetGroupByPathResponse.success"));
		getGroupByPathResponse.setErrorCode(_ctx.stringValue("GetGroupByPathResponse.errorCode"));
		getGroupByPathResponse.setErrorMessage(_ctx.stringValue("GetGroupByPathResponse.errorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetGroupByPathResponse.result.id"));
		result.setName(_ctx.stringValue("GetGroupByPathResponse.result.name"));
		result.setPath(_ctx.stringValue("GetGroupByPathResponse.result.path"));
		result.setPathWithNamespace(_ctx.stringValue("GetGroupByPathResponse.result.pathWithNamespace"));
		result.setNameWithNamespace(_ctx.stringValue("GetGroupByPathResponse.result.nameWithNamespace"));
		result.setVisibilityLevel(_ctx.integerValue("GetGroupByPathResponse.result.visibilityLevel"));
		result.setDescription(_ctx.stringValue("GetGroupByPathResponse.result.description"));
		result.setAvatarUrl(_ctx.stringValue("GetGroupByPathResponse.result.avatarUrl"));
		result.setWebUrl(_ctx.stringValue("GetGroupByPathResponse.result.webUrl"));
		result.setParentId(_ctx.stringValue("GetGroupByPathResponse.result.parentId"));
		result.setOwnerId(_ctx.stringValue("GetGroupByPathResponse.result.ownerId"));
		getGroupByPathResponse.setResult(result);
	 
	 	return getGroupByPathResponse;
	}
}