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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetProjectDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectDetailResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Boolean success;

	private String requestId;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String gmtModified;

		private Integer maxFlowNode;

		private String defaultDiResourceGroupIdentifier;

		private Integer destination;

		private Integer isAllowDownload;

		private String prodStorageQuota;

		private Integer schedulerRetryInterval;

		private String residentArea;

		private Integer tablePrivacyMode;

		private String projectOwnerBaseId;

		private Boolean useProxyOdpsAccount;

		private Boolean disableDevelopment;

		private Integer projectMode;

		private String gmtCreate;

		private String devStorageQuota;

		private Integer isDefault;

		private Integer protectedMode;

		private Boolean baseProject;

		private Long tenantId;

		private String projectDescription;

		private String appkey;

		private Integer schedulerMaxRetryTimes;

		private String projectName;

		private String projectIdentifier;

		private Integer projectId;

		private Integer status;

		private Integer developmentType;

		private List<String> envTypes;

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getMaxFlowNode() {
			return this.maxFlowNode;
		}

		public void setMaxFlowNode(Integer maxFlowNode) {
			this.maxFlowNode = maxFlowNode;
		}

		public String getDefaultDiResourceGroupIdentifier() {
			return this.defaultDiResourceGroupIdentifier;
		}

		public void setDefaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
			this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
		}

		public Integer getDestination() {
			return this.destination;
		}

		public void setDestination(Integer destination) {
			this.destination = destination;
		}

		public Integer getIsAllowDownload() {
			return this.isAllowDownload;
		}

		public void setIsAllowDownload(Integer isAllowDownload) {
			this.isAllowDownload = isAllowDownload;
		}

		public String getProdStorageQuota() {
			return this.prodStorageQuota;
		}

		public void setProdStorageQuota(String prodStorageQuota) {
			this.prodStorageQuota = prodStorageQuota;
		}

		public Integer getSchedulerRetryInterval() {
			return this.schedulerRetryInterval;
		}

		public void setSchedulerRetryInterval(Integer schedulerRetryInterval) {
			this.schedulerRetryInterval = schedulerRetryInterval;
		}

		public String getResidentArea() {
			return this.residentArea;
		}

		public void setResidentArea(String residentArea) {
			this.residentArea = residentArea;
		}

		public Integer getTablePrivacyMode() {
			return this.tablePrivacyMode;
		}

		public void setTablePrivacyMode(Integer tablePrivacyMode) {
			this.tablePrivacyMode = tablePrivacyMode;
		}

		public String getProjectOwnerBaseId() {
			return this.projectOwnerBaseId;
		}

		public void setProjectOwnerBaseId(String projectOwnerBaseId) {
			this.projectOwnerBaseId = projectOwnerBaseId;
		}

		public Boolean getUseProxyOdpsAccount() {
			return this.useProxyOdpsAccount;
		}

		public void setUseProxyOdpsAccount(Boolean useProxyOdpsAccount) {
			this.useProxyOdpsAccount = useProxyOdpsAccount;
		}

		public Boolean getDisableDevelopment() {
			return this.disableDevelopment;
		}

		public void setDisableDevelopment(Boolean disableDevelopment) {
			this.disableDevelopment = disableDevelopment;
		}

		public Integer getProjectMode() {
			return this.projectMode;
		}

		public void setProjectMode(Integer projectMode) {
			this.projectMode = projectMode;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getDevStorageQuota() {
			return this.devStorageQuota;
		}

		public void setDevStorageQuota(String devStorageQuota) {
			this.devStorageQuota = devStorageQuota;
		}

		public Integer getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Integer isDefault) {
			this.isDefault = isDefault;
		}

		public Integer getProtectedMode() {
			return this.protectedMode;
		}

		public void setProtectedMode(Integer protectedMode) {
			this.protectedMode = protectedMode;
		}

		public Boolean getBaseProject() {
			return this.baseProject;
		}

		public void setBaseProject(Boolean baseProject) {
			this.baseProject = baseProject;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public String getProjectDescription() {
			return this.projectDescription;
		}

		public void setProjectDescription(String projectDescription) {
			this.projectDescription = projectDescription;
		}

		public String getAppkey() {
			return this.appkey;
		}

		public void setAppkey(String appkey) {
			this.appkey = appkey;
		}

		public Integer getSchedulerMaxRetryTimes() {
			return this.schedulerMaxRetryTimes;
		}

		public void setSchedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
			this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectIdentifier() {
			return this.projectIdentifier;
		}

		public void setProjectIdentifier(String projectIdentifier) {
			this.projectIdentifier = projectIdentifier;
		}

		public Integer getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getDevelopmentType() {
			return this.developmentType;
		}

		public void setDevelopmentType(Integer developmentType) {
			this.developmentType = developmentType;
		}

		public List<String> getEnvTypes() {
			return this.envTypes;
		}

		public void setEnvTypes(List<String> envTypes) {
			this.envTypes = envTypes;
		}
	}

	@Override
	public GetProjectDetailResponse getInstance(UnmarshallerContext context) {
		return	GetProjectDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
