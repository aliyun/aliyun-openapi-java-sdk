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
import com.aliyuncs.emr.transform.v20160408.MetastoreDescribeTableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreDescribeTableResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String databaseId;

	private String clusterBizId;

	private String clusterName;

	private Integer createTime;

	private Integer lastAccessTime;

	private String locationUri;

	private String inputFormat;

	private String outputFormat;

	private Boolean compressed;

	private String serializationLib;

	private String tableName;

	private String dbName;

	private String owner;

	private String tableComment;

	private String tableType;

	private String creator;

	private String fieldDelimiter;

	private List<Column> columns;

	private List<PartitionColumn> partitionColumns;

	private List<SerdeParameter> serdeParameters;

	private List<StorageDescParameter> storageDescParameters;

	private List<TableParameter> tableParameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getLastAccessTime() {
		return this.lastAccessTime;
	}

	public void setLastAccessTime(Integer lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	public String getLocationUri() {
		return this.locationUri;
	}

	public void setLocationUri(String locationUri) {
		this.locationUri = locationUri;
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

	public Boolean getCompressed() {
		return this.compressed;
	}

	public void setCompressed(Boolean compressed) {
		this.compressed = compressed;
	}

	public String getSerializationLib() {
		return this.serializationLib;
	}

	public void setSerializationLib(String serializationLib) {
		this.serializationLib = serializationLib;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
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

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getFieldDelimiter() {
		return this.fieldDelimiter;
	}

	public void setFieldDelimiter(String fieldDelimiter) {
		this.fieldDelimiter = fieldDelimiter;
	}

	public List<Column> getColumns() {
		return this.columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public List<PartitionColumn> getPartitionColumns() {
		return this.partitionColumns;
	}

	public void setPartitionColumns(List<PartitionColumn> partitionColumns) {
		this.partitionColumns = partitionColumns;
	}

	public List<SerdeParameter> getSerdeParameters() {
		return this.serdeParameters;
	}

	public void setSerdeParameters(List<SerdeParameter> serdeParameters) {
		this.serdeParameters = serdeParameters;
	}

	public List<StorageDescParameter> getStorageDescParameters() {
		return this.storageDescParameters;
	}

	public void setStorageDescParameters(List<StorageDescParameter> storageDescParameters) {
		this.storageDescParameters = storageDescParameters;
	}

	public List<TableParameter> getTableParameters() {
		return this.tableParameters;
	}

	public void setTableParameters(List<TableParameter> tableParameters) {
		this.tableParameters = tableParameters;
	}

	public static class Column {

		private String name;

		private String type;

		private String comment;

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

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	}

	public static class PartitionColumn {

		private String name;

		private String type;

		private String comment;

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

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	}

	public static class SerdeParameter {

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

	public static class StorageDescParameter {

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

	public static class TableParameter {

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

	@Override
	public MetastoreDescribeTableResponse getInstance(UnmarshallerContext context) {
		return	MetastoreDescribeTableResponseUnmarshaller.unmarshall(this, context);
	}
}
