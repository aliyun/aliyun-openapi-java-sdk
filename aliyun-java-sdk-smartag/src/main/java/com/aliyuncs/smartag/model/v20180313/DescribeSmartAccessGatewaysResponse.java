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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSmartAccessGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartAccessGatewaysResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<SmartAccessGateway> smartAccessGateways;

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

	public List<SmartAccessGateway> getSmartAccessGateways() {
		return this.smartAccessGateways;
	}

	public void setSmartAccessGateways(List<SmartAccessGateway> smartAccessGateways) {
		this.smartAccessGateways = smartAccessGateways;
	}

	public static class SmartAccessGateway {

		private String serialNumber;

		private String status;

		private Integer upBandwidth4G;

		private String backupStatus;

		private String idaasApplicationId;

		private String softwareVersion;

		private Long createTime;

		private String smartAGId;

		private Integer upBandwidthWan;

		private String city;

		private String aclIds;

		private String qosIds;

		private String cidrBlock;

		private String description;

		private String ipsecStatus;

		private String enterpriseCode;

		private String dpiStatus;

		private String associatedCcnId;

		private String name;

		private String hardwareVersion;

		private String idaasId;

		private Long dataPlan;

		private String associatedCcnName;

		private String resellerUid;

		private String dpiMonitorStatus;

		private String maxBandwidth;

		private Long smartAGUid;

		private String backupSoftwareVersion;

		private Long endTime;

		private String resellerInstanceId;

		private String vpnStatus;

		private String routingStrategy;

		private Integer securityLockThreshold;

		private String resourceGroupId;

		private Integer userCount;

		private String accessPointId;

		private String applicationBandwidthPackageId;

		private Long accelerateBandwidth;

		private List<Link> links;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getUpBandwidth4G() {
			return this.upBandwidth4G;
		}

		public void setUpBandwidth4G(Integer upBandwidth4G) {
			this.upBandwidth4G = upBandwidth4G;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getIdaasApplicationId() {
			return this.idaasApplicationId;
		}

		public void setIdaasApplicationId(String idaasApplicationId) {
			this.idaasApplicationId = idaasApplicationId;
		}

		public String getSoftwareVersion() {
			return this.softwareVersion;
		}

		public void setSoftwareVersion(String softwareVersion) {
			this.softwareVersion = softwareVersion;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}

		public Integer getUpBandwidthWan() {
			return this.upBandwidthWan;
		}

		public void setUpBandwidthWan(Integer upBandwidthWan) {
			this.upBandwidthWan = upBandwidthWan;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAclIds() {
			return this.aclIds;
		}

		public void setAclIds(String aclIds) {
			this.aclIds = aclIds;
		}

		public String getQosIds() {
			return this.qosIds;
		}

		public void setQosIds(String qosIds) {
			this.qosIds = qosIds;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIpsecStatus() {
			return this.ipsecStatus;
		}

		public void setIpsecStatus(String ipsecStatus) {
			this.ipsecStatus = ipsecStatus;
		}

		public String getEnterpriseCode() {
			return this.enterpriseCode;
		}

		public void setEnterpriseCode(String enterpriseCode) {
			this.enterpriseCode = enterpriseCode;
		}

		public String getDpiStatus() {
			return this.dpiStatus;
		}

		public void setDpiStatus(String dpiStatus) {
			this.dpiStatus = dpiStatus;
		}

		public String getAssociatedCcnId() {
			return this.associatedCcnId;
		}

		public void setAssociatedCcnId(String associatedCcnId) {
			this.associatedCcnId = associatedCcnId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHardwareVersion() {
			return this.hardwareVersion;
		}

		public void setHardwareVersion(String hardwareVersion) {
			this.hardwareVersion = hardwareVersion;
		}

		public String getIdaasId() {
			return this.idaasId;
		}

		public void setIdaasId(String idaasId) {
			this.idaasId = idaasId;
		}

		public Long getDataPlan() {
			return this.dataPlan;
		}

		public void setDataPlan(Long dataPlan) {
			this.dataPlan = dataPlan;
		}

		public String getAssociatedCcnName() {
			return this.associatedCcnName;
		}

		public void setAssociatedCcnName(String associatedCcnName) {
			this.associatedCcnName = associatedCcnName;
		}

		public String getResellerUid() {
			return this.resellerUid;
		}

		public void setResellerUid(String resellerUid) {
			this.resellerUid = resellerUid;
		}

		public String getDpiMonitorStatus() {
			return this.dpiMonitorStatus;
		}

		public void setDpiMonitorStatus(String dpiMonitorStatus) {
			this.dpiMonitorStatus = dpiMonitorStatus;
		}

		public String getMaxBandwidth() {
			return this.maxBandwidth;
		}

		public void setMaxBandwidth(String maxBandwidth) {
			this.maxBandwidth = maxBandwidth;
		}

		public Long getSmartAGUid() {
			return this.smartAGUid;
		}

		public void setSmartAGUid(Long smartAGUid) {
			this.smartAGUid = smartAGUid;
		}

		public String getBackupSoftwareVersion() {
			return this.backupSoftwareVersion;
		}

		public void setBackupSoftwareVersion(String backupSoftwareVersion) {
			this.backupSoftwareVersion = backupSoftwareVersion;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getResellerInstanceId() {
			return this.resellerInstanceId;
		}

		public void setResellerInstanceId(String resellerInstanceId) {
			this.resellerInstanceId = resellerInstanceId;
		}

		public String getVpnStatus() {
			return this.vpnStatus;
		}

		public void setVpnStatus(String vpnStatus) {
			this.vpnStatus = vpnStatus;
		}

		public String getRoutingStrategy() {
			return this.routingStrategy;
		}

		public void setRoutingStrategy(String routingStrategy) {
			this.routingStrategy = routingStrategy;
		}

		public Integer getSecurityLockThreshold() {
			return this.securityLockThreshold;
		}

		public void setSecurityLockThreshold(Integer securityLockThreshold) {
			this.securityLockThreshold = securityLockThreshold;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Integer getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Integer userCount) {
			this.userCount = userCount;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getApplicationBandwidthPackageId() {
			return this.applicationBandwidthPackageId;
		}

		public void setApplicationBandwidthPackageId(String applicationBandwidthPackageId) {
			this.applicationBandwidthPackageId = applicationBandwidthPackageId;
		}

		public Long getAccelerateBandwidth() {
			return this.accelerateBandwidth;
		}

		public void setAccelerateBandwidth(Long accelerateBandwidth) {
			this.accelerateBandwidth = accelerateBandwidth;
		}

		public List<Link> getLinks() {
			return this.links;
		}

		public void setLinks(List<Link> links) {
			this.links = links;
		}

		public static class Link {

			private String type;

			private String status;

			private Long endTime;

			private String bandwidth;

			private String relateInstanceRegionId;

			private String relateInstanceId;

			private String instanceId;

			private String commodityType;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(String bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getRelateInstanceRegionId() {
				return this.relateInstanceRegionId;
			}

			public void setRelateInstanceRegionId(String relateInstanceRegionId) {
				this.relateInstanceRegionId = relateInstanceRegionId;
			}

			public String getRelateInstanceId() {
				return this.relateInstanceId;
			}

			public void setRelateInstanceId(String relateInstanceId) {
				this.relateInstanceId = relateInstanceId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getCommodityType() {
				return this.commodityType;
			}

			public void setCommodityType(String commodityType) {
				this.commodityType = commodityType;
			}
		}
	}

	@Override
	public DescribeSmartAccessGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartAccessGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
