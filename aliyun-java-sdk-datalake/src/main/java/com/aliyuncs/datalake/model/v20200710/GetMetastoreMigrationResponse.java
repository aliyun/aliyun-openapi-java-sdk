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
import com.aliyuncs.datalake.transform.v20200710.GetMetastoreMigrationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetastoreMigrationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String instanceId;

		private String name;

		private String desc;

		private String metastoreType;

		private String metastoreInfo;

		private String runOptions;

		private String roleName;

		private String status;

		private String gmtCreate;

		private String gmtModified;

		private WorkflowLastRunInstance workflowLastRunInstance;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getMetastoreType() {
			return this.metastoreType;
		}

		public void setMetastoreType(String metastoreType) {
			this.metastoreType = metastoreType;
		}

		public String getMetastoreInfo() {
			return this.metastoreInfo;
		}

		public void setMetastoreInfo(String metastoreInfo) {
			this.metastoreInfo = metastoreInfo;
		}

		public String getRunOptions() {
			return this.runOptions;
		}

		public void setRunOptions(String runOptions) {
			this.runOptions = runOptions;
		}

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public WorkflowLastRunInstance getWorkflowLastRunInstance() {
			return this.workflowLastRunInstance;
		}

		public void setWorkflowLastRunInstance(WorkflowLastRunInstance workflowLastRunInstance) {
			this.workflowLastRunInstance = workflowLastRunInstance;
		}

		public static class WorkflowLastRunInstance {

			private String flowInstanceId;

			private String flowId;

			private String flowName;

			private Long duration;

			private Long startTime;

			private Long endTime;

			private String status;

			private String projectId;

			private String clusterId;

			private String failureInfo;

			private String flowExtendResult;

			private Float totalCuUsage;

			private String opsUrl;

			private Integer offsetTime;

			private Integer batchProgress;

			private String executeMode;

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

			public String getFlowName() {
				return this.flowName;
			}

			public void setFlowName(String flowName) {
				this.flowName = flowName;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

			public Float getTotalCuUsage() {
				return this.totalCuUsage;
			}

			public void setTotalCuUsage(Float totalCuUsage) {
				this.totalCuUsage = totalCuUsage;
			}

			public String getOpsUrl() {
				return this.opsUrl;
			}

			public void setOpsUrl(String opsUrl) {
				this.opsUrl = opsUrl;
			}

			public Integer getOffsetTime() {
				return this.offsetTime;
			}

			public void setOffsetTime(Integer offsetTime) {
				this.offsetTime = offsetTime;
			}

			public Integer getBatchProgress() {
				return this.batchProgress;
			}

			public void setBatchProgress(Integer batchProgress) {
				this.batchProgress = batchProgress;
			}

			public String getExecuteMode() {
				return this.executeMode;
			}

			public void setExecuteMode(String executeMode) {
				this.executeMode = executeMode;
			}
		}
	}

	@Override
	public GetMetastoreMigrationResponse getInstance(UnmarshallerContext context) {
		return	GetMetastoreMigrationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
