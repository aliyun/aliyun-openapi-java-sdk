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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListFeatureTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFeatureTablesResponse extends AcsResponse {

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

		private String status;

		private String featureTableId;

		private String type;

		private String gmtCreate;

		private String gmtModified;

		private Meta meta;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFeatureTableId() {
			return this.featureTableId;
		}

		public void setFeatureTableId(String featureTableId) {
			this.featureTableId = featureTableId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class Meta {

			private String dataSourceId;

			private Boolean internal;

			private String metaType;

			private String source;

			private Long updateFrequency;

			private List<FeatureListItem> featureList;

			public String getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(String dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public Boolean getInternal() {
				return this.internal;
			}

			public void setInternal(Boolean internal) {
				this.internal = internal;
			}

			public String getMetaType() {
				return this.metaType;
			}

			public void setMetaType(String metaType) {
				this.metaType = metaType;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public Long getUpdateFrequency() {
				return this.updateFrequency;
			}

			public void setUpdateFrequency(Long updateFrequency) {
				this.updateFrequency = updateFrequency;
			}

			public List<FeatureListItem> getFeatureList() {
				return this.featureList;
			}

			public void setFeatureList(List<FeatureListItem> featureList) {
				this.featureList = featureList;
			}

			public static class FeatureListItem {

				private String comment;

				private String featureName;

				private String fieldName;

				private String status;

				public String getComment() {
					return this.comment;
				}

				public void setComment(String comment) {
					this.comment = comment;
				}

				public String getFeatureName() {
					return this.featureName;
				}

				public void setFeatureName(String featureName) {
					this.featureName = featureName;
				}

				public String getFieldName() {
					return this.fieldName;
				}

				public void setFieldName(String fieldName) {
					this.fieldName = fieldName;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}
		}
	}

	@Override
	public ListFeatureTablesResponse getInstance(UnmarshallerContext context) {
		return	ListFeatureTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
