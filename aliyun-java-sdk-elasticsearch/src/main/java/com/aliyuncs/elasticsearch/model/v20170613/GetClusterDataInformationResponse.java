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
import com.aliyuncs.elasticsearch.transform.v20170613.GetClusterDataInformationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterDataInformationResponse extends AcsResponse {

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

		private Boolean connectable;

		private MetaInfo metaInfo;

		public Boolean getConnectable() {
			return this.connectable;
		}

		public void setConnectable(Boolean connectable) {
			this.connectable = connectable;
		}

		public MetaInfo getMetaInfo() {
			return this.metaInfo;
		}

		public void setMetaInfo(MetaInfo metaInfo) {
			this.metaInfo = metaInfo;
		}

		public static class MetaInfo {

			private String settings;

			private String mapping;

			private List<String> indices;

			private List<String> fields;

			private List<String> typeName;

			public String getSettings() {
				return this.settings;
			}

			public void setSettings(String settings) {
				this.settings = settings;
			}

			public String getMapping() {
				return this.mapping;
			}

			public void setMapping(String mapping) {
				this.mapping = mapping;
			}

			public List<String> getIndices() {
				return this.indices;
			}

			public void setIndices(List<String> indices) {
				this.indices = indices;
			}

			public List<String> getFields() {
				return this.fields;
			}

			public void setFields(List<String> fields) {
				this.fields = fields;
			}

			public List<String> getTypeName() {
				return this.typeName;
			}

			public void setTypeName(List<String> typeName) {
				this.typeName = typeName;
			}
		}
	}

	@Override
	public GetClusterDataInformationResponse getInstance(UnmarshallerContext context) {
		return	GetClusterDataInformationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
