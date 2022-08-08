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

package com.aliyuncs.appstream_center.model.v20210901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.ListOtaTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOtaTaskResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Data> taskList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Data> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<Data> taskList) {
		this.taskList = taskList;
	}

	public static class Data {

		private String otaVersion;

		private String taskDisplayStatus;

		private String taskStartTime;

		private String taskId;

		public String getOtaVersion() {
			return this.otaVersion;
		}

		public void setOtaVersion(String otaVersion) {
			this.otaVersion = otaVersion;
		}

		public String getTaskDisplayStatus() {
			return this.taskDisplayStatus;
		}

		public void setTaskDisplayStatus(String taskDisplayStatus) {
			this.taskDisplayStatus = taskDisplayStatus;
		}

		public String getTaskStartTime() {
			return this.taskStartTime;
		}

		public void setTaskStartTime(String taskStartTime) {
			this.taskStartTime = taskStartTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public ListOtaTaskResponse getInstance(UnmarshallerContext context) {
		return	ListOtaTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
