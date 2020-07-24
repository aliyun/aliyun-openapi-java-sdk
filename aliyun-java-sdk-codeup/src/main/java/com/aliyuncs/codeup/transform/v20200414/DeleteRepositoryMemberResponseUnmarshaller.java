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

import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryMemberResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryMemberResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryMemberResponseUnmarshaller {

	public static DeleteRepositoryMemberResponse unmarshall(DeleteRepositoryMemberResponse deleteRepositoryMemberResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryMemberResponse.setRequestId(_ctx.stringValue("DeleteRepositoryMemberResponse.RequestId"));
		deleteRepositoryMemberResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryMemberResponse.ErrorCode"));
		deleteRepositoryMemberResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryMemberResponse.Success"));
		deleteRepositoryMemberResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryMemberResponse.ErrorMessage"));

		Result result = new Result();
		result.setAccessLevel(_ctx.integerValue("DeleteRepositoryMemberResponse.Result.AccessLevel"));
		result.setId(_ctx.longValue("DeleteRepositoryMemberResponse.Result.Id"));
		result.setCreatedAt(_ctx.stringValue("DeleteRepositoryMemberResponse.Result.CreatedAt"));
		result.setUpdatedAt(_ctx.stringValue("DeleteRepositoryMemberResponse.Result.UpdatedAt"));
		result.setSourceId(_ctx.longValue("DeleteRepositoryMemberResponse.Result.SourceId"));
		result.setSourceType(_ctx.stringValue("DeleteRepositoryMemberResponse.Result.SourceType"));
		result.setUserId(_ctx.longValue("DeleteRepositoryMemberResponse.Result.UserId"));
		result.setNotificationLevel(_ctx.integerValue("DeleteRepositoryMemberResponse.Result.NotificationLevel"));
		result.setMessage(_ctx.stringValue("DeleteRepositoryMemberResponse.Result.Message"));
		deleteRepositoryMemberResponse.setResult(result);
	 
	 	return deleteRepositoryMemberResponse;
	}
}