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

/**
 * @author auto create
 * @version 
 */
public class MetastoreListTablesRequest extends RpcAcsRequest<MetastoreListTablesResponse> {
	
	public MetastoreListTablesRequest() {
		super("Emr", "2016-04-08", "MetastoreListTables", "emr");
	}

	private Long resourceOwnerId;

	private String dbName;

	private Integer pageSize;

	private String tableId;

	private String databaseId;

	private String tableName;

	private Integer pageNumber;

	private String fuzzyTableName;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
		if(tableId != null){
			putQueryParameter("TableId", tableId);
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

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFuzzyTableName() {
		return this.fuzzyTableName;
	}

	public void setFuzzyTableName(String fuzzyTableName) {
		this.fuzzyTableName = fuzzyTableName;
		if(fuzzyTableName != null){
			putQueryParameter("FuzzyTableName", fuzzyTableName);
		}
	}

	@Override
	public Class<MetastoreListTablesResponse> getResponseClass() {
		return MetastoreListTablesResponse.class;
	}

}
