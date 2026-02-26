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

import com.aliyuncs.itag.model.v20210517.AddUserToGroupResponse;
import com.aliyuncs.itag.model.v20210517.AddUserToGroupResponse.Result;
import com.aliyuncs.itag.model.v20210517.AddUserToGroupResponse.Result.FailUserListItem;
import com.aliyuncs.itag.model.v20210517.AddUserToGroupResponse.Result.SuccUserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddUserToGroupResponseUnmarshaller {

	public static AddUserToGroupResponse unmarshall(AddUserToGroupResponse addUserToGroupResponse, UnmarshallerContext _ctx) {
		
		addUserToGroupResponse.setRequestId(_ctx.stringValue("AddUserToGroupResponse.RequestId"));
		addUserToGroupResponse.setCode(_ctx.stringValue("AddUserToGroupResponse.Code"));
		addUserToGroupResponse.setErrInfo(_ctx.stringValue("AddUserToGroupResponse.ErrInfo"));
		addUserToGroupResponse.setMsg(_ctx.stringValue("AddUserToGroupResponse.Msg"));
		addUserToGroupResponse.setSucc(_ctx.booleanValue("AddUserToGroupResponse.Succ"));
		addUserToGroupResponse.setErrorCode(_ctx.stringValue("AddUserToGroupResponse.ErrorCode"));

		Result result = new Result();
		result.setSuccCount(_ctx.longValue("AddUserToGroupResponse.Result.SuccCount"));
		result.setFailCount(_ctx.longValue("AddUserToGroupResponse.Result.FailCount"));

		List<SuccUserListItem> succUserList = new ArrayList<SuccUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("AddUserToGroupResponse.Result.SuccUserList.Length"); i++) {
			SuccUserListItem succUserListItem = new SuccUserListItem();
			succUserListItem.setUserId(_ctx.stringValue("AddUserToGroupResponse.Result.SuccUserList["+ i +"].UserId"));
			succUserListItem.setUserName(_ctx.stringValue("AddUserToGroupResponse.Result.SuccUserList["+ i +"].UserName"));
			succUserListItem.setAccountType(_ctx.stringValue("AddUserToGroupResponse.Result.SuccUserList["+ i +"].AccountType"));
			succUserListItem.setAccountNo(_ctx.stringValue("AddUserToGroupResponse.Result.SuccUserList["+ i +"].AccountNo"));

			succUserList.add(succUserListItem);
		}
		result.setSuccUserList(succUserList);

		List<FailUserListItem> failUserList = new ArrayList<FailUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("AddUserToGroupResponse.Result.FailUserList.Length"); i++) {
			FailUserListItem failUserListItem = new FailUserListItem();
			failUserListItem.setUserId(_ctx.stringValue("AddUserToGroupResponse.Result.FailUserList["+ i +"].UserId"));
			failUserListItem.setUserName(_ctx.stringValue("AddUserToGroupResponse.Result.FailUserList["+ i +"].UserName"));
			failUserListItem.setAccountType(_ctx.stringValue("AddUserToGroupResponse.Result.FailUserList["+ i +"].AccountType"));
			failUserListItem.setAccountNo(_ctx.stringValue("AddUserToGroupResponse.Result.FailUserList["+ i +"].AccountNo"));

			failUserList.add(failUserListItem);
		}
		result.setFailUserList(failUserList);
		addUserToGroupResponse.setResult(result);
	 
	 	return addUserToGroupResponse;
	}
}