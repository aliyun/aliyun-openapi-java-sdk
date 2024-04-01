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
public class CreateLoadBalancerHTTPListenerRequest extends RpcAcsRequest<CreateLoadBalancerHTTPListenerResponse> {
	   

	private Long resourceOwnerId;

	private Integer healthCheckTimeout;

	private String xForwardedFor;

	private String hostId;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String scheduler;

	private String healthCheck;

	private Integer cookieTimeout;

	private String stickySessionType;

	private Integer listenerPort;

	private String cookie;

	private String stickySession;

	private Integer bandwidth;

	private String ownerAccount;

	private String ownerId;

	private String uRI;

	private String listenerStatus;

	private String loadBalancerId;

	private Integer backendServerPort;

	private String domain;

	private Integer interval;
	public CreateLoadBalancerHTTPListenerRequest() {
		super("Slb", "2013-02-21", "CreateLoadBalancerHTTPListener", "slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getHealthCheckTimeout() {
		return this.healthCheckTimeout;
	}

	public void setHealthCheckTimeout(Integer healthCheckTimeout) {
		this.healthCheckTimeout = healthCheckTimeout;
		if(healthCheckTimeout != null){
			putQueryParameter("HealthCheckTimeout", healthCheckTimeout.toString());
		}
	}

	public String getXForwardedFor() {
		return this.xForwardedFor;
	}

	public void setXForwardedFor(String xForwardedFor) {
		this.xForwardedFor = xForwardedFor;
		if(xForwardedFor != null){
			putQueryParameter("XForwardedFor", xForwardedFor);
		}
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

	public Integer getCookieTimeout() {
		return this.cookieTimeout;
	}

	public void setCookieTimeout(Integer cookieTimeout) {
		this.cookieTimeout = cookieTimeout;
		if(cookieTimeout != null){
			putQueryParameter("CookieTimeout", cookieTimeout.toString());
		}
	}

	public String getStickySessionType() {
		return this.stickySessionType;
	}

	public void setStickySessionType(String stickySessionType) {
		this.stickySessionType = stickySessionType;
		if(stickySessionType != null){
			putQueryParameter("StickySessionType", stickySessionType);
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

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
		if(cookie != null){
			putQueryParameter("Cookie", cookie);
		}
	}

	public String getStickySession() {
		return this.stickySession;
	}

	public void setStickySession(String stickySession) {
		this.stickySession = stickySession;
		if(stickySession != null){
			putQueryParameter("StickySession", stickySession);
		}
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
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

	public String getURI() {
		return this.uRI;
	}

	public void setURI(String uRI) {
		this.uRI = uRI;
		if(uRI != null){
			putQueryParameter("URI", uRI);
		}
	}

	public String getListenerStatus() {
		return this.listenerStatus;
	}

	public void setListenerStatus(String listenerStatus) {
		this.listenerStatus = listenerStatus;
		if(listenerStatus != null){
			putQueryParameter("ListenerStatus", listenerStatus);
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

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
		if(backendServerPort != null){
			putQueryParameter("BackendServerPort", backendServerPort.toString());
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
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
	public Class<CreateLoadBalancerHTTPListenerResponse> getResponseClass() {
		return CreateLoadBalancerHTTPListenerResponse.class;
	}

}
