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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetBatchTaskInfoByVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBatchTaskInfoByVersionResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private TaskInfo taskInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public TaskInfo getTaskInfo() {
		return this.taskInfo;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	public static class TaskInfo {

		private Integer scheduleType;

		private String ownerName;

		private String nodeName;

		private String dataSourceSchema;

		private String dagId;

		private String name;

		private String remark;

		private String nodeDescription;

		private String schedulePeriod;

		private Integer taskType;

		private Boolean rerunable;

		private String cronExpression;

		private Boolean paused;

		private String status;

		private Integer priority;

		private String nodeFrom;

		private Long projectId;

		private String operatorUserId;

		private String code;

		private String dataSourceCatalog;

		private String ownerUserId;

		private Boolean needPublish;

		private String nodeId;

		private Boolean published;

		private Long fileId;

		private Integer nodeStatus;

		private String dataSourceId;

		private Boolean hasDevNode;

		private List<Param> paramList;

		private List<NodeRelation> upStreamList;

		private List<String> opsOwnerNameList;

		private List<String> nodeOutputNameList;

		private List<String> developOwnerNameList;

		private List<String> developOwnerIdList;

		private List<String> opsOwnerIdList;

		private CustomScheduleConfig customScheduleConfig;

		private SparkClientInfo sparkClientInfo;

		public Integer getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(Integer scheduleType) {
			this.scheduleType = scheduleType;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getDataSourceSchema() {
			return this.dataSourceSchema;
		}

		public void setDataSourceSchema(String dataSourceSchema) {
			this.dataSourceSchema = dataSourceSchema;
		}

		public String getDagId() {
			return this.dagId;
		}

		public void setDagId(String dagId) {
			this.dagId = dagId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getNodeDescription() {
			return this.nodeDescription;
		}

		public void setNodeDescription(String nodeDescription) {
			this.nodeDescription = nodeDescription;
		}

		public String getSchedulePeriod() {
			return this.schedulePeriod;
		}

		public void setSchedulePeriod(String schedulePeriod) {
			this.schedulePeriod = schedulePeriod;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public Boolean getRerunable() {
			return this.rerunable;
		}

		public void setRerunable(Boolean rerunable) {
			this.rerunable = rerunable;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public Boolean getPaused() {
			return this.paused;
		}

		public void setPaused(Boolean paused) {
			this.paused = paused;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getNodeFrom() {
			return this.nodeFrom;
		}

		public void setNodeFrom(String nodeFrom) {
			this.nodeFrom = nodeFrom;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getOperatorUserId() {
			return this.operatorUserId;
		}

		public void setOperatorUserId(String operatorUserId) {
			this.operatorUserId = operatorUserId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDataSourceCatalog() {
			return this.dataSourceCatalog;
		}

		public void setDataSourceCatalog(String dataSourceCatalog) {
			this.dataSourceCatalog = dataSourceCatalog;
		}

		public String getOwnerUserId() {
			return this.ownerUserId;
		}

		public void setOwnerUserId(String ownerUserId) {
			this.ownerUserId = ownerUserId;
		}

		public Boolean getNeedPublish() {
			return this.needPublish;
		}

		public void setNeedPublish(Boolean needPublish) {
			this.needPublish = needPublish;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Boolean getPublished() {
			return this.published;
		}

		public void setPublished(Boolean published) {
			this.published = published;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public Integer getNodeStatus() {
			return this.nodeStatus;
		}

		public void setNodeStatus(Integer nodeStatus) {
			this.nodeStatus = nodeStatus;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public Boolean getHasDevNode() {
			return this.hasDevNode;
		}

		public void setHasDevNode(Boolean hasDevNode) {
			this.hasDevNode = hasDevNode;
		}

		public List<Param> getParamList() {
			return this.paramList;
		}

		public void setParamList(List<Param> paramList) {
			this.paramList = paramList;
		}

		public List<NodeRelation> getUpStreamList() {
			return this.upStreamList;
		}

		public void setUpStreamList(List<NodeRelation> upStreamList) {
			this.upStreamList = upStreamList;
		}

		public List<String> getOpsOwnerNameList() {
			return this.opsOwnerNameList;
		}

		public void setOpsOwnerNameList(List<String> opsOwnerNameList) {
			this.opsOwnerNameList = opsOwnerNameList;
		}

		public List<String> getNodeOutputNameList() {
			return this.nodeOutputNameList;
		}

		public void setNodeOutputNameList(List<String> nodeOutputNameList) {
			this.nodeOutputNameList = nodeOutputNameList;
		}

		public List<String> getDevelopOwnerNameList() {
			return this.developOwnerNameList;
		}

		public void setDevelopOwnerNameList(List<String> developOwnerNameList) {
			this.developOwnerNameList = developOwnerNameList;
		}

		public List<String> getDevelopOwnerIdList() {
			return this.developOwnerIdList;
		}

		public void setDevelopOwnerIdList(List<String> developOwnerIdList) {
			this.developOwnerIdList = developOwnerIdList;
		}

		public List<String> getOpsOwnerIdList() {
			return this.opsOwnerIdList;
		}

		public void setOpsOwnerIdList(List<String> opsOwnerIdList) {
			this.opsOwnerIdList = opsOwnerIdList;
		}

		public CustomScheduleConfig getCustomScheduleConfig() {
			return this.customScheduleConfig;
		}

		public void setCustomScheduleConfig(CustomScheduleConfig customScheduleConfig) {
			this.customScheduleConfig = customScheduleConfig;
		}

		public SparkClientInfo getSparkClientInfo() {
			return this.sparkClientInfo;
		}

		public void setSparkClientInfo(SparkClientInfo sparkClientInfo) {
			this.sparkClientInfo = sparkClientInfo;
		}

		public static class Param {

			private String value;

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

		public static class NodeRelation {

			private String sourceTableName;

			private String sourceNodeId;

			private Integer periodDiff;

			private String nodeType;

			private String sourceNodeName;

			private String sourceNodeUserName;

			private Boolean sourceNodeEnabled;

			private String sourceNodeOutputName;

			private String dependStrategy;

			private List<String> fieldList;

			private DependPeriod dependPeriod;

			public String getSourceTableName() {
				return this.sourceTableName;
			}

			public void setSourceTableName(String sourceTableName) {
				this.sourceTableName = sourceTableName;
			}

			public String getSourceNodeId() {
				return this.sourceNodeId;
			}

			public void setSourceNodeId(String sourceNodeId) {
				this.sourceNodeId = sourceNodeId;
			}

			public Integer getPeriodDiff() {
				return this.periodDiff;
			}

			public void setPeriodDiff(Integer periodDiff) {
				this.periodDiff = periodDiff;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getSourceNodeName() {
				return this.sourceNodeName;
			}

			public void setSourceNodeName(String sourceNodeName) {
				this.sourceNodeName = sourceNodeName;
			}

			public String getSourceNodeUserName() {
				return this.sourceNodeUserName;
			}

			public void setSourceNodeUserName(String sourceNodeUserName) {
				this.sourceNodeUserName = sourceNodeUserName;
			}

			public Boolean getSourceNodeEnabled() {
				return this.sourceNodeEnabled;
			}

			public void setSourceNodeEnabled(Boolean sourceNodeEnabled) {
				this.sourceNodeEnabled = sourceNodeEnabled;
			}

			public String getSourceNodeOutputName() {
				return this.sourceNodeOutputName;
			}

			public void setSourceNodeOutputName(String sourceNodeOutputName) {
				this.sourceNodeOutputName = sourceNodeOutputName;
			}

			public String getDependStrategy() {
				return this.dependStrategy;
			}

			public void setDependStrategy(String dependStrategy) {
				this.dependStrategy = dependStrategy;
			}

			public List<String> getFieldList() {
				return this.fieldList;
			}

			public void setFieldList(List<String> fieldList) {
				this.fieldList = fieldList;
			}

			public DependPeriod getDependPeriod() {
				return this.dependPeriod;
			}

			public void setDependPeriod(DependPeriod dependPeriod) {
				this.dependPeriod = dependPeriod;
			}

			public static class DependPeriod {

				private String periodType;

				private Integer periodOffset;

				public String getPeriodType() {
					return this.periodType;
				}

				public void setPeriodType(String periodType) {
					this.periodType = periodType;
				}

				public Integer getPeriodOffset() {
					return this.periodOffset;
				}

				public void setPeriodOffset(Integer periodOffset) {
					this.periodOffset = periodOffset;
				}
			}
		}

		public static class CustomScheduleConfig {

			private String intervalUnit;

			private String endTime;

			private String schedulePeriod;

			private String startTime;

			private Integer interval;

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

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}
		}

		public static class SparkClientInfo {

			private String sparkClientVersion;

			public String getSparkClientVersion() {
				return this.sparkClientVersion;
			}

			public void setSparkClientVersion(String sparkClientVersion) {
				this.sparkClientVersion = sparkClientVersion;
			}
		}
	}

	@Override
	public GetBatchTaskInfoByVersionResponse getInstance(UnmarshallerContext context) {
		return	GetBatchTaskInfoByVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
