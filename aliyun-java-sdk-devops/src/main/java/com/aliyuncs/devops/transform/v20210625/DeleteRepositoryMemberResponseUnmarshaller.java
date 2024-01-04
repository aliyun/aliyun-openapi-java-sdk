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

import com.aliyuncs.devops.model.v20210625.DeleteRepositoryMemberResponse;
import com.aliyuncs.devops.model.v20210625.DeleteRepositoryMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryMemberResponseUnmarshaller {

	public static DeleteRepositoryMemberResponse unmarshall(DeleteRepositoryMemberResponse deleteRepositoryMemberResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryMemberResponse.setRequestId(_ctx.stringValue("DeleteRepositoryMemberResponse.requestId"));
		deleteRepositoryMemberResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryMemberResponse.errorMessage"));
		deleteRepositoryMemberResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryMemberResponse.errorCode"));
		deleteRepositoryMemberResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryMemberResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("DeleteRepositoryMemberResponse.result.id"));
		result.setCreateAt(_ctx.stringValue("DeleteRepositoryMemberResponse.result.createAt"));
		result.setUpdateAt(_ctx.stringValue("DeleteRepositoryMemberResponse.result.updateAt"));
		result.setSourceId(_ctx.longValue("DeleteRepositoryMemberResponse.result.sourceId"));
		result.setSourceType(_ctx.stringValue("DeleteRepositoryMemberResponse.result.sourceType"));
		result.setUserId(_ctx.longValue("DeleteRepositoryMemberResponse.result.userId"));
		result.setAccessLevel(_ctx.integerValue("DeleteRepositoryMemberResponse.result.accessLevel"));
		result.setExternUid(_ctx.stringValue("DeleteRepositoryMemberResponse.result.externUid"));
		deleteRepositoryMemberResponse.setResult(result);
	 
	 	return deleteRepositoryMemberResponse;
	}
}