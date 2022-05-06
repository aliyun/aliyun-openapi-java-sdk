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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancersResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<LoadBalancer> loadBalancers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<LoadBalancer> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	public static class LoadBalancer {

		private String vpcId;

		private Long createTimeStamp;

		private String loadBalancerId;

		private String createTime;

		private String payType;

		private String addressType;

		private String networkType;

		private String serviceManagedMode;

		private Boolean specBpsFlag;

		private String addressIPVersion;

		private String loadBalancerName;

		private Integer bandwidth;

		private String address;

		private String slaveZoneId;

		private String masterZoneId;

		private String internetChargeTypeAlias;

		private String loadBalancerSpec;

		private String specType;

		private String regionId;

		private String modificationProtectionReason;

		private String modificationProtectionStatus;

		private String vSwitchId;

		private String loadBalancerStatus;

		private String resourceGroupId;

		private String internetChargeType;

		private String businessStatus;

		private String deleteProtection;

		private String regionIdAlias;

		private String instanceChargeType;

		private List<Tag> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Long getCreateTimeStamp() {
			return this.createTimeStamp;
		}

		public void setCreateTimeStamp(Long createTimeStamp) {
			this.createTimeStamp = createTimeStamp;
		}

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getAddressType() {
			return this.addressType;
		}

		public void setAddressType(String addressType) {
			this.addressType = addressType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getServiceManagedMode() {
			return this.serviceManagedMode;
		}

		public void setServiceManagedMode(String serviceManagedMode) {
			this.serviceManagedMode = serviceManagedMode;
		}

		public Boolean getSpecBpsFlag() {
			return this.specBpsFlag;
		}

		public void setSpecBpsFlag(Boolean specBpsFlag) {
			this.specBpsFlag = specBpsFlag;
		}

		public String getAddressIPVersion() {
			return this.addressIPVersion;
		}

		public void setAddressIPVersion(String addressIPVersion) {
			this.addressIPVersion = addressIPVersion;
		}

		public String getLoadBalancerName() {
			return this.loadBalancerName;
		}

		public void setLoadBalancerName(String loadBalancerName) {
			this.loadBalancerName = loadBalancerName;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getSlaveZoneId() {
			return this.slaveZoneId;
		}

		public void setSlaveZoneId(String slaveZoneId) {
			this.slaveZoneId = slaveZoneId;
		}

		public String getMasterZoneId() {
			return this.masterZoneId;
		}

		public void setMasterZoneId(String masterZoneId) {
			this.masterZoneId = masterZoneId;
		}

		public String getInternetChargeTypeAlias() {
			return this.internetChargeTypeAlias;
		}

		public void setInternetChargeTypeAlias(String internetChargeTypeAlias) {
			this.internetChargeTypeAlias = internetChargeTypeAlias;
		}

		public String getLoadBalancerSpec() {
			return this.loadBalancerSpec;
		}

		public void setLoadBalancerSpec(String loadBalancerSpec) {
			this.loadBalancerSpec = loadBalancerSpec;
		}

		public String getSpecType() {
			return this.specType;
		}

		public void setSpecType(String specType) {
			this.specType = specType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getModificationProtectionReason() {
			return this.modificationProtectionReason;
		}

		public void setModificationProtectionReason(String modificationProtectionReason) {
			this.modificationProtectionReason = modificationProtectionReason;
		}

		public String getModificationProtectionStatus() {
			return this.modificationProtectionStatus;
		}

		public void setModificationProtectionStatus(String modificationProtectionStatus) {
			this.modificationProtectionStatus = modificationProtectionStatus;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getLoadBalancerStatus() {
			return this.loadBalancerStatus;
		}

		public void setLoadBalancerStatus(String loadBalancerStatus) {
			this.loadBalancerStatus = loadBalancerStatus;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getDeleteProtection() {
			return this.deleteProtection;
		}

		public void setDeleteProtection(String deleteProtection) {
			this.deleteProtection = deleteProtection;
		}

		public String getRegionIdAlias() {
			return this.regionIdAlias;
		}

		public void setRegionIdAlias(String regionIdAlias) {
			this.regionIdAlias = regionIdAlias;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}
	}

	@Override
	public DescribeLoadBalancersResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancersResponseUnmarshaller.unmarshall(this, context);
	}
}
