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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeCloudCenterInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudCenterInstancesResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<Instance> instances;

	private PageInfo pageInfo;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Instance {

		private String status;

		private String cpuInfo;

		private String internetIp;

		private String kernel;

		private Boolean bind;

		private String osName;

		private String tag;

		private String clientStatus;

		private Integer mem;

		private String vpcInstanceId;

		private String tagId;

		private Integer flag;

		private Long lastLoginTimestamp;

		private Integer authVersion;

		private String region;

		private String instanceName;

		private Integer podCount;

		private Integer vulCount;

		private String hcStatus;

		private Long createdTime;

		private String groupTrace;

		private String clusterId;

		private String riskStatus;

		private Integer cores;

		private String vulStatus;

		private String alarmStatus;

		private String macListString;

		private Integer importance;

		private Integer healthCheckCount;

		private String ip;

		private String os;

		private Long authModifyTime;

		private Integer safeEventCount;

		private String instanceId;

		private String assetType;

		private String intranetIp;

		private Integer vendor;

		private String regionId;

		private String uuid;

		private Long groupId;

		private String regionName;

		private String vendorName;

		private String authVersionName;

		private String clusterName;

		private Integer exposedStatus;

		private String riskCount;

		private String ipListString;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCpuInfo() {
			return this.cpuInfo;
		}

		public void setCpuInfo(String cpuInfo) {
			this.cpuInfo = cpuInfo;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getKernel() {
			return this.kernel;
		}

		public void setKernel(String kernel) {
			this.kernel = kernel;
		}

		public Boolean getBind() {
			return this.bind;
		}

		public void setBind(Boolean bind) {
			this.bind = bind;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getClientStatus() {
			return this.clientStatus;
		}

		public void setClientStatus(String clientStatus) {
			this.clientStatus = clientStatus;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
		}

		public Integer getFlag() {
			return this.flag;
		}

		public void setFlag(Integer flag) {
			this.flag = flag;
		}

		public Long getLastLoginTimestamp() {
			return this.lastLoginTimestamp;
		}

		public void setLastLoginTimestamp(Long lastLoginTimestamp) {
			this.lastLoginTimestamp = lastLoginTimestamp;
		}

		public Integer getAuthVersion() {
			return this.authVersion;
		}

		public void setAuthVersion(Integer authVersion) {
			this.authVersion = authVersion;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getPodCount() {
			return this.podCount;
		}

		public void setPodCount(Integer podCount) {
			this.podCount = podCount;
		}

		public Integer getVulCount() {
			return this.vulCount;
		}

		public void setVulCount(Integer vulCount) {
			this.vulCount = vulCount;
		}

		public String getHcStatus() {
			return this.hcStatus;
		}

		public void setHcStatus(String hcStatus) {
			this.hcStatus = hcStatus;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public String getGroupTrace() {
			return this.groupTrace;
		}

		public void setGroupTrace(String groupTrace) {
			this.groupTrace = groupTrace;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRiskStatus() {
			return this.riskStatus;
		}

		public void setRiskStatus(String riskStatus) {
			this.riskStatus = riskStatus;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public String getVulStatus() {
			return this.vulStatus;
		}

		public void setVulStatus(String vulStatus) {
			this.vulStatus = vulStatus;
		}

		public String getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(String alarmStatus) {
			this.alarmStatus = alarmStatus;
		}

		public String getMacListString() {
			return this.macListString;
		}

		public void setMacListString(String macListString) {
			this.macListString = macListString;
		}

		public Integer getImportance() {
			return this.importance;
		}

		public void setImportance(Integer importance) {
			this.importance = importance;
		}

		public Integer getHealthCheckCount() {
			return this.healthCheckCount;
		}

		public void setHealthCheckCount(Integer healthCheckCount) {
			this.healthCheckCount = healthCheckCount;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public Long getAuthModifyTime() {
			return this.authModifyTime;
		}

		public void setAuthModifyTime(Long authModifyTime) {
			this.authModifyTime = authModifyTime;
		}

		public Integer getSafeEventCount() {
			return this.safeEventCount;
		}

		public void setSafeEventCount(Integer safeEventCount) {
			this.safeEventCount = safeEventCount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Integer getVendor() {
			return this.vendor;
		}

		public void setVendor(Integer vendor) {
			this.vendor = vendor;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getVendorName() {
			return this.vendorName;
		}

		public void setVendorName(String vendorName) {
			this.vendorName = vendorName;
		}

		public String getAuthVersionName() {
			return this.authVersionName;
		}

		public void setAuthVersionName(String authVersionName) {
			this.authVersionName = authVersionName;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getExposedStatus() {
			return this.exposedStatus;
		}

		public void setExposedStatus(Integer exposedStatus) {
			this.exposedStatus = exposedStatus;
		}

		public String getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(String riskCount) {
			this.riskCount = riskCount;
		}

		public String getIpListString() {
			return this.ipListString;
		}

		public void setIpListString(String ipListString) {
			this.ipListString = ipListString;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeCloudCenterInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudCenterInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
