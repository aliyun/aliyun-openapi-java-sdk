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
import com.aliyuncs.smartag.transform.v20180313.DescribeSmartAccessGatewayAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartAccessGatewayAttributeResponse extends AcsResponse {

	private Integer upBandwidth4G;

	private String description;

	private Long endTime;

	private String resourceGroupId;

	private Integer userCount;

	private String associatedCcnName;

	private String maxBandwidth;

	private String vpnStatus;

	private String boxControllerIp;

	private Integer upBandwidthWan;

	private String cidrBlock;

	private String name;

	private Boolean optimizationType;

	private String ipsecStatus;

	private String routingStrategy;

	private String associatedCcnId;

	private String smartAGId;

	private String instanceType;

	private String resellerUid;

	private Integer securityLockThreshold;

	private String status;

	private String requestId;

	private Long createTime;

	private Long dataPlan;

	private Boolean enableOptimization;

	private String city;

	private String resellerInstanceId;

	private String serialNumber;

	private String backupBoxControllerIp;

	private String trafficMasterSn;

	private String accessPointId;

	private String applicationBandwidthPackageId;

	private String applicationBandwidthPackageName;

	private Long accelerateBandwidth;

	private String applicationBandwidthPackageBussinessStatus;

	private List<Device> devices;

	private List<Link> links;

	private List<String> qosIds;

	private List<String> flowLogIds;

	private List<String> aclIds;

	private ApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks;

	public Integer getUpBandwidth4G() {
		return this.upBandwidth4G;
	}

	public void setUpBandwidth4G(Integer upBandwidth4G) {
		this.upBandwidth4G = upBandwidth4G;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
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

	public String getAssociatedCcnName() {
		return this.associatedCcnName;
	}

	public void setAssociatedCcnName(String associatedCcnName) {
		this.associatedCcnName = associatedCcnName;
	}

	public String getMaxBandwidth() {
		return this.maxBandwidth;
	}

	public void setMaxBandwidth(String maxBandwidth) {
		this.maxBandwidth = maxBandwidth;
	}

	public String getVpnStatus() {
		return this.vpnStatus;
	}

	public void setVpnStatus(String vpnStatus) {
		this.vpnStatus = vpnStatus;
	}

	public String getBoxControllerIp() {
		return this.boxControllerIp;
	}

	public void setBoxControllerIp(String boxControllerIp) {
		this.boxControllerIp = boxControllerIp;
	}

	public Integer getUpBandwidthWan() {
		return this.upBandwidthWan;
	}

	public void setUpBandwidthWan(Integer upBandwidthWan) {
		this.upBandwidthWan = upBandwidthWan;
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getOptimizationType() {
		return this.optimizationType;
	}

	public void setOptimizationType(Boolean optimizationType) {
		this.optimizationType = optimizationType;
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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getResellerUid() {
		return this.resellerUid;
	}

	public void setResellerUid(String resellerUid) {
		this.resellerUid = resellerUid;
	}

	public Integer getSecurityLockThreshold() {
		return this.securityLockThreshold;
	}

	public void setSecurityLockThreshold(Integer securityLockThreshold) {
		this.securityLockThreshold = securityLockThreshold;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getEnableOptimization() {
		return this.enableOptimization;
	}

	public void setEnableOptimization(Boolean enableOptimization) {
		this.enableOptimization = enableOptimization;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getResellerInstanceId() {
		return this.resellerInstanceId;
	}

	public void setResellerInstanceId(String resellerInstanceId) {
		this.resellerInstanceId = resellerInstanceId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBackupBoxControllerIp() {
		return this.backupBoxControllerIp;
	}

	public void setBackupBoxControllerIp(String backupBoxControllerIp) {
		this.backupBoxControllerIp = backupBoxControllerIp;
	}

	public String getTrafficMasterSn() {
		return this.trafficMasterSn;
	}

	public void setTrafficMasterSn(String trafficMasterSn) {
		this.trafficMasterSn = trafficMasterSn;
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

	public String getApplicationBandwidthPackageName() {
		return this.applicationBandwidthPackageName;
	}

	public void setApplicationBandwidthPackageName(String applicationBandwidthPackageName) {
		this.applicationBandwidthPackageName = applicationBandwidthPackageName;
	}

	public Long getAccelerateBandwidth() {
		return this.accelerateBandwidth;
	}

	public void setAccelerateBandwidth(Long accelerateBandwidth) {
		this.accelerateBandwidth = accelerateBandwidth;
	}

	public String getApplicationBandwidthPackageBussinessStatus() {
		return this.applicationBandwidthPackageBussinessStatus;
	}

	public void setApplicationBandwidthPackageBussinessStatus(String applicationBandwidthPackageBussinessStatus) {
		this.applicationBandwidthPackageBussinessStatus = applicationBandwidthPackageBussinessStatus;
	}

	public List<Device> getDevices() {
		return this.devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}

	public List<Link> getLinks() {
		return this.links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

	public List<String> getQosIds() {
		return this.qosIds;
	}

	public void setQosIds(List<String> qosIds) {
		this.qosIds = qosIds;
	}

	public List<String> getFlowLogIds() {
		return this.flowLogIds;
	}

	public void setFlowLogIds(List<String> flowLogIds) {
		this.flowLogIds = flowLogIds;
	}

	public List<String> getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(List<String> aclIds) {
		this.aclIds = aclIds;
	}

	public ApplicationBandwidthPackageOperationLocks getApplicationBandwidthPackageOperationLocks() {
		return this.applicationBandwidthPackageOperationLocks;
	}

	public void setApplicationBandwidthPackageOperationLocks(ApplicationBandwidthPackageOperationLocks applicationBandwidthPackageOperationLocks) {
		this.applicationBandwidthPackageOperationLocks = applicationBandwidthPackageOperationLocks;
	}

	public static class Device {

		private String serialNumber;

		private String haState;

		private String secretKey;

		private String dpiSignatureDbVersion;

		private String softwareVersion;

		private Integer distributeSkStatus;

		private String monitorVersion;

		private String hcState;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getHaState() {
			return this.haState;
		}

		public void setHaState(String haState) {
			this.haState = haState;
		}

		public String getSecretKey() {
			return this.secretKey;
		}

		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}

		public String getDpiSignatureDbVersion() {
			return this.dpiSignatureDbVersion;
		}

		public void setDpiSignatureDbVersion(String dpiSignatureDbVersion) {
			this.dpiSignatureDbVersion = dpiSignatureDbVersion;
		}

		public String getSoftwareVersion() {
			return this.softwareVersion;
		}

		public void setSoftwareVersion(String softwareVersion) {
			this.softwareVersion = softwareVersion;
		}

		public Integer getDistributeSkStatus() {
			return this.distributeSkStatus;
		}

		public void setDistributeSkStatus(Integer distributeSkStatus) {
			this.distributeSkStatus = distributeSkStatus;
		}

		public String getMonitorVersion() {
			return this.monitorVersion;
		}

		public void setMonitorVersion(String monitorVersion) {
			this.monitorVersion = monitorVersion;
		}

		public String getHcState() {
			return this.hcState;
		}

		public void setHcState(String hcState) {
			this.hcState = hcState;
		}
	}

	public static class Link {

		private String healthCheckTargetIp;

		private Long endTime;

		private String status;

		private String type;

		private String bandwidth;

		private String relateInstanceRegionId;

		private String relateInstanceId;

		private String instanceId;

		private String commodityType;

		public String getHealthCheckTargetIp() {
			return this.healthCheckTargetIp;
		}

		public void setHealthCheckTargetIp(String healthCheckTargetIp) {
			this.healthCheckTargetIp = healthCheckTargetIp;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

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

	public static class ApplicationBandwidthPackageOperationLocks {

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

	@Override
	public DescribeSmartAccessGatewayAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSmartAccessGatewayAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
