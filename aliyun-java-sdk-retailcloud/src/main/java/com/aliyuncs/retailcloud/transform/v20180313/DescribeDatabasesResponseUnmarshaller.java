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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.DescribeDatabasesResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeDatabasesResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribeDatabasesResponse.Result.DatabasesItem;
import com.aliyuncs.retailcloud.model.v20180313.DescribeDatabasesResponse.Result.DatabasesItem.AccountsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabasesResponseUnmarshaller {

	public static DescribeDatabasesResponse unmarshall(DescribeDatabasesResponse describeDatabasesResponse, UnmarshallerContext context) {
		
		describeDatabasesResponse.setRequestId(context.stringValue("DescribeDatabasesResponse.RequestId"));
		describeDatabasesResponse.setCode(context.integerValue("DescribeDatabasesResponse.Code"));
		describeDatabasesResponse.setSuccess(context.booleanValue("DescribeDatabasesResponse.Success"));
		describeDatabasesResponse.setErrMsg(context.stringValue("DescribeDatabasesResponse.ErrMsg"));
		describeDatabasesResponse.set_Class(context.stringValue("DescribeDatabasesResponse.Class"));
		describeDatabasesResponse.setTransmitAliyun(context.booleanValue("DescribeDatabasesResponse.TransmitAliyun"));

		Result result = new Result();
		result.set_Class(context.stringValue("DescribeDatabasesResponse.Result.Class"));

		List<DatabasesItem> databases = new ArrayList<DatabasesItem>();
		for (int i = 0; i < context.lengthValue("DescribeDatabasesResponse.Result.Databases.Length"); i++) {
			DatabasesItem databasesItem = new DatabasesItem();
			databasesItem.setDBName(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].DBName"));
			databasesItem.setDBStatus(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].DBStatus"));
			databasesItem.setDBDescription(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].DBDescription"));
			databasesItem.setEngine(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].Engine"));
			databasesItem.setCharacterSetName(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].CharacterSetName"));
			databasesItem.set_Class(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].Class"));
			databasesItem.setDBInstanceId(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].DBInstanceId"));

			List<AccountsItem> accounts = new ArrayList<AccountsItem>();
			for (int j = 0; j < context.lengthValue("DescribeDatabasesResponse.Result.Databases["+ i +"].Accounts.Length"); j++) {
				AccountsItem accountsItem = new AccountsItem();
				accountsItem.setAccountPrivilegeDetail(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].Accounts["+ j +"].AccountPrivilegeDetail"));
				accountsItem.setAccountPrivilege(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].Accounts["+ j +"].AccountPrivilege"));
				accountsItem.set_Class(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].Accounts["+ j +"].Class"));
				accountsItem.setAccount(context.stringValue("DescribeDatabasesResponse.Result.Databases["+ i +"].Accounts["+ j +"].Account"));

				accounts.add(accountsItem);
			}
			databasesItem.setAccounts(accounts);

			databases.add(databasesItem);
		}
		result.setDatabases(databases);
		describeDatabasesResponse.setResult(result);
	 
	 	return describeDatabasesResponse;
	}
}