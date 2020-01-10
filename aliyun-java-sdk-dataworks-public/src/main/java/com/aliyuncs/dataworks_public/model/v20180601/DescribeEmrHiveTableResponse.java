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

package com.aliyuncs.dataworks_public.model.v20180601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.DescribeEmrHiveTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEmrHiveTableResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Data data;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String clusterBizId;

		private String tableName;

		private String tableType;

		private String owner;

		private String ownerType;

		private Boolean isTemporary;

		private String serializationLib;

		private String inputFormat;

		private String outputFormat;

		private String location;

		private String lastAccessTime;

		private String gmtCreate;

		private String gmtModified;

		private String tableComment;

		private String tableParameters;

		private String partitionKeys;

		private Boolean isCompressed;

		private String clusterBizName;

		private String databaseName;

		private String ownerId;

		private String tableDesc;

		private String lastModifyTime;

		private List<TableColumn> columns;

		public String getClusterBizId() {
			return this.clusterBizId;
		}

		public void setClusterBizId(String clusterBizId) {
			this.clusterBizId = clusterBizId;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableType() {
			return this.tableType;
		}

		public void setTableType(String tableType) {
			this.tableType = tableType;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getOwnerType() {
			return this.ownerType;
		}

		public void setOwnerType(String ownerType) {
			this.ownerType = ownerType;
		}

		public Boolean getIsTemporary() {
			return this.isTemporary;
		}

		public void setIsTemporary(Boolean isTemporary) {
			this.isTemporary = isTemporary;
		}

		public String getSerializationLib() {
			return this.serializationLib;
		}

		public void setSerializationLib(String serializationLib) {
			this.serializationLib = serializationLib;
		}

		public String getInputFormat() {
			return this.inputFormat;
		}

		public void setInputFormat(String inputFormat) {
			this.inputFormat = inputFormat;
		}

		public String getOutputFormat() {
			return this.outputFormat;
		}

		public void setOutputFormat(String outputFormat) {
			this.outputFormat = outputFormat;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLastAccessTime() {
			return this.lastAccessTime;
		}

		public void setLastAccessTime(String lastAccessTime) {
			this.lastAccessTime = lastAccessTime;
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

		public String getTableComment() {
			return this.tableComment;
		}

		public void setTableComment(String tableComment) {
			this.tableComment = tableComment;
		}

		public String getTableParameters() {
			return this.tableParameters;
		}

		public void setTableParameters(String tableParameters) {
			this.tableParameters = tableParameters;
		}

		public String getPartitionKeys() {
			return this.partitionKeys;
		}

		public void setPartitionKeys(String partitionKeys) {
			this.partitionKeys = partitionKeys;
		}

		public Boolean getIsCompressed() {
			return this.isCompressed;
		}

		public void setIsCompressed(Boolean isCompressed) {
			this.isCompressed = isCompressed;
		}

		public String getClusterBizName() {
			return this.clusterBizName;
		}

		public void setClusterBizName(String clusterBizName) {
			this.clusterBizName = clusterBizName;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getTableDesc() {
			return this.tableDesc;
		}

		public void setTableDesc(String tableDesc) {
			this.tableDesc = tableDesc;
		}

		public String getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(String lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public List<TableColumn> getColumns() {
			return this.columns;
		}

		public void setColumns(List<TableColumn> columns) {
			this.columns = columns;
		}

		public static class TableColumn {

			private Integer columnPosition;

			private String columnName;

			private String columnType;

			private String columnComment;

			private String gmtCreate;

			private String gmtModified;

			private String comment;

			public Integer getColumnPosition() {
				return this.columnPosition;
			}

			public void setColumnPosition(Integer columnPosition) {
				this.columnPosition = columnPosition;
			}

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public String getColumnType() {
				return this.columnType;
			}

			public void setColumnType(String columnType) {
				this.columnType = columnType;
			}

			public String getColumnComment() {
				return this.columnComment;
			}

			public void setColumnComment(String columnComment) {
				this.columnComment = columnComment;
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

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}
		}
	}

	@Override
	public DescribeEmrHiveTableResponse getInstance(UnmarshallerContext context) {
		return	DescribeEmrHiveTableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
