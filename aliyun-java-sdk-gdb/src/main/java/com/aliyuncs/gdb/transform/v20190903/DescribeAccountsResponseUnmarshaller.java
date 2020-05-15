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

package com.aliyuncs.gdb.transform.v20190903;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gdb.model.v20190903.DescribeAccountsResponse;
import com.aliyuncs.gdb.model.v20190903.DescribeAccountsResponse.DBAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAccountsResponse.setRequestId(_ctx.stringValue("DescribeAccountsResponse.RequestId"));

		List<DBAccount> accounts = new ArrayList<DBAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			DBAccount dBAccount = new DBAccount();
			dBAccount.setAccountName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			dBAccount.setAccountStatus(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBAccount.setAccountDescription(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			dBAccount.setAccountType(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));

			accounts.add(dBAccount);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}