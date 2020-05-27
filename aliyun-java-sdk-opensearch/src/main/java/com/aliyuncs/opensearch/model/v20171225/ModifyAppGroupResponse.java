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

package com.aliyuncs.opensearch.model.v20171225;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ModifyAppGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyAppGroupResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String name;

		private String currentVersion;

		private Integer switchedTime;

		private Integer chargingWay;

		private String type;

		private String projectId;

		private String chargeType;

		private String expireOn;

		private String instanceId;

		private String commodityCode;

		private String processingOrderId;

		private Integer firstRankAlgoDeploymentId;

		private Integer secondRankAlgoDeploymentId;

		private Integer pendingSecondRankAlgoDeploymentId;

		private String description;

		private Integer produced;

		private Integer lockedByExpiration;

		private Integer hasPendingQuotaReviewTask;

		private Integer created;

		private Integer updated;

		private String status;

		private String lockMode;

		private Quota quota;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public Integer getSwitchedTime() {
			return this.switchedTime;
		}

		public void setSwitchedTime(Integer switchedTime) {
			this.switchedTime = switchedTime;
		}

		public Integer getChargingWay() {
			return this.chargingWay;
		}

		public void setChargingWay(Integer chargingWay) {
			this.chargingWay = chargingWay;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getExpireOn() {
			return this.expireOn;
		}

		public void setExpireOn(String expireOn) {
			this.expireOn = expireOn;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getProcessingOrderId() {
			return this.processingOrderId;
		}

		public void setProcessingOrderId(String processingOrderId) {
			this.processingOrderId = processingOrderId;
		}

		public Integer getFirstRankAlgoDeploymentId() {
			return this.firstRankAlgoDeploymentId;
		}

		public void setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
			this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
		}

		public Integer getSecondRankAlgoDeploymentId() {
			return this.secondRankAlgoDeploymentId;
		}

		public void setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
			this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
		}

		public Integer getPendingSecondRankAlgoDeploymentId() {
			return this.pendingSecondRankAlgoDeploymentId;
		}

		public void setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
			this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getProduced() {
			return this.produced;
		}

		public void setProduced(Integer produced) {
			this.produced = produced;
		}

		public Integer getLockedByExpiration() {
			return this.lockedByExpiration;
		}

		public void setLockedByExpiration(Integer lockedByExpiration) {
			this.lockedByExpiration = lockedByExpiration;
		}

		public Integer getHasPendingQuotaReviewTask() {
			return this.hasPendingQuotaReviewTask;
		}

		public void setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
			this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
		}

		public Integer getCreated() {
			return this.created;
		}

		public void setCreated(Integer created) {
			this.created = created;
		}

		public Integer getUpdated() {
			return this.updated;
		}

		public void setUpdated(Integer updated) {
			this.updated = updated;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public Quota getQuota() {
			return this.quota;
		}

		public void setQuota(Quota quota) {
			this.quota = quota;
		}

		public static class Quota {

			private Integer docSize;

			private Integer computeResource;

			private String spec;

			public Integer getDocSize() {
				return this.docSize;
			}

			public void setDocSize(Integer docSize) {
				this.docSize = docSize;
			}

			public Integer getComputeResource() {
				return this.computeResource;
			}

			public void setComputeResource(Integer computeResource) {
				this.computeResource = computeResource;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}
		}
	}

	@Override
	public ModifyAppGroupResponse getInstance(UnmarshallerContext context) {
		return	ModifyAppGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
