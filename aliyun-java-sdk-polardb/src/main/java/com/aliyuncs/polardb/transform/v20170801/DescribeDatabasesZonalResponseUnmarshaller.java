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

import com.aliyuncs.polardb.model.v20170801.DescribeDatabasesZonalResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDatabasesZonalResponse.Database;
import com.aliyuncs.polardb.model.v20170801.DescribeDatabasesZonalResponse.Database.Account;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabasesZonalResponseUnmarshaller {

	public static DescribeDatabasesZonalResponse unmarshall(DescribeDatabasesZonalResponse describeDatabasesZonalResponse, UnmarshallerContext _ctx) {
		
		describeDatabasesZonalResponse.setRequestId(_ctx.stringValue("DescribeDatabasesZonalResponse.RequestId"));
		describeDatabasesZonalResponse.setPageRecordCount(_ctx.integerValue("DescribeDatabasesZonalResponse.PageRecordCount"));
		describeDatabasesZonalResponse.setPageNumber(_ctx.integerValue("DescribeDatabasesZonalResponse.PageNumber"));
		describeDatabasesZonalResponse.setMaxResults(_ctx.integerValue("DescribeDatabasesZonalResponse.MaxResults"));
		describeDatabasesZonalResponse.setNextToken(_ctx.stringValue("DescribeDatabasesZonalResponse.NextToken"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabasesZonalResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDBDescription(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].DBDescription"));
			database.setDBStatus(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].DBStatus"));
			database.setDBName(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].DBName"));
			database.setEngine(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].Engine"));
			database.setMasterID(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].MasterID"));
			database.setCharacterSetName(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].CharacterSetName"));

			List<Account> accounts = new ArrayList<Account>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDatabasesZonalResponse.Databases["+ i +"].Accounts.Length"); j++) {
				Account account = new Account();
				account.setPrivilegeStatus(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].Accounts["+ j +"].PrivilegeStatus"));
				account.setAccountStatus(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].Accounts["+ j +"].AccountStatus"));
				account.setAccountPrivilege(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].Accounts["+ j +"].AccountPrivilege"));
				account.setAccountName(_ctx.stringValue("DescribeDatabasesZonalResponse.Databases["+ i +"].Accounts["+ j +"].AccountName"));

				accounts.add(account);
			}
			database.setAccounts(accounts);

			databases.add(database);
		}
		describeDatabasesZonalResponse.setDatabases(databases);
	 
	 	return describeDatabasesZonalResponse;
	}
}