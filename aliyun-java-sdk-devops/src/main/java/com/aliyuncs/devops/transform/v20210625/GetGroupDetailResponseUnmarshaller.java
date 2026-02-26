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

import com.aliyuncs.devops.model.v20210625.GetGroupDetailResponse;
import com.aliyuncs.devops.model.v20210625.GetGroupDetailResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupDetailResponseUnmarshaller {

	public static GetGroupDetailResponse unmarshall(GetGroupDetailResponse getGroupDetailResponse, UnmarshallerContext _ctx) {
		
		getGroupDetailResponse.setRequestId(_ctx.stringValue("GetGroupDetailResponse.requestId"));
		getGroupDetailResponse.setErrorMessage(_ctx.stringValue("GetGroupDetailResponse.errorMessage"));
		getGroupDetailResponse.setErrorCode(_ctx.stringValue("GetGroupDetailResponse.errorCode"));
		getGroupDetailResponse.setSuccess(_ctx.booleanValue("GetGroupDetailResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetGroupDetailResponse.result.id"));
		result.setName(_ctx.stringValue("GetGroupDetailResponse.result.name"));
		result.setPath(_ctx.stringValue("GetGroupDetailResponse.result.path"));
		result.setDescription(_ctx.stringValue("GetGroupDetailResponse.result.description"));
		result.setAvatarUrl(_ctx.stringValue("GetGroupDetailResponse.result.avatarUrl"));
		result.setWebUrl(_ctx.stringValue("GetGroupDetailResponse.result.webUrl"));
		result.setPathWithNamespace(_ctx.stringValue("GetGroupDetailResponse.result.pathWithNamespace"));
		result.setNameWithNamespace(_ctx.stringValue("GetGroupDetailResponse.result.nameWithNamespace"));
		result.setType(_ctx.stringValue("GetGroupDetailResponse.result.type"));
		result.setVisibilityLevel(_ctx.integerValue("GetGroupDetailResponse.result.visibilityLevel"));
		result.setParentId(_ctx.longValue("GetGroupDetailResponse.result.parentId"));
		result.setOwnerId(_ctx.longValue("GetGroupDetailResponse.result.ownerId"));
		getGroupDetailResponse.setResult(result);
	 
	 	return getGroupDetailResponse;
	}
}