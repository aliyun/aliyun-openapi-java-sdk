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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListAppGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<ResultItem> result;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer created;

		private String currentVersion;

		private Integer pendingSecondRankAlgoDeploymentId;

		private String lockMode;

		private Integer updated;

		private String id;

		private String chargeType;

		private Integer hasPendingQuotaReviewTask;

		private Integer secondRankAlgoDeploymentId;

		private String name;

		private String instanceId;

		private String processingOrderId;

		private Integer chargingWay;

		private String type;

		private String status;

		private String projectId;

		private Integer switchedTime;

		private String commodityCode;

		private String expireOn;

		private String domain;

		private String description;

		private Integer firstRankAlgoDeploymentId;

		private Integer produced;

		private Integer lockedByExpiration;

		private List<TagsItem> tags;

		private Quota quota;

		public Integer getCreated() {
			return this.created;
		}

		public void setCreated(Integer created) {
			this.created = created;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public Integer getPendingSecondRankAlgoDeploymentId() {
			return this.pendingSecondRankAlgoDeploymentId;
		}

		public void setPendingSecondRankAlgoDeploymentId(Integer pendingSecondRankAlgoDeploymentId) {
			this.pendingSecondRankAlgoDeploymentId = pendingSecondRankAlgoDeploymentId;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public Integer getUpdated() {
			return this.updated;
		}

		public void setUpdated(Integer updated) {
			this.updated = updated;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Integer getHasPendingQuotaReviewTask() {
			return this.hasPendingQuotaReviewTask;
		}

		public void setHasPendingQuotaReviewTask(Integer hasPendingQuotaReviewTask) {
			this.hasPendingQuotaReviewTask = hasPendingQuotaReviewTask;
		}

		public Integer getSecondRankAlgoDeploymentId() {
			return this.secondRankAlgoDeploymentId;
		}

		public void setSecondRankAlgoDeploymentId(Integer secondRankAlgoDeploymentId) {
			this.secondRankAlgoDeploymentId = secondRankAlgoDeploymentId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getProcessingOrderId() {
			return this.processingOrderId;
		}

		public void setProcessingOrderId(String processingOrderId) {
			this.processingOrderId = processingOrderId;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Integer getSwitchedTime() {
			return this.switchedTime;
		}

		public void setSwitchedTime(Integer switchedTime) {
			this.switchedTime = switchedTime;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getExpireOn() {
			return this.expireOn;
		}

		public void setExpireOn(String expireOn) {
			this.expireOn = expireOn;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getFirstRankAlgoDeploymentId() {
			return this.firstRankAlgoDeploymentId;
		}

		public void setFirstRankAlgoDeploymentId(Integer firstRankAlgoDeploymentId) {
			this.firstRankAlgoDeploymentId = firstRankAlgoDeploymentId;
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

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public Quota getQuota() {
			return this.quota;
		}

		public void setQuota(Quota quota) {
			this.quota = quota;
		}

		public static class TagsItem {

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

		public static class Quota {

			private String spec;

			private Integer docSize;

			private Integer computeResource;

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

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
		}
	}

	@Override
	public ListAppGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListAppGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
