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

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ScalingActivity> scalingActivities;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ScalingActivity> getScalingActivities() {
		return this.scalingActivities;
	}

	public void setScalingActivities(List<ScalingActivity> scalingActivities) {
		this.scalingActivities = scalingActivities;
	}

	public static class ScalingActivity {

		private Integer progress;

		private Integer scalingInstanceNumber;

		private String attachedCapacity;

		private String totalCapacity;

		private String scalingGroupId;

		private String autoCreatedCapacity;

		private String endTime;

		private String startTime;

		private String description;

		private String statusCode;

		private String cause;

		private String scalingActivityId;

		private String statusMessage;

		private Integer createdCapacity;

		private Integer destroyedCapacity;

		private Integer startedCapacity;

		private Integer stoppedCapacity;

		private String errorCode;

		private String errorMessage;

		private String detail;

		private String triggerSourceType;

		private String triggerSourceId;

		private String activityMetadata;

		private String instanceRefreshTaskId;

		private List<ErrorMessagesItem> errorMessages;

		private List<String> createdInstances;

		private List<String> destroyedInstances;

		private List<String> startedInstances;

		private List<String> stoppedInstances;

		private LifecycleHookContext lifecycleHookContext;

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public Integer getScalingInstanceNumber() {
			return this.scalingInstanceNumber;
		}

		public void setScalingInstanceNumber(Integer scalingInstanceNumber) {
			this.scalingInstanceNumber = scalingInstanceNumber;
		}

		public String getAttachedCapacity() {
			return this.attachedCapacity;
		}

		public void setAttachedCapacity(String attachedCapacity) {
			this.attachedCapacity = attachedCapacity;
		}

		public String getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(String totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getAutoCreatedCapacity() {
			return this.autoCreatedCapacity;
		}

		public void setAutoCreatedCapacity(String autoCreatedCapacity) {
			this.autoCreatedCapacity = autoCreatedCapacity;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getCause() {
			return this.cause;
		}

		public void setCause(String cause) {
			this.cause = cause;
		}

		public String getScalingActivityId() {
			return this.scalingActivityId;
		}

		public void setScalingActivityId(String scalingActivityId) {
			this.scalingActivityId = scalingActivityId;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}

		public Integer getCreatedCapacity() {
			return this.createdCapacity;
		}

		public void setCreatedCapacity(Integer createdCapacity) {
			this.createdCapacity = createdCapacity;
		}

		public Integer getDestroyedCapacity() {
			return this.destroyedCapacity;
		}

		public void setDestroyedCapacity(Integer destroyedCapacity) {
			this.destroyedCapacity = destroyedCapacity;
		}

		public Integer getStartedCapacity() {
			return this.startedCapacity;
		}

		public void setStartedCapacity(Integer startedCapacity) {
			this.startedCapacity = startedCapacity;
		}

		public Integer getStoppedCapacity() {
			return this.stoppedCapacity;
		}

		public void setStoppedCapacity(Integer stoppedCapacity) {
			this.stoppedCapacity = stoppedCapacity;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getTriggerSourceType() {
			return this.triggerSourceType;
		}

		public void setTriggerSourceType(String triggerSourceType) {
			this.triggerSourceType = triggerSourceType;
		}

		public String getTriggerSourceId() {
			return this.triggerSourceId;
		}

		public void setTriggerSourceId(String triggerSourceId) {
			this.triggerSourceId = triggerSourceId;
		}

		public String getActivityMetadata() {
			return this.activityMetadata;
		}

		public void setActivityMetadata(String activityMetadata) {
			this.activityMetadata = activityMetadata;
		}

		public String getInstanceRefreshTaskId() {
			return this.instanceRefreshTaskId;
		}

		public void setInstanceRefreshTaskId(String instanceRefreshTaskId) {
			this.instanceRefreshTaskId = instanceRefreshTaskId;
		}

		public List<ErrorMessagesItem> getErrorMessages() {
			return this.errorMessages;
		}

		public void setErrorMessages(List<ErrorMessagesItem> errorMessages) {
			this.errorMessages = errorMessages;
		}

		public List<String> getCreatedInstances() {
			return this.createdInstances;
		}

		public void setCreatedInstances(List<String> createdInstances) {
			this.createdInstances = createdInstances;
		}

		public List<String> getDestroyedInstances() {
			return this.destroyedInstances;
		}

		public void setDestroyedInstances(List<String> destroyedInstances) {
			this.destroyedInstances = destroyedInstances;
		}

		public List<String> getStartedInstances() {
			return this.startedInstances;
		}

		public void setStartedInstances(List<String> startedInstances) {
			this.startedInstances = startedInstances;
		}

		public List<String> getStoppedInstances() {
			return this.stoppedInstances;
		}

		public void setStoppedInstances(List<String> stoppedInstances) {
			this.stoppedInstances = stoppedInstances;
		}

		public LifecycleHookContext getLifecycleHookContext() {
			return this.lifecycleHookContext;
		}

		public void setLifecycleHookContext(LifecycleHookContext lifecycleHookContext) {
			this.lifecycleHookContext = lifecycleHookContext;
		}

		public static class ErrorMessagesItem {

			private String description;

			private String code;

			private String message;

			private List<String> failedInstanceIds;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

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

		public static class LifecycleHookContext {

			private Boolean disableLifecycleHook;

			private List<String> ignoredLifecycleHookIds;

			public Boolean getDisableLifecycleHook() {
				return this.disableLifecycleHook;
			}

			public void setDisableLifecycleHook(Boolean disableLifecycleHook) {
				this.disableLifecycleHook = disableLifecycleHook;
			}

			public List<String> getIgnoredLifecycleHookIds() {
				return this.ignoredLifecycleHookIds;
			}

			public void setIgnoredLifecycleHookIds(List<String> ignoredLifecycleHookIds) {
				this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
			}
		}
	}

	@Override
	public DescribeScalingActivitiesResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingActivitiesResponseUnmarshaller.unmarshall(this, context);
	}
}
