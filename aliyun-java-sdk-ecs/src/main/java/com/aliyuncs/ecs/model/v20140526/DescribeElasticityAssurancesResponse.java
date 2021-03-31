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
import com.aliyuncs.ecs.transform.v20140526.DescribeElasticityAssurancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticityAssurancesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<ElasticityAssuranceItem> elasticityAssuranceSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ElasticityAssuranceItem> getElasticityAssuranceSet() {
		return this.elasticityAssuranceSet;
	}

	public void setElasticityAssuranceSet(List<ElasticityAssuranceItem> elasticityAssuranceSet) {
		this.elasticityAssuranceSet = elasticityAssuranceSet;
	}

	public static class ElasticityAssuranceItem {

		private String privatePoolOptionsId;

		private String privatePoolOptionsName;

		private String description;

		private String regionId;

		private String privatePoolOptionsMatchCriteria;

		private Integer usedAssuranceTimes;

		private String totalAssuranceTimes;

		private String status;

		private String startTime;

		private String endTime;

		private String latestStartTime;

		private String resourceGroupId;

		private List<AllocatedResource> allocatedResources;

		private List<Tag> tags;

		public String getPrivatePoolOptionsId() {
			return this.privatePoolOptionsId;
		}

		public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
			this.privatePoolOptionsId = privatePoolOptionsId;
		}

		public String getPrivatePoolOptionsName() {
			return this.privatePoolOptionsName;
		}

		public void setPrivatePoolOptionsName(String privatePoolOptionsName) {
			this.privatePoolOptionsName = privatePoolOptionsName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getPrivatePoolOptionsMatchCriteria() {
			return this.privatePoolOptionsMatchCriteria;
		}

		public void setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
			this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
		}

		public Integer getUsedAssuranceTimes() {
			return this.usedAssuranceTimes;
		}

		public void setUsedAssuranceTimes(Integer usedAssuranceTimes) {
			this.usedAssuranceTimes = usedAssuranceTimes;
		}

		public String getTotalAssuranceTimes() {
			return this.totalAssuranceTimes;
		}

		public void setTotalAssuranceTimes(String totalAssuranceTimes) {
			this.totalAssuranceTimes = totalAssuranceTimes;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getLatestStartTime() {
			return this.latestStartTime;
		}

		public void setLatestStartTime(String latestStartTime) {
			this.latestStartTime = latestStartTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<AllocatedResource> getAllocatedResources() {
			return this.allocatedResources;
		}

		public void setAllocatedResources(List<AllocatedResource> allocatedResources) {
			this.allocatedResources = allocatedResources;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class AllocatedResource {

			private String zoneId;

			private String instanceType;

			private Integer totalAmount;

			private Integer usedAmount;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Integer getTotalAmount() {
				return this.totalAmount;
			}

			public void setTotalAmount(Integer totalAmount) {
				this.totalAmount = totalAmount;
			}

			public Integer getUsedAmount() {
				return this.usedAmount;
			}

			public void setUsedAmount(Integer usedAmount) {
				this.usedAmount = usedAmount;
			}
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

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
	public DescribeElasticityAssurancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeElasticityAssurancesResponseUnmarshaller.unmarshall(this, context);
	}
}
