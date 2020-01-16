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

package com.aliyuncs.hitsdb.model.v20170601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20170601.ExploreHiTSDBInstanceDeletionJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExploreHiTSDBInstanceDeletionJobListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long total;

	private List<JobItem> jobList;

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

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<JobItem> getJobList() {
		return this.jobList;
	}

	public void setJobList(List<JobItem> jobList) {
		this.jobList = jobList;
	}

	public static class JobItem {

		private Long id;

		private String instanceId;

		private String ip;

		private Integer port;

		private String metric;

		private String tags;

		private Long startTime;

		private Long endTime;

		private String status;

		private String jobTyp;

		private Long jobCreationTime;

		private Long jobStartTime;

		private Long jobEndTime;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getMetric() {
			return this.metric;
		}

		public void setMetric(String metric) {
			this.metric = metric;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getJobTyp() {
			return this.jobTyp;
		}

		public void setJobTyp(String jobTyp) {
			this.jobTyp = jobTyp;
		}

		public Long getJobCreationTime() {
			return this.jobCreationTime;
		}

		public void setJobCreationTime(Long jobCreationTime) {
			this.jobCreationTime = jobCreationTime;
		}

		public Long getJobStartTime() {
			return this.jobStartTime;
		}

		public void setJobStartTime(Long jobStartTime) {
			this.jobStartTime = jobStartTime;
		}

		public Long getJobEndTime() {
			return this.jobEndTime;
		}

		public void setJobEndTime(Long jobEndTime) {
			this.jobEndTime = jobEndTime;
		}
	}

	@Override
	public ExploreHiTSDBInstanceDeletionJobListResponse getInstance(UnmarshallerContext context) {
		return	ExploreHiTSDBInstanceDeletionJobListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
