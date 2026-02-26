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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTasksResponse extends AcsResponse {

	private String nextToken;

	private Integer totalCount;

	private String requestId;

	private List<DataItem> data;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String taskId;

		private String invokeId;

		private String regionId;

		private String resourceId;

		private String taskType;

		private String taskStatus;

		private String startTime;

		private String finishTime;

		private String param;

		private String result;

		private String errorCode;

		private String errorMsg;

		private Integer level;

		private Integer failedChildCount;

		private Integer successChildCount;

		private Integer runningChildCount;

		private Integer totalChildCount;

		private String instanceId;

		private String instanceName;

		private String instanceStatus;

		private String operator;

		private String parentTaskId;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getParam() {
			return this.param;
		}

		public void setParam(String param) {
			this.param = param;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public Integer getFailedChildCount() {
			return this.failedChildCount;
		}

		public void setFailedChildCount(Integer failedChildCount) {
			this.failedChildCount = failedChildCount;
		}

		public Integer getSuccessChildCount() {
			return this.successChildCount;
		}

		public void setSuccessChildCount(Integer successChildCount) {
			this.successChildCount = successChildCount;
		}

		public Integer getRunningChildCount() {
			return this.runningChildCount;
		}

		public void setRunningChildCount(Integer runningChildCount) {
			this.runningChildCount = runningChildCount;
		}

		public Integer getTotalChildCount() {
			return this.totalChildCount;
		}

		public void setTotalChildCount(Integer totalChildCount) {
			this.totalChildCount = totalChildCount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getParentTaskId() {
			return this.parentTaskId;
		}

		public void setParentTaskId(String parentTaskId) {
			this.parentTaskId = parentTaskId;
		}
	}

	@Override
	public DescribeTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
