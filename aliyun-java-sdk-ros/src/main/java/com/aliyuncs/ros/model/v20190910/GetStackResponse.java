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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetStackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStackResponse extends AcsResponse {

	private String status;

	private String description;

	private String requestId;

	private String statusReason;

	private String parentStackId;

	private String createTime;

	private String deletionProtection;

	private String rootStackId;

	private String templateDescription;

	private String stackType;

	private String ramRoleName;

	private String updateTime;

	private String driftDetectionTime;

	private String regionId;

	private String stackDriftStatus;

	private Boolean disableRollback;

	private String stackName;

	private Integer timeoutInMinutes;

	private String stackId;

	private String resourceGroupId;

	private List<Parameter> parameters;

	private List<Tag> tags;

	private List<Map<Object,Object>> outputs;

	private List<String> notificationURLs;

	private ResourceProgress resourceProgress;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	public String getParentStackId() {
		return this.parentStackId;
	}

	public void setParentStackId(String parentStackId) {
		this.parentStackId = parentStackId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(String deletionProtection) {
		this.deletionProtection = deletionProtection;
	}

	public String getRootStackId() {
		return this.rootStackId;
	}

	public void setRootStackId(String rootStackId) {
		this.rootStackId = rootStackId;
	}

	public String getTemplateDescription() {
		return this.templateDescription;
	}

	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}

	public String getStackType() {
		return this.stackType;
	}

	public void setStackType(String stackType) {
		this.stackType = stackType;
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getDriftDetectionTime() {
		return this.driftDetectionTime;
	}

	public void setDriftDetectionTime(String driftDetectionTime) {
		this.driftDetectionTime = driftDetectionTime;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getStackDriftStatus() {
		return this.stackDriftStatus;
	}

	public void setStackDriftStatus(String stackDriftStatus) {
		this.stackDriftStatus = stackDriftStatus;
	}

	public Boolean getDisableRollback() {
		return this.disableRollback;
	}

	public void setDisableRollback(Boolean disableRollback) {
		this.disableRollback = disableRollback;
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public Integer getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Integer timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public List<Parameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<Map<Object,Object>> getOutputs() {
		return this.outputs;
	}

	public void setOutputs(List<Map<Object,Object>> outputs) {
		this.outputs = outputs;
	}

	public List<String> getNotificationURLs() {
		return this.notificationURLs;
	}

	public void setNotificationURLs(List<String> notificationURLs) {
		this.notificationURLs = notificationURLs;
	}

	public ResourceProgress getResourceProgress() {
		return this.resourceProgress;
	}

	public void setResourceProgress(ResourceProgress resourceProgress) {
		this.resourceProgress = resourceProgress;
	}

	public static class Parameter {

		private String parameterKey;

		private String parameterValue;

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class ResourceProgress {

		private Integer totalResourceCount;

		private Integer successResourceCount;

		private Integer failedResourceCount;

		private Integer inProgressResourceCount;

		private Integer pendingResourceCount;

		private List<InProgressResourceDetail> inProgressResourceDetails;

		public Integer getTotalResourceCount() {
			return this.totalResourceCount;
		}

		public void setTotalResourceCount(Integer totalResourceCount) {
			this.totalResourceCount = totalResourceCount;
		}

		public Integer getSuccessResourceCount() {
			return this.successResourceCount;
		}

		public void setSuccessResourceCount(Integer successResourceCount) {
			this.successResourceCount = successResourceCount;
		}

		public Integer getFailedResourceCount() {
			return this.failedResourceCount;
		}

		public void setFailedResourceCount(Integer failedResourceCount) {
			this.failedResourceCount = failedResourceCount;
		}

		public Integer getInProgressResourceCount() {
			return this.inProgressResourceCount;
		}

		public void setInProgressResourceCount(Integer inProgressResourceCount) {
			this.inProgressResourceCount = inProgressResourceCount;
		}

		public Integer getPendingResourceCount() {
			return this.pendingResourceCount;
		}

		public void setPendingResourceCount(Integer pendingResourceCount) {
			this.pendingResourceCount = pendingResourceCount;
		}

		public List<InProgressResourceDetail> getInProgressResourceDetails() {
			return this.inProgressResourceDetails;
		}

		public void setInProgressResourceDetails(List<InProgressResourceDetail> inProgressResourceDetails) {
			this.inProgressResourceDetails = inProgressResourceDetails;
		}

		public static class InProgressResourceDetail {

			private String resourceName;

			private String resourceType;

			private Float progressValue;

			private Float progressTargetValue;

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public Float getProgressValue() {
				return this.progressValue;
			}

			public void setProgressValue(Float progressValue) {
				this.progressValue = progressValue;
			}

			public Float getProgressTargetValue() {
				return this.progressTargetValue;
			}

			public void setProgressTargetValue(Float progressTargetValue) {
				this.progressTargetValue = progressTargetValue;
			}
		}
	}

	@Override
	public GetStackResponse getInstance(UnmarshallerContext context) {
		return	GetStackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
