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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAttributeResponse extends AcsResponse {

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

		private String instanceName;

		private String connectionDomain;

		private Long port;

		private String instanceStatus;

		private String regionId;

		private Long capacity;

		private String instanceClass;

		private Long qPS;

		private Long bandwidth;

		private Long connections;

		private String zoneId;

		private String config;

		private String chargeType;

		private String nodeType;

		private String networkType;

		private String vpcId;

		private String vSwitchId;

		private String privateIp;

		private String createTime;

		private String endTime;

		private String hasRenewChangeOrder;

		private Boolean isRds;

		private String engine;

		private String engineVersion;

		private String maintainStartTime;

		private String maintainEndTime;

		private String availabilityValue;

		private String securityIPList;

		private String instanceType;

		private String architectureType;

		private String nodeType1;

		private String packageType;

		private String replicaId;

		private String vpcAuthMode;

		private String vpcAuthMode2;

		private String replicationMode;

		private String luaStatus;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getConnectionDomain() {
			return this.connectionDomain;
		}

		public void setConnectionDomain(String connectionDomain) {
			this.connectionDomain = connectionDomain;
		}

		public Long getPort() {
			return this.port;
		}

		public void setPort(Long port) {
			this.port = port;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Long getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Long capacity) {
			this.capacity = capacity;
		}

		public String getInstanceClass() {
			return this.instanceClass;
		}

		public void setInstanceClass(String instanceClass) {
			this.instanceClass = instanceClass;
		}

		public Long getQPS() {
			return this.qPS;
		}

		public void setQPS(Long qPS) {
			this.qPS = qPS;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public Long getConnections() {
			return this.connections;
		}

		public void setConnections(Long connections) {
			this.connections = connections;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
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

		public String getHasRenewChangeOrder() {
			return this.hasRenewChangeOrder;
		}

		public void setHasRenewChangeOrder(String hasRenewChangeOrder) {
			this.hasRenewChangeOrder = hasRenewChangeOrder;
		}

		public Boolean getIsRds() {
			return this.isRds;
		}

		public void setIsRds(Boolean isRds) {
			this.isRds = isRds;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getArchitectureType() {
			return this.architectureType;
		}

		public void setArchitectureType(String architectureType) {
			this.architectureType = architectureType;
		}

		public String getNodeType1() {
			return this.nodeType1;
		}

		public void setNodeType1(String nodeType1) {
			this.nodeType1 = nodeType1;
		}

		public String getPackageType() {
			return this.packageType;
		}

		public void setPackageType(String packageType) {
			this.packageType = packageType;
		}

		public String getReplicaId() {
			return this.replicaId;
		}

		public void setReplicaId(String replicaId) {
			this.replicaId = replicaId;
		}

		public String getVpcAuthMode() {
			return this.vpcAuthMode;
		}

		public void setVpcAuthMode(String vpcAuthMode) {
			this.vpcAuthMode = vpcAuthMode;
		}

		public String getVpcAuthMode2() {
			return this.vpcAuthMode2;
		}

		public void setVpcAuthMode2(String vpcAuthMode2) {
			this.vpcAuthMode2 = vpcAuthMode2;
		}

		public String getReplicationMode() {
			return this.replicationMode;
		}

		public void setReplicationMode(String replicationMode) {
			this.replicationMode = replicationMode;
		}

		public String getLuaStatus() {
			return this.luaStatus;
		}

		public void setLuaStatus(String luaStatus) {
			this.luaStatus = luaStatus;
		}
	}

	@Override
	public DescribeInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
