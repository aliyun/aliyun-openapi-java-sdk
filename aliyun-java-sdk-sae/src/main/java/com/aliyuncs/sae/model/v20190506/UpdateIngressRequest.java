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
public class UpdateIngressRequest extends RoaAcsRequest<UpdateIngressResponse> {
	   

	private Long ingressId;

	private String listenerPort;

	private String description;

	private String rules;

	private String certId;

	private String defaultRule;
	public UpdateIngressRequest() {
		super("sae", "2019-05-06", "UpdateIngress", "serverless");
		setUriPattern("/pop/v1/sam/ingress/Ingress");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getIngressId() {
		return this.ingressId;
	}

	public void setIngressId(Long ingressId) {
		this.ingressId = ingressId;
		if(ingressId != null){
			putQueryParameter("IngressId", ingressId.toString());
		}
	}

	public String getListenerPort() {
		return this.listenerPort;
	}

	public void setListenerPort(String listenerPort) {
		this.listenerPort = listenerPort;
		if(listenerPort != null){
			putQueryParameter("ListenerPort", listenerPort);
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
	public Class<UpdateIngressResponse> getResponseClass() {
		return UpdateIngressResponse.class;
	}

}
