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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.GetMonitoringTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMonitoringTemplateResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private String errorMessage;

	private Resource resource;

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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Resource getResource() {
		return this.resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public static class Resource {

		private String name;

		private String id;

		private String restVersion;

		private String namespace;

		private String description;

		private String alertTemplatesJson;

		private String eventRuleTemplatesJson;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRestVersion() {
			return this.restVersion;
		}

		public void setRestVersion(String restVersion) {
			this.restVersion = restVersion;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAlertTemplatesJson() {
			return this.alertTemplatesJson;
		}

		public void setAlertTemplatesJson(String alertTemplatesJson) {
			this.alertTemplatesJson = alertTemplatesJson;
		}

		public String getEventRuleTemplatesJson() {
			return this.eventRuleTemplatesJson;
		}

		public void setEventRuleTemplatesJson(String eventRuleTemplatesJson) {
			this.eventRuleTemplatesJson = eventRuleTemplatesJson;
		}
	}

	@Override
	public GetMonitoringTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetMonitoringTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
