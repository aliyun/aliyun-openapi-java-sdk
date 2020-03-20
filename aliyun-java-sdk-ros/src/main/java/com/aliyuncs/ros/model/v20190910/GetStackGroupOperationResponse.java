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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetStackGroupOperationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStackGroupOperationResponse extends AcsResponse {

	private String requestId;

	private StackGroupOperation stackGroupOperation;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public StackGroupOperation getStackGroupOperation() {
		return this.stackGroupOperation;
	}

	public void setStackGroupOperation(StackGroupOperation stackGroupOperation) {
		this.stackGroupOperation = stackGroupOperation;
	}

	public static class StackGroupOperation {

		private String stackGroupName;

		private String stackGroupId;

		private String operationId;

		private String operationDescription;

		private String createTime;

		private String endTime;

		private String action;

		private String status;

		private Boolean retainStacks;

		private String administratorRoleName;

		private String executionRoleName;

		private OperationPreferences operationPreferences;

		private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

		public String getStackGroupName() {
			return this.stackGroupName;
		}

		public void setStackGroupName(String stackGroupName) {
			this.stackGroupName = stackGroupName;
		}

		public String getStackGroupId() {
			return this.stackGroupId;
		}

		public void setStackGroupId(String stackGroupId) {
			this.stackGroupId = stackGroupId;
		}

		public String getOperationId() {
			return this.operationId;
		}

		public void setOperationId(String operationId) {
			this.operationId = operationId;
		}

		public String getOperationDescription() {
			return this.operationDescription;
		}

		public void setOperationDescription(String operationDescription) {
			this.operationDescription = operationDescription;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getRetainStacks() {
			return this.retainStacks;
		}

		public void setRetainStacks(Boolean retainStacks) {
			this.retainStacks = retainStacks;
		}

		public String getAdministratorRoleName() {
			return this.administratorRoleName;
		}

		public void setAdministratorRoleName(String administratorRoleName) {
			this.administratorRoleName = administratorRoleName;
		}

		public String getExecutionRoleName() {
			return this.executionRoleName;
		}

		public void setExecutionRoleName(String executionRoleName) {
			this.executionRoleName = executionRoleName;
		}

		public OperationPreferences getOperationPreferences() {
			return this.operationPreferences;
		}

		public void setOperationPreferences(OperationPreferences operationPreferences) {
			this.operationPreferences = operationPreferences;
		}

		public StackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
			return this.stackGroupDriftDetectionDetail;
		}

		public void setStackGroupDriftDetectionDetail(StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
			this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
		}

		public static class OperationPreferences {

			private Integer failureToleranceCount;

			private Integer failureTolerancePercentage;

			private Integer maxConcurrentCount;

			private Integer maxConcurrentPercentage;

			private List<String> regionIdsOrder;

			public Integer getFailureToleranceCount() {
				return this.failureToleranceCount;
			}

			public void setFailureToleranceCount(Integer failureToleranceCount) {
				this.failureToleranceCount = failureToleranceCount;
			}

			public Integer getFailureTolerancePercentage() {
				return this.failureTolerancePercentage;
			}

			public void setFailureTolerancePercentage(Integer failureTolerancePercentage) {
				this.failureTolerancePercentage = failureTolerancePercentage;
			}

			public Integer getMaxConcurrentCount() {
				return this.maxConcurrentCount;
			}

			public void setMaxConcurrentCount(Integer maxConcurrentCount) {
				this.maxConcurrentCount = maxConcurrentCount;
			}

			public Integer getMaxConcurrentPercentage() {
				return this.maxConcurrentPercentage;
			}

			public void setMaxConcurrentPercentage(Integer maxConcurrentPercentage) {
				this.maxConcurrentPercentage = maxConcurrentPercentage;
			}

			public List<String> getRegionIdsOrder() {
				return this.regionIdsOrder;
			}

			public void setRegionIdsOrder(List<String> regionIdsOrder) {
				this.regionIdsOrder = regionIdsOrder;
			}
		}

		public static class StackGroupDriftDetectionDetail {

			private String driftDetectionTime;

			private String stackGroupDriftStatus;

			private String driftDetectionStatus;

			private Integer driftedStackInstancesCount;

			private Integer failedStackInstancesCount;

			private Integer cancelledStackInstancesCount;

			private Integer inProgressStackInstancesCount;

			private Integer inSyncStackInstancesCount;

			private Integer totalStackInstancesCount;

			public String getDriftDetectionTime() {
				return this.driftDetectionTime;
			}

			public void setDriftDetectionTime(String driftDetectionTime) {
				this.driftDetectionTime = driftDetectionTime;
			}

			public String getStackGroupDriftStatus() {
				return this.stackGroupDriftStatus;
			}

			public void setStackGroupDriftStatus(String stackGroupDriftStatus) {
				this.stackGroupDriftStatus = stackGroupDriftStatus;
			}

			public String getDriftDetectionStatus() {
				return this.driftDetectionStatus;
			}

			public void setDriftDetectionStatus(String driftDetectionStatus) {
				this.driftDetectionStatus = driftDetectionStatus;
			}

			public Integer getDriftedStackInstancesCount() {
				return this.driftedStackInstancesCount;
			}

			public void setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
				this.driftedStackInstancesCount = driftedStackInstancesCount;
			}

			public Integer getFailedStackInstancesCount() {
				return this.failedStackInstancesCount;
			}

			public void setFailedStackInstancesCount(Integer failedStackInstancesCount) {
				this.failedStackInstancesCount = failedStackInstancesCount;
			}

			public Integer getCancelledStackInstancesCount() {
				return this.cancelledStackInstancesCount;
			}

			public void setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
				this.cancelledStackInstancesCount = cancelledStackInstancesCount;
			}

			public Integer getInProgressStackInstancesCount() {
				return this.inProgressStackInstancesCount;
			}

			public void setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
				this.inProgressStackInstancesCount = inProgressStackInstancesCount;
			}

			public Integer getInSyncStackInstancesCount() {
				return this.inSyncStackInstancesCount;
			}

			public void setInSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
				this.inSyncStackInstancesCount = inSyncStackInstancesCount;
			}

			public Integer getTotalStackInstancesCount() {
				return this.totalStackInstancesCount;
			}

			public void setTotalStackInstancesCount(Integer totalStackInstancesCount) {
				this.totalStackInstancesCount = totalStackInstancesCount;
			}
		}
	}

	@Override
	public GetStackGroupOperationResponse getInstance(UnmarshallerContext context) {
		return	GetStackGroupOperationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
