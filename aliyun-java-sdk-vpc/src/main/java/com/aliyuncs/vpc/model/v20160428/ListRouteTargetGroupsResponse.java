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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListRouteTargetGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRouteTargetGroupsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer totalCount;

	private Integer maxResults;

	private List<RouteTargetGroup> routeTargetGroups;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<RouteTargetGroup> getRouteTargetGroups() {
		return this.routeTargetGroups;
	}

	public void setRouteTargetGroups(List<RouteTargetGroup> routeTargetGroups) {
		this.routeTargetGroups = routeTargetGroups;
	}

	public static class RouteTargetGroup {

		private String status;

		private String routeTargetGroupDescription;

		private String vpcId;

		private String routeTargetGroupId;

		private String configMode;

		private String regionId;

		private String routeTargetGroupName;

		private String resourceGroupId;

		private String createTime;

		private List<RouteTargetMember> routeTargetMemberList;

		private List<Tag> tags;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRouteTargetGroupDescription() {
			return this.routeTargetGroupDescription;
		}

		public void setRouteTargetGroupDescription(String routeTargetGroupDescription) {
			this.routeTargetGroupDescription = routeTargetGroupDescription;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getRouteTargetGroupId() {
			return this.routeTargetGroupId;
		}

		public void setRouteTargetGroupId(String routeTargetGroupId) {
			this.routeTargetGroupId = routeTargetGroupId;
		}

		public String getConfigMode() {
			return this.configMode;
		}

		public void setConfigMode(String configMode) {
			this.configMode = configMode;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRouteTargetGroupName() {
			return this.routeTargetGroupName;
		}

		public void setRouteTargetGroupName(String routeTargetGroupName) {
			this.routeTargetGroupName = routeTargetGroupName;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<RouteTargetMember> getRouteTargetMemberList() {
			return this.routeTargetMemberList;
		}

		public void setRouteTargetMemberList(List<RouteTargetMember> routeTargetMemberList) {
			this.routeTargetMemberList = routeTargetMemberList;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class RouteTargetMember {

			private String memberId;

			private String enableStatus;

			private String memberType;

			private String healthCheckStatus;

			private Integer weight;

			public String getMemberId() {
				return this.memberId;
			}

			public void setMemberId(String memberId) {
				this.memberId = memberId;
			}

			public String getEnableStatus() {
				return this.enableStatus;
			}

			public void setEnableStatus(String enableStatus) {
				this.enableStatus = enableStatus;
			}

			public String getMemberType() {
				return this.memberType;
			}

			public void setMemberType(String memberType) {
				this.memberType = memberType;
			}

			public String getHealthCheckStatus() {
				return this.healthCheckStatus;
			}

			public void setHealthCheckStatus(String healthCheckStatus) {
				this.healthCheckStatus = healthCheckStatus;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public ListRouteTargetGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListRouteTargetGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
