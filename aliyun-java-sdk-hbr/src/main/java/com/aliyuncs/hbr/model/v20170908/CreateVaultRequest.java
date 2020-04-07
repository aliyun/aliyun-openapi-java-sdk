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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVaultRequest extends RpcAcsRequest<CreateVaultResponse> {
	   

	private String description;

	private String vaultName;

	private String token;

	private String vaultRegionId;

	private String vaultStorageClass;

	private String vaultType;

	private Boolean searchEnabled;
	public CreateVaultRequest() {
		super("hbr", "2017-09-08", "CreateVault", "hbr");
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

	public String getVaultName() {
		return this.vaultName;
	}

	public void setVaultName(String vaultName) {
		this.vaultName = vaultName;
		if(vaultName != null){
			putQueryParameter("VaultName", vaultName);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getVaultRegionId() {
		return this.vaultRegionId;
	}

	public void setVaultRegionId(String vaultRegionId) {
		this.vaultRegionId = vaultRegionId;
		if(vaultRegionId != null){
			putQueryParameter("VaultRegionId", vaultRegionId);
		}
	}

	public String getVaultStorageClass() {
		return this.vaultStorageClass;
	}

	public void setVaultStorageClass(String vaultStorageClass) {
		this.vaultStorageClass = vaultStorageClass;
		if(vaultStorageClass != null){
			putQueryParameter("VaultStorageClass", vaultStorageClass);
		}
	}

	public String getVaultType() {
		return this.vaultType;
	}

	public void setVaultType(String vaultType) {
		this.vaultType = vaultType;
		if(vaultType != null){
			putQueryParameter("VaultType", vaultType);
		}
	}

	public Boolean getSearchEnabled() {
		return this.searchEnabled;
	}

	public void setSearchEnabled(Boolean searchEnabled) {
		this.searchEnabled = searchEnabled;
		if(searchEnabled != null){
			putQueryParameter("SearchEnabled", searchEnabled.toString());
		}
	}

	@Override
	public Class<CreateVaultResponse> getResponseClass() {
		return CreateVaultResponse.class;
	}

}
