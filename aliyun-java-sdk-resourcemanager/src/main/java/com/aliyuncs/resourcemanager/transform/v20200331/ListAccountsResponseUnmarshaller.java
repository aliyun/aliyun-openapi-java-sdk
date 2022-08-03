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
import com.aliyuncs.resourcemanager.model.v20200331.ListAccountsResponse.Account.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountsResponseUnmarshaller {

	public static ListAccountsResponse unmarshall(ListAccountsResponse listAccountsResponse, UnmarshallerContext _ctx) {
		
		listAccountsResponse.setRequestId(_ctx.stringValue("ListAccountsResponse.RequestId"));
		listAccountsResponse.setTotalCount(_ctx.integerValue("ListAccountsResponse.TotalCount"));
		listAccountsResponse.setPageSize(_ctx.integerValue("ListAccountsResponse.PageSize"));
		listAccountsResponse.setPageNumber(_ctx.integerValue("ListAccountsResponse.PageNumber"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountsResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setStatus(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].Status"));
			account.setType(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].Type"));
			account.setDisplayName(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].DisplayName"));
			account.setFolderId(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].FolderId"));
			account.setResourceDirectoryId(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].ResourceDirectoryId"));
			account.setJoinTime(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].JoinTime"));
			account.setAccountId(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].AccountId"));
			account.setJoinMethod(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].JoinMethod"));
			account.setModifyTime(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].ModifyTime"));
			account.setResourceDirectoryPath(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].ResourceDirectoryPath"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListAccountsResponse.Accounts["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListAccountsResponse.Accounts["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			account.setTags(tags);

			accounts.add(account);
		}
		listAccountsResponse.setAccounts(accounts);
	 
	 	return listAccountsResponse;
	}
}