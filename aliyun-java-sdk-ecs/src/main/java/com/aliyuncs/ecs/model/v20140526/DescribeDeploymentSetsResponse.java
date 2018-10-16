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

	private String requestId;

	private String regionId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DeploymentSet> deploymentSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<DeploymentSet> getDeploymentSets() {
		return this.deploymentSets;
	}

	public void setDeploymentSets(List<DeploymentSet> deploymentSets) {
		this.deploymentSets = deploymentSets;
	}

	public static class DeploymentSet {

		private String deploymentSetId;

		private String deploymentSetDescription;

		private String deploymentSetName;

		private String strategy;

		private String deploymentStrategy;

		private String domain;

		private String granularity;

		private Integer instanceAmount;

		private String creationTime;

		private List<String> instanceIds;

		public String getDeploymentSetId() {
			return this.deploymentSetId;
		}

		public void setDeploymentSetId(String deploymentSetId) {
			this.deploymentSetId = deploymentSetId;
		}

		public String getDeploymentSetDescription() {
			return this.deploymentSetDescription;
		}

		public void setDeploymentSetDescription(String deploymentSetDescription) {
			this.deploymentSetDescription = deploymentSetDescription;
		}

		public String getDeploymentSetName() {
			return this.deploymentSetName;
		}

		public void setDeploymentSetName(String deploymentSetName) {
			this.deploymentSetName = deploymentSetName;
		}

		public String getStrategy() {
			return this.strategy;
		}

		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}

		public String getDeploymentStrategy() {
			return this.deploymentStrategy;
		}

		public void setDeploymentStrategy(String deploymentStrategy) {
			this.deploymentStrategy = deploymentStrategy;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getGranularity() {
			return this.granularity;
		}

		public void setGranularity(String granularity) {
			this.granularity = granularity;
		}

		public Integer getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Integer instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}
	}

	@Override
	public DescribeDeploymentSetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDeploymentSetsResponseUnmarshaller.unmarshall(this, context);
	}
}
