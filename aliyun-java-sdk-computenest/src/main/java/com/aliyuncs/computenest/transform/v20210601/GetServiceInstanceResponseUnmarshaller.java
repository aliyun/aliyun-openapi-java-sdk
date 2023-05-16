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

package com.aliyuncs.computenest.transform.v20210601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.NetworkConfig;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnection;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnection.ConnectionConfig;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.NetworkConfig.ReversePrivateVpcConnection;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.Service;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.Service.ServiceInfo;
import com.aliyuncs.computenest.model.v20210601.GetServiceInstanceResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceInstanceResponseUnmarshaller {

	public static GetServiceInstanceResponse unmarshall(GetServiceInstanceResponse getServiceInstanceResponse, UnmarshallerContext _ctx) {
		
		getServiceInstanceResponse.setRequestId(_ctx.stringValue("GetServiceInstanceResponse.RequestId"));
		getServiceInstanceResponse.setOutputs(_ctx.stringValue("GetServiceInstanceResponse.Outputs"));
		getServiceInstanceResponse.setStatus(_ctx.stringValue("GetServiceInstanceResponse.Status"));
		getServiceInstanceResponse.setTemplateName(_ctx.stringValue("GetServiceInstanceResponse.TemplateName"));
		getServiceInstanceResponse.setUpdateTime(_ctx.stringValue("GetServiceInstanceResponse.UpdateTime"));
		getServiceInstanceResponse.setProgress(_ctx.longValue("GetServiceInstanceResponse.Progress"));
		getServiceInstanceResponse.setParameters(_ctx.stringValue("GetServiceInstanceResponse.Parameters"));
		getServiceInstanceResponse.setServiceInstanceId(_ctx.stringValue("GetServiceInstanceResponse.ServiceInstanceId"));
		getServiceInstanceResponse.setCreateTime(_ctx.stringValue("GetServiceInstanceResponse.CreateTime"));
		getServiceInstanceResponse.setStatusDetail(_ctx.stringValue("GetServiceInstanceResponse.StatusDetail"));
		getServiceInstanceResponse.setResources(_ctx.stringValue("GetServiceInstanceResponse.Resources"));
		getServiceInstanceResponse.setOperationStartTime(_ctx.stringValue("GetServiceInstanceResponse.OperationStartTime"));
		getServiceInstanceResponse.setOperationEndTime(_ctx.stringValue("GetServiceInstanceResponse.OperationEndTime"));
		getServiceInstanceResponse.setOperatedServiceInstanceId(_ctx.stringValue("GetServiceInstanceResponse.OperatedServiceInstanceId"));
		getServiceInstanceResponse.setEnableInstanceOps(_ctx.booleanValue("GetServiceInstanceResponse.EnableInstanceOps"));
		getServiceInstanceResponse.setIsOperated(_ctx.booleanValue("GetServiceInstanceResponse.IsOperated"));
		getServiceInstanceResponse.setLicenseEndTime(_ctx.stringValue("GetServiceInstanceResponse.LicenseEndTime"));
		getServiceInstanceResponse.setUserId(_ctx.longValue("GetServiceInstanceResponse.UserId"));
		getServiceInstanceResponse.setSupplierUid(_ctx.longValue("GetServiceInstanceResponse.SupplierUid"));
		getServiceInstanceResponse.setEndTime(_ctx.stringValue("GetServiceInstanceResponse.EndTime"));
		getServiceInstanceResponse.setSource(_ctx.stringValue("GetServiceInstanceResponse.Source"));
		getServiceInstanceResponse.setServiceType(_ctx.stringValue("GetServiceInstanceResponse.ServiceType"));
		getServiceInstanceResponse.setPayType(_ctx.stringValue("GetServiceInstanceResponse.PayType"));
		getServiceInstanceResponse.setName(_ctx.stringValue("GetServiceInstanceResponse.Name"));
		getServiceInstanceResponse.setEnableUserPrometheus(_ctx.booleanValue("GetServiceInstanceResponse.EnableUserPrometheus"));
		getServiceInstanceResponse.setComponents(_ctx.stringValue("GetServiceInstanceResponse.Components"));
		getServiceInstanceResponse.setPredefinedParameterName(_ctx.stringValue("GetServiceInstanceResponse.PredefinedParameterName"));
		getServiceInstanceResponse.setMarketInstanceId(_ctx.stringValue("GetServiceInstanceResponse.MarketInstanceId"));
		getServiceInstanceResponse.setResourceGroupId(_ctx.stringValue("GetServiceInstanceResponse.ResourceGroupId"));

		Service service = new Service();
		service.setStatus(_ctx.stringValue("GetServiceInstanceResponse.Service.Status"));
		service.setPublishTime(_ctx.stringValue("GetServiceInstanceResponse.Service.PublishTime"));
		service.setVersion(_ctx.stringValue("GetServiceInstanceResponse.Service.Version"));
		service.setDeployMetadata(_ctx.stringValue("GetServiceInstanceResponse.Service.DeployMetadata"));
		service.setDeployType(_ctx.stringValue("GetServiceInstanceResponse.Service.DeployType"));
		service.setServiceId(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceId"));
		service.setSupplierUrl(_ctx.stringValue("GetServiceInstanceResponse.Service.SupplierUrl"));
		service.setServiceType(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceType"));
		service.setSupplierName(_ctx.stringValue("GetServiceInstanceResponse.Service.SupplierName"));
		service.setVersionName(_ctx.stringValue("GetServiceInstanceResponse.Service.VersionName"));
		service.setUpgradeMetadata(_ctx.stringValue("GetServiceInstanceResponse.Service.UpgradeMetadata"));
		service.setServiceProductUrl(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceProductUrl"));
		service.setServiceDocUrl(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceDocUrl"));

		List<String> upgradableServiceVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceInstanceResponse.Service.UpgradableServiceVersions.Length"); i++) {
			upgradableServiceVersions.add(_ctx.stringValue("GetServiceInstanceResponse.Service.UpgradableServiceVersions["+ i +"]"));
		}
		service.setUpgradableServiceVersions(upgradableServiceVersions);

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceInstanceResponse.Service.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setLocale(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].Locale"));
			serviceInfo.setImage(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].Image"));
			serviceInfo.setName(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].Name"));
			serviceInfo.setShortDescription(_ctx.stringValue("GetServiceInstanceResponse.Service.ServiceInfos["+ i +"].ShortDescription"));

			serviceInfos.add(serviceInfo);
		}
		service.setServiceInfos(serviceInfos);
		getServiceInstanceResponse.setService(service);

		NetworkConfig networkConfig = new NetworkConfig();
		networkConfig.setEndpointId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.EndpointId"));
		networkConfig.setPrivateZoneId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateZoneId"));

		List<PrivateVpcConnection> privateVpcConnections = new ArrayList<PrivateVpcConnection>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections.Length"); i++) {
			PrivateVpcConnection privateVpcConnection = new PrivateVpcConnection();
			privateVpcConnection.setEndpointId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].EndpointId"));
			privateVpcConnection.setPrivateZoneId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].PrivateZoneId"));
			privateVpcConnection.setPrivateZoneName(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].PrivateZoneName"));
			privateVpcConnection.setRegionId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].RegionId"));

			List<ConnectionConfig> connectionConfigs = new ArrayList<ConnectionConfig>();
			for (int j = 0; j < _ctx.lengthValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs.Length"); j++) {
				ConnectionConfig connectionConfig = new ConnectionConfig();
				connectionConfig.setVpcId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].VpcId"));
				connectionConfig.setIngressEndpointStatus(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].IngressEndpointStatus"));
				connectionConfig.setNetworkServiceStatus(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].NetworkServiceStatus"));
				connectionConfig.setDomainName(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].DomainName"));
				connectionConfig.setRegionId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].RegionId"));
				connectionConfig.setConnectBandwidth(_ctx.integerValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].ConnectBandwidth"));

				List<String> securityGroups = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].SecurityGroups.Length"); k++) {
					securityGroups.add(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].SecurityGroups["+ k +"]"));
				}
				connectionConfig.setSecurityGroups(securityGroups);

				List<String> vSwitches = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].VSwitches.Length"); k++) {
					vSwitches.add(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].VSwitches["+ k +"]"));
				}
				connectionConfig.setVSwitches(vSwitches);

				List<String> endpointIps = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].EndpointIps.Length"); k++) {
					endpointIps.add(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.PrivateVpcConnections["+ i +"].ConnectionConfigs["+ j +"].EndpointIps["+ k +"]"));
				}
				connectionConfig.setEndpointIps(endpointIps);

				connectionConfigs.add(connectionConfig);
			}
			privateVpcConnection.setConnectionConfigs(connectionConfigs);

			privateVpcConnections.add(privateVpcConnection);
		}
		networkConfig.setPrivateVpcConnections(privateVpcConnections);

		List<ReversePrivateVpcConnection> reversePrivateVpcConnections = new ArrayList<ReversePrivateVpcConnection>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceInstanceResponse.NetworkConfig.ReversePrivateVpcConnections.Length"); i++) {
			ReversePrivateVpcConnection reversePrivateVpcConnection = new ReversePrivateVpcConnection();
			reversePrivateVpcConnection.setEndpointId(_ctx.stringValue("GetServiceInstanceResponse.NetworkConfig.ReversePrivateVpcConnections["+ i +"].EndpointId"));

			reversePrivateVpcConnections.add(reversePrivateVpcConnection);
		}
		networkConfig.setReversePrivateVpcConnections(reversePrivateVpcConnections);
		getServiceInstanceResponse.setNetworkConfig(networkConfig);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceInstanceResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetServiceInstanceResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetServiceInstanceResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getServiceInstanceResponse.setTags(tags);
	 
	 	return getServiceInstanceResponse;
	}
}