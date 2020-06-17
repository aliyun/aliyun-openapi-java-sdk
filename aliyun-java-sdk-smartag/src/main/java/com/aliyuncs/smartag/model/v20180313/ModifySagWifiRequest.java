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
public class ModifySagWifiRequest extends RpcAcsRequest<ModifySagWifiResponse> {
	   

	private Long resourceOwnerId;

	private String encryptAlgorithm;

	private String channel;

	private String authenticationType;

	private String sSID;

	private String password;

	private String isBroadcast;

	private String resourceOwnerAccount;

	private String bandwidth;

	private String ownerAccount;

	private Long ownerId;

	private String isEnable;

	private String smartAGId;

	private String smartAGSn;

	private String isAuth;
	public ModifySagWifiRequest() {
		super("Smartag", "2018-03-13", "ModifySagWifi", "smartag");
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

	public String getEncryptAlgorithm() {
		return this.encryptAlgorithm;
	}

	public void setEncryptAlgorithm(String encryptAlgorithm) {
		this.encryptAlgorithm = encryptAlgorithm;
		if(encryptAlgorithm != null){
			putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getAuthenticationType() {
		return this.authenticationType;
	}

	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
		if(authenticationType != null){
			putQueryParameter("AuthenticationType", authenticationType);
		}
	}

	public String getSSID() {
		return this.sSID;
	}

	public void setSSID(String sSID) {
		this.sSID = sSID;
		if(sSID != null){
			putQueryParameter("SSID", sSID);
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

	public String getIsBroadcast() {
		return this.isBroadcast;
	}

	public void setIsBroadcast(String isBroadcast) {
		this.isBroadcast = isBroadcast;
		if(isBroadcast != null){
			putQueryParameter("IsBroadcast", isBroadcast);
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

	public String getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth);
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

	public String getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
		if(isEnable != null){
			putQueryParameter("IsEnable", isEnable);
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

	public String getSmartAGSn() {
		return this.smartAGSn;
	}

	public void setSmartAGSn(String smartAGSn) {
		this.smartAGSn = smartAGSn;
		if(smartAGSn != null){
			putQueryParameter("SmartAGSn", smartAGSn);
		}
	}

	public String getIsAuth() {
		return this.isAuth;
	}

	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
		if(isAuth != null){
			putQueryParameter("IsAuth", isAuth);
		}
	}

	@Override
	public Class<ModifySagWifiResponse> getResponseClass() {
		return ModifySagWifiResponse.class;
	}

}
