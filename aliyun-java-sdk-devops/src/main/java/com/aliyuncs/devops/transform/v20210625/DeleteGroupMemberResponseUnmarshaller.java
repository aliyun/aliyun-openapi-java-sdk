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

import com.aliyuncs.devops.model.v20210625.DeleteGroupMemberResponse;
import com.aliyuncs.devops.model.v20210625.DeleteGroupMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGroupMemberResponseUnmarshaller {

	public static DeleteGroupMemberResponse unmarshall(DeleteGroupMemberResponse deleteGroupMemberResponse, UnmarshallerContext _ctx) {
		
		deleteGroupMemberResponse.setRequestId(_ctx.stringValue("DeleteGroupMemberResponse.requestId"));
		deleteGroupMemberResponse.setErrorMessage(_ctx.stringValue("DeleteGroupMemberResponse.errorMessage"));
		deleteGroupMemberResponse.setErrorCode(_ctx.stringValue("DeleteGroupMemberResponse.errorCode"));
		deleteGroupMemberResponse.setSuccess(_ctx.booleanValue("DeleteGroupMemberResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("DeleteGroupMemberResponse.result.id"));
		result.setName(_ctx.stringValue("DeleteGroupMemberResponse.result.name"));
		result.setUsername(_ctx.stringValue("DeleteGroupMemberResponse.result.username"));
		result.setState(_ctx.stringValue("DeleteGroupMemberResponse.result.state"));
		result.setAvatarUrl(_ctx.stringValue("DeleteGroupMemberResponse.result.avatarUrl"));
		result.setExternUid(_ctx.stringValue("DeleteGroupMemberResponse.result.externUid"));
		result.setAccessLevel(_ctx.integerValue("DeleteGroupMemberResponse.result.accessLevel"));
		result.setMemberType(_ctx.stringValue("DeleteGroupMemberResponse.result.memberType"));
		result.setSourceId(_ctx.longValue("DeleteGroupMemberResponse.result.sourceId"));
		deleteGroupMemberResponse.setResult(result);
	 
	 	return deleteGroupMemberResponse;
	}
}