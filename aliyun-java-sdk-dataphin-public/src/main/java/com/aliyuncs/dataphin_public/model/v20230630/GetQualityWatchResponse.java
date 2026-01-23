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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetQualityWatchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityWatchResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private QualityWatchInfo qualityWatchInfo;

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

	public QualityWatchInfo getQualityWatchInfo() {
		return this.qualityWatchInfo;
	}

	public void setQualityWatchInfo(QualityWatchInfo qualityWatchInfo) {
		this.qualityWatchInfo = qualityWatchInfo;
	}

	public static class QualityWatchInfo {

		private String type;

		private Long id;

		private String name;

		private String status;

		private String qualityOwner;

		private String qualityOwnerName;

		private Long latestWatchTaskId;

		private String latestWatchTaskStatus;

		private Long ruleCount;

		private Long enabledRuleCount;

		private String creator;

		private String creatorName;

		private String createTime;

		private String modifyTime;

		private String modifier;

		private DataSourceInfo dataSourceInfo;

		private TableInfo tableInfo;

		private IndexInfo indexInfo;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getQualityOwner() {
			return this.qualityOwner;
		}

		public void setQualityOwner(String qualityOwner) {
			this.qualityOwner = qualityOwner;
		}

		public String getQualityOwnerName() {
			return this.qualityOwnerName;
		}

		public void setQualityOwnerName(String qualityOwnerName) {
			this.qualityOwnerName = qualityOwnerName;
		}

		public Long getLatestWatchTaskId() {
			return this.latestWatchTaskId;
		}

		public void setLatestWatchTaskId(Long latestWatchTaskId) {
			this.latestWatchTaskId = latestWatchTaskId;
		}

		public String getLatestWatchTaskStatus() {
			return this.latestWatchTaskStatus;
		}

		public void setLatestWatchTaskStatus(String latestWatchTaskStatus) {
			this.latestWatchTaskStatus = latestWatchTaskStatus;
		}

		public Long getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Long ruleCount) {
			this.ruleCount = ruleCount;
		}

		public Long getEnabledRuleCount() {
			return this.enabledRuleCount;
		}

		public void setEnabledRuleCount(Long enabledRuleCount) {
			this.enabledRuleCount = enabledRuleCount;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public DataSourceInfo getDataSourceInfo() {
			return this.dataSourceInfo;
		}

		public void setDataSourceInfo(DataSourceInfo dataSourceInfo) {
			this.dataSourceInfo = dataSourceInfo;
		}

		public TableInfo getTableInfo() {
			return this.tableInfo;
		}

		public void setTableInfo(TableInfo tableInfo) {
			this.tableInfo = tableInfo;
		}

		public IndexInfo getIndexInfo() {
			return this.indexInfo;
		}

		public void setIndexInfo(IndexInfo indexInfo) {
			this.indexInfo = indexInfo;
		}

		public static class DataSourceInfo {

			private String id;

			private String name;

			private String type;

			private String creator;

			private String creatorName;

			private String owner;

			private String ownerName;

			private String createTime;

			private String modifyTime;

			private String env;

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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}
		}

		public static class TableInfo {

			private String type;

			private String catalog;

			private String id;

			private String name;

			private String description;

			private String env;

			private String owner;

			private String ownerName;

			private Long bizUnitId;

			private String bizUnitName;

			private Long projectId;

			private String projectName;

			private String dataSourceType;

			private String dataSourceId;

			private Boolean isPartitionTable;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCatalog() {
				return this.catalog;
			}

			public void setCatalog(String catalog) {
				this.catalog = catalog;
			}

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

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public Long getBizUnitId() {
				return this.bizUnitId;
			}

			public void setBizUnitId(Long bizUnitId) {
				this.bizUnitId = bizUnitId;
			}

			public String getBizUnitName() {
				return this.bizUnitName;
			}

			public void setBizUnitName(String bizUnitName) {
				this.bizUnitName = bizUnitName;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getDataSourceType() {
				return this.dataSourceType;
			}

			public void setDataSourceType(String dataSourceType) {
				this.dataSourceType = dataSourceType;
			}

			public String getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(String dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public Boolean getIsPartitionTable() {
				return this.isPartitionTable;
			}

			public void setIsPartitionTable(Boolean isPartitionTable) {
				this.isPartitionTable = isPartitionTable;
			}
		}

		public static class IndexInfo {

			private Long projectId;

			private String projectName;

			private String catalog;

			private String id;

			private String guid;

			private String name;

			private String displayName;

			private Long granularityId;

			private String granularityDisplayName;

			private String computeType;

			private String cellSumLogicTableName;

			private String type;

			private Long bizUnitId;

			private String bizUnitName;

			private String owner;

			private String ownerName;

			private String description;

			private String dateType;

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getCatalog() {
				return this.catalog;
			}

			public void setCatalog(String catalog) {
				this.catalog = catalog;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

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

			public Long getGranularityId() {
				return this.granularityId;
			}

			public void setGranularityId(Long granularityId) {
				this.granularityId = granularityId;
			}

			public String getGranularityDisplayName() {
				return this.granularityDisplayName;
			}

			public void setGranularityDisplayName(String granularityDisplayName) {
				this.granularityDisplayName = granularityDisplayName;
			}

			public String getComputeType() {
				return this.computeType;
			}

			public void setComputeType(String computeType) {
				this.computeType = computeType;
			}

			public String getCellSumLogicTableName() {
				return this.cellSumLogicTableName;
			}

			public void setCellSumLogicTableName(String cellSumLogicTableName) {
				this.cellSumLogicTableName = cellSumLogicTableName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getBizUnitId() {
				return this.bizUnitId;
			}

			public void setBizUnitId(Long bizUnitId) {
				this.bizUnitId = bizUnitId;
			}

			public String getBizUnitName() {
				return this.bizUnitName;
			}

			public void setBizUnitName(String bizUnitName) {
				this.bizUnitName = bizUnitName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getOwnerName() {
				return this.ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDateType() {
				return this.dateType;
			}

			public void setDateType(String dateType) {
				this.dateType = dateType;
			}
		}
	}

	@Override
	public GetQualityWatchResponse getInstance(UnmarshallerContext context) {
		return	GetQualityWatchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
