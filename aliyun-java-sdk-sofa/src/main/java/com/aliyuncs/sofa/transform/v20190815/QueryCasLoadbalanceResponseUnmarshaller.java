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

import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceResponse.DataItem.Scope;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasLoadbalanceResponseUnmarshaller {

	public static QueryCasLoadbalanceResponse unmarshall(QueryCasLoadbalanceResponse queryCasLoadbalanceResponse, UnmarshallerContext _ctx) {
		
		queryCasLoadbalanceResponse.setRequestId(_ctx.stringValue("QueryCasLoadbalanceResponse.RequestId"));
		queryCasLoadbalanceResponse.setResultCode(_ctx.stringValue("QueryCasLoadbalanceResponse.ResultCode"));
		queryCasLoadbalanceResponse.setResultMessage(_ctx.stringValue("QueryCasLoadbalanceResponse.ResultMessage"));
		queryCasLoadbalanceResponse.setCurrentPage(_ctx.longValue("QueryCasLoadbalanceResponse.CurrentPage"));
		queryCasLoadbalanceResponse.setPageSize(_ctx.longValue("QueryCasLoadbalanceResponse.PageSize"));
		queryCasLoadbalanceResponse.setTotalCount(_ctx.longValue("QueryCasLoadbalanceResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasLoadbalanceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppId(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].AppId"));
			dataItem.setAutoRenew(_ctx.booleanValue("QueryCasLoadbalanceResponse.Data["+ i +"].AutoRenew"));
			dataItem.setAutoRenewPeriod(_ctx.longValue("QueryCasLoadbalanceResponse.Data["+ i +"].AutoRenewPeriod"));
			dataItem.setBandwidth(_ctx.longValue("QueryCasLoadbalanceResponse.Data["+ i +"].Bandwidth"));
			dataItem.setClusterId(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].ClusterId"));
			dataItem.setClusterMode(_ctx.booleanValue("QueryCasLoadbalanceResponse.Data["+ i +"].ClusterMode"));
			dataItem.setIaasType(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].IaasType"));
			dataItem.setId(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Id"));
			dataItem.setInternetChargeType(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].InternetChargeType"));
			dataItem.setName(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Name"));
			dataItem.setNetworkType(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].NetworkType"));
			dataItem.setShareMode(_ctx.booleanValue("QueryCasLoadbalanceResponse.Data["+ i +"].ShareMode"));
			dataItem.setStatus(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Status"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].UtcModified"));
			dataItem.setVipAddressType(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].VipAddressType"));
			dataItem.setVipType(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].VipType"));
			dataItem.setVpcId(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].VpcId"));
			dataItem.setVswitchIaasId(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].VswitchIaasId"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].WorkspaceId"));
			dataItem.setZoneId(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].ZoneId"));

			List<String> appServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceResponse.Data["+ i +"].AppServiceIds.Length"); j++) {
				appServiceIds.add(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].AppServiceIds["+ j +"]"));
			}
			dataItem.setAppServiceIds(appServiceIds);

			List<String> assignedAppIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceResponse.Data["+ i +"].AssignedAppIds.Length"); j++) {
				assignedAppIds.add(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].AssignedAppIds["+ j +"]"));
			}
			dataItem.setAssignedAppIds(assignedAppIds);

			List<String> assignedAppServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceResponse.Data["+ i +"].AssignedAppServiceIds.Length"); j++) {
				assignedAppServiceIds.add(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].AssignedAppServiceIds["+ j +"]"));
			}
			dataItem.setAssignedAppServiceIds(assignedAppServiceIds);

			List<String> domains = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceResponse.Data["+ i +"].Domains.Length"); j++) {
				domains.add(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Domains["+ j +"]"));
			}
			dataItem.setDomains(domains);

			List<String> vipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceResponse.Data["+ i +"].VipAddresses.Length"); j++) {
				vipAddresses.add(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].VipAddresses["+ j +"]"));
			}
			dataItem.setVipAddresses(vipAddresses);

			Scope scope = new Scope();
			scope.setCell(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Scope.Cell"));
			scope.setCluster(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Scope.Cluster"));
			scope.setRegion(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Scope.Region"));
			scope.setTenant(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Scope.Tenant"));
			scope.setWorkspace(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Scope.Workspace"));
			scope.setWorkspaceGroup(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Scope.WorkspaceGroup"));
			scope.setZone(_ctx.stringValue("QueryCasLoadbalanceResponse.Data["+ i +"].Scope.Zone"));
			dataItem.setScope(scope);

			data.add(dataItem);
		}
		queryCasLoadbalanceResponse.setData(data);
	 
	 	return queryCasLoadbalanceResponse;
	}
}