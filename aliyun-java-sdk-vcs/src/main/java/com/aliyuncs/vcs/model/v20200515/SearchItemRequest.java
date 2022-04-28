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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchItemRequest extends RpcAcsRequest<SearchItemResponse> {
	   

	private Long pageNumber;

	private Long pageSize;

	private Double similarityThreshold;

	private String itemImageUrl;

	private String itemImageData;

	private String searchTableIds;
	public SearchItemRequest() {
		super("Vcs", "2020-05-15", "SearchItem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Double getSimilarityThreshold() {
		return this.similarityThreshold;
	}

	public void setSimilarityThreshold(Double similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
		if(similarityThreshold != null){
			putBodyParameter("SimilarityThreshold", similarityThreshold.toString());
		}
	}

	public String getItemImageUrl() {
		return this.itemImageUrl;
	}

	public void setItemImageUrl(String itemImageUrl) {
		this.itemImageUrl = itemImageUrl;
		if(itemImageUrl != null){
			putBodyParameter("ItemImageUrl", itemImageUrl);
		}
	}

	public String getItemImageData() {
		return this.itemImageData;
	}

	public void setItemImageData(String itemImageData) {
		this.itemImageData = itemImageData;
		if(itemImageData != null){
			putBodyParameter("ItemImageData", itemImageData);
		}
	}

	public String getSearchTableIds() {
		return this.searchTableIds;
	}

	public void setSearchTableIds(String searchTableIds) {
		this.searchTableIds = searchTableIds;
		if(searchTableIds != null){
			putBodyParameter("SearchTableIds", searchTableIds);
		}
	}

	@Override
	public Class<SearchItemResponse> getResponseClass() {
		return SearchItemResponse.class;
	}

}
