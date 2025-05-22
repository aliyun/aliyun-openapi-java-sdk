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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CopyDatabaseRequest extends RpcAcsRequest<CopyDatabaseResponse> {
	   

	private String dBInstanceName;

	private Long resourceOwnerId;

	private String resourceGroupId;

	private Integer reserveAccount;

	private String srcDBName;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String dstDBName;
	public CopyDatabaseRequest() {
		super("Rds", "2014-08-15", "CopyDatabase", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getReserveAccount() {
		return this.reserveAccount;
	}

	public void setReserveAccount(Integer reserveAccount) {
		this.reserveAccount = reserveAccount;
		if(reserveAccount != null){
			putQueryParameter("ReserveAccount", reserveAccount.toString());
		}
	}

	public String getSrcDBName() {
		return this.srcDBName;
	}

	public void setSrcDBName(String srcDBName) {
		this.srcDBName = srcDBName;
		if(srcDBName != null){
			putQueryParameter("SrcDBName", srcDBName);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDstDBName() {
		return this.dstDBName;
	}

	public void setDstDBName(String dstDBName) {
		this.dstDBName = dstDBName;
		if(dstDBName != null){
			putQueryParameter("DstDBName", dstDBName);
		}
	}

	@Override
	public Class<CopyDatabaseResponse> getResponseClass() {
		return CopyDatabaseResponse.class;
	}

}
