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

import com.aliyuncs.sofa.model.v20190815.GetCasDatabaseResponse;
import com.aliyuncs.sofa.model.v20190815.GetCasDatabaseResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetCasDatabaseResponse.Data.AssignedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCasDatabaseResponseUnmarshaller {

	public static GetCasDatabaseResponse unmarshall(GetCasDatabaseResponse getCasDatabaseResponse, UnmarshallerContext _ctx) {
		
		getCasDatabaseResponse.setRequestId(_ctx.stringValue("GetCasDatabaseResponse.RequestId"));
		getCasDatabaseResponse.setResultCode(_ctx.stringValue("GetCasDatabaseResponse.ResultCode"));
		getCasDatabaseResponse.setResultMessage(_ctx.stringValue("GetCasDatabaseResponse.ResultMessage"));

		Data data = new Data();
		data.setAutoRenew(_ctx.booleanValue("GetCasDatabaseResponse.Data.AutoRenew"));
		data.setAutoRenewPeriod(_ctx.longValue("GetCasDatabaseResponse.Data.AutoRenewPeriod"));
		data.setConnectionAddress(_ctx.stringValue("GetCasDatabaseResponse.Data.ConnectionAddress"));
		data.setCpu(_ctx.longValue("GetCasDatabaseResponse.Data.Cpu"));
		data.setDescription(_ctx.stringValue("GetCasDatabaseResponse.Data.Description"));
		data.setEngine(_ctx.stringValue("GetCasDatabaseResponse.Data.Engine"));
		data.setEngineVersion(_ctx.stringValue("GetCasDatabaseResponse.Data.EngineVersion"));
		data.setIaasId(_ctx.stringValue("GetCasDatabaseResponse.Data.IaasId"));
		data.setIaasType(_ctx.stringValue("GetCasDatabaseResponse.Data.IaasType"));
		data.setId(_ctx.stringValue("GetCasDatabaseResponse.Data.Id"));
		data.setMasterZoneId(_ctx.stringValue("GetCasDatabaseResponse.Data.MasterZoneId"));
		data.setMaxConnections(_ctx.longValue("GetCasDatabaseResponse.Data.MaxConnections"));
		data.setMaxIops(_ctx.longValue("GetCasDatabaseResponse.Data.MaxIops"));
		data.setMemory(_ctx.longValue("GetCasDatabaseResponse.Data.Memory"));
		data.setName(_ctx.stringValue("GetCasDatabaseResponse.Data.Name"));
		data.setNetworkType(_ctx.stringValue("GetCasDatabaseResponse.Data.NetworkType"));
		data.setNetType(_ctx.stringValue("GetCasDatabaseResponse.Data.NetType"));
		data.setPort(_ctx.longValue("GetCasDatabaseResponse.Data.Port"));
		data.setSpecIaasId(_ctx.stringValue("GetCasDatabaseResponse.Data.SpecIaasId"));
		data.setStatus(_ctx.stringValue("GetCasDatabaseResponse.Data.Status"));
		data.setStorage(_ctx.longValue("GetCasDatabaseResponse.Data.Storage"));
		data.setType(_ctx.stringValue("GetCasDatabaseResponse.Data.Type"));
		data.setUtcCreate(_ctx.stringValue("GetCasDatabaseResponse.Data.UtcCreate"));
		data.setUtcModified(_ctx.stringValue("GetCasDatabaseResponse.Data.UtcModified"));
		data.setVpcId(_ctx.stringValue("GetCasDatabaseResponse.Data.VpcId"));
		data.setVSwitchIaasId(_ctx.stringValue("GetCasDatabaseResponse.Data.VSwitchIaasId"));
		data.setWorkspaceId(_ctx.stringValue("GetCasDatabaseResponse.Data.WorkspaceId"));

		List<String> appIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasDatabaseResponse.Data.AppIds.Length"); i++) {
			appIds.add(_ctx.stringValue("GetCasDatabaseResponse.Data.AppIds["+ i +"]"));
		}
		data.setAppIds(appIds);

		List<String> appServiceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasDatabaseResponse.Data.AppServiceIds.Length"); i++) {
			appServiceIds.add(_ctx.stringValue("GetCasDatabaseResponse.Data.AppServiceIds["+ i +"]"));
		}
		data.setAppServiceIds(appServiceIds);

		List<String> assignedAppServiceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasDatabaseResponse.Data.AssignedAppServiceIds.Length"); i++) {
			assignedAppServiceIds.add(_ctx.stringValue("GetCasDatabaseResponse.Data.AssignedAppServiceIds["+ i +"]"));
		}
		data.setAssignedAppServiceIds(assignedAppServiceIds);

		List<String> sharedWorkspaceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasDatabaseResponse.Data.SharedWorkspaceIds.Length"); i++) {
			sharedWorkspaceIds.add(_ctx.stringValue("GetCasDatabaseResponse.Data.SharedWorkspaceIds["+ i +"]"));
		}
		data.setSharedWorkspaceIds(sharedWorkspaceIds);

		List<AssignedAppsItem> assignedApps = new ArrayList<AssignedAppsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCasDatabaseResponse.Data.AssignedApps.Length"); i++) {
			AssignedAppsItem assignedAppsItem = new AssignedAppsItem();
			assignedAppsItem.setAppId(_ctx.stringValue("GetCasDatabaseResponse.Data.AssignedApps["+ i +"].AppId"));
			assignedAppsItem.setWorkspaceId(_ctx.stringValue("GetCasDatabaseResponse.Data.AssignedApps["+ i +"].WorkspaceId"));

			assignedApps.add(assignedAppsItem);
		}
		data.setAssignedApps(assignedApps);
		getCasDatabaseResponse.setData(data);
	 
	 	return getCasDatabaseResponse;
	}
}