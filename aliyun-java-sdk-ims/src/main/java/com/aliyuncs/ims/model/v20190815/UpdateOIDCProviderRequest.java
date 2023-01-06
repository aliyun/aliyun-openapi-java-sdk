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
public class UpdateOIDCProviderRequest extends RpcAcsRequest<UpdateOIDCProviderResponse> {
	   

	private String oIDCProviderName;

	private String clientIds;

	private String newDescription;
	public UpdateOIDCProviderRequest() {
		super("Ims", "2019-08-15", "UpdateOIDCProvider");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOIDCProviderName() {
		return this.oIDCProviderName;
	}

	public void setOIDCProviderName(String oIDCProviderName) {
		this.oIDCProviderName = oIDCProviderName;
		if(oIDCProviderName != null){
			putQueryParameter("OIDCProviderName", oIDCProviderName);
		}
	}

	public String getClientIds() {
		return this.clientIds;
	}

	public void setClientIds(String clientIds) {
		this.clientIds = clientIds;
		if(clientIds != null){
			putQueryParameter("ClientIds", clientIds);
		}
	}

	public String getNewDescription() {
		return this.newDescription;
	}

	public void setNewDescription(String newDescription) {
		this.newDescription = newDescription;
		if(newDescription != null){
			putQueryParameter("NewDescription", newDescription);
		}
	}

	@Override
	public Class<UpdateOIDCProviderResponse> getResponseClass() {
		return UpdateOIDCProviderResponse.class;
	}

}
