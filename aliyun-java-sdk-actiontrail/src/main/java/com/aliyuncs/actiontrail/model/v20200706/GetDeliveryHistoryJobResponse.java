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
import com.aliyuncs.actiontrail.transform.v20200706.GetDeliveryHistoryJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeliveryHistoryJobResponse extends AcsResponse {

	private Integer jobStatus;

	private String createdTime;

	private String endTime;

	private String requestId;

	private String startTime;

	private String trailName;

	private String updatedTime;

	private Long jobId;

	private String homeRegion;

	private List<StatusItem> status;

	public Integer getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(Integer jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTrailName() {
		return this.trailName;
	}

	public void setTrailName(String trailName) {
		this.trailName = trailName;
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

	public String getHomeRegion() {
		return this.homeRegion;
	}

	public void setHomeRegion(String homeRegion) {
		this.homeRegion = homeRegion;
	}

	public List<StatusItem> getStatus() {
		return this.status;
	}

	public void setStatus(List<StatusItem> status) {
		this.status = status;
	}

	public static class StatusItem {

		private Integer status;

		private String region;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	@Override
	public GetDeliveryHistoryJobResponse getInstance(UnmarshallerContext context) {
		return	GetDeliveryHistoryJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
