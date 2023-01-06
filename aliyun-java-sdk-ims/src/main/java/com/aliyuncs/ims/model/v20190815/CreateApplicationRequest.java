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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ims.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationRequest extends RpcAcsRequest<CreateApplicationResponse> {
	   

	private String appName;

	private Integer accessTokenValidity;

	private Integer refreshTokenValidity;

	private String redirectUris;

	private Boolean secretRequired;

	private String appType;

	private String displayName;

	private String predefinedScopes;

	private Boolean isMultiTenant;
	public CreateApplicationRequest() {
		super("Ims", "2019-08-15", "CreateApplication");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Integer getAccessTokenValidity() {
		return this.accessTokenValidity;
	}

	public void setAccessTokenValidity(Integer accessTokenValidity) {
		this.accessTokenValidity = accessTokenValidity;
		if(accessTokenValidity != null){
			putQueryParameter("AccessTokenValidity", accessTokenValidity.toString());
		}
	}

	public Integer getRefreshTokenValidity() {
		return this.refreshTokenValidity;
	}

	public void setRefreshTokenValidity(Integer refreshTokenValidity) {
		this.refreshTokenValidity = refreshTokenValidity;
		if(refreshTokenValidity != null){
			putQueryParameter("RefreshTokenValidity", refreshTokenValidity.toString());
		}
	}

	public String getRedirectUris() {
		return this.redirectUris;
	}

	public void setRedirectUris(String redirectUris) {
		this.redirectUris = redirectUris;
		if(redirectUris != null){
			putQueryParameter("RedirectUris", redirectUris);
		}
	}

	public Boolean getSecretRequired() {
		return this.secretRequired;
	}

	public void setSecretRequired(Boolean secretRequired) {
		this.secretRequired = secretRequired;
		if(secretRequired != null){
			putQueryParameter("SecretRequired", secretRequired.toString());
		}
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getPredefinedScopes() {
		return this.predefinedScopes;
	}

	public void setPredefinedScopes(String predefinedScopes) {
		this.predefinedScopes = predefinedScopes;
		if(predefinedScopes != null){
			putQueryParameter("PredefinedScopes", predefinedScopes);
		}
	}

	public Boolean getIsMultiTenant() {
		return this.isMultiTenant;
	}

	public void setIsMultiTenant(Boolean isMultiTenant) {
		this.isMultiTenant = isMultiTenant;
		if(isMultiTenant != null){
			putQueryParameter("IsMultiTenant", isMultiTenant.toString());
		}
	}

	@Override
	public Class<CreateApplicationResponse> getResponseClass() {
		return CreateApplicationResponse.class;
	}

}
