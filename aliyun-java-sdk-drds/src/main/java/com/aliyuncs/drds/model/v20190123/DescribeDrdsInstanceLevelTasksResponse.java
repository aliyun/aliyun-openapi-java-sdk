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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsInstanceLevelTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsInstanceLevelTasksResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<Task> tasks;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public static class Task {

		private Integer taskType;

		private String taskPhase;

		private Integer progress;

		private Boolean allowCancel;

		private Integer taskStatus;

		private Boolean showProgress;

		private String taskName;

		private String progressDescription;

		private Long gmtCreate;

		private Long targetId;

		private String errMsg;

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public String getTaskPhase() {
			return this.taskPhase;
		}

		public void setTaskPhase(String taskPhase) {
			this.taskPhase = taskPhase;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public Boolean getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(Boolean allowCancel) {
			this.allowCancel = allowCancel;
		}

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public Boolean getShowProgress() {
			return this.showProgress;
		}

		public void setShowProgress(Boolean showProgress) {
			this.showProgress = showProgress;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getProgressDescription() {
			return this.progressDescription;
		}

		public void setProgressDescription(String progressDescription) {
			this.progressDescription = progressDescription;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getTargetId() {
			return this.targetId;
		}

		public void setTargetId(Long targetId) {
			this.targetId = targetId;
		}

		public String getErrMsg() {
			return this.errMsg;
		}

		public void setErrMsg(String errMsg) {
			this.errMsg = errMsg;
		}
	}

	@Override
	public DescribeDrdsInstanceLevelTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsInstanceLevelTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
