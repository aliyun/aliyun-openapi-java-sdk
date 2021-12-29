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
import com.aliyuncs.slb.transform.v20140515.DescribeRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRulesResponse extends AcsResponse {

	private String requestId;

	private List<Rule> rules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public static class Rule {

		private String healthCheckHttpCode;

		private String vServerGroupId;

		private String domain;

		private String cookie;

		private Integer healthCheckInterval;

		private String url;

		private String healthCheckURI;

		private String stickySessionType;

		private String ruleName;

		private String ruleId;

		private String serviceManagedMode;

		private Integer healthCheckConnectPort;

		private String scheduler;

		private Integer healthCheckTimeout;

		private String listenerSync;

		private Integer healthyThreshold;

		private Integer cookieTimeout;

		private String healthCheckDomain;

		private Integer unhealthyThreshold;

		private String stickySession;

		private String healthCheck;

		public String getHealthCheckHttpCode() {
			return this.healthCheckHttpCode;
		}

		public void setHealthCheckHttpCode(String healthCheckHttpCode) {
			this.healthCheckHttpCode = healthCheckHttpCode;
		}

		public String getVServerGroupId() {
			return this.vServerGroupId;
		}

		public void setVServerGroupId(String vServerGroupId) {
			this.vServerGroupId = vServerGroupId;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getCookie() {
			return this.cookie;
		}

		public void setCookie(String cookie) {
			this.cookie = cookie;
		}

		public Integer getHealthCheckInterval() {
			return this.healthCheckInterval;
		}

		public void setHealthCheckInterval(Integer healthCheckInterval) {
			this.healthCheckInterval = healthCheckInterval;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
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

		public String getScheduler() {
			return this.scheduler;
		}

		public void setScheduler(String scheduler) {
			this.scheduler = scheduler;
		}

		public Integer getHealthCheckTimeout() {
			return this.healthCheckTimeout;
		}

		public void setHealthCheckTimeout(Integer healthCheckTimeout) {
			this.healthCheckTimeout = healthCheckTimeout;
		}

		public String getListenerSync() {
			return this.listenerSync;
		}

		public void setListenerSync(String listenerSync) {
			this.listenerSync = listenerSync;
		}

		public Integer getHealthyThreshold() {
			return this.healthyThreshold;
		}

		public void setHealthyThreshold(Integer healthyThreshold) {
			this.healthyThreshold = healthyThreshold;
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

		public String getStickySession() {
			return this.stickySession;
		}

		public void setStickySession(String stickySession) {
			this.stickySession = stickySession;
		}

		public String getHealthCheck() {
			return this.healthCheck;
		}

		public void setHealthCheck(String healthCheck) {
			this.healthCheck = healthCheck;
		}
	}

	@Override
	public DescribeRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
