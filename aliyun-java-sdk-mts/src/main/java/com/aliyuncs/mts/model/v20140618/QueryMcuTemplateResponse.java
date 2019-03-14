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
import com.aliyuncs.mts.transform.v20140618.QueryMcuTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMcuTemplateResponse extends AcsResponse {

	private String requestId;

	private List<Job> templates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Job> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Job> templates) {
		this.templates = templates;
	}

	public static class Job {

		private String templateId;

		private String template;

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}
	}

	@Override
	public QueryMcuTemplateResponse getInstance(UnmarshallerContext context) {
		return	QueryMcuTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
