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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterAccessWhitelistRequest extends RpcAcsRequest<ModifyDBClusterAccessWhitelistResponse> {
	   

	private Long resourceOwnerId;

	private String securityIps;

	private String dBClusterIPArrayAttribute;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String dBClusterIPArrayName;
	public ModifyDBClusterAccessWhitelistRequest() {
		super("polardb", "2017-08-01", "ModifyDBClusterAccessWhitelist", "polardb");
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

	public String getSecurityIps() {
		return this.securityIps;
	}

	public void setSecurityIps(String securityIps) {
		this.securityIps = securityIps;
		if(securityIps != null){
			putQueryParameter("SecurityIps", securityIps);
		}
	}

	public String getDBClusterIPArrayAttribute() {
		return this.dBClusterIPArrayAttribute;
	}

	public void setDBClusterIPArrayAttribute(String dBClusterIPArrayAttribute) {
		this.dBClusterIPArrayAttribute = dBClusterIPArrayAttribute;
		if(dBClusterIPArrayAttribute != null){
			putQueryParameter("DBClusterIPArrayAttribute", dBClusterIPArrayAttribute);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDBClusterIPArrayName() {
		return this.dBClusterIPArrayName;
	}

	public void setDBClusterIPArrayName(String dBClusterIPArrayName) {
		this.dBClusterIPArrayName = dBClusterIPArrayName;
		if(dBClusterIPArrayName != null){
			putQueryParameter("DBClusterIPArrayName", dBClusterIPArrayName);
		}
	}

	@Override
	public Class<ModifyDBClusterAccessWhitelistResponse> getResponseClass() {
		return ModifyDBClusterAccessWhitelistResponse.class;
	}

}
