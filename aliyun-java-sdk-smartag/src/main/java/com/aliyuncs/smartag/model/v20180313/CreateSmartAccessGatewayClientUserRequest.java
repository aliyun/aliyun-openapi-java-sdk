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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSmartAccessGatewayClientUserRequest extends RpcAcsRequest<CreateSmartAccessGatewayClientUserResponse> {
	   

	private Long resourceOwnerId;

	private String password;

	private String clientIp;

	private String resourceOwnerAccount;

	private Long bandwidth;

	private String ownerAccount;

	private String userMail;

	private Long ownerId;

	private String smartAGId;

	private String userName;
	public CreateSmartAccessGatewayClientUserRequest() {
		super("Smartag", "2018-03-13", "CreateSmartAccessGatewayClientUser", "smartag");
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
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

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
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

	public String getUserMail() {
		return this.userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
		if(userMail != null){
			putQueryParameter("UserMail", userMail);
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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<CreateSmartAccessGatewayClientUserResponse> getResponseClass() {
		return CreateSmartAccessGatewayClientUserResponse.class;
	}

}
