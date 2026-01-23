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
import com.aliyuncs.dataphin_public.transform.v20230630.ListTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTablesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer totalCount;

		private List<Table> tableList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<Table> getTableList() {
			return this.tableList;
		}

		public void setTableList(List<Table> tableList) {
			this.tableList = tableList;
		}

		public static class Table {

			private String guid;

			private Long dataSourceId;

			private Long tableSizeInBytes;

			private Long lifeCycle;

			private String createTime;

			private String lastDdlTime;

			private String lastQueryTime;

			private String owner;

			private String creator;

			private Long visitCount30d;

			private String env;

			private String name;

			private String displayName;

			private String lastDmlTime;

			private String comment;

			private Long bizUnitId;

			private String bizUnitName;

			private Long dataDomainId;

			private String dataDomainName;

			private Long projectId;

			private String projectName;

			private String parentModelId;

			private String fileId;

			private Boolean isPartitionTable;

			private String storageType;

			private Boolean isBasicMode;

			private Long securityLevel;

			private String securityLevelName;

			private String securityLevelAbbreviation;

			private List<StreamTableConfigItem> streamTableConfig;

			private List<String> assetTagList;

			public String getGuid() {
				return this.guid;
			}

			public void setGuid(String guid) {
				this.guid = guid;
			}

			public Long getDataSourceId() {
				return this.dataSourceId;
			}

			public void setDataSourceId(Long dataSourceId) {
				this.dataSourceId = dataSourceId;
			}

			public Long getTableSizeInBytes() {
				return this.tableSizeInBytes;
			}

			public void setTableSizeInBytes(Long tableSizeInBytes) {
				this.tableSizeInBytes = tableSizeInBytes;
			}

			public Long getLifeCycle() {
				return this.lifeCycle;
			}

			public void setLifeCycle(Long lifeCycle) {
				this.lifeCycle = lifeCycle;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getLastDdlTime() {
				return this.lastDdlTime;
			}

			public void setLastDdlTime(String lastDdlTime) {
				this.lastDdlTime = lastDdlTime;
			}

			public String getLastQueryTime() {
				return this.lastQueryTime;
			}

			public void setLastQueryTime(String lastQueryTime) {
				this.lastQueryTime = lastQueryTime;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public Long getVisitCount30d() {
				return this.visitCount30d;
			}

			public void setVisitCount30d(Long visitCount30d) {
				this.visitCount30d = visitCount30d;
			}

			public String getEnv() {
				return this.env;
			}

			public void setEnv(String env) {
				this.env = env;
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

			public String getLastDmlTime() {
				return this.lastDmlTime;
			}

			public void setLastDmlTime(String lastDmlTime) {
				this.lastDmlTime = lastDmlTime;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
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

			public Long getDataDomainId() {
				return this.dataDomainId;
			}

			public void setDataDomainId(Long dataDomainId) {
				this.dataDomainId = dataDomainId;
			}

			public String getDataDomainName() {
				return this.dataDomainName;
			}

			public void setDataDomainName(String dataDomainName) {
				this.dataDomainName = dataDomainName;
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

			public String getParentModelId() {
				return this.parentModelId;
			}

			public void setParentModelId(String parentModelId) {
				this.parentModelId = parentModelId;
			}

			public String getFileId() {
				return this.fileId;
			}

			public void setFileId(String fileId) {
				this.fileId = fileId;
			}

			public Boolean getIsPartitionTable() {
				return this.isPartitionTable;
			}

			public void setIsPartitionTable(Boolean isPartitionTable) {
				this.isPartitionTable = isPartitionTable;
			}

			public String getStorageType() {
				return this.storageType;
			}

			public void setStorageType(String storageType) {
				this.storageType = storageType;
			}

			public Boolean getIsBasicMode() {
				return this.isBasicMode;
			}

			public void setIsBasicMode(Boolean isBasicMode) {
				this.isBasicMode = isBasicMode;
			}

			public Long getSecurityLevel() {
				return this.securityLevel;
			}

			public void setSecurityLevel(Long securityLevel) {
				this.securityLevel = securityLevel;
			}

			public String getSecurityLevelName() {
				return this.securityLevelName;
			}

			public void setSecurityLevelName(String securityLevelName) {
				this.securityLevelName = securityLevelName;
			}

			public String getSecurityLevelAbbreviation() {
				return this.securityLevelAbbreviation;
			}

			public void setSecurityLevelAbbreviation(String securityLevelAbbreviation) {
				this.securityLevelAbbreviation = securityLevelAbbreviation;
			}

			public List<StreamTableConfigItem> getStreamTableConfig() {
				return this.streamTableConfig;
			}

			public void setStreamTableConfig(List<StreamTableConfigItem> streamTableConfig) {
				this.streamTableConfig = streamTableConfig;
			}

			public List<String> getAssetTagList() {
				return this.assetTagList;
			}

			public void setAssetTagList(List<String> assetTagList) {
				this.assetTagList = assetTagList;
			}

			public static class StreamTableConfigItem {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListTablesResponse getInstance(UnmarshallerContext context) {
		return	ListTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
