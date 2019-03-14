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
import com.aliyuncs.emr.transform.v20160408.ListScalingActivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScalingActivityResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<ScalingActivity> scalingActivityList;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ScalingActivity> getScalingActivityList() {
		return this.scalingActivityList;
	}

	public void setScalingActivityList(List<ScalingActivity> scalingActivityList) {
		this.scalingActivityList = scalingActivityList;
	}

	public static class ScalingActivity {

		private String bizId;

		private Long startTime;

		private Long endTime;

		private String instanceIds;

		private Integer totalCapacity;

		private String cause;

		private String description;

		private String status;

		private String transition;

		private String scalingRuleId;

		private Integer expectNum;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
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

		public String getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(String instanceIds) {
			this.instanceIds = instanceIds;
		}

		public Integer getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(Integer totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public String getCause() {
			return this.cause;
		}

		public void setCause(String cause) {
			this.cause = cause;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTransition() {
			return this.transition;
		}

		public void setTransition(String transition) {
			this.transition = transition;
		}

		public String getScalingRuleId() {
			return this.scalingRuleId;
		}

		public void setScalingRuleId(String scalingRuleId) {
			this.scalingRuleId = scalingRuleId;
		}

		public Integer getExpectNum() {
			return this.expectNum;
		}

		public void setExpectNum(Integer expectNum) {
			this.expectNum = expectNum;
		}
	}

	@Override
	public ListScalingActivityResponse getInstance(UnmarshallerContext context) {
		return	ListScalingActivityResponseUnmarshaller.unmarshall(this, context);
	}
}
