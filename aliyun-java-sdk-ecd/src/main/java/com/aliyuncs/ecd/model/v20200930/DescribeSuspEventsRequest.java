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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspEventsRequest extends RpcAcsRequest<DescribeSuspEventsResponse> {
	   

	private String officeSiteId;

	private String alarmUniqueInfo;

	private String dealed;

	private Integer currentPage;

	private Integer pageSize;

	private String parentEventType;

	private String lang;

	private String levels;
	public DescribeSuspEventsRequest() {
		super("ecd", "2020-09-30", "DescribeSuspEvents", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getAlarmUniqueInfo() {
		return this.alarmUniqueInfo;
	}

	public void setAlarmUniqueInfo(String alarmUniqueInfo) {
		this.alarmUniqueInfo = alarmUniqueInfo;
		if(alarmUniqueInfo != null){
			putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
		}
	}

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
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

	public String getParentEventType() {
		return this.parentEventType;
	}

	public void setParentEventType(String parentEventType) {
		this.parentEventType = parentEventType;
		if(parentEventType != null){
			putQueryParameter("ParentEventType", parentEventType);
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

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
		if(levels != null){
			putQueryParameter("Levels", levels);
		}
	}

	@Override
	public Class<DescribeSuspEventsResponse> getResponseClass() {
		return DescribeSuspEventsResponse.class;
	}

}
