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
public class ListSlotRequest extends RpcAcsRequest<ListSlotResponse> {
	   

	private String adSlotType;

	private String userId;

	private String originSiteUserId;

	private Integer pageNumber;

	private String mediaName;

	private String appName;

	private String adSlotStatus;

	private String tenantId;

	private String adSlotId;

	private Integer pageSize;

	private String adSlotCorporateStatus;

	private Long endCreateTime;

	private String business;

	private String mediaId;

	private String environment;

	private Long startCreateTime;

	private String userSite;

	private String adSlotName;
	public ListSlotRequest() {
		super("UniMkt", "2018-12-12", "ListSlot", "1.0.0");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAdSlotType() {
		return this.adSlotType;
	}

	public void setAdSlotType(String adSlotType) {
		this.adSlotType = adSlotType;
		if(adSlotType != null){
			putQueryParameter("AdSlotType", adSlotType);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getMediaName() {
		return this.mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
		if(mediaName != null){
			putQueryParameter("MediaName", mediaName);
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
			putQueryParameter("AdSlotStatus", adSlotStatus);
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
			putQueryParameter("AdSlotId", adSlotId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getAdSlotCorporateStatus() {
		return this.adSlotCorporateStatus;
	}

	public void setAdSlotCorporateStatus(String adSlotCorporateStatus) {
		this.adSlotCorporateStatus = adSlotCorporateStatus;
		if(adSlotCorporateStatus != null){
			putQueryParameter("AdSlotCorporateStatus", adSlotCorporateStatus);
		}
	}

	public Long getEndCreateTime() {
		return this.endCreateTime;
	}

	public void setEndCreateTime(Long endCreateTime) {
		this.endCreateTime = endCreateTime;
		if(endCreateTime != null){
			putQueryParameter("EndCreateTime", endCreateTime.toString());
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

	public String getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
		if(mediaId != null){
			putQueryParameter("MediaId", mediaId);
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

	public Long getStartCreateTime() {
		return this.startCreateTime;
	}

	public void setStartCreateTime(Long startCreateTime) {
		this.startCreateTime = startCreateTime;
		if(startCreateTime != null){
			putQueryParameter("StartCreateTime", startCreateTime.toString());
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

	public String getAdSlotName() {
		return this.adSlotName;
	}

	public void setAdSlotName(String adSlotName) {
		this.adSlotName = adSlotName;
		if(adSlotName != null){
			putQueryParameter("AdSlotName", adSlotName);
		}
	}

	@Override
	public Class<ListSlotResponse> getResponseClass() {
		return ListSlotResponse.class;
	}

}
