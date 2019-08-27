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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterWithHostPoolRequest extends RpcAcsRequest<CreateClusterWithHostPoolResponse> {
	
	public CreateClusterWithHostPoolRequest() {
		super("Emr", "2016-04-08", "CreateClusterWithHostPool", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String clusterName;

	private Boolean easEnable;

	private List<HostInfo> hostInfos;

	private String relatedClusterId;

	private String clusterType;

	private List<HostGroup> hostGroups;

	private String stackName;

	private String stackVersion;

	private List<ServiceInfo> serviceInfos;

	private List<Config> configs;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public Boolean getEasEnable() {
		return this.easEnable;
	}

	public void setEasEnable(Boolean easEnable) {
		this.easEnable = easEnable;
		if(easEnable != null){
			putQueryParameter("EasEnable", easEnable.toString());
		}
	}

	public List<HostInfo> getHostInfos() {
		return this.hostInfos;
	}

	public void setHostInfos(List<HostInfo> hostInfos) {
		this.hostInfos = hostInfos;	
		if (hostInfos != null) {
			for (int depth1 = 0; depth1 < hostInfos.size(); depth1++) {
				putQueryParameter("HostInfo." + (depth1 + 1) + ".HpHostBizId" , hostInfos.get(depth1).getHpHostBizId());
				putQueryParameter("HostInfo." + (depth1 + 1) + ".HostName" , hostInfos.get(depth1).getHostName());
				putQueryParameter("HostInfo." + (depth1 + 1) + ".Role" , hostInfos.get(depth1).getRole());
				putQueryParameter("HostInfo." + (depth1 + 1) + ".GroupId" , hostInfos.get(depth1).getGroupId());
				putQueryParameter("HostInfo." + (depth1 + 1) + ".PrivateIp" , hostInfos.get(depth1).getPrivateIp());
				if (hostInfos.get(depth1).getServiceComponentInfos() != null) {
					for (int depth2 = 0; depth2 < hostInfos.get(depth1).getServiceComponentInfos().size(); depth2++) {
						putQueryParameter("HostInfo." + (depth1 + 1) + ".ServiceComponentInfo." + (depth2 + 1) + ".ServiceEcmVersion" , hostInfos.get(depth1).getServiceComponentInfos().get(depth2).getServiceEcmVersion());
						putQueryParameter("HostInfo." + (depth1 + 1) + ".ServiceComponentInfo." + (depth2 + 1) + ".ComponentName" , hostInfos.get(depth1).getServiceComponentInfos().get(depth2).getComponentName());
						putQueryParameter("HostInfo." + (depth1 + 1) + ".ServiceComponentInfo." + (depth2 + 1) + ".ServiceName" , hostInfos.get(depth1).getServiceComponentInfos().get(depth2).getServiceName());
					}
				}
				putQueryParameter("HostInfo." + (depth1 + 1) + ".HostGroupName" , hostInfos.get(depth1).getHostGroupName());
			}
		}	
	}

	public String getRelatedClusterId() {
		return this.relatedClusterId;
	}

	public void setRelatedClusterId(String relatedClusterId) {
		this.relatedClusterId = relatedClusterId;
		if(relatedClusterId != null){
			putQueryParameter("RelatedClusterId", relatedClusterId);
		}
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
		}
	}

	public List<HostGroup> getHostGroups() {
		return this.hostGroups;
	}

	public void setHostGroups(List<HostGroup> hostGroups) {
		this.hostGroups = hostGroups;	
		if (hostGroups != null) {
			for (int depth1 = 0; depth1 < hostGroups.size(); depth1++) {
				putQueryParameter("HostGroup." + (depth1 + 1) + ".GroupType" , hostGroups.get(depth1).getGroupType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".GroupId" , hostGroups.get(depth1).getGroupId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".GroupName" , hostGroups.get(depth1).getGroupName());
			}
		}	
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
		if(stackName != null){
			putQueryParameter("StackName", stackName);
		}
	}

	public String getStackVersion() {
		return this.stackVersion;
	}

	public void setStackVersion(String stackVersion) {
		this.stackVersion = stackVersion;
		if(stackVersion != null){
			putQueryParameter("StackVersion", stackVersion);
		}
	}

	public List<ServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}

	public void setServiceInfos(List<ServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;	
		if (serviceInfos != null) {
			for (int depth1 = 0; depth1 < serviceInfos.size(); depth1++) {
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ServiceEcmVersion" , serviceInfos.get(depth1).getServiceEcmVersion());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ServiceVersion" , serviceInfos.get(depth1).getServiceVersion());
				putQueryParameter("ServiceInfo." + (depth1 + 1) + ".ServiceName" , serviceInfos.get(depth1).getServiceName());
			}
		}	
	}

	public List<Config> getConfigs() {
		return this.configs;
	}

	public void setConfigs(List<Config> configs) {
		this.configs = configs;	
		if (configs != null) {
			for (int depth1 = 0; depth1 < configs.size(); depth1++) {
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigKey" , configs.get(depth1).getConfigKey());
				putQueryParameter("Config." + (depth1 + 1) + ".FileName" , configs.get(depth1).getFileName());
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigValue" , configs.get(depth1).getConfigValue());
				putQueryParameter("Config." + (depth1 + 1) + ".ServiceName" , configs.get(depth1).getServiceName());
			}
		}	
	}

	public static class HostInfo {

		private String hpHostBizId;

		private String hostName;

		private String role;

		private Long groupId;

		private String privateIp;

		private List<ServiceComponentInfo> serviceComponentInfos;

		private String hostGroupName;

		public String getHpHostBizId() {
			return this.hpHostBizId;
		}

		public void setHpHostBizId(String hpHostBizId) {
			this.hpHostBizId = hpHostBizId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public List<ServiceComponentInfo> getServiceComponentInfos() {
			return this.serviceComponentInfos;
		}

		public void setServiceComponentInfos(List<ServiceComponentInfo> serviceComponentInfos) {
			this.serviceComponentInfos = serviceComponentInfos;
		}

		public String getHostGroupName() {
			return this.hostGroupName;
		}

		public void setHostGroupName(String hostGroupName) {
			this.hostGroupName = hostGroupName;
		}

		public static class ServiceComponentInfo {

			private String serviceEcmVersion;

			private String componentName;

			private String serviceName;

			public String getServiceEcmVersion() {
				return this.serviceEcmVersion;
			}

			public void setServiceEcmVersion(String serviceEcmVersion) {
				this.serviceEcmVersion = serviceEcmVersion;
			}

			public String getComponentName() {
				return this.componentName;
			}

			public void setComponentName(String componentName) {
				this.componentName = componentName;
			}

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}
		}
	}

	public static class HostGroup {

		private String groupType;

		private Long groupId;

		private String groupName;

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	public static class ServiceInfo {

		private String serviceEcmVersion;

		private String serviceVersion;

		private String serviceName;

		public String getServiceEcmVersion() {
			return this.serviceEcmVersion;
		}

		public void setServiceEcmVersion(String serviceEcmVersion) {
			this.serviceEcmVersion = serviceEcmVersion;
		}

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	}

	public static class Config {

		private String configKey;

		private String fileName;

		private String configValue;

		private String serviceName;

		public String getConfigKey() {
			return this.configKey;
		}

		public void setConfigKey(String configKey) {
			this.configKey = configKey;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getConfigValue() {
			return this.configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	}

	@Override
	public Class<CreateClusterWithHostPoolResponse> getResponseClass() {
		return CreateClusterWithHostPoolResponse.class;
	}

}
