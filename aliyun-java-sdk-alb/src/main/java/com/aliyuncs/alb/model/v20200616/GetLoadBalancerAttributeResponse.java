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

package com.aliyuncs.alb.model.v20200616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.GetLoadBalancerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLoadBalancerAttributeResponse extends AcsResponse {

	private String addressAllocatedMode;

	private String addressType;

	private Integer bandwidthCapacity;

	private String bandwidthPackageId;

	private String createTime;

	private String dNSName;

	private String loadBalancerBussinessStatus;

	private String loadBalancerEdition;

	private String loadBalancerId;

	private String loadBalancerName;

	private Boolean serviceManagedEnabled;

	private String serviceManagedMode;

	private String loadBalancerStatus;

	private String regionId;

	private String requestId;

	private String resourceGroupId;

	private String vpcId;

	private Boolean configManagedEnabled;

	private String addressIpVersion;

	private String ipv6AddressType;

	private Boolean backToOriginRouteEnabled;

	private String loadBalancerVersion;

	private String sysSecurityGroupId;

	private List<LoadBalancerOperationLock> loadBalancerOperationLocks;

	private List<Tag> tags;

	private List<ZoneMapping> zoneMappings;

	private List<String> featureLabels;

	private List<String> securityGroupIds;

	private AccessLogConfig accessLogConfig;

	private DeletionProtectionConfig deletionProtectionConfig;

	private LoadBalancerBillingConfig loadBalancerBillingConfig;

	private ModificationProtectionConfig modificationProtectionConfig;

	public String getAddressAllocatedMode() {
		return this.addressAllocatedMode;
	}

	public void setAddressAllocatedMode(String addressAllocatedMode) {
		this.addressAllocatedMode = addressAllocatedMode;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Integer getBandwidthCapacity() {
		return this.bandwidthCapacity;
	}

	public void setBandwidthCapacity(Integer bandwidthCapacity) {
		this.bandwidthCapacity = bandwidthCapacity;
	}

	public String getBandwidthPackageId() {
		return this.bandwidthPackageId;
	}

	public void setBandwidthPackageId(String bandwidthPackageId) {
		this.bandwidthPackageId = bandwidthPackageId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDNSName() {
		return this.dNSName;
	}

	public void setDNSName(String dNSName) {
		this.dNSName = dNSName;
	}

	public String getLoadBalancerBussinessStatus() {
		return this.loadBalancerBussinessStatus;
	}

	public void setLoadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
		this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
	}

	public String getLoadBalancerEdition() {
		return this.loadBalancerEdition;
	}

	public void setLoadBalancerEdition(String loadBalancerEdition) {
		this.loadBalancerEdition = loadBalancerEdition;
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

	public Boolean getServiceManagedEnabled() {
		return this.serviceManagedEnabled;
	}

	public void setServiceManagedEnabled(Boolean serviceManagedEnabled) {
		this.serviceManagedEnabled = serviceManagedEnabled;
	}

	public String getServiceManagedMode() {
		return this.serviceManagedMode;
	}

	public void setServiceManagedMode(String serviceManagedMode) {
		this.serviceManagedMode = serviceManagedMode;
	}

	public String getLoadBalancerStatus() {
		return this.loadBalancerStatus;
	}

	public void setLoadBalancerStatus(String loadBalancerStatus) {
		this.loadBalancerStatus = loadBalancerStatus;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public Boolean getConfigManagedEnabled() {
		return this.configManagedEnabled;
	}

	public void setConfigManagedEnabled(Boolean configManagedEnabled) {
		this.configManagedEnabled = configManagedEnabled;
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

	public Boolean getBackToOriginRouteEnabled() {
		return this.backToOriginRouteEnabled;
	}

	public void setBackToOriginRouteEnabled(Boolean backToOriginRouteEnabled) {
		this.backToOriginRouteEnabled = backToOriginRouteEnabled;
	}

	public String getLoadBalancerVersion() {
		return this.loadBalancerVersion;
	}

	public void setLoadBalancerVersion(String loadBalancerVersion) {
		this.loadBalancerVersion = loadBalancerVersion;
	}

	public String getSysSecurityGroupId() {
		return this.sysSecurityGroupId;
	}

	public void setSysSecurityGroupId(String sysSecurityGroupId) {
		this.sysSecurityGroupId = sysSecurityGroupId;
	}

	public List<LoadBalancerOperationLock> getLoadBalancerOperationLocks() {
		return this.loadBalancerOperationLocks;
	}

	public void setLoadBalancerOperationLocks(List<LoadBalancerOperationLock> loadBalancerOperationLocks) {
		this.loadBalancerOperationLocks = loadBalancerOperationLocks;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<ZoneMapping> getZoneMappings() {
		return this.zoneMappings;
	}

	public void setZoneMappings(List<ZoneMapping> zoneMappings) {
		this.zoneMappings = zoneMappings;
	}

	public List<String> getFeatureLabels() {
		return this.featureLabels;
	}

	public void setFeatureLabels(List<String> featureLabels) {
		this.featureLabels = featureLabels;
	}

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}

	public AccessLogConfig getAccessLogConfig() {
		return this.accessLogConfig;
	}

	public void setAccessLogConfig(AccessLogConfig accessLogConfig) {
		this.accessLogConfig = accessLogConfig;
	}

	public DeletionProtectionConfig getDeletionProtectionConfig() {
		return this.deletionProtectionConfig;
	}

	public void setDeletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
		this.deletionProtectionConfig = deletionProtectionConfig;
	}

	public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
		return this.loadBalancerBillingConfig;
	}

	public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
		this.loadBalancerBillingConfig = loadBalancerBillingConfig;
	}

	public ModificationProtectionConfig getModificationProtectionConfig() {
		return this.modificationProtectionConfig;
	}

	public void setModificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
		this.modificationProtectionConfig = modificationProtectionConfig;
	}

	public static class LoadBalancerOperationLock {

		private String lockReason;

		private String lockType;

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getLockType() {
			return this.lockType;
		}

		public void setLockType(String lockType) {
			this.lockType = lockType;
		}
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

	public static class ZoneMapping {

		private String vSwitchId;

		private String zoneId;

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

		public List<LoadBalancerAddress> getLoadBalancerAddresses() {
			return this.loadBalancerAddresses;
		}

		public void setLoadBalancerAddresses(List<LoadBalancerAddress> loadBalancerAddresses) {
			this.loadBalancerAddresses = loadBalancerAddresses;
		}

		public static class LoadBalancerAddress {

			private String address;

			private String ipv6Address;

			private String intranetAddress;

			private String allocationId;

			private String eipType;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getIpv6Address() {
				return this.ipv6Address;
			}

			public void setIpv6Address(String ipv6Address) {
				this.ipv6Address = ipv6Address;
			}

			public String getIntranetAddress() {
				return this.intranetAddress;
			}

			public void setIntranetAddress(String intranetAddress) {
				this.intranetAddress = intranetAddress;
			}

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}

			public String getEipType() {
				return this.eipType;
			}

			public void setEipType(String eipType) {
				this.eipType = eipType;
			}
		}
	}

	public static class AccessLogConfig {

		private String logProject;

		private String logStore;

		public String getLogProject() {
			return this.logProject;
		}

		public void setLogProject(String logProject) {
			this.logProject = logProject;
		}

		public String getLogStore() {
			return this.logStore;
		}

		public void setLogStore(String logStore) {
			this.logStore = logStore;
		}
	}

	public static class DeletionProtectionConfig {

		private Boolean enabled;

		private String enabledTime;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getEnabledTime() {
			return this.enabledTime;
		}

		public void setEnabledTime(String enabledTime) {
			this.enabledTime = enabledTime;
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

	public static class ModificationProtectionConfig {

		private String reason;

		private String status;

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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
