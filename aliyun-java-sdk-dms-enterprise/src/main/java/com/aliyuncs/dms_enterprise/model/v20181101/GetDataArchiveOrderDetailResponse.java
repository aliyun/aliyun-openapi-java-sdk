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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataArchiveOrderDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataArchiveOrderDetailResponse extends AcsResponse {

	private String traceId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private String requestId;

	private DataArchiveOrderDetail dataArchiveOrderDetail;

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DataArchiveOrderDetail getDataArchiveOrderDetail() {
		return this.dataArchiveOrderDetail;
	}

	public void setDataArchiveOrderDetail(DataArchiveOrderDetail dataArchiveOrderDetail) {
		this.dataArchiveOrderDetail = dataArchiveOrderDetail;
	}

	public static class DataArchiveOrderDetail {

		private String comment;

		private String committer;

		private Long committerId;

		private String gmtCreate;

		private String gmtModified;

		private Long id;

		private String pluginType;

		private String statusCode;

		private String statusDesc;

		private Long workflowInstanceId;

		private String workflowStatusDesc;

		private List<Long> relatedUserList;

		private List<String> relatedUserNickList;

		private PluginExtraData pluginExtraData;

		private PluginParam pluginParam;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getCommitter() {
			return this.committer;
		}

		public void setCommitter(String committer) {
			this.committer = committer;
		}

		public Long getCommitterId() {
			return this.committerId;
		}

		public void setCommitterId(Long committerId) {
			this.committerId = committerId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPluginType() {
			return this.pluginType;
		}

		public void setPluginType(String pluginType) {
			this.pluginType = pluginType;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public Long getWorkflowInstanceId() {
			return this.workflowInstanceId;
		}

		public void setWorkflowInstanceId(Long workflowInstanceId) {
			this.workflowInstanceId = workflowInstanceId;
		}

		public String getWorkflowStatusDesc() {
			return this.workflowStatusDesc;
		}

		public void setWorkflowStatusDesc(String workflowStatusDesc) {
			this.workflowStatusDesc = workflowStatusDesc;
		}

		public List<Long> getRelatedUserList() {
			return this.relatedUserList;
		}

		public void setRelatedUserList(List<Long> relatedUserList) {
			this.relatedUserList = relatedUserList;
		}

		public List<String> getRelatedUserNickList() {
			return this.relatedUserNickList;
		}

		public void setRelatedUserNickList(List<String> relatedUserNickList) {
			this.relatedUserNickList = relatedUserNickList;
		}

		public PluginExtraData getPluginExtraData() {
			return this.pluginExtraData;
		}

		public void setPluginExtraData(PluginExtraData pluginExtraData) {
			this.pluginExtraData = pluginExtraData;
		}

		public PluginParam getPluginParam() {
			return this.pluginParam;
		}

		public void setPluginParam(PluginParam pluginParam) {
			this.pluginParam = pluginParam;
		}

		public static class PluginExtraData {

			private Long instanceTotal;

			private Long pageIndex;

			private Long pageSize;

			private List<InstancesItem> instances;

			private DagInfo dagInfo;

			private DbBaseInfo dbBaseInfo;

			private NextFireTimeResult nextFireTimeResult;

			public Long getInstanceTotal() {
				return this.instanceTotal;
			}

			public void setInstanceTotal(Long instanceTotal) {
				this.instanceTotal = instanceTotal;
			}

			public Long getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Long pageIndex) {
				this.pageIndex = pageIndex;
			}

			public Long getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Long pageSize) {
				this.pageSize = pageSize;
			}

			public List<InstancesItem> getInstances() {
				return this.instances;
			}

			public void setInstances(List<InstancesItem> instances) {
				this.instances = instances;
			}

			public DagInfo getDagInfo() {
				return this.dagInfo;
			}

			public void setDagInfo(DagInfo dagInfo) {
				this.dagInfo = dagInfo;
			}

			public DbBaseInfo getDbBaseInfo() {
				return this.dbBaseInfo;
			}

			public void setDbBaseInfo(DbBaseInfo dbBaseInfo) {
				this.dbBaseInfo = dbBaseInfo;
			}

			public NextFireTimeResult getNextFireTimeResult() {
				return this.nextFireTimeResult;
			}

			public void setNextFireTimeResult(NextFireTimeResult nextFireTimeResult) {
				this.nextFireTimeResult = nextFireTimeResult;
			}

			public static class InstancesItem {

				private String businessTime;

				private Long dagId;

				private String endTime;

				private String gmtCreate;

				private String gmtModified;

				private Long historyDagId;

				private Long id;

				private String lastRunningContext;

				private String msg;

				private Long status;

				private String tenantId;

				private Long triggerType;

				private String version;

				public String getBusinessTime() {
					return this.businessTime;
				}

				public void setBusinessTime(String businessTime) {
					this.businessTime = businessTime;
				}

				public Long getDagId() {
					return this.dagId;
				}

				public void setDagId(Long dagId) {
					this.dagId = dagId;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public Long getHistoryDagId() {
					return this.historyDagId;
				}

				public void setHistoryDagId(Long historyDagId) {
					this.historyDagId = historyDagId;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getLastRunningContext() {
					return this.lastRunningContext;
				}

				public void setLastRunningContext(String lastRunningContext) {
					this.lastRunningContext = lastRunningContext;
				}

				public String getMsg() {
					return this.msg;
				}

				public void setMsg(String msg) {
					this.msg = msg;
				}

				public Long getStatus() {
					return this.status;
				}

				public void setStatus(Long status) {
					this.status = status;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public Long getTriggerType() {
					return this.triggerType;
				}

				public void setTriggerType(Long triggerType) {
					this.triggerType = triggerType;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}
			}

			public static class DagInfo {

				private String creatorId;

				private String cronBeginDate;

				private String cronEndDate;

				private Boolean cronTrigger;

				private Boolean dWDevelop;

				private String dagName;

				private String dagOwnerId;

				private Long deployId;

				private String description;

				private Long editDagId;

				private String gmtCreate;

				private String gmtModified;

				private Long id;

				private Long isPublic;

				private Boolean legacy;

				private Boolean system;

				private String tenantId;

				private Boolean triggerOnce;

				public String getCreatorId() {
					return this.creatorId;
				}

				public void setCreatorId(String creatorId) {
					this.creatorId = creatorId;
				}

				public String getCronBeginDate() {
					return this.cronBeginDate;
				}

				public void setCronBeginDate(String cronBeginDate) {
					this.cronBeginDate = cronBeginDate;
				}

				public String getCronEndDate() {
					return this.cronEndDate;
				}

				public void setCronEndDate(String cronEndDate) {
					this.cronEndDate = cronEndDate;
				}

				public Boolean getCronTrigger() {
					return this.cronTrigger;
				}

				public void setCronTrigger(Boolean cronTrigger) {
					this.cronTrigger = cronTrigger;
				}

				public Boolean getDWDevelop() {
					return this.dWDevelop;
				}

				public void setDWDevelop(Boolean dWDevelop) {
					this.dWDevelop = dWDevelop;
				}

				public String getDagName() {
					return this.dagName;
				}

				public void setDagName(String dagName) {
					this.dagName = dagName;
				}

				public String getDagOwnerId() {
					return this.dagOwnerId;
				}

				public void setDagOwnerId(String dagOwnerId) {
					this.dagOwnerId = dagOwnerId;
				}

				public Long getDeployId() {
					return this.deployId;
				}

				public void setDeployId(Long deployId) {
					this.deployId = deployId;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Long getEditDagId() {
					return this.editDagId;
				}

				public void setEditDagId(Long editDagId) {
					this.editDagId = editDagId;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Long getIsPublic() {
					return this.isPublic;
				}

				public void setIsPublic(Long isPublic) {
					this.isPublic = isPublic;
				}

				public Boolean getLegacy() {
					return this.legacy;
				}

				public void setLegacy(Boolean legacy) {
					this.legacy = legacy;
				}

				public Boolean getSystem() {
					return this.system;
				}

				public void setSystem(Boolean system) {
					this.system = system;
				}

				public String getTenantId() {
					return this.tenantId;
				}

				public void setTenantId(String tenantId) {
					this.tenantId = tenantId;
				}

				public Boolean getTriggerOnce() {
					return this.triggerOnce;
				}

				public void setTriggerOnce(Boolean triggerOnce) {
					this.triggerOnce = triggerOnce;
				}
			}

			public static class DbBaseInfo {

				private String alias;

				private Long alterTimeout;

				private Boolean assetControl;

				private String catalogName;

				private String clusterNode;

				private Long dbId;

				private String dbType;

				private Long dbaId;

				private String dbaName;

				private String description;

				private String encoding;

				private String envType;

				private Boolean follow;

				private String host;

				private String idc;

				private String idcTitle;

				private Long instanceId;

				private String instanceSource;

				private String lastSyncTime;

				private String level;

				private Boolean logic;

				private Long port;

				private String schemaName;

				private String searchName;

				private String state;

				private Long tableCount;

				private String tnsName;

				private String unitType;

				private List<Long> ownerIds;

				private List<String> ownerNames;

				private StandardGroup standardGroup;

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public Long getAlterTimeout() {
					return this.alterTimeout;
				}

				public void setAlterTimeout(Long alterTimeout) {
					this.alterTimeout = alterTimeout;
				}

				public Boolean getAssetControl() {
					return this.assetControl;
				}

				public void setAssetControl(Boolean assetControl) {
					this.assetControl = assetControl;
				}

				public String getCatalogName() {
					return this.catalogName;
				}

				public void setCatalogName(String catalogName) {
					this.catalogName = catalogName;
				}

				public String getClusterNode() {
					return this.clusterNode;
				}

				public void setClusterNode(String clusterNode) {
					this.clusterNode = clusterNode;
				}

				public Long getDbId() {
					return this.dbId;
				}

				public void setDbId(Long dbId) {
					this.dbId = dbId;
				}

				public String getDbType() {
					return this.dbType;
				}

				public void setDbType(String dbType) {
					this.dbType = dbType;
				}

				public Long getDbaId() {
					return this.dbaId;
				}

				public void setDbaId(Long dbaId) {
					this.dbaId = dbaId;
				}

				public String getDbaName() {
					return this.dbaName;
				}

				public void setDbaName(String dbaName) {
					this.dbaName = dbaName;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getEncoding() {
					return this.encoding;
				}

				public void setEncoding(String encoding) {
					this.encoding = encoding;
				}

				public String getEnvType() {
					return this.envType;
				}

				public void setEnvType(String envType) {
					this.envType = envType;
				}

				public Boolean getFollow() {
					return this.follow;
				}

				public void setFollow(Boolean follow) {
					this.follow = follow;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getIdc() {
					return this.idc;
				}

				public void setIdc(String idc) {
					this.idc = idc;
				}

				public String getIdcTitle() {
					return this.idcTitle;
				}

				public void setIdcTitle(String idcTitle) {
					this.idcTitle = idcTitle;
				}

				public Long getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(Long instanceId) {
					this.instanceId = instanceId;
				}

				public String getInstanceSource() {
					return this.instanceSource;
				}

				public void setInstanceSource(String instanceSource) {
					this.instanceSource = instanceSource;
				}

				public String getLastSyncTime() {
					return this.lastSyncTime;
				}

				public void setLastSyncTime(String lastSyncTime) {
					this.lastSyncTime = lastSyncTime;
				}

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public Boolean getLogic() {
					return this.logic;
				}

				public void setLogic(Boolean logic) {
					this.logic = logic;
				}

				public Long getPort() {
					return this.port;
				}

				public void setPort(Long port) {
					this.port = port;
				}

				public String getSchemaName() {
					return this.schemaName;
				}

				public void setSchemaName(String schemaName) {
					this.schemaName = schemaName;
				}

				public String getSearchName() {
					return this.searchName;
				}

				public void setSearchName(String searchName) {
					this.searchName = searchName;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public Long getTableCount() {
					return this.tableCount;
				}

				public void setTableCount(Long tableCount) {
					this.tableCount = tableCount;
				}

				public String getTnsName() {
					return this.tnsName;
				}

				public void setTnsName(String tnsName) {
					this.tnsName = tnsName;
				}

				public String getUnitType() {
					return this.unitType;
				}

				public void setUnitType(String unitType) {
					this.unitType = unitType;
				}

				public List<Long> getOwnerIds() {
					return this.ownerIds;
				}

				public void setOwnerIds(List<Long> ownerIds) {
					this.ownerIds = ownerIds;
				}

				public List<String> getOwnerNames() {
					return this.ownerNames;
				}

				public void setOwnerNames(List<String> ownerNames) {
					this.ownerNames = ownerNames;
				}

				public StandardGroup getStandardGroup() {
					return this.standardGroup;
				}

				public void setStandardGroup(StandardGroup standardGroup) {
					this.standardGroup = standardGroup;
				}

				public static class StandardGroup {

					private String dbType;

					private String description;

					private Boolean freeOrStable;

					private String gmtCreate;

					private String gmtModified;

					private String groupMode;

					private String groupName;

					private Long id;

					private Long lastMenderId;

					public String getDbType() {
						return this.dbType;
					}

					public void setDbType(String dbType) {
						this.dbType = dbType;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}

					public Boolean getFreeOrStable() {
						return this.freeOrStable;
					}

					public void setFreeOrStable(Boolean freeOrStable) {
						this.freeOrStable = freeOrStable;
					}

					public String getGmtCreate() {
						return this.gmtCreate;
					}

					public void setGmtCreate(String gmtCreate) {
						this.gmtCreate = gmtCreate;
					}

					public String getGmtModified() {
						return this.gmtModified;
					}

					public void setGmtModified(String gmtModified) {
						this.gmtModified = gmtModified;
					}

					public String getGroupMode() {
						return this.groupMode;
					}

					public void setGroupMode(String groupMode) {
						this.groupMode = groupMode;
					}

					public String getGroupName() {
						return this.groupName;
					}

					public void setGroupName(String groupName) {
						this.groupName = groupName;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}

					public Long getLastMenderId() {
						return this.lastMenderId;
					}

					public void setLastMenderId(Long lastMenderId) {
						this.lastMenderId = lastMenderId;
					}
				}
			}

			public static class NextFireTimeResult {

				private String cronFireType;

				public String getCronFireType() {
					return this.cronFireType;
				}

				public void setCronFireType(String cronFireType) {
					this.cronFireType = cronFireType;
				}
			}
		}

		public static class PluginParam {

			private String archiveMethod;

			private String dbSchema;

			private Boolean logic;

			private String runMethod;

			private Long sourceDatabaseId;

			private String targetInstanceId;

			private List<IncludeTables> tableIncludes;

			private List<String> orderAfter;

			private List<String> tableMapping;

			private List<String> variables;

			public String getArchiveMethod() {
				return this.archiveMethod;
			}

			public void setArchiveMethod(String archiveMethod) {
				this.archiveMethod = archiveMethod;
			}

			public String getDbSchema() {
				return this.dbSchema;
			}

			public void setDbSchema(String dbSchema) {
				this.dbSchema = dbSchema;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}

			public String getRunMethod() {
				return this.runMethod;
			}

			public void setRunMethod(String runMethod) {
				this.runMethod = runMethod;
			}

			public Long getSourceDatabaseId() {
				return this.sourceDatabaseId;
			}

			public void setSourceDatabaseId(Long sourceDatabaseId) {
				this.sourceDatabaseId = sourceDatabaseId;
			}

			public String getTargetInstanceId() {
				return this.targetInstanceId;
			}

			public void setTargetInstanceId(String targetInstanceId) {
				this.targetInstanceId = targetInstanceId;
			}

			public List<IncludeTables> getTableIncludes() {
				return this.tableIncludes;
			}

			public void setTableIncludes(List<IncludeTables> tableIncludes) {
				this.tableIncludes = tableIncludes;
			}

			public List<String> getOrderAfter() {
				return this.orderAfter;
			}

			public void setOrderAfter(List<String> orderAfter) {
				this.orderAfter = orderAfter;
			}

			public List<String> getTableMapping() {
				return this.tableMapping;
			}

			public void setTableMapping(List<String> tableMapping) {
				this.tableMapping = tableMapping;
			}

			public List<String> getVariables() {
				return this.variables;
			}

			public void setVariables(List<String> variables) {
				this.variables = variables;
			}

			public static class IncludeTables {

				private String tableName;

				private String tableWhere;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getTableWhere() {
					return this.tableWhere;
				}

				public void setTableWhere(String tableWhere) {
					this.tableWhere = tableWhere;
				}
			}
		}
	}

	@Override
	public GetDataArchiveOrderDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDataArchiveOrderDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
