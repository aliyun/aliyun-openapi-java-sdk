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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class MetastoreCreateTableRequest extends RpcAcsRequest<MetastoreCreateTableResponse> {
	
	public MetastoreCreateTableRequest() {
		super("Emr", "2016-04-08", "MetastoreCreateTable", "emr");
	}

	private Long resourceOwnerId;

	private String fieldDelimiter;

	private List<Column> columns;

	private String createWith;

	private List<Partition> partitions;

	private String dbName;

	private String createSql;

	private String comment;

	private String locationUri;

	private String tableName;

	private String databaseId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getFieldDelimiter() {
		return this.fieldDelimiter;
	}

	public void setFieldDelimiter(String fieldDelimiter) {
		this.fieldDelimiter = fieldDelimiter;
		if(fieldDelimiter != null){
			putQueryParameter("FieldDelimiter", fieldDelimiter);
		}
	}

	public List<Column> getColumns() {
		return this.columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;	
		if (columns != null) {
			for (int depth1 = 0; depth1 < columns.size(); depth1++) {
				putQueryParameter("Column." + (depth1 + 1) + ".Name" , columns.get(depth1).getName());
				putQueryParameter("Column." + (depth1 + 1) + ".Comment" , columns.get(depth1).getComment());
				putQueryParameter("Column." + (depth1 + 1) + ".Type" , columns.get(depth1).getType());
			}
		}	
	}

	public String getCreateWith() {
		return this.createWith;
	}

	public void setCreateWith(String createWith) {
		this.createWith = createWith;
		if(createWith != null){
			putQueryParameter("CreateWith", createWith);
		}
	}

	public List<Partition> getPartitions() {
		return this.partitions;
	}

	public void setPartitions(List<Partition> partitions) {
		this.partitions = partitions;	
		if (partitions != null) {
			for (int depth1 = 0; depth1 < partitions.size(); depth1++) {
				putQueryParameter("Partition." + (depth1 + 1) + ".Name" , partitions.get(depth1).getName());
				putQueryParameter("Partition." + (depth1 + 1) + ".Comment" , partitions.get(depth1).getComment());
				putQueryParameter("Partition." + (depth1 + 1) + ".Type" , partitions.get(depth1).getType());
			}
		}	
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getCreateSql() {
		return this.createSql;
	}

	public void setCreateSql(String createSql) {
		this.createSql = createSql;
		if(createSql != null){
			putQueryParameter("CreateSql", createSql);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public String getLocationUri() {
		return this.locationUri;
	}

	public void setLocationUri(String locationUri) {
		this.locationUri = locationUri;
		if(locationUri != null){
			putQueryParameter("LocationUri", locationUri);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public String getDatabaseId() {
		return this.databaseId;
	}

	public void setDatabaseId(String databaseId) {
		this.databaseId = databaseId;
		if(databaseId != null){
			putQueryParameter("DatabaseId", databaseId);
		}
	}

	public static class Column {

		private String name;

		private String comment;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	public static class Partition {

		private String name;

		private String comment;

		private String type;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<MetastoreCreateTableResponse> getResponseClass() {
		return MetastoreCreateTableResponse.class;
	}

}
