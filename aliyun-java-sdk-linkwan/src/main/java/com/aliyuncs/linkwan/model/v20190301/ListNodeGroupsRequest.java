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
public class ListNodeGroupsRequest extends RpcAcsRequest<ListNodeGroupsResponse> {
	   

	private String fuzzyName;

	private Long offset;

	private String fuzzyJoinEui;

	private String fuzzyDevEui;

	private Long limit;

	private String sortingField;

	private Boolean ascending;
	public ListNodeGroupsRequest() {
		super("LinkWAN", "2019-03-01", "ListNodeGroups", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getFuzzyJoinEui() {
		return this.fuzzyJoinEui;
	}

	public void setFuzzyJoinEui(String fuzzyJoinEui) {
		this.fuzzyJoinEui = fuzzyJoinEui;
		if(fuzzyJoinEui != null){
			putQueryParameter("FuzzyJoinEui", fuzzyJoinEui);
		}
	}

	public String getFuzzyDevEui() {
		return this.fuzzyDevEui;
	}

	public void setFuzzyDevEui(String fuzzyDevEui) {
		this.fuzzyDevEui = fuzzyDevEui;
		if(fuzzyDevEui != null){
			putQueryParameter("FuzzyDevEui", fuzzyDevEui);
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
	public Class<ListNodeGroupsResponse> getResponseClass() {
		return ListNodeGroupsResponse.class;
	}

}
