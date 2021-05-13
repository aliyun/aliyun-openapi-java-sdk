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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDomainResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainResourceResponse extends AcsResponse {

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

		private Integer rsType;

		private Boolean ccEnabled;

		private Boolean ccRuleEnabled;

		private String ccTemplate;

		private String sslProtocols;

		private String sslCiphers;

		private Boolean http2Enable;

		private Boolean http2HttpsEnable;

		private Boolean https2HttpEnable;

		private String policyMode;

		private Boolean proxyEnabled;

		private Boolean ssl13Enabled;

		private Boolean punishStatus;

		private Integer punishReason;

		private String cname;

		private String certName;

		private String httpsExt;

		private List<ProxyConfig> proxyTypes;

		private List<String> realServers;

		private List<String> whiteList;

		private List<String> blackList;

		private List<String> customCiphers;

		private List<String> instanceIds;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Integer getRsType() {
			return this.rsType;
		}

		public void setRsType(Integer rsType) {
			this.rsType = rsType;
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

		public Boolean getHttp2HttpsEnable() {
			return this.http2HttpsEnable;
		}

		public void setHttp2HttpsEnable(Boolean http2HttpsEnable) {
			this.http2HttpsEnable = http2HttpsEnable;
		}

		public Boolean getHttps2HttpEnable() {
			return this.https2HttpEnable;
		}

		public void setHttps2HttpEnable(Boolean https2HttpEnable) {
			this.https2HttpEnable = https2HttpEnable;
		}

		public String getPolicyMode() {
			return this.policyMode;
		}

		public void setPolicyMode(String policyMode) {
			this.policyMode = policyMode;
		}

		public Boolean getProxyEnabled() {
			return this.proxyEnabled;
		}

		public void setProxyEnabled(Boolean proxyEnabled) {
			this.proxyEnabled = proxyEnabled;
		}

		public Boolean getSsl13Enabled() {
			return this.ssl13Enabled;
		}

		public void setSsl13Enabled(Boolean ssl13Enabled) {
			this.ssl13Enabled = ssl13Enabled;
		}

		public Boolean getPunishStatus() {
			return this.punishStatus;
		}

		public void setPunishStatus(Boolean punishStatus) {
			this.punishStatus = punishStatus;
		}

		public Integer getPunishReason() {
			return this.punishReason;
		}

		public void setPunishReason(Integer punishReason) {
			this.punishReason = punishReason;
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

		public String getHttpsExt() {
			return this.httpsExt;
		}

		public void setHttpsExt(String httpsExt) {
			this.httpsExt = httpsExt;
		}

		public List<ProxyConfig> getProxyTypes() {
			return this.proxyTypes;
		}

		public void setProxyTypes(List<ProxyConfig> proxyTypes) {
			this.proxyTypes = proxyTypes;
		}

		public List<String> getRealServers() {
			return this.realServers;
		}

		public void setRealServers(List<String> realServers) {
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

		public List<String> getCustomCiphers() {
			return this.customCiphers;
		}

		public void setCustomCiphers(List<String> customCiphers) {
			this.customCiphers = customCiphers;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
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
	}

	@Override
	public DescribeDomainResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
