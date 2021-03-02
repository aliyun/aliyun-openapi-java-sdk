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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDnsCacheDomainRequest extends RpcAcsRequest<UpdateDnsCacheDomainResponse> {
	   

	private String sourceProtocol;

	private String lang;

	private String domainName;

	private Integer cacheTtlMax;

	private String instanceId;

	private String sourceEdns;

	private Integer cacheTtlMin;

	private List<SourceDnsServer> sourceDnsServers;
	public UpdateDnsCacheDomainRequest() {
		super("Alidns", "2015-01-09", "UpdateDnsCacheDomain", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceProtocol() {
		return this.sourceProtocol;
	}

	public void setSourceProtocol(String sourceProtocol) {
		this.sourceProtocol = sourceProtocol;
		if(sourceProtocol != null){
			putQueryParameter("SourceProtocol", sourceProtocol);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Integer getCacheTtlMax() {
		return this.cacheTtlMax;
	}

	public void setCacheTtlMax(Integer cacheTtlMax) {
		this.cacheTtlMax = cacheTtlMax;
		if(cacheTtlMax != null){
			putQueryParameter("CacheTtlMax", cacheTtlMax.toString());
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

	public String getSourceEdns() {
		return this.sourceEdns;
	}

	public void setSourceEdns(String sourceEdns) {
		this.sourceEdns = sourceEdns;
		if(sourceEdns != null){
			putQueryParameter("SourceEdns", sourceEdns);
		}
	}

	public Integer getCacheTtlMin() {
		return this.cacheTtlMin;
	}

	public void setCacheTtlMin(Integer cacheTtlMin) {
		this.cacheTtlMin = cacheTtlMin;
		if(cacheTtlMin != null){
			putQueryParameter("CacheTtlMin", cacheTtlMin.toString());
		}
	}

	public List<SourceDnsServer> getSourceDnsServers() {
		return this.sourceDnsServers;
	}

	public void setSourceDnsServers(List<SourceDnsServer> sourceDnsServers) {
		this.sourceDnsServers = sourceDnsServers;	
		if (sourceDnsServers != null) {
			for (int depth1 = 0; depth1 < sourceDnsServers.size(); depth1++) {
				putQueryParameter("SourceDnsServer." + (depth1 + 1) + ".Port" , sourceDnsServers.get(depth1).getPort());
				putQueryParameter("SourceDnsServer." + (depth1 + 1) + ".Host" , sourceDnsServers.get(depth1).getHost());
			}
		}	
	}

	public static class SourceDnsServer {

		private String port;

		private String host;

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}
	}

	@Override
	public Class<UpdateDnsCacheDomainResponse> getResponseClass() {
		return UpdateDnsCacheDomainResponse.class;
	}

}
