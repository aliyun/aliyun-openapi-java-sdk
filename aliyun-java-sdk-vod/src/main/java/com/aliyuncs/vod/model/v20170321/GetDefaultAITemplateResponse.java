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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetDefaultAITemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDefaultAITemplateResponse extends AcsResponse {

	private String requestId;

	private TemplateInfo templateInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TemplateInfo getTemplateInfo() {
		return this.templateInfo;
	}

	public void setTemplateInfo(TemplateInfo templateInfo) {
		this.templateInfo = templateInfo;
	}

	public static class TemplateInfo {

		private String creationTime;

		private String isDefault;

		private String templateType;

		private String templateConfig;

		private String templateName;

		private String source;

		private String templateId;

		private String modifyTime;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(String isDefault) {
			this.isDefault = isDefault;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public String getTemplateConfig() {
			return this.templateConfig;
		}

		public void setTemplateConfig(String templateConfig) {
			this.templateConfig = templateConfig;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public GetDefaultAITemplateResponse getInstance(UnmarshallerContext context) {
		return	GetDefaultAITemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
