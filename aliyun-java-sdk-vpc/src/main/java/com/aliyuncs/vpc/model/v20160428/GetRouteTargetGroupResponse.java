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
import com.aliyuncs.vpc.transform.v20160428.GetRouteTargetGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRouteTargetGroupResponse extends AcsResponse {

	private String routeTargetGroupId;

	private String routeTargetGroupName;

	private String routeTargetGroupDescription;

	private String vpcId;

	private String configMode;

	private String status;

	private String regionId;

	private String requestId;

	private String resourceGroupId;

	private String createTime;

	private List<RouteTargetMemberListItem> routeTargetMemberList;

	private List<Tag> tags;

	public String getRouteTargetGroupId() {
		return this.routeTargetGroupId;
	}

	public void setRouteTargetGroupId(String routeTargetGroupId) {
		this.routeTargetGroupId = routeTargetGroupId;
	}

	public String getRouteTargetGroupName() {
		return this.routeTargetGroupName;
	}

	public void setRouteTargetGroupName(String routeTargetGroupName) {
		this.routeTargetGroupName = routeTargetGroupName;
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

	public String getConfigMode() {
		return this.configMode;
	}

	public void setConfigMode(String configMode) {
		this.configMode = configMode;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<RouteTargetMemberListItem> getRouteTargetMemberList() {
		return this.routeTargetMemberList;
	}

	public void setRouteTargetMemberList(List<RouteTargetMemberListItem> routeTargetMemberList) {
		this.routeTargetMemberList = routeTargetMemberList;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class RouteTargetMemberListItem {

		private String memberId;

		private String memberType;

		private Integer weight;

		private String healthCheckStatus;

		private String enableStatus;

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getMemberType() {
			return this.memberType;
		}

		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getHealthCheckStatus() {
			return this.healthCheckStatus;
		}

		public void setHealthCheckStatus(String healthCheckStatus) {
			this.healthCheckStatus = healthCheckStatus;
		}

		public String getEnableStatus() {
			return this.enableStatus;
		}

		public void setEnableStatus(String enableStatus) {
			this.enableStatus = enableStatus;
		}
	}

	public static class Tag {

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

	@Override
	public GetRouteTargetGroupResponse getInstance(UnmarshallerContext context) {
		return	GetRouteTargetGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
