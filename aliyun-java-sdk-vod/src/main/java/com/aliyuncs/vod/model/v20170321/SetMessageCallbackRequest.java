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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetMessageCallbackRequest extends RpcAcsRequest<SetMessageCallbackResponse> {
	   

	private String authKey;

	private String resourceOwnerId;

	private Long resourceRealOwnerId;

	private String callbackType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String eventTypeList;

	private String mnsQueueName;

	private String ownerId;

	private String mnsEndpoint;

	private String appId;

	private String authSwitch;

	private String callbackURL;
	public SetMessageCallbackRequest() {
		super("vod", "2017-03-21", "SetMessageCallback", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getResourceRealOwnerId() {
		return this.resourceRealOwnerId;
	}

	public void setResourceRealOwnerId(Long resourceRealOwnerId) {
		this.resourceRealOwnerId = resourceRealOwnerId;
		if(resourceRealOwnerId != null){
			putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId.toString());
		}
	}

	public String getCallbackType() {
		return this.callbackType;
	}

	public void setCallbackType(String callbackType) {
		this.callbackType = callbackType;
		if(callbackType != null){
			putQueryParameter("CallbackType", callbackType);
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

	public String getMnsQueueName() {
		return this.mnsQueueName;
	}

	public void setMnsQueueName(String mnsQueueName) {
		this.mnsQueueName = mnsQueueName;
		if(mnsQueueName != null){
			putQueryParameter("MnsQueueName", mnsQueueName);
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

	public String getMnsEndpoint() {
		return this.mnsEndpoint;
	}

	public void setMnsEndpoint(String mnsEndpoint) {
		this.mnsEndpoint = mnsEndpoint;
		if(mnsEndpoint != null){
			putQueryParameter("MnsEndpoint", mnsEndpoint);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	@Override
	public Class<SetMessageCallbackResponse> getResponseClass() {
		return SetMessageCallbackResponse.class;
	}

}
