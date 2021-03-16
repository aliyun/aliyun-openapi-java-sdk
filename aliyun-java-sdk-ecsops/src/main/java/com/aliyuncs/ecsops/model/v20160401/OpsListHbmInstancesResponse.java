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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsListHbmInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListHbmInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<HbmInstance> hbmInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<HbmInstance> getHbmInstances() {
		return this.hbmInstances;
	}

	public void setHbmInstances(List<HbmInstance> hbmInstances) {
		this.hbmInstances = hbmInstances;
	}

	public static class HbmInstance {

		private String regionId;

		private String zoneId;

		private String hbmInstanceId;

		private String hbmInstanceName;

		private String status;

		private String bootMode;

		private String creationTime;

		private Integer cpu;

		private Integer memory;

		private String hostName;

		private String resourceGroupId;

		private List<Tag> tags;

		private NetworkAttribute networkAttribute;

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

		public String getHbmInstanceId() {
			return this.hbmInstanceId;
		}

		public void setHbmInstanceId(String hbmInstanceId) {
			this.hbmInstanceId = hbmInstanceId;
		}

		public String getHbmInstanceName() {
			return this.hbmInstanceName;
		}

		public void setHbmInstanceName(String hbmInstanceName) {
			this.hbmInstanceName = hbmInstanceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBootMode() {
			return this.bootMode;
		}

		public void setBootMode(String bootMode) {
			this.bootMode = bootMode;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
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

		public NetworkAttribute getNetworkAttribute() {
			return this.networkAttribute;
		}

		public void setNetworkAttribute(NetworkAttribute networkAttribute) {
			this.networkAttribute = networkAttribute;
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}

		public static class NetworkAttribute {

			private String vpcId;

			private String vSwitchId;

			private List<String> securityGroupIds;

			private List<String> privateIpAddress;

			private List<String> privateIpv6Address;

			private EipAttribute eipAttribute;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public List<String> getSecurityGroupIds() {
				return this.securityGroupIds;
			}

			public void setSecurityGroupIds(List<String> securityGroupIds) {
				this.securityGroupIds = securityGroupIds;
			}

			public List<String> getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(List<String> privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}

			public List<String> getPrivateIpv6Address() {
				return this.privateIpv6Address;
			}

			public void setPrivateIpv6Address(List<String> privateIpv6Address) {
				this.privateIpv6Address = privateIpv6Address;
			}

			public EipAttribute getEipAttribute() {
				return this.eipAttribute;
			}

			public void setEipAttribute(EipAttribute eipAttribute) {
				this.eipAttribute = eipAttribute;
			}

			public static class EipAttribute {

				private String allocationId;

				public String getAllocationId() {
					return this.allocationId;
				}

				public void setAllocationId(String allocationId) {
					this.allocationId = allocationId;
				}
			}
		}
	}

	@Override
	public OpsListHbmInstancesResponse getInstance(UnmarshallerContext context) {
		return	OpsListHbmInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
