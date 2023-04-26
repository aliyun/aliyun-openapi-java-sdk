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

package com.aliyuncs.config.model.v20200907;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.ListRemediationTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRemediationTemplatesResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private String totalCount;

	private List<RemediationTemplate> remediationTemplates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<RemediationTemplate> getRemediationTemplates() {
		return this.remediationTemplates;
	}

	public void setRemediationTemplates(List<RemediationTemplate> remediationTemplates) {
		this.remediationTemplates = remediationTemplates;
	}

	public static class RemediationTemplate {

		private String compulsoryParameters;

		private String remediationType;

		private String templateIdentifier;

		private String templateName;

		private String templateDefinition;

		private String templateDescription;

		public String getCompulsoryParameters() {
			return this.compulsoryParameters;
		}

		public void setCompulsoryParameters(String compulsoryParameters) {
			this.compulsoryParameters = compulsoryParameters;
		}

		public String getRemediationType() {
			return this.remediationType;
		}

		public void setRemediationType(String remediationType) {
			this.remediationType = remediationType;
		}

		public String getTemplateIdentifier() {
			return this.templateIdentifier;
		}

		public void setTemplateIdentifier(String templateIdentifier) {
			this.templateIdentifier = templateIdentifier;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getTemplateDefinition() {
			return this.templateDefinition;
		}

		public void setTemplateDefinition(String templateDefinition) {
			this.templateDefinition = templateDefinition;
		}

		public String getTemplateDescription() {
			return this.templateDescription;
		}

		public void setTemplateDescription(String templateDescription) {
			this.templateDescription = templateDescription;
		}
	}

	@Override
	public ListRemediationTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListRemediationTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
