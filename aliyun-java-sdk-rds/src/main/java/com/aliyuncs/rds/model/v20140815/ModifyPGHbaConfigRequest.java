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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPGHbaConfigRequest extends RpcAcsRequest<ModifyPGHbaConfigResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String opsType;

	private String dBInstanceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<HbaItem> hbaItems;
	public ModifyPGHbaConfigRequest() {
		super("Rds", "2014-08-15", "ModifyPGHbaConfig", "rds");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getOpsType() {
		return this.opsType;
	}

	public void setOpsType(String opsType) {
		this.opsType = opsType;
		if(opsType != null){
			putQueryParameter("OpsType", opsType);
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

	public List<HbaItem> getHbaItems() {
		return this.hbaItems;
	}

	public void setHbaItems(List<HbaItem> hbaItems) {
		this.hbaItems = hbaItems;	
		if (hbaItems != null) {
			for (int depth1 = 0; depth1 < hbaItems.size(); depth1++) {
				putQueryParameter("HbaItem." + (depth1 + 1) + ".Database" , hbaItems.get(depth1).getDatabase());
				putQueryParameter("HbaItem." + (depth1 + 1) + ".Address" , hbaItems.get(depth1).getAddress());
				putQueryParameter("HbaItem." + (depth1 + 1) + ".Method" , hbaItems.get(depth1).getBizMethod());
				putQueryParameter("HbaItem." + (depth1 + 1) + ".Type" , hbaItems.get(depth1).getType());
				putQueryParameter("HbaItem." + (depth1 + 1) + ".User" , hbaItems.get(depth1).getUser());
				putQueryParameter("HbaItem." + (depth1 + 1) + ".Mask" , hbaItems.get(depth1).getMask());
				putQueryParameter("HbaItem." + (depth1 + 1) + ".PriorityId" , hbaItems.get(depth1).getPriorityId());
				putQueryParameter("HbaItem." + (depth1 + 1) + ".Option" , hbaItems.get(depth1).getOption());
			}
		}	
	}

	public static class HbaItem {

		private String database;

		private String address;

		private String method;

		private String type;

		private String user;

		private String mask;

		private Integer priorityId;

		private String option;

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getMask() {
			return this.mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}

		public Integer getPriorityId() {
			return this.priorityId;
		}

		public void setPriorityId(Integer priorityId) {
			this.priorityId = priorityId;
		}

		public String getOption() {
			return this.option;
		}

		public void setOption(String option) {
			this.option = option;
		}
	}

	@Override
	public Class<ModifyPGHbaConfigResponse> getResponseClass() {
		return ModifyPGHbaConfigResponse.class;
	}

}
