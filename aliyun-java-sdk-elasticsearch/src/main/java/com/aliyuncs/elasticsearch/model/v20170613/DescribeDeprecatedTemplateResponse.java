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
import com.aliyuncs.elasticsearch.transform.v20170613.DescribeDeprecatedTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeprecatedTemplateResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean dataStream;

		private String indexTemplate;

		private Long order;

		private String version;

		private List<String> indexPatterns;

		private Template template;

		public Boolean getDataStream() {
			return this.dataStream;
		}

		public void setDataStream(Boolean dataStream) {
			this.dataStream = dataStream;
		}

		public String getIndexTemplate() {
			return this.indexTemplate;
		}

		public void setIndexTemplate(String indexTemplate) {
			this.indexTemplate = indexTemplate;
		}

		public Long getOrder() {
			return this.order;
		}

		public void setOrder(Long order) {
			this.order = order;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
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

			private String aliases;

			private String mappings;

			private String settings;

			public String getAliases() {
				return this.aliases;
			}

			public void setAliases(String aliases) {
				this.aliases = aliases;
			}

			public String getMappings() {
				return this.mappings;
			}

			public void setMappings(String mappings) {
				this.mappings = mappings;
			}

			public String getSettings() {
				return this.settings;
			}

			public void setSettings(String settings) {
				this.settings = settings;
			}
		}
	}

	@Override
	public DescribeDeprecatedTemplateResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeprecatedTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
