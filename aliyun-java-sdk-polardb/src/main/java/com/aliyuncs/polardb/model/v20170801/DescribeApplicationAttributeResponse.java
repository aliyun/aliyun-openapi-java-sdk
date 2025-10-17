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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeApplicationAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationAttributeResponse extends AcsResponse {

	private String requestId;

	private String applicationId;

	private String dBClusterId;

	private String architecture;

	private String description;

	private String status;

	private String lockMode;

	private String applicationType;

	private String version;

	private String upgradeAvailable;

	private String maintainStartTime;

	private String maintainEndTime;

	private String payType;

	private Boolean expired;

	private String vPCId;

	private String vSwitchId;

	private String creationTime;

	private String expireTime;

	private String regionId;

	private String zoneId;

	private String polarFSInstanceId;

	private String serverlessType;

	private List<SecurityGroup> securityGroups;

	private List<SecurityIPArray> securityIPArrays;

	private List<Component> components;

	private List<Endpoint> endpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUpgradeAvailable() {
		return this.upgradeAvailable;
	}

	public void setUpgradeAvailable(String upgradeAvailable) {
		this.upgradeAvailable = upgradeAvailable;
	}

	public String getMaintainStartTime() {
		return this.maintainStartTime;
	}

	public void setMaintainStartTime(String maintainStartTime) {
		this.maintainStartTime = maintainStartTime;
	}

	public String getMaintainEndTime() {
		return this.maintainEndTime;
	}

	public void setMaintainEndTime(String maintainEndTime) {
		this.maintainEndTime = maintainEndTime;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Boolean getExpired() {
		return this.expired;
	}

	public void setExpired(Boolean expired) {
		this.expired = expired;
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getPolarFSInstanceId() {
		return this.polarFSInstanceId;
	}

	public void setPolarFSInstanceId(String polarFSInstanceId) {
		this.polarFSInstanceId = polarFSInstanceId;
	}

	public String getServerlessType() {
		return this.serverlessType;
	}

	public void setServerlessType(String serverlessType) {
		this.serverlessType = serverlessType;
	}

	public List<SecurityGroup> getSecurityGroups() {
		return this.securityGroups;
	}

	public void setSecurityGroups(List<SecurityGroup> securityGroups) {
		this.securityGroups = securityGroups;
	}

	public List<SecurityIPArray> getSecurityIPArrays() {
		return this.securityIPArrays;
	}

	public void setSecurityIPArrays(List<SecurityIPArray> securityIPArrays) {
		this.securityIPArrays = securityIPArrays;
	}

	public List<Component> getComponents() {
		return this.components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public List<Endpoint> getEndpoints() {
		return this.endpoints;
	}

	public void setEndpoints(List<Endpoint> endpoints) {
		this.endpoints = endpoints;
	}

	public static class SecurityGroup {

		private String securityGroupName;

		private String securityGroupId;

		private String regionId;

		private String netType;

		public String getSecurityGroupName() {
			return this.securityGroupName;
		}

		public void setSecurityGroupName(String securityGroupName) {
			this.securityGroupName = securityGroupName;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}
	}

	public static class SecurityIPArray {

		private String securityIPArrayTag;

		private String securityIPType;

		private String securityIPList;

		private String securityIPArrayName;

		private String securityIPNetType;

		public String getSecurityIPArrayTag() {
			return this.securityIPArrayTag;
		}

		public void setSecurityIPArrayTag(String securityIPArrayTag) {
			this.securityIPArrayTag = securityIPArrayTag;
		}

		public String getSecurityIPType() {
			return this.securityIPType;
		}

		public void setSecurityIPType(String securityIPType) {
			this.securityIPType = securityIPType;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getSecurityIPArrayName() {
			return this.securityIPArrayName;
		}

		public void setSecurityIPArrayName(String securityIPArrayName) {
			this.securityIPArrayName = securityIPArrayName;
		}

		public String getSecurityIPNetType() {
			return this.securityIPNetType;
		}

		public void setSecurityIPNetType(String securityIPNetType) {
			this.securityIPNetType = securityIPNetType;
		}
	}

	public static class Component {

		private String status;

		private String componentType;

		private String componentClassDescription;

		private String componentId;

		private String componentClass;

		private Long componentReplica;

		private Long componentMaxReplica;

		private String componentReplicaGroupName;

		private List<SecurityGroup3> securityGroups1;

		private List<SecurityIPArray4> securityIPArrays2;

		private Topology topology;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public String getComponentClassDescription() {
			return this.componentClassDescription;
		}

		public void setComponentClassDescription(String componentClassDescription) {
			this.componentClassDescription = componentClassDescription;
		}

		public String getComponentId() {
			return this.componentId;
		}

		public void setComponentId(String componentId) {
			this.componentId = componentId;
		}

		public String getComponentClass() {
			return this.componentClass;
		}

		public void setComponentClass(String componentClass) {
			this.componentClass = componentClass;
		}

		public Long getComponentReplica() {
			return this.componentReplica;
		}

		public void setComponentReplica(Long componentReplica) {
			this.componentReplica = componentReplica;
		}

		public Long getComponentMaxReplica() {
			return this.componentMaxReplica;
		}

		public void setComponentMaxReplica(Long componentMaxReplica) {
			this.componentMaxReplica = componentMaxReplica;
		}

		public String getComponentReplicaGroupName() {
			return this.componentReplicaGroupName;
		}

		public void setComponentReplicaGroupName(String componentReplicaGroupName) {
			this.componentReplicaGroupName = componentReplicaGroupName;
		}

		public List<SecurityGroup3> getSecurityGroups1() {
			return this.securityGroups1;
		}

		public void setSecurityGroups1(List<SecurityGroup3> securityGroups1) {
			this.securityGroups1 = securityGroups1;
		}

		public List<SecurityIPArray4> getSecurityIPArrays2() {
			return this.securityIPArrays2;
		}

		public void setSecurityIPArrays2(List<SecurityIPArray4> securityIPArrays2) {
			this.securityIPArrays2 = securityIPArrays2;
		}

		public Topology getTopology() {
			return this.topology;
		}

		public void setTopology(Topology topology) {
			this.topology = topology;
		}

		public static class SecurityGroup3 {

			private String securityGroupName;

			private String securityGroupId;

			private String regionId;

			private String netType;

			public String getSecurityGroupName() {
				return this.securityGroupName;
			}

			public void setSecurityGroupName(String securityGroupName) {
				this.securityGroupName = securityGroupName;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getNetType() {
				return this.netType;
			}

			public void setNetType(String netType) {
				this.netType = netType;
			}
		}

		public static class SecurityIPArray4 {

			private String securityIPArrayTag;

			private String securityIPType;

			private String securityIPList;

			private String securityIPArrayName;

			private String securityIPNetType;

			public String getSecurityIPArrayTag() {
				return this.securityIPArrayTag;
			}

			public void setSecurityIPArrayTag(String securityIPArrayTag) {
				this.securityIPArrayTag = securityIPArrayTag;
			}

			public String getSecurityIPType() {
				return this.securityIPType;
			}

			public void setSecurityIPType(String securityIPType) {
				this.securityIPType = securityIPType;
			}

			public String getSecurityIPList() {
				return this.securityIPList;
			}

			public void setSecurityIPList(String securityIPList) {
				this.securityIPList = securityIPList;
			}

			public String getSecurityIPArrayName() {
				return this.securityIPArrayName;
			}

			public void setSecurityIPArrayName(String securityIPArrayName) {
				this.securityIPArrayName = securityIPArrayName;
			}

			public String getSecurityIPNetType() {
				return this.securityIPNetType;
			}

			public void setSecurityIPNetType(String securityIPNetType) {
				this.securityIPNetType = securityIPNetType;
			}
		}

		public static class Topology {

			private String layer;

			private List<String> parents;

			private List<String> children;

			public String getLayer() {
				return this.layer;
			}

			public void setLayer(String layer) {
				this.layer = layer;
			}

			public List<String> getParents() {
				return this.parents;
			}

			public void setParents(List<String> parents) {
				this.parents = parents;
			}

			public List<String> getChildren() {
				return this.children;
			}

			public void setChildren(List<String> children) {
				this.children = children;
			}
		}
	}

	public static class Endpoint {

		private String description;

		private String endpointId;

		private String iP;

		private String port;

		private String netType;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}
	}

	@Override
	public DescribeApplicationAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
