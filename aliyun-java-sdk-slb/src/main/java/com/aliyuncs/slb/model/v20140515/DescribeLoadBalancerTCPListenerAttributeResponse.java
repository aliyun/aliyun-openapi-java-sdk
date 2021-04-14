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
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerTCPListenerAttributeResponse extends AcsResponse {

	private String aclId;

	private String aclStatus;

	private String aclType;

	private Integer backendServerPort;

	private Integer bandwidth;

	private String connectionDrain;

	private Integer connectionDrainTimeout;

	private String description;

	private Integer establishedTimeout;

	private String failoverStrategy;

	private Integer failoverThreshold;

	private String healthCheck;

	private Integer healthCheckConnectPort;

	private Integer healthCheckConnectTimeout;

	private String healthCheckDomain;

	private String healthCheckHttpCode;

	private Integer healthCheckInterval;

	private String healthCheckMethod;

	private Boolean healthCheckTcpFastCloseEnabled;

	private String healthCheckType;

	private String healthCheckURI;

	private Integer healthyThreshold;

	private Integer listenerPort;

	private String masterServerGroupId;

	private Boolean masterSlaveModeEnabled;

	private String masterSlaveServerGroupId;

	private Integer maxConnection;

	private Integer persistenceTimeout;

	private Boolean proxyProtocolV2Enabled;

	private Boolean proxyProtocolVpcIdEnabled;

	private String requestId;

	private String scheduler;

	private String slaveServerGroupId;

	private String status;

	private String synProxy;

	private Integer unhealthyThreshold;

	private String vServerGroupId;

	private String vpcIds;

	private String workingServerGroupId;

	private List<PortRange> portRanges;

	private List<String> aclIds;

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
	}

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getConnectionDrain() {
		return this.connectionDrain;
	}

	public void setConnectionDrain(String connectionDrain) {
		this.connectionDrain = connectionDrain;
	}

	public Integer getConnectionDrainTimeout() {
		return this.connectionDrainTimeout;
	}

	public void setConnectionDrainTimeout(Integer connectionDrainTimeout) {
		this.connectionDrainTimeout = connectionDrainTimeout;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEstablishedTimeout() {
		return this.establishedTimeout;
	}

	public void setEstablishedTimeout(Integer establishedTimeout) {
		this.establishedTimeout = establishedTimeout;
	}

	public String getFailoverStrategy() {
		return this.failoverStrategy;
	}

	public void setFailoverStrategy(String failoverStrategy) {
		this.failoverStrategy = failoverStrategy;
	}

	public Integer getFailoverThreshold() {
		return this.failoverThreshold;
	}

	public void setFailoverThreshold(Integer failoverThreshold) {
		this.failoverThreshold = failoverThreshold;
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
	}

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
	}

	public String getHealthCheckMethod() {
		return this.healthCheckMethod;
	}

	public void setHealthCheckMethod(String healthCheckMethod) {
		this.healthCheckMethod = healthCheckMethod;
	}

	public Boolean getHealthCheckTcpFastCloseEnabled() {
		return this.healthCheckTcpFastCloseEnabled;
	}

	public void setHealthCheckTcpFastCloseEnabled(Boolean healthCheckTcpFastCloseEnabled) {
		this.healthCheckTcpFastCloseEnabled = healthCheckTcpFastCloseEnabled;
	}

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
	}

	public String getMasterServerGroupId() {
		return this.masterServerGroupId;
	}

	public void setMasterServerGroupId(String masterServerGroupId) {
		this.masterServerGroupId = masterServerGroupId;
	}

	public Boolean getMasterSlaveModeEnabled() {
		return this.masterSlaveModeEnabled;
	}

	public void setMasterSlaveModeEnabled(Boolean masterSlaveModeEnabled) {
		this.masterSlaveModeEnabled = masterSlaveModeEnabled;
	}

	public String getMasterSlaveServerGroupId() {
		return this.masterSlaveServerGroupId;
	}

	public void setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
		this.masterSlaveServerGroupId = masterSlaveServerGroupId;
	}

	public Integer getMaxConnection() {
		return this.maxConnection;
	}

	public void setMaxConnection(Integer maxConnection) {
		this.maxConnection = maxConnection;
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
	}

	public Boolean getProxyProtocolV2Enabled() {
		return this.proxyProtocolV2Enabled;
	}

	public void setProxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
		this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
	}

	public Boolean getProxyProtocolVpcIdEnabled() {
		return this.proxyProtocolVpcIdEnabled;
	}

	public void setProxyProtocolVpcIdEnabled(Boolean proxyProtocolVpcIdEnabled) {
		this.proxyProtocolVpcIdEnabled = proxyProtocolVpcIdEnabled;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public String getSlaveServerGroupId() {
		return this.slaveServerGroupId;
	}

	public void setSlaveServerGroupId(String slaveServerGroupId) {
		this.slaveServerGroupId = slaveServerGroupId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSynProxy() {
		return this.synProxy;
	}

	public void setSynProxy(String synProxy) {
		this.synProxy = synProxy;
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(String vpcIds) {
		this.vpcIds = vpcIds;
	}

	public String getWorkingServerGroupId() {
		return this.workingServerGroupId;
	}

	public void setWorkingServerGroupId(String workingServerGroupId) {
		this.workingServerGroupId = workingServerGroupId;
	}

	public List<PortRange> getPortRanges() {
		return this.portRanges;
	}

	public void setPortRanges(List<PortRange> portRanges) {
		this.portRanges = portRanges;
	}

	public List<String> getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(List<String> aclIds) {
		this.aclIds = aclIds;
	}

	public static class PortRange {

		private Integer endPort;

		private Integer startPort;

		public Integer getEndPort() {
			return this.endPort;
		}

		public void setEndPort(Integer endPort) {
			this.endPort = endPort;
		}

		public Integer getStartPort() {
			return this.startPort;
		}

		public void setStartPort(Integer startPort) {
			this.startPort = startPort;
		}
	}

	@Override
	public DescribeLoadBalancerTCPListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
