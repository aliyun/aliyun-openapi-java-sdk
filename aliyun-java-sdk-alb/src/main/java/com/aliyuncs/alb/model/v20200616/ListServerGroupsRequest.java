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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListServerGroupsRequest extends RpcAcsRequest<ListServerGroupsResponse> {
	   

	private List<String> serverGroupNames;

	private String resourceGroupId;

	private String nextToken;

	private List<String> serverGroupIds;

	private String vpcId;

	private Integer maxResults;
	public ListServerGroupsRequest() {
		super("Alb", "2020-06-16", "ListServerGroups", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getServerGroupNames() {
		return this.serverGroupNames;
	}

	public void setServerGroupNames(List<String> serverGroupNames) {
		this.serverGroupNames = serverGroupNames;	
		if (serverGroupNames != null) {
			for (int depth1 = 0; depth1 < serverGroupNames.size(); depth1++) {
				putQueryParameter("ServerGroupNames." + (depth1 + 1) , serverGroupNames.get(depth1));
			}
		}	
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

	public List<String> getServerGroupIds() {
		return this.serverGroupIds;
	}

	public void setServerGroupIds(List<String> serverGroupIds) {
		this.serverGroupIds = serverGroupIds;	
		if (serverGroupIds != null) {
			for (int depth1 = 0; depth1 < serverGroupIds.size(); depth1++) {
				putQueryParameter("ServerGroupIds." + (depth1 + 1) , serverGroupIds.get(depth1));
			}
		}	
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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
	public Class<ListServerGroupsResponse> getResponseClass() {
		return ListServerGroupsResponse.class;
	}

}
