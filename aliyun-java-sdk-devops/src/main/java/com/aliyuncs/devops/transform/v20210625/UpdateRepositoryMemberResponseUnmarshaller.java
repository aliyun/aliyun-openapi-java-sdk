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

import com.aliyuncs.devops.model.v20210625.UpdateRepositoryMemberResponse;
import com.aliyuncs.devops.model.v20210625.UpdateRepositoryMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRepositoryMemberResponseUnmarshaller {

	public static UpdateRepositoryMemberResponse unmarshall(UpdateRepositoryMemberResponse updateRepositoryMemberResponse, UnmarshallerContext _ctx) {
		
		updateRepositoryMemberResponse.setRequestId(_ctx.stringValue("UpdateRepositoryMemberResponse.requestId"));
		updateRepositoryMemberResponse.setErrorMessage(_ctx.stringValue("UpdateRepositoryMemberResponse.errorMessage"));
		updateRepositoryMemberResponse.setErrorCode(_ctx.stringValue("UpdateRepositoryMemberResponse.errorCode"));
		updateRepositoryMemberResponse.setSuccess(_ctx.booleanValue("UpdateRepositoryMemberResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("UpdateRepositoryMemberResponse.result.id"));
		result.setState(_ctx.stringValue("UpdateRepositoryMemberResponse.result.state"));
		result.setAvatarUrl(_ctx.stringValue("UpdateRepositoryMemberResponse.result.avatarUrl"));
		result.setExternUid(_ctx.stringValue("UpdateRepositoryMemberResponse.result.externUid"));
		result.setWebUrl(_ctx.stringValue("UpdateRepositoryMemberResponse.result.webUrl"));
		result.setEmail(_ctx.stringValue("UpdateRepositoryMemberResponse.result.email"));
		result.setMemberName(_ctx.stringValue("UpdateRepositoryMemberResponse.result.memberName"));
		result.setAccessLevel(_ctx.integerValue("UpdateRepositoryMemberResponse.result.accessLevel"));
		result.setExpireAt(_ctx.stringValue("UpdateRepositoryMemberResponse.result.expireAt"));
		result.setTbUserId(_ctx.stringValue("UpdateRepositoryMemberResponse.result.tbUserId"));
		result.setMemberType(_ctx.stringValue("UpdateRepositoryMemberResponse.result.memberType"));
		result.setSourceId(_ctx.longValue("UpdateRepositoryMemberResponse.result.sourceId"));
		result.setSourceType(_ctx.stringValue("UpdateRepositoryMemberResponse.result.sourceType"));
		result.setName(_ctx.stringValue("UpdateRepositoryMemberResponse.result.name"));
		result.setUsername(_ctx.stringValue("UpdateRepositoryMemberResponse.result.username"));
		updateRepositoryMemberResponse.setResult(result);
	 
	 	return updateRepositoryMemberResponse;
	}
}