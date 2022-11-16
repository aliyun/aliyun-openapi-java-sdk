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

		private String residentArea;

		private Integer projectId;

		private String projectIdentifier;

		private String projectName;

		private Integer isAllowDownload;

		private Integer projectMode;

		private String projectDescription;

		private String gmtModified;

		private String projectOwnerBaseId;

		private Integer developmentType;

		private String defaultDiResourceGroupIdentifier;

		private String gmtCreate;

		private Integer schedulerMaxRetryTimes;

		private Integer protectedMode;

		private Long tenantId;

		private Integer schedulerRetryInterval;

		private String resourceManagerResourceGroupId;

		private Boolean disableDevelopment;

		private Boolean useProxyOdpsAccount;

		private Integer tablePrivacyMode;

		private Integer isDefault;

		private List<Tag> tags;

		private List<String> envTypes;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getResidentArea() {
			return this.residentArea;
		}

		public void setResidentArea(String residentArea) {
			this.residentArea = residentArea;
		}

		public Integer getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

		public String getProjectIdentifier() {
			return this.projectIdentifier;
		}

		public void setProjectIdentifier(String projectIdentifier) {
			this.projectIdentifier = projectIdentifier;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
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

		public String getProjectDescription() {
			return this.projectDescription;
		}

		public void setProjectDescription(String projectDescription) {
			this.projectDescription = projectDescription;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getProjectOwnerBaseId() {
			return this.projectOwnerBaseId;
		}

		public void setProjectOwnerBaseId(String projectOwnerBaseId) {
			this.projectOwnerBaseId = projectOwnerBaseId;
		}

		public Integer getDevelopmentType() {
			return this.developmentType;
		}

		public void setDevelopmentType(Integer developmentType) {
			this.developmentType = developmentType;
		}

		public String getDefaultDiResourceGroupIdentifier() {
			return this.defaultDiResourceGroupIdentifier;
		}

		public void setDefaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
			this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
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

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Integer getSchedulerRetryInterval() {
			return this.schedulerRetryInterval;
		}

		public void setSchedulerRetryInterval(Integer schedulerRetryInterval) {
			this.schedulerRetryInterval = schedulerRetryInterval;
		}

		public String getResourceManagerResourceGroupId() {
			return this.resourceManagerResourceGroupId;
		}

		public void setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
			this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
		}

		public Boolean getDisableDevelopment() {
			return this.disableDevelopment;
		}

		public void setDisableDevelopment(Boolean disableDevelopment) {
			this.disableDevelopment = disableDevelopment;
		}

		public Boolean getUseProxyOdpsAccount() {
			return this.useProxyOdpsAccount;
		}

		public void setUseProxyOdpsAccount(Boolean useProxyOdpsAccount) {
			this.useProxyOdpsAccount = useProxyOdpsAccount;
		}

		public Integer getTablePrivacyMode() {
			return this.tablePrivacyMode;
		}

		public void setTablePrivacyMode(Integer tablePrivacyMode) {
			this.tablePrivacyMode = tablePrivacyMode;
		}

		public Integer getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Integer isDefault) {
			this.isDefault = isDefault;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getEnvTypes() {
			return this.envTypes;
		}

		public void setEnvTypes(List<String> envTypes) {
			this.envTypes = envTypes;
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
