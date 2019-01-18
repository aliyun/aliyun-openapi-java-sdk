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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayOnlineRecordsRequest extends RpcAcsRequest<ListGatewayOnlineRecordsResponse> {
	
	public ListGatewayOnlineRecordsRequest() {
		super("LinkWAN", "2018-12-30", "ListGatewayOnlineRecords", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long offSet;

	private Long limit;

	private String gwEui;

	private String sortingField;

	private Boolean ascending;

	public Long getOffSet() {
		return this.offSet;
	}

	public void setOffSet(Long offSet) {
		this.offSet = offSet;
		if(offSet != null){
			putBodyParameter("OffSet", offSet.toString());
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
		}
	}

	public String getGwEui() {
		return this.gwEui;
	}

	public void setGwEui(String gwEui) {
		this.gwEui = gwEui;
		if(gwEui != null){
			putBodyParameter("GwEui", gwEui);
		}
	}

	public String getSortingField() {
		return this.sortingField;
	}

	public void setSortingField(String sortingField) {
		this.sortingField = sortingField;
		if(sortingField != null){
			putBodyParameter("SortingField", sortingField);
		}
	}

	public Boolean getAscending() {
		return this.ascending;
	}

	public void setAscending(Boolean ascending) {
		this.ascending = ascending;
		if(ascending != null){
			putBodyParameter("Ascending", ascending.toString());
		}
	}

	@Override
	public Class<ListGatewayOnlineRecordsResponse> getResponseClass() {
		return ListGatewayOnlineRecordsResponse.class;
	}

}
