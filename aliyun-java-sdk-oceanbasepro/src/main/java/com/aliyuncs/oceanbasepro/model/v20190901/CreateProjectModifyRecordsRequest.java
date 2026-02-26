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

	@SerializedName("transferMapping")
	private TransferMapping transferMapping;

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

	public TransferMapping getTransferMapping() {
		return this.transferMapping;
	}

	public void setTransferMapping(TransferMapping transferMapping) {
		this.transferMapping = transferMapping;	
		if (transferMapping != null) {
			putBodyParameter("TransferMapping" , new Gson().toJson(transferMapping));
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

			@SerializedName("ObkvPartitionConfig")
			private ObkvPartitionConfig obkvPartitionConfig;

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

			public ObkvPartitionConfig getObkvPartitionConfig() {
				return this.obkvPartitionConfig;
			}

			public void setObkvPartitionConfig(ObkvPartitionConfig obkvPartitionConfig) {
				this.obkvPartitionConfig = obkvPartitionConfig;
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

			public static class ObkvPartitionConfig {

				@SerializedName("VirtualColumn")
				private String virtualColumn;

				@SerializedName("PartitionType")
				private String partitionType;

				@SerializedName("PartitionSize")
				private Integer partitionSize;

				public String getVirtualColumn() {
					return this.virtualColumn;
				}

				public void setVirtualColumn(String virtualColumn) {
					this.virtualColumn = virtualColumn;
				}

				public String getPartitionType() {
					return this.partitionType;
				}

				public void setPartitionType(String partitionType) {
					this.partitionType = partitionType;
				}

				public Integer getPartitionSize() {
					return this.partitionSize;
				}

				public void setPartitionSize(Integer partitionSize) {
					this.partitionSize = partitionSize;
				}
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

	public static class TransferMapping {

		@SerializedName("Mode")
		private String mode;

		@SerializedName("Databases")
		private List<DatabasesItem> databases;

		@SerializedName("TableAndViewBlackList")
		private List<String> tableAndViewBlackList;

		@SerializedName("BlackTableRules")
		private List<BlackTableRulesItem> blackTableRules;

		@SerializedName("Schemas")
		private List<SchemasItem> schemas;

		@SerializedName("BlackViewRules")
		private List<BlackViewRulesItem> blackViewRules;

		@SerializedName("DatabasesBlack")
		private List<DatabasesBlackItem> databasesBlack;

		@SerializedName("WhiteTableRules")
		private List<WhiteTableRulesItem> whiteTableRules;

		@SerializedName("WhiteViewRules")
		private List<WhiteViewRulesItem> whiteViewRules;

		@SerializedName("TableAndViewWhiteList")
		private List<String> tableAndViewWhiteList;

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public List<DatabasesItem> getDatabases() {
			return this.databases;
		}

		public void setDatabases(List<DatabasesItem> databases) {
			this.databases = databases;
		}

		public List<String> getTableAndViewBlackList() {
			return this.tableAndViewBlackList;
		}

		public void setTableAndViewBlackList(List<String> tableAndViewBlackList) {
			this.tableAndViewBlackList = tableAndViewBlackList;
		}

		public List<BlackTableRulesItem> getBlackTableRules() {
			return this.blackTableRules;
		}

		public void setBlackTableRules(List<BlackTableRulesItem> blackTableRules) {
			this.blackTableRules = blackTableRules;
		}

		public List<SchemasItem> getSchemas() {
			return this.schemas;
		}

		public void setSchemas(List<SchemasItem> schemas) {
			this.schemas = schemas;
		}

		public List<BlackViewRulesItem> getBlackViewRules() {
			return this.blackViewRules;
		}

		public void setBlackViewRules(List<BlackViewRulesItem> blackViewRules) {
			this.blackViewRules = blackViewRules;
		}

		public List<DatabasesBlackItem> getDatabasesBlack() {
			return this.databasesBlack;
		}

		public void setDatabasesBlack(List<DatabasesBlackItem> databasesBlack) {
			this.databasesBlack = databasesBlack;
		}

		public List<WhiteTableRulesItem> getWhiteTableRules() {
			return this.whiteTableRules;
		}

		public void setWhiteTableRules(List<WhiteTableRulesItem> whiteTableRules) {
			this.whiteTableRules = whiteTableRules;
		}

		public List<WhiteViewRulesItem> getWhiteViewRules() {
			return this.whiteViewRules;
		}

		public void setWhiteViewRules(List<WhiteViewRulesItem> whiteViewRules) {
			this.whiteViewRules = whiteViewRules;
		}

		public List<String> getTableAndViewWhiteList() {
			return this.tableAndViewWhiteList;
		}

		public void setTableAndViewWhiteList(List<String> tableAndViewWhiteList) {
			this.tableAndViewWhiteList = tableAndViewWhiteList;
		}

		public static class DatabasesItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("SpecificViews")
			private List<SpecificViewsItem> specificViews;

			@SerializedName("Tables")
			private List<TablesItem> tables;

			@SerializedName("ClusterName")
			private String clusterName;

			@SerializedName("Name")
			private String name;

			@SerializedName("TenantName")
			private String tenantName;

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

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
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

				@SerializedName("ObkvPartitionConfig")
				private ObkvPartitionConfig obkvPartitionConfig;

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

				public ObkvPartitionConfig getObkvPartitionConfig() {
					return this.obkvPartitionConfig;
				}

				public void setObkvPartitionConfig(ObkvPartitionConfig obkvPartitionConfig) {
					this.obkvPartitionConfig = obkvPartitionConfig;
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

				public static class ObkvPartitionConfig {

					@SerializedName("VirtualColumn")
					private String virtualColumn;

					@SerializedName("PartitionType")
					private String partitionType;

					@SerializedName("PartitionSize")
					private Integer partitionSize;

					public String getVirtualColumn() {
						return this.virtualColumn;
					}

					public void setVirtualColumn(String virtualColumn) {
						this.virtualColumn = virtualColumn;
					}

					public String getPartitionType() {
						return this.partitionType;
					}

					public void setPartitionType(String partitionType) {
						this.partitionType = partitionType;
					}

					public Integer getPartitionSize() {
						return this.partitionSize;
					}

					public void setPartitionSize(Integer partitionSize) {
						this.partitionSize = partitionSize;
					}
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

		public static class BlackTableRulesItem {

			@SerializedName("ObjectMapping")
			private ObjectMapping objectMapping;

			@SerializedName("SchemaMapping")
			private SchemaMapping schemaMapping;

			public ObjectMapping getObjectMapping() {
				return this.objectMapping;
			}

			public void setObjectMapping(ObjectMapping objectMapping) {
				this.objectMapping = objectMapping;
			}

			public SchemaMapping getSchemaMapping() {
				return this.schemaMapping;
			}

			public void setSchemaMapping(SchemaMapping schemaMapping) {
				this.schemaMapping = schemaMapping;
			}

			public static class ObjectMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class SchemaMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class SchemasItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("SpecificViews")
			private List<SpecificViewsItem> specificViews;

			@SerializedName("Tables")
			private List<TablesItem> tables;

			@SerializedName("ClusterName")
			private String clusterName;

			@SerializedName("Name")
			private String name;

			@SerializedName("TenantName")
			private String tenantName;

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

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
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

				@SerializedName("ObkvPartitionConfig")
				private ObkvPartitionConfig obkvPartitionConfig;

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

				public ObkvPartitionConfig getObkvPartitionConfig() {
					return this.obkvPartitionConfig;
				}

				public void setObkvPartitionConfig(ObkvPartitionConfig obkvPartitionConfig) {
					this.obkvPartitionConfig = obkvPartitionConfig;
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

				public static class ObkvPartitionConfig {

					@SerializedName("VirtualColumn")
					private String virtualColumn;

					@SerializedName("PartitionType")
					private String partitionType;

					@SerializedName("PartitionSize")
					private Integer partitionSize;

					public String getVirtualColumn() {
						return this.virtualColumn;
					}

					public void setVirtualColumn(String virtualColumn) {
						this.virtualColumn = virtualColumn;
					}

					public String getPartitionType() {
						return this.partitionType;
					}

					public void setPartitionType(String partitionType) {
						this.partitionType = partitionType;
					}

					public Integer getPartitionSize() {
						return this.partitionSize;
					}

					public void setPartitionSize(Integer partitionSize) {
						this.partitionSize = partitionSize;
					}
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

		public static class BlackViewRulesItem {

			@SerializedName("ObjectMapping")
			private ObjectMapping objectMapping;

			@SerializedName("SchemaMapping")
			private SchemaMapping schemaMapping;

			public ObjectMapping getObjectMapping() {
				return this.objectMapping;
			}

			public void setObjectMapping(ObjectMapping objectMapping) {
				this.objectMapping = objectMapping;
			}

			public SchemaMapping getSchemaMapping() {
				return this.schemaMapping;
			}

			public void setSchemaMapping(SchemaMapping schemaMapping) {
				this.schemaMapping = schemaMapping;
			}

			public static class ObjectMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class SchemaMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class DatabasesBlackItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("SpecificViews")
			private List<SpecificViewsItem> specificViews;

			@SerializedName("Tables")
			private List<TablesItem> tables;

			@SerializedName("ClusterName")
			private String clusterName;

			@SerializedName("Name")
			private String name;

			@SerializedName("TenantName")
			private String tenantName;

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

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
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

		public static class WhiteTableRulesItem {

			@SerializedName("ObjectMapping")
			private ObjectMapping objectMapping;

			@SerializedName("SchemaMapping")
			private SchemaMapping schemaMapping;

			public ObjectMapping getObjectMapping() {
				return this.objectMapping;
			}

			public void setObjectMapping(ObjectMapping objectMapping) {
				this.objectMapping = objectMapping;
			}

			public SchemaMapping getSchemaMapping() {
				return this.schemaMapping;
			}

			public void setSchemaMapping(SchemaMapping schemaMapping) {
				this.schemaMapping = schemaMapping;
			}

			public static class ObjectMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class SchemaMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}

		public static class WhiteViewRulesItem {

			@SerializedName("ObjectMapping")
			private ObjectMapping objectMapping;

			@SerializedName("SchemaMapping")
			private SchemaMapping schemaMapping;

			public ObjectMapping getObjectMapping() {
				return this.objectMapping;
			}

			public void setObjectMapping(ObjectMapping objectMapping) {
				this.objectMapping = objectMapping;
			}

			public SchemaMapping getSchemaMapping() {
				return this.schemaMapping;
			}

			public void setSchemaMapping(SchemaMapping schemaMapping) {
				this.schemaMapping = schemaMapping;
			}

			public static class ObjectMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class SchemaMapping {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("Name")
				private String name;

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}
		}
	}

	@Override
	public Class<CreateProjectModifyRecordsResponse> getResponseClass() {
		return CreateProjectModifyRecordsResponse.class;
	}

}
