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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.GatewayTrafficPolicy;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.GatewayTrafficPolicy.LoadBalancerSettings;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.GatewayTrafficPolicy.Tls;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.HealthCheckInfo;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.VersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayServiceResponseUnmarshaller {

	public static ListGatewayServiceResponse unmarshall(ListGatewayServiceResponse listGatewayServiceResponse, UnmarshallerContext _ctx) {
		
		listGatewayServiceResponse.setRequestId(_ctx.stringValue("ListGatewayServiceResponse.RequestId"));
		listGatewayServiceResponse.setHttpStatusCode(_ctx.integerValue("ListGatewayServiceResponse.HttpStatusCode"));
		listGatewayServiceResponse.setMessage(_ctx.stringValue("ListGatewayServiceResponse.Message"));
		listGatewayServiceResponse.setCode(_ctx.integerValue("ListGatewayServiceResponse.Code"));
		listGatewayServiceResponse.setSuccess(_ctx.booleanValue("ListGatewayServiceResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.longValue("ListGatewayServiceResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("ListGatewayServiceResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGatewayServiceResponse.Data.PageSize"));

		List<Services> result = new ArrayList<Services>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result.Length"); i++) {
			Services services = new Services();
			services.setId(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].Id"));
			services.setName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Name"));
			services.setGatewayUniqueId(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayUniqueId"));
			services.setGatewayId(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayId"));
			services.setSourceType(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].SourceType"));
			services.setNamespace(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Namespace"));
			services.setGroupName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GroupName"));
			services.setSourceId(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].SourceId"));
			services.setServiceNameInRegistry(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].ServiceNameInRegistry"));
			services.setMetaInfo(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].MetaInfo"));
			services.setGmtCreate(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GmtCreate"));
			services.setGmtModified(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GmtModified"));
			services.setServiceProtocol(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].ServiceProtocol"));
			services.setServicePort(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].ServicePort"));
			services.setHealehStatus(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealehStatus"));
			services.setHealthStatus(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthStatus"));
			services.setHealthCheck(_ctx.booleanValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheck"));

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Ips["+ j +"]"));
			}
			services.setIps(ips);

			List<String> unhealthyEndpoints = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result["+ i +"].UnhealthyEndpoints.Length"); j++) {
				unhealthyEndpoints.add(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].UnhealthyEndpoints["+ j +"]"));
			}
			services.setUnhealthyEndpoints(unhealthyEndpoints);

			HealthCheckInfo healthCheckInfo = new HealthCheckInfo();
			healthCheckInfo.setCheck(_ctx.booleanValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.Check"));
			healthCheckInfo.setBizProtocol(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.Protocol"));
			healthCheckInfo.setTimeout(_ctx.integerValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.Timeout"));
			healthCheckInfo.setInterval(_ctx.integerValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.Interval"));
			healthCheckInfo.setHealthyThreshold(_ctx.integerValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.HealthyThreshold"));
			healthCheckInfo.setUnhealthyThreshold(_ctx.integerValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.UnhealthyThreshold"));
			healthCheckInfo.setHttpPath(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.HttpPath"));
			healthCheckInfo.setHttpHost(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.HttpHost"));

			List<Integer> expectedStatuses = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.ExpectedStatuses.Length"); j++) {
				expectedStatuses.add(_ctx.integerValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealthCheckInfo.ExpectedStatuses["+ j +"]"));
			}
			healthCheckInfo.setExpectedStatuses(expectedStatuses);
			services.setHealthCheckInfo(healthCheckInfo);

			GatewayTrafficPolicy gatewayTrafficPolicy = new GatewayTrafficPolicy();

			Tls tls = new Tls();
			tls.setMode(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.Tls.Mode"));
			tls.setCertId(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.Tls.CertId"));
			tls.setCaCertId(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.Tls.CaCertId"));
			tls.setCaCertContent(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.Tls.CaCertContent"));
			tls.setSni(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.Tls.Sni"));

			List<String> subjectAltNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.Tls.SubjectAltNames.Length"); j++) {
				subjectAltNames.add(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.Tls.SubjectAltNames["+ j +"]"));
			}
			tls.setSubjectAltNames(subjectAltNames);
			gatewayTrafficPolicy.setTls(tls);

			LoadBalancerSettings loadBalancerSettings = new LoadBalancerSettings();
			loadBalancerSettings.setLoadbalancerType(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.LoadbalancerType"));
			loadBalancerSettings.setWarmupDuration(_ctx.integerValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.WarmupDuration"));

			ConsistentHashLBConfig consistentHashLBConfig = new ConsistentHashLBConfig();
			consistentHashLBConfig.setParameterName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ParameterName"));
			consistentHashLBConfig.setMinimumRingSize(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.MinimumRingSize"));
			consistentHashLBConfig.setConsistentHashLBType(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ConsistentHashLBType"));

			HttpCookie httpCookie = new HttpCookie();
			httpCookie.setName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Name"));
			httpCookie.setPath(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Path"));
			httpCookie.setTtl(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Ttl"));
			consistentHashLBConfig.setHttpCookie(httpCookie);
			loadBalancerSettings.setConsistentHashLBConfig(consistentHashLBConfig);
			gatewayTrafficPolicy.setLoadBalancerSettings(loadBalancerSettings);
			services.setGatewayTrafficPolicy(gatewayTrafficPolicy);

			List<VersionsItem> versions = new ArrayList<VersionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result["+ i +"].Versions.Length"); j++) {
				VersionsItem versionsItem = new VersionsItem();
				versionsItem.setName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Versions["+ j +"].Name"));

				versions.add(versionsItem);
			}
			services.setVersions(versions);

			result.add(services);
		}
		data.setResult(result);
		listGatewayServiceResponse.setData(data);
	 
	 	return listGatewayServiceResponse;
	}
}