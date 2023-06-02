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
public class GetResourceCountsRequest extends RpcAcsRequest<GetResourceCountsResponse> {
	   

	private List<Filter> filters;

	private String groupByKey;
	public GetResourceCountsRequest() {
		super("ResourceCenter", "2022-12-01", "GetResourceCounts");
		setMethod(MethodType.POST);
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

	public String getGroupByKey() {
		return this.groupByKey;
	}

	public void setGroupByKey(String groupByKey) {
		this.groupByKey = groupByKey;
		if(groupByKey != null){
			putQueryParameter("GroupByKey", groupByKey);
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
	public Class<GetResourceCountsResponse> getResponseClass() {
		return GetResourceCountsResponse.class;
	}

}
