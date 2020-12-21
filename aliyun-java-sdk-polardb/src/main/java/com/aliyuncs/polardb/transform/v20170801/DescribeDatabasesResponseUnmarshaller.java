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

import com.aliyuncs.polardb.model.v20170801.DescribeDatabasesResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDatabasesResponse.Database;
import com.aliyuncs.polardb.model.v20170801.DescribeDatabasesResponse.Database.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabasesResponseUnmarshaller {

	public static DescribeDatabasesResponse unmarshall(DescribeDatabasesResponse describeDatabasesResponse, UnmarshallerContext _ctx) {
		
		describeDatabasesResponse.setRequestId(_ctx.stringValue("DescribeDatabasesResponse.RequestId"));
		describeDatabasesResponse.setPageNumber(_ctx.integerValue("DescribeDatabasesResponse.PageNumber"));
		describeDatabasesResponse.setPageRecordCount(_ctx.integerValue("DescribeDatabasesResponse.PageRecordCount"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabasesResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDBName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBName"));
			database.setDBStatus(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBStatus"));
			database.setDBDescription(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBDescription"));
			database.setCharacterSetName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].CharacterSetName"));
			database.setEngine(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Engine"));

			List<Account> accounts = new ArrayList<Account>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts.Length"); j++) {
				Account account = new Account();
				account.setAccountName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts["+ j +"].AccountName"));
				account.setAccountStatus(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts["+ j +"].AccountStatus"));
				account.setAccountPrivilege(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts["+ j +"].AccountPrivilege"));
				account.setPrivilegeStatus(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts["+ j +"].PrivilegeStatus"));

				accounts.add(account);
			}
			database.setAccounts(accounts);

			databases.add(database);
		}
		describeDatabasesResponse.setDatabases(databases);
	 
	 	return describeDatabasesResponse;
	}
}