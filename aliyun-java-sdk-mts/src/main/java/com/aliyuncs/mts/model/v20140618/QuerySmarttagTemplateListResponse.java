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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QuerySmarttagTemplateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySmarttagTemplateListResponse extends AcsResponse {

	private String requestId;

	private List<Template> templates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public static class Template {

		private String analyseTypes;

		private String industry;

		private Boolean isDefault;

		private String templateName;

		private String templateId;

		private String faceCategoryIds;

		private String scene;

		public String getAnalyseTypes() {
			return this.analyseTypes;
		}

		public void setAnalyseTypes(String analyseTypes) {
			this.analyseTypes = analyseTypes;
		}

		public String getIndustry() {
			return this.industry;
		}

		public void setIndustry(String industry) {
			this.industry = industry;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getFaceCategoryIds() {
			return this.faceCategoryIds;
		}

		public void setFaceCategoryIds(String faceCategoryIds) {
			this.faceCategoryIds = faceCategoryIds;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}
	}

	@Override
	public QuerySmarttagTemplateListResponse getInstance(UnmarshallerContext context) {
		return	QuerySmarttagTemplateListResponseUnmarshaller.unmarshall(this, context);
	}
}
