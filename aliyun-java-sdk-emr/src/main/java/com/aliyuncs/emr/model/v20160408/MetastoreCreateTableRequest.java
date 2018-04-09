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
		super("Emr", "2016-04-08", "MetastoreCreateTable");
	}

	private Long resourceOwnerId;

	private String fieldDelimiter;

	private String dbName;

	private List<Column> columns;

	private String locationUri;

	private String tableName;

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

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
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
				putQueryParameter("Column." + (depth1 + 1) + ".Type" , columns.get(depth1).getType());
				putQueryParameter("Column." + (depth1 + 1) + ".Comment" , columns.get(depth1).getComment());
			}
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

	@Override
	public Class<MetastoreCreateTableResponse> getResponseClass() {
		return MetastoreCreateTableResponse.class;
	}

}
