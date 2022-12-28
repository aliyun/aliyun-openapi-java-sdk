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

package com.aliyuncs.es_serverless.model.v20220822;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.es_serverless.transform.v20220822.ListDataStreamsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataStreamsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<DataStream> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataStream> getResult() {
		return this.result;
	}

	public void setResult(List<DataStream> result) {
		this.result = result;
	}

	public static class DataStream {

		private String appName;

		private String regionId;

		private String deletePhase;

		private String dataStreamName;

		private String dataStreamId;

		private String type;

		private String createTime;

		private String timeStampKey;

		private Template template;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDeletePhase() {
			return this.deletePhase;
		}

		public void setDeletePhase(String deletePhase) {
			this.deletePhase = deletePhase;
		}

		public String getDataStreamName() {
			return this.dataStreamName;
		}

		public void setDataStreamName(String dataStreamName) {
			this.dataStreamName = dataStreamName;
		}

		public String getDataStreamId() {
			return this.dataStreamId;
		}

		public void setDataStreamId(String dataStreamId) {
			this.dataStreamId = dataStreamId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTimeStampKey() {
			return this.timeStampKey;
		}

		public void setTimeStampKey(String timeStampKey) {
			this.timeStampKey = timeStampKey;
		}

		public Template getTemplate() {
			return this.template;
		}

		public void setTemplate(Template template) {
			this.template = template;
		}

		public static class Template {

			private List<MappingsItem> mappings;

			public List<MappingsItem> getMappings() {
				return this.mappings;
			}

			public void setMappings(List<MappingsItem> mappings) {
				this.mappings = mappings;
			}

			public static class MappingsItem {

				private String type;

				private Boolean caseSensitive;

				private Boolean docValues;

				private Boolean index;

				private String key;

				private List<String> tokenizeOnChars;

				private List<String> properties;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getCaseSensitive() {
					return this.caseSensitive;
				}

				public void setCaseSensitive(Boolean caseSensitive) {
					this.caseSensitive = caseSensitive;
				}

				public Boolean getDocValues() {
					return this.docValues;
				}

				public void setDocValues(Boolean docValues) {
					this.docValues = docValues;
				}

				public Boolean getIndex() {
					return this.index;
				}

				public void setIndex(Boolean index) {
					this.index = index;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public List<String> getTokenizeOnChars() {
					return this.tokenizeOnChars;
				}

				public void setTokenizeOnChars(List<String> tokenizeOnChars) {
					this.tokenizeOnChars = tokenizeOnChars;
				}

				public List<String> getProperties() {
					return this.properties;
				}

				public void setProperties(List<String> properties) {
					this.properties = properties;
				}
			}
		}
	}

	@Override
	public ListDataStreamsResponse getInstance(UnmarshallerContext context) {
		return	ListDataStreamsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
