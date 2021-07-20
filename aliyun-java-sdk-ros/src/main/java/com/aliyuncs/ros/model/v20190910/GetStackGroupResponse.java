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
import com.aliyuncs.ros.transform.v20190910.GetStackGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStackGroupResponse extends AcsResponse {

	private String requestId;

	private StackGroup stackGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public StackGroup getStackGroup() {
		return this.stackGroup;
	}

	public void setStackGroup(StackGroup stackGroup) {
		this.stackGroup = stackGroup;
	}

	public static class StackGroup {

		private String status;

		private String description;

		private String resourceGroupId;

		private String stackGroupName;

		private String executionRoleName;

		private String administrationRoleName;

		private String stackGroupId;

		private String templateBody;

		private List<Parameter> parameters;

		private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getStackGroupName() {
			return this.stackGroupName;
		}

		public void setStackGroupName(String stackGroupName) {
			this.stackGroupName = stackGroupName;
		}

		public String getExecutionRoleName() {
			return this.executionRoleName;
		}

		public void setExecutionRoleName(String executionRoleName) {
			this.executionRoleName = executionRoleName;
		}

		public String getAdministrationRoleName() {
			return this.administrationRoleName;
		}

		public void setAdministrationRoleName(String administrationRoleName) {
			this.administrationRoleName = administrationRoleName;
		}

		public String getStackGroupId() {
			return this.stackGroupId;
		}

		public void setStackGroupId(String stackGroupId) {
			this.stackGroupId = stackGroupId;
		}

		public String getTemplateBody() {
			return this.templateBody;
		}

		public void setTemplateBody(String templateBody) {
			this.templateBody = templateBody;
		}

		public List<Parameter> getParameters() {
			return this.parameters;
		}

		public void setParameters(List<Parameter> parameters) {
			this.parameters = parameters;
		}

		public StackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
			return this.stackGroupDriftDetectionDetail;
		}

		public void setStackGroupDriftDetectionDetail(StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
			this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
		}

		public static class Parameter {

			private String parameterValue;

			private String parameterKey;

			public String getParameterValue() {
				return this.parameterValue;
			}

			public void setParameterValue(String parameterValue) {
				this.parameterValue = parameterValue;
			}

			public String getParameterKey() {
				return this.parameterKey;
			}

			public void setParameterKey(String parameterKey) {
				this.parameterKey = parameterKey;
			}
		}

		public static class StackGroupDriftDetectionDetail {

			private Integer driftedStackInstancesCount;

			private String stackGroupDriftStatus;

			private Integer inSyncStackInstancesCount;

			private Integer totalStackInstancesCount;

			private String driftDetectionTime;

			private Integer inProgressStackInstancesCount;

			private Integer cancelledStackInstancesCount;

			private String driftDetectionStatus;

			private Integer failedStackInstancesCount;

			public Integer getDriftedStackInstancesCount() {
				return this.driftedStackInstancesCount;
			}

			public void setDriftedStackInstancesCount(Integer driftedStackInstancesCount) {
				this.driftedStackInstancesCount = driftedStackInstancesCount;
			}

			public String getStackGroupDriftStatus() {
				return this.stackGroupDriftStatus;
			}

			public void setStackGroupDriftStatus(String stackGroupDriftStatus) {
				this.stackGroupDriftStatus = stackGroupDriftStatus;
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

			public String getDriftDetectionTime() {
				return this.driftDetectionTime;
			}

			public void setDriftDetectionTime(String driftDetectionTime) {
				this.driftDetectionTime = driftDetectionTime;
			}

			public Integer getInProgressStackInstancesCount() {
				return this.inProgressStackInstancesCount;
			}

			public void setInProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
				this.inProgressStackInstancesCount = inProgressStackInstancesCount;
			}

			public Integer getCancelledStackInstancesCount() {
				return this.cancelledStackInstancesCount;
			}

			public void setCancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
				this.cancelledStackInstancesCount = cancelledStackInstancesCount;
			}

			public String getDriftDetectionStatus() {
				return this.driftDetectionStatus;
			}

			public void setDriftDetectionStatus(String driftDetectionStatus) {
				this.driftDetectionStatus = driftDetectionStatus;
			}

			public Integer getFailedStackInstancesCount() {
				return this.failedStackInstancesCount;
			}

			public void setFailedStackInstancesCount(Integer failedStackInstancesCount) {
				this.failedStackInstancesCount = failedStackInstancesCount;
			}
		}
	}

	@Override
	public GetStackGroupResponse getInstance(UnmarshallerContext context) {
		return	GetStackGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
