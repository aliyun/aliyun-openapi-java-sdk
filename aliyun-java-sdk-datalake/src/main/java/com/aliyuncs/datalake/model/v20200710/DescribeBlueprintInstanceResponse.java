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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.DescribeBlueprintInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBlueprintInstanceResponse extends AcsResponse {

	private String requestId;

	private String success;

	private BlueprintInstance blueprintInstance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public BlueprintInstance getBlueprintInstance() {
		return this.blueprintInstance;
	}

	public void setBlueprintInstance(BlueprintInstance blueprintInstance) {
		this.blueprintInstance = blueprintInstance;
	}

	public static class BlueprintInstance {

		private String blueprintInstanceId;

		private String name;

		private String regionId;

		private String blueprintType;

		private String sourceDataSourceId;

		private String sourceInclude;

		private String sourceSchema;

		private String sourcePrimaryColumn;

		private String sourceChannelId;

		private String sourceChannelName;

		private String sourceChannelType;

		private String targetDatabase;

		private String targetLocationUri;

		private String targetFormat;

		private String targetTablePrefix;

		private String executeType;

		private String executeParameters;

		private Long executeCapacity;

		private Long roleName;

		private String emrFlowId;

		private String emrFlowProjectId;

		private String creator;

		private String owner;

		private String emrFlowScheduleStatus;

		private String gmtModified;

		private String gmtCreate;

		private Integer status;

		private String sourceLocationUri;

		private String sourceFormat;

		private String reason;

		private String sourceDataSourceName;

		private String preProcessingConfig;

		private String dataSourceConfig;

		private LastRunFlowInstance lastRunFlowInstance;

		public String getBlueprintInstanceId() {
			return this.blueprintInstanceId;
		}

		public void setBlueprintInstanceId(String blueprintInstanceId) {
			this.blueprintInstanceId = blueprintInstanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getBlueprintType() {
			return this.blueprintType;
		}

		public void setBlueprintType(String blueprintType) {
			this.blueprintType = blueprintType;
		}

		public String getSourceDataSourceId() {
			return this.sourceDataSourceId;
		}

		public void setSourceDataSourceId(String sourceDataSourceId) {
			this.sourceDataSourceId = sourceDataSourceId;
		}

		public String getSourceInclude() {
			return this.sourceInclude;
		}

		public void setSourceInclude(String sourceInclude) {
			this.sourceInclude = sourceInclude;
		}

		public String getSourceSchema() {
			return this.sourceSchema;
		}

		public void setSourceSchema(String sourceSchema) {
			this.sourceSchema = sourceSchema;
		}

		public String getSourcePrimaryColumn() {
			return this.sourcePrimaryColumn;
		}

		public void setSourcePrimaryColumn(String sourcePrimaryColumn) {
			this.sourcePrimaryColumn = sourcePrimaryColumn;
		}

		public String getSourceChannelId() {
			return this.sourceChannelId;
		}

		public void setSourceChannelId(String sourceChannelId) {
			this.sourceChannelId = sourceChannelId;
		}

		public String getSourceChannelName() {
			return this.sourceChannelName;
		}

		public void setSourceChannelName(String sourceChannelName) {
			this.sourceChannelName = sourceChannelName;
		}

		public String getSourceChannelType() {
			return this.sourceChannelType;
		}

		public void setSourceChannelType(String sourceChannelType) {
			this.sourceChannelType = sourceChannelType;
		}

		public String getTargetDatabase() {
			return this.targetDatabase;
		}

		public void setTargetDatabase(String targetDatabase) {
			this.targetDatabase = targetDatabase;
		}

		public String getTargetLocationUri() {
			return this.targetLocationUri;
		}

		public void setTargetLocationUri(String targetLocationUri) {
			this.targetLocationUri = targetLocationUri;
		}

		public String getTargetFormat() {
			return this.targetFormat;
		}

		public void setTargetFormat(String targetFormat) {
			this.targetFormat = targetFormat;
		}

		public String getTargetTablePrefix() {
			return this.targetTablePrefix;
		}

		public void setTargetTablePrefix(String targetTablePrefix) {
			this.targetTablePrefix = targetTablePrefix;
		}

		public String getExecuteType() {
			return this.executeType;
		}

		public void setExecuteType(String executeType) {
			this.executeType = executeType;
		}

		public String getExecuteParameters() {
			return this.executeParameters;
		}

		public void setExecuteParameters(String executeParameters) {
			this.executeParameters = executeParameters;
		}

		public Long getExecuteCapacity() {
			return this.executeCapacity;
		}

		public void setExecuteCapacity(Long executeCapacity) {
			this.executeCapacity = executeCapacity;
		}

		public Long getRoleName() {
			return this.roleName;
		}

		public void setRoleName(Long roleName) {
			this.roleName = roleName;
		}

		public String getEmrFlowId() {
			return this.emrFlowId;
		}

		public void setEmrFlowId(String emrFlowId) {
			this.emrFlowId = emrFlowId;
		}

		public String getEmrFlowProjectId() {
			return this.emrFlowProjectId;
		}

		public void setEmrFlowProjectId(String emrFlowProjectId) {
			this.emrFlowProjectId = emrFlowProjectId;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getEmrFlowScheduleStatus() {
			return this.emrFlowScheduleStatus;
		}

		public void setEmrFlowScheduleStatus(String emrFlowScheduleStatus) {
			this.emrFlowScheduleStatus = emrFlowScheduleStatus;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getSourceLocationUri() {
			return this.sourceLocationUri;
		}

		public void setSourceLocationUri(String sourceLocationUri) {
			this.sourceLocationUri = sourceLocationUri;
		}

		public String getSourceFormat() {
			return this.sourceFormat;
		}

		public void setSourceFormat(String sourceFormat) {
			this.sourceFormat = sourceFormat;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getSourceDataSourceName() {
			return this.sourceDataSourceName;
		}

		public void setSourceDataSourceName(String sourceDataSourceName) {
			this.sourceDataSourceName = sourceDataSourceName;
		}

		public String getPreProcessingConfig() {
			return this.preProcessingConfig;
		}

		public void setPreProcessingConfig(String preProcessingConfig) {
			this.preProcessingConfig = preProcessingConfig;
		}

		public String getDataSourceConfig() {
			return this.dataSourceConfig;
		}

		public void setDataSourceConfig(String dataSourceConfig) {
			this.dataSourceConfig = dataSourceConfig;
		}

		public LastRunFlowInstance getLastRunFlowInstance() {
			return this.lastRunFlowInstance;
		}

		public void setLastRunFlowInstance(LastRunFlowInstance lastRunFlowInstance) {
			this.lastRunFlowInstance = lastRunFlowInstance;
		}

		public static class LastRunFlowInstance {

			private String flowInstanceId;

			private String flowId;

			private Long duration;

			private String startTime;

			private String endTime;

			private String status;

			private String flowName;

			private String projectId;

			private String clusterId;

			private String reason;

			public String getFlowInstanceId() {
				return this.flowInstanceId;
			}

			public void setFlowInstanceId(String flowInstanceId) {
				this.flowInstanceId = flowInstanceId;
			}

			public String getFlowId() {
				return this.flowId;
			}

			public void setFlowId(String flowId) {
				this.flowId = flowId;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getFlowName() {
				return this.flowName;
			}

			public void setFlowName(String flowName) {
				this.flowName = flowName;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}
		}
	}

	@Override
	public DescribeBlueprintInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeBlueprintInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
