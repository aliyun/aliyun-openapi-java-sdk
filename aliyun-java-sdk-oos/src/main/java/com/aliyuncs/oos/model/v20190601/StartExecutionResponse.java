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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.StartExecutionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartExecutionResponse extends AcsResponse {

	private String requestId;

	private Execution execution;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Execution getExecution() {
		return this.execution;
	}

	public void setExecution(Execution execution) {
		this.execution = execution;
	}

	public static class Execution {

		private String executionId;

		private String templateName;

		private String templateId;

		private String templateVersion;

		private String mode;

		private String loopMode;

		private String executedBy;

		private String startDate;

		private String endDate;

		private String createDate;

		private String updateDate;

		private String status;

		private String statusMessage;

		private String parentExecutionId;

		private String parameters;

		private String outputs;

		private String safetyCheck;

		private Boolean isParent;

		private String counters;

		private String ramRole;

		private Map<Object,Object> tags;

		private String description;

		private List<CurrentTask> currentTasks;

		public String getExecutionId() {
			return this.executionId;
		}

		public void setExecutionId(String executionId) {
			this.executionId = executionId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateVersion() {
			return this.templateVersion;
		}

		public void setTemplateVersion(String templateVersion) {
			this.templateVersion = templateVersion;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getLoopMode() {
			return this.loopMode;
		}

		public void setLoopMode(String loopMode) {
			this.loopMode = loopMode;
		}

		public String getExecutedBy() {
			return this.executedBy;
		}

		public void setExecutedBy(String executedBy) {
			this.executedBy = executedBy;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public String getParentExecutionId() {
			return this.parentExecutionId;
		}

		public void setParentExecutionId(String parentExecutionId) {
			this.parentExecutionId = parentExecutionId;
		}

		public String getParameters() {
			return this.parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}

		public String getOutputs() {
			return this.outputs;
		}

		public void setOutputs(String outputs) {
			this.outputs = outputs;
		}

		public String getSafetyCheck() {
			return this.safetyCheck;
		}

		public void setSafetyCheck(String safetyCheck) {
			this.safetyCheck = safetyCheck;
		}

		public Boolean getIsParent() {
			return this.isParent;
		}

		public void setIsParent(Boolean isParent) {
			this.isParent = isParent;
		}

		public String getCounters() {
			return this.counters;
		}

		public void setCounters(String counters) {
			this.counters = counters;
		}

		public String getRamRole() {
			return this.ramRole;
		}

		public void setRamRole(String ramRole) {
			this.ramRole = ramRole;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<CurrentTask> getCurrentTasks() {
			return this.currentTasks;
		}

		public void setCurrentTasks(List<CurrentTask> currentTasks) {
			this.currentTasks = currentTasks;
		}

		public static class CurrentTask {

			private String taskExecutionId;

			private String taskName;

			private String taskAction;

			public String getTaskExecutionId() {
				return this.taskExecutionId;
			}

			public void setTaskExecutionId(String taskExecutionId) {
				this.taskExecutionId = taskExecutionId;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getTaskAction() {
				return this.taskAction;
			}

			public void setTaskAction(String taskAction) {
				this.taskAction = taskAction;
			}
		}
	}

	@Override
	public StartExecutionResponse getInstance(UnmarshallerContext context) {
		return	StartExecutionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
