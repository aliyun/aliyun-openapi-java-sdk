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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListGatewaysRequest extends RpcAcsRequest<ListGatewaysResponse> {
	   

	private String fuzzyGwEui;

	private Long limit;

	private String fuzzyCity;

	private String onlineState;

	private Boolean isEnabled;

	private String fuzzyName;

	private Long offset;

	private Long freqBandPlanGroupId;

	private String sortingField;

	private Boolean ascending;
	public ListGatewaysRequest() {
		super("LinkWAN", "2019-03-01", "ListGateways", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFuzzyGwEui() {
		return this.fuzzyGwEui;
	}

	public void setFuzzyGwEui(String fuzzyGwEui) {
		this.fuzzyGwEui = fuzzyGwEui;
		if(fuzzyGwEui != null){
			putQueryParameter("FuzzyGwEui", fuzzyGwEui);
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getFuzzyCity() {
		return this.fuzzyCity;
	}

	public void setFuzzyCity(String fuzzyCity) {
		this.fuzzyCity = fuzzyCity;
		if(fuzzyCity != null){
			putQueryParameter("FuzzyCity", fuzzyCity);
		}
	}

	public String getOnlineState() {
		return this.onlineState;
	}

	public void setOnlineState(String onlineState) {
		this.onlineState = onlineState;
		if(onlineState != null){
			putQueryParameter("OnlineState", onlineState);
		}
	}

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
		if(isEnabled != null){
			putQueryParameter("IsEnabled", isEnabled.toString());
		}
	}

	public String getFuzzyName() {
		return this.fuzzyName;
	}

	public void setFuzzyName(String fuzzyName) {
		this.fuzzyName = fuzzyName;
		if(fuzzyName != null){
			putQueryParameter("FuzzyName", fuzzyName);
		}
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
		}
	}

	public Long getFreqBandPlanGroupId() {
		return this.freqBandPlanGroupId;
	}

	public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
		this.freqBandPlanGroupId = freqBandPlanGroupId;
		if(freqBandPlanGroupId != null){
			putQueryParameter("FreqBandPlanGroupId", freqBandPlanGroupId.toString());
		}
	}

	public String getSortingField() {
		return this.sortingField;
	}

	public void setSortingField(String sortingField) {
		this.sortingField = sortingField;
		if(sortingField != null){
			putQueryParameter("SortingField", sortingField);
		}
	}

	public Boolean getAscending() {
		return this.ascending;
	}

	public void setAscending(Boolean ascending) {
		this.ascending = ascending;
		if(ascending != null){
			putQueryParameter("Ascending", ascending.toString());
		}
	}

	@Override
	public Class<ListGatewaysResponse> getResponseClass() {
		return ListGatewaysResponse.class;
	}

}
