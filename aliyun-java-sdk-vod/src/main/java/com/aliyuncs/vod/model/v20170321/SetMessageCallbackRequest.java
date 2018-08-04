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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetMessageCallbackRequest extends RpcAcsRequest<SetMessageCallbackResponse> {
	
	public SetMessageCallbackRequest() {
		super("vod", "2017-03-21", "SetMessageCallback", "vod");
	}

	private String callbackType;

	private String authKey;

	private String resourceOwnerId;

	private String callbackSwitch;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String eventTypeList;

	private String authSwitch;

	private String callbackURL;

	private String ownerId;

	public String getCallbackType() {
		return this.callbackType;
	}

	public void setCallbackType(String callbackType) {
		this.callbackType = callbackType;
		if(callbackType != null){
			putQueryParameter("CallbackType", callbackType);
		}
	}

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public String getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(String resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId);
		}
	}

	public String getCallbackSwitch() {
		return this.callbackSwitch;
	}

	public void setCallbackSwitch(String callbackSwitch) {
		this.callbackSwitch = callbackSwitch;
		if(callbackSwitch != null){
			putQueryParameter("CallbackSwitch", callbackSwitch);
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

	public String getEventTypeList() {
		return this.eventTypeList;
	}

	public void setEventTypeList(String eventTypeList) {
		this.eventTypeList = eventTypeList;
		if(eventTypeList != null){
			putQueryParameter("EventTypeList", eventTypeList);
		}
	}

	public String getAuthSwitch() {
		return this.authSwitch;
	}

	public void setAuthSwitch(String authSwitch) {
		this.authSwitch = authSwitch;
		if(authSwitch != null){
			putQueryParameter("AuthSwitch", authSwitch);
		}
	}

	public String getCallbackURL() {
		return this.callbackURL;
	}

	public void setCallbackURL(String callbackURL) {
		this.callbackURL = callbackURL;
		if(callbackURL != null){
			putQueryParameter("CallbackURL", callbackURL);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	@Override
	public Class<SetMessageCallbackResponse> getResponseClass() {
		return SetMessageCallbackResponse.class;
	}

}
