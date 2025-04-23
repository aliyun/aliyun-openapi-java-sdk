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

package com.aliyuncs.eds_user.transform.v20210308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_user.model.v20210308.RemoveUsersResponse;
import com.aliyuncs.eds_user.model.v20210308.RemoveUsersResponse.RemoveUsersResult;
import com.aliyuncs.eds_user.model.v20210308.RemoveUsersResponse.RemoveUsersResult.FailedUsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveUsersResponseUnmarshaller {

	public static RemoveUsersResponse unmarshall(RemoveUsersResponse removeUsersResponse, UnmarshallerContext _ctx) {
		
		removeUsersResponse.setRequestId(_ctx.stringValue("RemoveUsersResponse.RequestId"));

		RemoveUsersResult removeUsersResult = new RemoveUsersResult();

		List<String> removedUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveUsersResponse.RemoveUsersResult.RemovedUsers.Length"); i++) {
			removedUsers.add(_ctx.stringValue("RemoveUsersResponse.RemoveUsersResult.RemovedUsers["+ i +"]"));
		}
		removeUsersResult.setRemovedUsers(removedUsers);

		List<FailedUsersItem> failedUsers = new ArrayList<FailedUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("RemoveUsersResponse.RemoveUsersResult.FailedUsers.Length"); i++) {
			FailedUsersItem failedUsersItem = new FailedUsersItem();
			failedUsersItem.setEndUserId(_ctx.stringValue("RemoveUsersResponse.RemoveUsersResult.FailedUsers["+ i +"].EndUserId"));
			failedUsersItem.setErrorCode(_ctx.stringValue("RemoveUsersResponse.RemoveUsersResult.FailedUsers["+ i +"].ErrorCode"));
			failedUsersItem.setErrorMessage(_ctx.stringValue("RemoveUsersResponse.RemoveUsersResult.FailedUsers["+ i +"].ErrorMessage"));

			failedUsers.add(failedUsersItem);
		}
		removeUsersResult.setFailedUsers(failedUsers);
		removeUsersResponse.setRemoveUsersResult(removeUsersResult);
	 
	 	return removeUsersResponse;
	}
}