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

import com.aliyuncs.rds.model.v20140815.DescribeAccountsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAccountsResponse.DBInstanceAccount;
import com.aliyuncs.rds.model.v20140815.DescribeAccountsResponse.DBInstanceAccount.DatabasePrivilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountsResponseUnmarshaller {

	public static DescribeAccountsResponse unmarshall(DescribeAccountsResponse describeAccountsResponse, UnmarshallerContext context) {
		
		describeAccountsResponse.setRequestId(context.stringValue("DescribeAccountsResponse.RequestId"));

		List<DBInstanceAccount> accounts = new ArrayList<DBInstanceAccount>();
		for (int i = 0; i < context.lengthValue("DescribeAccountsResponse.Accounts.Length"); i++) {
			DBInstanceAccount dBInstanceAccount = new DBInstanceAccount();
			dBInstanceAccount.setDBInstanceId(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DBInstanceId"));
			dBInstanceAccount.setAccountName(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountName"));
			dBInstanceAccount.setAccountStatus(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountStatus"));
			dBInstanceAccount.setAccountType(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountType"));
			dBInstanceAccount.setAccountDescription(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].AccountDescription"));
			dBInstanceAccount.setPrivExceeded(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].PrivExceeded"));

			List<DatabasePrivilege> databasePrivileges = new ArrayList<DatabasePrivilege>();
			for (int j = 0; j < context.lengthValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges.Length"); j++) {
				DatabasePrivilege databasePrivilege = new DatabasePrivilege();
				databasePrivilege.setDBName(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].DBName"));
				databasePrivilege.setAccountPrivilege(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilege"));
				databasePrivilege.setAccountPrivilegeDetail(context.stringValue("DescribeAccountsResponse.Accounts["+ i +"].DatabasePrivileges["+ j +"].AccountPrivilegeDetail"));

				databasePrivileges.add(databasePrivilege);
			}
			dBInstanceAccount.setDatabasePrivileges(databasePrivileges);

			accounts.add(dBInstanceAccount);
		}
		describeAccountsResponse.setAccounts(accounts);
	 
	 	return describeAccountsResponse;
	}
}