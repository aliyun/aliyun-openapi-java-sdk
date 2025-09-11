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
import com.aliyuncs.ecs.transform.v20140526.DescribeDeploymentSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDeploymentSetsResponse extends AcsResponse {

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private String regionId;

	private List<DeploymentSet> deploymentSets;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<DeploymentSet> getDeploymentSets() {
		return this.deploymentSets;
	}

	public void setDeploymentSets(List<DeploymentSet> deploymentSets) {
		this.deploymentSets = deploymentSets;
	}

	public static class DeploymentSet {

		private String creationTime;

		private String strategy;

		private String deploymentSetId;

		private Long accountId;

		private String deploymentStrategy;

		private String deploymentSetDescription;

		private String domain;

		private Integer groupCount;

		private String granularity;

		private String deploymentSetName;

		private Integer instanceAmount;

		private List<Capacity> capacities;

		private List<String> instanceIds;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStrategy() {
			return this.strategy;
		}

		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}

		public String getDeploymentSetId() {
			return this.deploymentSetId;
		}

		public void setDeploymentSetId(String deploymentSetId) {
			this.deploymentSetId = deploymentSetId;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getDeploymentStrategy() {
			return this.deploymentStrategy;
		}

		public void setDeploymentStrategy(String deploymentStrategy) {
			this.deploymentStrategy = deploymentStrategy;
		}

		public String getDeploymentSetDescription() {
			return this.deploymentSetDescription;
		}

		public void setDeploymentSetDescription(String deploymentSetDescription) {
			this.deploymentSetDescription = deploymentSetDescription;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Integer getGroupCount() {
			return this.groupCount;
		}

		public void setGroupCount(Integer groupCount) {
			this.groupCount = groupCount;
		}

		public String getGranularity() {
			return this.granularity;
		}

		public void setGranularity(String granularity) {
			this.granularity = granularity;
		}

		public String getDeploymentSetName() {
			return this.deploymentSetName;
		}

		public void setDeploymentSetName(String deploymentSetName) {
			this.deploymentSetName = deploymentSetName;
		}

		public Integer getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Integer instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public List<Capacity> getCapacities() {
			return this.capacities;
		}

		public void setCapacities(List<Capacity> capacities) {
			this.capacities = capacities;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}

		public static class Capacity {

			private String zoneId;

			private Integer usedAmount;

			private Integer availableAmount;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Integer getUsedAmount() {
				return this.usedAmount;
			}

			public void setUsedAmount(Integer usedAmount) {
				this.usedAmount = usedAmount;
			}

			public Integer getAvailableAmount() {
				return this.availableAmount;
			}

			public void setAvailableAmount(Integer availableAmount) {
				this.availableAmount = availableAmount;
			}
		}
	}

	@Override
	public DescribeDeploymentSetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeploymentSetsResponseUnmarshaller.unmarshall(this, context);
	}
}
