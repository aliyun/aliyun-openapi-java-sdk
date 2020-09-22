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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeMetaTablePreviewTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetaTablePreviewTaskResponse extends AcsResponse {

	private String requestId;

	private String taskId;

	private String taskStatus;

	private Long startTime;

	private Long endTime;

	private Long executeTime;

	private Integer taskProcess;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
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

	public Long getExecuteTime() {
		return this.executeTime;
	}

	public void setExecuteTime(Long executeTime) {
		this.executeTime = executeTime;
	}

	public Integer getTaskProcess() {
		return this.taskProcess;
	}

	public void setTaskProcess(Integer taskProcess) {
		this.taskProcess = taskProcess;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Row> rows;

		private List<String> headers;

		public List<Row> getRows() {
			return this.rows;
		}

		public void setRows(List<Row> rows) {
			this.rows = rows;
		}

		public List<String> getHeaders() {
			return this.headers;
		}

		public void setHeaders(List<String> headers) {
			this.headers = headers;
		}

		public static class Row {

			private List<String> columns;

			public List<String> getColumns() {
				return this.columns;
			}

			public void setColumns(List<String> columns) {
				this.columns = columns;
			}
		}
	}

	@Override
	public DescribeMetaTablePreviewTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetaTablePreviewTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
