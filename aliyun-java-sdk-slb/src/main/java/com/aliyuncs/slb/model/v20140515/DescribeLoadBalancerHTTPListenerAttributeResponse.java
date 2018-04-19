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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerHTTPListenerAttributeResponse extends AcsResponse {

	private String requestId;

	private Integer listenerPort;

	private Integer backendServerPort;

	private Integer bandwidth;

	private String status;

	private String securityStatus;

	private String xForwardedFor;

	private String scheduler;

	private String stickySession;

	private String stickySessionType;

	private Integer cookieTimeout;

	private String cookie;

	private String healthCheck;

	private String healthCheckDomain;

	private String healthCheckURI;

	private Integer healthyThreshold;

	private Integer unhealthyThreshold;

	private Integer healthCheckTimeout;

	private Integer healthCheckInterval;

	private Integer healthCheckConnectPort;

	private String healthCheckHttpCode;

	private Integer maxConnection;

	private String vServerGroupId;

	private String gzip;

	private String xForwardedFor_SLBIP;

	private String xForwardedFor_SLBID;

	private String xForwardedFor_proto;

	private String aclId;

	private String aclType;

	private String aclStatus;

	private String vpcIds;

	private String listenerForward;

	private Integer forwardPort;

	private Integer requestTimeout;

	private Integer idleTimeout;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSecurityStatus() {
		return this.securityStatus;
	}

	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}

	public String getXForwardedFor() {
		return this.xForwardedFor;
	}

	public void setXForwardedFor(String xForwardedFor) {
		this.xForwardedFor = xForwardedFor;
	}

	public String getScheduler() {
		return this.scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public String getStickySession() {
		return this.stickySession;
	}

	public void setStickySession(String stickySession) {
		this.stickySession = stickySession;
	}

	public String getStickySessionType() {
		return this.stickySessionType;
	}

	public void setStickySessionType(String stickySessionType) {
		this.stickySessionType = stickySessionType;
	}

	public Integer getCookieTimeout() {
		return this.cookieTimeout;
	}

	public void setCookieTimeout(Integer cookieTimeout) {
		this.cookieTimeout = cookieTimeout;
	}

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getHealthCheck() {
		return this.healthCheck;
	}

	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}

	public String getHealthCheckDomain() {
		return this.healthCheckDomain;
	}

	public void setHealthCheckDomain(String healthCheckDomain) {
		this.healthCheckDomain = healthCheckDomain;
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

	public Integer getUnhealthyThreshold() {
		return this.unhealthyThreshold;
	}

	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}

	public Integer getHealthCheckTimeout() {
		return this.healthCheckTimeout;
	}

	public void setHealthCheckTimeout(Integer healthCheckTimeout) {
		this.healthCheckTimeout = healthCheckTimeout;
	}

	public Integer getHealthCheckInterval() {
		return this.healthCheckInterval;
	}

	public void setHealthCheckInterval(Integer healthCheckInterval) {
		this.healthCheckInterval = healthCheckInterval;
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
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

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getGzip() {
		return this.gzip;
	}

	public void setGzip(String gzip) {
		this.gzip = gzip;
	}

	public String getXForwardedFor_SLBIP() {
		return this.xForwardedFor_SLBIP;
	}

	public void setXForwardedFor_SLBIP(String xForwardedFor_SLBIP) {
		this.xForwardedFor_SLBIP = xForwardedFor_SLBIP;
	}

	public String getXForwardedFor_SLBID() {
		return this.xForwardedFor_SLBID;
	}

	public void setXForwardedFor_SLBID(String xForwardedFor_SLBID) {
		this.xForwardedFor_SLBID = xForwardedFor_SLBID;
	}

	public String getXForwardedFor_proto() {
		return this.xForwardedFor_proto;
	}

	public void setXForwardedFor_proto(String xForwardedFor_proto) {
		this.xForwardedFor_proto = xForwardedFor_proto;
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
	}

	public String getVpcIds() {
		return this.vpcIds;
	}

	public void setVpcIds(String vpcIds) {
		this.vpcIds = vpcIds;
	}

	public String getListenerForward() {
		return this.listenerForward;
	}

	public void setListenerForward(String listenerForward) {
		this.listenerForward = listenerForward;
	}

	public Integer getForwardPort() {
		return this.forwardPort;
	}

	public void setForwardPort(Integer forwardPort) {
		this.forwardPort = forwardPort;
	}

	public Integer getRequestTimeout() {
		return this.requestTimeout;
	}

	public void setRequestTimeout(Integer requestTimeout) {
		this.requestTimeout = requestTimeout;
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	@Override
	public DescribeLoadBalancerHTTPListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
