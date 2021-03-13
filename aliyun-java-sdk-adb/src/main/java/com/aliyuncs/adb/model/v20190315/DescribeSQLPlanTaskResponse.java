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
import com.aliyuncs.adb.transform.v20190315.DescribeSQLPlanTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLPlanTaskResponse extends AcsResponse {

	private String requestId;

	private List<SqlPlanTask> taskList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SqlPlanTask> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<SqlPlanTask> taskList) {
		this.taskList = taskList;
	}

	public static class SqlPlanTask {

		private Integer taskId;

		private String state;

		private Long elapsedTime;

		private Long peakMemory;

		private Long operatorCost;

		private Long inputRows;

		private Long inputSize;

		private Long outputRows;

		private Long outputSize;

		private Long scanRows;

		private Long scanSize;

		private Long scanCost;

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getElapsedTime() {
			return this.elapsedTime;
		}

		public void setElapsedTime(Long elapsedTime) {
			this.elapsedTime = elapsedTime;
		}

		public Long getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Long peakMemory) {
			this.peakMemory = peakMemory;
		}

		public Long getOperatorCost() {
			return this.operatorCost;
		}

		public void setOperatorCost(Long operatorCost) {
			this.operatorCost = operatorCost;
		}

		public Long getInputRows() {
			return this.inputRows;
		}

		public void setInputRows(Long inputRows) {
			this.inputRows = inputRows;
		}

		public Long getInputSize() {
			return this.inputSize;
		}

		public void setInputSize(Long inputSize) {
			this.inputSize = inputSize;
		}

		public Long getOutputRows() {
			return this.outputRows;
		}

		public void setOutputRows(Long outputRows) {
			this.outputRows = outputRows;
		}

		public Long getOutputSize() {
			return this.outputSize;
		}

		public void setOutputSize(Long outputSize) {
			this.outputSize = outputSize;
		}

		public Long getScanRows() {
			return this.scanRows;
		}

		public void setScanRows(Long scanRows) {
			this.scanRows = scanRows;
		}

		public Long getScanSize() {
			return this.scanSize;
		}

		public void setScanSize(Long scanSize) {
			this.scanSize = scanSize;
		}

		public Long getScanCost() {
			return this.scanCost;
		}

		public void setScanCost(Long scanCost) {
			this.scanCost = scanCost;
		}
	}

	@Override
	public DescribeSQLPlanTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLPlanTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
