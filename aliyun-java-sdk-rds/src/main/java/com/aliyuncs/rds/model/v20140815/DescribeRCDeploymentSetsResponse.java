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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCDeploymentSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCDeploymentSetsResponse extends AcsResponse {

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

		private String createTime;

		private String deploymentSetDescription;

		private String deploymentSetId;

		private String deploymentSetName;

		private String deploymentStrategy;

		private String domain;

		private String granularity;

		private Integer groupCount;

		private Integer instanceAmount;

		private String strategy;

		private List<Capacity> capacities;

		private List<Tag> tags;

		private List<String> instanceIds;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDeploymentSetDescription() {
			return this.deploymentSetDescription;
		}

		public void setDeploymentSetDescription(String deploymentSetDescription) {
			this.deploymentSetDescription = deploymentSetDescription;
		}

		public String getDeploymentSetId() {
			return this.deploymentSetId;
		}

		public void setDeploymentSetId(String deploymentSetId) {
			this.deploymentSetId = deploymentSetId;
		}

		public String getDeploymentSetName() {
			return this.deploymentSetName;
		}

		public void setDeploymentSetName(String deploymentSetName) {
			this.deploymentSetName = deploymentSetName;
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

		public Integer getGroupCount() {
			return this.groupCount;
		}

		public void setGroupCount(Integer groupCount) {
			this.groupCount = groupCount;
		}

		public Integer getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Integer instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public String getStrategy() {
			return this.strategy;
		}

		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}

		public List<Capacity> getCapacities() {
			return this.capacities;
		}

		public void setCapacities(List<Capacity> capacities) {
			this.capacities = capacities;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}

		public static class Capacity {

			private Integer availableAmount;

			private Integer usedAmount;

			private String zoneId;

			public Integer getAvailableAmount() {
				return this.availableAmount;
			}

			public void setAvailableAmount(Integer availableAmount) {
				this.availableAmount = availableAmount;
			}

			public Integer getUsedAmount() {
				return this.usedAmount;
			}

			public void setUsedAmount(Integer usedAmount) {
				this.usedAmount = usedAmount;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}

		public static class Tag {

			private String resourceId;

			private String resourceType;

			private String tagKey;

			private String tagValue;

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeRCDeploymentSetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCDeploymentSetsResponseUnmarshaller.unmarshall(this, context);
	}
}
