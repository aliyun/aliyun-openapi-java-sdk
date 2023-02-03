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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddAuthResourceRequest extends RpcAcsRequest<AddAuthResourceResponse> {
	   

	private Boolean ignoreCase;

	private String gatewayUniqueId;

	private Long domainId;

	private String path;

	private String matchType;

	private Long authId;

	@SerializedName("authResourceHeaderList")
	private List<AuthResourceHeaderList> authResourceHeaderList;

	private String acceptLanguage;
	public AddAuthResourceRequest() {
		super("mse", "2019-05-31", "AddAuthResource", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIgnoreCase() {
		return this.ignoreCase;
	}

	public void setIgnoreCase(Boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
		if(ignoreCase != null){
			putQueryParameter("IgnoreCase", ignoreCase.toString());
		}
	}

	public String getGatewayUniqueId() {
		return this.gatewayUniqueId;
	}

	public void setGatewayUniqueId(String gatewayUniqueId) {
		this.gatewayUniqueId = gatewayUniqueId;
		if(gatewayUniqueId != null){
			putQueryParameter("GatewayUniqueId", gatewayUniqueId);
		}
	}

	public Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(Long domainId) {
		this.domainId = domainId;
		if(domainId != null){
			putQueryParameter("DomainId", domainId.toString());
		}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("Path", path);
		}
	}

	public String getMatchType() {
		return this.matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
		if(matchType != null){
			putQueryParameter("MatchType", matchType);
		}
	}

	public Long getAuthId() {
		return this.authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
		if(authId != null){
			putQueryParameter("AuthId", authId.toString());
		}
	}

	public List<AuthResourceHeaderList> getAuthResourceHeaderList() {
		return this.authResourceHeaderList;
	}

	public void setAuthResourceHeaderList(List<AuthResourceHeaderList> authResourceHeaderList) {
		this.authResourceHeaderList = authResourceHeaderList;	
		if (authResourceHeaderList != null) {
			putQueryParameter("AuthResourceHeaderList" , new Gson().toJson(authResourceHeaderList));
		}	
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	public static class AuthResourceHeaderList {

		@SerializedName("HeaderValue")
		private String headerValue;

		@SerializedName("HeaderMethod")
		private String headerMethod;

		@SerializedName("HeaderKey")
		private String headerKey;

		public String getHeaderValue() {
			return this.headerValue;
		}

		public void setHeaderValue(String headerValue) {
			this.headerValue = headerValue;
		}

		public String getHeaderMethod() {
			return this.headerMethod;
		}

		public void setHeaderMethod(String headerMethod) {
			this.headerMethod = headerMethod;
		}

		public String getHeaderKey() {
			return this.headerKey;
		}

		public void setHeaderKey(String headerKey) {
			this.headerKey = headerKey;
		}
	}

	@Override
	public Class<AddAuthResourceResponse> getResponseClass() {
		return AddAuthResourceResponse.class;
	}

}
