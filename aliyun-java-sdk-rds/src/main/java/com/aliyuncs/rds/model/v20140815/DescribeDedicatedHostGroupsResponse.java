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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDedicatedHostGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedHostGroupsResponse extends AcsResponse {

	private String requestId;

	private List<DedicatedHostGroupsItem> dedicatedHostGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DedicatedHostGroupsItem> getDedicatedHostGroups() {
		return this.dedicatedHostGroups;
	}

	public void setDedicatedHostGroups(List<DedicatedHostGroupsItem> dedicatedHostGroups) {
		this.dedicatedHostGroups = dedicatedHostGroups;
	}

	public static class DedicatedHostGroupsItem {

		private String allocationPolicy;

		private String bastionInstanceId;

		private Float cpuAllocateRation;

		private Float cpuAllocatedAmount;

		private Integer cpuAllocationRatio;

		private String createTime;

		private Map<Object,Object> dedicatedHostCountGroupByHostType;

		private String dedicatedHostGroupDesc;

		private String dedicatedHostGroupId;

		private Float diskAllocateRation;

		private Float diskAllocatedAmount;

		private Integer diskAllocationRatio;

		private Float diskUsedAmount;

		private Float diskUtility;

		private String engine;

		private Integer hostNumber;

		private String hostReplacePolicy;

		private Integer instanceNumber;

		private Float memAllocateRation;

		private Float memAllocatedAmount;

		private Integer memAllocationRatio;

		private Float memUsedAmount;

		private Float memUtility;

		private String openPermission;

		private String text;

		private String vPCId;

		private List<String> zoneIDList;

		public String getAllocationPolicy() {
			return this.allocationPolicy;
		}

		public void setAllocationPolicy(String allocationPolicy) {
			this.allocationPolicy = allocationPolicy;
		}

		public String getBastionInstanceId() {
			return this.bastionInstanceId;
		}

		public void setBastionInstanceId(String bastionInstanceId) {
			this.bastionInstanceId = bastionInstanceId;
		}

		public Float getCpuAllocateRation() {
			return this.cpuAllocateRation;
		}

		public void setCpuAllocateRation(Float cpuAllocateRation) {
			this.cpuAllocateRation = cpuAllocateRation;
		}

		public Float getCpuAllocatedAmount() {
			return this.cpuAllocatedAmount;
		}

		public void setCpuAllocatedAmount(Float cpuAllocatedAmount) {
			this.cpuAllocatedAmount = cpuAllocatedAmount;
		}

		public Integer getCpuAllocationRatio() {
			return this.cpuAllocationRatio;
		}

		public void setCpuAllocationRatio(Integer cpuAllocationRatio) {
			this.cpuAllocationRatio = cpuAllocationRatio;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Map<Object,Object> getDedicatedHostCountGroupByHostType() {
			return this.dedicatedHostCountGroupByHostType;
		}

		public void setDedicatedHostCountGroupByHostType(Map<Object,Object> dedicatedHostCountGroupByHostType) {
			this.dedicatedHostCountGroupByHostType = dedicatedHostCountGroupByHostType;
		}

		public String getDedicatedHostGroupDesc() {
			return this.dedicatedHostGroupDesc;
		}

		public void setDedicatedHostGroupDesc(String dedicatedHostGroupDesc) {
			this.dedicatedHostGroupDesc = dedicatedHostGroupDesc;
		}

		public String getDedicatedHostGroupId() {
			return this.dedicatedHostGroupId;
		}

		public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
			this.dedicatedHostGroupId = dedicatedHostGroupId;
		}

		public Float getDiskAllocateRation() {
			return this.diskAllocateRation;
		}

		public void setDiskAllocateRation(Float diskAllocateRation) {
			this.diskAllocateRation = diskAllocateRation;
		}

		public Float getDiskAllocatedAmount() {
			return this.diskAllocatedAmount;
		}

		public void setDiskAllocatedAmount(Float diskAllocatedAmount) {
			this.diskAllocatedAmount = diskAllocatedAmount;
		}

		public Integer getDiskAllocationRatio() {
			return this.diskAllocationRatio;
		}

		public void setDiskAllocationRatio(Integer diskAllocationRatio) {
			this.diskAllocationRatio = diskAllocationRatio;
		}

		public Float getDiskUsedAmount() {
			return this.diskUsedAmount;
		}

		public void setDiskUsedAmount(Float diskUsedAmount) {
			this.diskUsedAmount = diskUsedAmount;
		}

		public Float getDiskUtility() {
			return this.diskUtility;
		}

		public void setDiskUtility(Float diskUtility) {
			this.diskUtility = diskUtility;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Integer getHostNumber() {
			return this.hostNumber;
		}

		public void setHostNumber(Integer hostNumber) {
			this.hostNumber = hostNumber;
		}

		public String getHostReplacePolicy() {
			return this.hostReplacePolicy;
		}

		public void setHostReplacePolicy(String hostReplacePolicy) {
			this.hostReplacePolicy = hostReplacePolicy;
		}

		public Integer getInstanceNumber() {
			return this.instanceNumber;
		}

		public void setInstanceNumber(Integer instanceNumber) {
			this.instanceNumber = instanceNumber;
		}

		public Float getMemAllocateRation() {
			return this.memAllocateRation;
		}

		public void setMemAllocateRation(Float memAllocateRation) {
			this.memAllocateRation = memAllocateRation;
		}

		public Float getMemAllocatedAmount() {
			return this.memAllocatedAmount;
		}

		public void setMemAllocatedAmount(Float memAllocatedAmount) {
			this.memAllocatedAmount = memAllocatedAmount;
		}

		public Integer getMemAllocationRatio() {
			return this.memAllocationRatio;
		}

		public void setMemAllocationRatio(Integer memAllocationRatio) {
			this.memAllocationRatio = memAllocationRatio;
		}

		public Float getMemUsedAmount() {
			return this.memUsedAmount;
		}

		public void setMemUsedAmount(Float memUsedAmount) {
			this.memUsedAmount = memUsedAmount;
		}

		public Float getMemUtility() {
			return this.memUtility;
		}

		public void setMemUtility(Float memUtility) {
			this.memUtility = memUtility;
		}

		public String getOpenPermission() {
			return this.openPermission;
		}

		public void setOpenPermission(String openPermission) {
			this.openPermission = openPermission;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public List<String> getZoneIDList() {
			return this.zoneIDList;
		}

		public void setZoneIDList(List<String> zoneIDList) {
			this.zoneIDList = zoneIDList;
		}
	}

	@Override
	public DescribeDedicatedHostGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedHostGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
