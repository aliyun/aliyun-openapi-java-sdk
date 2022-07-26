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
import com.aliyuncs.oos.transform.v20190601.ListTaskExecutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTaskExecutionsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<TaskExecution> taskExecutions;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<TaskExecution> getTaskExecutions() {
		return this.taskExecutions;
	}

	public void setTaskExecutions(List<TaskExecution> taskExecutions) {
		this.taskExecutions = taskExecutions;
	}

	public static class TaskExecution {

		private String childExecutionId;

		private String outputs;

		private String status;

		private String endDate;

		private String parentTaskExecutionId;

		private String taskName;

		private String startDate;

		private String loopItem;

		private String createDate;

		private String executionId;

		private String taskAction;

		private String taskExecutionId;

		private String updateDate;

		private Map<Object,Object> loop;

		private String templateId;

		private Integer loopBatchNumber;

		private String statusMessage;

		private Map<Object,Object> extraData;

		private String properties;

		public String getChildExecutionId() {
			return this.childExecutionId;
		}

		public void setChildExecutionId(String childExecutionId) {
			this.childExecutionId = childExecutionId;
		}

		public String getOutputs() {
			return this.outputs;
		}

		public void setOutputs(String outputs) {
			this.outputs = outputs;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getParentTaskExecutionId() {
			return this.parentTaskExecutionId;
		}

		public void setParentTaskExecutionId(String parentTaskExecutionId) {
			this.parentTaskExecutionId = parentTaskExecutionId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getLoopItem() {
			return this.loopItem;
		}

		public void setLoopItem(String loopItem) {
			this.loopItem = loopItem;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getExecutionId() {
			return this.executionId;
		}

		public void setExecutionId(String executionId) {
			this.executionId = executionId;
		}

		public String getTaskAction() {
			return this.taskAction;
		}

		public void setTaskAction(String taskAction) {
			this.taskAction = taskAction;
		}

		public String getTaskExecutionId() {
			return this.taskExecutionId;
		}

		public void setTaskExecutionId(String taskExecutionId) {
			this.taskExecutionId = taskExecutionId;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public Map<Object,Object> getLoop() {
			return this.loop;
		}

		public void setLoop(Map<Object,Object> loop) {
			this.loop = loop;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public Integer getLoopBatchNumber() {
			return this.loopBatchNumber;
		}

		public void setLoopBatchNumber(Integer loopBatchNumber) {
			this.loopBatchNumber = loopBatchNumber;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public Map<Object,Object> getExtraData() {
			return this.extraData;
		}

		public void setExtraData(Map<Object,Object> extraData) {
			this.extraData = extraData;
		}

		public String getProperties() {
			return this.properties;
		}

		public void setProperties(String properties) {
			this.properties = properties;
		}
	}

	@Override
	public ListTaskExecutionsResponse getInstance(UnmarshallerContext context) {
		return	ListTaskExecutionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
