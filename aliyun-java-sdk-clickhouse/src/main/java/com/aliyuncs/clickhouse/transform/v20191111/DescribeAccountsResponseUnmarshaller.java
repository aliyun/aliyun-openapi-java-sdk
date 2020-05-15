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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeAccountsResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeAccountsResponse.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAccountsResponse.setRequestId(_ctx.stringValue("DescribeAccountsResponse.RequestId"));
		describeAccountsResponse.setPageNumber(_ctx.integerValue("DescribeAccountsResponse.PageNumber"));
		describeAccountsResponse.setTotalCount(_ctx.integerValue("DescribeAccountsResponse.TotalCount"));
		describeAccountsResponse.setPageSize(_ctx.integerValue("DescribeAccountsResponse.PageSize"));

		List<Account> accounts = new ArrayList<Account>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			Account account = new Account();
			account.setAccountName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			account.setAccountStatus(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			account.setAccountDescription(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			account.setAccountType(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));

			accounts.add(account);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}