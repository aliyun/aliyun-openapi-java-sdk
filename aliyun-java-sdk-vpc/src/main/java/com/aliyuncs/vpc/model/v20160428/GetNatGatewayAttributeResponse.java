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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.GetNatGatewayAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNatGatewayAttributeResponse extends AcsResponse {

	private String vpcId;

	private String creationTime;

	private String status;

	private String natType;

	private String networkType;

	private String regionId;

	private Boolean ecsMetricEnabled;

	private String requestId;

	private String description;

	private String expiredTime;

	private String resourceGroupId;

	private String natGatewayId;

	private String businessStatus;

	private String name;

	private List<IpListItem> ipList;

	private ForwardTable forwardTable;

	private SnatTable snatTable;

	private BillingConfig billingConfig;

	private PrivateInfo privateInfo;

	private DeletionProtectionInfo deletionProtectionInfo;

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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNatType() {
		return this.natType;
	}

	public void setNatType(String natType) {
		this.natType = natType;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Boolean getEcsMetricEnabled() {
		return this.ecsMetricEnabled;
	}

	public void setEcsMetricEnabled(Boolean ecsMetricEnabled) {
		this.ecsMetricEnabled = ecsMetricEnabled;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IpListItem> getIpList() {
		return this.ipList;
	}

	public void setIpList(List<IpListItem> ipList) {
		this.ipList = ipList;
	}

	public ForwardTable getForwardTable() {
		return this.forwardTable;
	}

	public void setForwardTable(ForwardTable forwardTable) {
		this.forwardTable = forwardTable;
	}

	public SnatTable getSnatTable() {
		return this.snatTable;
	}

	public void setSnatTable(SnatTable snatTable) {
		this.snatTable = snatTable;
	}

	public BillingConfig getBillingConfig() {
		return this.billingConfig;
	}

	public void setBillingConfig(BillingConfig billingConfig) {
		this.billingConfig = billingConfig;
	}

	public PrivateInfo getPrivateInfo() {
		return this.privateInfo;
	}

	public void setPrivateInfo(PrivateInfo privateInfo) {
		this.privateInfo = privateInfo;
	}

	public DeletionProtectionInfo getDeletionProtectionInfo() {
		return this.deletionProtectionInfo;
	}

	public void setDeletionProtectionInfo(DeletionProtectionInfo deletionProtectionInfo) {
		this.deletionProtectionInfo = deletionProtectionInfo;
	}

	public static class IpListItem {

		private String usingStatus;

		private String ipAddress;

		private String allocationId;

		public String getUsingStatus() {
			return this.usingStatus;
		}

		public void setUsingStatus(String usingStatus) {
			this.usingStatus = usingStatus;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}
	}

	public static class ForwardTable {

		private String forwardTableId;

		private Integer forwardEntryCount;

		public String getForwardTableId() {
			return this.forwardTableId;
		}

		public void setForwardTableId(String forwardTableId) {
			this.forwardTableId = forwardTableId;
		}

		public Integer getForwardEntryCount() {
			return this.forwardEntryCount;
		}

		public void setForwardEntryCount(Integer forwardEntryCount) {
			this.forwardEntryCount = forwardEntryCount;
		}
	}

	public static class SnatTable {

		private Integer snatEntryCount;

		private String snatTableId;

		public Integer getSnatEntryCount() {
			return this.snatEntryCount;
		}

		public void setSnatEntryCount(Integer snatEntryCount) {
			this.snatEntryCount = snatEntryCount;
		}

		public String getSnatTableId() {
			return this.snatTableId;
		}

		public void setSnatTableId(String snatTableId) {
			this.snatTableId = snatTableId;
		}
	}

	public static class BillingConfig {

		private String internetChargeType;

		private String autoPay;

		private String spec;

		private String instanceChargeType;

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getAutoPay() {
			return this.autoPay;
		}

		public void setAutoPay(String autoPay) {
			this.autoPay = autoPay;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}
	}

	public static class PrivateInfo {

		private Integer maxBandwidth;

		private String vswitchId;

		private String privateIpAddress;

		private String izNo;

		private String eniInstanceId;

		public Integer getMaxBandwidth() {
			return this.maxBandwidth;
		}

		public void setMaxBandwidth(Integer maxBandwidth) {
			this.maxBandwidth = maxBandwidth;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getEniInstanceId() {
			return this.eniInstanceId;
		}

		public void setEniInstanceId(String eniInstanceId) {
			this.eniInstanceId = eniInstanceId;
		}
	}

	public static class DeletionProtectionInfo {

		private Boolean enabled;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
	}

	@Override
	public GetNatGatewayAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetNatGatewayAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
