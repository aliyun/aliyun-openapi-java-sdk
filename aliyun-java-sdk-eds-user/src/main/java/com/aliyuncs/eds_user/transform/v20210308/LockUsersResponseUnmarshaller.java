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

import com.aliyuncs.eds_user.model.v20210308.LockUsersResponse;
import com.aliyuncs.eds_user.model.v20210308.LockUsersResponse.LockUsersResult;
import com.aliyuncs.eds_user.model.v20210308.LockUsersResponse.LockUsersResult.FailedUsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class LockUsersResponseUnmarshaller {

	public static LockUsersResponse unmarshall(LockUsersResponse lockUsersResponse, UnmarshallerContext _ctx) {
		
		lockUsersResponse.setRequestId(_ctx.stringValue("LockUsersResponse.RequestId"));

		LockUsersResult lockUsersResult = new LockUsersResult();

		List<String> lockedUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("LockUsersResponse.LockUsersResult.LockedUsers.Length"); i++) {
			lockedUsers.add(_ctx.stringValue("LockUsersResponse.LockUsersResult.LockedUsers["+ i +"]"));
		}
		lockUsersResult.setLockedUsers(lockedUsers);

		List<FailedUsersItem> failedUsers = new ArrayList<FailedUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("LockUsersResponse.LockUsersResult.FailedUsers.Length"); i++) {
			FailedUsersItem failedUsersItem = new FailedUsersItem();
			failedUsersItem.setEndUserId(_ctx.stringValue("LockUsersResponse.LockUsersResult.FailedUsers["+ i +"].EndUserId"));
			failedUsersItem.setErrorCode(_ctx.stringValue("LockUsersResponse.LockUsersResult.FailedUsers["+ i +"].ErrorCode"));
			failedUsersItem.setErrorMessage(_ctx.stringValue("LockUsersResponse.LockUsersResult.FailedUsers["+ i +"].ErrorMessage"));

			failedUsers.add(failedUsersItem);
		}
		lockUsersResult.setFailedUsers(failedUsers);
		lockUsersResponse.setLockUsersResult(lockUsersResult);
	 
	 	return lockUsersResponse;
	}
}