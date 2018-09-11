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

import com.aliyuncs.rds.model.v20140815.EvaluateFailoverResponse;
import com.aliyuncs.rds.model.v20140815.EvaluateFailoverResponse.ItemsItem;
import com.aliyuncs.rds.model.v20140815.EvaluateFailoverResponse.ItemsItem.AccountsItem;
import com.aliyuncs.rds.model.v20140815.EvaluateFailoverResponse.ReportsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class EvaluateFailoverResponseUnmarshaller {

	public static EvaluateFailoverResponse unmarshall(EvaluateFailoverResponse evaluateFailoverResponse, UnmarshallerContext context) {
		
		evaluateFailoverResponse.setRequestId(context.stringValue("EvaluateFailoverResponse.RequestId"));
		evaluateFailoverResponse.setReplicaId(context.stringValue("EvaluateFailoverResponse.ReplicaId"));
		evaluateFailoverResponse.setEvaluateResult(context.stringValue("EvaluateFailoverResponse.EvaluateResult"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("EvaluateFailoverResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDBInstanceId(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].DBInstanceId"));
			itemsItem.setRegionId(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].RegionId"));
			itemsItem.setRole(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Role"));
			itemsItem.setReadWriteType(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].ReadWriteType"));
			itemsItem.setInstanceNetworkType(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].InstanceNetworkType"));
			itemsItem.setSecurityIPList(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].SecurityIPList"));
			itemsItem.setHasInternetIP(context.booleanValue("EvaluateFailoverResponse.Items["+ i +"].HasInternetIP"));
			itemsItem.setInternetIP(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].InternetIP"));

			List<AccountsItem> accounts = new ArrayList<AccountsItem>();
			for (int j = 0; j < context.lengthValue("EvaluateFailoverResponse.Items["+ i +"].Accounts.Length"); j++) {
				AccountsItem accountsItem = new AccountsItem();
				accountsItem.setAccountPrivilege(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].AccountPrivilege"));
				accountsItem.setAccountStatus(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].AccountStatus"));
				accountsItem.setAccountPrivilegeDetail(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].AccountPrivilegeDetail"));
				accountsItem.setAccountDescription(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].AccountDescription"));
				accountsItem.setAccountID(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].AccountID"));
				accountsItem.setAccountName(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].AccountName"));
				accountsItem.setPrivExceeded(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].PrivExceeded"));
				accountsItem.setEngine(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].Engine"));
				accountsItem.setAccountType(context.stringValue("EvaluateFailoverResponse.Items["+ i +"].Accounts["+ j +"].AccountType"));

				accounts.add(accountsItem);
			}
			itemsItem.setAccounts(accounts);

			items.add(itemsItem);
		}
		evaluateFailoverResponse.setItems(items);

		List<ReportsItem> reports = new ArrayList<ReportsItem>();
		for (int i = 0; i < context.lengthValue("EvaluateFailoverResponse.Reports.Length"); i++) {
			ReportsItem reportsItem = new ReportsItem();
			reportsItem.setCheckType(context.stringValue("EvaluateFailoverResponse.Reports["+ i +"].CheckType"));
			reportsItem.setSeverity(context.stringValue("EvaluateFailoverResponse.Reports["+ i +"].Severity"));
			reportsItem.setReasonCode(context.stringValue("EvaluateFailoverResponse.Reports["+ i +"].ReasonCode"));
			reportsItem.setReasonMessage(context.stringValue("EvaluateFailoverResponse.Reports["+ i +"].ReasonMessage"));

			reports.add(reportsItem);
		}
		evaluateFailoverResponse.setReports(reports);
	 
	 	return evaluateFailoverResponse;
	}
}