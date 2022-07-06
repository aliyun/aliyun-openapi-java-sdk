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

		private String gmtModified;

		private String status;

		private String gmtCreate;

		private String algorithmId;

		private Meta meta;

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
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

		public String getAlgorithmId() {
			return this.algorithmId;
		}

		public void setAlgorithmId(String algorithmId) {
			this.algorithmId = algorithmId;
		}

		public Meta getMeta() {
			return this.meta;
		}

		public void setMeta(Meta meta) {
			this.meta = meta;
		}

		public static class Meta {

			private String type;

			private Map<Object,Object> extInfo;

			private String category;

			private String status;

			private String gmtCreate;

			private String tableName;

			private String cron;

			private String description;

			private String gmtModified;

			private String projectName;

			private String algorithmName;

			private Boolean cronEnabled;

			private Threshold threshold;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Map<Object,Object> getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(Map<Object,Object> extInfo) {
				this.extInfo = extInfo;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
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

			public String getTableName() {
				return this.tableName;
			}

			public void setTableName(String tableName) {
				this.tableName = tableName;
			}

			public String getCron() {
				return this.cron;
			}

			public void setCron(String cron) {
				this.cron = cron;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getAlgorithmName() {
				return this.algorithmName;
			}

			public void setAlgorithmName(String algorithmName) {
				this.algorithmName = algorithmName;
			}

			public Boolean getCronEnabled() {
				return this.cronEnabled;
			}

			public void setCronEnabled(Boolean cronEnabled) {
				this.cronEnabled = cronEnabled;
			}

			public Threshold getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Threshold threshold) {
				this.threshold = threshold;
			}

			public static class Threshold {

				private Integer sourceDataSizeThreshold;

				private Integer sourceDataRecordThreshold;

				private Integer indexSizeThreshold;

				private Integer indexLossThreshold;

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

				public Integer getIndexSizeThreshold() {
					return this.indexSizeThreshold;
				}

				public void setIndexSizeThreshold(Integer indexSizeThreshold) {
					this.indexSizeThreshold = indexSizeThreshold;
				}

				public Integer getIndexLossThreshold() {
					return this.indexLossThreshold;
				}

				public void setIndexLossThreshold(Integer indexLossThreshold) {
					this.indexLossThreshold = indexLossThreshold;
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
