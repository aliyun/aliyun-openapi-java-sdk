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

package com.aliyuncs.slb.model.v20130221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20130221.DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerTCPListenerAttributeResponse extends AcsResponse {

	private String vServerGroupId;

	private String healthCheckHttpCode;

	private Integer connectPort;

	private String status;

	private Integer maxConnection;

	private Integer persistenceTimeout;

	private Integer listenerPort;

	private String healthCheckURI;

	private String synProxy;

	private String scheduler;

	private String requestId;

	private Integer interval;

	private Integer bandwidth;

	private Integer establishedTimeout;

	private String healthCheckType;

	private String masterSlaveServerGroupId;

	private Integer backendServerPort;

	private Integer healthyThreshold;

	private String healthCheckDomain;

	private Integer unhealthyThreshold;

	private Integer connectTimeout;

	private String healthCheck;

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
	}

	public Integer getConnectPort() {
		return this.connectPort;
	}

	public void setConnectPort(Integer connectPort) {
		this.connectPort = connectPort;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
	}

	public String getSynProxy() {
		return this.synProxy;
	}

	public void setSynProxy(String synProxy) {
		this.synProxy = synProxy;
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public Integer getEstablishedTimeout() {
		return this.establishedTimeout;
	}

	public void setEstablishedTimeout(Integer establishedTimeout) {
		this.establishedTimeout = establishedTimeout;
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

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
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

	public Integer getConnectTimeout() {
		return this.connectTimeout;
	}

	public void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}

	@Override
	public DescribeLoadBalancerTCPListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerTCPListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
