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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateIngressRequest extends RoaAcsRequest<CreateIngressResponse> {
	   

	private Integer listenerPort;

	private String slbId;

	private Integer requestTimeout;

	private String description;

	private String loadBalanceType;

	private String rules;

	private String certId;

	private String certIds;

	private String listenerProtocol;

	private String securityPolicyId;

	private Integer idleTimeout;

	private String namespaceId;

	private String defaultRule;
	public CreateIngressRequest() {
		super("sae", "2019-05-06", "CreateIngress", "serverless");
		setUriPattern("/pop/v1/sam/ingress/Ingress");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getSlbId() {
		return this.slbId;
	}

	public void setSlbId(String slbId) {
		this.slbId = slbId;
		if(slbId != null){
			putQueryParameter("SlbId", slbId);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getLoadBalanceType() {
		return this.loadBalanceType;
	}

	public void setLoadBalanceType(String loadBalanceType) {
		this.loadBalanceType = loadBalanceType;
		if(loadBalanceType != null){
			putQueryParameter("LoadBalanceType", loadBalanceType);
		}
	}

	public String getRules() {
		return this.rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
		if(rules != null){
			putBodyParameter("Rules", rules);
		}
	}

	public String getCertId() {
		return this.certId;
	}

	public void setCertId(String certId) {
		this.certId = certId;
		if(certId != null){
			putQueryParameter("CertId", certId);
		}
	}

	public String getCertIds() {
		return this.certIds;
	}

	public void setCertIds(String certIds) {
		this.certIds = certIds;
		if(certIds != null){
			putQueryParameter("CertIds", certIds);
		}
	}

	public String getListenerProtocol() {
		return this.listenerProtocol;
	}

	public void setListenerProtocol(String listenerProtocol) {
		this.listenerProtocol = listenerProtocol;
		if(listenerProtocol != null){
			putQueryParameter("ListenerProtocol", listenerProtocol);
		}
	}

	public String getSecurityPolicyId() {
		return this.securityPolicyId;
	}

	public void setSecurityPolicyId(String securityPolicyId) {
		this.securityPolicyId = securityPolicyId;
		if(securityPolicyId != null){
			putQueryParameter("SecurityPolicyId", securityPolicyId);
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

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public String getDefaultRule() {
		return this.defaultRule;
	}

	public void setDefaultRule(String defaultRule) {
		this.defaultRule = defaultRule;
		if(defaultRule != null){
			putQueryParameter("DefaultRule", defaultRule);
		}
	}

	@Override
	public Class<CreateIngressResponse> getResponseClass() {
		return CreateIngressResponse.class;
	}

}
