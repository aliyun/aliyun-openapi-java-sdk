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

package com.aliyuncs.nlb.model.v20220430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlb.transform.v20220430.GetLoadBalancerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoadBalancerAttributeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String regionId;

	private String loadBalancerId;

	private String loadBalancerName;

	private String loadBalancerType;

	private String addressType;

	private String addressIpVersion;

	private String ipv6AddressType;

	private String loadBalancerStatus;

	private String loadBalancerBusinessStatus;

	private String vpcId;

	private Long capacityUnitCount;

	private String createTime;

	private String resourceGroupId;

	private String dNSName;

	private String bandwidthPackageId;

	private Boolean crossZoneEnabled;

	private Boolean trafficAffinityEnabled;

	private Integer cps;

	private String sysSecurityGroupId;

	private List<OperationLock> operationLocks;

	private List<ZoneMapping> zoneMappings;

	private List<Tag> tags;

	private List<String> securityGroupIds;

	private LoadBalancerBillingConfig loadBalancerBillingConfig;

	private DeletionProtectionConfig deletionProtectionConfig;

	private ModificationProtectionConfig modificationProtectionConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
	}

	public String getLoadBalancerType() {
		return this.loadBalancerType;
	}

	public void setLoadBalancerType(String loadBalancerType) {
		this.loadBalancerType = loadBalancerType;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressIpVersion() {
		return this.addressIpVersion;
	}

	public void setAddressIpVersion(String addressIpVersion) {
		this.addressIpVersion = addressIpVersion;
	}

	public String getIpv6AddressType() {
		return this.ipv6AddressType;
	}

	public void setIpv6AddressType(String ipv6AddressType) {
		this.ipv6AddressType = ipv6AddressType;
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
	}

	public String getLoadBalancerBusinessStatus() {
		return this.loadBalancerBusinessStatus;
	}

	public void setLoadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
		this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public Long getCapacityUnitCount() {
		return this.capacityUnitCount;
	}

	public void setCapacityUnitCount(Long capacityUnitCount) {
		this.capacityUnitCount = capacityUnitCount;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getDNSName() {
		return this.dNSName;
	}

	public void setDNSName(String dNSName) {
		this.dNSName = dNSName;
	}

	public String getBandwidthPackageId() {
		return this.bandwidthPackageId;
	}

	public void setBandwidthPackageId(String bandwidthPackageId) {
		this.bandwidthPackageId = bandwidthPackageId;
	}

	public Boolean getCrossZoneEnabled() {
		return this.crossZoneEnabled;
	}

	public void setCrossZoneEnabled(Boolean crossZoneEnabled) {
		this.crossZoneEnabled = crossZoneEnabled;
	}

	public Boolean getTrafficAffinityEnabled() {
		return this.trafficAffinityEnabled;
	}

	public void setTrafficAffinityEnabled(Boolean trafficAffinityEnabled) {
		this.trafficAffinityEnabled = trafficAffinityEnabled;
	}

	public Integer getCps() {
		return this.cps;
	}

	public void setCps(Integer cps) {
		this.cps = cps;
	}

	public String getSysSecurityGroupId() {
		return this.sysSecurityGroupId;
	}

	public void setSysSecurityGroupId(String sysSecurityGroupId) {
		this.sysSecurityGroupId = sysSecurityGroupId;
	}

	public List<OperationLock> getOperationLocks() {
		return this.operationLocks;
	}

	public void setOperationLocks(List<OperationLock> operationLocks) {
		this.operationLocks = operationLocks;
	}

	public List<ZoneMapping> getZoneMappings() {
		return this.zoneMappings;
	}

	public void setZoneMappings(List<ZoneMapping> zoneMappings) {
		this.zoneMappings = zoneMappings;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}

	public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
		return this.loadBalancerBillingConfig;
	}

	public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
		this.loadBalancerBillingConfig = loadBalancerBillingConfig;
	}

	public DeletionProtectionConfig getDeletionProtectionConfig() {
		return this.deletionProtectionConfig;
	}

	public void setDeletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
		this.deletionProtectionConfig = deletionProtectionConfig;
	}

	public ModificationProtectionConfig getModificationProtectionConfig() {
		return this.modificationProtectionConfig;
	}

	public void setModificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
		this.modificationProtectionConfig = modificationProtectionConfig;
	}

	public static class OperationLock {

		private String lockType;

		private String lockReason;

		public String getLockType() {
			return this.lockType;
		}

		public void setLockType(String lockType) {
			this.lockType = lockType;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}
	}

	public static class ZoneMapping {

		private String vSwitchId;

		private String zoneId;

		private String eipType;

		private String status;

		private List<LoadBalancerAddress> loadBalancerAddresses;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getEipType() {
			return this.eipType;
		}

		public void setEipType(String eipType) {
			this.eipType = eipType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<LoadBalancerAddress> getLoadBalancerAddresses() {
			return this.loadBalancerAddresses;
		}

		public void setLoadBalancerAddresses(List<LoadBalancerAddress> loadBalancerAddresses) {
			this.loadBalancerAddresses = loadBalancerAddresses;
		}

		public static class LoadBalancerAddress {

			private String eniId;

			private String privateIPv4Address;

			private String allocationId;

			private String publicIPv4Address;

			private String ipv6Address;

			private String privateIPv4HcStatus;

			private String privateIPv6HcStatus;

			public String getEniId() {
				return this.eniId;
			}

			public void setEniId(String eniId) {
				this.eniId = eniId;
			}

			public String getPrivateIPv4Address() {
				return this.privateIPv4Address;
			}

			public void setPrivateIPv4Address(String privateIPv4Address) {
				this.privateIPv4Address = privateIPv4Address;
			}

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}

			public String getPublicIPv4Address() {
				return this.publicIPv4Address;
			}

			public void setPublicIPv4Address(String publicIPv4Address) {
				this.publicIPv4Address = publicIPv4Address;
			}

			public String getIpv6Address() {
				return this.ipv6Address;
			}

			public void setIpv6Address(String ipv6Address) {
				this.ipv6Address = ipv6Address;
			}

			public String getPrivateIPv4HcStatus() {
				return this.privateIPv4HcStatus;
			}

			public void setPrivateIPv4HcStatus(String privateIPv4HcStatus) {
				this.privateIPv4HcStatus = privateIPv4HcStatus;
			}

			public String getPrivateIPv6HcStatus() {
				return this.privateIPv6HcStatus;
			}

			public void setPrivateIPv6HcStatus(String privateIPv6HcStatus) {
				this.privateIPv6HcStatus = privateIPv6HcStatus;
			}
		}
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

	public static class LoadBalancerBillingConfig {

		private Integer internetBandwidth;

		private String internetChargeType;

		private String payType;

		public Integer getInternetBandwidth() {
			return this.internetBandwidth;
		}

		public void setInternetBandwidth(Integer internetBandwidth) {
			this.internetBandwidth = internetBandwidth;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}
	}

	public static class DeletionProtectionConfig {

		private Boolean enabled;

		private String reason;

		private String enabledTime;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getEnabledTime() {
			return this.enabledTime;
		}

		public void setEnabledTime(String enabledTime) {
			this.enabledTime = enabledTime;
		}
	}

	public static class ModificationProtectionConfig {

		private String status;

		private String reason;

		private String enabledTime;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getEnabledTime() {
			return this.enabledTime;
		}

		public void setEnabledTime(String enabledTime) {
			this.enabledTime = enabledTime;
		}
	}

	@Override
	public GetLoadBalancerAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetLoadBalancerAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
