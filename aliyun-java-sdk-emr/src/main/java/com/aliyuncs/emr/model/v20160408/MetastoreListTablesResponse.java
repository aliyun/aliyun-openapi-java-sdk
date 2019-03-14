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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.MetastoreListTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreListTablesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Table> tableList;

	private List<String> tableNames;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Table> getTableList() {
		return this.tableList;
	}

	public void setTableList(List<Table> tableList) {
		this.tableList = tableList;
	}

	public List<String> getTableNames() {
		return this.tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;
	}

	public static class Table {

		private String id;

		private String databaseId;

		private String databaseName;

		private String clusterBizId;

		private String clusterName;

		private String tableName;

		private String tableComment;

		private String tableType;

		private String tableParameters;

		private String owner;

		private String ownerType;

		private Boolean isTemporary;

		private String partitionKeys;

		private String serializationLib;

		private String serdeParameters;

		private String inputFormat;

		private String outputFormat;

		private String location;

		private Boolean isCompressed;

		private Long lastAccessTime;

		private Long createTime;

		private Long gmtCreate;

		private Long gmtModified;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDatabaseId() {
			return this.databaseId;
		}

		public void setDatabaseId(String databaseId) {
			this.databaseId = databaseId;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getClusterBizId() {
			return this.clusterBizId;
		}

		public void setClusterBizId(String clusterBizId) {
			this.clusterBizId = clusterBizId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public String getTableComment() {
			return this.tableComment;
		}

		public void setTableComment(String tableComment) {
			this.tableComment = tableComment;
		}

		public String getTableType() {
			return this.tableType;
		}

		public void setTableType(String tableType) {
			this.tableType = tableType;
		}

		public String getTableParameters() {
			return this.tableParameters;
		}

		public void setTableParameters(String tableParameters) {
			this.tableParameters = tableParameters;
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

		public String getPartitionKeys() {
			return this.partitionKeys;
		}

		public void setPartitionKeys(String partitionKeys) {
			this.partitionKeys = partitionKeys;
		}

		public String getSerializationLib() {
			return this.serializationLib;
		}

		public void setSerializationLib(String serializationLib) {
			this.serializationLib = serializationLib;
		}

		public String getSerdeParameters() {
			return this.serdeParameters;
		}

		public void setSerdeParameters(String serdeParameters) {
			this.serdeParameters = serdeParameters;
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

		public Boolean getIsCompressed() {
			return this.isCompressed;
		}

		public void setIsCompressed(Boolean isCompressed) {
			this.isCompressed = isCompressed;
		}

		public Long getLastAccessTime() {
			return this.lastAccessTime;
		}

		public void setLastAccessTime(Long lastAccessTime) {
			this.lastAccessTime = lastAccessTime;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public MetastoreListTablesResponse getInstance(UnmarshallerContext context) {
		return	MetastoreListTablesResponseUnmarshaller.unmarshall(this, context);
	}
}
