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
public class ModifyWebRuleRequest extends RpcAcsRequest<ModifyWebRuleResponse> {
	   

	private String resourceGroupId;

	private Integer rsType;

	private List<String> realServerss;

	private String proxyTypes;

	private List<String> instanceIdss;

	private String domain;
	public ModifyWebRuleRequest() {
		super("ddoscoo", "2020-01-01", "ModifyWebRule");
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

	public String getProxyTypes() {
		return this.proxyTypes;
	}

	public void setProxyTypes(String proxyTypes) {
		this.proxyTypes = proxyTypes;
		if(proxyTypes != null){
			putQueryParameter("ProxyTypes", proxyTypes);
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

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	@Override
	public Class<ModifyWebRuleResponse> getResponseClass() {
		return ModifyWebRuleResponse.class;
	}

}
