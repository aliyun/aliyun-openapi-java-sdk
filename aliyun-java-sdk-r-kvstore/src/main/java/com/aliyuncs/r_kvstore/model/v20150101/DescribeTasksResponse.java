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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTasksResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalRecordCount;

	private List<TaskProgressInfo> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<TaskProgressInfo> getItems() {
		return this.items;
	}

	public void setItems(List<TaskProgressInfo> items) {
		this.items = items;
	}

	public static class TaskProgressInfo {

		private String taskId;

		private String taskAction;

		private String status;

		private Float progress;

		private String beginTime;

		private String finishTime;

		private String stepsInfo;

		private Integer remain;

		private String stepProgressInfo;

		private String currentStepName;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskAction() {
			return this.taskAction;
		}

		public void setTaskAction(String taskAction) {
			this.taskAction = taskAction;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Float getProgress() {
			return this.progress;
		}

		public void setProgress(Float progress) {
			this.progress = progress;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getStepsInfo() {
			return this.stepsInfo;
		}

		public void setStepsInfo(String stepsInfo) {
			this.stepsInfo = stepsInfo;
		}

		public Integer getRemain() {
			return this.remain;
		}

		public void setRemain(Integer remain) {
			this.remain = remain;
		}

		public String getStepProgressInfo() {
			return this.stepProgressInfo;
		}

		public void setStepProgressInfo(String stepProgressInfo) {
			this.stepProgressInfo = stepProgressInfo;
		}

		public String getCurrentStepName() {
			return this.currentStepName;
		}

		public void setCurrentStepName(String currentStepName) {
			this.currentStepName = currentStepName;
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
