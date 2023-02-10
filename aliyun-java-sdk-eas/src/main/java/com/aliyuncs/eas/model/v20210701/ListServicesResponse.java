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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.ListServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServicesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ServicesItem> services;

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

	public List<ServicesItem> getServices() {
		return this.services;
	}

	public void setServices(List<ServicesItem> services) {
		this.services = services;
	}

	public static class ServicesItem {

		private String requestId;

		private String region;

		private String callerUid;

		private String parentUid;

		private Integer currentVersion;

		private Integer cpu;

		private Integer gpu;

		private String image;

		private Integer pendingInstance;

		private Integer runningInstance;

		private Integer totalInstance;

		private String internetEndpoint;

		private String intranetEndpoint;

		private Integer latestVersion;

		private Integer memory;

		private String message;

		private String namespace;

		private String reason;

		private String resource;

		private String resourceAlias;

		private String serviceConfig;

		private String serviceName;

		private String serviceGroup;

		private String status;

		private String createTime;

		private String updateTime;

		private Integer weight;

		private String serviceId;

		private String serviceUid;

		private String accessToken;

		private String source;

		private String extraData;

		private String role;

		private String roleAttrs;

		private String safetyLock;

		private List<LabelsItem> labels;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getCallerUid() {
			return this.callerUid;
		}

		public void setCallerUid(String callerUid) {
			this.callerUid = callerUid;
		}

		public String getParentUid() {
			return this.parentUid;
		}

		public void setParentUid(String parentUid) {
			this.parentUid = parentUid;
		}

		public Integer getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(Integer currentVersion) {
			this.currentVersion = currentVersion;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getGpu() {
			return this.gpu;
		}

		public void setGpu(Integer gpu) {
			this.gpu = gpu;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public Integer getPendingInstance() {
			return this.pendingInstance;
		}

		public void setPendingInstance(Integer pendingInstance) {
			this.pendingInstance = pendingInstance;
		}

		public Integer getRunningInstance() {
			return this.runningInstance;
		}

		public void setRunningInstance(Integer runningInstance) {
			this.runningInstance = runningInstance;
		}

		public Integer getTotalInstance() {
			return this.totalInstance;
		}

		public void setTotalInstance(Integer totalInstance) {
			this.totalInstance = totalInstance;
		}

		public String getInternetEndpoint() {
			return this.internetEndpoint;
		}

		public void setInternetEndpoint(String internetEndpoint) {
			this.internetEndpoint = internetEndpoint;
		}

		public String getIntranetEndpoint() {
			return this.intranetEndpoint;
		}

		public void setIntranetEndpoint(String intranetEndpoint) {
			this.intranetEndpoint = intranetEndpoint;
		}

		public Integer getLatestVersion() {
			return this.latestVersion;
		}

		public void setLatestVersion(Integer latestVersion) {
			this.latestVersion = latestVersion;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getResource() {
			return this.resource;
		}

		public void setResource(String resource) {
			this.resource = resource;
		}

		public String getResourceAlias() {
			return this.resourceAlias;
		}

		public void setResourceAlias(String resourceAlias) {
			this.resourceAlias = resourceAlias;
		}

		public String getServiceConfig() {
			return this.serviceConfig;
		}

		public void setServiceConfig(String serviceConfig) {
			this.serviceConfig = serviceConfig;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceGroup() {
			return this.serviceGroup;
		}

		public void setServiceGroup(String serviceGroup) {
			this.serviceGroup = serviceGroup;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getServiceUid() {
			return this.serviceUid;
		}

		public void setServiceUid(String serviceUid) {
			this.serviceUid = serviceUid;
		}

		public String getAccessToken() {
			return this.accessToken;
		}

		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getExtraData() {
			return this.extraData;
		}

		public void setExtraData(String extraData) {
			this.extraData = extraData;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getRoleAttrs() {
			return this.roleAttrs;
		}

		public void setRoleAttrs(String roleAttrs) {
			this.roleAttrs = roleAttrs;
		}

		public String getSafetyLock() {
			return this.safetyLock;
		}

		public void setSafetyLock(String safetyLock) {
			this.safetyLock = safetyLock;
		}

		public List<LabelsItem> getLabels() {
			return this.labels;
		}

		public void setLabels(List<LabelsItem> labels) {
			this.labels = labels;
		}

		public static class LabelsItem {

			private String labelKey;

			private String labelValue;

			public String getLabelKey() {
				return this.labelKey;
			}

			public void setLabelKey(String labelKey) {
				this.labelKey = labelKey;
			}

			public String getLabelValue() {
				return this.labelValue;
			}

			public void setLabelValue(String labelValue) {
				this.labelValue = labelValue;
			}
		}
	}

	@Override
	public ListServicesResponse getInstance(UnmarshallerContext context) {
		return	ListServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
