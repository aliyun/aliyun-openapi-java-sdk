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

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<SmartAccessGateway> smartAccessGateways;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<SmartAccessGateway> getSmartAccessGateways() {
		return this.smartAccessGateways;
	}

	public void setSmartAccessGateways(List<SmartAccessGateway> smartAccessGateways) {
		this.smartAccessGateways = smartAccessGateways;
	}

	public static class SmartAccessGateway {

		private String description;

		private Integer upBandwidth4G;

		private String resourceGroupId;

		private Long endTime;

		private Integer userCount;

		private String vpnStatus;

		private String maxBandwidth;

		private String associatedCcnName;

		private String dpiMonitorStatus;

		private String cidrBlock;

		private String qosIds;

		private Integer upBandwidthWan;

		private String name;

		private String ipsecStatus;

		private String routingStrategy;

		private String associatedCcnId;

		private String backupSoftwareVersion;

		private String smartAGId;

		private String dpiStatus;

		private String enterpriseCode;

		private Integer securityLockThreshold;

		private String resellerUid;

		private String status;

		private String idaasId;

		private String idaasApplicationId;

		private Long createTime;

		private Long dataPlan;

		private String city;

		private String hardwareVersion;

		private Long smartAGUid;

		private String resellerInstanceId;

		private String softwareVersion;

		private String serialNumber;

		private String accessPointId;

		private String aclIds;

		private String backupStatus;

		private List<Link> links;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getUpBandwidth4G() {
			return this.upBandwidth4G;
		}

		public void setUpBandwidth4G(Integer upBandwidth4G) {
			this.upBandwidth4G = upBandwidth4G;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Integer userCount) {
			this.userCount = userCount;
		}

		public String getVpnStatus() {
			return this.vpnStatus;
		}

		public void setVpnStatus(String vpnStatus) {
			this.vpnStatus = vpnStatus;
		}

		public String getMaxBandwidth() {
			return this.maxBandwidth;
		}

		public void setMaxBandwidth(String maxBandwidth) {
			this.maxBandwidth = maxBandwidth;
		}

		public String getAssociatedCcnName() {
			return this.associatedCcnName;
		}

		public void setAssociatedCcnName(String associatedCcnName) {
			this.associatedCcnName = associatedCcnName;
		}

		public String getDpiMonitorStatus() {
			return this.dpiMonitorStatus;
		}

		public void setDpiMonitorStatus(String dpiMonitorStatus) {
			this.dpiMonitorStatus = dpiMonitorStatus;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getQosIds() {
			return this.qosIds;
		}

		public void setQosIds(String qosIds) {
			this.qosIds = qosIds;
		}

		public Integer getUpBandwidthWan() {
			return this.upBandwidthWan;
		}

		public void setUpBandwidthWan(Integer upBandwidthWan) {
			this.upBandwidthWan = upBandwidthWan;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIpsecStatus() {
			return this.ipsecStatus;
		}

		public void setIpsecStatus(String ipsecStatus) {
			this.ipsecStatus = ipsecStatus;
		}

		public String getRoutingStrategy() {
			return this.routingStrategy;
		}

		public void setRoutingStrategy(String routingStrategy) {
			this.routingStrategy = routingStrategy;
		}

		public String getAssociatedCcnId() {
			return this.associatedCcnId;
		}

		public void setAssociatedCcnId(String associatedCcnId) {
			this.associatedCcnId = associatedCcnId;
		}

		public String getBackupSoftwareVersion() {
			return this.backupSoftwareVersion;
		}

		public void setBackupSoftwareVersion(String backupSoftwareVersion) {
			this.backupSoftwareVersion = backupSoftwareVersion;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}

		public String getDpiStatus() {
			return this.dpiStatus;
		}

		public void setDpiStatus(String dpiStatus) {
			this.dpiStatus = dpiStatus;
		}

		public String getEnterpriseCode() {
			return this.enterpriseCode;
		}

		public void setEnterpriseCode(String enterpriseCode) {
			this.enterpriseCode = enterpriseCode;
		}

		public Integer getSecurityLockThreshold() {
			return this.securityLockThreshold;
		}

		public void setSecurityLockThreshold(Integer securityLockThreshold) {
			this.securityLockThreshold = securityLockThreshold;
		}

		public String getResellerUid() {
			return this.resellerUid;
		}

		public void setResellerUid(String resellerUid) {
			this.resellerUid = resellerUid;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIdaasId() {
			return this.idaasId;
		}

		public void setIdaasId(String idaasId) {
			this.idaasId = idaasId;
		}

		public String getIdaasApplicationId() {
			return this.idaasApplicationId;
		}

		public void setIdaasApplicationId(String idaasApplicationId) {
			this.idaasApplicationId = idaasApplicationId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getDataPlan() {
			return this.dataPlan;
		}

		public void setDataPlan(Long dataPlan) {
			this.dataPlan = dataPlan;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getHardwareVersion() {
			return this.hardwareVersion;
		}

		public void setHardwareVersion(String hardwareVersion) {
			this.hardwareVersion = hardwareVersion;
		}

		public Long getSmartAGUid() {
			return this.smartAGUid;
		}

		public void setSmartAGUid(Long smartAGUid) {
			this.smartAGUid = smartAGUid;
		}

		public String getResellerInstanceId() {
			return this.resellerInstanceId;
		}

		public void setResellerInstanceId(String resellerInstanceId) {
			this.resellerInstanceId = resellerInstanceId;
		}

		public String getSoftwareVersion() {
			return this.softwareVersion;
		}

		public void setSoftwareVersion(String softwareVersion) {
			this.softwareVersion = softwareVersion;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getAclIds() {
			return this.aclIds;
		}

		public void setAclIds(String aclIds) {
			this.aclIds = aclIds;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public List<Link> getLinks() {
			return this.links;
		}

		public void setLinks(List<Link> links) {
			this.links = links;
		}

		public static class Link {

			private String status;

			private String type;

			private Long endTime;

			private String instanceId;

			private String relateInstanceId;

			private String bandwidth;

			private String commodityType;

			private String relateInstanceRegionId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRelateInstanceId() {
				return this.relateInstanceId;
			}

			public void setRelateInstanceId(String relateInstanceId) {
				this.relateInstanceId = relateInstanceId;
			}

			public String getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(String bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getCommodityType() {
				return this.commodityType;
			}

			public void setCommodityType(String commodityType) {
				this.commodityType = commodityType;
			}

			public String getRelateInstanceRegionId() {
				return this.relateInstanceRegionId;
			}

			public void setRelateInstanceRegionId(String relateInstanceRegionId) {
				this.relateInstanceRegionId = relateInstanceRegionId;
			}
		}
	}

	@Override
	public DescribeSmartAccessGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartAccessGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
