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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListAccountsForParentResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListAccountsForParentResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountsForParentResponseUnmarshaller {

	public static ListAccountsForParentResponse unmarshall(ListAccountsForParentResponse listAccountsForParentResponse, UnmarshallerContext _ctx) {
		
		listAccountsForParentResponse.setRequestId(_ctx.stringValue("ListAccountsForParentResponse.RequestId"));
		listAccountsForParentResponse.setPageNumber(_ctx.integerValue("ListAccountsForParentResponse.PageNumber"));
		listAccountsForParentResponse.setPageSize(_ctx.integerValue("ListAccountsForParentResponse.PageSize"));
		listAccountsForParentResponse.setTotalCount(_ctx.integerValue("ListAccountsForParentResponse.TotalCount"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountsForParentResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setResourceDirectoryId(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].ResourceDirectoryId"));
			account.setAccountId(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].AccountId"));
			account.setDisplayName(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].DisplayName"));
			account.setFolderId(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].FolderId"));
			account.setJoinMethod(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].JoinMethod"));
			account.setJoinTime(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].JoinTime"));
			account.setModifyTime(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].ModifyTime"));
			account.setType(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].Type"));
			account.setStatus(_ctx.stringValue("ListAccountsForParentResponse.Accounts["+ i +"].Status"));

			accounts.add(account);
		}
		listAccountsForParentResponse.setAccounts(accounts);
	 
	 	return listAccountsForParentResponse;
	}
}