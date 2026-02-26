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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchResourcesRequest extends RpcAcsRequest<SearchResourcesResponse> {
	   

	private String resourceGroupId;

	private String nextToken;

	private SortCriterion sortCriterion;

	private List<Filter> filters;

	private Integer maxResults;
	public SearchResourcesRequest() {
		super("ResourceCenter", "2022-12-01", "SearchResources");
		setMethod(MethodType.POST);
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public SortCriterion getSortCriterion() {
		return this.sortCriterion;
	}

	public void setSortCriterion(SortCriterion sortCriterion) {
		this.sortCriterion = sortCriterion;	
		if (sortCriterion != null) {
			
				putQueryParameter("SortCriterion.Key" , sortCriterion.getKey());
				putQueryParameter("SortCriterion.Order" , sortCriterion.getOrder());
		}	
	}

	public List<Filter> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;	
		if (filters != null) {
			for (int depth1 = 0; depth1 < filters.size(); depth1++) {
				putQueryParameter("Filter." + (depth1 + 1) + ".MatchType" , filters.get(depth1).getMatchType());
				if (filters.get(depth1).getValues() != null) {
					for (int i = 0; i < filters.get(depth1).getValues().size(); i++) {
						putQueryParameter("Filter." + (depth1 + 1) + ".Value." + (i + 1) , filters.get(depth1).getValues().get(i));
					}
				}
				putQueryParameter("Filter." + (depth1 + 1) + ".Key" , filters.get(depth1).getKey());
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public static class SortCriterion {

		private String key;

		private String order;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getOrder() {
			return this.order;
		}

		public void setOrder(String order) {
			this.order = order;
		}
	}

	public static class Filter {

		private String matchType;

		private List<String> values;

		private String key;

		public String getMatchType() {
			return this.matchType;
		}

		public void setMatchType(String matchType) {
			this.matchType = matchType;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<SearchResourcesResponse> getResponseClass() {
		return SearchResourcesResponse.class;
	}

}
