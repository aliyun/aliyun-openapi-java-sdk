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
public class CreateReplicationVaultRequest extends RpcAcsRequest<CreateReplicationVaultResponse> {
	   

	private String replicationSourceVaultId;

	private String description;

	private String vaultName;

	private String token;

	private String replicationSourceRegionId;

	private String vaultRegionId;

	private String vaultStorageClass;
	public CreateReplicationVaultRequest() {
		super("hbr", "2017-09-08", "CreateReplicationVault", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReplicationSourceVaultId() {
		return this.replicationSourceVaultId;
	}

	public void setReplicationSourceVaultId(String replicationSourceVaultId) {
		this.replicationSourceVaultId = replicationSourceVaultId;
		if(replicationSourceVaultId != null){
			putQueryParameter("ReplicationSourceVaultId", replicationSourceVaultId);
		}
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

	public String getReplicationSourceRegionId() {
		return this.replicationSourceRegionId;
	}

	public void setReplicationSourceRegionId(String replicationSourceRegionId) {
		this.replicationSourceRegionId = replicationSourceRegionId;
		if(replicationSourceRegionId != null){
			putQueryParameter("ReplicationSourceRegionId", replicationSourceRegionId);
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

	@Override
	public Class<CreateReplicationVaultResponse> getResponseClass() {
		return CreateReplicationVaultResponse.class;
	}

}
