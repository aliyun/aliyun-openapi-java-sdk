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
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsDbTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsDbTasksResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Task> tasks;

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

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public static class Task {

		private String taskName;

		private Long gmtCreate;

		private String taskDetail;

		private Integer taskType;

		private Integer taskStatus;

		private Integer progress;

		private String taskPhase;

		private Boolean showProgress;

		private Boolean allowCancel;

		private String parentJobId;

		private String expandType;

		private Long targetId;

		private String label;

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getTaskDetail() {
			return this.taskDetail;
		}

		public void setTaskDetail(String taskDetail) {
			this.taskDetail = taskDetail;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getTaskPhase() {
			return this.taskPhase;
		}

		public void setTaskPhase(String taskPhase) {
			this.taskPhase = taskPhase;
		}

		public Boolean getShowProgress() {
			return this.showProgress;
		}

		public void setShowProgress(Boolean showProgress) {
			this.showProgress = showProgress;
		}

		public Boolean getAllowCancel() {
			return this.allowCancel;
		}

		public void setAllowCancel(Boolean allowCancel) {
			this.allowCancel = allowCancel;
		}

		public String getParentJobId() {
			return this.parentJobId;
		}

		public void setParentJobId(String parentJobId) {
			this.parentJobId = parentJobId;
		}

		public String getExpandType() {
			return this.expandType;
		}

		public void setExpandType(String expandType) {
			this.expandType = expandType;
		}

		public Long getTargetId() {
			return this.targetId;
		}

		public void setTargetId(Long targetId) {
			this.targetId = targetId;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}
	}

	@Override
	public DescribeDrdsDbTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsDbTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
