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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAssetsPropertyItemRequest extends RpcAcsRequest<GetAssetsPropertyItemResponse> {
	   

	private String searchItem;

	private String biz;

	private Integer pageSize;

	private String lang;

	private Boolean forceFlush;

	private String searchInfo;

	private Integer currentPage;
	public GetAssetsPropertyItemRequest() {
		super("Sas", "2018-12-03", "GetAssetsPropertyItem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchItem() {
		return this.searchItem;
	}

	public void setSearchItem(String searchItem) {
		this.searchItem = searchItem;
		if(searchItem != null){
			putQueryParameter("SearchItem", searchItem);
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

	public Boolean getForceFlush() {
		return this.forceFlush;
	}

	public void setForceFlush(Boolean forceFlush) {
		this.forceFlush = forceFlush;
		if(forceFlush != null){
			putQueryParameter("ForceFlush", forceFlush.toString());
		}
	}

	public String getSearchInfo() {
		return this.searchInfo;
	}

	public void setSearchInfo(String searchInfo) {
		this.searchInfo = searchInfo;
		if(searchInfo != null){
			putQueryParameter("SearchInfo", searchInfo);
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

	@Override
	public Class<GetAssetsPropertyItemResponse> getResponseClass() {
		return GetAssetsPropertyItemResponse.class;
	}

}
