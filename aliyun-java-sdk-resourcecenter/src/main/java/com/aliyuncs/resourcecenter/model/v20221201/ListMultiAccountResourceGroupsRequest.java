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
public class ListMultiAccountResourceGroupsRequest extends RpcAcsRequest<ListMultiAccountResourceGroupsResponse> {
	   

	private String accountId;

	private String nextToken;

	private List<String> resourceGroupIdss;

	private Integer maxResults;
	public ListMultiAccountResourceGroupsRequest() {
		super("ResourceCenter", "2022-12-01", "ListMultiAccountResourceGroups");
		setMethod(MethodType.POST);
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
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

	public List<String> getResourceGroupIdss() {
		return this.resourceGroupIdss;
	}

	public void setResourceGroupIdss(List<String> resourceGroupIdss) {
		this.resourceGroupIdss = resourceGroupIdss;	
		if (resourceGroupIdss != null) {
			for (int i = 0; i < resourceGroupIdss.size(); i++) {
				putQueryParameter("ResourceGroupIds." + (i + 1) , resourceGroupIdss.get(i));
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
	public Class<ListMultiAccountResourceGroupsResponse> getResponseClass() {
		return ListMultiAccountResourceGroupsResponse.class;
	}

}
