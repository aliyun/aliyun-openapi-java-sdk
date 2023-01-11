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
public class CreateListenerRequest extends RpcAcsRequest<CreateListenerResponse> {
	   

	private List<String> caCertificateIdss;

	private Integer startPort;

	private String clientToken;

	private Boolean secSensorEnabled;

	private String alpnPolicy;

	private Integer mss;

	private String serverGroupId;

	private List<String> certificateIdss;

	private Boolean alpnEnabled;

	private Integer endPort;

	private Integer listenerPort;

	private Boolean dryRun;

	private Boolean proxyProtocolEnabled;

	private Integer cps;

	private String listenerProtocol;

	private String securityPolicyId;

	private Integer idleTimeout;

	private String loadBalancerId;

	private String listenerDescription;

	private Boolean caEnabled;
	public CreateListenerRequest() {
		super("Nlb", "2022-04-30", "CreateListener", "nlb");
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

	public Integer getStartPort() {
		return this.startPort;
	}

	public void setStartPort(Integer startPort) {
		this.startPort = startPort;
		if(startPort != null){
			putBodyParameter("StartPort", startPort.toString());
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

	public Integer getEndPort() {
		return this.endPort;
	}

	public void setEndPort(Integer endPort) {
		this.endPort = endPort;
		if(endPort != null){
			putBodyParameter("EndPort", endPort.toString());
		}
	}

	public Integer getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(Integer listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putBodyParameter("ListenerPort", listenerPort.toString());
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

	public String getListenerProtocol() {
		return this.listenerProtocol;
	}

	public void setListenerProtocol(String listenerProtocol) {
		this.listenerProtocol = listenerProtocol;
		if(listenerProtocol != null){
			putBodyParameter("ListenerProtocol", listenerProtocol);
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

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putBodyParameter("LoadBalancerId", loadBalancerId);
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
	public Class<CreateListenerResponse> getResponseClass() {
		return CreateListenerResponse.class;
	}

}
