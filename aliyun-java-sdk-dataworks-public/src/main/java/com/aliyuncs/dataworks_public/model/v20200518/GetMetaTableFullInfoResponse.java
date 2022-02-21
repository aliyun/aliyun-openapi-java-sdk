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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetMetaTableFullInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableFullInfoResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String tableName;

		private String comment;

		private Integer lifeCycle;

		private Long createTime;

		private String projectName;

		private Long projectId;

		private String ownerId;

		private Integer envType;

		private Long lastAccessTime;

		private Long dataSize;

		private Long lastModifyTime;

		private String databaseName;

		private Integer isVisible;

		private Long totalColumnCount;

		private String tableGuid;

		private String partitionKeys;

		private Long lastDdlTime;

		private String location;

		private String clusterId;

		private Long tenantId;

		private List<ColumnListItem> columnList;

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Integer getLifeCycle() {
			return this.lifeCycle;
		}

		public void setLifeCycle(Integer lifeCycle) {
			this.lifeCycle = lifeCycle;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public Integer getEnvType() {
			return this.envType;
		}

		public void setEnvType(Integer envType) {
			this.envType = envType;
		}

		public Long getLastAccessTime() {
			return this.lastAccessTime;
		}

		public void setLastAccessTime(Long lastAccessTime) {
			this.lastAccessTime = lastAccessTime;
		}

		public Long getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Long dataSize) {
			this.dataSize = dataSize;
		}

		public Long getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(Long lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public Integer getIsVisible() {
			return this.isVisible;
		}

		public void setIsVisible(Integer isVisible) {
			this.isVisible = isVisible;
		}

		public Long getTotalColumnCount() {
			return this.totalColumnCount;
		}

		public void setTotalColumnCount(Long totalColumnCount) {
			this.totalColumnCount = totalColumnCount;
		}

		public String getTableGuid() {
			return this.tableGuid;
		}

		public void setTableGuid(String tableGuid) {
			this.tableGuid = tableGuid;
		}

		public String getPartitionKeys() {
			return this.partitionKeys;
		}

		public void setPartitionKeys(String partitionKeys) {
			this.partitionKeys = partitionKeys;
		}

		public Long getLastDdlTime() {
			return this.lastDdlTime;
		}

		public void setLastDdlTime(Long lastDdlTime) {
			this.lastDdlTime = lastDdlTime;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public List<ColumnListItem> getColumnList() {
			return this.columnList;
		}

		public void setColumnList(List<ColumnListItem> columnList) {
			this.columnList = columnList;
		}

		public static class ColumnListItem {

			private String columnName;

			private String columnGuid;

			private Boolean isPartitionColumn;

			private String comment;

			private String columnType;

			private Boolean isPrimaryKey;

			private Integer position;

			private String caption;

			private Boolean isForeignKey;

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public String getColumnGuid() {
				return this.columnGuid;
			}

			public void setColumnGuid(String columnGuid) {
				this.columnGuid = columnGuid;
			}

			public Boolean getIsPartitionColumn() {
				return this.isPartitionColumn;
			}

			public void setIsPartitionColumn(Boolean isPartitionColumn) {
				this.isPartitionColumn = isPartitionColumn;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getColumnType() {
				return this.columnType;
			}

			public void setColumnType(String columnType) {
				this.columnType = columnType;
			}

			public Boolean getIsPrimaryKey() {
				return this.isPrimaryKey;
			}

			public void setIsPrimaryKey(Boolean isPrimaryKey) {
				this.isPrimaryKey = isPrimaryKey;
			}

			public Integer getPosition() {
				return this.position;
			}

			public void setPosition(Integer position) {
				this.position = position;
			}

			public String getCaption() {
				return this.caption;
			}

			public void setCaption(String caption) {
				this.caption = caption;
			}

			public Boolean getIsForeignKey() {
				return this.isForeignKey;
			}

			public void setIsForeignKey(Boolean isForeignKey) {
				this.isForeignKey = isForeignKey;
			}
		}
	}

	@Override
	public GetMetaTableFullInfoResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTableFullInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
