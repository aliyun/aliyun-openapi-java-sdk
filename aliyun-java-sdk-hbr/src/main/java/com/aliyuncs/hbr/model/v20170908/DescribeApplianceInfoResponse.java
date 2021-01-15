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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeApplianceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplianceInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Host> hostList;

	private List<Resource> resourceList;

	private List<Cluster> clusterList;

	private List<License> licenseList;

	private List<Storage> storageList;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<Host> getHostList() {
		return this.hostList;
	}

	public void setHostList(List<Host> hostList) {
		this.hostList = hostList;
	}

	public List<Resource> getResourceList() {
		return this.resourceList;
	}

	public void setResourceList(List<Resource> resourceList) {
		this.resourceList = resourceList;
	}

	public List<Cluster> getClusterList() {
		return this.clusterList;
	}

	public void setClusterList(List<Cluster> clusterList) {
		this.clusterList = clusterList;
	}

	public List<License> getLicenseList() {
		return this.licenseList;
	}

	public void setLicenseList(List<License> licenseList) {
		this.licenseList = licenseList;
	}

	public List<Storage> getStorageList() {
		return this.storageList;
	}

	public void setStorageList(List<Storage> storageList) {
		this.storageList = storageList;
	}

	public static class Host {

		private String applianceId;

		private String hostName;

		private String ipAddress;

		private String hostId;

		private String osType;

		private String osVersion;

		private String status;

		private String agentVersion;

		private Long reportTime;

		private Long createdTime;

		private Long updatedTime;

		public String getApplianceId() {
			return this.applianceId;
		}

		public void setApplianceId(String applianceId) {
			this.applianceId = applianceId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public Long getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(Long reportTime) {
			this.reportTime = reportTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}
	}

	public static class Resource {

		private String tenantName;

		private String resourceName;

		private String resourceId;

		private String module;

		private String hostId;

		private String status;

		private Long reportTime;

		private Long createdTime;

		private Long updatedTime;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(Long reportTime) {
			this.reportTime = reportTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}
	}

	public static class Cluster {

		private String tenantName;

		private String clusterName;

		private String clusterId;

		private String module;

		private String type;

		private String nodes;

		private String status;

		private Long reportTime;

		private Long createdTime;

		private Long updatedTime;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getModule() {
			return this.module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getNodes() {
			return this.nodes;
		}

		public void setNodes(String nodes) {
			this.nodes = nodes;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(Long reportTime) {
			this.reportTime = reportTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}
	}

	public static class License {

		private String licenseId;

		private String licenseVersion;

		private String licenseObject;

		private String mode;

		private String storage;

		private Long expireTime;

		private Long reportTime;

		private Long createdTime;

		private Long updatedTime;

		public String getLicenseId() {
			return this.licenseId;
		}

		public void setLicenseId(String licenseId) {
			this.licenseId = licenseId;
		}

		public String getLicenseVersion() {
			return this.licenseVersion;
		}

		public void setLicenseVersion(String licenseVersion) {
			this.licenseVersion = licenseVersion;
		}

		public String getLicenseObject() {
			return this.licenseObject;
		}

		public void setLicenseObject(String licenseObject) {
			this.licenseObject = licenseObject;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getStorage() {
			return this.storage;
		}

		public void setStorage(String storage) {
			this.storage = storage;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public Long getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(Long reportTime) {
			this.reportTime = reportTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}
	}

	public static class Storage {

		private String tenantName;

		private String storageName;

		private String type;

		private String storageId;

		private Long retentionDays;

		private Long availableSize;

		private Long totalSize;

		private Long reportTime;

		private Long createdTime;

		private Long updatedTime;

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getStorageName() {
			return this.storageName;
		}

		public void setStorageName(String storageName) {
			this.storageName = storageName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStorageId() {
			return this.storageId;
		}

		public void setStorageId(String storageId) {
			this.storageId = storageId;
		}

		public Long getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Long retentionDays) {
			this.retentionDays = retentionDays;
		}

		public Long getAvailableSize() {
			return this.availableSize;
		}

		public void setAvailableSize(Long availableSize) {
			this.availableSize = availableSize;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public Long getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(Long reportTime) {
			this.reportTime = reportTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}
	}

	@Override
	public DescribeApplianceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplianceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
