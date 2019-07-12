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

/**
 * @author auto create
 * @version 
 */
public class UpdateLiveRecordNotifyConfigRequest extends RpcAcsRequest<UpdateLiveRecordNotifyConfigResponse> {
	
	public UpdateLiveRecordNotifyConfigRequest() {
		super("live", "2016-11-01", "UpdateLiveRecordNotifyConfig", "live");
	}

	private String onDemandUrl;

	private String securityToken;

	private String domainName;

	private String notifyUrl;

	private Long ownerId;

	private Boolean needStatusNotify;

	public String getOnDemandUrl() {
		return this.onDemandUrl;
	}

	public void setOnDemandUrl(String onDemandUrl) {
		this.onDemandUrl = onDemandUrl;
		if(onDemandUrl != null){
			putQueryParameter("OnDemandUrl", onDemandUrl);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		if(notifyUrl != null){
			putQueryParameter("NotifyUrl", notifyUrl);
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

	public Boolean getNeedStatusNotify() {
		return this.needStatusNotify;
	}

	public void setNeedStatusNotify(Boolean needStatusNotify) {
		this.needStatusNotify = needStatusNotify;
		if(needStatusNotify != null){
			putQueryParameter("NeedStatusNotify", needStatusNotify.toString());
		}
	}

	@Override
	public Class<UpdateLiveRecordNotifyConfigResponse> getResponseClass() {
		return UpdateLiveRecordNotifyConfigResponse.class;
	}

}
