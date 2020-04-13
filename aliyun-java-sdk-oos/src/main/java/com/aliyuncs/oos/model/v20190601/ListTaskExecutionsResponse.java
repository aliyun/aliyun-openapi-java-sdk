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

	private String requestId;

	private Integer maxResults;

	private String nextToken;

	private List<TaskExecution> taskExecutions;

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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<TaskExecution> getTaskExecutions() {
		return this.taskExecutions;
	}

	public void setTaskExecutions(List<TaskExecution> taskExecutions) {
		this.taskExecutions = taskExecutions;
	}

	public static class TaskExecution {

		private String executionId;

		private String taskExecutionId;

		private String templateId;

		private String startDate;

		private String endDate;

		private String createDate;

		private String updateDate;

		private String status;

		private String properties;

		private String outputs;

		private String taskAction;

		private String taskName;

		private String statusMessage;

		private String childExecutionId;

		private String parentTaskExecutionId;

		private String loopItem;

		private Map<Object,Object> loop;

		private Map<Object,Object> extraData;

		private Integer loopBatchNumber;

		public String getExecutionId() {
			return this.executionId;
		}

		public void setExecutionId(String executionId) {
			this.executionId = executionId;
		}

		public String getTaskExecutionId() {
			return this.taskExecutionId;
		}

		public void setTaskExecutionId(String taskExecutionId) {
			this.taskExecutionId = taskExecutionId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
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

		public String getProperties() {
			return this.properties;
		}

		public void setProperties(String properties) {
			this.properties = properties;
		}

		public String getOutputs() {
			return this.outputs;
		}

		public void setOutputs(String outputs) {
			this.outputs = outputs;
		}

		public String getTaskAction() {
			return this.taskAction;
		}

		public void setTaskAction(String taskAction) {
			this.taskAction = taskAction;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public String getChildExecutionId() {
			return this.childExecutionId;
		}

		public void setChildExecutionId(String childExecutionId) {
			this.childExecutionId = childExecutionId;
		}

		public String getParentTaskExecutionId() {
			return this.parentTaskExecutionId;
		}

		public void setParentTaskExecutionId(String parentTaskExecutionId) {
			this.parentTaskExecutionId = parentTaskExecutionId;
		}

		public String getLoopItem() {
			return this.loopItem;
		}

		public void setLoopItem(String loopItem) {
			this.loopItem = loopItem;
		}

		public Map<Object,Object> getLoop() {
			return this.loop;
		}

		public void setLoop(Map<Object,Object> loop) {
			this.loop = loop;
		}

		public Map<Object,Object> getExtraData() {
			return this.extraData;
		}

		public void setExtraData(Map<Object,Object> extraData) {
			this.extraData = extraData;
		}

		public Integer getLoopBatchNumber() {
			return this.loopBatchNumber;
		}

		public void setLoopBatchNumber(Integer loopBatchNumber) {
			this.loopBatchNumber = loopBatchNumber;
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
