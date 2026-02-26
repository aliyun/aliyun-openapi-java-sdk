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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDiagnosisTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisTasksResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<SqlTasks> taskList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SqlTasks> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<SqlTasks> taskList) {
		this.taskList = taskList;
	}

	public static class SqlTasks {

		private Long scanCost;

		private Long outputDataSize;

		private Long inputDataSize;

		private String state;

		private Long operatorCost;

		private Long outputRows;

		private Long scanDataSize;

		private Long elapsedTime;

		private Long scanRows;

		private Long peakMemory;

		private String taskId;

		private Long inputRows;

		private Long taskCreateTime;

		private Long taskEndTime;

		private String taskHost;

		private String drivers;

		private String queuedTime;

		private String computeTimeRatio;

		public Long getScanCost() {
			return this.scanCost;
		}

		public void setScanCost(Long scanCost) {
			this.scanCost = scanCost;
		}

		public Long getOutputDataSize() {
			return this.outputDataSize;
		}

		public void setOutputDataSize(Long outputDataSize) {
			this.outputDataSize = outputDataSize;
		}

		public Long getInputDataSize() {
			return this.inputDataSize;
		}

		public void setInputDataSize(Long inputDataSize) {
			this.inputDataSize = inputDataSize;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getOperatorCost() {
			return this.operatorCost;
		}

		public void setOperatorCost(Long operatorCost) {
			this.operatorCost = operatorCost;
		}

		public Long getOutputRows() {
			return this.outputRows;
		}

		public void setOutputRows(Long outputRows) {
			this.outputRows = outputRows;
		}

		public Long getScanDataSize() {
			return this.scanDataSize;
		}

		public void setScanDataSize(Long scanDataSize) {
			this.scanDataSize = scanDataSize;
		}

		public Long getElapsedTime() {
			return this.elapsedTime;
		}

		public void setElapsedTime(Long elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public Long getScanRows() {
			return this.scanRows;
		}

		public void setScanRows(Long scanRows) {
			this.scanRows = scanRows;
		}

		public Long getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Long peakMemory) {
			this.peakMemory = peakMemory;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Long getInputRows() {
			return this.inputRows;
		}

		public void setInputRows(Long inputRows) {
			this.inputRows = inputRows;
		}

		public Long getTaskCreateTime() {
			return this.taskCreateTime;
		}

		public void setTaskCreateTime(Long taskCreateTime) {
			this.taskCreateTime = taskCreateTime;
		}

		public Long getTaskEndTime() {
			return this.taskEndTime;
		}

		public void setTaskEndTime(Long taskEndTime) {
			this.taskEndTime = taskEndTime;
		}

		public String getTaskHost() {
			return this.taskHost;
		}

		public void setTaskHost(String taskHost) {
			this.taskHost = taskHost;
		}

		public String getDrivers() {
			return this.drivers;
		}

		public void setDrivers(String drivers) {
			this.drivers = drivers;
		}

		public String getQueuedTime() {
			return this.queuedTime;
		}

		public void setQueuedTime(String queuedTime) {
			this.queuedTime = queuedTime;
		}

		public String getComputeTimeRatio() {
			return this.computeTimeRatio;
		}

		public void setComputeTimeRatio(String computeTimeRatio) {
			this.computeTimeRatio = computeTimeRatio;
		}
	}

	@Override
	public DescribeDiagnosisTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosisTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
