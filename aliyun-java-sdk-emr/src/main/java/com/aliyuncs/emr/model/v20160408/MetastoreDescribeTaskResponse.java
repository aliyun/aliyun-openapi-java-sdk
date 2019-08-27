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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.MetastoreDescribeTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreDescribeTaskResponse extends AcsResponse {

	private String requestId;

	private Task task;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public static class Task {

		private String bizId;

		private String dataSourceId;

		private String taskType;

		private String taskStatus;

		private Long startTime;

		private Long endTime;

		private String taskDetail;

		private String taskObject;

		private String taskResultDetail;

		private Integer taskProcess;

		private String triggerUser;

		private String triggerType;

		private Long gmtCreate;

		private Long gmtModified;

		private Long executeTime;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
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

		public String getTaskDetail() {
			return this.taskDetail;
		}

		public void setTaskDetail(String taskDetail) {
			this.taskDetail = taskDetail;
		}

		public String getTaskObject() {
			return this.taskObject;
		}

		public void setTaskObject(String taskObject) {
			this.taskObject = taskObject;
		}

		public String getTaskResultDetail() {
			return this.taskResultDetail;
		}

		public void setTaskResultDetail(String taskResultDetail) {
			this.taskResultDetail = taskResultDetail;
		}

		public Integer getTaskProcess() {
			return this.taskProcess;
		}

		public void setTaskProcess(Integer taskProcess) {
			this.taskProcess = taskProcess;
		}

		public String getTriggerUser() {
			return this.triggerUser;
		}

		public void setTriggerUser(String triggerUser) {
			this.triggerUser = triggerUser;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getExecuteTime() {
			return this.executeTime;
		}

		public void setExecuteTime(Long executeTime) {
			this.executeTime = executeTime;
		}
	}

	@Override
	public MetastoreDescribeTaskResponse getInstance(UnmarshallerContext context) {
		return	MetastoreDescribeTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
