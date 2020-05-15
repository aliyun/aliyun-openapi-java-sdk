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

import com.aliyuncs.resourcemanager.model.v20200331.ListAccountsResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListAccountsResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountsResponseUnmarshaller {

	public static ListAccountsResponse unmarshall(ListAccountsResponse listAccountsResponse, UnmarshallerContext _ctx) {
		
		listAccountsResponse.setRequestId(_ctx.stringValue("ListAccountsResponse.RequestId"));
		listAccountsResponse.setPageNumber(_ctx.integerValue("ListAccountsResponse.PageNumber"));
		listAccountsResponse.setPageSize(_ctx.integerValue("ListAccountsResponse.PageSize"));
		listAccountsResponse.setTotalCount(_ctx.integerValue("ListAccountsResponse.TotalCount"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountsResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setResourceDirectoryId(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].ResourceDirectoryId"));
			account.setAccountId(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].AccountId"));
			account.setDisplayName(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].DisplayName"));
			account.setFolderId(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].FolderId"));
			account.setJoinMethod(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].JoinMethod"));
			account.setJoinTime(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].JoinTime"));
			account.setModifyTime(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].ModifyTime"));
			account.setType(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].Type"));
			account.setStatus(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].Status"));

			accounts.add(account);
		}
		listAccountsResponse.setAccounts(accounts);
	 
	 	return listAccountsResponse;
	}
}