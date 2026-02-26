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

package com.aliyuncs.eflo_controller.model.v20221215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo_controller.transform.v20221215.DescribeTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTaskResponse extends AcsResponse {

	private String requestId;

	private String clusterId;

	private String clusterName;

	private String taskState;

	private String taskType;

	private String message;

	private String createTime;

	private String updateTime;

	private List<StepsItem> steps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getTaskState() {
		return this.taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<StepsItem> getSteps() {
		return this.steps;
	}

	public void setSteps(List<StepsItem> steps) {
		this.steps = steps;
	}

	public static class StepsItem {

		private String stepName;

		private String stepState;

		private String stepType;

		private String stageTag;

		private String message;

		private String startTime;

		private String updateTime;

		private List<SubTasksItem> subTasks;

		public String getStepName() {
			return this.stepName;
		}

		public void setStepName(String stepName) {
			this.stepName = stepName;
		}

		public String getStepState() {
			return this.stepState;
		}

		public void setStepState(String stepState) {
			this.stepState = stepState;
		}

		public String getStepType() {
			return this.stepType;
		}

		public void setStepType(String stepType) {
			this.stepType = stepType;
		}

		public String getStageTag() {
			return this.stageTag;
		}

		public void setStageTag(String stageTag) {
			this.stageTag = stageTag;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<SubTasksItem> getSubTasks() {
			return this.subTasks;
		}

		public void setSubTasks(List<SubTasksItem> subTasks) {
			this.subTasks = subTasks;
		}

		public static class SubTasksItem {

			private String taskId;

			private String taskType;

			private String createTime;

			private String updateTime;

			private String message;

			private String taskState;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public String getMessage() {
				return this.message;
			}

			public void setMessage(String message) {
				this.message = message;
			}

			public String getTaskState() {
				return this.taskState;
			}

			public void setTaskState(String taskState) {
				this.taskState = taskState;
			}
		}
	}

	@Override
	public DescribeTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
