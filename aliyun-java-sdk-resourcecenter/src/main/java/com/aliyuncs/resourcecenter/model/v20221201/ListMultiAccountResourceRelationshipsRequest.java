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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListMultiAccountResourceRelationshipsRequest extends RpcAcsRequest<ListMultiAccountResourceRelationshipsResponse> {
	   

	private String nextToken;

	private String scope;

	private String resourceId;

	private String resourceType;

	private List<RelatedResourceFilter> relatedResourceFilters;

	private Integer maxResults;
	public ListMultiAccountResourceRelationshipsRequest() {
		super("ResourceCenter", "2022-12-01", "ListMultiAccountResourceRelationships");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public List<RelatedResourceFilter> getRelatedResourceFilters() {
		return this.relatedResourceFilters;
	}

	public void setRelatedResourceFilters(List<RelatedResourceFilter> relatedResourceFilters) {
		this.relatedResourceFilters = relatedResourceFilters;	
		if (relatedResourceFilters != null) {
			for (int depth1 = 0; depth1 < relatedResourceFilters.size(); depth1++) {
				putQueryParameter("RelatedResourceFilter." + (depth1 + 1) + ".MatchType" , relatedResourceFilters.get(depth1).getMatchType());
				if (relatedResourceFilters.get(depth1).getValues() != null) {
					for (int i = 0; i < relatedResourceFilters.get(depth1).getValues().size(); i++) {
						putQueryParameter("RelatedResourceFilter." + (depth1 + 1) + ".Value." + (i + 1) , relatedResourceFilters.get(depth1).getValues().get(i));
					}
				}
				putQueryParameter("RelatedResourceFilter." + (depth1 + 1) + ".Key" , relatedResourceFilters.get(depth1).getKey());
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

	public static class RelatedResourceFilter {

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
	public Class<ListMultiAccountResourceRelationshipsResponse> getResponseClass() {
		return ListMultiAccountResourceRelationshipsResponse.class;
	}

}
