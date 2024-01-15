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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetAppsAuthToApiProductRequest extends RpcAcsRequest<SetAppsAuthToApiProductResponse> {
	   

	private String description;

	private String authValidTime;

	private List<Long> appIds;

	private String securityToken;

	private String apiProductId;
	public SetAppsAuthToApiProductRequest() {
		super("CloudAPI", "2016-07-14", "SetAppsAuthToApiProduct", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAuthValidTime() {
		return this.authValidTime;
	}

	public void setAuthValidTime(String authValidTime) {
		this.authValidTime = authValidTime;
		if(authValidTime != null){
			putQueryParameter("AuthValidTime", authValidTime);
		}
	}

	public List<Long> getAppIds() {
		return this.appIds;
	}

	public void setAppIds(List<Long> appIds) {
		this.appIds = appIds;	
		if (appIds != null) {
			for (int depth1 = 0; depth1 < appIds.size(); depth1++) {
				putQueryParameter("AppIds." + (depth1 + 1) , appIds.get(depth1));
			}
		}	
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getApiProductId() {
		return this.apiProductId;
	}

	public void setApiProductId(String apiProductId) {
		this.apiProductId = apiProductId;
		if(apiProductId != null){
			putQueryParameter("ApiProductId", apiProductId);
		}
	}

	@Override
	public Class<SetAppsAuthToApiProductResponse> getResponseClass() {
		return SetAppsAuthToApiProductResponse.class;
	}

}
