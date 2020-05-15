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

		private String stackGroupName;

		private String stackGroupId;

		private String status;

		private String description;

		private String templateBody;

		private String executionRoleName;

		private String administrationRoleName;

		private String templateBody1;

		private List<Parameter> parameters;

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

		public String getTemplateBody() {
			return this.templateBody;
		}

		public void setTemplateBody(String templateBody) {
			this.templateBody = templateBody;
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

		public String getTemplateBody1() {
			return this.templateBody1;
		}

		public void setTemplateBody1(String templateBody1) {
			this.templateBody1 = templateBody1;
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
	public GetStackGroupResponse getInstance(UnmarshallerContext context) {
		return	GetStackGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
