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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkInsightsAnalysisesRequest extends RpcAcsRequest<DescribeNetworkInsightsAnalysisesResponse> {
	   

	private Long resourceOwnerId;

	private String networkInsightsPathId;

	private String nextToken;

	private List<String> networkInsightsAnalysisIds;

	private String networkPathFound;

	private Boolean dryRun;

	private Integer maxResults;

	private String status;
	public DescribeNetworkInsightsAnalysisesRequest() {
		super("Ecs", "2016-03-14", "DescribeNetworkInsightsAnalysises", "ecs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getNetworkInsightsPathId() {
		return this.networkInsightsPathId;
	}

	public void setNetworkInsightsPathId(String networkInsightsPathId) {
		this.networkInsightsPathId = networkInsightsPathId;
		if(networkInsightsPathId != null){
			putQueryParameter("NetworkInsightsPathId", networkInsightsPathId);
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

	public List<String> getNetworkInsightsAnalysisIds() {
		return this.networkInsightsAnalysisIds;
	}

	public void setNetworkInsightsAnalysisIds(List<String> networkInsightsAnalysisIds) {
		this.networkInsightsAnalysisIds = networkInsightsAnalysisIds;	
		if (networkInsightsAnalysisIds != null) {
			for (int i = 0; i < networkInsightsAnalysisIds.size(); i++) {
				putQueryParameter("NetworkInsightsAnalysisId." + (i + 1) , networkInsightsAnalysisIds.get(i));
			}
		}	
	}

	public String getNetworkPathFound() {
		return this.networkPathFound;
	}

	public void setNetworkPathFound(String networkPathFound) {
		this.networkPathFound = networkPathFound;
		if(networkPathFound != null){
			putQueryParameter("NetworkPathFound", networkPathFound);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeNetworkInsightsAnalysisesResponse> getResponseClass() {
		return DescribeNetworkInsightsAnalysisesResponse.class;
	}

}
