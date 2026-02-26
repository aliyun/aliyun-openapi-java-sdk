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

import com.aliyuncs.eds_user.model.v20210308.ResetUserPasswordResponse;
import com.aliyuncs.eds_user.model.v20210308.ResetUserPasswordResponse.ResetUsersResult;
import com.aliyuncs.eds_user.model.v20210308.ResetUserPasswordResponse.ResetUsersResult.FailedUsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetUserPasswordResponseUnmarshaller {

	public static ResetUserPasswordResponse unmarshall(ResetUserPasswordResponse resetUserPasswordResponse, UnmarshallerContext _ctx) {
		
		resetUserPasswordResponse.setRequestId(_ctx.stringValue("ResetUserPasswordResponse.RequestId"));

		ResetUsersResult resetUsersResult = new ResetUsersResult();

		List<String> resetUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ResetUserPasswordResponse.ResetUsersResult.ResetUsers.Length"); i++) {
			resetUsers.add(_ctx.stringValue("ResetUserPasswordResponse.ResetUsersResult.ResetUsers["+ i +"]"));
		}
		resetUsersResult.setResetUsers(resetUsers);

		List<FailedUsersItem> failedUsers = new ArrayList<FailedUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("ResetUserPasswordResponse.ResetUsersResult.FailedUsers.Length"); i++) {
			FailedUsersItem failedUsersItem = new FailedUsersItem();
			failedUsersItem.setEndUserId(_ctx.stringValue("ResetUserPasswordResponse.ResetUsersResult.FailedUsers["+ i +"].EndUserId"));
			failedUsersItem.setErrorCode(_ctx.stringValue("ResetUserPasswordResponse.ResetUsersResult.FailedUsers["+ i +"].ErrorCode"));
			failedUsersItem.setErrorMessage(_ctx.stringValue("ResetUserPasswordResponse.ResetUsersResult.FailedUsers["+ i +"].ErrorMessage"));

			failedUsers.add(failedUsersItem);
		}
		resetUsersResult.setFailedUsers(failedUsers);
		resetUserPasswordResponse.setResetUsersResult(resetUsersResult);
	 
	 	return resetUserPasswordResponse;
	}
}