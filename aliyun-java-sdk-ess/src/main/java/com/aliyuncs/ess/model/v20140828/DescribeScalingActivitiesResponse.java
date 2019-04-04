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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScalingActivitiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingActivitiesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<ScalingActivity> scalingActivities;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScalingActivity> getScalingActivities() {
		return this.scalingActivities;
	}

	public void setScalingActivities(List<ScalingActivity> scalingActivities) {
		this.scalingActivities = scalingActivities;
	}

	public static class ScalingActivity {

		private String scalingActivityId;

		private String scalingGroupId;

		private String description;

		private String cause;

		private String startTime;

		private String endTime;

		private Integer progress;

		private String statusCode;

		private String statusMessage;

		private String totalCapacity;

		private String attachedCapacity;

		private String autoCreatedCapacity;

		private Integer scalingInstanceNumber;

		public String getScalingActivityId() {
			return this.scalingActivityId;
		}

		public void setScalingActivityId(String scalingActivityId) {
			this.scalingActivityId = scalingActivityId;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCause() {
			return this.cause;
		}

		public void setCause(String cause) {
			this.cause = cause;
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

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public String getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(String totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public String getAttachedCapacity() {
			return this.attachedCapacity;
		}

		public void setAttachedCapacity(String attachedCapacity) {
			this.attachedCapacity = attachedCapacity;
		}

		public String getAutoCreatedCapacity() {
			return this.autoCreatedCapacity;
		}

		public void setAutoCreatedCapacity(String autoCreatedCapacity) {
			this.autoCreatedCapacity = autoCreatedCapacity;
		}

		public Integer getScalingInstanceNumber() {
			return this.scalingInstanceNumber;
		}

		public void setScalingInstanceNumber(Integer scalingInstanceNumber) {
			this.scalingInstanceNumber = scalingInstanceNumber;
		}
	}

	@Override
	public DescribeScalingActivitiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingActivitiesResponseUnmarshaller.unmarshall(this, context);
	}
}
