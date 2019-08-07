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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.CreateConfigTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateConfigTemplateResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private ConfigTemplate configTemplate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public ConfigTemplate getConfigTemplate() {
		return this.configTemplate;
	}

	public void setConfigTemplate(ConfigTemplate configTemplate) {
		this.configTemplate = configTemplate;
	}

	public static class ConfigTemplate {

		private String templateId;

		private String templateName;

		private String appId;

		private String stackId;

		private String appName;

		private String stackName;

		private Long createTime;

		private Long updateTime;

		private String pkgVersionId;

		private String templateType;

		private String templateDescription;

		private String pkgVersionLabel;

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
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

		public String getPkgVersionId() {
			return this.pkgVersionId;
		}

		public void setPkgVersionId(String pkgVersionId) {
			this.pkgVersionId = pkgVersionId;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public String getTemplateDescription() {
			return this.templateDescription;
		}

		public void setTemplateDescription(String templateDescription) {
			this.templateDescription = templateDescription;
		}

		public String getPkgVersionLabel() {
			return this.pkgVersionLabel;
		}

		public void setPkgVersionLabel(String pkgVersionLabel) {
			this.pkgVersionLabel = pkgVersionLabel;
		}
	}

	@Override
	public CreateConfigTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreateConfigTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
