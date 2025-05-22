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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTasksResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private Integer totalRecordCount;

	private List<TaskProgressInfo> items;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private String beginTime;

		private String currentStepName;

		private String dBName;

		private String expectedFinishTime;

		private String finishTime;

		private String progress;

		private String progressInfo;

		private Integer remain;

		private String status;

		private String stepProgressInfo;

		private String stepsInfo;

		private String taskAction;

		private String taskErrorCode;

		private String taskErrorMessage;

		private String taskId;

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getCurrentStepName() {
			return this.currentStepName;
		}

		public void setCurrentStepName(String currentStepName) {
			this.currentStepName = currentStepName;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getExpectedFinishTime() {
			return this.expectedFinishTime;
		}

		public void setExpectedFinishTime(String expectedFinishTime) {
			this.expectedFinishTime = expectedFinishTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getProgressInfo() {
			return this.progressInfo;
		}

		public void setProgressInfo(String progressInfo) {
			this.progressInfo = progressInfo;
		}

		public Integer getRemain() {
			return this.remain;
		}

		public void setRemain(Integer remain) {
			this.remain = remain;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStepProgressInfo() {
			return this.stepProgressInfo;
		}

		public void setStepProgressInfo(String stepProgressInfo) {
			this.stepProgressInfo = stepProgressInfo;
		}

		public String getStepsInfo() {
			return this.stepsInfo;
		}

		public void setStepsInfo(String stepsInfo) {
			this.stepsInfo = stepsInfo;
		}

		public String getTaskAction() {
			return this.taskAction;
		}

		public void setTaskAction(String taskAction) {
			this.taskAction = taskAction;
		}

		public String getTaskErrorCode() {
			return this.taskErrorCode;
		}

		public void setTaskErrorCode(String taskErrorCode) {
			this.taskErrorCode = taskErrorCode;
		}

		public String getTaskErrorMessage() {
			return this.taskErrorMessage;
		}

		public void setTaskErrorMessage(String taskErrorMessage) {
			this.taskErrorMessage = taskErrorMessage;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public DescribeTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
