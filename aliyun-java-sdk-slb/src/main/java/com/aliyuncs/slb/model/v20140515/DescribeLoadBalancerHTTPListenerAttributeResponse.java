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
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerHTTPListenerAttributeResponse extends AcsResponse {

	private String aclType;

	private String vServerGroupId;

	private String healthCheckHttpVersion;

	private String status;

	private String xForwardedFor_ClientSrcPort;

	private String cookie;

	private String gzip;

	private Integer forwardCode;

	private String serviceManagedMode;

	private Integer healthCheckConnectPort;

	private String requestId;

	private String description;

	private Integer bandwidth;

	private Integer healthCheckTimeout;

	private String healthCheckType;

	private String aclStatus;

	private Integer backendServerPort;

	private Integer cookieTimeout;

	private String healthCheckDomain;

	private Integer unhealthyThreshold;

	private Integer forwardPort;

	private String xForwardedFor_SLBID;

	private String securityStatus;

	private String healthCheckHttpCode;

	private Integer maxConnection;

	private String listenerForward;

	private String xForwardedFor;

	private Integer idleTimeout;

	private Integer requestTimeout;

	private Integer listenerPort;

	private Integer healthCheckInterval;

	private String xForwardedFor_SLBPORT;

	private String healthCheckURI;

	private String stickySessionType;

	private String aclId;

	private String scheduler;

	private String vpcIds;

	private Integer healthyThreshold;

	private String xForwardedFor_proto;

	private String xForwardedFor_SLBIP;

	private String stickySession;

	private String healthCheckMethod;

	private String healthCheck;

	private List<Rule> rules;

	private List<String> aclIds;

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
	}

	public String getHealthCheckHttpVersion() {
		return this.healthCheckHttpVersion;
	}

	public void setHealthCheckHttpVersion(String healthCheckHttpVersion) {
		this.healthCheckHttpVersion = healthCheckHttpVersion;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getXForwardedFor_ClientSrcPort() {
		return this.xForwardedFor_ClientSrcPort;
	}

	public void setXForwardedFor_ClientSrcPort(String xForwardedFor_ClientSrcPort) {
		this.xForwardedFor_ClientSrcPort = xForwardedFor_ClientSrcPort;
	}

	public String getCookie() {
		return this.cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getGzip() {
		return this.gzip;
	}

	public void setGzip(String gzip) {
		this.gzip = gzip;
	}

	public Integer getForwardCode() {
		return this.forwardCode;
	}

	public void setForwardCode(Integer forwardCode) {
		this.forwardCode = forwardCode;
	}

	public String getServiceManagedMode() {
		return this.serviceManagedMode;
	}

	public void setServiceManagedMode(String serviceManagedMode) {
		this.serviceManagedMode = serviceManagedMode;
	}

	public Integer getHealthCheckConnectPort() {
		return this.healthCheckConnectPort;
	}

	public void setHealthCheckConnectPort(Integer healthCheckConnectPort) {
		this.healthCheckConnectPort = healthCheckConnectPort;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getHealthCheckTimeout() {
		return this.healthCheckTimeout;
	}

	public void setHealthCheckTimeout(Integer healthCheckTimeout) {
		this.healthCheckTimeout = healthCheckTimeout;
	}

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
	}

	public Integer getBackendServerPort() {
		return this.backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
	}

	public Integer getCookieTimeout() {
		return this.cookieTimeout;
	}

	public void setCookieTimeout(Integer cookieTimeout) {
		this.cookieTimeout = cookieTimeout;
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

	public Integer getForwardPort() {
		return this.forwardPort;
	}

	public void setForwardPort(Integer forwardPort) {
		this.forwardPort = forwardPort;
	}

	public String getXForwardedFor_SLBID() {
		return this.xForwardedFor_SLBID;
	}

	public void setXForwardedFor_SLBID(String xForwardedFor_SLBID) {
		this.xForwardedFor_SLBID = xForwardedFor_SLBID;
	}

	public String getSecurityStatus() {
		return this.securityStatus;
	}

	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
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

	public String getListenerForward() {
		return this.listenerForward;
	}

	public void setListenerForward(String listenerForward) {
		this.listenerForward = listenerForward;
	}

	public String getXForwardedFor() {
		return this.xForwardedFor;
	}

	public void setXForwardedFor(String xForwardedFor) {
		this.xForwardedFor = xForwardedFor;
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public Integer getRequestTimeout() {
		return this.requestTimeout;
	}

	public void setRequestTimeout(Integer requestTimeout) {
		this.requestTimeout = requestTimeout;
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

	public String getXForwardedFor_SLBPORT() {
		return this.xForwardedFor_SLBPORT;
	}

	public void setXForwardedFor_SLBPORT(String xForwardedFor_SLBPORT) {
		this.xForwardedFor_SLBPORT = xForwardedFor_SLBPORT;
	}

	public String getHealthCheckURI() {
		return this.healthCheckURI;
	}

	public void setHealthCheckURI(String healthCheckURI) {
		this.healthCheckURI = healthCheckURI;
	}

	public String getStickySessionType() {
		return this.stickySessionType;
	}

	public void setStickySessionType(String stickySessionType) {
		this.stickySessionType = stickySessionType;
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

	public Integer getHealthyThreshold() {
		return this.healthyThreshold;
	}

	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}

	public String getXForwardedFor_proto() {
		return this.xForwardedFor_proto;
	}

	public void setXForwardedFor_proto(String xForwardedFor_proto) {
		this.xForwardedFor_proto = xForwardedFor_proto;
	}

	public String getXForwardedFor_SLBIP() {
		return this.xForwardedFor_SLBIP;
	}

	public void setXForwardedFor_SLBIP(String xForwardedFor_SLBIP) {
		this.xForwardedFor_SLBIP = xForwardedFor_SLBIP;
	}

	public String getStickySession() {
		return this.stickySession;
	}

	public void setStickySession(String stickySession) {
		this.stickySession = stickySession;
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

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public List<String> getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(List<String> aclIds) {
		this.aclIds = aclIds;
	}

	public static class Rule {

		private String vServerGroupId;

		private String url;

		private String domain;

		private String ruleName;

		private String ruleId;

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}
	}

	@Override
	public DescribeLoadBalancerHTTPListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerHTTPListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
