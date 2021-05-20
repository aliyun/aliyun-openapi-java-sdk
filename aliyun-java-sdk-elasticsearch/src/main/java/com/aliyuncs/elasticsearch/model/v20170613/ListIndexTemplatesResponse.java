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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListIndexTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIndexTemplatesResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String indexTemplate;

		private Boolean dataStream;

		private Integer priority;

		private String ilmPolicy;

		private List<String> indexPatterns;

		private Template template;

		public String getIndexTemplate() {
			return this.indexTemplate;
		}

		public void setIndexTemplate(String indexTemplate) {
			this.indexTemplate = indexTemplate;
		}

		public Boolean getDataStream() {
			return this.dataStream;
		}

		public void setDataStream(Boolean dataStream) {
			this.dataStream = dataStream;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getIlmPolicy() {
			return this.ilmPolicy;
		}

		public void setIlmPolicy(String ilmPolicy) {
			this.ilmPolicy = ilmPolicy;
		}

		public List<String> getIndexPatterns() {
			return this.indexPatterns;
		}

		public void setIndexPatterns(List<String> indexPatterns) {
			this.indexPatterns = indexPatterns;
		}

		public Template getTemplate() {
			return this.template;
		}

		public void setTemplate(Template template) {
			this.template = template;
		}

		public static class Template {

			private String settings;

			private String mappings;

			private String aliases;

			public String getSettings() {
				return this.settings;
			}

			public void setSettings(String settings) {
				this.settings = settings;
			}

			public String getMappings() {
				return this.mappings;
			}

			public void setMappings(String mappings) {
				this.mappings = mappings;
			}

			public String getAliases() {
				return this.aliases;
			}

			public void setAliases(String aliases) {
				this.aliases = aliases;
			}
		}
	}

	@Override
	public ListIndexTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListIndexTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
