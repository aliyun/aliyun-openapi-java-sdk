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

import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings2;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings2.ConsistentHashLBConfig3;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings2.ConsistentHashLBConfig3.HttpCookie4;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.TlsSetting1;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.LabelDetailsItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.PortTrafficPolicyListItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.PortTrafficPolicyListItem.TrafficPolicy;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.PortTrafficPolicyListItem.TrafficPolicy.LoadBalancerSettings;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.PortTrafficPolicyListItem.TrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.PortTrafficPolicyListItem.TrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.PortTrafficPolicyListItem.TrafficPolicy.TlsSetting;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.VersionDetailsItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.VersionDetailsItem.ServiceVersion;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.VersionDetailsItem.ServiceVersion.LabelsItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayServiceDetailResponse.Data.VersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayServiceDetailResponseUnmarshaller {

	public static GetGatewayServiceDetailResponse unmarshall(GetGatewayServiceDetailResponse getGatewayServiceDetailResponse, UnmarshallerContext _ctx) {
		
		getGatewayServiceDetailResponse.setRequestId(_ctx.stringValue("GetGatewayServiceDetailResponse.RequestId"));
		getGatewayServiceDetailResponse.setHttpStatusCode(_ctx.integerValue("GetGatewayServiceDetailResponse.HttpStatusCode"));
		getGatewayServiceDetailResponse.setMessage(_ctx.stringValue("GetGatewayServiceDetailResponse.Message"));
		getGatewayServiceDetailResponse.setCode(_ctx.integerValue("GetGatewayServiceDetailResponse.Code"));
		getGatewayServiceDetailResponse.setSuccess(_ctx.booleanValue("GetGatewayServiceDetailResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetGatewayServiceDetailResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("GetGatewayServiceDetailResponse.Data.GatewayId"));
		data.setSourceType(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.SourceType"));
		data.setNamespace(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.Namespace"));
		data.setGroupName(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GroupName"));
		data.setSourceId(_ctx.longValue("GetGatewayServiceDetailResponse.Data.SourceId"));
		data.setServiceNameInRegistry(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.ServiceNameInRegistry"));
		data.setMetaInfo(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.MetaInfo"));
		data.setGmtCreate(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GmtModified"));
		data.setHealthStatus(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.HealthStatus"));
		data.setHealthCheck(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.HealthCheck"));
		data.setServiceProtocol(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.ServiceProtocol"));

		List<String> ips = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.Ips.Length"); i++) {
			ips.add(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.Ips["+ i +"]"));
		}
		data.setIps(ips);

		List<Integer> ports = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.Ports.Length"); i++) {
			ports.add(_ctx.integerValue("GetGatewayServiceDetailResponse.Data.Ports["+ i +"]"));
		}
		data.setPorts(ports);

		GatewayTrafficPolicy gatewayTrafficPolicy = new GatewayTrafficPolicy();

		TlsSetting1 tlsSetting1 = new TlsSetting1();
		tlsSetting1.setTlsMode(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.TlsSetting.TlsMode"));
		tlsSetting1.setCertId(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.TlsSetting.CertId"));
		tlsSetting1.setCaCertContent(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.TlsSetting.CaCertContent"));
		tlsSetting1.setSni(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.TlsSetting.Sni"));
		gatewayTrafficPolicy.setTlsSetting1(tlsSetting1);

		LoadBalancerSettings2 loadBalancerSettings2 = new LoadBalancerSettings2();
		loadBalancerSettings2.setLoadbalancerType(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.LoadbalancerType"));
		loadBalancerSettings2.setWarmupDuration(_ctx.longValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.WarmupDuration"));

		ConsistentHashLBConfig3 consistentHashLBConfig3 = new ConsistentHashLBConfig3();
		consistentHashLBConfig3.setParameterName(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ParameterName"));
		consistentHashLBConfig3.setConsistentHashLBType(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ConsistentHashLBType"));

		HttpCookie4 httpCookie4 = new HttpCookie4();
		httpCookie4.setName(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Name"));
		httpCookie4.setPath(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Path"));
		httpCookie4.setTTL(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.GatewayTrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.TTL"));
		consistentHashLBConfig3.setHttpCookie4(httpCookie4);
		loadBalancerSettings2.setConsistentHashLBConfig3(consistentHashLBConfig3);
		gatewayTrafficPolicy.setLoadBalancerSettings2(loadBalancerSettings2);
		data.setGatewayTrafficPolicy(gatewayTrafficPolicy);

		List<VersionsItem> versions = new ArrayList<VersionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.Versions.Length"); i++) {
			VersionsItem versionsItem = new VersionsItem();
			versionsItem.setLabel(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.Versions["+ i +"].Label"));
			versionsItem.setValue(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.Versions["+ i +"].Value"));
			versionsItem.setType(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.Versions["+ i +"].Type"));

			versions.add(versionsItem);
		}
		data.setVersions(versions);

		List<LabelDetailsItem> labelDetails = new ArrayList<LabelDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.LabelDetails.Length"); i++) {
			LabelDetailsItem labelDetailsItem = new LabelDetailsItem();
			labelDetailsItem.setKey(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.LabelDetails["+ i +"].Key"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.LabelDetails["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.LabelDetails["+ i +"].Values["+ j +"]"));
			}
			labelDetailsItem.setValues(values);

			labelDetails.add(labelDetailsItem);
		}
		data.setLabelDetails(labelDetails);

		List<VersionDetailsItem> versionDetails = new ArrayList<VersionDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.VersionDetails.Length"); i++) {
			VersionDetailsItem versionDetailsItem = new VersionDetailsItem();
			versionDetailsItem.setEndpointNum(_ctx.integerValue("GetGatewayServiceDetailResponse.Data.VersionDetails["+ i +"].EndpointNum"));
			versionDetailsItem.setEndpointNumPercent(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.VersionDetails["+ i +"].EndpointNumPercent"));

			ServiceVersion serviceVersion = new ServiceVersion();
			serviceVersion.setName(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.VersionDetails["+ i +"].ServiceVersion.Name"));

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.VersionDetails["+ i +"].ServiceVersion.Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setKey(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.VersionDetails["+ i +"].ServiceVersion.Labels["+ j +"].Key"));
				labelsItem.setValue(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.VersionDetails["+ i +"].ServiceVersion.Labels["+ j +"].Value"));

				labels.add(labelsItem);
			}
			serviceVersion.setLabels(labels);
			versionDetailsItem.setServiceVersion(serviceVersion);

			versionDetails.add(versionDetailsItem);
		}
		data.setVersionDetails(versionDetails);

		List<PortTrafficPolicyListItem> portTrafficPolicyList = new ArrayList<PortTrafficPolicyListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList.Length"); i++) {
			PortTrafficPolicyListItem portTrafficPolicyListItem = new PortTrafficPolicyListItem();
			portTrafficPolicyListItem.setId(_ctx.longValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].Id"));
			portTrafficPolicyListItem.setServiceId(_ctx.longValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].ServiceId"));
			portTrafficPolicyListItem.setServicePort(_ctx.integerValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].ServicePort"));
			portTrafficPolicyListItem.setGatewayUniqueId(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].GatewayUniqueId"));
			portTrafficPolicyListItem.setGmtCreate(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].GmtCreate"));
			portTrafficPolicyListItem.setGmtModified(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].GmtModified"));

			TrafficPolicy trafficPolicy = new TrafficPolicy();

			TlsSetting tlsSetting = new TlsSetting();
			tlsSetting.setTlsMode(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.TlsSetting.TlsMode"));
			tlsSetting.setCertId(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.TlsSetting.CertId"));
			tlsSetting.setCaCertContent(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.TlsSetting.CaCertContent"));
			tlsSetting.setSni(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.TlsSetting.Sni"));
			trafficPolicy.setTlsSetting(tlsSetting);

			LoadBalancerSettings loadBalancerSettings = new LoadBalancerSettings();
			loadBalancerSettings.setLoadbalancerType(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.LoadBalancerSettings.LoadbalancerType"));
			loadBalancerSettings.setWarmupDuration(_ctx.longValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.LoadBalancerSettings.WarmupDuration"));

			ConsistentHashLBConfig consistentHashLBConfig = new ConsistentHashLBConfig();
			consistentHashLBConfig.setParameterName(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ParameterName"));
			consistentHashLBConfig.setConsistentHashLBType(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.ConsistentHashLBType"));

			HttpCookie httpCookie = new HttpCookie();
			httpCookie.setName(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Name"));
			httpCookie.setPath(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.Path"));
			httpCookie.setTTL(_ctx.stringValue("GetGatewayServiceDetailResponse.Data.PortTrafficPolicyList["+ i +"].TrafficPolicy.LoadBalancerSettings.ConsistentHashLBConfig.HttpCookie.TTL"));
			consistentHashLBConfig.setHttpCookie(httpCookie);
			loadBalancerSettings.setConsistentHashLBConfig(consistentHashLBConfig);
			trafficPolicy.setLoadBalancerSettings(loadBalancerSettings);
			portTrafficPolicyListItem.setTrafficPolicy(trafficPolicy);

			portTrafficPolicyList.add(portTrafficPolicyListItem);
		}
		data.setPortTrafficPolicyList(portTrafficPolicyList);
		getGatewayServiceDetailResponse.setData(data);
	 
	 	return getGatewayServiceDetailResponse;
	}
}