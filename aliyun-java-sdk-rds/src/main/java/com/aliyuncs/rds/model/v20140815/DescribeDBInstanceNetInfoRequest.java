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

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceNetInfoRequest extends RpcAcsRequest<DescribeDBInstanceNetInfoResponse> {
	
	public DescribeDBInstanceNetInfoRequest() {
		super("Rds", "2014-08-15", "DescribeDBInstanceNetInfo", "rds");
	}

	private Long resourceOwnerId;

	private String flag;

	private String clientToken;

	private String dBInstanceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String dBInstanceNetRWSplitType;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
		if(flag != null){
			putQueryParameter("Flag", flag);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
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

	public String getDBInstanceNetRWSplitType() {
		return this.dBInstanceNetRWSplitType;
	}

	public void setDBInstanceNetRWSplitType(String dBInstanceNetRWSplitType) {
		this.dBInstanceNetRWSplitType = dBInstanceNetRWSplitType;
		if(dBInstanceNetRWSplitType != null){
			putQueryParameter("DBInstanceNetRWSplitType", dBInstanceNetRWSplitType);
		}
	}

	@Override
	public Class<DescribeDBInstanceNetInfoResponse> getResponseClass() {
		return DescribeDBInstanceNetInfoResponse.class;
	}

}
