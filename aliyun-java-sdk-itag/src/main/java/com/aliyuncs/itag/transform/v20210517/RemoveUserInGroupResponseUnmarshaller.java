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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.RemoveUserInGroupResponse;
import com.aliyuncs.itag.model.v20210517.RemoveUserInGroupResponse.Result;
import com.aliyuncs.itag.model.v20210517.RemoveUserInGroupResponse.Result.FailUserListItem;
import com.aliyuncs.itag.model.v20210517.RemoveUserInGroupResponse.Result.SuccUserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveUserInGroupResponseUnmarshaller {

	public static RemoveUserInGroupResponse unmarshall(RemoveUserInGroupResponse removeUserInGroupResponse, UnmarshallerContext _ctx) {
		
		removeUserInGroupResponse.setRequestId(_ctx.stringValue("RemoveUserInGroupResponse.RequestId"));
		removeUserInGroupResponse.setCode(_ctx.stringValue("RemoveUserInGroupResponse.Code"));
		removeUserInGroupResponse.setErrInfo(_ctx.stringValue("RemoveUserInGroupResponse.ErrInfo"));
		removeUserInGroupResponse.setMsg(_ctx.stringValue("RemoveUserInGroupResponse.Msg"));
		removeUserInGroupResponse.setSucc(_ctx.booleanValue("RemoveUserInGroupResponse.Succ"));
		removeUserInGroupResponse.setErrorCode(_ctx.stringValue("RemoveUserInGroupResponse.ErrorCode"));

		Result result = new Result();
		result.setSuccCount(_ctx.longValue("RemoveUserInGroupResponse.Result.SuccCount"));
		result.setFailCount(_ctx.longValue("RemoveUserInGroupResponse.Result.FailCount"));

		List<SuccUserListItem> succUserList = new ArrayList<SuccUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("RemoveUserInGroupResponse.Result.SuccUserList.Length"); i++) {
			SuccUserListItem succUserListItem = new SuccUserListItem();
			succUserListItem.setUserId(_ctx.stringValue("RemoveUserInGroupResponse.Result.SuccUserList["+ i +"].UserId"));
			succUserListItem.setUserName(_ctx.stringValue("RemoveUserInGroupResponse.Result.SuccUserList["+ i +"].UserName"));
			succUserListItem.setAccountType(_ctx.stringValue("RemoveUserInGroupResponse.Result.SuccUserList["+ i +"].AccountType"));
			succUserListItem.setAccountNo(_ctx.stringValue("RemoveUserInGroupResponse.Result.SuccUserList["+ i +"].AccountNo"));

			succUserList.add(succUserListItem);
		}
		result.setSuccUserList(succUserList);

		List<FailUserListItem> failUserList = new ArrayList<FailUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("RemoveUserInGroupResponse.Result.FailUserList.Length"); i++) {
			FailUserListItem failUserListItem = new FailUserListItem();
			failUserListItem.setUserId(_ctx.stringValue("RemoveUserInGroupResponse.Result.FailUserList["+ i +"].UserId"));
			failUserListItem.setUserName(_ctx.stringValue("RemoveUserInGroupResponse.Result.FailUserList["+ i +"].UserName"));
			failUserListItem.setAccountType(_ctx.stringValue("RemoveUserInGroupResponse.Result.FailUserList["+ i +"].AccountType"));
			failUserListItem.setAccountNo(_ctx.stringValue("RemoveUserInGroupResponse.Result.FailUserList["+ i +"].AccountNo"));

			failUserList.add(failUserListItem);
		}
		result.setFailUserList(failUserList);
		removeUserInGroupResponse.setResult(result);
	 
	 	return removeUserInGroupResponse;
	}
}