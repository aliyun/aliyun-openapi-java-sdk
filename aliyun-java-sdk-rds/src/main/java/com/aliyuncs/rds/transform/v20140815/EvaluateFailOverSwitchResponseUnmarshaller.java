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

import com.aliyuncs.rds.model.v20140815.EvaluateFailOverSwitchResponse;
import com.aliyuncs.rds.model.v20140815.EvaluateFailOverSwitchResponse.ItemsItem;
import com.aliyuncs.rds.model.v20140815.EvaluateFailOverSwitchResponse.ItemsItem.AccountsItem;
import com.aliyuncs.rds.model.v20140815.EvaluateFailOverSwitchResponse.ReportsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class EvaluateFailOverSwitchResponseUnmarshaller {

	public static EvaluateFailOverSwitchResponse unmarshall(EvaluateFailOverSwitchResponse evaluateFailOverSwitchResponse, UnmarshallerContext context) {
		
		evaluateFailOverSwitchResponse.setRequestId(context.stringValue("EvaluateFailOverSwitchResponse.RequestId"));
		evaluateFailOverSwitchResponse.setReplicaId(context.stringValue("EvaluateFailOverSwitchResponse.ReplicaId"));
		evaluateFailOverSwitchResponse.setEvaluateResult(context.stringValue("EvaluateFailOverSwitchResponse.EvaluateResult"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("EvaluateFailOverSwitchResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDBInstanceId(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].DBInstanceId"));
			itemsItem.setRegionId(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].RegionId"));
			itemsItem.setRole(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Role"));
			itemsItem.setReadWriteType(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].ReadWriteType"));
			itemsItem.setInstanceNetworkType(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].InstanceNetworkType"));
			itemsItem.setSecurityIPList(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].SecurityIPList"));
			itemsItem.setHasInternetIP(context.booleanValue("EvaluateFailOverSwitchResponse.Items["+ i +"].HasInternetIP"));
			itemsItem.setInternetIP(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].InternetIP"));

			List<AccountsItem> accounts = new ArrayList<AccountsItem>();
			for (int j = 0; j < context.lengthValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts.Length"); j++) {
				AccountsItem accountsItem = new AccountsItem();
				accountsItem.setAccountPrivilege(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountPrivilege"));
				accountsItem.setAccountStatus(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountStatus"));
				accountsItem.setAccountPrivilegeDetail(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountPrivilegeDetail"));
				accountsItem.setAccountDescription(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountDescription"));
				accountsItem.setAccountID(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountID"));
				accountsItem.setAccountName(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountName"));
				accountsItem.setPrivExceeded(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].PrivExceeded"));
				accountsItem.setEngine(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].Engine"));
				accountsItem.setAccountType(context.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountType"));

				accounts.add(accountsItem);
			}
			itemsItem.setAccounts(accounts);

			items.add(itemsItem);
		}
		evaluateFailOverSwitchResponse.setItems(items);

		List<ReportsItem> reports = new ArrayList<ReportsItem>();
		for (int i = 0; i < context.lengthValue("EvaluateFailOverSwitchResponse.Reports.Length"); i++) {
			ReportsItem reportsItem = new ReportsItem();
			reportsItem.setCheckType(context.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].CheckType"));
			reportsItem.setSeverity(context.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].Severity"));
			reportsItem.setReasonCode(context.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].ReasonCode"));
			reportsItem.setReasonMessage(context.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].ReasonMessage"));

			reports.add(reportsItem);
		}
		evaluateFailOverSwitchResponse.setReports(reports);
	 
	 	return evaluateFailOverSwitchResponse;
	}
}