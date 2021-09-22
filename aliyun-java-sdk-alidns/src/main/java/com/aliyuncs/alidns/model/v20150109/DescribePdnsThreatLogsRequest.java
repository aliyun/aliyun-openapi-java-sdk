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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsThreatLogsRequest extends RpcAcsRequest<DescribePdnsThreatLogsResponse> {
	   

	private String threatSourceIp;

	private String startDate;

	private Long pageNumber;

	private String endDate;

	private Long pageSize;

	private String threatType;

	private String lang;

	private String keyword;

	private String threatLevel;
	public DescribePdnsThreatLogsRequest() {
		super("Alidns", "2015-01-09", "DescribePdnsThreatLogs", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getThreatSourceIp() {
		return this.threatSourceIp;
	}

	public void setThreatSourceIp(String threatSourceIp) {
		this.threatSourceIp = threatSourceIp;
		if(threatSourceIp != null){
			putQueryParameter("ThreatSourceIp", threatSourceIp);
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getThreatType() {
		return this.threatType;
	}

	public void setThreatType(String threatType) {
		this.threatType = threatType;
		if(threatType != null){
			putQueryParameter("ThreatType", threatType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getThreatLevel() {
		return this.threatLevel;
	}

	public void setThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
		if(threatLevel != null){
			putQueryParameter("ThreatLevel", threatLevel);
		}
	}

	@Override
	public Class<DescribePdnsThreatLogsResponse> getResponseClass() {
		return DescribePdnsThreatLogsResponse.class;
	}

}
