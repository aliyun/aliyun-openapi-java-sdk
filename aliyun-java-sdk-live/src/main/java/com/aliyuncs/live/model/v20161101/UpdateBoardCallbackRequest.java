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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBoardCallbackRequest extends RpcAcsRequest<UpdateBoardCallbackResponse> {
	   

	private String authKey;

	private Integer callbackEnable;

	private String callbackEvents;

	private Long ownerId;

	private String callbackUri;

	private String appId;

	private String authSwitch;
	public UpdateBoardCallbackRequest() {
		super("live", "2016-11-01", "UpdateBoardCallback");
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

	public Integer getCallbackEnable() {
		return this.callbackEnable;
	}

	public void setCallbackEnable(Integer callbackEnable) {
		this.callbackEnable = callbackEnable;
		if(callbackEnable != null){
			putQueryParameter("CallbackEnable", callbackEnable.toString());
		}
	}

	public String getCallbackEvents() {
		return this.callbackEvents;
	}

	public void setCallbackEvents(String callbackEvents) {
		this.callbackEvents = callbackEvents;
		if(callbackEvents != null){
			putQueryParameter("CallbackEvents", callbackEvents);
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

	public String getCallbackUri() {
		return this.callbackUri;
	}

	public void setCallbackUri(String callbackUri) {
		this.callbackUri = callbackUri;
		if(callbackUri != null){
			putQueryParameter("CallbackUri", callbackUri);
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

	@Override
	public Class<UpdateBoardCallbackResponse> getResponseClass() {
		return UpdateBoardCallbackResponse.class;
	}

}
