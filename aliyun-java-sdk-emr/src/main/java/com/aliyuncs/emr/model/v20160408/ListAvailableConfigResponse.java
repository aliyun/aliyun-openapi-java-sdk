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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListAvailableConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAvailableConfigResponse extends AcsResponse {

	private String requestId;

	private List<SecurityGroupType> securityGroupTypes;

	private List<InstanceType> instanceTypes;

	private List<EmrVerType> emrVerTypes;

	private List<ZoneType> zoneTypes;

	private List<Vpc> vpcs;

	private List<EmrSupportInstanceType> emrSupportedInstanceTypeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SecurityGroupType> getSecurityGroupTypes() {
		return this.securityGroupTypes;
	}

	public void setSecurityGroupTypes(List<SecurityGroupType> securityGroupTypes) {
		this.securityGroupTypes = securityGroupTypes;
	}

	public List<InstanceType> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceType> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public List<EmrVerType> getEmrVerTypes() {
		return this.emrVerTypes;
	}

	public void setEmrVerTypes(List<EmrVerType> emrVerTypes) {
		this.emrVerTypes = emrVerTypes;
	}

	public List<ZoneType> getZoneTypes() {
		return this.zoneTypes;
	}

	public void setZoneTypes(List<ZoneType> zoneTypes) {
		this.zoneTypes = zoneTypes;
	}

	public List<Vpc> getVpcs() {
		return this.vpcs;
	}

	public void setVpcs(List<Vpc> vpcs) {
		this.vpcs = vpcs;
	}

	public List<EmrSupportInstanceType> getEmrSupportedInstanceTypeList() {
		return this.emrSupportedInstanceTypeList;
	}

	public void setEmrSupportedInstanceTypeList(List<EmrSupportInstanceType> emrSupportedInstanceTypeList) {
		this.emrSupportedInstanceTypeList = emrSupportedInstanceTypeList;
	}

	public static class SecurityGroupType {

		private String name;

		private String state;

		private String id;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	public static class InstanceType {

		private String classify;

		private String type;

		private Integer cpuCore;

		private Integer memSize;

		private Boolean hasCloudDisk;

		private Boolean hasEfficiencyCloudDisk;

		private Boolean hasSSDCloudDisk;

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getCpuCore() {
			return this.cpuCore;
		}

		public void setCpuCore(Integer cpuCore) {
			this.cpuCore = cpuCore;
		}

		public Integer getMemSize() {
			return this.memSize;
		}

		public void setMemSize(Integer memSize) {
			this.memSize = memSize;
		}

		public Boolean getHasCloudDisk() {
			return this.hasCloudDisk;
		}

		public void setHasCloudDisk(Boolean hasCloudDisk) {
			this.hasCloudDisk = hasCloudDisk;
		}

		public Boolean getHasEfficiencyCloudDisk() {
			return this.hasEfficiencyCloudDisk;
		}

		public void setHasEfficiencyCloudDisk(Boolean hasEfficiencyCloudDisk) {
			this.hasEfficiencyCloudDisk = hasEfficiencyCloudDisk;
		}

		public Boolean getHasSSDCloudDisk() {
			return this.hasSSDCloudDisk;
		}

		public void setHasSSDCloudDisk(Boolean hasSSDCloudDisk) {
			this.hasSSDCloudDisk = hasSSDCloudDisk;
		}
	}

	public static class EmrVerType {

		private String name;

		private Boolean ecmStack;

		private List<SubModule> subModules;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getEcmStack() {
			return this.ecmStack;
		}

		public void setEcmStack(Boolean ecmStack) {
			this.ecmStack = ecmStack;
		}

		public List<SubModule> getSubModules() {
			return this.subModules;
		}

		public void setSubModules(List<SubModule> subModules) {
			this.subModules = subModules;
		}

		public static class SubModule {

			private String name;

			private List<Required> requiredList;

			private List<Optional> optionalList;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<Required> getRequiredList() {
				return this.requiredList;
			}

			public void setRequiredList(List<Required> requiredList) {
				this.requiredList = requiredList;
			}

			public List<Optional> getOptionalList() {
				return this.optionalList;
			}

			public void setOptionalList(List<Optional> optionalList) {
				this.optionalList = optionalList;
			}

			public static class Required {

				private String displayName;

				private String name;

				private Boolean onlyDisplay;

				private Integer startTpe;

				private String version;

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getOnlyDisplay() {
					return this.onlyDisplay;
				}

				public void setOnlyDisplay(Boolean onlyDisplay) {
					this.onlyDisplay = onlyDisplay;
				}

				public Integer getStartTpe() {
					return this.startTpe;
				}

				public void setStartTpe(Integer startTpe) {
					this.startTpe = startTpe;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}
			}

			public static class Optional {

				private String displayName;

				private String name;

				private Boolean onlyDisplay;

				private Integer startTpe;

				private String version;

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getOnlyDisplay() {
					return this.onlyDisplay;
				}

				public void setOnlyDisplay(Boolean onlyDisplay) {
					this.onlyDisplay = onlyDisplay;
				}

				public Integer getStartTpe() {
					return this.startTpe;
				}

				public void setStartTpe(Integer startTpe) {
					this.startTpe = startTpe;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}
			}
		}
	}

	public static class ZoneType {

		private String name;

		private String id;

		private List<AvailableResource> availableResources;

		private List<String> availableResourceCreationList;

		private List<String> availableDiskCategoryList;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<AvailableResource> getAvailableResources() {
			return this.availableResources;
		}

		public void setAvailableResources(List<AvailableResource> availableResources) {
			this.availableResources = availableResources;
		}

		public List<String> getAvailableResourceCreationList() {
			return this.availableResourceCreationList;
		}

		public void setAvailableResourceCreationList(List<String> availableResourceCreationList) {
			this.availableResourceCreationList = availableResourceCreationList;
		}

		public List<String> getAvailableDiskCategoryList() {
			return this.availableDiskCategoryList;
		}

		public void setAvailableDiskCategoryList(List<String> availableDiskCategoryList) {
			this.availableDiskCategoryList = availableDiskCategoryList;
		}

		public static class AvailableResource {

			private Boolean ioOptimized;

			private List<String> systemDiskCategories;

			private List<String> dataDiskCategories;

			private List<String> networkTypes;

			private List<String> supportedInstanceTypes;

			private List<String> instanceTypeFamilies;

			private List<String> instanceGenerations;

			public Boolean getIoOptimized() {
				return this.ioOptimized;
			}

			public void setIoOptimized(Boolean ioOptimized) {
				this.ioOptimized = ioOptimized;
			}

			public List<String> getSystemDiskCategories() {
				return this.systemDiskCategories;
			}

			public void setSystemDiskCategories(List<String> systemDiskCategories) {
				this.systemDiskCategories = systemDiskCategories;
			}

			public List<String> getDataDiskCategories() {
				return this.dataDiskCategories;
			}

			public void setDataDiskCategories(List<String> dataDiskCategories) {
				this.dataDiskCategories = dataDiskCategories;
			}

			public List<String> getNetworkTypes() {
				return this.networkTypes;
			}

			public void setNetworkTypes(List<String> networkTypes) {
				this.networkTypes = networkTypes;
			}

			public List<String> getSupportedInstanceTypes() {
				return this.supportedInstanceTypes;
			}

			public void setSupportedInstanceTypes(List<String> supportedInstanceTypes) {
				this.supportedInstanceTypes = supportedInstanceTypes;
			}

			public List<String> getInstanceTypeFamilies() {
				return this.instanceTypeFamilies;
			}

			public void setInstanceTypeFamilies(List<String> instanceTypeFamilies) {
				this.instanceTypeFamilies = instanceTypeFamilies;
			}

			public List<String> getInstanceGenerations() {
				return this.instanceGenerations;
			}

			public void setInstanceGenerations(List<String> instanceGenerations) {
				this.instanceGenerations = instanceGenerations;
			}
		}
	}

	public static class Vpc {

		private String id;

		private String vpcName;

		private String cidrBlock;

		private List<VSwitch> vSwitchs;

		private List<SecurityGroup> securityGroups;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public List<VSwitch> getVSwitchs() {
			return this.vSwitchs;
		}

		public void setVSwitchs(List<VSwitch> vSwitchs) {
			this.vSwitchs = vSwitchs;
		}

		public List<SecurityGroup> getSecurityGroups() {
			return this.securityGroups;
		}

		public void setSecurityGroups(List<SecurityGroup> securityGroups) {
			this.securityGroups = securityGroups;
		}

		public static class VSwitch {

			private String id;

			private String vswitchName;

			private String cidrBlock;

			private String zoneId;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getVswitchName() {
				return this.vswitchName;
			}

			public void setVswitchName(String vswitchName) {
				this.vswitchName = vswitchName;
			}

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}

		public static class SecurityGroup {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	public static class EmrSupportInstanceType {

		private String clusterType;

		private List<ClusterNodeTypeSupportInfo> nodeTypeSupportInfoList;

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public List<ClusterNodeTypeSupportInfo> getNodeTypeSupportInfoList() {
			return this.nodeTypeSupportInfoList;
		}

		public void setNodeTypeSupportInfoList(List<ClusterNodeTypeSupportInfo> nodeTypeSupportInfoList) {
			this.nodeTypeSupportInfoList = nodeTypeSupportInfoList;
		}

		public static class ClusterNodeTypeSupportInfo {

			private String clusterNodeType;

			private List<String> supportInstanceTypeList;

			public String getClusterNodeType() {
				return this.clusterNodeType;
			}

			public void setClusterNodeType(String clusterNodeType) {
				this.clusterNodeType = clusterNodeType;
			}

			public List<String> getSupportInstanceTypeList() {
				return this.supportInstanceTypeList;
			}

			public void setSupportInstanceTypeList(List<String> supportInstanceTypeList) {
				this.supportInstanceTypeList = supportInstanceTypeList;
			}
		}
	}

	@Override
	public ListAvailableConfigResponse getInstance(UnmarshallerContext context) {
		return	ListAvailableConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
