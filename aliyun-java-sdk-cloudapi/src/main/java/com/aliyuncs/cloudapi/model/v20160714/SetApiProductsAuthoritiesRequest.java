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
public class SetApiProductsAuthoritiesRequest extends RpcAcsRequest<SetApiProductsAuthoritiesResponse> {
	   

	private String description;

	private List<String> apiProductIds;

	private String authValidTime;

	private String securityToken;

	private Long appId;
	public SetApiProductsAuthoritiesRequest() {
		super("CloudAPI", "2016-07-14", "SetApiProductsAuthorities", "apigateway");
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

	public List<String> getApiProductIds() {
		return this.apiProductIds;
	}

	public void setApiProductIds(List<String> apiProductIds) {
		this.apiProductIds = apiProductIds;	
		if (apiProductIds != null) {
			String apiProductIdsArrVal = "";
			for(int depth1 = 0; depth1 < apiProductIds.size(); depth1++) {
				apiProductIdsArrVal += apiProductIds.get(depth1) + ",";
			}
			if (apiProductIdsArrVal.length() > 0) {
				apiProductIdsArrVal = apiProductIdsArrVal.substring(0, apiProductIdsArrVal.length() - 1);
			}
			putQueryParameter("ApiProductIds" , apiProductIdsArrVal);
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

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	@Override
	public Class<SetApiProductsAuthoritiesResponse> getResponseClass() {
		return SetApiProductsAuthoritiesResponse.class;
	}

}
