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
public class ConfigWebIpSetRequest extends RpcAcsRequest<ConfigWebIpSetResponse> {
	   

	private List<String> blackLists;

	private List<String> whiteLists;

	private String resourceGroupId;

	private String domain;
	public ConfigWebIpSetRequest() {
		super("ddoscoo", "2020-01-01", "ConfigWebIpSet");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getBlackLists() {
		return this.blackLists;
	}

	public void setBlackLists(List<String> blackLists) {
		this.blackLists = blackLists;	
		if (blackLists != null) {
			for (int i = 0; i < blackLists.size(); i++) {
				putQueryParameter("BlackList." + (i + 1) , blackLists.get(i));
			}
		}	
	}

	public List<String> getWhiteLists() {
		return this.whiteLists;
	}

	public void setWhiteLists(List<String> whiteLists) {
		this.whiteLists = whiteLists;	
		if (whiteLists != null) {
			for (int i = 0; i < whiteLists.size(); i++) {
				putQueryParameter("WhiteList." + (i + 1) , whiteLists.get(i));
			}
		}	
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
	public Class<ConfigWebIpSetResponse> getResponseClass() {
		return ConfigWebIpSetResponse.class;
	}

}
