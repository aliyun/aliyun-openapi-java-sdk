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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAccountRequest extends RpcAcsRequest<CreateAccountResponse> {
	   

	private Long resourceOwnerId;

	private String accountType;

	private String accountDescription;

	private String accountName;

	@SerializedName("tag")
	private List<Tag> tag;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String accountPassword;
	public CreateAccountRequest() {
		super("adb", "2019-03-15", "CreateAccount", "ads");
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

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
		}
	}

	public String getAccountDescription() {
		return this.accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
		if(accountDescription != null){
			putQueryParameter("AccountDescription", accountDescription);
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

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			putQueryParameter("Tag" , new Gson().toJson(tag));
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

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
		if(accountPassword != null){
			putQueryParameter("AccountPassword", accountPassword);
		}
	}

	public static class Tag {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateAccountResponse> getResponseClass() {
		return CreateAccountResponse.class;
	}

}
