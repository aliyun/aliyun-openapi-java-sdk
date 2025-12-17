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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeTairKVCacheInferInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTairKVCacheInferInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceAttribute> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceAttribute> getInstances() {
		return this.instances;
	}

	public void setInstances(List<DBInstanceAttribute> instances) {
		this.instances = instances;
	}

	public static class DBInstanceAttribute {

		private String instanceId;

		private String vpcId;

		private String vSwitchId;

		private String privateIp;

		private String chargeType;

		private String createTime;

		private String endTime;

		private String architectureType;

		private String networkType;

		private String instanceName;

		private String instanceClass;

		private String instanceType;

		private String zoneId;

		private String zoneType;

		private String regionId;

		private Long storage;

		private String resourceGroupId;

		private String instanceStatus;

		private String isOrderCompleted;

		private String connectionString;

		private Integer isDelete;

		private String model;

		private Integer modelServiceNum;

		private Integer computeUnitNum;

		private String replicaNum;

		private List<Tag> tags;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
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

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getArchitectureType() {
			return this.architectureType;
		}

		public void setArchitectureType(String architectureType) {
			this.architectureType = architectureType;
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

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getZoneType() {
			return this.zoneType;
		}

		public void setZoneType(String zoneType) {
			this.zoneType = zoneType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getStorage() {
			return this.storage;
		}

		public void setStorage(Long storage) {
			this.storage = storage;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getIsOrderCompleted() {
			return this.isOrderCompleted;
		}

		public void setIsOrderCompleted(String isOrderCompleted) {
			this.isOrderCompleted = isOrderCompleted;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public Integer getIsDelete() {
			return this.isDelete;
		}

		public void setIsDelete(Integer isDelete) {
			this.isDelete = isDelete;
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

		public String getReplicaNum() {
			return this.replicaNum;
		}

		public void setReplicaNum(String replicaNum) {
			this.replicaNum = replicaNum;
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
	public DescribeTairKVCacheInferInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeTairKVCacheInferInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
