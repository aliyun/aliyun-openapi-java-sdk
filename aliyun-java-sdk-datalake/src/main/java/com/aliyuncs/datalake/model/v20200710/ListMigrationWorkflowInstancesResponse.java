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
import com.aliyuncs.datalake.transform.v20200710.ListMigrationWorkflowInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMigrationWorkflowInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<MigrationWorkflowInstances> data;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<MigrationWorkflowInstances> getData() {
		return this.data;
	}

	public void setData(List<MigrationWorkflowInstances> data) {
		this.data = data;
	}

	public static class MigrationWorkflowInstances {

		private String instanceId;

		private String name;

		private String metastoreType;

		private String flowInstanceId;

		private String flowId;

		private String flowName;

		private Long startTime;

		private Long endTime;

		private Long duration;

		private String status;

		private Integer batchProgress;

		private String failureInfo;

		private String projectId;

		private String flowExtendResult;

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

		public String getMetastoreType() {
			return this.metastoreType;
		}

		public void setMetastoreType(String metastoreType) {
			this.metastoreType = metastoreType;
		}

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

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getBatchProgress() {
			return this.batchProgress;
		}

		public void setBatchProgress(Integer batchProgress) {
			this.batchProgress = batchProgress;
		}

		public String getFailureInfo() {
			return this.failureInfo;
		}

		public void setFailureInfo(String failureInfo) {
			this.failureInfo = failureInfo;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getFlowExtendResult() {
			return this.flowExtendResult;
		}

		public void setFlowExtendResult(String flowExtendResult) {
			this.flowExtendResult = flowExtendResult;
		}
	}

	@Override
	public ListMigrationWorkflowInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListMigrationWorkflowInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
