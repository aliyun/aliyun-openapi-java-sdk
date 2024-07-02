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
public class CreateProjectRequest extends RpcAcsRequest<CreateProjectResponse> {
	   

	private String sinkEndpointId;

	private Boolean useOss;

	private String ossKey;

	private String sourceEndpointId;

	private String type;

	@SerializedName("fullTransferConfig")
	private FullTransferConfig fullTransferConfig;

	private Boolean enableStructTransfer;

	@SerializedName("transferMapping")
	private TransferMapping transferMapping;

	private String workerGradeId;

	private String id;

	@SerializedName("commonTransferConfig")
	private CommonTransferConfig commonTransferConfig;

	@SerializedName("structTransferConfig")
	private StructTransferConfig structTransferConfig;

	@SerializedName("reverseIncrTransferConfig")
	private ReverseIncrTransferConfig reverseIncrTransferConfig;

	private Boolean enableIncrTransfer;

	private Boolean enableFullTransfer;

	private Boolean enableFullVerify;

	private String name;

	@SerializedName("labelIds")
	private List<String> labelIds;

	@SerializedName("incrTransferConfig")
	private IncrTransferConfig incrTransferConfig;

	private Boolean enableReverseIncrTransfer;
	public CreateProjectRequest() {
		super("OceanBasePro", "2019-09-01", "CreateProject", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSinkEndpointId() {
		return this.sinkEndpointId;
	}

	public void setSinkEndpointId(String sinkEndpointId) {
		this.sinkEndpointId = sinkEndpointId;
		if(sinkEndpointId != null){
			putBodyParameter("SinkEndpointId", sinkEndpointId);
		}
	}

	public Boolean getUseOss() {
		return this.useOss;
	}

	public void setUseOss(Boolean useOss) {
		this.useOss = useOss;
		if(useOss != null){
			putBodyParameter("UseOss", useOss.toString());
		}
	}

	public String getOssKey() {
		return this.ossKey;
	}

	public void setOssKey(String ossKey) {
		this.ossKey = ossKey;
		if(ossKey != null){
			putBodyParameter("OssKey", ossKey);
		}
	}

	public String getSourceEndpointId() {
		return this.sourceEndpointId;
	}

	public void setSourceEndpointId(String sourceEndpointId) {
		this.sourceEndpointId = sourceEndpointId;
		if(sourceEndpointId != null){
			putBodyParameter("SourceEndpointId", sourceEndpointId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public FullTransferConfig getFullTransferConfig() {
		return this.fullTransferConfig;
	}

	public void setFullTransferConfig(FullTransferConfig fullTransferConfig) {
		this.fullTransferConfig = fullTransferConfig;	
		if (fullTransferConfig != null) {
			putBodyParameter("FullTransferConfig" , new Gson().toJson(fullTransferConfig));
		}	
	}

	public Boolean getEnableStructTransfer() {
		return this.enableStructTransfer;
	}

	public void setEnableStructTransfer(Boolean enableStructTransfer) {
		this.enableStructTransfer = enableStructTransfer;
		if(enableStructTransfer != null){
			putBodyParameter("EnableStructTransfer", enableStructTransfer.toString());
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

	public String getWorkerGradeId() {
		return this.workerGradeId;
	}

	public void setWorkerGradeId(String workerGradeId) {
		this.workerGradeId = workerGradeId;
		if(workerGradeId != null){
			putBodyParameter("WorkerGradeId", workerGradeId);
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

	public CommonTransferConfig getCommonTransferConfig() {
		return this.commonTransferConfig;
	}

	public void setCommonTransferConfig(CommonTransferConfig commonTransferConfig) {
		this.commonTransferConfig = commonTransferConfig;	
		if (commonTransferConfig != null) {
			putBodyParameter("CommonTransferConfig" , new Gson().toJson(commonTransferConfig));
		}	
	}

	public StructTransferConfig getStructTransferConfig() {
		return this.structTransferConfig;
	}

	public void setStructTransferConfig(StructTransferConfig structTransferConfig) {
		this.structTransferConfig = structTransferConfig;	
		if (structTransferConfig != null) {
			putBodyParameter("StructTransferConfig" , new Gson().toJson(structTransferConfig));
		}	
	}

	public ReverseIncrTransferConfig getReverseIncrTransferConfig() {
		return this.reverseIncrTransferConfig;
	}

	public void setReverseIncrTransferConfig(ReverseIncrTransferConfig reverseIncrTransferConfig) {
		this.reverseIncrTransferConfig = reverseIncrTransferConfig;	
		if (reverseIncrTransferConfig != null) {
			putBodyParameter("ReverseIncrTransferConfig" , new Gson().toJson(reverseIncrTransferConfig));
		}	
	}

	public Boolean getEnableIncrTransfer() {
		return this.enableIncrTransfer;
	}

	public void setEnableIncrTransfer(Boolean enableIncrTransfer) {
		this.enableIncrTransfer = enableIncrTransfer;
		if(enableIncrTransfer != null){
			putBodyParameter("EnableIncrTransfer", enableIncrTransfer.toString());
		}
	}

	public Boolean getEnableFullTransfer() {
		return this.enableFullTransfer;
	}

	public void setEnableFullTransfer(Boolean enableFullTransfer) {
		this.enableFullTransfer = enableFullTransfer;
		if(enableFullTransfer != null){
			putBodyParameter("EnableFullTransfer", enableFullTransfer.toString());
		}
	}

	public Boolean getEnableFullVerify() {
		return this.enableFullVerify;
	}

	public void setEnableFullVerify(Boolean enableFullVerify) {
		this.enableFullVerify = enableFullVerify;
		if(enableFullVerify != null){
			putBodyParameter("EnableFullVerify", enableFullVerify.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<String> getLabelIds() {
		return this.labelIds;
	}

	public void setLabelIds(List<String> labelIds) {
		this.labelIds = labelIds;	
		if (labelIds != null) {
			putBodyParameter("LabelIds" , new Gson().toJson(labelIds));
		}	
	}

	public IncrTransferConfig getIncrTransferConfig() {
		return this.incrTransferConfig;
	}

	public void setIncrTransferConfig(IncrTransferConfig incrTransferConfig) {
		this.incrTransferConfig = incrTransferConfig;	
		if (incrTransferConfig != null) {
			putBodyParameter("IncrTransferConfig" , new Gson().toJson(incrTransferConfig));
		}	
	}

	public Boolean getEnableReverseIncrTransfer() {
		return this.enableReverseIncrTransfer;
	}

	public void setEnableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
		this.enableReverseIncrTransfer = enableReverseIncrTransfer;
		if(enableReverseIncrTransfer != null){
			putBodyParameter("EnableReverseIncrTransfer", enableReverseIncrTransfer.toString());
		}
	}

	public static class FullTransferConfig {

		@SerializedName("NonePkUkTruncateDstTable")
		private Boolean nonePkUkTruncateDstTable;

		@SerializedName("ThrottleRps")
		private Integer throttleRps;

		@SerializedName("FullVerifySpeedMode")
		private String fullVerifySpeedMode;

		@SerializedName("WriteWorkerNum")
		private Integer writeWorkerNum;

		@SerializedName("ReadWorkerNum")
		private Integer readWorkerNum;

		@SerializedName("FullTransferSpeedMode")
		private String fullTransferSpeedMode;

		@SerializedName("AllowDestTableNotEmpty")
		private Boolean allowDestTableNotEmpty;

		@SerializedName("ThrottleIOPS")
		private Integer throttleIOPS;

		public Boolean getNonePkUkTruncateDstTable() {
			return this.nonePkUkTruncateDstTable;
		}

		public void setNonePkUkTruncateDstTable(Boolean nonePkUkTruncateDstTable) {
			this.nonePkUkTruncateDstTable = nonePkUkTruncateDstTable;
		}

		public Integer getThrottleRps() {
			return this.throttleRps;
		}

		public void setThrottleRps(Integer throttleRps) {
			this.throttleRps = throttleRps;
		}

		public String getFullVerifySpeedMode() {
			return this.fullVerifySpeedMode;
		}

		public void setFullVerifySpeedMode(String fullVerifySpeedMode) {
			this.fullVerifySpeedMode = fullVerifySpeedMode;
		}

		public Integer getWriteWorkerNum() {
			return this.writeWorkerNum;
		}

		public void setWriteWorkerNum(Integer writeWorkerNum) {
			this.writeWorkerNum = writeWorkerNum;
		}

		public Integer getReadWorkerNum() {
			return this.readWorkerNum;
		}

		public void setReadWorkerNum(Integer readWorkerNum) {
			this.readWorkerNum = readWorkerNum;
		}

		public String getFullTransferSpeedMode() {
			return this.fullTransferSpeedMode;
		}

		public void setFullTransferSpeedMode(String fullTransferSpeedMode) {
			this.fullTransferSpeedMode = fullTransferSpeedMode;
		}

		public Boolean getAllowDestTableNotEmpty() {
			return this.allowDestTableNotEmpty;
		}

		public void setAllowDestTableNotEmpty(Boolean allowDestTableNotEmpty) {
			this.allowDestTableNotEmpty = allowDestTableNotEmpty;
		}

		public Integer getThrottleIOPS() {
			return this.throttleIOPS;
		}

		public void setThrottleIOPS(Integer throttleIOPS) {
			this.throttleIOPS = throttleIOPS;
		}
	}

	public static class TransferMapping {

		@SerializedName("Mode")
		private String mode;

		@SerializedName("Databases")
		private List<DatabasesItem> databases;

		@SerializedName("TableAndViewBlackList")
		private List<String> tableAndViewBlackList;

		@SerializedName("DatabasesBlack")
		private List<DatabasesBlackItem> databasesBlack;

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

		public List<DatabasesBlackItem> getDatabasesBlack() {
			return this.databasesBlack;
		}

		public void setDatabasesBlack(List<DatabasesBlackItem> databasesBlack) {
			this.databasesBlack = databasesBlack;
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
	}

	public static class CommonTransferConfig {

		@SerializedName("MqPartition")
		private Integer mqPartition;

		@SerializedName("SyncSchemaColumnName")
		private String syncSchemaColumnName;

		@SerializedName("ActiveActive")
		private Boolean activeActive;

		@SerializedName("SinkStoreFormat")
		private String sinkStoreFormat;

		@SerializedName("RocketMqEnableMsgTrace")
		private Boolean rocketMqEnableMsgTrace;

		@SerializedName("CustomColumns")
		private List<CustomColumnsItem> customColumns;

		@SerializedName("RocketMqProducerGroup")
		private String rocketMqProducerGroup;

		@SerializedName("MqPartitionMode")
		private String mqPartitionMode;

		@SerializedName("RocketMqSendMsgTimeout")
		private Long rocketMqSendMsgTimeout;

		@SerializedName("TableCategory")
		private String tableCategory;

		@SerializedName("DatahubTopicType")
		private String datahubTopicType;

		@SerializedName("RocketMqMsgTags")
		private String rocketMqMsgTags;

		@SerializedName("DataWorksBusinessName")
		private String dataWorksBusinessName;

		@SerializedName("SourceStoreFormat")
		private String sourceStoreFormat;

		@SerializedName("SyncSchema")
		private Boolean syncSchema;

		@SerializedName("MqSerializerType")
		private String mqSerializerType;

		public Integer getMqPartition() {
			return this.mqPartition;
		}

		public void setMqPartition(Integer mqPartition) {
			this.mqPartition = mqPartition;
		}

		public String getSyncSchemaColumnName() {
			return this.syncSchemaColumnName;
		}

		public void setSyncSchemaColumnName(String syncSchemaColumnName) {
			this.syncSchemaColumnName = syncSchemaColumnName;
		}

		public Boolean getActiveActive() {
			return this.activeActive;
		}

		public void setActiveActive(Boolean activeActive) {
			this.activeActive = activeActive;
		}

		public String getSinkStoreFormat() {
			return this.sinkStoreFormat;
		}

		public void setSinkStoreFormat(String sinkStoreFormat) {
			this.sinkStoreFormat = sinkStoreFormat;
		}

		public Boolean getRocketMqEnableMsgTrace() {
			return this.rocketMqEnableMsgTrace;
		}

		public void setRocketMqEnableMsgTrace(Boolean rocketMqEnableMsgTrace) {
			this.rocketMqEnableMsgTrace = rocketMqEnableMsgTrace;
		}

		public List<CustomColumnsItem> getCustomColumns() {
			return this.customColumns;
		}

		public void setCustomColumns(List<CustomColumnsItem> customColumns) {
			this.customColumns = customColumns;
		}

		public String getRocketMqProducerGroup() {
			return this.rocketMqProducerGroup;
		}

		public void setRocketMqProducerGroup(String rocketMqProducerGroup) {
			this.rocketMqProducerGroup = rocketMqProducerGroup;
		}

		public String getMqPartitionMode() {
			return this.mqPartitionMode;
		}

		public void setMqPartitionMode(String mqPartitionMode) {
			this.mqPartitionMode = mqPartitionMode;
		}

		public Long getRocketMqSendMsgTimeout() {
			return this.rocketMqSendMsgTimeout;
		}

		public void setRocketMqSendMsgTimeout(Long rocketMqSendMsgTimeout) {
			this.rocketMqSendMsgTimeout = rocketMqSendMsgTimeout;
		}

		public String getTableCategory() {
			return this.tableCategory;
		}

		public void setTableCategory(String tableCategory) {
			this.tableCategory = tableCategory;
		}

		public String getDatahubTopicType() {
			return this.datahubTopicType;
		}

		public void setDatahubTopicType(String datahubTopicType) {
			this.datahubTopicType = datahubTopicType;
		}

		public String getRocketMqMsgTags() {
			return this.rocketMqMsgTags;
		}

		public void setRocketMqMsgTags(String rocketMqMsgTags) {
			this.rocketMqMsgTags = rocketMqMsgTags;
		}

		public String getDataWorksBusinessName() {
			return this.dataWorksBusinessName;
		}

		public void setDataWorksBusinessName(String dataWorksBusinessName) {
			this.dataWorksBusinessName = dataWorksBusinessName;
		}

		public String getSourceStoreFormat() {
			return this.sourceStoreFormat;
		}

		public void setSourceStoreFormat(String sourceStoreFormat) {
			this.sourceStoreFormat = sourceStoreFormat;
		}

		public Boolean getSyncSchema() {
			return this.syncSchema;
		}

		public void setSyncSchema(Boolean syncSchema) {
			this.syncSchema = syncSchema;
		}

		public String getMqSerializerType() {
			return this.mqSerializerType;
		}

		public void setMqSerializerType(String mqSerializerType) {
			this.mqSerializerType = mqSerializerType;
		}

		public static class CustomColumnsItem {

			@SerializedName("Expression")
			private String expression;

			@SerializedName("ColumnName")
			private String columnName;

			public String getExpression() {
				return this.expression;
			}

			public void setExpression(String expression) {
				this.expression = expression;
			}

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}
		}
	}

	public static class StructTransferConfig {

		@SerializedName("ByteCharConvertStrategy")
		private String byteCharConvertStrategy;

		@SerializedName("DeferIndexCreation")
		private Boolean deferIndexCreation;

		public String getByteCharConvertStrategy() {
			return this.byteCharConvertStrategy;
		}

		public void setByteCharConvertStrategy(String byteCharConvertStrategy) {
			this.byteCharConvertStrategy = byteCharConvertStrategy;
		}

		public Boolean getDeferIndexCreation() {
			return this.deferIndexCreation;
		}

		public void setDeferIndexCreation(Boolean deferIndexCreation) {
			this.deferIndexCreation = deferIndexCreation;
		}
	}

	public static class ReverseIncrTransferConfig {

		@SerializedName("ThrottleRps")
		private Integer throttleRps;

		@SerializedName("EnableSequencingWithinTxn")
		private Boolean enableSequencingWithinTxn;

		@SerializedName("SupportDDLTypes")
		private List<String> supportDDLTypes;

		@SerializedName("StoreLogKeptHour")
		private Integer storeLogKeptHour;

		@SerializedName("StartTimestamp")
		private String startTimestamp;

		@SerializedName("RecordTypeWhiteList")
		private List<String> recordTypeWhiteList;

		@SerializedName("IncrSyncConcurrency")
		private Integer incrSyncConcurrency;

		@SerializedName("EnableIncrSyncStatistics")
		private Boolean enableIncrSyncStatistics;

		@SerializedName("ThrottleIOPS")
		private Integer throttleIOPS;

		public Integer getThrottleRps() {
			return this.throttleRps;
		}

		public void setThrottleRps(Integer throttleRps) {
			this.throttleRps = throttleRps;
		}

		public Boolean getEnableSequencingWithinTxn() {
			return this.enableSequencingWithinTxn;
		}

		public void setEnableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
			this.enableSequencingWithinTxn = enableSequencingWithinTxn;
		}

		public List<String> getSupportDDLTypes() {
			return this.supportDDLTypes;
		}

		public void setSupportDDLTypes(List<String> supportDDLTypes) {
			this.supportDDLTypes = supportDDLTypes;
		}

		public Integer getStoreLogKeptHour() {
			return this.storeLogKeptHour;
		}

		public void setStoreLogKeptHour(Integer storeLogKeptHour) {
			this.storeLogKeptHour = storeLogKeptHour;
		}

		public String getStartTimestamp() {
			return this.startTimestamp;
		}

		public void setStartTimestamp(String startTimestamp) {
			this.startTimestamp = startTimestamp;
		}

		public List<String> getRecordTypeWhiteList() {
			return this.recordTypeWhiteList;
		}

		public void setRecordTypeWhiteList(List<String> recordTypeWhiteList) {
			this.recordTypeWhiteList = recordTypeWhiteList;
		}

		public Integer getIncrSyncConcurrency() {
			return this.incrSyncConcurrency;
		}

		public void setIncrSyncConcurrency(Integer incrSyncConcurrency) {
			this.incrSyncConcurrency = incrSyncConcurrency;
		}

		public Boolean getEnableIncrSyncStatistics() {
			return this.enableIncrSyncStatistics;
		}

		public void setEnableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
			this.enableIncrSyncStatistics = enableIncrSyncStatistics;
		}

		public Integer getThrottleIOPS() {
			return this.throttleIOPS;
		}

		public void setThrottleIOPS(Integer throttleIOPS) {
			this.throttleIOPS = throttleIOPS;
		}
	}

	public static class IncrTransferConfig {

		@SerializedName("ThrottleRps")
		private Integer throttleRps;

		@SerializedName("EnableSequencingWithinTxn")
		private Boolean enableSequencingWithinTxn;

		@SerializedName("SupportDDLTypes")
		private List<String> supportDDLTypes;

		@SerializedName("StoreLogKeptHour")
		private Integer storeLogKeptHour;

		@SerializedName("StartTimestamp")
		private String startTimestamp;

		@SerializedName("RecordTypeWhiteList")
		private List<String> recordTypeWhiteList;

		@SerializedName("IncrSyncConcurrency")
		private Integer incrSyncConcurrency;

		@SerializedName("EnableIncrSyncStatistics")
		private Boolean enableIncrSyncStatistics;

		@SerializedName("ThrottleIOPS")
		private Integer throttleIOPS;

		public Integer getThrottleRps() {
			return this.throttleRps;
		}

		public void setThrottleRps(Integer throttleRps) {
			this.throttleRps = throttleRps;
		}

		public Boolean getEnableSequencingWithinTxn() {
			return this.enableSequencingWithinTxn;
		}

		public void setEnableSequencingWithinTxn(Boolean enableSequencingWithinTxn) {
			this.enableSequencingWithinTxn = enableSequencingWithinTxn;
		}

		public List<String> getSupportDDLTypes() {
			return this.supportDDLTypes;
		}

		public void setSupportDDLTypes(List<String> supportDDLTypes) {
			this.supportDDLTypes = supportDDLTypes;
		}

		public Integer getStoreLogKeptHour() {
			return this.storeLogKeptHour;
		}

		public void setStoreLogKeptHour(Integer storeLogKeptHour) {
			this.storeLogKeptHour = storeLogKeptHour;
		}

		public String getStartTimestamp() {
			return this.startTimestamp;
		}

		public void setStartTimestamp(String startTimestamp) {
			this.startTimestamp = startTimestamp;
		}

		public List<String> getRecordTypeWhiteList() {
			return this.recordTypeWhiteList;
		}

		public void setRecordTypeWhiteList(List<String> recordTypeWhiteList) {
			this.recordTypeWhiteList = recordTypeWhiteList;
		}

		public Integer getIncrSyncConcurrency() {
			return this.incrSyncConcurrency;
		}

		public void setIncrSyncConcurrency(Integer incrSyncConcurrency) {
			this.incrSyncConcurrency = incrSyncConcurrency;
		}

		public Boolean getEnableIncrSyncStatistics() {
			return this.enableIncrSyncStatistics;
		}

		public void setEnableIncrSyncStatistics(Boolean enableIncrSyncStatistics) {
			this.enableIncrSyncStatistics = enableIncrSyncStatistics;
		}

		public Integer getThrottleIOPS() {
			return this.throttleIOPS;
		}

		public void setThrottleIOPS(Integer throttleIOPS) {
			this.throttleIOPS = throttleIOPS;
		}
	}

	@Override
	public Class<CreateProjectResponse> getResponseClass() {
		return CreateProjectResponse.class;
	}

}
