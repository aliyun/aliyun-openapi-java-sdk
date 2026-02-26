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

package com.aliyuncs.trademark.model.v20190902;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchSimilarityRequest extends RpcAcsRequest<SearchSimilarityResponse> {
	   

	private String sorter;

	private String umid;

	private List<Object> classifications;

	private List<NameUriList> nameUriLists;

	private List<Object> similarGroups;

	private Boolean showDetail;

	private String searchType;

	private Integer limit;
	public SearchSimilarityRequest() {
		super("Trademark", "2019-09-02", "SearchSimilarity");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSorter() {
		return this.sorter;
	}

	public void setSorter(String sorter) {
		this.sorter = sorter;
		if(sorter != null){
			putQueryParameter("Sorter", sorter);
		}
	}

	public String getUmid() {
		return this.umid;
	}

	public void setUmid(String umid) {
		this.umid = umid;
		if(umid != null){
			putQueryParameter("Umid", umid);
		}
	}

	public List<Object> getClassifications() {
		return this.classifications;
	}

	public void setClassifications(List<Object> classifications) {
		this.classifications = classifications;
		if(classifications != null){
			putQueryParameter("Classifications", new Gson().toJson(classifications));
		}
	}

	public List<NameUriList> getNameUriLists() {
		return this.nameUriLists;
	}

	public void setNameUriLists(List<NameUriList> nameUriLists) {
		this.nameUriLists = nameUriLists;	
		if (nameUriLists != null) {
			for (int depth1 = 0; depth1 < nameUriLists.size(); depth1++) {
				putQueryParameter("NameUriList." + (depth1 + 1) + ".Name" , nameUriLists.get(depth1).getName());
				putQueryParameter("NameUriList." + (depth1 + 1) + ".Uri" , nameUriLists.get(depth1).getUri());
			}
		}	
	}

	public List<Object> getSimilarGroups() {
		return this.similarGroups;
	}

	public void setSimilarGroups(List<Object> similarGroups) {
		this.similarGroups = similarGroups;
		if(similarGroups != null){
			putQueryParameter("SimilarGroups", new Gson().toJson(similarGroups));
		}
	}

	public Boolean getShowDetail() {
		return this.showDetail;
	}

	public void setShowDetail(Boolean showDetail) {
		this.showDetail = showDetail;
		if(showDetail != null){
			putQueryParameter("ShowDetail", showDetail.toString());
		}
	}

	public String getSearchType() {
		return this.searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
		if(searchType != null){
			putQueryParameter("SearchType", searchType);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public static class NameUriList {

		private String name;

		private String uri;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUri() {
			return this.uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}
	}

	@Override
	public Class<SearchSimilarityResponse> getResponseClass() {
		return SearchSimilarityResponse.class;
	}

}
