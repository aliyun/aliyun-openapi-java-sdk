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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeOmsOpenAPIProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOmsOpenAPIProjectResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String advice;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private String cost;

	private ErrorDetail errorDetail;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAdvice() {
		return this.advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public ErrorDetail getErrorDetail() {
		return this.errorDetail;
	}

	public void setErrorDetail(ErrorDetail errorDetail) {
		this.errorDetail = errorDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorDetail {

		private String code;

		private String level;

		private String message;

		private String proposal;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getProposal() {
			return this.proposal;
		}

		public void setProposal(String proposal) {
			this.proposal = proposal;
		}
	}

	public static class Data {

		private String projectId;

		private String projectName;

		private String projectOwner;

		private String businessName;

		private List<Label> labels;

		private List<Step> steps;

		private SourceConfig sourceConfig;

		private DestConfig destConfig;

		private TransferMapping transferMapping;

		private TransferStepConfig transferStepConfig;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getProjectOwner() {
			return this.projectOwner;
		}

		public void setProjectOwner(String projectOwner) {
			this.projectOwner = projectOwner;
		}

		public String getBusinessName() {
			return this.businessName;
		}

		public void setBusinessName(String businessName) {
			this.businessName = businessName;
		}

		public List<Label> getLabels() {
			return this.labels;
		}

		public void setLabels(List<Label> labels) {
			this.labels = labels;
		}

		public List<Step> getSteps() {
			return this.steps;
		}

		public void setSteps(List<Step> steps) {
			this.steps = steps;
		}

		public SourceConfig getSourceConfig() {
			return this.sourceConfig;
		}

		public void setSourceConfig(SourceConfig sourceConfig) {
			this.sourceConfig = sourceConfig;
		}

		public DestConfig getDestConfig() {
			return this.destConfig;
		}

		public void setDestConfig(DestConfig destConfig) {
			this.destConfig = destConfig;
		}

		public TransferMapping getTransferMapping() {
			return this.transferMapping;
		}

		public void setTransferMapping(TransferMapping transferMapping) {
			this.transferMapping = transferMapping;
		}

		public TransferStepConfig getTransferStepConfig() {
			return this.transferStepConfig;
		}

		public void setTransferStepConfig(TransferStepConfig transferStepConfig) {
			this.transferStepConfig = transferStepConfig;
		}

		public static class Label {

			private String id;

			private String name;

			private String creator;

			private Integer count;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}

		public static class Step {

			private Integer stepOrder;

			private String stepName;

			private String stepDescription;

			private String stepStatus;

			private Integer stepProgress;

			private String startTime;

			private Long estimatedRemainingSeconds;

			private String finishTime;

			private Boolean interactive;

			private StepInfo stepInfo;

			private ExtraInfo extraInfo;

			public Integer getStepOrder() {
				return this.stepOrder;
			}

			public void setStepOrder(Integer stepOrder) {
				this.stepOrder = stepOrder;
			}

			public String getStepName() {
				return this.stepName;
			}

			public void setStepName(String stepName) {
				this.stepName = stepName;
			}

			public String getStepDescription() {
				return this.stepDescription;
			}

			public void setStepDescription(String stepDescription) {
				this.stepDescription = stepDescription;
			}

			public String getStepStatus() {
				return this.stepStatus;
			}

			public void setStepStatus(String stepStatus) {
				this.stepStatus = stepStatus;
			}

			public Integer getStepProgress() {
				return this.stepProgress;
			}

			public void setStepProgress(Integer stepProgress) {
				this.stepProgress = stepProgress;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Long getEstimatedRemainingSeconds() {
				return this.estimatedRemainingSeconds;
			}

			public void setEstimatedRemainingSeconds(Long estimatedRemainingSeconds) {
				this.estimatedRemainingSeconds = estimatedRemainingSeconds;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public Boolean getInteractive() {
				return this.interactive;
			}

			public void setInteractive(Boolean interactive) {
				this.interactive = interactive;
			}

			public StepInfo getStepInfo() {
				return this.stepInfo;
			}

			public void setStepInfo(StepInfo stepInfo) {
				this.stepInfo = stepInfo;
			}

			public ExtraInfo getExtraInfo() {
				return this.extraInfo;
			}

			public void setExtraInfo(ExtraInfo extraInfo) {
				this.extraInfo = extraInfo;
			}

			public static class StepInfo {

				private String jobId;

				private Long incrTimestampCheckpoint;

				private String checkpoint;

				private Long gmt;

				private Boolean validated;

				private Boolean skipped;

				private Long inconsistencies;

				private String deployId;

				private Long processedRecords;

				private Long capacity;

				private Long srcRps;

				private Long srcRt;

				private Long srcIops;

				private Long dstRps;

				private Long dstRt;

				private Long dstIops;

				private Long srcRpsRef;

				private Long srcRtRef;

				private Long dstRpsRef;

				private Long dstRtRef;

				private Long srcIopsRef;

				private ConnectorFullProgressOverview connectorFullProgressOverview;

				public String getJobId() {
					return this.jobId;
				}

				public void setJobId(String jobId) {
					this.jobId = jobId;
				}

				public Long getIncrTimestampCheckpoint() {
					return this.incrTimestampCheckpoint;
				}

				public void setIncrTimestampCheckpoint(Long incrTimestampCheckpoint) {
					this.incrTimestampCheckpoint = incrTimestampCheckpoint;
				}

				public String getCheckpoint() {
					return this.checkpoint;
				}

				public void setCheckpoint(String checkpoint) {
					this.checkpoint = checkpoint;
				}

				public Long getGmt() {
					return this.gmt;
				}

				public void setGmt(Long gmt) {
					this.gmt = gmt;
				}

				public Boolean getValidated() {
					return this.validated;
				}

				public void setValidated(Boolean validated) {
					this.validated = validated;
				}

				public Boolean getSkipped() {
					return this.skipped;
				}

				public void setSkipped(Boolean skipped) {
					this.skipped = skipped;
				}

				public Long getInconsistencies() {
					return this.inconsistencies;
				}

				public void setInconsistencies(Long inconsistencies) {
					this.inconsistencies = inconsistencies;
				}

				public String getDeployId() {
					return this.deployId;
				}

				public void setDeployId(String deployId) {
					this.deployId = deployId;
				}

				public Long getProcessedRecords() {
					return this.processedRecords;
				}

				public void setProcessedRecords(Long processedRecords) {
					this.processedRecords = processedRecords;
				}

				public Long getCapacity() {
					return this.capacity;
				}

				public void setCapacity(Long capacity) {
					this.capacity = capacity;
				}

				public Long getSrcRps() {
					return this.srcRps;
				}

				public void setSrcRps(Long srcRps) {
					this.srcRps = srcRps;
				}

				public Long getSrcRt() {
					return this.srcRt;
				}

				public void setSrcRt(Long srcRt) {
					this.srcRt = srcRt;
				}

				public Long getSrcIops() {
					return this.srcIops;
				}

				public void setSrcIops(Long srcIops) {
					this.srcIops = srcIops;
				}

				public Long getDstRps() {
					return this.dstRps;
				}

				public void setDstRps(Long dstRps) {
					this.dstRps = dstRps;
				}

				public Long getDstRt() {
					return this.dstRt;
				}

				public void setDstRt(Long dstRt) {
					this.dstRt = dstRt;
				}

				public Long getDstIops() {
					return this.dstIops;
				}

				public void setDstIops(Long dstIops) {
					this.dstIops = dstIops;
				}

				public Long getSrcRpsRef() {
					return this.srcRpsRef;
				}

				public void setSrcRpsRef(Long srcRpsRef) {
					this.srcRpsRef = srcRpsRef;
				}

				public Long getSrcRtRef() {
					return this.srcRtRef;
				}

				public void setSrcRtRef(Long srcRtRef) {
					this.srcRtRef = srcRtRef;
				}

				public Long getDstRpsRef() {
					return this.dstRpsRef;
				}

				public void setDstRpsRef(Long dstRpsRef) {
					this.dstRpsRef = dstRpsRef;
				}

				public Long getDstRtRef() {
					return this.dstRtRef;
				}

				public void setDstRtRef(Long dstRtRef) {
					this.dstRtRef = dstRtRef;
				}

				public Long getSrcIopsRef() {
					return this.srcIopsRef;
				}

				public void setSrcIopsRef(Long srcIopsRef) {
					this.srcIopsRef = srcIopsRef;
				}

				public ConnectorFullProgressOverview getConnectorFullProgressOverview() {
					return this.connectorFullProgressOverview;
				}

				public void setConnectorFullProgressOverview(ConnectorFullProgressOverview connectorFullProgressOverview) {
					this.connectorFullProgressOverview = connectorFullProgressOverview;
				}

				public static class ConnectorFullProgressOverview {

					private Long estimatedTotalCount;

					private Long finishedCount;

					private Integer progress;

					private Long estimatedRemainingTimeOfSec;

					public Long getEstimatedTotalCount() {
						return this.estimatedTotalCount;
					}

					public void setEstimatedTotalCount(Long estimatedTotalCount) {
						this.estimatedTotalCount = estimatedTotalCount;
					}

					public Long getFinishedCount() {
						return this.finishedCount;
					}

					public void setFinishedCount(Long finishedCount) {
						this.finishedCount = finishedCount;
					}

					public Integer getProgress() {
						return this.progress;
					}

					public void setProgress(Integer progress) {
						this.progress = progress;
					}

					public Long getEstimatedRemainingTimeOfSec() {
						return this.estimatedRemainingTimeOfSec;
					}

					public void setEstimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
						this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
					}
				}
			}

			public static class ExtraInfo {

				private String errorCode;

				private String errorMsg;

				private Map<Object,Object> errorParam;

				private String failedTime;

				private List<ErrorDetail1> errorDetails;

				public String getErrorCode() {
					return this.errorCode;
				}

				public void setErrorCode(String errorCode) {
					this.errorCode = errorCode;
				}

				public String getErrorMsg() {
					return this.errorMsg;
				}

				public void setErrorMsg(String errorMsg) {
					this.errorMsg = errorMsg;
				}

				public Map<Object,Object> getErrorParam() {
					return this.errorParam;
				}

				public void setErrorParam(Map<Object,Object> errorParam) {
					this.errorParam = errorParam;
				}

				public String getFailedTime() {
					return this.failedTime;
				}

				public void setFailedTime(String failedTime) {
					this.failedTime = failedTime;
				}

				public List<ErrorDetail1> getErrorDetails() {
					return this.errorDetails;
				}

				public void setErrorDetails(List<ErrorDetail1> errorDetails) {
					this.errorDetails = errorDetails;
				}

				public static class ErrorDetail1 {

					private String code;

					private String level;

					private String message;

					private String proposal;

					public String getCode() {
						return this.code;
					}

					public void setCode(String code) {
						this.code = code;
					}

					public String getLevel() {
						return this.level;
					}

					public void setLevel(String level) {
						this.level = level;
					}

					public String getMessage() {
						return this.message;
					}

					public void setMessage(String message) {
						this.message = message;
					}

					public String getProposal() {
						return this.proposal;
					}

					public void setProposal(String proposal) {
						this.proposal = proposal;
					}
				}
			}
		}

		public static class SourceConfig {

			private String endpointType;

			private String endpointId;

			private String partitionMode;

			private Integer partition;

			private String serializerType;

			private String topicType;

			private Boolean sequenceEnable;

			private Long sequenceStartTimestamp;

			private String producerGroup;

			private String msgTags;

			private Boolean enableMsgTrace;

			private Long sendMsgTimeout;

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

			public String getPartitionMode() {
				return this.partitionMode;
			}

			public void setPartitionMode(String partitionMode) {
				this.partitionMode = partitionMode;
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

			public String getTopicType() {
				return this.topicType;
			}

			public void setTopicType(String topicType) {
				this.topicType = topicType;
			}

			public Boolean getSequenceEnable() {
				return this.sequenceEnable;
			}

			public void setSequenceEnable(Boolean sequenceEnable) {
				this.sequenceEnable = sequenceEnable;
			}

			public Long getSequenceStartTimestamp() {
				return this.sequenceStartTimestamp;
			}

			public void setSequenceStartTimestamp(Long sequenceStartTimestamp) {
				this.sequenceStartTimestamp = sequenceStartTimestamp;
			}

			public String getProducerGroup() {
				return this.producerGroup;
			}

			public void setProducerGroup(String producerGroup) {
				this.producerGroup = producerGroup;
			}

			public String getMsgTags() {
				return this.msgTags;
			}

			public void setMsgTags(String msgTags) {
				this.msgTags = msgTags;
			}

			public Boolean getEnableMsgTrace() {
				return this.enableMsgTrace;
			}

			public void setEnableMsgTrace(Boolean enableMsgTrace) {
				this.enableMsgTrace = enableMsgTrace;
			}

			public Long getSendMsgTimeout() {
				return this.sendMsgTimeout;
			}

			public void setSendMsgTimeout(Long sendMsgTimeout) {
				this.sendMsgTimeout = sendMsgTimeout;
			}
		}

		public static class DestConfig {

			private String endpointType;

			private String endpointId;

			private String partitionMode;

			private Integer partition;

			private String serializerType;

			private String topicType;

			private Boolean sequenceEnable;

			private Long sequenceStartTimestamp;

			private String producerGroup;

			private String msgTags;

			private Boolean enableMsgTrace;

			private Long sendMsgTimeout;

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

			public String getPartitionMode() {
				return this.partitionMode;
			}

			public void setPartitionMode(String partitionMode) {
				this.partitionMode = partitionMode;
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

			public String getTopicType() {
				return this.topicType;
			}

			public void setTopicType(String topicType) {
				this.topicType = topicType;
			}

			public Boolean getSequenceEnable() {
				return this.sequenceEnable;
			}

			public void setSequenceEnable(Boolean sequenceEnable) {
				this.sequenceEnable = sequenceEnable;
			}

			public Long getSequenceStartTimestamp() {
				return this.sequenceStartTimestamp;
			}

			public void setSequenceStartTimestamp(Long sequenceStartTimestamp) {
				this.sequenceStartTimestamp = sequenceStartTimestamp;
			}

			public String getProducerGroup() {
				return this.producerGroup;
			}

			public void setProducerGroup(String producerGroup) {
				this.producerGroup = producerGroup;
			}

			public String getMsgTags() {
				return this.msgTags;
			}

			public void setMsgTags(String msgTags) {
				this.msgTags = msgTags;
			}

			public Boolean getEnableMsgTrace() {
				return this.enableMsgTrace;
			}

			public void setEnableMsgTrace(Boolean enableMsgTrace) {
				this.enableMsgTrace = enableMsgTrace;
			}

			public Long getSendMsgTimeout() {
				return this.sendMsgTimeout;
			}

			public void setSendMsgTimeout(Long sendMsgTimeout) {
				this.sendMsgTimeout = sendMsgTimeout;
			}
		}

		public static class TransferMapping {

			private String mode;

			private List<Database> databases;

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public List<Database> getDatabases() {
				return this.databases;
			}

			public void setDatabases(List<Database> databases) {
				this.databases = databases;
			}

			public static class Database {

				private String tenantName;

				private String mappedName;

				private String databaseId;

				private String databaseName;

				private String type;

				private List<Table> tables;

				public String getTenantName() {
					return this.tenantName;
				}

				public void setTenantName(String tenantName) {
					this.tenantName = tenantName;
				}

				public String getMappedName() {
					return this.mappedName;
				}

				public void setMappedName(String mappedName) {
					this.mappedName = mappedName;
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

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public List<Table> getTables() {
					return this.tables;
				}

				public void setTables(List<Table> tables) {
					this.tables = tables;
				}

				public static class Table {

					private String mappedName;

					private String tableId;

					private String tableName;

					private String whereClause;

					private String type;

					private List<String> filterColumns;

					private List<String> shardColumns;

					private AdbTableSchema adbTableSchema;

					public String getMappedName() {
						return this.mappedName;
					}

					public void setMappedName(String mappedName) {
						this.mappedName = mappedName;
					}

					public String getTableId() {
						return this.tableId;
					}

					public void setTableId(String tableId) {
						this.tableId = tableId;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}

					public String getWhereClause() {
						return this.whereClause;
					}

					public void setWhereClause(String whereClause) {
						this.whereClause = whereClause;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public List<String> getFilterColumns() {
						return this.filterColumns;
					}

					public void setFilterColumns(List<String> filterColumns) {
						this.filterColumns = filterColumns;
					}

					public List<String> getShardColumns() {
						return this.shardColumns;
					}

					public void setShardColumns(List<String> shardColumns) {
						this.shardColumns = shardColumns;
					}

					public AdbTableSchema getAdbTableSchema() {
						return this.adbTableSchema;
					}

					public void setAdbTableSchema(AdbTableSchema adbTableSchema) {
						this.adbTableSchema = adbTableSchema;
					}

					public static class AdbTableSchema {

						private String partitionStatement;

						private Integer partitionLifeCycle;

						private List<String> primaryKeys;

						private List<String> distributedKeys;

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

						public List<String> getPrimaryKeys() {
							return this.primaryKeys;
						}

						public void setPrimaryKeys(List<String> primaryKeys) {
							this.primaryKeys = primaryKeys;
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

			private Boolean enableStructSync;

			private Boolean enableFullSync;

			private Boolean enableIncrSync;

			private IncrSyncStepTransferConfig incrSyncStepTransferConfig;

			public Boolean getEnableStructSync() {
				return this.enableStructSync;
			}

			public void setEnableStructSync(Boolean enableStructSync) {
				this.enableStructSync = enableStructSync;
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

			public IncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
				return this.incrSyncStepTransferConfig;
			}

			public void setIncrSyncStepTransferConfig(IncrSyncStepTransferConfig incrSyncStepTransferConfig) {
				this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
			}

			public static class IncrSyncStepTransferConfig {

				private Long startTimestamp;

				private Long storeLogKeptHour;

				private Boolean storeTransactionEnabled;

				private String transferStepType;

				private List<String> recordTypeList;

				public Long getStartTimestamp() {
					return this.startTimestamp;
				}

				public void setStartTimestamp(Long startTimestamp) {
					this.startTimestamp = startTimestamp;
				}

				public Long getStoreLogKeptHour() {
					return this.storeLogKeptHour;
				}

				public void setStoreLogKeptHour(Long storeLogKeptHour) {
					this.storeLogKeptHour = storeLogKeptHour;
				}

				public Boolean getStoreTransactionEnabled() {
					return this.storeTransactionEnabled;
				}

				public void setStoreTransactionEnabled(Boolean storeTransactionEnabled) {
					this.storeTransactionEnabled = storeTransactionEnabled;
				}

				public String getTransferStepType() {
					return this.transferStepType;
				}

				public void setTransferStepType(String transferStepType) {
					this.transferStepType = transferStepType;
				}

				public List<String> getRecordTypeList() {
					return this.recordTypeList;
				}

				public void setRecordTypeList(List<String> recordTypeList) {
					this.recordTypeList = recordTypeList;
				}
			}
		}
	}

	@Override
	public DescribeOmsOpenAPIProjectResponse getInstance(UnmarshallerContext context) {
		return	DescribeOmsOpenAPIProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
