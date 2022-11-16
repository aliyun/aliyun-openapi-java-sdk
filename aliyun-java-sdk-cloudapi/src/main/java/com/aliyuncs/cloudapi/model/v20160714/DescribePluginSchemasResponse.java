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
import com.aliyuncs.cloudapi.transform.v20160714.DescribePluginSchemasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePluginSchemasResponse extends AcsResponse {

	private String requestId;

	private List<PluginSchema> pluginSchemas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PluginSchema> getPluginSchemas() {
		return this.pluginSchemas;
	}

	public void setPluginSchemas(List<PluginSchema> pluginSchemas) {
		this.pluginSchemas = pluginSchemas;
	}

	public static class PluginSchema {

		private String title;

		private String description;

		private String name;

		private String documentId;

		private Boolean supportClassic;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDocumentId() {
			return this.documentId;
		}

		public void setDocumentId(String documentId) {
			this.documentId = documentId;
		}

		public Boolean getSupportClassic() {
			return this.supportClassic;
		}

		public void setSupportClassic(Boolean supportClassic) {
			this.supportClassic = supportClassic;
		}
	}

	@Override
	public DescribePluginSchemasResponse getInstance(UnmarshallerContext context) {
		return	DescribePluginSchemasResponseUnmarshaller.unmarshall(this, context);
	}
}
