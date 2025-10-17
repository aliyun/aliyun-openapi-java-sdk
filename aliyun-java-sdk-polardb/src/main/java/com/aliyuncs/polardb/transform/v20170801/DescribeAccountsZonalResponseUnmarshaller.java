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

import com.aliyuncs.polardb.model.v20170801.DescribeAccountsZonalResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAccountsZonalResponse.DBAccount;
import com.aliyuncs.polardb.model.v20170801.DescribeAccountsZonalResponse.DBAccount.DatabasePrivilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsZonalResponseUnmarshaller {

	public static DescribeAccountsZonalResponse unmarshall(DescribeAccountsZonalResponse describeAccountsZonalResponse, UnmarshallerContext _ctx) {
		
		describeAccountsZonalResponse.setRequestId(_ctx.stringValue("DescribeAccountsZonalResponse.RequestId"));
		describeAccountsZonalResponse.setPageRecordCount(_ctx.integerValue("DescribeAccountsZonalResponse.PageRecordCount"));
		describeAccountsZonalResponse.setPageNumber(_ctx.integerValue("DescribeAccountsZonalResponse.PageNumber"));
		describeAccountsZonalResponse.setNextToken(_ctx.stringValue("DescribeAccountsZonalResponse.NextToken"));
		describeAccountsZonalResponse.setMaxResults(_ctx.integerValue("DescribeAccountsZonalResponse.MaxResults"));

		List<DBAccount> accounts = new ArrayList<DBAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountsZonalResponse.Accounts.Length"); i++) {
			DBAccount dBAccount = new DBAccount();
			dBAccount.setAccountDescription(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].AccountDescription"));
			dBAccount.setAccountStatus(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].AccountStatus"));
			dBAccount.setPrivilegeExceeded(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].PrivilegeExceeded"));
			dBAccount.setDynamoDBAuthPassword(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].DynamoDBAuthPassword"));
			dBAccount.setAccountLockState(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].AccountLockState"));
			dBAccount.setAccountPasswordValidTime(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].AccountPasswordValidTime"));
			dBAccount.setAccountType(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].AccountType"));
			dBAccount.setTairPasswordSetted(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].TairPasswordSetted"));
			dBAccount.setAccountName(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].AccountName"));
			dBAccount.setAccountPassword(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].AccountPassword"));

			List<DatabasePrivilege> databasePrivileges = new ArrayList<DatabasePrivilege>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccountsZonalResponse.Accounts["+ i +"].DatabasePrivileges.Length"); j++) {
				DatabasePrivilege databasePrivilege = new DatabasePrivilege();
				databasePrivilege.setAccountPrivilege(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilege"));
				databasePrivilege.setDBName(_ctx.stringValue("DescribeAccountsZonalResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].DBName"));

				databasePrivileges.add(databasePrivilege);
			}
			dBAccount.setDatabasePrivileges(databasePrivileges);

			accounts.add(dBAccount);
		}
		describeAccountsZonalResponse.setAccounts(accounts);
	 
	 	return describeAccountsZonalResponse;
	}
}