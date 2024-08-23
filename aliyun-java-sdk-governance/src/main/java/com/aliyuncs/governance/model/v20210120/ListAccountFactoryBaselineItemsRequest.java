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

package com.aliyuncs.governance.model.v20210120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.governance.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAccountFactoryBaselineItemsRequest extends RpcAcsRequest<ListAccountFactoryBaselineItemsResponse> {
	   

	private String type;

	private String nextToken;

	private List<String> names;

	private List<String> versions;

	private Integer maxResults;
	public ListAccountFactoryBaselineItemsRequest() {
		super("governance", "2021-01-20", "ListAccountFactoryBaselineItems", "governance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public List<String> getNames() {
		return this.names;
	}

	public void setNames(List<String> names) {
		this.names = names;	
		if (names != null) {
			for (int depth1 = 0; depth1 < names.size(); depth1++) {
				putQueryParameter("Names." + (depth1 + 1) , names.get(depth1));
			}
		}	
	}

	public List<String> getVersions() {
		return this.versions;
	}

	public void setVersions(List<String> versions) {
		this.versions = versions;	
		if (versions != null) {
			for (int depth1 = 0; depth1 < versions.size(); depth1++) {
				putQueryParameter("Versions." + (depth1 + 1) , versions.get(depth1));
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

	@Override
	public Class<ListAccountFactoryBaselineItemsResponse> getResponseClass() {
		return ListAccountFactoryBaselineItemsResponse.class;
	}

}
