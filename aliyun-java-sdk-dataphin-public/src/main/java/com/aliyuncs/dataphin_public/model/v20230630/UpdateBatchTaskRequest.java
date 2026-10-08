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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateBatchTaskRequest extends RpcAcsRequest<UpdateBatchTaskResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateBatchTaskRequest() {
		super("dataphin-public", "2023-06-30", "UpdateBatchTask", "1111");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public static class UpdateCommand {

		@SerializedName("CronExpression")
		private String cronExpression;

		@SerializedName("Code")
		private String code;

		@SerializedName("ProdHttpPath")
		private String prodHttpPath;

		@SerializedName("OpsOwnerIdList")
		private List<String> opsOwnerIdList;

		@SerializedName("ValidEndDate")
		private String validEndDate;

		@SerializedName("DevResourceGroupId")
		private String devResourceGroupId;

		@SerializedName("ResourceGroupId")
		private String resourceGroupId;

		@SerializedName("CustomScheduleConfig")
		private CustomScheduleConfig customScheduleConfig;

		@SerializedName("TaskTagList")
		private List<String> taskTagList;

		@SerializedName("Engine")
		private String engine;

		@SerializedName("ContextParamList")
		private List<ContextParamListItem> contextParamList;

		@SerializedName("NodeDescription")
		private String nodeDescription;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("PythonModuleList")
		private List<String> pythonModuleList;

		@SerializedName("FileId")
		private Long fileId;

		@SerializedName("NodeOutputNameList")
		private List<String> nodeOutputNameList;

		@SerializedName("TaskType")
		private Integer taskType;

		@SerializedName("SparkClientInfo")
		private SparkClientInfo sparkClientInfo;

		@SerializedName("NodeStatus")
		private Integer nodeStatus;

		@SerializedName("DataSourceSchema")
		private String dataSourceSchema;

		@SerializedName("ParamList")
		private List<ParamListItem> paramList;

		@SerializedName("UpStreamList")
		private List<UpStreamListItem> upStreamList;

		@SerializedName("ConditionScheduleEnable")
		private Boolean conditionScheduleEnable;

		@SerializedName("DataSourceCatalog")
		private String dataSourceCatalog;

		@SerializedName("ConditionScheduleParamList")
		private List<ConditionScheduleParamListItem> conditionScheduleParamList;

		@SerializedName("Priority")
		private Integer priority;

		@SerializedName("ConditionScheduleTemplateId")
		private Long conditionScheduleTemplateId;

		@SerializedName("BaseScheduleTemplateId")
		private Long baseScheduleTemplateId;

		@SerializedName("DevelopOwnerIdList")
		private List<String> developOwnerIdList;

		@SerializedName("Name")
		private String name;

		@SerializedName("ValidStartDate")
		private String validStartDate;

		@SerializedName("DataSourceId")
		private String dataSourceId;

		@SerializedName("SchedulePeriod")
		private String schedulePeriod;

		@SerializedName("DevHttpPath")
		private String devHttpPath;

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getProdHttpPath() {
			return this.prodHttpPath;
		}

		public void setProdHttpPath(String prodHttpPath) {
			this.prodHttpPath = prodHttpPath;
		}

		public List<String> getOpsOwnerIdList() {
			return this.opsOwnerIdList;
		}

		public void setOpsOwnerIdList(List<String> opsOwnerIdList) {
			this.opsOwnerIdList = opsOwnerIdList;
		}

		public String getValidEndDate() {
			return this.validEndDate;
		}

		public void setValidEndDate(String validEndDate) {
			this.validEndDate = validEndDate;
		}

		public String getDevResourceGroupId() {
			return this.devResourceGroupId;
		}

		public void setDevResourceGroupId(String devResourceGroupId) {
			this.devResourceGroupId = devResourceGroupId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public CustomScheduleConfig getCustomScheduleConfig() {
			return this.customScheduleConfig;
		}

		public void setCustomScheduleConfig(CustomScheduleConfig customScheduleConfig) {
			this.customScheduleConfig = customScheduleConfig;
		}

		public List<String> getTaskTagList() {
			return this.taskTagList;
		}

		public void setTaskTagList(List<String> taskTagList) {
			this.taskTagList = taskTagList;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public List<ContextParamListItem> getContextParamList() {
			return this.contextParamList;
		}

		public void setContextParamList(List<ContextParamListItem> contextParamList) {
			this.contextParamList = contextParamList;
		}

		public String getNodeDescription() {
			return this.nodeDescription;
		}

		public void setNodeDescription(String nodeDescription) {
			this.nodeDescription = nodeDescription;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public List<String> getPythonModuleList() {
			return this.pythonModuleList;
		}

		public void setPythonModuleList(List<String> pythonModuleList) {
			this.pythonModuleList = pythonModuleList;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public List<String> getNodeOutputNameList() {
			return this.nodeOutputNameList;
		}

		public void setNodeOutputNameList(List<String> nodeOutputNameList) {
			this.nodeOutputNameList = nodeOutputNameList;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public SparkClientInfo getSparkClientInfo() {
			return this.sparkClientInfo;
		}

		public void setSparkClientInfo(SparkClientInfo sparkClientInfo) {
			this.sparkClientInfo = sparkClientInfo;
		}

		public Integer getNodeStatus() {
			return this.nodeStatus;
		}

		public void setNodeStatus(Integer nodeStatus) {
			this.nodeStatus = nodeStatus;
		}

		public String getDataSourceSchema() {
			return this.dataSourceSchema;
		}

		public void setDataSourceSchema(String dataSourceSchema) {
			this.dataSourceSchema = dataSourceSchema;
		}

		public List<ParamListItem> getParamList() {
			return this.paramList;
		}

		public void setParamList(List<ParamListItem> paramList) {
			this.paramList = paramList;
		}

		public List<UpStreamListItem> getUpStreamList() {
			return this.upStreamList;
		}

		public void setUpStreamList(List<UpStreamListItem> upStreamList) {
			this.upStreamList = upStreamList;
		}

		public Boolean getConditionScheduleEnable() {
			return this.conditionScheduleEnable;
		}

		public void setConditionScheduleEnable(Boolean conditionScheduleEnable) {
			this.conditionScheduleEnable = conditionScheduleEnable;
		}

		public String getDataSourceCatalog() {
			return this.dataSourceCatalog;
		}

		public void setDataSourceCatalog(String dataSourceCatalog) {
			this.dataSourceCatalog = dataSourceCatalog;
		}

		public List<ConditionScheduleParamListItem> getConditionScheduleParamList() {
			return this.conditionScheduleParamList;
		}

		public void setConditionScheduleParamList(List<ConditionScheduleParamListItem> conditionScheduleParamList) {
			this.conditionScheduleParamList = conditionScheduleParamList;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Long getConditionScheduleTemplateId() {
			return this.conditionScheduleTemplateId;
		}

		public void setConditionScheduleTemplateId(Long conditionScheduleTemplateId) {
			this.conditionScheduleTemplateId = conditionScheduleTemplateId;
		}

		public Long getBaseScheduleTemplateId() {
			return this.baseScheduleTemplateId;
		}

		public void setBaseScheduleTemplateId(Long baseScheduleTemplateId) {
			this.baseScheduleTemplateId = baseScheduleTemplateId;
		}

		public List<String> getDevelopOwnerIdList() {
			return this.developOwnerIdList;
		}

		public void setDevelopOwnerIdList(List<String> developOwnerIdList) {
			this.developOwnerIdList = developOwnerIdList;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValidStartDate() {
			return this.validStartDate;
		}

		public void setValidStartDate(String validStartDate) {
			this.validStartDate = validStartDate;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getSchedulePeriod() {
			return this.schedulePeriod;
		}

		public void setSchedulePeriod(String schedulePeriod) {
			this.schedulePeriod = schedulePeriod;
		}

		public String getDevHttpPath() {
			return this.devHttpPath;
		}

		public void setDevHttpPath(String devHttpPath) {
			this.devHttpPath = devHttpPath;
		}

		public static class CustomScheduleConfig {

			@SerializedName("IntervalUnit")
			private String intervalUnit;

			@SerializedName("EndTime")
			private String endTime;

			@SerializedName("SchedulePeriod")
			private String schedulePeriod;

			@SerializedName("Interval")
			private Integer interval;

			@SerializedName("StartTime")
			private String startTime;

			public String getIntervalUnit() {
				return this.intervalUnit;
			}

			public void setIntervalUnit(String intervalUnit) {
				this.intervalUnit = intervalUnit;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getSchedulePeriod() {
				return this.schedulePeriod;
			}

			public void setSchedulePeriod(String schedulePeriod) {
				this.schedulePeriod = schedulePeriod;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}
		}

		public static class ContextParamListItem {

			@SerializedName("ParamKey")
			private String paramKey;

			@SerializedName("DefaultValue")
			private String defaultValue;

			@SerializedName("Desc")
			private String desc;

			public String getParamKey() {
				return this.paramKey;
			}

			public void setParamKey(String paramKey) {
				this.paramKey = paramKey;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}
		}

		public static class SparkClientInfo {

			@SerializedName("SparkClientVersion")
			private String sparkClientVersion;

			public String getSparkClientVersion() {
				return this.sparkClientVersion;
			}

			public void setSparkClientVersion(String sparkClientVersion) {
				this.sparkClientVersion = sparkClientVersion;
			}
		}

		public static class ParamListItem {

			@SerializedName("Value")
			private String value;

			@SerializedName("Key")
			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class UpStreamListItem {

			@SerializedName("SourceNodeOutputName")
			private String sourceNodeOutputName;

			@SerializedName("SourceNodeId")
			private String sourceNodeId;

			@SerializedName("NodeType")
			private String nodeType;

			@SerializedName("SourceTableName")
			private String sourceTableName;

			@SerializedName("PeriodDiff")
			private Integer periodDiff;

			@SerializedName("DependPeriod")
			private DependPeriod dependPeriod;

			@SerializedName("FieldList")
			private List<String> fieldList;

			@SerializedName("SourceNodeEnabled")
			private Boolean sourceNodeEnabled;

			@SerializedName("DependStrategy")
			private String dependStrategy;

			public String getSourceNodeOutputName() {
				return this.sourceNodeOutputName;
			}

			public void setSourceNodeOutputName(String sourceNodeOutputName) {
				this.sourceNodeOutputName = sourceNodeOutputName;
			}

			public String getSourceNodeId() {
				return this.sourceNodeId;
			}

			public void setSourceNodeId(String sourceNodeId) {
				this.sourceNodeId = sourceNodeId;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getSourceTableName() {
				return this.sourceTableName;
			}

			public void setSourceTableName(String sourceTableName) {
				this.sourceTableName = sourceTableName;
			}

			public Integer getPeriodDiff() {
				return this.periodDiff;
			}

			public void setPeriodDiff(Integer periodDiff) {
				this.periodDiff = periodDiff;
			}

			public DependPeriod getDependPeriod() {
				return this.dependPeriod;
			}

			public void setDependPeriod(DependPeriod dependPeriod) {
				this.dependPeriod = dependPeriod;
			}

			public List<String> getFieldList() {
				return this.fieldList;
			}

			public void setFieldList(List<String> fieldList) {
				this.fieldList = fieldList;
			}

			public Boolean getSourceNodeEnabled() {
				return this.sourceNodeEnabled;
			}

			public void setSourceNodeEnabled(Boolean sourceNodeEnabled) {
				this.sourceNodeEnabled = sourceNodeEnabled;
			}

			public String getDependStrategy() {
				return this.dependStrategy;
			}

			public void setDependStrategy(String dependStrategy) {
				this.dependStrategy = dependStrategy;
			}

			public static class DependPeriod {

				@SerializedName("PeriodOffset")
				private Integer periodOffset;

				@SerializedName("PeriodType")
				private String periodType;

				public Integer getPeriodOffset() {
					return this.periodOffset;
				}

				public void setPeriodOffset(Integer periodOffset) {
					this.periodOffset = periodOffset;
				}

				public String getPeriodType() {
					return this.periodType;
				}

				public void setPeriodType(String periodType) {
					this.periodType = periodType;
				}
			}
		}

		public static class ConditionScheduleParamListItem {

			@SerializedName("CronExpression")
			private String cronExpression;

			@SerializedName("Enable")
			private Boolean enable;

			@SerializedName("ScheduleTime")
			private String scheduleTime;

			@SerializedName("NodeStatus")
			private Integer nodeStatus;

			@SerializedName("ConditionName")
			private String conditionName;

			@SerializedName("ScheduleConditionJson")
			private String scheduleConditionJson;

			@SerializedName("FollowScheduleParam")
			private Boolean followScheduleParam;

			public String getCronExpression() {
				return this.cronExpression;
			}

			public void setCronExpression(String cronExpression) {
				this.cronExpression = cronExpression;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public String getScheduleTime() {
				return this.scheduleTime;
			}

			public void setScheduleTime(String scheduleTime) {
				this.scheduleTime = scheduleTime;
			}

			public Integer getNodeStatus() {
				return this.nodeStatus;
			}

			public void setNodeStatus(Integer nodeStatus) {
				this.nodeStatus = nodeStatus;
			}

			public String getConditionName() {
				return this.conditionName;
			}

			public void setConditionName(String conditionName) {
				this.conditionName = conditionName;
			}

			public String getScheduleConditionJson() {
				return this.scheduleConditionJson;
			}

			public void setScheduleConditionJson(String scheduleConditionJson) {
				this.scheduleConditionJson = scheduleConditionJson;
			}

			public Boolean getFollowScheduleParam() {
				return this.followScheduleParam;
			}

			public void setFollowScheduleParam(Boolean followScheduleParam) {
				this.followScheduleParam = followScheduleParam;
			}
		}
	}

	@Override
	public Class<UpdateBatchTaskResponse> getResponseClass() {
		return UpdateBatchTaskResponse.class;
	}

}
