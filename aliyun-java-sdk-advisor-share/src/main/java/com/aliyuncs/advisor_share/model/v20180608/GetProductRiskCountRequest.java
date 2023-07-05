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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetProductRiskCountRequest extends RpcAcsRequest<GetProductRiskCountResponse> {
	   

	private Long adviceId;

	private Long excludeAdviceId;

	private String reason;

	private String data;

	private String timeZone;

	private String filterValue;

	private String language;

	private String filterType;

	private Integer duration;

	private Boolean isExpired;

	private String details;

	private String gmtCreated;

	private String checkId;

	private String severity;

	private String resourceId;

	private String product;

	private Long clientUid;

	private String token;

	private String region;
	public GetProductRiskCountRequest() {
		super("Advisor-Share", "2018-06-08", "GetProductRiskCount", "advisor");
		setMethod(MethodType.POST);
	}

	public Long getAdviceId() {
		return this.adviceId;
	}

	public void setAdviceId(Long adviceId) {
		this.adviceId = adviceId;
		if(adviceId != null){
			putQueryParameter("AdviceId", adviceId.toString());
		}
	}

	public Long getExcludeAdviceId() {
		return this.excludeAdviceId;
	}

	public void setExcludeAdviceId(Long excludeAdviceId) {
		this.excludeAdviceId = excludeAdviceId;
		if(excludeAdviceId != null){
			putQueryParameter("ExcludeAdviceId", excludeAdviceId.toString());
		}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public String getTimeZone() {
		return this.timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
		if(timeZone != null){
			putQueryParameter("TimeZone", timeZone);
		}
	}

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
		if(filterValue != null){
			putQueryParameter("FilterValue", filterValue);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
		if(filterType != null){
			putQueryParameter("FilterType", filterType);
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public Boolean getIsExpired() {
		return this.isExpired;
	}

	public void setIsExpired(Boolean isExpired) {
		this.isExpired = isExpired;
		if(isExpired != null){
			putQueryParameter("IsExpired", isExpired.toString());
		}
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
		if(details != null){
			putQueryParameter("Details", details);
		}
	}

	public String getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
		if(gmtCreated != null){
			putQueryParameter("GmtCreated", gmtCreated);
		}
	}

	public String getCheckId() {
		return this.checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId);
		}
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
		if(severity != null){
			putQueryParameter("Severity", severity);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public Long getClientUid() {
		return this.clientUid;
	}

	public void setClientUid(Long clientUid) {
		this.clientUid = clientUid;
		if(clientUid != null){
			putQueryParameter("ClientUid", clientUid.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<GetProductRiskCountResponse> getResponseClass() {
		return GetProductRiskCountResponse.class;
	}

}
