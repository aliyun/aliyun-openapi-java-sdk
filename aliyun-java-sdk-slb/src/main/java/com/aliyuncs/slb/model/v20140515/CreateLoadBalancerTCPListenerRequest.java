/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateLoadBalancerTCPListenerRequest extends RpcAcsRequest<CreateLoadBalancerTCPListenerResponse> {
	
	public CreateLoadBalancerTCPListenerRequest() {
		super("Slb", "2014-05-15", "CreateLoadBalancerTCPListener");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String loadBalancerId;

	private Integer listenerPort;

	private Integer backendServerPort;

	private Integer bandwidth;

	private String scheduler;

	private Integer persistenceTimeout;

	private Integer healthyThreshold;

	private Integer unhealthyThreshold;

	private Integer healthCheckConnectTimeout;

	private Integer healthCheckConnectPort;

	private Integer healthCheckInterval;

	private String healthCheckDomain;

	private String healthCheckURI;

	private String healthCheckHttpCode;

	private String healthCheckType;

	private Integer maxConnection;

	private String ownerAccount;

	private String access_key_id;

	private String vServerGroupId;

	private String tags;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		putQueryParameter("LoadBalancerId", loadBalancerId);
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		putQueryParameter("ListenerPort", listenerPort);
	}

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
		putQueryParameter("BackendServerPort", backendServerPort);
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		putQueryParameter("Bandwidth", bandwidth);
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		putQueryParameter("Scheduler", scheduler);
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
		putQueryParameter("PersistenceTimeout", persistenceTimeout);
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
		putQueryParameter("HealthyThreshold", healthyThreshold);
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
		putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
	}

	public Integer getHealthCheckConnectTimeout() {
		return this.healthCheckConnectTimeout;
	}

	public void setHealthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
		this.healthCheckConnectTimeout = healthCheckConnectTimeout;
		putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout);
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
	}

	public Integer gethealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void sethealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
		putQueryParameter("healthCheckInterval", healthCheckInterval);
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
		putQueryParameter("HealthCheckDomain", healthCheckDomain);
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
		putQueryParameter("HealthCheckURI", healthCheckURI);
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
		putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
	}

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
		putQueryParameter("HealthCheckType", healthCheckType);
	}

	public Integer getMaxConnection() {
		return this.maxConnection;
	}

	public void setMaxConnection(Integer maxConnection) {
		this.maxConnection = maxConnection;
		putQueryParameter("MaxConnection", maxConnection);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getaccess_key_id() {
		return this.access_key_id;
	}

	public void setaccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		putQueryParameter("access_key_id", access_key_id);
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		putQueryParameter("VServerGroupId", vServerGroupId);
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		putQueryParameter("Tags", tags);
	}

	@Override
	public Class<CreateLoadBalancerTCPListenerResponse> getResponseClass() {
		return CreateLoadBalancerTCPListenerResponse.class;
	}

}
