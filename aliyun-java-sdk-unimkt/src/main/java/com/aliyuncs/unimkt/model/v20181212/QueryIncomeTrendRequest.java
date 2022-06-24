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
public class QueryIncomeTrendRequest extends RpcAcsRequest<QueryIncomeTrendResponse> {
	   

	private String adSlotType;

	private Long startTime;

	private Long slot;

	private String userId;

	private String originSiteUserId;

	private Integer pageNumber;

	private String mediaName;

	private String slotDimension;

	private String appName;

	private String tenantId;

	private String adSlotId;

	private Integer pageSize;

	private String dimension;

	private String queryType;

	private String business;

	private Long endTime;

	private String mediaId;

	private String environment;

	private String userSite;

	private String adSlotName;
	public QueryIncomeTrendRequest() {
		super("UniMkt", "2018-12-12", "QueryIncomeTrend", "1.0.0");
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

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Long getSlot() {
		return this.slot;
	}

	public void setSlot(Long slot) {
		this.slot = slot;
		if(slot != null){
			putQueryParameter("Slot", slot.toString());
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

	public String getSlotDimension() {
		return this.slotDimension;
	}

	public void setSlotDimension(String slotDimension) {
		this.slotDimension = slotDimension;
		if(slotDimension != null){
			putQueryParameter("SlotDimension", slotDimension);
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

	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension);
		}
	}

	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType);
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

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
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
	public Class<QueryIncomeTrendResponse> getResponseClass() {
		return QueryIncomeTrendResponse.class;
	}

}
