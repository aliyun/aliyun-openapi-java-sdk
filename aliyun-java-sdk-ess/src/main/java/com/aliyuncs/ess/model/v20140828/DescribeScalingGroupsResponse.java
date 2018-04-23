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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScalingGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<ScalingGroup> scalingGroups;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ScalingGroup> getScalingGroups() {
		return this.scalingGroups;
	}

	public void setScalingGroups(List<ScalingGroup> scalingGroups) {
		this.scalingGroups = scalingGroups;
	}

	public static class ScalingGroup {

		private Integer defaultCooldown;

		private Integer maxSize;

		private Integer pendingCapacity;

		private Integer removingCapacity;

		private String scalingGroupName;

		private Integer activeCapacity;

		private Integer standbyCapacity;

		private String activeScalingConfigurationId;

		private String scalingGroupId;

		private String regionId;

		private Integer totalCapacity;

		private Integer minSize;

		private String lifecycleState;

		private String creationTime;

		private String modificationTime;

		private String vpcId;

		private String vSwitchId;

		private List<String> vSwitchIds;

		private List<String> removalPolicies;

		private List<String> dBInstanceIds;

		private List<String> loadBalancerIds;

		public Integer getDefaultCooldown() {
			return this.defaultCooldown;
		}

		public void setDefaultCooldown(Integer defaultCooldown) {
			this.defaultCooldown = defaultCooldown;
		}

		public Integer getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Integer maxSize) {
			this.maxSize = maxSize;
		}

		public Integer getPendingCapacity() {
			return this.pendingCapacity;
		}

		public void setPendingCapacity(Integer pendingCapacity) {
			this.pendingCapacity = pendingCapacity;
		}

		public Integer getRemovingCapacity() {
			return this.removingCapacity;
		}

		public void setRemovingCapacity(Integer removingCapacity) {
			this.removingCapacity = removingCapacity;
		}

		public String getScalingGroupName() {
			return this.scalingGroupName;
		}

		public void setScalingGroupName(String scalingGroupName) {
			this.scalingGroupName = scalingGroupName;
		}

		public Integer getActiveCapacity() {
			return this.activeCapacity;
		}

		public void setActiveCapacity(Integer activeCapacity) {
			this.activeCapacity = activeCapacity;
		}

		public Integer getStandbyCapacity() {
			return this.standbyCapacity;
		}

		public void setStandbyCapacity(Integer standbyCapacity) {
			this.standbyCapacity = standbyCapacity;
		}

		public String getActiveScalingConfigurationId() {
			return this.activeScalingConfigurationId;
		}

		public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
			this.activeScalingConfigurationId = activeScalingConfigurationId;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(Integer totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public Integer getMinSize() {
			return this.minSize;
		}

		public void setMinSize(Integer minSize) {
			this.minSize = minSize;
		}

		public String getLifecycleState() {
			return this.lifecycleState;
		}

		public void setLifecycleState(String lifecycleState) {
			this.lifecycleState = lifecycleState;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public List<String> getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(List<String> vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public List<String> getRemovalPolicies() {
			return this.removalPolicies;
		}

		public void setRemovalPolicies(List<String> removalPolicies) {
			this.removalPolicies = removalPolicies;
		}

		public List<String> getDBInstanceIds() {
			return this.dBInstanceIds;
		}

		public void setDBInstanceIds(List<String> dBInstanceIds) {
			this.dBInstanceIds = dBInstanceIds;
		}

		public List<String> getLoadBalancerIds() {
			return this.loadBalancerIds;
		}

		public void setLoadBalancerIds(List<String> loadBalancerIds) {
			this.loadBalancerIds = loadBalancerIds;
		}
	}

	@Override
	public DescribeScalingGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
