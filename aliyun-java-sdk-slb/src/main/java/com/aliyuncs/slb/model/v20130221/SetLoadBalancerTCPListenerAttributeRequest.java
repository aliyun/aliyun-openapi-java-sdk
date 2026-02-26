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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerTCPListenerAttributeRequest extends RpcAcsRequest<SetLoadBalancerTCPListenerAttributeResponse> {
	   

	private String hostId;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String scheduler;

	private String healthCheck;

	private Integer persistenceTimeout;

	private Integer connectTimeout;

	private Integer listenerPort;

	private Integer connectPort;

	private String ownerAccount;

	private String ownerId;

	private String loadBalancerId;

	private Integer interval;
	public SetLoadBalancerTCPListenerAttributeRequest() {
		super("Slb", "2013-02-21", "SetLoadBalancerTCPListenerAttribute", "slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHostId() {
		return this.hostId;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
		if(hostId != null){
			putQueryParameter("HostId", hostId);
		}
	}

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
		if(unhealthyThreshold != null){
			putQueryParameter("UnhealthyThreshold", unhealthyThreshold.toString());
		}
	}

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
		if(healthyThreshold != null){
			putQueryParameter("HealthyThreshold", healthyThreshold.toString());
		}
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
		if(scheduler != null){
			putQueryParameter("Scheduler", scheduler);
		}
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
		if(healthCheck != null){
			putQueryParameter("HealthCheck", healthCheck);
		}
	}

	public Integer getPersistenceTimeout() {
		return this.persistenceTimeout;
	}

	public void setPersistenceTimeout(Integer persistenceTimeout) {
		this.persistenceTimeout = persistenceTimeout;
		if(persistenceTimeout != null){
			putQueryParameter("PersistenceTimeout", persistenceTimeout.toString());
		}
	}

	public Integer getConnectTimeout() {
		return this.connectTimeout;
	}

	public void setConnectTimeout(Integer connectTimeout) {
		this.connectTimeout = connectTimeout;
		if(connectTimeout != null){
			putQueryParameter("ConnectTimeout", connectTimeout.toString());
		}
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putQueryParameter("ListenerPort", listenerPort.toString());
		}
	}

	public Integer getConnectPort() {
		return this.connectPort;
	}

	public void setConnectPort(Integer connectPort) {
		this.connectPort = connectPort;
		if(connectPort != null){
			putQueryParameter("ConnectPort", connectPort.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	@Override
	public Class<SetLoadBalancerTCPListenerAttributeResponse> getResponseClass() {
		return SetLoadBalancerTCPListenerAttributeResponse.class;
	}

}
