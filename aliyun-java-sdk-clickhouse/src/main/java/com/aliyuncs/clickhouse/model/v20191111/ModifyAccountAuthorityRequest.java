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

package com.aliyuncs.clickhouse.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.clickhouse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAccountAuthorityRequest extends RpcAcsRequest<ModifyAccountAuthorityResponse> {
	   

	private Long resourceOwnerId;

	private String totalDictionaries;

	private String accountName;

	private String dmlAuthority;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String allowDatabases;

	private String allowDictionaries;

	private Long ownerId;

	private Boolean ddlAuthority;

	private String totalDatabases;
	public ModifyAccountAuthorityRequest() {
		super("clickhouse", "2019-11-11", "ModifyAccountAuthority");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTotalDictionaries() {
		return this.totalDictionaries;
	}

	public void setTotalDictionaries(String totalDictionaries) {
		this.totalDictionaries = totalDictionaries;
		if(totalDictionaries != null){
			putQueryParameter("TotalDictionaries", totalDictionaries);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getDmlAuthority() {
		return this.dmlAuthority;
	}

	public void setDmlAuthority(String dmlAuthority) {
		this.dmlAuthority = dmlAuthority;
		if(dmlAuthority != null){
			putQueryParameter("DmlAuthority", dmlAuthority);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getAllowDatabases() {
		return this.allowDatabases;
	}

	public void setAllowDatabases(String allowDatabases) {
		this.allowDatabases = allowDatabases;
		if(allowDatabases != null){
			putQueryParameter("AllowDatabases", allowDatabases);
		}
	}

	public String getAllowDictionaries() {
		return this.allowDictionaries;
	}

	public void setAllowDictionaries(String allowDictionaries) {
		this.allowDictionaries = allowDictionaries;
		if(allowDictionaries != null){
			putQueryParameter("AllowDictionaries", allowDictionaries);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getDdlAuthority() {
		return this.ddlAuthority;
	}

	public void setDdlAuthority(Boolean ddlAuthority) {
		this.ddlAuthority = ddlAuthority;
		if(ddlAuthority != null){
			putQueryParameter("DdlAuthority", ddlAuthority.toString());
		}
	}

	public String getTotalDatabases() {
		return this.totalDatabases;
	}

	public void setTotalDatabases(String totalDatabases) {
		this.totalDatabases = totalDatabases;
		if(totalDatabases != null){
			putQueryParameter("TotalDatabases", totalDatabases);
		}
	}

	@Override
	public Class<ModifyAccountAuthorityResponse> getResponseClass() {
		return ModifyAccountAuthorityResponse.class;
	}

}
