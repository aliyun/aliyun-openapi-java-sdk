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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProjectModifyRecordsRequest extends RpcAcsRequest<CreateProjectModifyRecordsResponse> {
	   

	@SerializedName("databases")
	private List<Databases> databases;

	private String id;
	public CreateProjectModifyRecordsRequest() {
		super("OceanBasePro", "2019-09-01", "CreateProjectModifyRecords", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Databases> getDatabases() {
		return this.databases;
	}

	public void setDatabases(List<Databases> databases) {
		this.databases = databases;	
		if (databases != null) {
			putBodyParameter("Databases" , new Gson().toJson(databases));
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public static class Databases {

		@SerializedName("MappedName")
		private String mappedName;

		@SerializedName("SpecificViews")
		private List<SpecificViewsItem> specificViews;

		@SerializedName("Tables")
		private List<TablesItem> tables;

		@SerializedName("Name")
		private String name;

		@SerializedName("Id")
		private String id;

		@SerializedName("SpecificTables")
		private List<SpecificTablesItem> specificTables;

		@SerializedName("Views")
		private List<ViewsItem> views;

		public String getMappedName() {
			return this.mappedName;
		}

		public void setMappedName(String mappedName) {
			this.mappedName = mappedName;
		}

		public List<SpecificViewsItem> getSpecificViews() {
			return this.specificViews;
		}

		public void setSpecificViews(List<SpecificViewsItem> specificViews) {
			this.specificViews = specificViews;
		}

		public List<TablesItem> getTables() {
			return this.tables;
		}

		public void setTables(List<TablesItem> tables) {
			this.tables = tables;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<SpecificTablesItem> getSpecificTables() {
			return this.specificTables;
		}

		public void setSpecificTables(List<SpecificTablesItem> specificTables) {
			this.specificTables = specificTables;
		}

		public List<ViewsItem> getViews() {
			return this.views;
		}

		public void setViews(List<ViewsItem> views) {
			this.views = views;
		}

		public static class SpecificViewsItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("FilterColumns")
			private List<String> filterColumns;

			@SerializedName("AdbTableSchema")
			private AdbTableSchema adbTableSchema;

			@SerializedName("Name")
			private String name;

			@SerializedName("WhereClause")
			private String whereClause;

			@SerializedName("Id")
			private String id;

			@SerializedName("ShardColumns")
			private List<String> shardColumns;

			public String getMappedName() {
				return this.mappedName;
			}

			public void setMappedName(String mappedName) {
				this.mappedName = mappedName;
			}

			public List<String> getFilterColumns() {
				return this.filterColumns;
			}

			public void setFilterColumns(List<String> filterColumns) {
				this.filterColumns = filterColumns;
			}

			public AdbTableSchema getAdbTableSchema() {
				return this.adbTableSchema;
			}

			public void setAdbTableSchema(AdbTableSchema adbTableSchema) {
				this.adbTableSchema = adbTableSchema;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getWhereClause() {
				return this.whereClause;
			}

			public void setWhereClause(String whereClause) {
				this.whereClause = whereClause;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getShardColumns() {
				return this.shardColumns;
			}

			public void setShardColumns(List<String> shardColumns) {
				this.shardColumns = shardColumns;
			}

			public static class AdbTableSchema {

				@SerializedName("PrimaryKeys")
				private List<String> primaryKeys;

				@SerializedName("PartitionStatement")
				private String partitionStatement;

				@SerializedName("PartitionLifeCycle")
				private String partitionLifeCycle;

				@SerializedName("DistributedKeys")
				private List<String> distributedKeys;

				public List<String> getPrimaryKeys() {
					return this.primaryKeys;
				}

				public void setPrimaryKeys(List<String> primaryKeys) {
					this.primaryKeys = primaryKeys;
				}

				public String getPartitionStatement() {
					return this.partitionStatement;
				}

				public void setPartitionStatement(String partitionStatement) {
					this.partitionStatement = partitionStatement;
				}

				public String getPartitionLifeCycle() {
					return this.partitionLifeCycle;
				}

				public void setPartitionLifeCycle(String partitionLifeCycle) {
					this.partitionLifeCycle = partitionLifeCycle;
				}

				public List<String> getDistributedKeys() {
					return this.distributedKeys;
				}

				public void setDistributedKeys(List<String> distributedKeys) {
					this.distributedKeys = distributedKeys;
				}
			}
		}

		public static class TablesItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("FilterColumns")
			private List<String> filterColumns;

			@SerializedName("AdbTableSchema")
			private AdbTableSchema adbTableSchema;

			@SerializedName("Name")
			private String name;

			@SerializedName("WhereClause")
			private String whereClause;

			@SerializedName("Id")
			private String id;

			@SerializedName("ShardColumns")
			private List<String> shardColumns;

			public String getMappedName() {
				return this.mappedName;
			}

			public void setMappedName(String mappedName) {
				this.mappedName = mappedName;
			}

			public List<String> getFilterColumns() {
				return this.filterColumns;
			}

			public void setFilterColumns(List<String> filterColumns) {
				this.filterColumns = filterColumns;
			}

			public AdbTableSchema getAdbTableSchema() {
				return this.adbTableSchema;
			}

			public void setAdbTableSchema(AdbTableSchema adbTableSchema) {
				this.adbTableSchema = adbTableSchema;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getWhereClause() {
				return this.whereClause;
			}

			public void setWhereClause(String whereClause) {
				this.whereClause = whereClause;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getShardColumns() {
				return this.shardColumns;
			}

			public void setShardColumns(List<String> shardColumns) {
				this.shardColumns = shardColumns;
			}

			public static class AdbTableSchema {

				@SerializedName("PrimaryKeys")
				private List<String> primaryKeys;

				@SerializedName("PartitionStatement")
				private String partitionStatement;

				@SerializedName("PartitionLifeCycle")
				private String partitionLifeCycle;

				@SerializedName("DistributedKeys")
				private List<String> distributedKeys;

				public List<String> getPrimaryKeys() {
					return this.primaryKeys;
				}

				public void setPrimaryKeys(List<String> primaryKeys) {
					this.primaryKeys = primaryKeys;
				}

				public String getPartitionStatement() {
					return this.partitionStatement;
				}

				public void setPartitionStatement(String partitionStatement) {
					this.partitionStatement = partitionStatement;
				}

				public String getPartitionLifeCycle() {
					return this.partitionLifeCycle;
				}

				public void setPartitionLifeCycle(String partitionLifeCycle) {
					this.partitionLifeCycle = partitionLifeCycle;
				}

				public List<String> getDistributedKeys() {
					return this.distributedKeys;
				}

				public void setDistributedKeys(List<String> distributedKeys) {
					this.distributedKeys = distributedKeys;
				}
			}
		}

		public static class SpecificTablesItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("FilterColumns")
			private List<String> filterColumns;

			@SerializedName("AdbTableSchema")
			private AdbTableSchema adbTableSchema;

			@SerializedName("Name")
			private String name;

			@SerializedName("WhereClause")
			private String whereClause;

			@SerializedName("Id")
			private String id;

			@SerializedName("ShardColumns")
			private List<String> shardColumns;

			public String getMappedName() {
				return this.mappedName;
			}

			public void setMappedName(String mappedName) {
				this.mappedName = mappedName;
			}

			public List<String> getFilterColumns() {
				return this.filterColumns;
			}

			public void setFilterColumns(List<String> filterColumns) {
				this.filterColumns = filterColumns;
			}

			public AdbTableSchema getAdbTableSchema() {
				return this.adbTableSchema;
			}

			public void setAdbTableSchema(AdbTableSchema adbTableSchema) {
				this.adbTableSchema = adbTableSchema;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getWhereClause() {
				return this.whereClause;
			}

			public void setWhereClause(String whereClause) {
				this.whereClause = whereClause;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getShardColumns() {
				return this.shardColumns;
			}

			public void setShardColumns(List<String> shardColumns) {
				this.shardColumns = shardColumns;
			}

			public static class AdbTableSchema {

				@SerializedName("PrimaryKeys")
				private List<String> primaryKeys;

				@SerializedName("PartitionStatement")
				private String partitionStatement;

				@SerializedName("PartitionLifeCycle")
				private String partitionLifeCycle;

				@SerializedName("DistributedKeys")
				private List<String> distributedKeys;

				public List<String> getPrimaryKeys() {
					return this.primaryKeys;
				}

				public void setPrimaryKeys(List<String> primaryKeys) {
					this.primaryKeys = primaryKeys;
				}

				public String getPartitionStatement() {
					return this.partitionStatement;
				}

				public void setPartitionStatement(String partitionStatement) {
					this.partitionStatement = partitionStatement;
				}

				public String getPartitionLifeCycle() {
					return this.partitionLifeCycle;
				}

				public void setPartitionLifeCycle(String partitionLifeCycle) {
					this.partitionLifeCycle = partitionLifeCycle;
				}

				public List<String> getDistributedKeys() {
					return this.distributedKeys;
				}

				public void setDistributedKeys(List<String> distributedKeys) {
					this.distributedKeys = distributedKeys;
				}
			}
		}

		public static class ViewsItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("FilterColumns")
			private List<String> filterColumns;

			@SerializedName("AdbTableSchema")
			private AdbTableSchema adbTableSchema;

			@SerializedName("Name")
			private String name;

			@SerializedName("WhereClause")
			private String whereClause;

			@SerializedName("Id")
			private String id;

			@SerializedName("ShardColumns")
			private List<String> shardColumns;

			public String getMappedName() {
				return this.mappedName;
			}

			public void setMappedName(String mappedName) {
				this.mappedName = mappedName;
			}

			public List<String> getFilterColumns() {
				return this.filterColumns;
			}

			public void setFilterColumns(List<String> filterColumns) {
				this.filterColumns = filterColumns;
			}

			public AdbTableSchema getAdbTableSchema() {
				return this.adbTableSchema;
			}

			public void setAdbTableSchema(AdbTableSchema adbTableSchema) {
				this.adbTableSchema = adbTableSchema;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getWhereClause() {
				return this.whereClause;
			}

			public void setWhereClause(String whereClause) {
				this.whereClause = whereClause;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<String> getShardColumns() {
				return this.shardColumns;
			}

			public void setShardColumns(List<String> shardColumns) {
				this.shardColumns = shardColumns;
			}

			public static class AdbTableSchema {

				@SerializedName("PrimaryKeys")
				private List<String> primaryKeys;

				@SerializedName("PartitionStatement")
				private String partitionStatement;

				@SerializedName("PartitionLifeCycle")
				private String partitionLifeCycle;

				@SerializedName("DistributedKeys")
				private List<String> distributedKeys;

				public List<String> getPrimaryKeys() {
					return this.primaryKeys;
				}

				public void setPrimaryKeys(List<String> primaryKeys) {
					this.primaryKeys = primaryKeys;
				}

				public String getPartitionStatement() {
					return this.partitionStatement;
				}

				public void setPartitionStatement(String partitionStatement) {
					this.partitionStatement = partitionStatement;
				}

				public String getPartitionLifeCycle() {
					return this.partitionLifeCycle;
				}

				public void setPartitionLifeCycle(String partitionLifeCycle) {
					this.partitionLifeCycle = partitionLifeCycle;
				}

				public List<String> getDistributedKeys() {
					return this.distributedKeys;
				}

				public void setDistributedKeys(List<String> distributedKeys) {
					this.distributedKeys = distributedKeys;
				}
			}
		}
	}

	@Override
	public Class<CreateProjectModifyRecordsResponse> getResponseClass() {
		return CreateProjectModifyRecordsResponse.class;
	}

}
