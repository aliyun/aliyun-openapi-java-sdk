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

package com.aliyuncs.ehpcinstant.model.v20230701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpcinstant.transform.v20230701.ListJobExecutorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListJobExecutorsResponse extends AcsResponse {

	private String requestId;

	private String jobId;

	private String taskName;

	private String pageSize;

	private String pageNumber;

	private String totalCount;

	private List<Executor> executors;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<Executor> getExecutors() {
		return this.executors;
	}

	public void setExecutors(List<Executor> executors) {
		this.executors = executors;
	}

	public static class Executor {

		private Integer arrayIndex;

		private String createTime;

		private String endTime;

		private String status;

		private String statusReason;

		private List<String> ipAddress;

		private List<String> hostName;

		public Integer getArrayIndex() {
			return this.arrayIndex;
		}

		public void setArrayIndex(Integer arrayIndex) {
			this.arrayIndex = arrayIndex;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}

		public List<String> getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(List<String> ipAddress) {
			this.ipAddress = ipAddress;
		}

		public List<String> getHostName() {
			return this.hostName;
		}

		public void setHostName(List<String> hostName) {
			this.hostName = hostName;
		}
	}

	@Override
	public ListJobExecutorsResponse getInstance(UnmarshallerContext context) {
		return	ListJobExecutorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
