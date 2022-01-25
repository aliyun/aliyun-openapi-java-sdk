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
public class SetSnapshotCallbackAuthRequest extends RpcAcsRequest<SetSnapshotCallbackAuthResponse> {
	   

	private String callbackAuthKey;

	private String domainName;

	private Long ownerId;

	private String callbackReqAuth;
	public SetSnapshotCallbackAuthRequest() {
		super("live", "2016-11-01", "SetSnapshotCallbackAuth", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallbackAuthKey() {
		return this.callbackAuthKey;
	}

	public void setCallbackAuthKey(String callbackAuthKey) {
		this.callbackAuthKey = callbackAuthKey;
		if(callbackAuthKey != null){
			putQueryParameter("CallbackAuthKey", callbackAuthKey);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getCallbackReqAuth() {
		return this.callbackReqAuth;
	}

	public void setCallbackReqAuth(String callbackReqAuth) {
		this.callbackReqAuth = callbackReqAuth;
		if(callbackReqAuth != null){
			putQueryParameter("CallbackReqAuth", callbackReqAuth);
		}
	}

	@Override
	public Class<SetSnapshotCallbackAuthResponse> getResponseClass() {
		return SetSnapshotCallbackAuthResponse.class;
	}

}
