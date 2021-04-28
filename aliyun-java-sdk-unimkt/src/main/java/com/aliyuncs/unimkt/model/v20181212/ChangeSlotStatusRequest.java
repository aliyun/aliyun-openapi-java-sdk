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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeSlotStatusRequest extends RpcAcsRequest<ChangeSlotStatusResponse> {
	   

	private String messageKey;

	private String business;

	private String message;

	private String userId;

	private String originSiteUserId;

	private String environment;

	private String appName;

	private String adSlotStatus;

	private String tenantId;

	private String adSlotId;

	private String userSite;

	private String adSlotCorporateStatus;
	public ChangeSlotStatusRequest() {
		super("UniMkt", "2018-12-12", "ChangeSlotStatus", "uniMkt");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMessageKey() {
		return this.messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
		if(messageKey != null){
			putBodyParameter("MessageKey", messageKey);
		}
	}

	public String getBusiness() {
		return this.business;
	}

	public void setBusiness(String business) {
		this.business = business;
		if(business != null){
			putQueryParameter("Business", business);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putBodyParameter("Message", message);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getOriginSiteUserId() {
		return this.originSiteUserId;
	}

	public void setOriginSiteUserId(String originSiteUserId) {
		this.originSiteUserId = originSiteUserId;
		if(originSiteUserId != null){
			putQueryParameter("OriginSiteUserId", originSiteUserId);
		}
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
		if(environment != null){
			putQueryParameter("Environment", environment);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getAdSlotStatus() {
		return this.adSlotStatus;
	}

	public void setAdSlotStatus(String adSlotStatus) {
		this.adSlotStatus = adSlotStatus;
		if(adSlotStatus != null){
			putBodyParameter("AdSlotStatus", adSlotStatus);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	public String getAdSlotId() {
		return this.adSlotId;
	}

	public void setAdSlotId(String adSlotId) {
		this.adSlotId = adSlotId;
		if(adSlotId != null){
			putBodyParameter("AdSlotId", adSlotId);
		}
	}

	public String getUserSite() {
		return this.userSite;
	}

	public void setUserSite(String userSite) {
		this.userSite = userSite;
		if(userSite != null){
			putQueryParameter("UserSite", userSite);
		}
	}

	public String getAdSlotCorporateStatus() {
		return this.adSlotCorporateStatus;
	}

	public void setAdSlotCorporateStatus(String adSlotCorporateStatus) {
		this.adSlotCorporateStatus = adSlotCorporateStatus;
		if(adSlotCorporateStatus != null){
			putBodyParameter("AdSlotCorporateStatus", adSlotCorporateStatus);
		}
	}

	@Override
	public Class<ChangeSlotStatusResponse> getResponseClass() {
		return ChangeSlotStatusResponse.class;
	}

}
