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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetBatchTaskUdfLineagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBatchTaskUdfLineagesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<LineageGroup> lineageGroupList;

		public List<LineageGroup> getLineageGroupList() {
			return this.lineageGroupList;
		}

		public void setLineageGroupList(List<LineageGroup> lineageGroupList) {
			this.lineageGroupList = lineageGroupList;
		}

		public static class LineageGroup {

			private List<LineageTable> inputLineageList;

			private List<LineageTable> outputLineageList;

			public List<LineageTable> getInputLineageList() {
				return this.inputLineageList;
			}

			public void setInputLineageList(List<LineageTable> inputLineageList) {
				this.inputLineageList = inputLineageList;
			}

			public List<LineageTable> getOutputLineageList() {
				return this.outputLineageList;
			}

			public void setOutputLineageList(List<LineageTable> outputLineageList) {
				this.outputLineageList = outputLineageList;
			}

			public static class LineageTable {

				private String name;

				private String displayName;

				private String guid;

				private String description;

				private String ownerName;

				private String ownerUserId;

				private String projectName;

				private String projectId;

				private String bizUnitId;

				private String bizUnitName;

				private String env;

				private String subType;

				private Boolean fullTable;

				private List<LineageColumn> columnList;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getGuid() {
					return this.guid;
				}

				public void setGuid(String guid) {
					this.guid = guid;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getOwnerName() {
					return this.ownerName;
				}

				public void setOwnerName(String ownerName) {
					this.ownerName = ownerName;
				}

				public String getOwnerUserId() {
					return this.ownerUserId;
				}

				public void setOwnerUserId(String ownerUserId) {
					this.ownerUserId = ownerUserId;
				}

				public String getProjectName() {
					return this.projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
				}

				public String getProjectId() {
					return this.projectId;
				}

				public void setProjectId(String projectId) {
					this.projectId = projectId;
				}

				public String getBizUnitId() {
					return this.bizUnitId;
				}

				public void setBizUnitId(String bizUnitId) {
					this.bizUnitId = bizUnitId;
				}

				public String getBizUnitName() {
					return this.bizUnitName;
				}

				public void setBizUnitName(String bizUnitName) {
					this.bizUnitName = bizUnitName;
				}

				public String getEnv() {
					return this.env;
				}

				public void setEnv(String env) {
					this.env = env;
				}

				public String getSubType() {
					return this.subType;
				}

				public void setSubType(String subType) {
					this.subType = subType;
				}

				public Boolean getFullTable() {
					return this.fullTable;
				}

				public void setFullTable(Boolean fullTable) {
					this.fullTable = fullTable;
				}

				public List<LineageColumn> getColumnList() {
					return this.columnList;
				}

				public void setColumnList(List<LineageColumn> columnList) {
					this.columnList = columnList;
				}

				public static class LineageColumn {

					private String id;

					private String name;

					private String description;

					private String dataType;

					private Boolean partitionKey;

					private Boolean primaryKey;

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}

					public String getDataType() {
						return this.dataType;
					}

					public void setDataType(String dataType) {
						this.dataType = dataType;
					}

					public Boolean getPartitionKey() {
						return this.partitionKey;
					}

					public void setPartitionKey(Boolean partitionKey) {
						this.partitionKey = partitionKey;
					}

					public Boolean getPrimaryKey() {
						return this.primaryKey;
					}

					public void setPrimaryKey(Boolean primaryKey) {
						this.primaryKey = primaryKey;
					}
				}
			}
		}
	}

	@Override
	public GetBatchTaskUdfLineagesResponse getInstance(UnmarshallerContext context) {
		return	GetBatchTaskUdfLineagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
