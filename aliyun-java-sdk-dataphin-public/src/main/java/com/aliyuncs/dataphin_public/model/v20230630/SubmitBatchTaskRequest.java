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
public class SubmitBatchTaskRequest extends RpcAcsRequest<SubmitBatchTaskResponse> {
	   

	private Long opTenantId;

	@SerializedName("submitCommand")
	private SubmitCommand submitCommand;
	public SubmitBatchTaskRequest() {
		super("dataphin-public", "2023-06-30", "SubmitBatchTask");
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

	public SubmitCommand getSubmitCommand() {
		return this.submitCommand;
	}

	public void setSubmitCommand(SubmitCommand submitCommand) {
		this.submitCommand = submitCommand;	
		if (submitCommand != null) {
			putBodyParameter("SubmitCommand" , new Gson().toJson(submitCommand));
		}	
	}

	public static class SubmitCommand {

		@SerializedName("NodeOutputNameList")
		private List<String> nodeOutputNameList;

		@SerializedName("CronExpression")
		private String cronExpression;

		@SerializedName("Code")
		private String code;

		@SerializedName("SparkClientInfo")
		private SparkClientInfo sparkClientInfo;

		@SerializedName("NodeStatus")
		private Integer nodeStatus;

		@SerializedName("ParamList")
		private List<ParamListItem> paramList;

		@SerializedName("UpStreamList")
		private List<UpStreamListItem> upStreamList;

		@SerializedName("Priority")
		private Integer priority;

		@SerializedName("CustomScheduleConfig")
		private CustomScheduleConfig customScheduleConfig;

		@SerializedName("Engine")
		private String engine;

		@SerializedName("NodeDescription")
		private String nodeDescription;

		@SerializedName("Name")
		private String name;

		@SerializedName("SchedulePeriod")
		private String schedulePeriod;

		@SerializedName("Comment")
		private String comment;

		@SerializedName("ProjectId")
		private Long projectId;

		@SerializedName("FileId")
		private Long fileId;

		@SerializedName("PythonModuleList")
		private List<String> pythonModuleList;

		public List<String> getNodeOutputNameList() {
			return this.nodeOutputNameList;
		}

		public void setNodeOutputNameList(List<String> nodeOutputNameList) {
			this.nodeOutputNameList = nodeOutputNameList;
		}

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

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public CustomScheduleConfig getCustomScheduleConfig() {
			return this.customScheduleConfig;
		}

		public void setCustomScheduleConfig(CustomScheduleConfig customScheduleConfig) {
			this.customScheduleConfig = customScheduleConfig;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getNodeDescription() {
			return this.nodeDescription;
		}

		public void setNodeDescription(String nodeDescription) {
			this.nodeDescription = nodeDescription;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSchedulePeriod() {
			return this.schedulePeriod;
		}

		public void setSchedulePeriod(String schedulePeriod) {
			this.schedulePeriod = schedulePeriod;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public List<String> getPythonModuleList() {
			return this.pythonModuleList;
		}

		public void setPythonModuleList(List<String> pythonModuleList) {
			this.pythonModuleList = pythonModuleList;
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

		public static class CustomScheduleConfig {

			@SerializedName("IntervalUnit")
			private String intervalUnit;

			@SerializedName("SchedulePeriod")
			private String schedulePeriod;

			@SerializedName("EndTime")
			private String endTime;

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

			public String getSchedulePeriod() {
				return this.schedulePeriod;
			}

			public void setSchedulePeriod(String schedulePeriod) {
				this.schedulePeriod = schedulePeriod;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
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
	}

	@Override
	public Class<SubmitBatchTaskResponse> getResponseClass() {
		return SubmitBatchTaskResponse.class;
	}

}
