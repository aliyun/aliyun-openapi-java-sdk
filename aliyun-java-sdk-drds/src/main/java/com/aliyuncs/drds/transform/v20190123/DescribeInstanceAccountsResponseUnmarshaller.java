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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeInstanceAccountsResponse;
import com.aliyuncs.drds.model.v20190123.DescribeInstanceAccountsResponse.InstanceAccount;
import com.aliyuncs.drds.model.v20190123.DescribeInstanceAccountsResponse.InstanceAccount.DbPrivilege;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAccountsResponseUnmarshaller {

	public static DescribeInstanceAccountsResponse unmarshall(DescribeInstanceAccountsResponse describeInstanceAccountsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAccountsResponse.setRequestId(_ctx.stringValue("DescribeInstanceAccountsResponse.RequestId"));
		describeInstanceAccountsResponse.setSuccess(_ctx.booleanValue("DescribeInstanceAccountsResponse.Success"));

		List<InstanceAccount> instanceAccounts = new ArrayList<InstanceAccount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAccountsResponse.InstanceAccounts.Length"); i++) {
			InstanceAccount instanceAccount = new InstanceAccount();
			instanceAccount.setAccountName(_ctx.stringValue("DescribeInstanceAccountsResponse.InstanceAccounts["+ i +"].AccountName"));
			instanceAccount.setHost(_ctx.stringValue("DescribeInstanceAccountsResponse.InstanceAccounts["+ i +"].Host"));
			instanceAccount.setAccountType(_ctx.integerValue("DescribeInstanceAccountsResponse.InstanceAccounts["+ i +"].AccountType"));
			instanceAccount.setDescription(_ctx.stringValue("DescribeInstanceAccountsResponse.InstanceAccounts["+ i +"].Description"));

			List<DbPrivilege> dbPrivileges = new ArrayList<DbPrivilege>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceAccountsResponse.InstanceAccounts["+ i +"].DbPrivileges.Length"); j++) {
				DbPrivilege dbPrivilege = new DbPrivilege();
				dbPrivilege.setDbName(_ctx.stringValue("DescribeInstanceAccountsResponse.InstanceAccounts["+ i +"].DbPrivileges["+ j +"].DbName"));
				dbPrivilege.setPrivilege(_ctx.stringValue("DescribeInstanceAccountsResponse.InstanceAccounts["+ i +"].DbPrivileges["+ j +"].Privilege"));

				dbPrivileges.add(dbPrivilege);
			}
			instanceAccount.setDbPrivileges(dbPrivileges);

			instanceAccounts.add(instanceAccount);
		}
		describeInstanceAccountsResponse.setInstanceAccounts(instanceAccounts);
	 
	 	return describeInstanceAccountsResponse;
	}
}