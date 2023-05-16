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

package com.aliyuncs.computenest.model.v20210601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenest.transform.v20210601.GetServiceInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceInstanceResponse extends AcsResponse {

	private String outputs;

	private String status;

	private String templateName;

	private String updateTime;

	private Long progress;

	private String parameters;

	private String requestId;

	private String serviceInstanceId;

	private String createTime;

	private String statusDetail;

	private String resources;

	private String operationStartTime;

	private String operationEndTime;

	private String operatedServiceInstanceId;

	private Boolean enableInstanceOps;

	private Boolean isOperated;

	private String licenseEndTime;

	private Long userId;

	private Long supplierUid;

	private String endTime;

	private String source;

	private String serviceType;

	private String payType;

	private String name;

	private Boolean enableUserPrometheus;

	private String components;

	private String predefinedParameterName;

	private String marketInstanceId;

	private String resourceGroupId;

	private List<Tag> tags;

	private Service service;

	private NetworkConfig networkConfig;

	public String getOutputs() {
		return this.outputs;
	}

	public void setOutputs(String outputs) {
		this.outputs = outputs;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Long getProgress() {
		return this.progress;
	}

	public void setProgress(Long progress) {
		this.progress = progress;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceInstanceId() {
		return this.serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getStatusDetail() {
		return this.statusDetail;
	}

	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
	}

	public String getResources() {
		return this.resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
	}

	public String getOperationStartTime() {
		return this.operationStartTime;
	}

	public void setOperationStartTime(String operationStartTime) {
		this.operationStartTime = operationStartTime;
	}

	public String getOperationEndTime() {
		return this.operationEndTime;
	}

	public void setOperationEndTime(String operationEndTime) {
		this.operationEndTime = operationEndTime;
	}

	public String getOperatedServiceInstanceId() {
		return this.operatedServiceInstanceId;
	}

	public void setOperatedServiceInstanceId(String operatedServiceInstanceId) {
		this.operatedServiceInstanceId = operatedServiceInstanceId;
	}

	public Boolean getEnableInstanceOps() {
		return this.enableInstanceOps;
	}

	public void setEnableInstanceOps(Boolean enableInstanceOps) {
		this.enableInstanceOps = enableInstanceOps;
	}

	public Boolean getIsOperated() {
		return this.isOperated;
	}

	public void setIsOperated(Boolean isOperated) {
		this.isOperated = isOperated;
	}

	public String getLicenseEndTime() {
		return this.licenseEndTime;
	}

	public void setLicenseEndTime(String licenseEndTime) {
		this.licenseEndTime = licenseEndTime;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSupplierUid() {
		return this.supplierUid;
	}

	public void setSupplierUid(Long supplierUid) {
		this.supplierUid = supplierUid;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getEnableUserPrometheus() {
		return this.enableUserPrometheus;
	}

	public void setEnableUserPrometheus(Boolean enableUserPrometheus) {
		this.enableUserPrometheus = enableUserPrometheus;
	}

	public String getComponents() {
		return this.components;
	}

	public void setComponents(String components) {
		this.components = components;
	}

	public String getPredefinedParameterName() {
		return this.predefinedParameterName;
	}

	public void setPredefinedParameterName(String predefinedParameterName) {
		this.predefinedParameterName = predefinedParameterName;
	}

	public String getMarketInstanceId() {
		return this.marketInstanceId;
	}

	public void setMarketInstanceId(String marketInstanceId) {
		this.marketInstanceId = marketInstanceId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public NetworkConfig getNetworkConfig() {
		return this.networkConfig;
	}

	public void setNetworkConfig(NetworkConfig networkConfig) {
		this.networkConfig = networkConfig;
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Service {

		private String status;

		private String publishTime;

		private String version;

		private String deployMetadata;

		private String deployType;

		private String serviceId;

		private String supplierUrl;

		private String serviceType;

		private String supplierName;

		private String versionName;

		private String upgradeMetadata;

		private String serviceProductUrl;

		private String serviceDocUrl;

		private List<ServiceInfo> serviceInfos;

		private List<String> upgradableServiceVersions;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getDeployMetadata() {
			return this.deployMetadata;
		}

		public void setDeployMetadata(String deployMetadata) {
			this.deployMetadata = deployMetadata;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getSupplierUrl() {
			return this.supplierUrl;
		}

		public void setSupplierUrl(String supplierUrl) {
			this.supplierUrl = supplierUrl;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public String getUpgradeMetadata() {
			return this.upgradeMetadata;
		}

		public void setUpgradeMetadata(String upgradeMetadata) {
			this.upgradeMetadata = upgradeMetadata;
		}

		public String getServiceProductUrl() {
			return this.serviceProductUrl;
		}

		public void setServiceProductUrl(String serviceProductUrl) {
			this.serviceProductUrl = serviceProductUrl;
		}

		public String getServiceDocUrl() {
			return this.serviceDocUrl;
		}

		public void setServiceDocUrl(String serviceDocUrl) {
			this.serviceDocUrl = serviceDocUrl;
		}

		public List<ServiceInfo> getServiceInfos() {
			return this.serviceInfos;
		}

		public void setServiceInfos(List<ServiceInfo> serviceInfos) {
			this.serviceInfos = serviceInfos;
		}

		public List<String> getUpgradableServiceVersions() {
			return this.upgradableServiceVersions;
		}

		public void setUpgradableServiceVersions(List<String> upgradableServiceVersions) {
			this.upgradableServiceVersions = upgradableServiceVersions;
		}

		public static class ServiceInfo {

			private String locale;

			private String image;

			private String name;

			private String shortDescription;

			public String getLocale() {
				return this.locale;
			}

			public void setLocale(String locale) {
				this.locale = locale;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getShortDescription() {
				return this.shortDescription;
			}

			public void setShortDescription(String shortDescription) {
				this.shortDescription = shortDescription;
			}
		}
	}

	public static class NetworkConfig {

		private String endpointId;

		private String privateZoneId;

		private List<PrivateVpcConnection> privateVpcConnections;

		private List<ReversePrivateVpcConnection> reversePrivateVpcConnections;

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getPrivateZoneId() {
			return this.privateZoneId;
		}

		public void setPrivateZoneId(String privateZoneId) {
			this.privateZoneId = privateZoneId;
		}

		public List<PrivateVpcConnection> getPrivateVpcConnections() {
			return this.privateVpcConnections;
		}

		public void setPrivateVpcConnections(List<PrivateVpcConnection> privateVpcConnections) {
			this.privateVpcConnections = privateVpcConnections;
		}

		public List<ReversePrivateVpcConnection> getReversePrivateVpcConnections() {
			return this.reversePrivateVpcConnections;
		}

		public void setReversePrivateVpcConnections(List<ReversePrivateVpcConnection> reversePrivateVpcConnections) {
			this.reversePrivateVpcConnections = reversePrivateVpcConnections;
		}

		public static class PrivateVpcConnection {

			private String endpointId;

			private String privateZoneId;

			private String privateZoneName;

			private String regionId;

			private List<ConnectionConfig> connectionConfigs;

			public String getEndpointId() {
				return this.endpointId;
			}

			public void setEndpointId(String endpointId) {
				this.endpointId = endpointId;
			}

			public String getPrivateZoneId() {
				return this.privateZoneId;
			}

			public void setPrivateZoneId(String privateZoneId) {
				this.privateZoneId = privateZoneId;
			}

			public String getPrivateZoneName() {
				return this.privateZoneName;
			}

			public void setPrivateZoneName(String privateZoneName) {
				this.privateZoneName = privateZoneName;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public List<ConnectionConfig> getConnectionConfigs() {
				return this.connectionConfigs;
			}

			public void setConnectionConfigs(List<ConnectionConfig> connectionConfigs) {
				this.connectionConfigs = connectionConfigs;
			}

			public static class ConnectionConfig {

				private String vpcId;

				private String ingressEndpointStatus;

				private String networkServiceStatus;

				private String domainName;

				private String regionId;

				private Integer connectBandwidth;

				private List<String> securityGroups;

				private List<String> vSwitches;

				private List<String> endpointIps;

				public String getVpcId() {
					return this.vpcId;
				}

				public void setVpcId(String vpcId) {
					this.vpcId = vpcId;
				}

				public String getIngressEndpointStatus() {
					return this.ingressEndpointStatus;
				}

				public void setIngressEndpointStatus(String ingressEndpointStatus) {
					this.ingressEndpointStatus = ingressEndpointStatus;
				}

				public String getNetworkServiceStatus() {
					return this.networkServiceStatus;
				}

				public void setNetworkServiceStatus(String networkServiceStatus) {
					this.networkServiceStatus = networkServiceStatus;
				}

				public String getDomainName() {
					return this.domainName;
				}

				public void setDomainName(String domainName) {
					this.domainName = domainName;
				}

				public String getRegionId() {
					return this.regionId;
				}

				public void setRegionId(String regionId) {
					this.regionId = regionId;
				}

				public Integer getConnectBandwidth() {
					return this.connectBandwidth;
				}

				public void setConnectBandwidth(Integer connectBandwidth) {
					this.connectBandwidth = connectBandwidth;
				}

				public List<String> getSecurityGroups() {
					return this.securityGroups;
				}

				public void setSecurityGroups(List<String> securityGroups) {
					this.securityGroups = securityGroups;
				}

				public List<String> getVSwitches() {
					return this.vSwitches;
				}

				public void setVSwitches(List<String> vSwitches) {
					this.vSwitches = vSwitches;
				}

				public List<String> getEndpointIps() {
					return this.endpointIps;
				}

				public void setEndpointIps(List<String> endpointIps) {
					this.endpointIps = endpointIps;
				}
			}
		}

		public static class ReversePrivateVpcConnection {

			private String endpointId;

			public String getEndpointId() {
				return this.endpointId;
			}

			public void setEndpointId(String endpointId) {
				this.endpointId = endpointId;
			}
		}
	}

	@Override
	public GetServiceInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetServiceInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
