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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebRulesResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<WebRule> webRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<WebRule> getWebRules() {
		return this.webRules;
	}

	public void setWebRules(List<WebRule> webRules) {
		this.webRules = webRules;
	}

	public static class WebRule {

		private String domain;

		private Boolean ccEnabled;

		private Boolean ccRuleEnabled;

		private String ccTemplate;

		private String sslProtocols;

		private String sslCiphers;

		private Boolean http2Enable;

		private String cname;

		private String certName;

		private List<ProxyConfig> proxyTypes;

		private List<RealServer> realServers;

		private List<String> whiteList;

		private List<String> blackList;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Boolean getCcEnabled() {
			return this.ccEnabled;
		}

		public void setCcEnabled(Boolean ccEnabled) {
			this.ccEnabled = ccEnabled;
		}

		public Boolean getCcRuleEnabled() {
			return this.ccRuleEnabled;
		}

		public void setCcRuleEnabled(Boolean ccRuleEnabled) {
			this.ccRuleEnabled = ccRuleEnabled;
		}

		public String getCcTemplate() {
			return this.ccTemplate;
		}

		public void setCcTemplate(String ccTemplate) {
			this.ccTemplate = ccTemplate;
		}

		public String getSslProtocols() {
			return this.sslProtocols;
		}

		public void setSslProtocols(String sslProtocols) {
			this.sslProtocols = sslProtocols;
		}

		public String getSslCiphers() {
			return this.sslCiphers;
		}

		public void setSslCiphers(String sslCiphers) {
			this.sslCiphers = sslCiphers;
		}

		public Boolean getHttp2Enable() {
			return this.http2Enable;
		}

		public void setHttp2Enable(Boolean http2Enable) {
			this.http2Enable = http2Enable;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
		}

		public List<ProxyConfig> getProxyTypes() {
			return this.proxyTypes;
		}

		public void setProxyTypes(List<ProxyConfig> proxyTypes) {
			this.proxyTypes = proxyTypes;
		}

		public List<RealServer> getRealServers() {
			return this.realServers;
		}

		public void setRealServers(List<RealServer> realServers) {
			this.realServers = realServers;
		}

		public List<String> getWhiteList() {
			return this.whiteList;
		}

		public void setWhiteList(List<String> whiteList) {
			this.whiteList = whiteList;
		}

		public List<String> getBlackList() {
			return this.blackList;
		}

		public void setBlackList(List<String> blackList) {
			this.blackList = blackList;
		}

		public static class ProxyConfig {

			private String proxyType;

			private List<String> proxyPorts;

			public String getProxyType() {
				return this.proxyType;
			}

			public void setProxyType(String proxyType) {
				this.proxyType = proxyType;
			}

			public List<String> getProxyPorts() {
				return this.proxyPorts;
			}

			public void setProxyPorts(List<String> proxyPorts) {
				this.proxyPorts = proxyPorts;
			}
		}

		public static class RealServer {

			private Integer rsType;

			private String realServer;

			public Integer getRsType() {
				return this.rsType;
			}

			public void setRsType(Integer rsType) {
				this.rsType = rsType;
			}

			public String getRealServer() {
				return this.realServer;
			}

			public void setRealServer(String realServer) {
				this.realServer = realServer;
			}
		}
	}

	@Override
	public DescribeWebRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
