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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateListenerAttributeRequest extends RpcAcsRequest<UpdateListenerAttributeResponse> {
	   

	private List<String> caCertificateIdss;

	private String clientToken;

	private Boolean secSensorEnabled;

	private String alpnPolicy;

	private Integer mss;

	private String serverGroupId;

	private String listenerId;

	private List<String> certificateIdss;

	private Boolean alpnEnabled;

	private Boolean dryRun;

	private Boolean proxyProtocolEnabled;

	private Integer cps;

	private String securityPolicyId;

	private Integer idleTimeout;

	private String listenerDescription;

	private Boolean caEnabled;
	public UpdateListenerAttributeRequest() {
		super("Nlb", "2022-04-30", "UpdateListenerAttribute", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getCaCertificateIdss() {
		return this.caCertificateIdss;
	}

	public void setCaCertificateIdss(List<String> caCertificateIdss) {
		this.caCertificateIdss = caCertificateIdss;	
		if (caCertificateIdss != null) {
			for (int i = 0; i < caCertificateIdss.size(); i++) {
				putBodyParameter("CaCertificateIds." + (i + 1) , caCertificateIdss.get(i));
			}
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public Boolean getSecSensorEnabled() {
		return this.secSensorEnabled;
	}

	public void setSecSensorEnabled(Boolean secSensorEnabled) {
		this.secSensorEnabled = secSensorEnabled;
		if(secSensorEnabled != null){
			putBodyParameter("SecSensorEnabled", secSensorEnabled.toString());
		}
	}

	public String getAlpnPolicy() {
		return this.alpnPolicy;
	}

	public void setAlpnPolicy(String alpnPolicy) {
		this.alpnPolicy = alpnPolicy;
		if(alpnPolicy != null){
			putBodyParameter("AlpnPolicy", alpnPolicy);
		}
	}

	public Integer getMss() {
		return this.mss;
	}

	public void setMss(Integer mss) {
		this.mss = mss;
		if(mss != null){
			putBodyParameter("Mss", mss.toString());
		}
	}

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
		if(serverGroupId != null){
			putBodyParameter("ServerGroupId", serverGroupId);
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putBodyParameter("ListenerId", listenerId);
		}
	}

	public List<String> getCertificateIdss() {
		return this.certificateIdss;
	}

	public void setCertificateIdss(List<String> certificateIdss) {
		this.certificateIdss = certificateIdss;	
		if (certificateIdss != null) {
			for (int i = 0; i < certificateIdss.size(); i++) {
				putBodyParameter("CertificateIds." + (i + 1) , certificateIdss.get(i));
			}
		}	
	}

	public Boolean getAlpnEnabled() {
		return this.alpnEnabled;
	}

	public void setAlpnEnabled(Boolean alpnEnabled) {
		this.alpnEnabled = alpnEnabled;
		if(alpnEnabled != null){
			putBodyParameter("AlpnEnabled", alpnEnabled.toString());
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public Boolean getProxyProtocolEnabled() {
		return this.proxyProtocolEnabled;
	}

	public void setProxyProtocolEnabled(Boolean proxyProtocolEnabled) {
		this.proxyProtocolEnabled = proxyProtocolEnabled;
		if(proxyProtocolEnabled != null){
			putBodyParameter("ProxyProtocolEnabled", proxyProtocolEnabled.toString());
		}
	}

	public Integer getCps() {
		return this.cps;
	}

	public void setCps(Integer cps) {
		this.cps = cps;
		if(cps != null){
			putBodyParameter("Cps", cps.toString());
		}
	}

	public String getSecurityPolicyId() {
		return this.securityPolicyId;
	}

	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
		if(securityPolicyId != null){
			putBodyParameter("SecurityPolicyId", securityPolicyId);
		}
	}

	public Integer getIdleTimeout() {
		return this.idleTimeout;
	}

	public void setIdleTimeout(Integer idleTimeout) {
		this.idleTimeout = idleTimeout;
		if(idleTimeout != null){
			putBodyParameter("IdleTimeout", idleTimeout.toString());
		}
	}

	public String getListenerDescription() {
		return this.listenerDescription;
	}

	public void setListenerDescription(String listenerDescription) {
		this.listenerDescription = listenerDescription;
		if(listenerDescription != null){
			putBodyParameter("ListenerDescription", listenerDescription);
		}
	}

	public Boolean getCaEnabled() {
		return this.caEnabled;
	}

	public void setCaEnabled(Boolean caEnabled) {
		this.caEnabled = caEnabled;
		if(caEnabled != null){
			putBodyParameter("CaEnabled", caEnabled.toString());
		}
	}

	@Override
	public Class<UpdateListenerAttributeResponse> getResponseClass() {
		return UpdateListenerAttributeResponse.class;
	}

}
