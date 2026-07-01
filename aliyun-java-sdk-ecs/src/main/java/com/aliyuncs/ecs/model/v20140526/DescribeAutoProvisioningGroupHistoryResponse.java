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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeAutoProvisioningGroupHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoProvisioningGroupHistoryResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<AutoProvisioningGroupHistory> autoProvisioningGroupHistories;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AutoProvisioningGroupHistory> getAutoProvisioningGroupHistories() {
		return this.autoProvisioningGroupHistories;
	}

	public void setAutoProvisioningGroupHistories(List<AutoProvisioningGroupHistory> autoProvisioningGroupHistories) {
		this.autoProvisioningGroupHistories = autoProvisioningGroupHistories;
	}

	public static class AutoProvisioningGroupHistory {

		private String status;

		private String startTime;

		private String taskId;

		private String lastEventTime;

		private List<ActivityDetail> activityDetails;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getLastEventTime() {
			return this.lastEventTime;
		}

		public void setLastEventTime(String lastEventTime) {
			this.lastEventTime = lastEventTime;
		}

		public List<ActivityDetail> getActivityDetails() {
			return this.activityDetails;
		}

		public void setActivityDetails(List<ActivityDetail> activityDetails) {
			this.activityDetails = activityDetails;
		}

		public static class ActivityDetail {

			private String status;

			private String detail;

			private List<ErrorMessage> errorMessages;

			private List<String> createdInstanceIds;

			private List<String> destroyedInstanceIds;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDetail() {
				return this.detail;
			}

			public void setDetail(String detail) {
				this.detail = detail;
			}

			public List<ErrorMessage> getErrorMessages() {
				return this.errorMessages;
			}

			public void setErrorMessages(List<ErrorMessage> errorMessages) {
				this.errorMessages = errorMessages;
			}

			public List<String> getCreatedInstanceIds() {
				return this.createdInstanceIds;
			}

			public void setCreatedInstanceIds(List<String> createdInstanceIds) {
				this.createdInstanceIds = createdInstanceIds;
			}

			public List<String> getDestroyedInstanceIds() {
				return this.destroyedInstanceIds;
			}

			public void setDestroyedInstanceIds(List<String> destroyedInstanceIds) {
				this.destroyedInstanceIds = destroyedInstanceIds;
			}

			public static class ErrorMessage {

				private String code;

				private String message;

				private List<String> failedInstanceIds;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public List<String> getFailedInstanceIds() {
					return this.failedInstanceIds;
				}

				public void setFailedInstanceIds(List<String> failedInstanceIds) {
					this.failedInstanceIds = failedInstanceIds;
				}
			}
		}
	}

	@Override
	public DescribeAutoProvisioningGroupHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoProvisioningGroupHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
