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

import com.aliyuncs.eds_user.model.v20210308.UnlockUsersResponse;
import com.aliyuncs.eds_user.model.v20210308.UnlockUsersResponse.UnlockUsersResult;
import com.aliyuncs.eds_user.model.v20210308.UnlockUsersResponse.UnlockUsersResult.FailedUsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnlockUsersResponseUnmarshaller {

	public static UnlockUsersResponse unmarshall(UnlockUsersResponse unlockUsersResponse, UnmarshallerContext _ctx) {
		
		unlockUsersResponse.setRequestId(_ctx.stringValue("UnlockUsersResponse.RequestId"));

		UnlockUsersResult unlockUsersResult = new UnlockUsersResult();

		List<String> unlockedUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UnlockUsersResponse.UnlockUsersResult.UnlockedUsers.Length"); i++) {
			unlockedUsers.add(_ctx.stringValue("UnlockUsersResponse.UnlockUsersResult.UnlockedUsers["+ i +"]"));
		}
		unlockUsersResult.setUnlockedUsers(unlockedUsers);

		List<FailedUsersItem> failedUsers = new ArrayList<FailedUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("UnlockUsersResponse.UnlockUsersResult.FailedUsers.Length"); i++) {
			FailedUsersItem failedUsersItem = new FailedUsersItem();
			failedUsersItem.setEndUserId(_ctx.stringValue("UnlockUsersResponse.UnlockUsersResult.FailedUsers["+ i +"].EndUserId"));
			failedUsersItem.setErrorCode(_ctx.stringValue("UnlockUsersResponse.UnlockUsersResult.FailedUsers["+ i +"].ErrorCode"));
			failedUsersItem.setErrorMessage(_ctx.stringValue("UnlockUsersResponse.UnlockUsersResult.FailedUsers["+ i +"].ErrorMessage"));

			failedUsers.add(failedUsersItem);
		}
		unlockUsersResult.setFailedUsers(failedUsers);
		unlockUsersResponse.setUnlockUsersResult(unlockUsersResult);
	 
	 	return unlockUsersResponse;
	}
}