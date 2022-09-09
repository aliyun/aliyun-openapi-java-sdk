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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrivesRequest extends RpcAcsRequest<DescribeDrivesResponse> {
	   

	private String userId;

	private String resourceType;

	private List<String> domainIdss;
	public DescribeDrivesRequest() {
		super("ecd", "2020-09-30", "DescribeDrives");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public List<String> getDomainIdss() {
		return this.domainIdss;
	}

	public void setDomainIdss(List<String> domainIdss) {
		this.domainIdss = domainIdss;	
		if (domainIdss != null) {
			for (int i = 0; i < domainIdss.size(); i++) {
				putQueryParameter("DomainIds." + (i + 1) , domainIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeDrivesResponse> getResponseClass() {
		return DescribeDrivesResponse.class;
	}

}
