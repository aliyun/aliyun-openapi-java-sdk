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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListServerlessJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServerlessJobsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Long pageSize;

	private Long pageNumber;

	private List<JobInfo> jobs;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<JobInfo> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<JobInfo> jobs) {
		this.jobs = jobs;
	}

	public static class JobInfo {

		private String id;

		private String name;

		private String owner;

		private Boolean isArrayJob;

		private String state;

		private String submitTime;

		private String startTime;

		private String endTime;

		private String priority;

		private String queue;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Boolean getIsArrayJob() {
			return this.isArrayJob;
		}

		public void setIsArrayJob(Boolean isArrayJob) {
			this.isArrayJob = isArrayJob;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(String submitTime) {
			this.submitTime = submitTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}
	}

	@Override
	public ListServerlessJobsResponse getInstance(UnmarshallerContext context) {
		return	ListServerlessJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
