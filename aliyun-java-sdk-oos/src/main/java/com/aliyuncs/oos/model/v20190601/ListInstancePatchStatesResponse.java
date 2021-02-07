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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.ListInstancePatchStatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstancePatchStatesResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private List<InstancePatchState> instancePatchStates;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstancePatchState> getInstancePatchStates() {
		return this.instancePatchStates;
	}

	public void setInstancePatchStates(List<InstancePatchState> instancePatchStates) {
		this.instancePatchStates = instancePatchStates;
	}

	public static class InstancePatchState {

		private String instanceId;

		private String patchGroup;

		private String baselineId;

		private String ownerInformation;

		private String installedCount;

		private String installedOtherCount;

		private String installedPendingRebootCount;

		private String installedRejectedCount;

		private String missingCount;

		private String failedCount;

		private String operationType;

		private String operationStartTime;

		private String operationEndTime;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getPatchGroup() {
			return this.patchGroup;
		}

		public void setPatchGroup(String patchGroup) {
			this.patchGroup = patchGroup;
		}

		public String getBaselineId() {
			return this.baselineId;
		}

		public void setBaselineId(String baselineId) {
			this.baselineId = baselineId;
		}

		public String getOwnerInformation() {
			return this.ownerInformation;
		}

		public void setOwnerInformation(String ownerInformation) {
			this.ownerInformation = ownerInformation;
		}

		public String getInstalledCount() {
			return this.installedCount;
		}

		public void setInstalledCount(String installedCount) {
			this.installedCount = installedCount;
		}

		public String getInstalledOtherCount() {
			return this.installedOtherCount;
		}

		public void setInstalledOtherCount(String installedOtherCount) {
			this.installedOtherCount = installedOtherCount;
		}

		public String getInstalledPendingRebootCount() {
			return this.installedPendingRebootCount;
		}

		public void setInstalledPendingRebootCount(String installedPendingRebootCount) {
			this.installedPendingRebootCount = installedPendingRebootCount;
		}

		public String getInstalledRejectedCount() {
			return this.installedRejectedCount;
		}

		public void setInstalledRejectedCount(String installedRejectedCount) {
			this.installedRejectedCount = installedRejectedCount;
		}

		public String getMissingCount() {
			return this.missingCount;
		}

		public void setMissingCount(String missingCount) {
			this.missingCount = missingCount;
		}

		public String getFailedCount() {
			return this.failedCount;
		}

		public void setFailedCount(String failedCount) {
			this.failedCount = failedCount;
		}

		public String getOperationType() {
			return this.operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}

		public String getOperationStartTime() {
			return this.operationStartTime;
		}

		public void setOperationStartTime(String operationStartTime) {
			this.operationStartTime = operationStartTime;
		}

		public String getOperationEndTime() {
			return this.operationEndTime;
		}

		public void setOperationEndTime(String operationEndTime) {
			this.operationEndTime = operationEndTime;
		}
	}

	@Override
	public ListInstancePatchStatesResponse getInstance(UnmarshallerContext context) {
		return	ListInstancePatchStatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
