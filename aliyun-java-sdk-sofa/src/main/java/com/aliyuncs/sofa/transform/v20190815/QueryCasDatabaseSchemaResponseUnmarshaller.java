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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse.DataItem.Database;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse.DataItem.Database.AssignedAppsItem7;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse.DataItem.GrantsItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse.DataItem.GrantsItem.Account;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse.DataItem.GrantsItem.Account.Database1;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSchemaResponse.DataItem.GrantsItem.Account.Database1.AssignedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasDatabaseSchemaResponseUnmarshaller {

	public static QueryCasDatabaseSchemaResponse unmarshall(QueryCasDatabaseSchemaResponse queryCasDatabaseSchemaResponse, UnmarshallerContext _ctx) {
		
		queryCasDatabaseSchemaResponse.setRequestId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.RequestId"));
		queryCasDatabaseSchemaResponse.setResultCode(_ctx.stringValue("QueryCasDatabaseSchemaResponse.ResultCode"));
		queryCasDatabaseSchemaResponse.setResultMessage(_ctx.stringValue("QueryCasDatabaseSchemaResponse.ResultMessage"));
		queryCasDatabaseSchemaResponse.setTotalCount(_ctx.longValue("QueryCasDatabaseSchemaResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCharSet(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].CharSet"));
			dataItem.setDescription(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Description"));
			dataItem.setIaasType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].IaasType"));
			dataItem.setId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Name"));
			dataItem.setStatus(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Status"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].UtcModified"));

			Database database = new Database();
			database.setAutoRenew(_ctx.booleanValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AutoRenew"));
			database.setAutoRenewPeriod(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AutoRenewPeriod"));
			database.setConnectionAddress(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.ConnectionAddress"));
			database.setCpu(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Cpu"));
			database.setDescription(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Description"));
			database.setEngine(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Engine"));
			database.setEngineVersion(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.EngineVersion"));
			database.setIaasId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.IaasId"));
			database.setIaasType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.IaasType"));
			database.setId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Id"));
			database.setMasterZoneId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.MasterZoneId"));
			database.setMaxConnections(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.MaxConnections"));
			database.setMaxIops(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.MaxIops"));
			database.setMemory(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Memory"));
			database.setName(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Name"));
			database.setNetworkType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.NetworkType"));
			database.setNetType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.NetType"));
			database.setPort(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Port"));
			database.setSpecIaasId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.SpecIaasId"));
			database.setStatus(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Status"));
			database.setStorage(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Storage"));
			database.setType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.Type"));
			database.setUtcCreate(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.UtcCreate"));
			database.setUtcModified(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.UtcModified"));
			database.setVpcId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.VpcId"));
			database.setVSwitchIaasId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.VSwitchIaasId"));
			database.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.WorkspaceId"));

			List<String> appIds2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AppIds.Length"); j++) {
				appIds2.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AppIds["+ j +"]"));
			}
			database.setAppIds2(appIds2);

			List<String> appServiceIds3 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AppServiceIds.Length"); j++) {
				appServiceIds3.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AppServiceIds["+ j +"]"));
			}
			database.setAppServiceIds3(appServiceIds3);

			List<String> assignedAppServiceIds4 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AssignedAppServiceIds.Length"); j++) {
				assignedAppServiceIds4.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AssignedAppServiceIds["+ j +"]"));
			}
			database.setAssignedAppServiceIds4(assignedAppServiceIds4);

			List<String> sharedWorkspaceIds5 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.SharedWorkspaceIds.Length"); j++) {
				sharedWorkspaceIds5.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.SharedWorkspaceIds["+ j +"]"));
			}
			database.setSharedWorkspaceIds5(sharedWorkspaceIds5);

			List<AssignedAppsItem7> assignedApps6 = new ArrayList<AssignedAppsItem7>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AssignedApps.Length"); j++) {
				AssignedAppsItem7 assignedAppsItem7 = new AssignedAppsItem7();
				assignedAppsItem7.setAppId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AssignedApps["+ j +"].AppId"));
				assignedAppsItem7.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Database.AssignedApps["+ j +"].WorkspaceId"));

				assignedApps6.add(assignedAppsItem7);
			}
			database.setAssignedApps6(assignedApps6);
			dataItem.setDatabase(database);

			List<GrantsItem> grants = new ArrayList<GrantsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants.Length"); j++) {
				GrantsItem grantsItem = new GrantsItem();
				grantsItem.setPrivilege(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Privilege"));

				Account account = new Account();
				account.setDescription(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Description"));
				account.setIaasType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.IaasType"));
				account.setId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Id"));
				account.setName(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Name"));
				account.setPassword(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Password"));
				account.setPrivilege(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Privilege"));
				account.setStatus(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Status"));
				account.setUtcCreate(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.UtcCreate"));
				account.setUtcModified(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.UtcModified"));

				Database1 database1 = new Database1();
				database1.setAutoRenew(_ctx.booleanValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AutoRenew"));
				database1.setAutoRenewPeriod(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AutoRenewPeriod"));
				database1.setConnectionAddress(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.ConnectionAddress"));
				database1.setCpu(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Cpu"));
				database1.setDescription(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Description"));
				database1.setEngine(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Engine"));
				database1.setEngineVersion(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.EngineVersion"));
				database1.setIaasId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.IaasId"));
				database1.setIaasType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.IaasType"));
				database1.setId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Id"));
				database1.setMasterZoneId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.MasterZoneId"));
				database1.setMaxConnections(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.MaxConnections"));
				database1.setMaxIops(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.MaxIops"));
				database1.setMemory(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Memory"));
				database1.setName(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Name"));
				database1.setNetworkType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.NetworkType"));
				database1.setNetType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.NetType"));
				database1.setPort(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Port"));
				database1.setSpecIaasId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.SpecIaasId"));
				database1.setStatus(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Status"));
				database1.setStorage(_ctx.longValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Storage"));
				database1.setType(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.Type"));
				database1.setUtcCreate(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.UtcCreate"));
				database1.setUtcModified(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.UtcModified"));
				database1.setVpcId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.VpcId"));
				database1.setVSwitchIaasId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.VSwitchIaasId"));
				database1.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.WorkspaceId"));

				List<String> appIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AppIds.Length"); k++) {
					appIds.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AppIds["+ k +"]"));
				}
				database1.setAppIds(appIds);

				List<String> appServiceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AppServiceIds.Length"); k++) {
					appServiceIds.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AppServiceIds["+ k +"]"));
				}
				database1.setAppServiceIds(appServiceIds);

				List<String> assignedAppServiceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AssignedAppServiceIds.Length"); k++) {
					assignedAppServiceIds.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AssignedAppServiceIds["+ k +"]"));
				}
				database1.setAssignedAppServiceIds(assignedAppServiceIds);

				List<String> sharedWorkspaceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.SharedWorkspaceIds.Length"); k++) {
					sharedWorkspaceIds.add(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.SharedWorkspaceIds["+ k +"]"));
				}
				database1.setSharedWorkspaceIds(sharedWorkspaceIds);

				List<AssignedAppsItem> assignedApps = new ArrayList<AssignedAppsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AssignedApps.Length"); k++) {
					AssignedAppsItem assignedAppsItem = new AssignedAppsItem();
					assignedAppsItem.setAppId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AssignedApps["+ k +"].AppId"));
					assignedAppsItem.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseSchemaResponse.Data["+ i +"].Grants["+ j +"].Account.Database.AssignedApps["+ k +"].WorkspaceId"));

					assignedApps.add(assignedAppsItem);
				}
				database1.setAssignedApps(assignedApps);
				account.setDatabase1(database1);
				grantsItem.setAccount(account);

				grants.add(grantsItem);
			}
			dataItem.setGrants(grants);

			data.add(dataItem);
		}
		queryCasDatabaseSchemaResponse.setData(data);
	 
	 	return queryCasDatabaseSchemaResponse;
	}
}