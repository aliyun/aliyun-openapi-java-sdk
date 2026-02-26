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

import com.aliyuncs.itag.model.v20210517.RemoveUserInTntResponse;
import com.aliyuncs.itag.model.v20210517.RemoveUserInTntResponse.Result;
import com.aliyuncs.itag.model.v20210517.RemoveUserInTntResponse.Result.FailUserListItem;
import com.aliyuncs.itag.model.v20210517.RemoveUserInTntResponse.Result.SuccUserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveUserInTntResponseUnmarshaller {

	public static RemoveUserInTntResponse unmarshall(RemoveUserInTntResponse removeUserInTntResponse, UnmarshallerContext _ctx) {
		
		removeUserInTntResponse.setRequestId(_ctx.stringValue("RemoveUserInTntResponse.RequestId"));
		removeUserInTntResponse.setCode(_ctx.stringValue("RemoveUserInTntResponse.Code"));
		removeUserInTntResponse.setErrInfo(_ctx.stringValue("RemoveUserInTntResponse.ErrInfo"));
		removeUserInTntResponse.setMsg(_ctx.stringValue("RemoveUserInTntResponse.Msg"));
		removeUserInTntResponse.setSucc(_ctx.booleanValue("RemoveUserInTntResponse.Succ"));
		removeUserInTntResponse.setErrorCode(_ctx.stringValue("RemoveUserInTntResponse.ErrorCode"));

		Result result = new Result();
		result.setSuccCount(_ctx.longValue("RemoveUserInTntResponse.Result.SuccCount"));
		result.setFailCount(_ctx.longValue("RemoveUserInTntResponse.Result.FailCount"));

		List<SuccUserListItem> succUserList = new ArrayList<SuccUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("RemoveUserInTntResponse.Result.SuccUserList.Length"); i++) {
			SuccUserListItem succUserListItem = new SuccUserListItem();
			succUserListItem.setUserId(_ctx.stringValue("RemoveUserInTntResponse.Result.SuccUserList["+ i +"].UserId"));
			succUserListItem.setUserName(_ctx.stringValue("RemoveUserInTntResponse.Result.SuccUserList["+ i +"].UserName"));
			succUserListItem.setAccountType(_ctx.stringValue("RemoveUserInTntResponse.Result.SuccUserList["+ i +"].AccountType"));
			succUserListItem.setAccountNo(_ctx.stringValue("RemoveUserInTntResponse.Result.SuccUserList["+ i +"].AccountNo"));

			succUserList.add(succUserListItem);
		}
		result.setSuccUserList(succUserList);

		List<FailUserListItem> failUserList = new ArrayList<FailUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("RemoveUserInTntResponse.Result.FailUserList.Length"); i++) {
			FailUserListItem failUserListItem = new FailUserListItem();
			failUserListItem.setUserId(_ctx.stringValue("RemoveUserInTntResponse.Result.FailUserList["+ i +"].UserId"));
			failUserListItem.setUserName(_ctx.stringValue("RemoveUserInTntResponse.Result.FailUserList["+ i +"].UserName"));
			failUserListItem.setAccountType(_ctx.stringValue("RemoveUserInTntResponse.Result.FailUserList["+ i +"].AccountType"));
			failUserListItem.setAccountNo(_ctx.stringValue("RemoveUserInTntResponse.Result.FailUserList["+ i +"].AccountNo"));

			failUserList.add(failUserListItem);
		}
		result.setFailUserList(failUserList);
		removeUserInTntResponse.setResult(result);
	 
	 	return removeUserInTntResponse;
	}
}