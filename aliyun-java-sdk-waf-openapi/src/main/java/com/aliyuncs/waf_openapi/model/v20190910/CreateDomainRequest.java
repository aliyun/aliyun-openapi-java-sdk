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

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDomainRequest extends RpcAcsRequest<CreateDomainResponse> {
	   

	private String resourceGroupId;

	private String httpPort;

	private String http2Port;

	private Integer writeTime;

	private String logHeaders;

	private Integer connectionTime;

	private Integer clusterType;

	private Integer httpsRedirect;

	private String instanceId;

	private String sourceIps;

	private String domain;

	private Integer isAccessProduct;

	private Integer readTime;

	private String httpsPort;

	private Integer loadBalancing;

	private Integer httpToUserIp;
	public CreateDomainRequest() {
		super("waf-openapi", "2019-09-10", "CreateDomain", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
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

	public String getHttp2Port() {
		return this.http2Port;
	}

	public void setHttp2Port(String http2Port) {
		this.http2Port = http2Port;
		if(http2Port != null){
			putQueryParameter("Http2Port", http2Port);
		}
	}

	public Integer getWriteTime() {
		return this.writeTime;
	}

	public void setWriteTime(Integer writeTime) {
		this.writeTime = writeTime;
		if(writeTime != null){
			putQueryParameter("WriteTime", writeTime.toString());
		}
	}

	public String getLogHeaders() {
		return this.logHeaders;
	}

	public void setLogHeaders(String logHeaders) {
		this.logHeaders = logHeaders;
		if(logHeaders != null){
			putQueryParameter("LogHeaders", logHeaders);
		}
	}

	public Integer getConnectionTime() {
		return this.connectionTime;
	}

	public void setConnectionTime(Integer connectionTime) {
		this.connectionTime = connectionTime;
		if(connectionTime != null){
			putQueryParameter("ConnectionTime", connectionTime.toString());
		}
	}

	public Integer getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(Integer clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType.toString());
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

	public Integer getReadTime() {
		return this.readTime;
	}

	public void setReadTime(Integer readTime) {
		this.readTime = readTime;
		if(readTime != null){
			putQueryParameter("ReadTime", readTime.toString());
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
	public Class<CreateDomainResponse> getResponseClass() {
		return CreateDomainResponse.class;
	}

}
