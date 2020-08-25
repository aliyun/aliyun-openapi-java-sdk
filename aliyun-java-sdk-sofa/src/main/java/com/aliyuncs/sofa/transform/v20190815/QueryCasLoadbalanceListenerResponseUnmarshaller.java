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

import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceListenerResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceListenerResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceListenerResponse.DataItem.HealthMonitor;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceListenerResponse.DataItem.LoadBalancer;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceListenerResponse.DataItem.LoadBalancer.Scope;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasLoadbalanceListenerResponseUnmarshaller {

	public static QueryCasLoadbalanceListenerResponse unmarshall(QueryCasLoadbalanceListenerResponse queryCasLoadbalanceListenerResponse, UnmarshallerContext _ctx) {
		
		queryCasLoadbalanceListenerResponse.setRequestId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.RequestId"));
		queryCasLoadbalanceListenerResponse.setResultCode(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.ResultCode"));
		queryCasLoadbalanceListenerResponse.setResultMessage(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.ResultMessage"));
		queryCasLoadbalanceListenerResponse.setTotalCount(_ctx.longValue("QueryCasLoadbalanceListenerResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasLoadbalanceListenerResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBackendServerPort(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].BackendServerPort"));
			dataItem.setBandwidth(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Bandwidth"));
			dataItem.setCertificateIaasId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].CertificateIaasId"));
			dataItem.setCertificateId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].CertificateId"));
			dataItem.setCookie(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Cookie"));
			dataItem.setCookieTimeout(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].CookieTimeout"));
			dataItem.setDescription(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Description"));
			dataItem.setEstablishedTimeout(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].EstablishedTimeout"));
			dataItem.setGmCryptoCertIaasId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].GmCryptoCertIaasId"));
			dataItem.setIaasId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].IaasId"));
			dataItem.setIaasType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].IaasType"));
			dataItem.setId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Id"));
			dataItem.setIsHealthMonitor(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].IsHealthMonitor"));
			dataItem.setListenerPort(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].ListenerPort"));
			dataItem.setName(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Name"));
			dataItem.setPersistTimeout(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].PersistTimeout"));
			dataItem.setScheduler(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Scheduler"));
			dataItem.setStatus(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Status"));
			dataItem.setStickySession(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].StickySession"));
			dataItem.setStickySessionType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].StickySessionType"));
			dataItem.setType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].Type"));
			dataItem.setUrlPath(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].UrlPath"));
			dataItem.setXForwardedFor(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].XForwardedFor"));

			HealthMonitor healthMonitor = new HealthMonitor();
			healthMonitor.setCheckType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.CheckType"));
			healthMonitor.setConnectPort(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.ConnectPort"));
			healthMonitor.setDomain(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.Domain"));
			healthMonitor.setHealthyThreshold(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.HealthyThreshold"));
			healthMonitor.setHttpMethod(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.HttpMethod"));
			healthMonitor.setId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.Id"));
			healthMonitor.setInterval(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.Interval"));
			healthMonitor.setTimeout(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.Timeout"));
			healthMonitor.setUnHealthyThreshold(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.UnHealthyThreshold"));
			healthMonitor.setUri(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.Uri"));

			List<String> healthCheckHttpCode = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.HealthCheckHttpCode.Length"); j++) {
				healthCheckHttpCode.add(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].HealthMonitor.HealthCheckHttpCode["+ j +"]"));
			}
			healthMonitor.setHealthCheckHttpCode(healthCheckHttpCode);
			dataItem.setHealthMonitor(healthMonitor);

			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setAppId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AppId"));
			loadBalancer.setAutoRenew(_ctx.booleanValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AutoRenew"));
			loadBalancer.setAutoRenewPeriod(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AutoRenewPeriod"));
			loadBalancer.setBandwidth(_ctx.longValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Bandwidth"));
			loadBalancer.setClusterId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.ClusterId"));
			loadBalancer.setClusterMode(_ctx.booleanValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.ClusterMode"));
			loadBalancer.setIaasType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.IaasType"));
			loadBalancer.setId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Id"));
			loadBalancer.setInternetChargeType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.InternetChargeType"));
			loadBalancer.setName(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Name"));
			loadBalancer.setNetworkType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.NetworkType"));
			loadBalancer.setShareMode(_ctx.booleanValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.ShareMode"));
			loadBalancer.setStatus(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Status"));
			loadBalancer.setUtcCreate(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.UtcCreate"));
			loadBalancer.setUtcModified(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.UtcModified"));
			loadBalancer.setVipAddressType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.VipAddressType"));
			loadBalancer.setVipType(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.VipType"));
			loadBalancer.setVpcId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.VpcId"));
			loadBalancer.setVswitchIaasId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.VswitchIaasId"));
			loadBalancer.setWorkspaceId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.WorkspaceId"));
			loadBalancer.setZoneId(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.ZoneId"));

			List<String> appServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AppServiceIds.Length"); j++) {
				appServiceIds.add(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AppServiceIds["+ j +"]"));
			}
			loadBalancer.setAppServiceIds(appServiceIds);

			List<String> assignedAppIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AssignedAppIds.Length"); j++) {
				assignedAppIds.add(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AssignedAppIds["+ j +"]"));
			}
			loadBalancer.setAssignedAppIds(assignedAppIds);

			List<String> assignedAppServiceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AssignedAppServiceIds.Length"); j++) {
				assignedAppServiceIds.add(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.AssignedAppServiceIds["+ j +"]"));
			}
			loadBalancer.setAssignedAppServiceIds(assignedAppServiceIds);

			List<String> domains = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Domains.Length"); j++) {
				domains.add(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Domains["+ j +"]"));
			}
			loadBalancer.setDomains(domains);

			List<String> vipAddresses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.VipAddresses.Length"); j++) {
				vipAddresses.add(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.VipAddresses["+ j +"]"));
			}
			loadBalancer.setVipAddresses(vipAddresses);

			Scope scope = new Scope();
			scope.setCell(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Scope.Cell"));
			scope.setCluster(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Scope.Cluster"));
			scope.setRegion(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Scope.Region"));
			scope.setTenant(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Scope.Tenant"));
			scope.setWorkspace(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Scope.Workspace"));
			scope.setWorkspaceGroup(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Scope.WorkspaceGroup"));
			scope.setZone(_ctx.stringValue("QueryCasLoadbalanceListenerResponse.Data["+ i +"].LoadBalancer.Scope.Zone"));
			loadBalancer.setScope(scope);
			dataItem.setLoadBalancer(loadBalancer);

			data.add(dataItem);
		}
		queryCasLoadbalanceListenerResponse.setData(data);
	 
	 	return queryCasLoadbalanceListenerResponse;
	}
}