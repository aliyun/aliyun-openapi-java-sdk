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

package com.aliyuncs.eflo_controller.model.v20221215;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RpcAcsRequest<CreateClusterResponse> {
	   

	@SerializedName("components")
	private List<Components> components;

	private String clusterName;

	@SerializedName("networks")
	private Networks networks;

	private String resourceGroupId;

	private String clusterDescription;

	@SerializedName("nodeGroups")
	private List<NodeGroups> nodeGroups;

	private List<Tag> tags;

	private Boolean ignoreFailedNodeTasks;

	private String clusterType;
	public CreateClusterRequest() {
		super("eflo-controller", "2022-12-15", "CreateCluster");
		setMethod(MethodType.POST);
	}

	public List<Components> getComponents() {
		return this.components;
	}

	public void setComponents(List<Components> components) {
		this.components = components;	
		if (components != null) {
			putBodyParameter("Components" , new Gson().toJson(components));
		}	
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putBodyParameter("ClusterName", clusterName);
		}
	}

	public Networks getNetworks() {
		return this.networks;
	}

	public void setNetworks(Networks networks) {
		this.networks = networks;	
		if (networks != null) {
			putBodyParameter("Networks" , new Gson().toJson(networks));
		}	
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getClusterDescription() {
		return this.clusterDescription;
	}

	public void setClusterDescription(String clusterDescription) {
		this.clusterDescription = clusterDescription;
		if(clusterDescription != null){
			putBodyParameter("ClusterDescription", clusterDescription);
		}
	}

	public List<NodeGroups> getNodeGroups() {
		return this.nodeGroups;
	}

	public void setNodeGroups(List<NodeGroups> nodeGroups) {
		this.nodeGroups = nodeGroups;	
		if (nodeGroups != null) {
			putBodyParameter("NodeGroups" , new Gson().toJson(nodeGroups));
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public Boolean getIgnoreFailedNodeTasks() {
		return this.ignoreFailedNodeTasks;
	}

	public void setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
		this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
		if(ignoreFailedNodeTasks != null){
			putBodyParameter("IgnoreFailedNodeTasks", ignoreFailedNodeTasks.toString());
		}
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putBodyParameter("ClusterType", clusterType);
		}
	}

	public static class Components {

		@SerializedName("ComponentType")
		private String componentType;

		@SerializedName("ComponentConfig")
		private ComponentConfig componentConfig;

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public ComponentConfig getComponentConfig() {
			return this.componentConfig;
		}

		public void setComponentConfig(ComponentConfig componentConfig) {
			this.componentConfig = componentConfig;
		}

		public static class ComponentConfig {

			@SerializedName("BasicArgs")
			private Object basicArgs;

			@SerializedName("NodeUnits")
			private List<Object> nodeUnits;

			public Object getBasicArgs() {
				return this.basicArgs;
			}

			public void setBasicArgs(Object basicArgs) {
				this.basicArgs = basicArgs;
			}

			public List<Object> getNodeUnits() {
				return this.nodeUnits;
			}

			public void setNodeUnits(List<Object> nodeUnits) {
				this.nodeUnits = nodeUnits;
			}
		}
	}

	public static class Networks {

		@SerializedName("NewVpdInfo")
		private NewVpdInfo newVpdInfo;

		public NewVpdInfo getNewVpdInfo() {
			return this.newVpdInfo;
		}

		public void setNewVpdInfo(NewVpdInfo newVpdInfo) {
			this.newVpdInfo = newVpdInfo;
		}

		public static class NewVpdInfo {

			@SerializedName("MonitorVswitchId")
			private String monitorVswitchId;

			@SerializedName("VpdSubnets")
			private List<VpdSubnetsItem> vpdSubnets;

			@SerializedName("CloudLinkId")
			private String cloudLinkId;

			@SerializedName("VpdCidr")
			private String vpdCidr;

			@SerializedName("CloudLinkCidr")
			private String cloudLinkCidr;

			@SerializedName("CenId")
			private String cenId;

			@SerializedName("MonitorVpcId")
			private String monitorVpcId;

			public String getMonitorVswitchId() {
				return this.monitorVswitchId;
			}

			public void setMonitorVswitchId(String monitorVswitchId) {
				this.monitorVswitchId = monitorVswitchId;
			}

			public List<VpdSubnetsItem> getVpdSubnets() {
				return this.vpdSubnets;
			}

			public void setVpdSubnets(List<VpdSubnetsItem> vpdSubnets) {
				this.vpdSubnets = vpdSubnets;
			}

			public String getCloudLinkId() {
				return this.cloudLinkId;
			}

			public void setCloudLinkId(String cloudLinkId) {
				this.cloudLinkId = cloudLinkId;
			}

			public String getVpdCidr() {
				return this.vpdCidr;
			}

			public void setVpdCidr(String vpdCidr) {
				this.vpdCidr = vpdCidr;
			}

			public String getCloudLinkCidr() {
				return this.cloudLinkCidr;
			}

			public void setCloudLinkCidr(String cloudLinkCidr) {
				this.cloudLinkCidr = cloudLinkCidr;
			}

			public String getCenId() {
				return this.cenId;
			}

			public void setCenId(String cenId) {
				this.cenId = cenId;
			}

			public String getMonitorVpcId() {
				return this.monitorVpcId;
			}

			public void setMonitorVpcId(String monitorVpcId) {
				this.monitorVpcId = monitorVpcId;
			}

			public static class VpdSubnetsItem {

				@SerializedName("SubnetType")
				private String subnetType;

				@SerializedName("ZoneId")
				private String zoneId;

				@SerializedName("SubnetCidr")
				private String subnetCidr;

				public String getSubnetType() {
					return this.subnetType;
				}

				public void setSubnetType(String subnetType) {
					this.subnetType = subnetType;
				}

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public String getSubnetCidr() {
					return this.subnetCidr;
				}

				public void setSubnetCidr(String subnetCidr) {
					this.subnetCidr = subnetCidr;
				}
			}
		}
	}

	public static class NodeGroups {

		@SerializedName("NodeGroupName")
		private String nodeGroupName;

		@SerializedName("Nodes")
		private List<NodesItem> nodes;

		@SerializedName("ImageId")
		private String imageId;

		@SerializedName("NodeGroupDescription")
		private String nodeGroupDescription;

		@SerializedName("ZoneId")
		private String zoneId;

		@SerializedName("MachineType")
		private String machineType;

		public String getNodeGroupName() {
			return this.nodeGroupName;
		}

		public void setNodeGroupName(String nodeGroupName) {
			this.nodeGroupName = nodeGroupName;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getNodeGroupDescription() {
			return this.nodeGroupDescription;
		}

		public void setNodeGroupDescription(String nodeGroupDescription) {
			this.nodeGroupDescription = nodeGroupDescription;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public static class NodesItem {

			@SerializedName("Hostname")
			private String hostname;

			@SerializedName("LoginPassword")
			private String loginPassword;

			@SerializedName("NodeId")
			private String nodeId;

			public String getHostname() {
				return this.hostname;
			}

			public void setHostname(String hostname) {
				this.hostname = hostname;
			}

			public String getLoginPassword() {
				return this.loginPassword;
			}

			public void setLoginPassword(String loginPassword) {
				this.loginPassword = loginPassword;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
