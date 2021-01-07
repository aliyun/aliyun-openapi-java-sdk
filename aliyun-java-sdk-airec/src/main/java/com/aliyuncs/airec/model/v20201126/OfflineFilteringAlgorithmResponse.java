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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.OfflineFilteringAlgorithmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OfflineFilteringAlgorithmResponse extends AcsResponse {

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

		private String status;

		private String gmtCreate;

		private String gmtModified;

		private String algorithmId;

		private Meta meta;

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

			private String metaType;

			private String algorithmName;

			private String cron;

			private Boolean cronEnabled;

			private String taskId;

			private String projectName;

			private String tableName;

			private String type;

			private String category;

			private String clusterId;

			private String description;

			private ExtInfo extInfo;

			private Threshold threshold;

			public String getMetaType() {
				return this.metaType;
			}

			public void setMetaType(String metaType) {
				this.metaType = metaType;
			}

			public String getAlgorithmName() {
				return this.algorithmName;
			}

			public void setAlgorithmName(String algorithmName) {
				this.algorithmName = algorithmName;
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

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public ExtInfo getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(ExtInfo extInfo) {
				this.extInfo = extInfo;
			}

			public Threshold getThreshold() {
				return this.threshold;
			}

			public void setThreshold(Threshold threshold) {
				this.threshold = threshold;
			}

			public static class ExtInfo {

				private String itemSeparator;

				private String kvSeparator;

				public String getItemSeparator() {
					return this.itemSeparator;
				}

				public void setItemSeparator(String itemSeparator) {
					this.itemSeparator = itemSeparator;
				}

				public String getKvSeparator() {
					return this.kvSeparator;
				}

				public void setKvSeparator(String kvSeparator) {
					this.kvSeparator = kvSeparator;
				}
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
	public OfflineFilteringAlgorithmResponse getInstance(UnmarshallerContext context) {
		return	OfflineFilteringAlgorithmResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
