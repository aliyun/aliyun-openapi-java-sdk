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

package com.aliyuncs.nlb.model.v20220430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlb.transform.v20220430.GetListenerAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetListenerAttributeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String regionId;

	private String loadBalancerId;

	private String listenerId;

	private String listenerProtocol;

	private Integer listenerPort;

	private String startPort;

	private String endPort;

	private String listenerDescription;

	private String serverGroupId;

	private Integer idleTimeout;

	private String securityPolicyId;

	private Boolean caEnabled;

	private Boolean alpnEnabled;

	private String alpnPolicy;

	private Boolean proxyProtocolEnabled;

	private Boolean secSensorEnabled;

	private String listenerStatus;

	private Integer cps;

	private Integer mss;

	private List<Tag> tags;

	private List<String> certificateIds;

	private List<String> caCertificateIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
	}

	public String getListenerProtocol() {
		return this.listenerProtocol;
	}

	public void setListenerProtocol(String listenerProtocol) {
		this.listenerProtocol = listenerProtocol;
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
	}

	public String getStartPort() {
		return this.startPort;
	}

	public void setStartPort(String startPort) {
		this.startPort = startPort;
	}

	public String getEndPort() {
		return this.endPort;
	}

	public void setEndPort(String endPort) {
		this.endPort = endPort;
	}

	public String getListenerDescription() {
		return this.listenerDescription;
	}

	public void setListenerDescription(String listenerDescription) {
		this.listenerDescription = listenerDescription;
	}

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
	}

	public String getSecurityPolicyId() {
		return this.securityPolicyId;
	}

	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
	}

	public Boolean getCaEnabled() {
		return this.caEnabled;
	}

	public void setCaEnabled(Boolean caEnabled) {
		this.caEnabled = caEnabled;
	}

	public Boolean getAlpnEnabled() {
		return this.alpnEnabled;
	}

	public void setAlpnEnabled(Boolean alpnEnabled) {
		this.alpnEnabled = alpnEnabled;
	}

	public String getAlpnPolicy() {
		return this.alpnPolicy;
	}

	public void setAlpnPolicy(String alpnPolicy) {
		this.alpnPolicy = alpnPolicy;
	}

	public Boolean getProxyProtocolEnabled() {
		return this.proxyProtocolEnabled;
	}

	public void setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
		this.proxyProtocolEnabled = proxyProtocolEnabled;
	}

	public Boolean getSecSensorEnabled() {
		return this.secSensorEnabled;
	}

	public void setSecSensorEnabled(Boolean secSensorEnabled) {
		this.secSensorEnabled = secSensorEnabled;
	}

	public String getListenerStatus() {
		return this.listenerStatus;
	}

	public void setListenerStatus(String listenerStatus) {
		this.listenerStatus = listenerStatus;
	}

	public Integer getCps() {
		return this.cps;
	}

	public void setCps(Integer cps) {
		this.cps = cps;
	}

	public Integer getMss() {
		return this.mss;
	}

	public void setMss(Integer mss) {
		this.mss = mss;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getCertificateIds() {
		return this.certificateIds;
	}

	public void setCertificateIds(List<String> certificateIds) {
		this.certificateIds = certificateIds;
	}

	public List<String> getCaCertificateIds() {
		return this.caCertificateIds;
	}

	public void setCaCertificateIds(List<String> caCertificateIds) {
		this.caCertificateIds = caCertificateIds;
	}

	public static class Tag {

		private String tagKey;

		private String tagValue;

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}
	}

	@Override
	public GetListenerAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetListenerAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
