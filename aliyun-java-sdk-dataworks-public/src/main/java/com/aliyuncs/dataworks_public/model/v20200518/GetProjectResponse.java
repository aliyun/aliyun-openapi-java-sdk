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
import com.aliyuncs.dataworks_public.transform.v20200518.GetProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer status;

		private Integer maxFlowNode;

		private Integer projectId;

		private Integer isAllowDownload;

		private Integer projectMode;

		private String gmtModified;

		private String prodStorageQuota;

		private String projectDescription;

		private Integer developmentType;

		private Integer tablePrivacyMode;

		private String defaultDiResourceGroupIdentifier;

		private Integer schedulerMaxRetryTimes;

		private Integer protectedMode;

		private Integer schedulerRetryInterval;

		private String appkey;

		private String devStorageQuota;

		private String residentArea;

		private Integer isDefault;

		private Integer destination;

		private String projectName;

		private String projectIdentifier;

		private Boolean disableDevelopment;

		private String projectOwnerBaseId;

		private Boolean baseProject;

		private Boolean useProxyOdpsAccount;

		private String gmtCreate;

		private Long tenantId;

		private List<String> envTypes;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getMaxFlowNode() {
			return this.maxFlowNode;
		}

		public void setMaxFlowNode(Integer maxFlowNode) {
			this.maxFlowNode = maxFlowNode;
		}

		public Integer getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

		public Integer getIsAllowDownload() {
			return this.isAllowDownload;
		}

		public void setIsAllowDownload(Integer isAllowDownload) {
			this.isAllowDownload = isAllowDownload;
		}

		public Integer getProjectMode() {
			return this.projectMode;
		}

		public void setProjectMode(Integer projectMode) {
			this.projectMode = projectMode;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getProdStorageQuota() {
			return this.prodStorageQuota;
		}

		public void setProdStorageQuota(String prodStorageQuota) {
			this.prodStorageQuota = prodStorageQuota;
		}

		public String getProjectDescription() {
			return this.projectDescription;
		}

		public void setProjectDescription(String projectDescription) {
			this.projectDescription = projectDescription;
		}

		public Integer getDevelopmentType() {
			return this.developmentType;
		}

		public void setDevelopmentType(Integer developmentType) {
			this.developmentType = developmentType;
		}

		public Integer getTablePrivacyMode() {
			return this.tablePrivacyMode;
		}

		public void setTablePrivacyMode(Integer tablePrivacyMode) {
			this.tablePrivacyMode = tablePrivacyMode;
		}

		public String getDefaultDiResourceGroupIdentifier() {
			return this.defaultDiResourceGroupIdentifier;
		}

		public void setDefaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
			this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
		}

		public Integer getSchedulerMaxRetryTimes() {
			return this.schedulerMaxRetryTimes;
		}

		public void setSchedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
			this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
		}

		public Integer getProtectedMode() {
			return this.protectedMode;
		}

		public void setProtectedMode(Integer protectedMode) {
			this.protectedMode = protectedMode;
		}

		public Integer getSchedulerRetryInterval() {
			return this.schedulerRetryInterval;
		}

		public void setSchedulerRetryInterval(Integer schedulerRetryInterval) {
			this.schedulerRetryInterval = schedulerRetryInterval;
		}

		public String getAppkey() {
			return this.appkey;
		}

		public void setAppkey(String appkey) {
			this.appkey = appkey;
		}

		public String getDevStorageQuota() {
			return this.devStorageQuota;
		}

		public void setDevStorageQuota(String devStorageQuota) {
			this.devStorageQuota = devStorageQuota;
		}

		public String getResidentArea() {
			return this.residentArea;
		}

		public void setResidentArea(String residentArea) {
			this.residentArea = residentArea;
		}

		public Integer getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Integer isDefault) {
			this.isDefault = isDefault;
		}

		public Integer getDestination() {
			return this.destination;
		}

		public void setDestination(Integer destination) {
			this.destination = destination;
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

		public Boolean getDisableDevelopment() {
			return this.disableDevelopment;
		}

		public void setDisableDevelopment(Boolean disableDevelopment) {
			this.disableDevelopment = disableDevelopment;
		}

		public String getProjectOwnerBaseId() {
			return this.projectOwnerBaseId;
		}

		public void setProjectOwnerBaseId(String projectOwnerBaseId) {
			this.projectOwnerBaseId = projectOwnerBaseId;
		}

		public Boolean getBaseProject() {
			return this.baseProject;
		}

		public void setBaseProject(Boolean baseProject) {
			this.baseProject = baseProject;
		}

		public Boolean getUseProxyOdpsAccount() {
			return this.useProxyOdpsAccount;
		}

		public void setUseProxyOdpsAccount(Boolean useProxyOdpsAccount) {
			this.useProxyOdpsAccount = useProxyOdpsAccount;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public List<String> getEnvTypes() {
			return this.envTypes;
		}

		public void setEnvTypes(List<String> envTypes) {
			this.envTypes = envTypes;
		}
	}

	@Override
	public GetProjectResponse getInstance(UnmarshallerContext context) {
		return	GetProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
