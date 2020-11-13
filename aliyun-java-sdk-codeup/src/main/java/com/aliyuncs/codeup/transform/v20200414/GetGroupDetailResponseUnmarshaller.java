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

import com.aliyuncs.codeup.model.v20200414.GetGroupDetailResponse;
import com.aliyuncs.codeup.model.v20200414.GetGroupDetailResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGroupDetailResponseUnmarshaller {

	public static GetGroupDetailResponse unmarshall(GetGroupDetailResponse getGroupDetailResponse, UnmarshallerContext _ctx) {
		
		getGroupDetailResponse.setRequestId(_ctx.stringValue("GetGroupDetailResponse.RequestId"));
		getGroupDetailResponse.setErrorCode(_ctx.stringValue("GetGroupDetailResponse.ErrorCode"));
		getGroupDetailResponse.setSuccess(_ctx.booleanValue("GetGroupDetailResponse.Success"));
		getGroupDetailResponse.setErrorMessage(_ctx.stringValue("GetGroupDetailResponse.ErrorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetGroupDetailResponse.Result.Id"));
		result.setName(_ctx.stringValue("GetGroupDetailResponse.Result.Name"));
		result.setPath(_ctx.stringValue("GetGroupDetailResponse.Result.Path"));
		result.setDescription(_ctx.stringValue("GetGroupDetailResponse.Result.Description"));
		result.setAvatarUrl(_ctx.stringValue("GetGroupDetailResponse.Result.AvatarUrl"));
		result.setWebUrl(_ctx.stringValue("GetGroupDetailResponse.Result.WebUrl"));
		result.setPathWithNamespace(_ctx.stringValue("GetGroupDetailResponse.Result.PathWithNamespace"));
		result.setNameWithNamespace(_ctx.stringValue("GetGroupDetailResponse.Result.NameWithNamespace"));
		result.setType(_ctx.stringValue("GetGroupDetailResponse.Result.Type"));
		result.setVisibilityLevel(_ctx.stringValue("GetGroupDetailResponse.Result.VisibilityLevel"));
		result.setParentId(_ctx.longValue("GetGroupDetailResponse.Result.ParentId"));
		result.setOwnerId(_ctx.longValue("GetGroupDetailResponse.Result.OwnerId"));
		getGroupDetailResponse.setResult(result);
	 
	 	return getGroupDetailResponse;
	}
}