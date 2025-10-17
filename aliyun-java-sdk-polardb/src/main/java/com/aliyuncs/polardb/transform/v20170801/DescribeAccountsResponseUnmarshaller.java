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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse.DBAccount;
import com.aliyuncs.polardb.model.v20170801.DescribeAccountsResponse.DBAccount.DatabasePrivilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext _ctx) {
		
		describeAccountsResponse.setRequestId(_ctx.stringValue("DescribeAccountsResponse.RequestId"));
		describeAccountsResponse.setPageRecordCount(_ctx.integerValue("DescribeAccountsResponse.PageRecordCount"));
		describeAccountsResponse.setPageNumber(_ctx.integerValue("DescribeAccountsResponse.PageNumber"));

		List<DBAccount> accounts = new ArrayList<DBAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			DBAccount dBAccount = new DBAccount();
			dBAccount.setAccountDescription(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			dBAccount.setAccountStatus(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBAccount.setPrivilegeExceeded(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].PrivilegeExceeded"));
			dBAccount.setDynamoDBAuthPassword(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DynamoDBAuthPassword"));
			dBAccount.setAccountLockState(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountLockState"));
			dBAccount.setAccountPasswordValidTime(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountPasswordValidTime"));
			dBAccount.setAccountType(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));
			dBAccount.setTairPasswordSetted(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].TairPasswordSetted"));
			dBAccount.setAccountName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			dBAccount.setAccountPassword(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountPassword"));

			List<DatabasePrivilege> databasePrivileges = new ArrayList<DatabasePrivilege>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges.Length"); j++) {
				DatabasePrivilege databasePrivilege = new DatabasePrivilege();
				databasePrivilege.setAccountPrivilege(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilege"));
				databasePrivilege.setDBName(_ctx.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].DBName"));

				databasePrivileges.add(databasePrivilege);
			}
			dBAccount.setDatabasePrivileges(databasePrivileges);

			accounts.add(dBAccount);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}