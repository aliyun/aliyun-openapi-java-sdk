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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.BindProduceAuthorizationResponse;
import com.aliyuncs.companyreg.model.v20200306.BindProduceAuthorizationResponse.Data;
import com.aliyuncs.companyreg.model.v20200306.BindProduceAuthorizationResponse.Data.AuthorizedUserListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindProduceAuthorizationResponseUnmarshaller {

	public static BindProduceAuthorizationResponse unmarshall(BindProduceAuthorizationResponse bindProduceAuthorizationResponse, UnmarshallerContext _ctx) {
		
		bindProduceAuthorizationResponse.setRequestId(_ctx.stringValue("BindProduceAuthorizationResponse.RequestId"));
		bindProduceAuthorizationResponse.setErrorMsg(_ctx.stringValue("BindProduceAuthorizationResponse.ErrorMsg"));
		bindProduceAuthorizationResponse.setErrorCode(_ctx.stringValue("BindProduceAuthorizationResponse.ErrorCode"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("BindProduceAuthorizationResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("BindProduceAuthorizationResponse.Data.Message"));

		List<AuthorizedUserListItem> authorizedUserList = new ArrayList<AuthorizedUserListItem>();
		for (int i = 0; i < _ctx.lengthValue("BindProduceAuthorizationResponse.Data.AuthorizedUserList.Length"); i++) {
			AuthorizedUserListItem authorizedUserListItem = new AuthorizedUserListItem();
			authorizedUserListItem.setUserId(_ctx.stringValue("BindProduceAuthorizationResponse.Data.AuthorizedUserList["+ i +"].UserId"));
			authorizedUserListItem.setUserName(_ctx.stringValue("BindProduceAuthorizationResponse.Data.AuthorizedUserList["+ i +"].UserName"));
			authorizedUserListItem.setAccountValidType(_ctx.integerValue("BindProduceAuthorizationResponse.Data.AuthorizedUserList["+ i +"].AccountValidType"));

			authorizedUserList.add(authorizedUserListItem);
		}
		data.setAuthorizedUserList(authorizedUserList);
		bindProduceAuthorizationResponse.setData(data);
	 
	 	return bindProduceAuthorizationResponse;
	}
}