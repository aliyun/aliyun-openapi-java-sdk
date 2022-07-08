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

package com.aliyuncs.actiontrail.model.v20200706;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.actiontrail.transform.v20200706.ListDeliveryHistoryJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeliveryHistoryJobsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<DeliveryHistoryJob> deliveryHistoryJobs;

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

	public List<DeliveryHistoryJob> getDeliveryHistoryJobs() {
		return this.deliveryHistoryJobs;
	}

	public void setDeliveryHistoryJobs(List<DeliveryHistoryJob> deliveryHistoryJobs) {
		this.deliveryHistoryJobs = deliveryHistoryJobs;
	}

	public static class DeliveryHistoryJob {

		private String trailName;

		private String endTime;

		private String startTime;

		private Integer jobStatus;

		private String homeRegion;

		private String updatedTime;

		private Long jobId;

		private String createdTime;

		public String getTrailName() {
			return this.trailName;
		}

		public void setTrailName(String trailName) {
			this.trailName = trailName;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getJobStatus() {
			return this.jobStatus;
		}

		public void setJobStatus(Integer jobStatus) {
			this.jobStatus = jobStatus;
		}

		public String getHomeRegion() {
			return this.homeRegion;
		}

		public void setHomeRegion(String homeRegion) {
			this.homeRegion = homeRegion;
		}

		public String getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(String updatedTime) {
			this.updatedTime = updatedTime;
		}

		public Long getJobId() {
			return this.jobId;
		}

		public void setJobId(Long jobId) {
			this.jobId = jobId;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public ListDeliveryHistoryJobsResponse getInstance(UnmarshallerContext context) {
		return	ListDeliveryHistoryJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
