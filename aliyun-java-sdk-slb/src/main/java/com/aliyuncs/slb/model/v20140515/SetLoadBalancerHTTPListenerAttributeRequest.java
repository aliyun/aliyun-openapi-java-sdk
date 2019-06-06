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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetLoadBalancerHTTPListenerAttributeRequest extends RpcAcsRequest<SetLoadBalancerHTTPListenerAttributeResponse> {
	
	public SetLoadBalancerHTTPListenerAttributeRequest() {
		super("Slb", "2014-05-15", "SetLoadBalancerHTTPListenerAttribute", "slb");
	}

	private Long resourceOwnerId;

	private Integer healthCheckTimeout;

	private String xForwardedFor;

	private String healthCheckURI;

	private String description;

	private Integer unhealthyThreshold;

	private Integer healthyThreshold;

	private String aclStatus;

	private String scheduler;

	private String aclType;

	private String healthCheck;

	private Integer cookieTimeout;

	private String stickySessionType;

	private String vServerGroupId;

	private String aclId;

	private Integer listenerPort;

	private String cookie;

	private String resourceOwnerAccount;

	private Integer bandwidth;

	private String stickySession;

	private String healthCheckDomain;

	private Integer requestTimeout;

	private String ownerAccount;

	private String gzip;

	private Long ownerId;

	private Integer idleTimeout;

	private String loadBalancerId;

	private String xForwardedFor_SLBIP;

	private Integer healthCheckInterval;

	private String xForwardedFor_proto;

	private String xForwardedFor_SLBID;

	private Integer healthCheckConnectPort;

	private String healthCheckHttpCode;

	private String vServerGroup;

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

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
		if(healthCheckURI != null){
			putQueryParameter("HealthCheckURI", healthCheckURI);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
		if(aclStatus != null){
			putQueryParameter("AclStatus", aclStatus);
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

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
		if(aclType != null){
			putQueryParameter("AclType", aclType);
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

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		if(vServerGroupId != null){
			putQueryParameter("VServerGroupId", vServerGroupId);
		}
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
		if(aclId != null){
			putQueryParameter("AclId", aclId);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	public String getStickySession() {
		return this.stickySession;
	}

	public void setStickySession(String stickySession) {
		this.stickySession = stickySession;
		if(stickySession != null){
			putQueryParameter("StickySession", stickySession);
		}
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
		if(healthCheckDomain != null){
			putQueryParameter("HealthCheckDomain", healthCheckDomain);
		}
	}

	public Integer getRequestTimeout() {
		return this.requestTimeout;
	}

	public void setRequestTimeout(Integer requestTimeout) {
		this.requestTimeout = requestTimeout;
		if(requestTimeout != null){
			putQueryParameter("RequestTimeout", requestTimeout.toString());
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

	public String getGzip() {
		return this.gzip;
	}

	public void setGzip(String gzip) {
		this.gzip = gzip;
		if(gzip != null){
			putQueryParameter("Gzip", gzip);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
		if(idleTimeout != null){
			putQueryParameter("IdleTimeout", idleTimeout.toString());
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

	public String getXForwardedFor_SLBIP() {
		return this.xForwardedFor_SLBIP;
	}

	public void setXForwardedFor_SLBIP(String xForwardedFor_SLBIP) {
		this.xForwardedFor_SLBIP = xForwardedFor_SLBIP;
		if(xForwardedFor_SLBIP != null){
			putQueryParameter("XForwardedFor_SLBIP", xForwardedFor_SLBIP);
		}
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
		if(healthCheckInterval != null){
			putQueryParameter("HealthCheckInterval", healthCheckInterval.toString());
		}
	}

	public String getXForwardedFor_proto() {
		return this.xForwardedFor_proto;
	}

	public void setXForwardedFor_proto(String xForwardedFor_proto) {
		this.xForwardedFor_proto = xForwardedFor_proto;
		if(xForwardedFor_proto != null){
			putQueryParameter("XForwardedFor_proto", xForwardedFor_proto);
		}
	}

	public String getXForwardedFor_SLBID() {
		return this.xForwardedFor_SLBID;
	}

	public void setXForwardedFor_SLBID(String xForwardedFor_SLBID) {
		this.xForwardedFor_SLBID = xForwardedFor_SLBID;
		if(xForwardedFor_SLBID != null){
			putQueryParameter("XForwardedFor_SLBID", xForwardedFor_SLBID);
		}
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
		if(healthCheckConnectPort != null){
			putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort.toString());
		}
	}

	public String getHealthCheckHttpCode() {
		return this.healthCheckHttpCode;
	}

	public void setHealthCheckHttpCode(String healthCheckHttpCode) {
		this.healthCheckHttpCode = healthCheckHttpCode;
		if(healthCheckHttpCode != null){
			putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
		}
	}

	public String getVServerGroup() {
		return this.vServerGroup;
	}

	public void setVServerGroup(String vServerGroup) {
		this.vServerGroup = vServerGroup;
		if(vServerGroup != null){
			putQueryParameter("VServerGroup", vServerGroup);
		}
	}

	@Override
	public Class<SetLoadBalancerHTTPListenerAttributeResponse> getResponseClass() {
		return SetLoadBalancerHTTPListenerAttributeResponse.class;
	}

}
