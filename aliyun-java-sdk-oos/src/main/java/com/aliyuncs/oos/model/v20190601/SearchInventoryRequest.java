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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchInventoryRequest extends RpcAcsRequest<SearchInventoryResponse> {
	   

	private List<String> aggregators;

	private List<Filter> filters;

	private String nextToken;

	private Integer maxResults;
	public SearchInventoryRequest() {
		super("oos", "2019-06-01", "SearchInventory", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getAggregators() {
		return this.aggregators;
	}

	public void setAggregators(List<String> aggregators) {
		this.aggregators = aggregators;	
		if (aggregators != null) {
			for (int i = 0; i < aggregators.size(); i++) {
				putQueryParameter("Aggregator." + (i + 1) , aggregators.get(i));
			}
		}	
	}

	public List<Filter> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;	
		if (filters != null) {
			for (int depth1 = 0; depth1 < filters.size(); depth1++) {
				putQueryParameter("Filter." + (depth1 + 1) + ".Name" , filters.get(depth1).getName());
				if (filters.get(depth1).getValues() != null) {
					for (int i = 0; i < filters.get(depth1).getValues().size(); i++) {
						putQueryParameter("Filter." + (depth1 + 1) + ".Value." + (i + 1) , filters.get(depth1).getValues().get(i));
					}
				}
				putQueryParameter("Filter." + (depth1 + 1) + ".Operator" , filters.get(depth1).getOperator());
			}
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public static class Filter {

		private String name;

		private List<String> values;

		private String operator;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}
	}

	@Override
	public Class<SearchInventoryResponse> getResponseClass() {
		return SearchInventoryResponse.class;
	}

}
