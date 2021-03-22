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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.ListMetastoreCrawlerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMetastoreCrawlerResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Boolean success;

	private List<MetastoreCrawlerList> data;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<MetastoreCrawlerList> getData() {
		return this.data;
	}

	public void setData(List<MetastoreCrawlerList> data) {
		this.data = data;
	}

	public static class MetastoreCrawlerList {

		private String owner;

		private String targetDatabase;

		private String targetUpdateStrategy;

		private String executeType;

		private String gmtModified;

		private String datasourceType;

		private String creator;

		private String fileFormat;

		private String targetTablePrefix;

		private Boolean success;

		private String name;

		private String roleName;

		private String gmtCreate;

		private String fileFormatConfig;

		private String datasourceExcludePath;

		private String regionId;

		private String id;

		private String datasourcePath;

		private String status;

		private String creatorLoginName;

		private String executeMode;

		private WorkflowLastRunInstance workflowLastRunInstance;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getTargetDatabase() {
			return this.targetDatabase;
		}

		public void setTargetDatabase(String targetDatabase) {
			this.targetDatabase = targetDatabase;
		}

		public String getTargetUpdateStrategy() {
			return this.targetUpdateStrategy;
		}

		public void setTargetUpdateStrategy(String targetUpdateStrategy) {
			this.targetUpdateStrategy = targetUpdateStrategy;
		}

		public String getExecuteType() {
			return this.executeType;
		}

		public void setExecuteType(String executeType) {
			this.executeType = executeType;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDatasourceType() {
			return this.datasourceType;
		}

		public void setDatasourceType(String datasourceType) {
			this.datasourceType = datasourceType;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getFileFormat() {
			return this.fileFormat;
		}

		public void setFileFormat(String fileFormat) {
			this.fileFormat = fileFormat;
		}

		public String getTargetTablePrefix() {
			return this.targetTablePrefix;
		}

		public void setTargetTablePrefix(String targetTablePrefix) {
			this.targetTablePrefix = targetTablePrefix;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getFileFormatConfig() {
			return this.fileFormatConfig;
		}

		public void setFileFormatConfig(String fileFormatConfig) {
			this.fileFormatConfig = fileFormatConfig;
		}

		public String getDatasourceExcludePath() {
			return this.datasourceExcludePath;
		}

		public void setDatasourceExcludePath(String datasourceExcludePath) {
			this.datasourceExcludePath = datasourceExcludePath;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDatasourcePath() {
			return this.datasourcePath;
		}

		public void setDatasourcePath(String datasourcePath) {
			this.datasourcePath = datasourcePath;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatorLoginName() {
			return this.creatorLoginName;
		}

		public void setCreatorLoginName(String creatorLoginName) {
			this.creatorLoginName = creatorLoginName;
		}

		public String getExecuteMode() {
			return this.executeMode;
		}

		public void setExecuteMode(String executeMode) {
			this.executeMode = executeMode;
		}

		public WorkflowLastRunInstance getWorkflowLastRunInstance() {
			return this.workflowLastRunInstance;
		}

		public void setWorkflowLastRunInstance(WorkflowLastRunInstance workflowLastRunInstance) {
			this.workflowLastRunInstance = workflowLastRunInstance;
		}

		public static class WorkflowLastRunInstance {

			private String flowId;

			private String status;

			private Long endTime;

			private String clusterId;

			private String flowName;

			private Long startTime;

			private String projectId;

			private String flowInstanceId;

			private Integer duration;

			private String failureInfo;

			private String flowExtendResult;

			private Integer batchProgress;

			public String getFlowId() {
				return this.flowId;
			}

			public void setFlowId(String flowId) {
				this.flowId = flowId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getFlowName() {
				return this.flowName;
			}

			public void setFlowName(String flowName) {
				this.flowName = flowName;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getFlowInstanceId() {
				return this.flowInstanceId;
			}

			public void setFlowInstanceId(String flowInstanceId) {
				this.flowInstanceId = flowInstanceId;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public String getFailureInfo() {
				return this.failureInfo;
			}

			public void setFailureInfo(String failureInfo) {
				this.failureInfo = failureInfo;
			}

			public String getFlowExtendResult() {
				return this.flowExtendResult;
			}

			public void setFlowExtendResult(String flowExtendResult) {
				this.flowExtendResult = flowExtendResult;
			}

			public Integer getBatchProgress() {
				return this.batchProgress;
			}

			public void setBatchProgress(Integer batchProgress) {
				this.batchProgress = batchProgress;
			}
		}
	}

	@Override
	public ListMetastoreCrawlerResponse getInstance(UnmarshallerContext context) {
		return	ListMetastoreCrawlerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
