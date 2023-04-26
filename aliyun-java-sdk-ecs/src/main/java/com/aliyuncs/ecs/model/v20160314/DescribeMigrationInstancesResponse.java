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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeMigrationInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<MigrationInstance> migrationInstanceSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<MigrationInstance> getMigrationInstanceSet() {
		return this.migrationInstanceSet;
	}

	public void setMigrationInstanceSet(List<MigrationInstance> migrationInstanceSet) {
		this.migrationInstanceSet = migrationInstanceSet;
	}

	public static class MigrationInstance {

		private String status;

		private String finishTime;

		private String targetVpcId;

		private String internetIp;

		private String transitionTime;

		private String businessMigrationType;

		private String intranetIpAfterTransition;

		private String privateMacAddress;

		private String migrationPlanId;

		private String mergeProgress;

		private Integer networkMigrationType;

		private String macAddressAfterTransition;

		private String name;

		private String targetVSwitchId;

		private String publicMacAddress;

		private Boolean networkConnectivityStatus;

		private String migrationStatus;

		private String targetZoneId;

		private String instanceId;

		private String instanceType;

		private String intranetIp;

		private String regionId;

		private String instanceChargeType;

		private String resourceGroupId;

		private Boolean changePublicIp;

		private String internetIpAfterTransition;

		private String zoneId;

		private String businessStatus;

		private Boolean hasLocalDisk;

		private String loadProgress;

		private Boolean nonStandardInstanceType;

		private String taskId;

		private List<Tag> tags;

		private List<String> securityGroupIdSets;

		private List<String> securityGroupIdSetsAfterTransition;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getTargetVpcId() {
			return this.targetVpcId;
		}

		public void setTargetVpcId(String targetVpcId) {
			this.targetVpcId = targetVpcId;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getTransitionTime() {
			return this.transitionTime;
		}

		public void setTransitionTime(String transitionTime) {
			this.transitionTime = transitionTime;
		}

		public String getBusinessMigrationType() {
			return this.businessMigrationType;
		}

		public void setBusinessMigrationType(String businessMigrationType) {
			this.businessMigrationType = businessMigrationType;
		}

		public String getIntranetIpAfterTransition() {
			return this.intranetIpAfterTransition;
		}

		public void setIntranetIpAfterTransition(String intranetIpAfterTransition) {
			this.intranetIpAfterTransition = intranetIpAfterTransition;
		}

		public String getPrivateMacAddress() {
			return this.privateMacAddress;
		}

		public void setPrivateMacAddress(String privateMacAddress) {
			this.privateMacAddress = privateMacAddress;
		}

		public String getMigrationPlanId() {
			return this.migrationPlanId;
		}

		public void setMigrationPlanId(String migrationPlanId) {
			this.migrationPlanId = migrationPlanId;
		}

		public String getMergeProgress() {
			return this.mergeProgress;
		}

		public void setMergeProgress(String mergeProgress) {
			this.mergeProgress = mergeProgress;
		}

		public Integer getNetworkMigrationType() {
			return this.networkMigrationType;
		}

		public void setNetworkMigrationType(Integer networkMigrationType) {
			this.networkMigrationType = networkMigrationType;
		}

		public String getMacAddressAfterTransition() {
			return this.macAddressAfterTransition;
		}

		public void setMacAddressAfterTransition(String macAddressAfterTransition) {
			this.macAddressAfterTransition = macAddressAfterTransition;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTargetVSwitchId() {
			return this.targetVSwitchId;
		}

		public void setTargetVSwitchId(String targetVSwitchId) {
			this.targetVSwitchId = targetVSwitchId;
		}

		public String getPublicMacAddress() {
			return this.publicMacAddress;
		}

		public void setPublicMacAddress(String publicMacAddress) {
			this.publicMacAddress = publicMacAddress;
		}

		public Boolean getNetworkConnectivityStatus() {
			return this.networkConnectivityStatus;
		}

		public void setNetworkConnectivityStatus(Boolean networkConnectivityStatus) {
			this.networkConnectivityStatus = networkConnectivityStatus;
		}

		public String getMigrationStatus() {
			return this.migrationStatus;
		}

		public void setMigrationStatus(String migrationStatus) {
			this.migrationStatus = migrationStatus;
		}

		public String getTargetZoneId() {
			return this.targetZoneId;
		}

		public void setTargetZoneId(String targetZoneId) {
			this.targetZoneId = targetZoneId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Boolean getChangePublicIp() {
			return this.changePublicIp;
		}

		public void setChangePublicIp(Boolean changePublicIp) {
			this.changePublicIp = changePublicIp;
		}

		public String getInternetIpAfterTransition() {
			return this.internetIpAfterTransition;
		}

		public void setInternetIpAfterTransition(String internetIpAfterTransition) {
			this.internetIpAfterTransition = internetIpAfterTransition;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public Boolean getHasLocalDisk() {
			return this.hasLocalDisk;
		}

		public void setHasLocalDisk(Boolean hasLocalDisk) {
			this.hasLocalDisk = hasLocalDisk;
		}

		public String getLoadProgress() {
			return this.loadProgress;
		}

		public void setLoadProgress(String loadProgress) {
			this.loadProgress = loadProgress;
		}

		public Boolean getNonStandardInstanceType() {
			return this.nonStandardInstanceType;
		}

		public void setNonStandardInstanceType(Boolean nonStandardInstanceType) {
			this.nonStandardInstanceType = nonStandardInstanceType;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getSecurityGroupIdSets() {
			return this.securityGroupIdSets;
		}

		public void setSecurityGroupIdSets(List<String> securityGroupIdSets) {
			this.securityGroupIdSets = securityGroupIdSets;
		}

		public List<String> getSecurityGroupIdSetsAfterTransition() {
			return this.securityGroupIdSetsAfterTransition;
		}

		public void setSecurityGroupIdSetsAfterTransition(List<String> securityGroupIdSetsAfterTransition) {
			this.securityGroupIdSetsAfterTransition = securityGroupIdSetsAfterTransition;
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}
	}

	@Override
	public DescribeMigrationInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrationInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
