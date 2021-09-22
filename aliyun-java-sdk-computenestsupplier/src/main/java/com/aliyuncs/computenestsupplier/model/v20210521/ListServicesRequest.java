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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListServicesRequest extends RpcAcsRequest<ListServicesResponse> {
	   

	private Boolean allVersions;

	private String nextToken;

	private List<Filter> filters;

	private List<RequestTags> requestTagss;

	private String maxResults;
	public ListServicesRequest() {
		super("ComputeNestSupplier", "2021-05-21", "ListServices");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAllVersions() {
		return this.allVersions;
	}

	public void setAllVersions(Boolean allVersions) {
		this.allVersions = allVersions;
		if(allVersions != null){
			putQueryParameter("AllVersions", allVersions.toString());
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
			}
		}	
	}

	public List<RequestTags> getRequestTagss() {
		return this.requestTagss;
	}

	public void setRequestTagss(List<RequestTags> requestTagss) {
		this.requestTagss = requestTagss;	
		if (requestTagss != null) {
			for (int depth1 = 0; depth1 < requestTagss.size(); depth1++) {
				putQueryParameter("RequestTags." + (depth1 + 1) + ".Value" , requestTagss.get(depth1).getValue());
				putQueryParameter("RequestTags." + (depth1 + 1) + ".Key" , requestTagss.get(depth1).getKey());
			}
		}	
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults);
		}
	}

	public static class Filter {

		private String name;

		private List<String> values;

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
	}

	public static class RequestTags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListServicesResponse> getResponseClass() {
		return ListServicesResponse.class;
	}

}
