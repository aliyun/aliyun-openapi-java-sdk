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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeTairKVCacheInferInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTairKVCacheInferInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<TairInferInstanceDTO> instances;

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

	public List<TairInferInstanceDTO> getInstances() {
		return this.instances;
	}

	public void setInstances(List<TairInferInstanceDTO> instances) {
		this.instances = instances;
	}

	public static class TairInferInstanceDTO {

		private String vpcId;

		private String createTime;

		private String chargeType;

		private String networkType;

		private String instanceName;

		private String instanceClass;

		private String destroyTime;

		private String instanceId;

		private String instanceType;

		private String regionId;

		private String endTime;

		private String vSwitchId;

		private String resourceGroupId;

		private String zoneId;

		private String instanceStatus;

		private String privateIp;

		private Long capacity;

		private String model;

		private Integer modelServiceNum;

		private Integer computeUnitNum;

		private String vNodeName;

		private String ackId;

		private Integer vNodeCount;

		private List<Tag> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public String getDestroyTime() {
			return this.destroyTime;
		}

		public void setDestroyTime(String destroyTime) {
			this.destroyTime = destroyTime;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Integer getModelServiceNum() {
			return this.modelServiceNum;
		}

		public void setModelServiceNum(Integer modelServiceNum) {
			this.modelServiceNum = modelServiceNum;
		}

		public Integer getComputeUnitNum() {
			return this.computeUnitNum;
		}

		public void setComputeUnitNum(Integer computeUnitNum) {
			this.computeUnitNum = computeUnitNum;
		}

		public String getVNodeName() {
			return this.vNodeName;
		}

		public void setVNodeName(String vNodeName) {
			this.vNodeName = vNodeName;
		}

		public String getAckId() {
			return this.ackId;
		}

		public void setAckId(String ackId) {
			this.ackId = ackId;
		}

		public Integer getVNodeCount() {
			return this.vNodeCount;
		}

		public void setVNodeCount(Integer vNodeCount) {
			this.vNodeCount = vNodeCount;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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
	}

	@Override
	public DescribeTairKVCacheInferInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTairKVCacheInferInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
