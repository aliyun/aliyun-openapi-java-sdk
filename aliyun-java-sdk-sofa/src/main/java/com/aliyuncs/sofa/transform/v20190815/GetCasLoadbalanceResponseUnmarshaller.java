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

import com.aliyuncs.sofa.model.v20190815.GetCasLoadbalanceResponse;
import com.aliyuncs.sofa.model.v20190815.GetCasLoadbalanceResponse.Data;
import com.aliyuncs.sofa.model.v20190815.GetCasLoadbalanceResponse.Data.Scope;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCasLoadbalanceResponseUnmarshaller {

	public static GetCasLoadbalanceResponse unmarshall(GetCasLoadbalanceResponse getCasLoadbalanceResponse, UnmarshallerContext _ctx) {
		
		getCasLoadbalanceResponse.setRequestId(_ctx.stringValue("GetCasLoadbalanceResponse.RequestId"));
		getCasLoadbalanceResponse.setResultCode(_ctx.stringValue("GetCasLoadbalanceResponse.ResultCode"));
		getCasLoadbalanceResponse.setResultMessage(_ctx.stringValue("GetCasLoadbalanceResponse.ResultMessage"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.AppId"));
		data.setAutoRenew(_ctx.booleanValue("GetCasLoadbalanceResponse.Data.AutoRenew"));
		data.setAutoRenewPeriod(_ctx.longValue("GetCasLoadbalanceResponse.Data.AutoRenewPeriod"));
		data.setBandwidth(_ctx.longValue("GetCasLoadbalanceResponse.Data.Bandwidth"));
		data.setClusterId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.ClusterId"));
		data.setClusterMode(_ctx.booleanValue("GetCasLoadbalanceResponse.Data.ClusterMode"));
		data.setIaasId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.IaasId"));
		data.setIaasType(_ctx.stringValue("GetCasLoadbalanceResponse.Data.IaasType"));
		data.setId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Id"));
		data.setInternetChargeType(_ctx.stringValue("GetCasLoadbalanceResponse.Data.InternetChargeType"));
		data.setName(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Name"));
		data.setNetworkType(_ctx.stringValue("GetCasLoadbalanceResponse.Data.NetworkType"));
		data.setProviderId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.ProviderId"));
		data.setRegionId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.RegionId"));
		data.setShareMode(_ctx.booleanValue("GetCasLoadbalanceResponse.Data.ShareMode"));
		data.setStatus(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Status"));
		data.setUtcCreate(_ctx.stringValue("GetCasLoadbalanceResponse.Data.UtcCreate"));
		data.setUtcModified(_ctx.stringValue("GetCasLoadbalanceResponse.Data.UtcModified"));
		data.setVipAddressType(_ctx.stringValue("GetCasLoadbalanceResponse.Data.VipAddressType"));
		data.setVipType(_ctx.stringValue("GetCasLoadbalanceResponse.Data.VipType"));
		data.setVpcId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.VpcId"));
		data.setVSwitchIaasId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.VSwitchIaasId"));
		data.setWorkspaceId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.WorkspaceId"));
		data.setZoneId(_ctx.stringValue("GetCasLoadbalanceResponse.Data.ZoneId"));

		List<String> appServiceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasLoadbalanceResponse.Data.AppServiceIds.Length"); i++) {
			appServiceIds.add(_ctx.stringValue("GetCasLoadbalanceResponse.Data.AppServiceIds["+ i +"]"));
		}
		data.setAppServiceIds(appServiceIds);

		List<String> assignedAppIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasLoadbalanceResponse.Data.AssignedAppIds.Length"); i++) {
			assignedAppIds.add(_ctx.stringValue("GetCasLoadbalanceResponse.Data.AssignedAppIds["+ i +"]"));
		}
		data.setAssignedAppIds(assignedAppIds);

		List<String> assignedAppServiceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasLoadbalanceResponse.Data.AssignedAppServiceIds.Length"); i++) {
			assignedAppServiceIds.add(_ctx.stringValue("GetCasLoadbalanceResponse.Data.AssignedAppServiceIds["+ i +"]"));
		}
		data.setAssignedAppServiceIds(assignedAppServiceIds);

		List<String> domains = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasLoadbalanceResponse.Data.Domains.Length"); i++) {
			domains.add(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Domains["+ i +"]"));
		}
		data.setDomains(domains);

		List<String> vipAddresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCasLoadbalanceResponse.Data.VipAddresses.Length"); i++) {
			vipAddresses.add(_ctx.stringValue("GetCasLoadbalanceResponse.Data.VipAddresses["+ i +"]"));
		}
		data.setVipAddresses(vipAddresses);

		Scope scope = new Scope();
		scope.setCell(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Scope.Cell"));
		scope.setCluster(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Scope.Cluster"));
		scope.setRegion(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Scope.Region"));
		scope.setTenant(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Scope.Tenant"));
		scope.setWorkspace(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Scope.Workspace"));
		scope.setWorkspaceGroup(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Scope.WorkspaceGroup"));
		scope.setZone(_ctx.stringValue("GetCasLoadbalanceResponse.Data.Scope.Zone"));
		data.setScope(scope);
		getCasLoadbalanceResponse.setData(data);
	 
	 	return getCasLoadbalanceResponse;
	}
}