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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerUDPListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerUDPListenerAttributeResponse extends AcsResponse {

	private String vServerGroupId;

	private String status;

	private String aclType;

	private Integer connectionDrainTimeout;

	private String failoverStrategy;

	private String workingServerGroupId;

	private String healthCheckSwitch;

	private Boolean fullNatEnabled;

	private String serviceManagedMode;

	private String quicVersion;

	private String requestId;

	private Integer healthCheckConnectPort;

	private String description;

	private Integer bandwidth;

	private String healthCheckType;

	private String masterSlaveServerGroupId;

	private Integer backendServerPort;

	private String aclStatus;

	private String healthCheckDomain;

	private Integer unhealthyThreshold;

	private String masterServerGroupId;

	private String healthCheckHttpCode;

	private Integer maxConnection;

	private Boolean proxyProtocolV2Enabled;

	private String slaveServerGroupId;

	private Integer persistenceTimeout;

	private Integer listenerPort;

	private Integer healthCheckInterval;

	private String healthCheckExp;

	private String healthCheckURI;

	private Integer failoverThreshold;

	private String aclId;

	private String scheduler;

	private String vpcIds;

	private Integer healthCheckConnectTimeout;

	private Boolean masterSlaveModeEnabled;

	private Integer healthyThreshold;

	private String connectionDrain;

	private String healthCheckReq;

	private String healthCheckMethod;

	private String healthCheck;

	private String loadBalancerId;

	private List<PortRange> portRanges;

	private List<Tag> tags;

	private List<String> aclIds;

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
	}

	public Integer getConnectionDrainTimeout() {
		return this.connectionDrainTimeout;
	}

	public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
		this.connectionDrainTimeout = connectionDrainTimeout;
	}

	public String getFailoverStrategy() {
		return this.failoverStrategy;
	}

	public void setFailoverStrategy(String failoverStrategy) {
		this.failoverStrategy = failoverStrategy;
	}

	public String getWorkingServerGroupId() {
		return this.workingServerGroupId;
	}

	public void setWorkingServerGroupId(String workingServerGroupId) {
		this.workingServerGroupId = workingServerGroupId;
	}

	public String getHealthCheckSwitch() {
		return this.healthCheckSwitch;
	}

	public void setHealthCheckSwitch(String healthCheckSwitch) {
		this.healthCheckSwitch = healthCheckSwitch;
	}

	public Boolean getFullNatEnabled() {
		return this.fullNatEnabled;
	}

	public void setFullNatEnabled(Boolean fullNatEnabled) {
		this.fullNatEnabled = fullNatEnabled;
	}

	public String getServiceManagedMode() {
		return this.serviceManagedMode;
	}

	public void setServiceManagedMode(String serviceManagedMode) {
		this.serviceManagedMode = serviceManagedMode;
	}

	public String getQuicVersion() {
		return this.quicVersion;
	}

	public void setQuicVersion(String quicVersion) {
		this.quicVersion = quicVersion;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
	}

	public String getMasterSlaveServerGroupId() {
		return this.masterSlaveServerGroupId;
	}

	public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
		this.masterSlaveServerGroupId = masterSlaveServerGroupId;
	}

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}

	public String getMasterServerGroupId() {
		return this.masterServerGroupId;
	}

	public void setMasterServerGroupId(String masterServerGroupId) {
		this.masterServerGroupId = masterServerGroupId;
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
	}

	public Integer getMaxConnection() {
		return this.maxConnection;
	}

	public void setMaxConnection(Integer maxConnection) {
		this.maxConnection = maxConnection;
	}

	public Boolean getProxyProtocolV2Enabled() {
		return this.proxyProtocolV2Enabled;
	}

	public void setProxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
		this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
	}

	public String getSlaveServerGroupId() {
		return this.slaveServerGroupId;
	}

	public void setSlaveServerGroupId(String slaveServerGroupId) {
		this.slaveServerGroupId = slaveServerGroupId;
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
	}

	public String getHealthCheckExp() {
		return this.healthCheckExp;
	}

	public void setHealthCheckExp(String healthCheckExp) {
		this.healthCheckExp = healthCheckExp;
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
	}

	public Integer getFailoverThreshold() {
		return this.failoverThreshold;
	}

	public void setFailoverThreshold(Integer failoverThreshold) {
		this.failoverThreshold = failoverThreshold;
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public String getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(String vpcIds) {
		this.vpcIds = vpcIds;
	}

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
	}

	public Boolean getMasterSlaveModeEnabled() {
		return this.masterSlaveModeEnabled;
	}

	public void setMasterSlaveModeEnabled(Boolean masterSlaveModeEnabled) {
		this.masterSlaveModeEnabled = masterSlaveModeEnabled;
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}

	public String getConnectionDrain() {
		return this.connectionDrain;
	}

	public void setConnectionDrain(String connectionDrain) {
		this.connectionDrain = connectionDrain;
	}

	public String getHealthCheckReq() {
		return this.healthCheckReq;
	}

	public void setHealthCheckReq(String healthCheckReq) {
		this.healthCheckReq = healthCheckReq;
	}

	public String getHealthCheckMethod() {
		return this.healthCheckMethod;
	}

	public void setHealthCheckMethod(String healthCheckMethod) {
		this.healthCheckMethod = healthCheckMethod;
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public List<PortRange> getPortRanges() {
		return this.portRanges;
	}

	public void setPortRanges(List<PortRange> portRanges) {
		this.portRanges = portRanges;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(List<String> aclIds) {
		this.aclIds = aclIds;
	}

	public static class PortRange {

		private Integer startPort;

		private Integer endPort;

		public Integer getStartPort() {
			return this.startPort;
		}

		public void setStartPort(Integer startPort) {
			this.startPort = startPort;
		}

		public Integer getEndPort() {
			return this.endPort;
		}

		public void setEndPort(Integer endPort) {
			this.endPort = endPort;
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

	@Override
	public DescribeLoadBalancerUDPListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerUDPListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
