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

import com.aliyuncs.rds.model.v20140815.DescribeDatabasesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDatabasesResponse.Database;
import com.aliyuncs.rds.model.v20140815.DescribeDatabasesResponse.Database.AccountPrivilegeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabasesResponseUnmarshaller {

	public static DescribeDatabasesResponse unmarshall(DescribeDatabasesResponse describeDatabasesResponse, UnmarshallerContext _ctx) {
		
		describeDatabasesResponse.setRequestId(_ctx.stringValue("DescribeDatabasesResponse.RequestId"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabasesResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setDBDescription(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBDescription"));
			database.setDBStatus(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBStatus"));
			database.setDBName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBName"));
			database.setDBInstanceId(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].DBInstanceId"));
			database.setEngine(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Engine"));
			database.setCharacterSetName(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].CharacterSetName"));
			database.setCollate(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Collate"));
			database.setCtype(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Ctype"));
			database.setConnLimit(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].ConnLimit"));
			database.setTablespace(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Tablespace"));
			database.setResourceGroupId(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].ResourceGroupId"));
			database.setPageNumber(_ctx.integerValue("DescribeDatabasesResponse.Databases["+ i +"].PageNumber"));
			database.setPageSize(_ctx.integerValue("DescribeDatabasesResponse.Databases["+ i +"].PageSize"));
			database.setTotalCount(_ctx.integerValue("DescribeDatabasesResponse.Databases["+ i +"].TotalCount"));

			List<AccountPrivilegeInfo> accounts = new ArrayList<AccountPrivilegeInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts.Length"); j++) {
				AccountPrivilegeInfo accountPrivilegeInfo = new AccountPrivilegeInfo();
				accountPrivilegeInfo.setAccount(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts["+ j +"].Account"));
				accountPrivilegeInfo.setAccountPrivilege(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts["+ j +"].AccountPrivilege"));
				accountPrivilegeInfo.setAccountPrivilegeDetail(_ctx.stringValue("DescribeDatabasesResponse.Databases["+ i +"].Accounts["+ j +"].AccountPrivilegeDetail"));

				accounts.add(accountPrivilegeInfo);
			}
			database.setAccounts(accounts);

			databases.add(database);
		}
		describeDatabasesResponse.setDatabases(databases);
	 
	 	return describeDatabasesResponse;
	}
}