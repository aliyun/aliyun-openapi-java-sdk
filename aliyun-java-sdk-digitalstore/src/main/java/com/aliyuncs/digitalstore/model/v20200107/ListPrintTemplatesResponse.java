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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListPrintTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrintTemplatesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<PrintTemplateModel> printTemplates;

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

	public List<PrintTemplateModel> getPrintTemplates() {
		return this.printTemplates;
	}

	public void setPrintTemplates(List<PrintTemplateModel> printTemplates) {
		this.printTemplates = printTemplates;
	}

	public static class PrintTemplateModel {

		private String templateId;

		private String templateName;

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
	}

	@Override
	public ListPrintTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListPrintTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
