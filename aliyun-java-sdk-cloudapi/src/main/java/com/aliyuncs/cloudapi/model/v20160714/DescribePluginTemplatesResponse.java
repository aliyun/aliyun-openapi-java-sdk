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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribePluginTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePluginTemplatesResponse extends AcsResponse {

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

		private String title;

		private String documentAnchor;

		private String description;

		private String documentId;

		private String sample;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDocumentAnchor() {
			return this.documentAnchor;
		}

		public void setDocumentAnchor(String documentAnchor) {
			this.documentAnchor = documentAnchor;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDocumentId() {
			return this.documentId;
		}

		public void setDocumentId(String documentId) {
			this.documentId = documentId;
		}

		public String getSample() {
			return this.sample;
		}

		public void setSample(String sample) {
			this.sample = sample;
		}
	}

	@Override
	public DescribePluginTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribePluginTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
