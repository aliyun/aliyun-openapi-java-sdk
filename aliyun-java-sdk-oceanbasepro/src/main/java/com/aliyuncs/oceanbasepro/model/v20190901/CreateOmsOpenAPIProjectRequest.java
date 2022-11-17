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
public class CreateOmsOpenAPIProjectRequest extends RpcAcsRequest<CreateOmsOpenAPIProjectResponse> {
	   

	@SerializedName("destConfig")
	private DestConfig destConfig;

	private Integer pageNumber;

	private Integer pageSize;

	@SerializedName("transferMapping")
	private TransferMapping transferMapping;

	@SerializedName("transferStepConfig")
	private TransferStepConfig transferStepConfig;

	private String workerGradeId;

	private String projectName;

	@SerializedName("sourceConfig")
	private SourceConfig sourceConfig;

	private String businessName;

	@SerializedName("labelIds")
	private List<String> labelIds;
	public CreateOmsOpenAPIProjectRequest() {
		super("OceanBasePro", "2019-09-01", "CreateOmsOpenAPIProject", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public DestConfig getDestConfig() {
		return this.destConfig;
	}

	public void setDestConfig(DestConfig destConfig) {
		this.destConfig = destConfig;	
		if (destConfig != null) {
			putBodyParameter("DestConfig" , new Gson().toJson(destConfig));
		}	
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
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

	public TransferStepConfig getTransferStepConfig() {
		return this.transferStepConfig;
	}

	public void setTransferStepConfig(TransferStepConfig transferStepConfig) {
		this.transferStepConfig = transferStepConfig;	
		if (transferStepConfig != null) {
			putBodyParameter("TransferStepConfig" , new Gson().toJson(transferStepConfig));
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

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public SourceConfig getSourceConfig() {
		return this.sourceConfig;
	}

	public void setSourceConfig(SourceConfig sourceConfig) {
		this.sourceConfig = sourceConfig;	
		if (sourceConfig != null) {
			putBodyParameter("SourceConfig" , new Gson().toJson(sourceConfig));
		}	
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
		if(businessName != null){
			putBodyParameter("BusinessName", businessName);
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

	public static class DestConfig {

		@SerializedName("SendMsgTimeout")
		private Long sendMsgTimeout;

		@SerializedName("SequenceStartTimestamp")
		private Long sequenceStartTimestamp;

		@SerializedName("Partition")
		private Integer partition;

		@SerializedName("SerializerType")
		private String serializerType;

		@SerializedName("EndpointType")
		private String endpointType;

		@SerializedName("EndpointId")
		private String endpointId;

		@SerializedName("SequenceEnable")
		private Boolean sequenceEnable;

		@SerializedName("PartitionMode")
		private String partitionMode;

		@SerializedName("EnableMsgTrace")
		private Boolean enableMsgTrace;

		@SerializedName("TopicType")
		private String topicType;

		@SerializedName("MsgTags")
		private String msgTags;

		@SerializedName("ProducerGroup")
		private String producerGroup;

		public Long getSendMsgTimeout() {
			return this.sendMsgTimeout;
		}

		public void setSendMsgTimeout(Long sendMsgTimeout) {
			this.sendMsgTimeout = sendMsgTimeout;
		}

		public Long getSequenceStartTimestamp() {
			return this.sequenceStartTimestamp;
		}

		public void setSequenceStartTimestamp(Long sequenceStartTimestamp) {
			this.sequenceStartTimestamp = sequenceStartTimestamp;
		}

		public Integer getPartition() {
			return this.partition;
		}

		public void setPartition(Integer partition) {
			this.partition = partition;
		}

		public String getSerializerType() {
			return this.serializerType;
		}

		public void setSerializerType(String serializerType) {
			this.serializerType = serializerType;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public Boolean getSequenceEnable() {
			return this.sequenceEnable;
		}

		public void setSequenceEnable(Boolean sequenceEnable) {
			this.sequenceEnable = sequenceEnable;
		}

		public String getPartitionMode() {
			return this.partitionMode;
		}

		public void setPartitionMode(String partitionMode) {
			this.partitionMode = partitionMode;
		}

		public Boolean getEnableMsgTrace() {
			return this.enableMsgTrace;
		}

		public void setEnableMsgTrace(Boolean enableMsgTrace) {
			this.enableMsgTrace = enableMsgTrace;
		}

		public String getTopicType() {
			return this.topicType;
		}

		public void setTopicType(String topicType) {
			this.topicType = topicType;
		}

		public String getMsgTags() {
			return this.msgTags;
		}

		public void setMsgTags(String msgTags) {
			this.msgTags = msgTags;
		}

		public String getProducerGroup() {
			return this.producerGroup;
		}

		public void setProducerGroup(String producerGroup) {
			this.producerGroup = producerGroup;
		}
	}

	public static class TransferMapping {

		@SerializedName("Mode")
		private String mode;

		@SerializedName("Databases")
		private List<DatabasesItem> databases;

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

		public static class DatabasesItem {

			@SerializedName("MappedName")
			private String mappedName;

			@SerializedName("Tables")
			private List<TablesItem> tables;

			@SerializedName("DatabaseName")
			private String databaseName;

			@SerializedName("TenantName")
			private String tenantName;

			@SerializedName("DatabaseId")
			private String databaseId;

			@SerializedName("Type")
			private String type;

			public String getMappedName() {
				return this.mappedName;
			}

			public void setMappedName(String mappedName) {
				this.mappedName = mappedName;
			}

			public List<TablesItem> getTables() {
				return this.tables;
			}

			public void setTables(List<TablesItem> tables) {
				this.tables = tables;
			}

			public String getDatabaseName() {
				return this.databaseName;
			}

			public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
			}

			public String getTenantName() {
				return this.tenantName;
			}

			public void setTenantName(String tenantName) {
				this.tenantName = tenantName;
			}

			public String getDatabaseId() {
				return this.databaseId;
			}

			public void setDatabaseId(String databaseId) {
				this.databaseId = databaseId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public static class TablesItem {

				@SerializedName("MappedName")
				private String mappedName;

				@SerializedName("FilterColumns")
				private List<String> filterColumns;

				@SerializedName("AdbTableSchema")
				private AdbTableSchema adbTableSchema;

				@SerializedName("TableId")
				private String tableId;

				@SerializedName("WhereClause")
				private String whereClause;

				@SerializedName("ShardColumns")
				private List<String> shardColumns;

				@SerializedName("TableName")
				private String tableName;

				@SerializedName("Type")
				private String type;

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

				public String getTableId() {
					return this.tableId;
				}

				public void setTableId(String tableId) {
					this.tableId = tableId;
				}

				public String getWhereClause() {
					return this.whereClause;
				}

				public void setWhereClause(String whereClause) {
					this.whereClause = whereClause;
				}

				public List<String> getShardColumns() {
					return this.shardColumns;
				}

				public void setShardColumns(List<String> shardColumns) {
					this.shardColumns = shardColumns;
				}

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public static class AdbTableSchema {

					@SerializedName("PrimaryKeys")
					private List<String> primaryKeys;

					@SerializedName("PartitionStatement")
					private String partitionStatement;

					@SerializedName("PartitionLifeCycle")
					private Integer partitionLifeCycle;

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

					public Integer getPartitionLifeCycle() {
						return this.partitionLifeCycle;
					}

					public void setPartitionLifeCycle(Integer partitionLifeCycle) {
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

	public static class TransferStepConfig {

		@SerializedName("IncrSyncStepTransferConfig")
		private IncrSyncStepTransferConfig incrSyncStepTransferConfig;

		@SerializedName("EnableFullSync")
		private Boolean enableFullSync;

		@SerializedName("EnableIncrSync")
		private Boolean enableIncrSync;

		@SerializedName("EnableStructSync")
		private Boolean enableStructSync;

		public IncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
			return this.incrSyncStepTransferConfig;
		}

		public void setIncrSyncStepTransferConfig(IncrSyncStepTransferConfig incrSyncStepTransferConfig) {
			this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
		}

		public Boolean getEnableFullSync() {
			return this.enableFullSync;
		}

		public void setEnableFullSync(Boolean enableFullSync) {
			this.enableFullSync = enableFullSync;
		}

		public Boolean getEnableIncrSync() {
			return this.enableIncrSync;
		}

		public void setEnableIncrSync(Boolean enableIncrSync) {
			this.enableIncrSync = enableIncrSync;
		}

		public Boolean getEnableStructSync() {
			return this.enableStructSync;
		}

		public void setEnableStructSync(Boolean enableStructSync) {
			this.enableStructSync = enableStructSync;
		}

		public static class IncrSyncStepTransferConfig {

			@SerializedName("StoreTransactionEnabled")
			private Boolean storeTransactionEnabled;

			@SerializedName("RecordTypeList")
			private List<String> recordTypeList;

			@SerializedName("TransferStepType")
			private String transferStepType;

			@SerializedName("StoreLogKeptHour")
			private Long storeLogKeptHour;

			@SerializedName("StartTimestamp")
			private Long startTimestamp;

			public Boolean getStoreTransactionEnabled() {
				return this.storeTransactionEnabled;
			}

			public void setStoreTransactionEnabled(Boolean storeTransactionEnabled) {
				this.storeTransactionEnabled = storeTransactionEnabled;
			}

			public List<String> getRecordTypeList() {
				return this.recordTypeList;
			}

			public void setRecordTypeList(List<String> recordTypeList) {
				this.recordTypeList = recordTypeList;
			}

			public String getTransferStepType() {
				return this.transferStepType;
			}

			public void setTransferStepType(String transferStepType) {
				this.transferStepType = transferStepType;
			}

			public Long getStoreLogKeptHour() {
				return this.storeLogKeptHour;
			}

			public void setStoreLogKeptHour(Long storeLogKeptHour) {
				this.storeLogKeptHour = storeLogKeptHour;
			}

			public Long getStartTimestamp() {
				return this.startTimestamp;
			}

			public void setStartTimestamp(Long startTimestamp) {
				this.startTimestamp = startTimestamp;
			}
		}
	}

	public static class SourceConfig {

		@SerializedName("SendMsgTimeout")
		private Long sendMsgTimeout;

		@SerializedName("SequenceStartTimestamp")
		private Long sequenceStartTimestamp;

		@SerializedName("Partition")
		private Integer partition;

		@SerializedName("SerializerType")
		private String serializerType;

		@SerializedName("EndpointType")
		private String endpointType;

		@SerializedName("EndpointId")
		private String endpointId;

		@SerializedName("SequenceEnable")
		private Boolean sequenceEnable;

		@SerializedName("PartitionMode")
		private String partitionMode;

		@SerializedName("EnableMsgTrace")
		private Boolean enableMsgTrace;

		@SerializedName("TopicType")
		private String topicType;

		@SerializedName("MsgTags")
		private String msgTags;

		@SerializedName("ProducerGroup")
		private String producerGroup;

		public Long getSendMsgTimeout() {
			return this.sendMsgTimeout;
		}

		public void setSendMsgTimeout(Long sendMsgTimeout) {
			this.sendMsgTimeout = sendMsgTimeout;
		}

		public Long getSequenceStartTimestamp() {
			return this.sequenceStartTimestamp;
		}

		public void setSequenceStartTimestamp(Long sequenceStartTimestamp) {
			this.sequenceStartTimestamp = sequenceStartTimestamp;
		}

		public Integer getPartition() {
			return this.partition;
		}

		public void setPartition(Integer partition) {
			this.partition = partition;
		}

		public String getSerializerType() {
			return this.serializerType;
		}

		public void setSerializerType(String serializerType) {
			this.serializerType = serializerType;
		}

		public String getEndpointType() {
			return this.endpointType;
		}

		public void setEndpointType(String endpointType) {
			this.endpointType = endpointType;
		}

		public String getEndpointId() {
			return this.endpointId;
		}

		public void setEndpointId(String endpointId) {
			this.endpointId = endpointId;
		}

		public Boolean getSequenceEnable() {
			return this.sequenceEnable;
		}

		public void setSequenceEnable(Boolean sequenceEnable) {
			this.sequenceEnable = sequenceEnable;
		}

		public String getPartitionMode() {
			return this.partitionMode;
		}

		public void setPartitionMode(String partitionMode) {
			this.partitionMode = partitionMode;
		}

		public Boolean getEnableMsgTrace() {
			return this.enableMsgTrace;
		}

		public void setEnableMsgTrace(Boolean enableMsgTrace) {
			this.enableMsgTrace = enableMsgTrace;
		}

		public String getTopicType() {
			return this.topicType;
		}

		public void setTopicType(String topicType) {
			this.topicType = topicType;
		}

		public String getMsgTags() {
			return this.msgTags;
		}

		public void setMsgTags(String msgTags) {
			this.msgTags = msgTags;
		}

		public String getProducerGroup() {
			return this.producerGroup;
		}

		public void setProducerGroup(String producerGroup) {
			this.producerGroup = producerGroup;
		}
	}

	@Override
	public Class<CreateOmsOpenAPIProjectResponse> getResponseClass() {
		return CreateOmsOpenAPIProjectResponse.class;
	}

}
