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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.EvaluateFailOverSwitchResponse;
import com.aliyuncs.r_kvstore.model.v20150101.EvaluateFailOverSwitchResponse.ItemsItem;
import com.aliyuncs.r_kvstore.model.v20150101.EvaluateFailOverSwitchResponse.ItemsItem.AccountsItem;
import com.aliyuncs.r_kvstore.model.v20150101.EvaluateFailOverSwitchResponse.ReportsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class EvaluateFailOverSwitchResponseUnmarshaller {

	public static EvaluateFailOverSwitchResponse unmarshall(EvaluateFailOverSwitchResponse evaluateFailOverSwitchResponse, UnmarshallerContext _ctx) {
		
		evaluateFailOverSwitchResponse.setRequestId(_ctx.stringValue("EvaluateFailOverSwitchResponse.RequestId"));
		evaluateFailOverSwitchResponse.setReplicaId(_ctx.stringValue("EvaluateFailOverSwitchResponse.ReplicaId"));
		evaluateFailOverSwitchResponse.setEvaluateResult(_ctx.stringValue("EvaluateFailOverSwitchResponse.EvaluateResult"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("EvaluateFailOverSwitchResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDBInstanceId(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].DBInstanceId"));
			itemsItem.setRegionId(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].RegionId"));
			itemsItem.setReadWriteType(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].ReadWriteType"));
			itemsItem.setInstanceNetworkType(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].InstanceNetworkType"));
			itemsItem.setSecurityIPList(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].SecurityIPList"));
			itemsItem.setHasInternetIP(_ctx.booleanValue("EvaluateFailOverSwitchResponse.Items["+ i +"].HasInternetIP"));
			itemsItem.setInternetIP(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].InternetIP"));

			List<AccountsItem> accounts = new ArrayList<AccountsItem>();
			for (int j = 0; j < _ctx.lengthValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts.Length"); j++) {
				AccountsItem accountsItem = new AccountsItem();
				accountsItem.setAccountPrivilege(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountPrivilege"));
				accountsItem.setAccountStatus(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountStatus"));
				accountsItem.setAccountPrivilegeDetail(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountPrivilegeDetail"));
				accountsItem.setAccountDescription(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountDescription"));
				accountsItem.setAccountID(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountID"));
				accountsItem.setAccountName(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountName"));
				accountsItem.setPrivExceeded(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].PrivExceeded"));
				accountsItem.setEngine(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].Engine"));
				accountsItem.setAccountType(_ctx.stringValue("EvaluateFailOverSwitchResponse.Items["+ i +"].Accounts["+ j +"].AccountType"));

				accounts.add(accountsItem);
			}
			itemsItem.setAccounts(accounts);

			items.add(itemsItem);
		}
		evaluateFailOverSwitchResponse.setItems(items);

		List<ReportsItem> reports = new ArrayList<ReportsItem>();
		for (int i = 0; i < _ctx.lengthValue("EvaluateFailOverSwitchResponse.Reports.Length"); i++) {
			ReportsItem reportsItem = new ReportsItem();
			reportsItem.setCheckType(_ctx.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].CheckType"));
			reportsItem.setSeverity(_ctx.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].Severity"));
			reportsItem.setReasonCode(_ctx.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].ReasonCode"));
			reportsItem.setReasonMessage(_ctx.stringValue("EvaluateFailOverSwitchResponse.Reports["+ i +"].ReasonMessage"));

			reports.add(reportsItem);
		}
		evaluateFailOverSwitchResponse.setReports(reports);
	 
	 	return evaluateFailOverSwitchResponse;
	}
}