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
public class DescribeCnameReusesRequest extends RpcAcsRequest<DescribeCnameReusesResponse> {
	   

	private List<String> domainss;

	private String resourceGroupId;
	public DescribeCnameReusesRequest() {
		super("ddoscoo", "2020-01-01", "DescribeCnameReuses");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDomainss() {
		return this.domainss;
	}

	public void setDomainss(List<String> domainss) {
		this.domainss = domainss;	
		if (domainss != null) {
			for (int i = 0; i < domainss.size(); i++) {
				putQueryParameter("Domains." + (i + 1) , domainss.get(i));
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

	@Override
	public Class<DescribeCnameReusesResponse> getResponseClass() {
		return DescribeCnameReusesResponse.class;
	}

}
