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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAggregateDiscoveredResourcesRequest extends RpcAcsRequest<ListAggregateDiscoveredResourcesResponse> {
	   

	private Integer resourceDeleted;

	private Long resourceOwnerId;

	private String regions;

	private String aggregatorId;

	private Long resourceAccountId;

	private String nextToken;

	private String resourceId;

	private String resourceTypes;

	private Integer maxResults;
	public ListAggregateDiscoveredResourcesRequest() {
		super("Config", "2020-09-07", "ListAggregateDiscoveredResources");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getResourceDeleted() {
		return this.resourceDeleted;
	}

	public void setResourceDeleted(Integer resourceDeleted) {
		this.resourceDeleted = resourceDeleted;
		if(resourceDeleted != null){
			putQueryParameter("ResourceDeleted", resourceDeleted.toString());
		}
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

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putQueryParameter("Regions", regions);
		}
	}

	public String getAggregatorId() {
		return this.aggregatorId;
	}

	public void setAggregatorId(String aggregatorId) {
		this.aggregatorId = aggregatorId;
		if(aggregatorId != null){
			putQueryParameter("AggregatorId", aggregatorId);
		}
	}

	public Long getResourceAccountId() {
		return this.resourceAccountId;
	}

	public void setResourceAccountId(Long resourceAccountId) {
		this.resourceAccountId = resourceAccountId;
		if(resourceAccountId != null){
			putQueryParameter("ResourceAccountId", resourceAccountId.toString());
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

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(String resourceTypes) {
		this.resourceTypes = resourceTypes;
		if(resourceTypes != null){
			putQueryParameter("ResourceTypes", resourceTypes);
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
	public Class<ListAggregateDiscoveredResourcesResponse> getResponseClass() {
		return ListAggregateDiscoveredResourcesResponse.class;
	}

}
