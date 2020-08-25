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

import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseAccountResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseAccountResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseAccountResponse.DataItem.Database;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseAccountResponse.DataItem.Database.AssignedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasDatabaseAccountResponseUnmarshaller {

	public static QueryCasDatabaseAccountResponse unmarshall(QueryCasDatabaseAccountResponse queryCasDatabaseAccountResponse, UnmarshallerContext _ctx) {
		
		queryCasDatabaseAccountResponse.setRequestId(_ctx.stringValue("QueryCasDatabaseAccountResponse.RequestId"));
		queryCasDatabaseAccountResponse.setResultCode(_ctx.stringValue("QueryCasDatabaseAccountResponse.ResultCode"));
		queryCasDatabaseAccountResponse.setResultMessage(_ctx.stringValue("QueryCasDatabaseAccountResponse.ResultMessage"));
		queryCasDatabaseAccountResponse.setTotalCount(_ctx.longValue("QueryCasDatabaseAccountResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasDatabaseAccountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Description"));
			dataItem.setIaasType(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].IaasType"));
			dataItem.setId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Name"));
			dataItem.setPassword(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Password"));
			dataItem.setPrivilege(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Privilege"));
			dataItem.setStatus(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Status"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].UtcModified"));

			Database database = new Database();
			database.setAutoRenew(_ctx.booleanValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AutoRenew"));
			database.setAutoRenewPeriod(_ctx.longValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AutoRenewPeriod"));
			database.setConnectionAddress(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.ConnectionAddress"));
			database.setCpu(_ctx.longValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Cpu"));
			database.setDescription(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Description"));
			database.setEngine(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Engine"));
			database.setEngineVersion(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.EngineVersion"));
			database.setIaasId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.IaasId"));
			database.setIaasType(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.IaasType"));
			database.setId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Id"));
			database.setMasterZoneId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.MasterZoneId"));
			database.setMaxConnections(_ctx.longValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.MaxConnections"));
			database.setMaxIops(_ctx.longValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.MaxIops"));
			database.setMemory(_ctx.longValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Memory"));
			database.setName(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Name"));
			database.setNetworkType(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.NetworkType"));
			database.setNetType(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.NetType"));
			database.setPort(_ctx.longValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Port"));
			database.setSpecIaasId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.SpecIaasId"));
			database.setStatus(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Status"));
			database.setStorage(_ctx.longValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Storage"));
			database.setType(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.Type"));
			database.setUtcCreate(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.UtcCreate"));
			database.setUtcModified(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.UtcModified"));
			database.setVpcId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.VpcId"));
			database.setVSwitchIaasId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.VSwitchIaasId"));
			database.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.WorkspaceId"));

			List<String> appIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AppIds.Length"); j++) {
				appIds.add(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AppIds["+ j +"]"));
			}
			database.setAppIds(appIds);

			List<String> appServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AppServiceIds.Length"); j++) {
				appServiceIds.add(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AppServiceIds["+ j +"]"));
			}
			database.setAppServiceIds(appServiceIds);

			List<String> assignedAppServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AssignedAppServiceIds.Length"); j++) {
				assignedAppServiceIds.add(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AssignedAppServiceIds["+ j +"]"));
			}
			database.setAssignedAppServiceIds(assignedAppServiceIds);

			List<String> sharedWorkspaceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.SharedWorkspaceIds.Length"); j++) {
				sharedWorkspaceIds.add(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.SharedWorkspaceIds["+ j +"]"));
			}
			database.setSharedWorkspaceIds(sharedWorkspaceIds);

			List<AssignedAppsItem> assignedApps = new ArrayList<AssignedAppsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AssignedApps.Length"); j++) {
				AssignedAppsItem assignedAppsItem = new AssignedAppsItem();
				assignedAppsItem.setAppId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AssignedApps["+ j +"].AppId"));
				assignedAppsItem.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseAccountResponse.Data["+ i +"].Database.AssignedApps["+ j +"].WorkspaceId"));

				assignedApps.add(assignedAppsItem);
			}
			database.setAssignedApps(assignedApps);
			dataItem.setDatabase(database);

			data.add(dataItem);
		}
		queryCasDatabaseAccountResponse.setData(data);
	 
	 	return queryCasDatabaseAccountResponse;
	}
}