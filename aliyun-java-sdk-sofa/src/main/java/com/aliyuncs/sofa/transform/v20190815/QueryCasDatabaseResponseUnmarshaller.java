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

import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseResponse.DataItem.AssignedAppsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasDatabaseResponseUnmarshaller {

	public static QueryCasDatabaseResponse unmarshall(QueryCasDatabaseResponse queryCasDatabaseResponse, UnmarshallerContext _ctx) {
		
		queryCasDatabaseResponse.setRequestId(_ctx.stringValue("QueryCasDatabaseResponse.RequestId"));
		queryCasDatabaseResponse.setResultCode(_ctx.stringValue("QueryCasDatabaseResponse.ResultCode"));
		queryCasDatabaseResponse.setResultMessage(_ctx.stringValue("QueryCasDatabaseResponse.ResultMessage"));
		queryCasDatabaseResponse.setCurrentPage(_ctx.longValue("QueryCasDatabaseResponse.CurrentPage"));
		queryCasDatabaseResponse.setPageSize(_ctx.longValue("QueryCasDatabaseResponse.PageSize"));
		queryCasDatabaseResponse.setTotalCount(_ctx.longValue("QueryCasDatabaseResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasDatabaseResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAutoRenew(_ctx.booleanValue("QueryCasDatabaseResponse.Data["+ i +"].AutoRenew"));
			dataItem.setAutoRenewPeriod(_ctx.longValue("QueryCasDatabaseResponse.Data["+ i +"].AutoRenewPeriod"));
			dataItem.setConnectionAddress(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].ConnectionAddress"));
			dataItem.setCpu(_ctx.longValue("QueryCasDatabaseResponse.Data["+ i +"].Cpu"));
			dataItem.setDescription(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].Description"));
			dataItem.setEngine(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].Engine"));
			dataItem.setEngineVersion(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].EngineVersion"));
			dataItem.setIaasId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].IaasId"));
			dataItem.setIaasType(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].IaasType"));
			dataItem.setId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].Id"));
			dataItem.setMasterZoneId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].MasterZoneId"));
			dataItem.setMaxConnections(_ctx.longValue("QueryCasDatabaseResponse.Data["+ i +"].MaxConnections"));
			dataItem.setMaxIops(_ctx.longValue("QueryCasDatabaseResponse.Data["+ i +"].MaxIops"));
			dataItem.setMemory(_ctx.longValue("QueryCasDatabaseResponse.Data["+ i +"].Memory"));
			dataItem.setName(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].Name"));
			dataItem.setNetworkType(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].NetworkType"));
			dataItem.setNetType(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].NetType"));
			dataItem.setPort(_ctx.longValue("QueryCasDatabaseResponse.Data["+ i +"].Port"));
			dataItem.setSpecIaasId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].SpecIaasId"));
			dataItem.setStatus(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].Status"));
			dataItem.setStorage(_ctx.longValue("QueryCasDatabaseResponse.Data["+ i +"].Storage"));
			dataItem.setType(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].Type"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].UtcModified"));
			dataItem.setVpcId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].VpcId"));
			dataItem.setVSwitchIaasId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].VSwitchIaasId"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].WorkspaceId"));

			List<String> appIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseResponse.Data["+ i +"].AppIds.Length"); j++) {
				appIds.add(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].AppIds["+ j +"]"));
			}
			dataItem.setAppIds(appIds);

			List<String> appServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseResponse.Data["+ i +"].AppServiceIds.Length"); j++) {
				appServiceIds.add(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].AppServiceIds["+ j +"]"));
			}
			dataItem.setAppServiceIds(appServiceIds);

			List<String> assignedAppServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseResponse.Data["+ i +"].AssignedAppServiceIds.Length"); j++) {
				assignedAppServiceIds.add(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].AssignedAppServiceIds["+ j +"]"));
			}
			dataItem.setAssignedAppServiceIds(assignedAppServiceIds);

			List<String> sharedWorkspaceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseResponse.Data["+ i +"].SharedWorkspaceIds.Length"); j++) {
				sharedWorkspaceIds.add(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].SharedWorkspaceIds["+ j +"]"));
			}
			dataItem.setSharedWorkspaceIds(sharedWorkspaceIds);

			List<AssignedAppsItem> assignedApps = new ArrayList<AssignedAppsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseResponse.Data["+ i +"].AssignedApps.Length"); j++) {
				AssignedAppsItem assignedAppsItem = new AssignedAppsItem();
				assignedAppsItem.setAppId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].AssignedApps["+ j +"].AppId"));
				assignedAppsItem.setWorkspaceId(_ctx.stringValue("QueryCasDatabaseResponse.Data["+ i +"].AssignedApps["+ j +"].WorkspaceId"));

				assignedApps.add(assignedAppsItem);
			}
			dataItem.setAssignedApps(assignedApps);

			data.add(dataItem);
		}
		queryCasDatabaseResponse.setData(data);
	 
	 	return queryCasDatabaseResponse;
	}
}