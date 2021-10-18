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

package com.aliyuncs.waf_openapi.model.v20180117;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDomainConfigRequest extends RpcAcsRequest<ModifyDomainConfigResponse> {
	   

	private String httpPort;

	private String protocols;

	private Integer httpsRedirect;

	private String instanceId;

	private String sourceIps;

	private String domain;

	private Integer isAccessProduct;

	private String httpsPort;

	private String region;

	private Integer loadBalancing;

	private Integer httpToUserIp;
	public ModifyDomainConfigRequest() {
		super("waf-openapi", "2018-01-17", "ModifyDomainConfig", "waf");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHttpPort() {
		return this.httpPort;
	}

	public void setHttpPort(String httpPort) {
		this.httpPort = httpPort;
		if(httpPort != null){
			putQueryParameter("HttpPort", httpPort);
		}
	}

	public String getProtocols() {
		return this.protocols;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
		if(protocols != null){
			putQueryParameter("Protocols", protocols);
		}
	}

	public Integer getHttpsRedirect() {
		return this.httpsRedirect;
	}

	public void setHttpsRedirect(Integer httpsRedirect) {
		this.httpsRedirect = httpsRedirect;
		if(httpsRedirect != null){
			putQueryParameter("HttpsRedirect", httpsRedirect.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSourceIps() {
		return this.sourceIps;
	}

	public void setSourceIps(String sourceIps) {
		this.sourceIps = sourceIps;
		if(sourceIps != null){
			putQueryParameter("SourceIps", sourceIps);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public Integer getIsAccessProduct() {
		return this.isAccessProduct;
	}

	public void setIsAccessProduct(Integer isAccessProduct) {
		this.isAccessProduct = isAccessProduct;
		if(isAccessProduct != null){
			putQueryParameter("IsAccessProduct", isAccessProduct.toString());
		}
	}

	public String getHttpsPort() {
		return this.httpsPort;
	}

	public void setHttpsPort(String httpsPort) {
		this.httpsPort = httpsPort;
		if(httpsPort != null){
			putQueryParameter("HttpsPort", httpsPort);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public Integer getLoadBalancing() {
		return this.loadBalancing;
	}

	public void setLoadBalancing(Integer loadBalancing) {
		this.loadBalancing = loadBalancing;
		if(loadBalancing != null){
			putQueryParameter("LoadBalancing", loadBalancing.toString());
		}
	}

	public Integer getHttpToUserIp() {
		return this.httpToUserIp;
	}

	public void setHttpToUserIp(Integer httpToUserIp) {
		this.httpToUserIp = httpToUserIp;
		if(httpToUserIp != null){
			putQueryParameter("HttpToUserIp", httpToUserIp.toString());
		}
	}

	@Override
	public Class<ModifyDomainConfigResponse> getResponseClass() {
		return ModifyDomainConfigResponse.class;
	}

}
