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
public class UpdateApplicationRequest extends RpcAcsRequest<UpdateApplicationResponse> {
	   

	private Boolean newIsMultiTenant;

	private Integer newRefreshTokenValidity;

	private String newPredefinedScopes;

	private Boolean newSecretRequired;

	private String newDisplayName;

	private String newRequiredScopes;

	private String newRedirectUris;

	private String appId;

	private Integer newAccessTokenValidity;
	public UpdateApplicationRequest() {
		super("Ims", "2019-08-15", "UpdateApplication", "ims");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getNewIsMultiTenant() {
		return this.newIsMultiTenant;
	}

	public void setNewIsMultiTenant(Boolean newIsMultiTenant) {
		this.newIsMultiTenant = newIsMultiTenant;
		if(newIsMultiTenant != null){
			putQueryParameter("NewIsMultiTenant", newIsMultiTenant.toString());
		}
	}

	public Integer getNewRefreshTokenValidity() {
		return this.newRefreshTokenValidity;
	}

	public void setNewRefreshTokenValidity(Integer newRefreshTokenValidity) {
		this.newRefreshTokenValidity = newRefreshTokenValidity;
		if(newRefreshTokenValidity != null){
			putQueryParameter("NewRefreshTokenValidity", newRefreshTokenValidity.toString());
		}
	}

	public String getNewPredefinedScopes() {
		return this.newPredefinedScopes;
	}

	public void setNewPredefinedScopes(String newPredefinedScopes) {
		this.newPredefinedScopes = newPredefinedScopes;
		if(newPredefinedScopes != null){
			putQueryParameter("NewPredefinedScopes", newPredefinedScopes);
		}
	}

	public Boolean getNewSecretRequired() {
		return this.newSecretRequired;
	}

	public void setNewSecretRequired(Boolean newSecretRequired) {
		this.newSecretRequired = newSecretRequired;
		if(newSecretRequired != null){
			putQueryParameter("NewSecretRequired", newSecretRequired.toString());
		}
	}

	public String getNewDisplayName() {
		return this.newDisplayName;
	}

	public void setNewDisplayName(String newDisplayName) {
		this.newDisplayName = newDisplayName;
		if(newDisplayName != null){
			putQueryParameter("NewDisplayName", newDisplayName);
		}
	}

	public String getNewRequiredScopes() {
		return this.newRequiredScopes;
	}

	public void setNewRequiredScopes(String newRequiredScopes) {
		this.newRequiredScopes = newRequiredScopes;
		if(newRequiredScopes != null){
			putQueryParameter("NewRequiredScopes", newRequiredScopes);
		}
	}

	public String getNewRedirectUris() {
		return this.newRedirectUris;
	}

	public void setNewRedirectUris(String newRedirectUris) {
		this.newRedirectUris = newRedirectUris;
		if(newRedirectUris != null){
			putQueryParameter("NewRedirectUris", newRedirectUris);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Integer getNewAccessTokenValidity() {
		return this.newAccessTokenValidity;
	}

	public void setNewAccessTokenValidity(Integer newAccessTokenValidity) {
		this.newAccessTokenValidity = newAccessTokenValidity;
		if(newAccessTokenValidity != null){
			putQueryParameter("NewAccessTokenValidity", newAccessTokenValidity.toString());
		}
	}

	@Override
	public Class<UpdateApplicationResponse> getResponseClass() {
		return UpdateApplicationResponse.class;
	}

}
