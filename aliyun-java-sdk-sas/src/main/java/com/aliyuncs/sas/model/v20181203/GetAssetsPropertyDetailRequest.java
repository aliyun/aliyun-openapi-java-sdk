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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAssetsPropertyDetailRequest extends RpcAcsRequest<GetAssetsPropertyDetailResponse> {
	   

	private String remark;

	private String uuid;

	private String biz;

	private Integer pageSize;

	private String lang;

	private List<SearchCriteriaList> searchCriteriaLists;

	private String itemName;

	private Integer currentPage;
	public GetAssetsPropertyDetailRequest() {
		super("Sas", "2018-12-03", "GetAssetsPropertyDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
		if(biz != null){
			putQueryParameter("Biz", biz);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public List<SearchCriteriaList> getSearchCriteriaLists() {
		return this.searchCriteriaLists;
	}

	public void setSearchCriteriaLists(List<SearchCriteriaList> searchCriteriaLists) {
		this.searchCriteriaLists = searchCriteriaLists;	
		if (searchCriteriaLists != null) {
			for (int depth1 = 0; depth1 < searchCriteriaLists.size(); depth1++) {
				putQueryParameter("SearchCriteriaList." + (depth1 + 1) + ".Name" , searchCriteriaLists.get(depth1).getName());
				putQueryParameter("SearchCriteriaList." + (depth1 + 1) + ".Value" , searchCriteriaLists.get(depth1).getValue());
			}
		}	
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
		if(itemName != null){
			putQueryParameter("ItemName", itemName);
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

	public static class SearchCriteriaList {

		private String name;

		private String value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<GetAssetsPropertyDetailResponse> getResponseClass() {
		return GetAssetsPropertyDetailResponse.class;
	}

}
