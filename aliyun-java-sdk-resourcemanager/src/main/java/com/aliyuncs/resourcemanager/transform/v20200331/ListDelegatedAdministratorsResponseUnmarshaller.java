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

import com.aliyuncs.resourcemanager.model.v20200331.ListDelegatedAdministratorsResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListDelegatedAdministratorsResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDelegatedAdministratorsResponseUnmarshaller {

	public static ListDelegatedAdministratorsResponse unmarshall(ListDelegatedAdministratorsResponse listDelegatedAdministratorsResponse, UnmarshallerContext _ctx) {
		
		listDelegatedAdministratorsResponse.setRequestId(_ctx.stringValue("ListDelegatedAdministratorsResponse.RequestId"));
		listDelegatedAdministratorsResponse.setTotalCount(_ctx.longValue("ListDelegatedAdministratorsResponse.TotalCount"));
		listDelegatedAdministratorsResponse.setPageSize(_ctx.longValue("ListDelegatedAdministratorsResponse.PageSize"));
		listDelegatedAdministratorsResponse.setPageNumber(_ctx.longValue("ListDelegatedAdministratorsResponse.PageNumber"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("ListDelegatedAdministratorsResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setAccountId(_ctx.stringValue("ListDelegatedAdministratorsResponse.Accounts["+ i +"].AccountId"));
			account.setDisplayName(_ctx.stringValue("ListDelegatedAdministratorsResponse.Accounts["+ i +"].DisplayName"));
			account.setJoinMethod(_ctx.stringValue("ListDelegatedAdministratorsResponse.Accounts["+ i +"].JoinMethod"));
			account.setServicePrincipal(_ctx.stringValue("ListDelegatedAdministratorsResponse.Accounts["+ i +"].ServicePrincipal"));
			account.setDelegationEnabledTime(_ctx.stringValue("ListDelegatedAdministratorsResponse.Accounts["+ i +"].DelegationEnabledTime"));

			accounts.add(account);
		}
		listDelegatedAdministratorsResponse.setAccounts(accounts);
	 
	 	return listDelegatedAdministratorsResponse;
	}
}