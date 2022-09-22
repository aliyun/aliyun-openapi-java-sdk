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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateListenerRequest extends RpcAcsRequest<UpdateListenerResponse> {
	   

	private String clientToken;

	private String description;

	private List<BackendPorts> backendPortss;

	private String listenerId;

	private String protocol;

	private XForwardedForConfig xForwardedForConfig;

	private String securityPolicyId;

	private String proxyProtocol;

	private List<PortRanges> portRangess;

	private List<Certificates> certificatess;

	private String name;

	private String clientAffinity;
	public UpdateListenerRequest() {
		super("Ga", "2019-11-20", "UpdateListener", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public List<BackendPorts> getBackendPortss() {
		return this.backendPortss;
	}

	public void setBackendPortss(List<BackendPorts> backendPortss) {
		this.backendPortss = backendPortss;	
		if (backendPortss != null) {
			for (int depth1 = 0; depth1 < backendPortss.size(); depth1++) {
				putQueryParameter("BackendPorts." + (depth1 + 1) + ".FromPort" , backendPortss.get(depth1).getFromPort());
				putQueryParameter("BackendPorts." + (depth1 + 1) + ".ToPort" , backendPortss.get(depth1).getToPort());
			}
		}	
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public XForwardedForConfig getXForwardedForConfig() {
		return this.xForwardedForConfig;
	}

	public void setXForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
		this.xForwardedForConfig = xForwardedForConfig;	
		if (xForwardedForConfig != null) {
			
				putQueryParameter("XForwardedForConfig.XForwardedForGaIdEnabled" , xForwardedForConfig.getXForwardedForGaIdEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForProtoEnabled" , xForwardedForConfig.getXForwardedForProtoEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForPortEnabled" , xForwardedForConfig.getXForwardedForPortEnabled());
				putQueryParameter("XForwardedForConfig.XRealIpEnabled" , xForwardedForConfig.getXRealIpEnabled());
				putQueryParameter("XForwardedForConfig.XForwardedForGaApEnabled" , xForwardedForConfig.getXForwardedForGaApEnabled());
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

	public String getProxyProtocol() {
		return this.proxyProtocol;
	}

	public void setProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
		if(proxyProtocol != null){
			putQueryParameter("ProxyProtocol", proxyProtocol);
		}
	}

	public List<PortRanges> getPortRangess() {
		return this.portRangess;
	}

	public void setPortRangess(List<PortRanges> portRangess) {
		this.portRangess = portRangess;	
		if (portRangess != null) {
			for (int depth1 = 0; depth1 < portRangess.size(); depth1++) {
				putQueryParameter("PortRanges." + (depth1 + 1) + ".FromPort" , portRangess.get(depth1).getFromPort());
				putQueryParameter("PortRanges." + (depth1 + 1) + ".ToPort" , portRangess.get(depth1).getToPort());
			}
		}	
	}

	public List<Certificates> getCertificatess() {
		return this.certificatess;
	}

	public void setCertificatess(List<Certificates> certificatess) {
		this.certificatess = certificatess;	
		if (certificatess != null) {
			for (int depth1 = 0; depth1 < certificatess.size(); depth1++) {
				putQueryParameter("Certificates." + (depth1 + 1) + ".Id" , certificatess.get(depth1).getId());
			}
		}	
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getClientAffinity() {
		return this.clientAffinity;
	}

	public void setClientAffinity(String clientAffinity) {
		this.clientAffinity = clientAffinity;
		if(clientAffinity != null){
			putQueryParameter("ClientAffinity", clientAffinity);
		}
	}

	public static class BackendPorts {

		private Integer fromPort;

		private Integer toPort;

		public Integer getFromPort() {
			return this.fromPort;
		}

		public void setFromPort(Integer fromPort) {
			this.fromPort = fromPort;
		}

		public Integer getToPort() {
			return this.toPort;
		}

		public void setToPort(Integer toPort) {
			this.toPort = toPort;
		}
	}

	public static class XForwardedForConfig {

		private Boolean xForwardedForGaIdEnabled;

		private Boolean xForwardedForProtoEnabled;

		private Boolean xForwardedForPortEnabled;

		private Boolean xRealIpEnabled;

		private Boolean xForwardedForGaApEnabled;

		public Boolean getXForwardedForGaIdEnabled() {
			return this.xForwardedForGaIdEnabled;
		}

		public void setXForwardedForGaIdEnabled(Boolean xForwardedForGaIdEnabled) {
			this.xForwardedForGaIdEnabled = xForwardedForGaIdEnabled;
		}

		public Boolean getXForwardedForProtoEnabled() {
			return this.xForwardedForProtoEnabled;
		}

		public void setXForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
			this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
		}

		public Boolean getXForwardedForPortEnabled() {
			return this.xForwardedForPortEnabled;
		}

		public void setXForwardedForPortEnabled(Boolean xForwardedForPortEnabled) {
			this.xForwardedForPortEnabled = xForwardedForPortEnabled;
		}

		public Boolean getXRealIpEnabled() {
			return this.xRealIpEnabled;
		}

		public void setXRealIpEnabled(Boolean xRealIpEnabled) {
			this.xRealIpEnabled = xRealIpEnabled;
		}

		public Boolean getXForwardedForGaApEnabled() {
			return this.xForwardedForGaApEnabled;
		}

		public void setXForwardedForGaApEnabled(Boolean xForwardedForGaApEnabled) {
			this.xForwardedForGaApEnabled = xForwardedForGaApEnabled;
		}
	}

	public static class PortRanges {

		private Integer fromPort;

		private Integer toPort;

		public Integer getFromPort() {
			return this.fromPort;
		}

		public void setFromPort(Integer fromPort) {
			this.fromPort = fromPort;
		}

		public Integer getToPort() {
			return this.toPort;
		}

		public void setToPort(Integer toPort) {
			this.toPort = toPort;
		}
	}

	public static class Certificates {

		private String id;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<UpdateListenerResponse> getResponseClass() {
		return UpdateListenerResponse.class;
	}

}
