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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<Application> applications;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public static class Application {

		private String instanceId;

		private String applicationId;

		private String clientId;

		private String logoUrl;

		private String applicationName;

		private String description;

		private String ssoType;

		private String applicationSourceType;

		private String features;

		private String status;

		private Long createTime;

		private Long updateTime;

		private Boolean serviceManaged;

		private String managedServiceCode;

		private String applicationTemplateId;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSsoType() {
			return this.ssoType;
		}

		public void setSsoType(String ssoType) {
			this.ssoType = ssoType;
		}

		public String getApplicationSourceType() {
			return this.applicationSourceType;
		}

		public void setApplicationSourceType(String applicationSourceType) {
			this.applicationSourceType = applicationSourceType;
		}

		public String getFeatures() {
			return this.features;
		}

		public void setFeatures(String features) {
			this.features = features;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getServiceManaged() {
			return this.serviceManaged;
		}

		public void setServiceManaged(Boolean serviceManaged) {
			this.serviceManaged = serviceManaged;
		}

		public String getManagedServiceCode() {
			return this.managedServiceCode;
		}

		public void setManagedServiceCode(String managedServiceCode) {
			this.managedServiceCode = managedServiceCode;
		}

		public String getApplicationTemplateId() {
			return this.applicationTemplateId;
		}

		public void setApplicationTemplateId(String applicationTemplateId) {
			this.applicationTemplateId = applicationTemplateId;
		}
	}

	@Override
	public ListApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
