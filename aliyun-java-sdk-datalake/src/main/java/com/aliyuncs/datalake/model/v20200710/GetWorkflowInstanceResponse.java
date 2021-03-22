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
import com.aliyuncs.datalake.transform.v20200710.GetWorkflowInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkflowInstanceResponse extends AcsResponse {

	private String requestId;

	private String success;

	private WorkflowInstanceDetail workflowInstanceDetail;

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

	public WorkflowInstanceDetail getWorkflowInstanceDetail() {
		return this.workflowInstanceDetail;
	}

	public void setWorkflowInstanceDetail(WorkflowInstanceDetail workflowInstanceDetail) {
		this.workflowInstanceDetail = workflowInstanceDetail;
	}

	public static class WorkflowInstanceDetail {

		private String flowInstanceId;

		private String flowNodeSize;

		private String hasFailedNode;

		private List<LogItem> runtimeLogs;

		private FailedNodeInstance failedNodeInstance;

		public String getFlowInstanceId() {
			return this.flowInstanceId;
		}

		public void setFlowInstanceId(String flowInstanceId) {
			this.flowInstanceId = flowInstanceId;
		}

		public String getFlowNodeSize() {
			return this.flowNodeSize;
		}

		public void setFlowNodeSize(String flowNodeSize) {
			this.flowNodeSize = flowNodeSize;
		}

		public String getHasFailedNode() {
			return this.hasFailedNode;
		}

		public void setHasFailedNode(String hasFailedNode) {
			this.hasFailedNode = hasFailedNode;
		}

		public List<LogItem> getRuntimeLogs() {
			return this.runtimeLogs;
		}

		public void setRuntimeLogs(List<LogItem> runtimeLogs) {
			this.runtimeLogs = runtimeLogs;
		}

		public FailedNodeInstance getFailedNodeInstance() {
			return this.failedNodeInstance;
		}

		public void setFailedNodeInstance(FailedNodeInstance failedNodeInstance) {
			this.failedNodeInstance = failedNodeInstance;
		}

		public static class LogItem {

			private String instanceId;

			private String bizTime;

			private String logType;

			private String logId;

			private String logSummary;

			private String logContent;

			private String trigger;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getBizTime() {
				return this.bizTime;
			}

			public void setBizTime(String bizTime) {
				this.bizTime = bizTime;
			}

			public String getLogType() {
				return this.logType;
			}

			public void setLogType(String logType) {
				this.logType = logType;
			}

			public String getLogId() {
				return this.logId;
			}

			public void setLogId(String logId) {
				this.logId = logId;
			}

			public String getLogSummary() {
				return this.logSummary;
			}

			public void setLogSummary(String logSummary) {
				this.logSummary = logSummary;
			}

			public String getLogContent() {
				return this.logContent;
			}

			public void setLogContent(String logContent) {
				this.logContent = logContent;
			}

			public String getTrigger() {
				return this.trigger;
			}

			public void setTrigger(String trigger) {
				this.trigger = trigger;
			}
		}

		public static class FailedNodeInstance {

			private String nodeInstanceId;

			private String jobName;

			private String jobType;

			private String status;

			private String externalId;

			private String externalInfo;

			public String getNodeInstanceId() {
				return this.nodeInstanceId;
			}

			public void setNodeInstanceId(String nodeInstanceId) {
				this.nodeInstanceId = nodeInstanceId;
			}

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}

			public String getJobType() {
				return this.jobType;
			}

			public void setJobType(String jobType) {
				this.jobType = jobType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getExternalId() {
				return this.externalId;
			}

			public void setExternalId(String externalId) {
				this.externalId = externalId;
			}

			public String getExternalInfo() {
				return this.externalInfo;
			}

			public void setExternalInfo(String externalInfo) {
				this.externalInfo = externalInfo;
			}
		}
	}

	@Override
	public GetWorkflowInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetWorkflowInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
