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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDomainResourceRequest extends RpcAcsRequest<CreateDomainResourceResponse> {
	   

	private String httpsExt;

	private Integer rsType;

	private List<String> realServerss;

	private List<String> instanceIdss;

	private List<ProxyTypes> proxyTypess;

	private String domain;
	public CreateDomainResourceRequest() {
		super("ddoscoo", "2020-01-01", "CreateDomainResource");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHttpsExt() {
		return this.httpsExt;
	}

	public void setHttpsExt(String httpsExt) {
		this.httpsExt = httpsExt;
		if(httpsExt != null){
			putQueryParameter("HttpsExt", httpsExt);
		}
	}

	public Integer getRsType() {
		return this.rsType;
	}

	public void setRsType(Integer rsType) {
		this.rsType = rsType;
		if(rsType != null){
			putQueryParameter("RsType", rsType.toString());
		}
	}

	public List<String> getRealServerss() {
		return this.realServerss;
	}

	public void setRealServerss(List<String> realServerss) {
		this.realServerss = realServerss;	
		if (realServerss != null) {
			for (int i = 0; i < realServerss.size(); i++) {
				putQueryParameter("RealServers." + (i + 1) , realServerss.get(i));
			}
		}	
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public List<ProxyTypes> getProxyTypess() {
		return this.proxyTypess;
	}

	public void setProxyTypess(List<ProxyTypes> proxyTypess) {
		this.proxyTypess = proxyTypess;	
		if (proxyTypess != null) {
			for (int depth1 = 0; depth1 < proxyTypess.size(); depth1++) {
				if (proxyTypess.get(depth1).getProxyPortss() != null) {
					for (int i = 0; i < proxyTypess.get(depth1).getProxyPortss().size(); i++) {
						putQueryParameter("ProxyTypes." + (depth1 + 1) + ".ProxyPorts." + (i + 1) , proxyTypess.get(depth1).getProxyPortss().get(i));
					}
				}
				putQueryParameter("ProxyTypes." + (depth1 + 1) + ".ProxyType" , proxyTypess.get(depth1).getProxyType());
			}
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

	public static class ProxyTypes {

		private List<Integer> proxyPortss;

		private String proxyType;

		public List<Integer> getProxyPortss() {
			return this.proxyPortss;
		}

		public void setProxyPortss(List<Integer> proxyPortss) {
			this.proxyPortss = proxyPortss;
		}

		public String getProxyType() {
			return this.proxyType;
		}

		public void setProxyType(String proxyType) {
			this.proxyType = proxyType;
		}
	}

	@Override
	public Class<CreateDomainResourceResponse> getResponseClass() {
		return CreateDomainResourceResponse.class;
	}

}
