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
import com.aliyuncs.emr.transform.v20160408.ListEmrAvailableConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEmrAvailableConfigResponse extends AcsResponse {

	private String requestId;

	private List<EmrMainVersion> emrMainVersionList;

	private List<SecurityGroup> securityGroupList;

	private List<VpcInfo> vpcInfoList;

	private List<String> keyPairNameList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EmrMainVersion> getEmrMainVersionList() {
		return this.emrMainVersionList;
	}

	public void setEmrMainVersionList(List<EmrMainVersion> emrMainVersionList) {
		this.emrMainVersionList = emrMainVersionList;
	}

	public List<SecurityGroup> getSecurityGroupList() {
		return this.securityGroupList;
	}

	public void setSecurityGroupList(List<SecurityGroup> securityGroupList) {
		this.securityGroupList = securityGroupList;
	}

	public List<VpcInfo> getVpcInfoList() {
		return this.vpcInfoList;
	}

	public void setVpcInfoList(List<VpcInfo> vpcInfoList) {
		this.vpcInfoList = vpcInfoList;
	}

	public List<String> getKeyPairNameList() {
		return this.keyPairNameList;
	}

	public void setKeyPairNameList(List<String> keyPairNameList) {
		this.keyPairNameList = keyPairNameList;
	}

	public static class EmrMainVersion {

		private String regionId;

		private String mainVersionName;

		private Boolean ecmVersion;

		private List<ClusterTypeInfo> clusterTypeInfoList;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getMainVersionName() {
			return this.mainVersionName;
		}

		public void setMainVersionName(String mainVersionName) {
			this.mainVersionName = mainVersionName;
		}

		public Boolean getEcmVersion() {
			return this.ecmVersion;
		}

		public void setEcmVersion(Boolean ecmVersion) {
			this.ecmVersion = ecmVersion;
		}

		public List<ClusterTypeInfo> getClusterTypeInfoList() {
			return this.clusterTypeInfoList;
		}

		public void setClusterTypeInfoList(List<ClusterTypeInfo> clusterTypeInfoList) {
			this.clusterTypeInfoList = clusterTypeInfoList;
		}

		public static class ClusterTypeInfo {

			private String clusterType;

			private List<ClusterServiceInfo> clusterServiceInfoList;

			public String getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(String clusterType) {
				this.clusterType = clusterType;
			}

			public List<ClusterServiceInfo> getClusterServiceInfoList() {
				return this.clusterServiceInfoList;
			}

			public void setClusterServiceInfoList(List<ClusterServiceInfo> clusterServiceInfoList) {
				this.clusterServiceInfoList = clusterServiceInfoList;
			}

			public static class ClusterServiceInfo {

				private String serviceName;

				private String serviceDisplayName;

				private String serviceVersion;

				private Boolean mandatory;

				public String getServiceName() {
					return this.serviceName;
				}

				public void setServiceName(String serviceName) {
					this.serviceName = serviceName;
				}

				public String getServiceDisplayName() {
					return this.serviceDisplayName;
				}

				public void setServiceDisplayName(String serviceDisplayName) {
					this.serviceDisplayName = serviceDisplayName;
				}

				public String getServiceVersion() {
					return this.serviceVersion;
				}

				public void setServiceVersion(String serviceVersion) {
					this.serviceVersion = serviceVersion;
				}

				public Boolean getMandatory() {
					return this.mandatory;
				}

				public void setMandatory(Boolean mandatory) {
					this.mandatory = mandatory;
				}
			}
		}
	}

	public static class SecurityGroup {

		private String securityGroupId;

		private String description;

		private String securityGroupName;

		private String vpcId;

		private String creationTime;

		private Integer availableInstanceAmount;

		private Integer ecsCount;

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSecurityGroupName() {
			return this.securityGroupName;
		}

		public void setSecurityGroupName(String securityGroupName) {
			this.securityGroupName = securityGroupName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getAvailableInstanceAmount() {
			return this.availableInstanceAmount;
		}

		public void setAvailableInstanceAmount(Integer availableInstanceAmount) {
			this.availableInstanceAmount = availableInstanceAmount;
		}

		public Integer getEcsCount() {
			return this.ecsCount;
		}

		public void setEcsCount(Integer ecsCount) {
			this.ecsCount = ecsCount;
		}
	}

	public static class VpcInfo {

		private String vpcId;

		private String vpcName;

		private String cidrBlock;

		private String creationTime;

		private String vRouterId;

		private String description;

		private List<VswitchInfo> vswitchInfoList;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getVRouterId() {
			return this.vRouterId;
		}

		public void setVRouterId(String vRouterId) {
			this.vRouterId = vRouterId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<VswitchInfo> getVswitchInfoList() {
			return this.vswitchInfoList;
		}

		public void setVswitchInfoList(List<VswitchInfo> vswitchInfoList) {
			this.vswitchInfoList = vswitchInfoList;
		}

		public static class VswitchInfo {

			private String vpcId;

			private String vswitchId;

			private String vswitchName;

			private String zoneId;

			private String cidrBlock;

			private Long availableIpAddressCount;

			private String description;

			private String creationTime;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public String getVswitchName() {
				return this.vswitchName;
			}

			public void setVswitchName(String vswitchName) {
				this.vswitchName = vswitchName;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public Long getAvailableIpAddressCount() {
				return this.availableIpAddressCount;
			}

			public void setAvailableIpAddressCount(Long availableIpAddressCount) {
				this.availableIpAddressCount = availableIpAddressCount;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}
		}
	}

	@Override
	public ListEmrAvailableConfigResponse getInstance(UnmarshallerContext context) {
		return	ListEmrAvailableConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
