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
import com.aliyuncs.eiam.transform.v20211201.GetApplicationTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetApplicationTemplateResponse extends AcsResponse {

	private String requestId;

	private ApplicationTemplate applicationTemplate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ApplicationTemplate getApplicationTemplate() {
		return this.applicationTemplate;
	}

	public void setApplicationTemplate(ApplicationTemplate applicationTemplate) {
		this.applicationTemplate = applicationTemplate;
	}

	public static class ApplicationTemplate {

		private String applicationTemplateId;

		private String applicationTemplateName;

		private String description;

		private String logoUrl;

		private String helpDocumentUrl;

		private Long createTime;

		private Long updateTime;

		private Boolean serviceManaged;

		private String managedServiceCode;

		private String serviceConsoleUrl;

		private List<String> ssoTypes;

		private SaleInfo saleInfo;

		public String getApplicationTemplateId() {
			return this.applicationTemplateId;
		}

		public void setApplicationTemplateId(String applicationTemplateId) {
			this.applicationTemplateId = applicationTemplateId;
		}

		public String getApplicationTemplateName() {
			return this.applicationTemplateName;
		}

		public void setApplicationTemplateName(String applicationTemplateName) {
			this.applicationTemplateName = applicationTemplateName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLogoUrl() {
			return this.logoUrl;
		}

		public void setLogoUrl(String logoUrl) {
			this.logoUrl = logoUrl;
		}

		public String getHelpDocumentUrl() {
			return this.helpDocumentUrl;
		}

		public void setHelpDocumentUrl(String helpDocumentUrl) {
			this.helpDocumentUrl = helpDocumentUrl;
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

		public String getServiceConsoleUrl() {
			return this.serviceConsoleUrl;
		}

		public void setServiceConsoleUrl(String serviceConsoleUrl) {
			this.serviceConsoleUrl = serviceConsoleUrl;
		}

		public List<String> getSsoTypes() {
			return this.ssoTypes;
		}

		public void setSsoTypes(List<String> ssoTypes) {
			this.ssoTypes = ssoTypes;
		}

		public SaleInfo getSaleInfo() {
			return this.saleInfo;
		}

		public void setSaleInfo(SaleInfo saleInfo) {
			this.saleInfo = saleInfo;
		}

		public static class SaleInfo {

			private Boolean alwaysFree;

			public Boolean getAlwaysFree() {
				return this.alwaysFree;
			}

			public void setAlwaysFree(Boolean alwaysFree) {
				this.alwaysFree = alwaysFree;
			}
		}
	}

	@Override
	public GetApplicationTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetApplicationTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
