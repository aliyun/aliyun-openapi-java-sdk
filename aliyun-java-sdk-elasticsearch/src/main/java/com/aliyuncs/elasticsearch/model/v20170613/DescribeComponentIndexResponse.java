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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.DescribeComponentIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeComponentIndexResponse extends AcsResponse {

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

		private Map<Object,Object> _meta;

		private Template template;

		public Map<Object,Object> get_Meta() {
			return this._meta;
		}

		public void set_Meta(Map<Object,Object> _meta) {
			this._meta = _meta;
		}

		public Template getTemplate() {
			return this.template;
		}

		public void setTemplate(Template template) {
			this.template = template;
		}

		public static class Template {

			private Map<Object,Object> aliases;

			private Map<Object,Object> mappings;

			private Map<Object,Object> settings;

			public Map<Object,Object> getAliases() {
				return this.aliases;
			}

			public void setAliases(Map<Object,Object> aliases) {
				this.aliases = aliases;
			}

			public Map<Object,Object> getMappings() {
				return this.mappings;
			}

			public void setMappings(Map<Object,Object> mappings) {
				this.mappings = mappings;
			}

			public Map<Object,Object> getSettings() {
				return this.settings;
			}

			public void setSettings(Map<Object,Object> settings) {
				this.settings = settings;
			}
		}
	}

	@Override
	public DescribeComponentIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeComponentIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
