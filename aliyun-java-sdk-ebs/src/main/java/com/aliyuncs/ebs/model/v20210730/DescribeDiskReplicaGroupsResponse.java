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

package com.aliyuncs.ebs.model.v20210730;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ebs.transform.v20210730.DescribeDiskReplicaGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskReplicaGroupsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<ReplicaGroup> replicaGroups;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ReplicaGroup> getReplicaGroups() {
		return this.replicaGroups;
	}

	public void setReplicaGroups(List<ReplicaGroup> replicaGroups) {
		this.replicaGroups = replicaGroups;
	}

	public static class ReplicaGroup {

		private String replicaGroupId;

		private String sourceRegionId;

		private String sourceZoneId;

		private String destinationRegionId;

		private String destinationZoneId;

		private String groupName;

		private String description;

		private String status;

		private Long rPO;

		private Long lastRecoverPoint;

		private String site;

		private Long pairNumber;

		private String primaryRegion;

		private String standbyRegion;

		private String primaryZone;

		private String standbyZone;

		private Long bandwidth;

		private String resourceGroupId;

		private String sourceCloudId;

		private String destinationCloudId;

		private String primaryCloudId;

		private String standbyCloudId;

		private String primaryUid;

		private String standbyUid;

		private List<Tag> tags;

		private List<String> pairIds;

		public String getReplicaGroupId() {
			return this.replicaGroupId;
		}

		public void setReplicaGroupId(String replicaGroupId) {
			this.replicaGroupId = replicaGroupId;
		}

		public String getSourceRegionId() {
			return this.sourceRegionId;
		}

		public void setSourceRegionId(String sourceRegionId) {
			this.sourceRegionId = sourceRegionId;
		}

		public String getSourceZoneId() {
			return this.sourceZoneId;
		}

		public void setSourceZoneId(String sourceZoneId) {
			this.sourceZoneId = sourceZoneId;
		}

		public String getDestinationRegionId() {
			return this.destinationRegionId;
		}

		public void setDestinationRegionId(String destinationRegionId) {
			this.destinationRegionId = destinationRegionId;
		}

		public String getDestinationZoneId() {
			return this.destinationZoneId;
		}

		public void setDestinationZoneId(String destinationZoneId) {
			this.destinationZoneId = destinationZoneId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getRPO() {
			return this.rPO;
		}

		public void setRPO(Long rPO) {
			this.rPO = rPO;
		}

		public Long getLastRecoverPoint() {
			return this.lastRecoverPoint;
		}

		public void setLastRecoverPoint(Long lastRecoverPoint) {
			this.lastRecoverPoint = lastRecoverPoint;
		}

		public String getSite() {
			return this.site;
		}

		public void setSite(String site) {
			this.site = site;
		}

		public Long getPairNumber() {
			return this.pairNumber;
		}

		public void setPairNumber(Long pairNumber) {
			this.pairNumber = pairNumber;
		}

		public String getPrimaryRegion() {
			return this.primaryRegion;
		}

		public void setPrimaryRegion(String primaryRegion) {
			this.primaryRegion = primaryRegion;
		}

		public String getStandbyRegion() {
			return this.standbyRegion;
		}

		public void setStandbyRegion(String standbyRegion) {
			this.standbyRegion = standbyRegion;
		}

		public String getPrimaryZone() {
			return this.primaryZone;
		}

		public void setPrimaryZone(String primaryZone) {
			this.primaryZone = primaryZone;
		}

		public String getStandbyZone() {
			return this.standbyZone;
		}

		public void setStandbyZone(String standbyZone) {
			this.standbyZone = standbyZone;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getSourceCloudId() {
			return this.sourceCloudId;
		}

		public void setSourceCloudId(String sourceCloudId) {
			this.sourceCloudId = sourceCloudId;
		}

		public String getDestinationCloudId() {
			return this.destinationCloudId;
		}

		public void setDestinationCloudId(String destinationCloudId) {
			this.destinationCloudId = destinationCloudId;
		}

		public String getPrimaryCloudId() {
			return this.primaryCloudId;
		}

		public void setPrimaryCloudId(String primaryCloudId) {
			this.primaryCloudId = primaryCloudId;
		}

		public String getStandbyCloudId() {
			return this.standbyCloudId;
		}

		public void setStandbyCloudId(String standbyCloudId) {
			this.standbyCloudId = standbyCloudId;
		}

		public String getPrimaryUid() {
			return this.primaryUid;
		}

		public void setPrimaryUid(String primaryUid) {
			this.primaryUid = primaryUid;
		}

		public String getStandbyUid() {
			return this.standbyUid;
		}

		public void setStandbyUid(String standbyUid) {
			this.standbyUid = standbyUid;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getPairIds() {
			return this.pairIds;
		}

		public void setPairIds(List<String> pairIds) {
			this.pairIds = pairIds;
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
	public DescribeDiskReplicaGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiskReplicaGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
