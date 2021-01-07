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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.CreateFilteringAlgorithmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFilteringAlgorithmResponse extends AcsResponse {

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

		private String algorithmId;

		private String status;

		private String gmtCreate;

		private String gmtModified;

		private Meta meta;

		public String getAlgorithmId() {
			return this.algorithmId;
		}

		public void setAlgorithmId(String algorithmId) {
			this.algorithmId = algorithmId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

			private String algorithmName;

			private String type;

			private String projectName;

			private String tableName;

			private String category;

			private Map<Object,Object> extInfo;

			private String cron;

			private Boolean cronEnabled;

			private String gmtModified;

			private String gmtCreate;

			private String status;

			private String description;

			private Threshold threshold;

			public String getAlgorithmName() {
				return this.algorithmName;
			}

			public void setAlgorithmName(String algorithmName) {
				this.algorithmName = algorithmName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Map<Object,Object> getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(Map<Object,Object> extInfo) {
				this.extInfo = extInfo;
			}

			public String getCron() {
				return this.cron;
			}

			public void setCron(String cron) {
				this.cron = cron;
			}

			public Boolean getCronEnabled() {
				return this.cronEnabled;
			}

			public void setCronEnabled(Boolean cronEnabled) {
				this.cronEnabled = cronEnabled;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Threshold getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Threshold threshold) {
				this.threshold = threshold;
			}

			public static class Threshold {

				private Integer indexLossThreshold;

				private Integer indexSizeThreshold;

				private Integer sourceDataSizeThreshold;

				private Integer sourceDataRecordThreshold;

				public Integer getIndexLossThreshold() {
					return this.indexLossThreshold;
				}

				public void setIndexLossThreshold(Integer indexLossThreshold) {
					this.indexLossThreshold = indexLossThreshold;
				}

				public Integer getIndexSizeThreshold() {
					return this.indexSizeThreshold;
				}

				public void setIndexSizeThreshold(Integer indexSizeThreshold) {
					this.indexSizeThreshold = indexSizeThreshold;
				}

				public Integer getSourceDataSizeThreshold() {
					return this.sourceDataSizeThreshold;
				}

				public void setSourceDataSizeThreshold(Integer sourceDataSizeThreshold) {
					this.sourceDataSizeThreshold = sourceDataSizeThreshold;
				}

				public Integer getSourceDataRecordThreshold() {
					return this.sourceDataRecordThreshold;
				}

				public void setSourceDataRecordThreshold(Integer sourceDataRecordThreshold) {
					this.sourceDataRecordThreshold = sourceDataRecordThreshold;
				}
			}
		}
	}

	@Override
	public CreateFilteringAlgorithmResponse getInstance(UnmarshallerContext context) {
		return	CreateFilteringAlgorithmResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
