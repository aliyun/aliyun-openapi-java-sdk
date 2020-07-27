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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeHostAccountsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeHostAccountsResponse.AccountsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHostAccountsResponseUnmarshaller {

	public static DescribeHostAccountsResponse unmarshall(DescribeHostAccountsResponse describeHostAccountsResponse, UnmarshallerContext _ctx) {
		
		describeHostAccountsResponse.setRequestId(_ctx.stringValue("DescribeHostAccountsResponse.RequestId"));

		List<AccountsItem> accounts = new ArrayList<AccountsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHostAccountsResponse.Accounts.Length"); i++) {
			AccountsItem accountsItem = new AccountsItem();
			accountsItem.setAccountName(_ctx.stringValue("DescribeHostAccountsResponse.Accounts["+ i +"].AccountName"));
			accountsItem.setAccountType(_ctx.stringValue("DescribeHostAccountsResponse.Accounts["+ i +"].AccountType"));
			accountsItem.setAccountDescription(_ctx.stringValue("DescribeHostAccountsResponse.Accounts["+ i +"].AccountDescription"));
			accountsItem.setAccountStatus(_ctx.stringValue("DescribeHostAccountsResponse.Accounts["+ i +"].AccountStatus"));
			accountsItem.setDBInstanceId(_ctx.stringValue("DescribeHostAccountsResponse.Accounts["+ i +"].DBInstanceId"));

			accounts.add(accountsItem);
		}
		describeHostAccountsResponse.setAccounts(accounts);
	 
	 	return describeHostAccountsResponse;
	}
}