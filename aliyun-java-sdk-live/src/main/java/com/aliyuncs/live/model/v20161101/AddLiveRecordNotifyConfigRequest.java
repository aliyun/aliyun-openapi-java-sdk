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
public class AddLiveRecordNotifyConfigRequest extends RpcAcsRequest<AddLiveRecordNotifyConfigResponse> {
	   

	private String onDemandUrl;

	private String securityToken;

	private String notifyUrl;

	private Boolean needStatusNotify;

	private String domainName;

	private Long ownerId;
	public AddLiveRecordNotifyConfigRequest() {
		super("live", "2016-11-01", "AddLiveRecordNotifyConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOnDemandUrl() {
		return this.onDemandUrl;
	}

	public void setOnDemandUrl(String onDemandUrl) {
		this.onDemandUrl = onDemandUrl;
		if(onDemandUrl != null){
			putQueryParameter("OnDemandUrl", onDemandUrl);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public Boolean getNeedStatusNotify() {
		return this.needStatusNotify;
	}

	public void setNeedStatusNotify(Boolean needStatusNotify) {
		this.needStatusNotify = needStatusNotify;
		if(needStatusNotify != null){
			putQueryParameter("NeedStatusNotify", needStatusNotify.toString());
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

	@Override
	public Class<AddLiveRecordNotifyConfigResponse> getResponseClass() {
		return AddLiveRecordNotifyConfigResponse.class;
	}

}
