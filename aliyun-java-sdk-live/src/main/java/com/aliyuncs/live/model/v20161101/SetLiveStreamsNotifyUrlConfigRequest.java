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
public class SetLiveStreamsNotifyUrlConfigRequest extends RpcAcsRequest<SetLiveStreamsNotifyUrlConfigResponse> {
	   

	private String notifyReqAuth;

	private String exceptionNotifyUrl;

	private String notifyUrl;

	private String domainName;

	private Long ownerId;

	private String notifyAuthKey;
	public SetLiveStreamsNotifyUrlConfigRequest() {
		super("live", "2016-11-01", "SetLiveStreamsNotifyUrlConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNotifyReqAuth() {
		return this.notifyReqAuth;
	}

	public void setNotifyReqAuth(String notifyReqAuth) {
		this.notifyReqAuth = notifyReqAuth;
		if(notifyReqAuth != null){
			putQueryParameter("NotifyReqAuth", notifyReqAuth);
		}
	}

	public String getExceptionNotifyUrl() {
		return this.exceptionNotifyUrl;
	}

	public void setExceptionNotifyUrl(String exceptionNotifyUrl) {
		this.exceptionNotifyUrl = exceptionNotifyUrl;
		if(exceptionNotifyUrl != null){
			putQueryParameter("ExceptionNotifyUrl", exceptionNotifyUrl);
		}
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		if(notifyUrl != null){
			putQueryParameter("NotifyUrl", notifyUrl);
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

	public String getNotifyAuthKey() {
		return this.notifyAuthKey;
	}

	public void setNotifyAuthKey(String notifyAuthKey) {
		this.notifyAuthKey = notifyAuthKey;
		if(notifyAuthKey != null){
			putQueryParameter("NotifyAuthKey", notifyAuthKey);
		}
	}

	@Override
	public Class<SetLiveStreamsNotifyUrlConfigResponse> getResponseClass() {
		return SetLiveStreamsNotifyUrlConfigResponse.class;
	}

}
