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

	private String templateId;

	private String templateVersion;

	private String templateScratchId;

	private String templateURL;

	private String _interface;

	private Boolean serviceManaged;

	private String serviceName;

	private Integer checkedStackResourceCount;

	private Integer notCheckedStackResourceCount;

	private String rollbackFailedRootReason;

	private List<Parameter> parameters;

	private List<Tag> tags;

	private List<Map<Object,Object>> outputs;

	private List<String> notificationURLs;

	private List<String> orderIds;

	private ResourceProgress resourceProgress;

	private Log log;

	private OperationInfo operationInfo;

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

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

	public String getTemplateScratchId() {
		return this.templateScratchId;
	}

	public void setTemplateScratchId(String templateScratchId) {
		this.templateScratchId = templateScratchId;
	}

	public String getTemplateURL() {
		return this.templateURL;
	}

	public void setTemplateURL(String templateURL) {
		this.templateURL = templateURL;
	}

	public String get_Interface() {
		return this._interface;
	}

	public void set_Interface(String _interface) {
		this._interface = _interface;
	}

	public Boolean getServiceManaged() {
		return this.serviceManaged;
	}

	public void setServiceManaged(Boolean serviceManaged) {
		this.serviceManaged = serviceManaged;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getCheckedStackResourceCount() {
		return this.checkedStackResourceCount;
	}

	public void setCheckedStackResourceCount(Integer checkedStackResourceCount) {
		this.checkedStackResourceCount = checkedStackResourceCount;
	}

	public Integer getNotCheckedStackResourceCount() {
		return this.notCheckedStackResourceCount;
	}

	public void setNotCheckedStackResourceCount(Integer notCheckedStackResourceCount) {
		this.notCheckedStackResourceCount = notCheckedStackResourceCount;
	}

	public String getRollbackFailedRootReason() {
		return this.rollbackFailedRootReason;
	}

	public void setRollbackFailedRootReason(String rollbackFailedRootReason) {
		this.rollbackFailedRootReason = rollbackFailedRootReason;
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

	public List<String> getOrderIds() {
		return this.orderIds;
	}

	public void setOrderIds(List<String> orderIds) {
		this.orderIds = orderIds;
	}

	public ResourceProgress getResourceProgress() {
		return this.resourceProgress;
	}

	public void setResourceProgress(ResourceProgress resourceProgress) {
		this.resourceProgress = resourceProgress;
	}

	public Log getLog() {
		return this.log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public OperationInfo getOperationInfo() {
		return this.operationInfo;
	}

	public void setOperationInfo(OperationInfo operationInfo) {
		this.operationInfo = operationInfo;
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

		private Float stackOperationProgress;

		private Float stackActionProgress;

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

		public Float getStackOperationProgress() {
			return this.stackOperationProgress;
		}

		public void setStackOperationProgress(Float stackOperationProgress) {
			this.stackOperationProgress = stackOperationProgress;
		}

		public Float getStackActionProgress() {
			return this.stackActionProgress;
		}

		public void setStackActionProgress(Float stackActionProgress) {
			this.stackActionProgress = stackActionProgress;
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

	public static class Log {

		private List<TerraformLog> terraformLogs;

		private List<ResourceLog> resourceLogs;

		public List<TerraformLog> getTerraformLogs() {
			return this.terraformLogs;
		}

		public void setTerraformLogs(List<TerraformLog> terraformLogs) {
			this.terraformLogs = terraformLogs;
		}

		public List<ResourceLog> getResourceLogs() {
			return this.resourceLogs;
		}

		public void setResourceLogs(List<ResourceLog> resourceLogs) {
			this.resourceLogs = resourceLogs;
		}

		public static class TerraformLog {

			private String command;

			private String stream;

			private String content;

			public String getCommand() {
				return this.command;
			}

			public void setCommand(String command) {
				this.command = command;
			}

			public String getStream() {
				return this.stream;
			}

			public void setStream(String stream) {
				this.stream = stream;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}

		public static class ResourceLog {

			private String resourceName;

			private List<Log1> logs;

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public List<Log1> getLogs() {
				return this.logs;
			}

			public void setLogs(List<Log1> logs) {
				this.logs = logs;
			}

			public static class Log1 {

				private String content;

				private List<String> keys;

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public List<String> getKeys() {
					return this.keys;
				}

				public void setKeys(List<String> keys) {
					this.keys = keys;
				}
			}
		}
	}

	public static class OperationInfo {

		private String code;

		private String message;

		private String requestId;

		private String action;

		private String resourceType;

		private String logicalResourceId;

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

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getLogicalResourceId() {
			return this.logicalResourceId;
		}

		public void setLogicalResourceId(String logicalResourceId) {
			this.logicalResourceId = logicalResourceId;
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
