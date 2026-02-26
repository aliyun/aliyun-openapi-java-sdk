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

import com.aliyuncs.itag.model.v20210517.AddUserToTntResponse;
import com.aliyuncs.itag.model.v20210517.AddUserToTntResponse.Result;
import com.aliyuncs.itag.model.v20210517.AddUserToTntResponse.Result.FailUserListItem;
import com.aliyuncs.itag.model.v20210517.AddUserToTntResponse.Result.SuccUserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddUserToTntResponseUnmarshaller {

	public static AddUserToTntResponse unmarshall(AddUserToTntResponse addUserToTntResponse, UnmarshallerContext _ctx) {
		
		addUserToTntResponse.setRequestId(_ctx.stringValue("AddUserToTntResponse.RequestId"));
		addUserToTntResponse.setCode(_ctx.stringValue("AddUserToTntResponse.Code"));
		addUserToTntResponse.setErrInfo(_ctx.stringValue("AddUserToTntResponse.ErrInfo"));
		addUserToTntResponse.setMsg(_ctx.stringValue("AddUserToTntResponse.Msg"));
		addUserToTntResponse.setSucc(_ctx.booleanValue("AddUserToTntResponse.Succ"));
		addUserToTntResponse.setErrorCode(_ctx.stringValue("AddUserToTntResponse.ErrorCode"));

		Result result = new Result();
		result.setSuccCount(_ctx.longValue("AddUserToTntResponse.Result.SuccCount"));
		result.setFailCount(_ctx.longValue("AddUserToTntResponse.Result.FailCount"));

		List<SuccUserListItem> succUserList = new ArrayList<SuccUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("AddUserToTntResponse.Result.SuccUserList.Length"); i++) {
			SuccUserListItem succUserListItem = new SuccUserListItem();
			succUserListItem.setUserId(_ctx.stringValue("AddUserToTntResponse.Result.SuccUserList["+ i +"].UserId"));
			succUserListItem.setUserName(_ctx.stringValue("AddUserToTntResponse.Result.SuccUserList["+ i +"].UserName"));
			succUserListItem.setAccountType(_ctx.stringValue("AddUserToTntResponse.Result.SuccUserList["+ i +"].AccountType"));
			succUserListItem.setAccountNo(_ctx.stringValue("AddUserToTntResponse.Result.SuccUserList["+ i +"].AccountNo"));

			succUserList.add(succUserListItem);
		}
		result.setSuccUserList(succUserList);

		List<FailUserListItem> failUserList = new ArrayList<FailUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("AddUserToTntResponse.Result.FailUserList.Length"); i++) {
			FailUserListItem failUserListItem = new FailUserListItem();
			failUserListItem.setUserId(_ctx.stringValue("AddUserToTntResponse.Result.FailUserList["+ i +"].UserId"));
			failUserListItem.setUserName(_ctx.stringValue("AddUserToTntResponse.Result.FailUserList["+ i +"].UserName"));
			failUserListItem.setAccountType(_ctx.stringValue("AddUserToTntResponse.Result.FailUserList["+ i +"].AccountType"));
			failUserListItem.setAccountNo(_ctx.stringValue("AddUserToTntResponse.Result.FailUserList["+ i +"].AccountNo"));

			failUserList.add(failUserListItem);
		}
		result.setFailUserList(failUserList);
		addUserToTntResponse.setResult(result);
	 
	 	return addUserToTntResponse;
	}
}