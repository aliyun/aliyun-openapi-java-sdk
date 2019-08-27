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
public class ResizeClusterWithHostPoolRequest extends RpcAcsRequest<ResizeClusterWithHostPoolResponse> {
	
	public ResizeClusterWithHostPoolRequest() {
		super("Emr", "2016-04-08", "ResizeClusterWithHostPool", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<HostGroup> hostGroups;

	private List<HostInfo> hostInfos;

	private String clusterId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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
						putQueryParameter("HostInfo." + (depth1 + 1) + ".ServiceComponentInfo." + (depth2 + 1) + ".serviceEcmVersion" , hostInfos.get(depth1).getServiceComponentInfos().get(depth2).getServiceEcmVersion());
						putQueryParameter("HostInfo." + (depth1 + 1) + ".ServiceComponentInfo." + (depth2 + 1) + ".ComponentName" , hostInfos.get(depth1).getServiceComponentInfos().get(depth2).getComponentName());
						putQueryParameter("HostInfo." + (depth1 + 1) + ".ServiceComponentInfo." + (depth2 + 1) + ".ServiceName" , hostInfos.get(depth1).getServiceComponentInfos().get(depth2).getServiceName());
					}
				}
				putQueryParameter("HostInfo." + (depth1 + 1) + ".HostGroupName" , hostInfos.get(depth1).getHostGroupName());
				putQueryParameter("HostInfo." + (depth1 + 1) + ".HostGroupType" , hostInfos.get(depth1).getHostGroupType());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("clusterId", clusterId);
		}
	}

	public static class HostGroup {

		private String groupType;

		private String groupId;

		private String groupName;

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	public static class HostInfo {

		private String hpHostBizId;

		private String hostName;

		private String role;

		private String groupId;

		private String privateIp;

		private List<ServiceComponentInfo> serviceComponentInfos;

		private String hostGroupName;

		private String hostGroupType;

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

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
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

		public String getHostGroupType() {
			return this.hostGroupType;
		}

		public void setHostGroupType(String hostGroupType) {
			this.hostGroupType = hostGroupType;
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

	@Override
	public Class<ResizeClusterWithHostPoolResponse> getResponseClass() {
		return ResizeClusterWithHostPoolResponse.class;
	}

}
