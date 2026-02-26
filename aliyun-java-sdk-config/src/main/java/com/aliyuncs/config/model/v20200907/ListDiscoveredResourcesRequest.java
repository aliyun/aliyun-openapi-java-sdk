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
public class ListDiscoveredResourcesRequest extends RpcAcsRequest<ListDiscoveredResourcesResponse> {
	   

	private Integer resourceDeleted;

	private String regions;

	private Long endUpdateTimestamp;

	private String nextToken;

	private Long startUpdateTimestamp;

	private String resourceId;

	private String resourceTypes;

	private String excludeResourceTypes;

	private Integer maxResults;
	public ListDiscoveredResourcesRequest() {
		super("Config", "2020-09-07", "ListDiscoveredResources", "config");
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

	public String getRegions() {
		return this.regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
		if(regions != null){
			putQueryParameter("Regions", regions);
		}
	}

	public Long getEndUpdateTimestamp() {
		return this.endUpdateTimestamp;
	}

	public void setEndUpdateTimestamp(Long endUpdateTimestamp) {
		this.endUpdateTimestamp = endUpdateTimestamp;
		if(endUpdateTimestamp != null){
			putQueryParameter("EndUpdateTimestamp", endUpdateTimestamp.toString());
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

	public Long getStartUpdateTimestamp() {
		return this.startUpdateTimestamp;
	}

	public void setStartUpdateTimestamp(Long startUpdateTimestamp) {
		this.startUpdateTimestamp = startUpdateTimestamp;
		if(startUpdateTimestamp != null){
			putQueryParameter("StartUpdateTimestamp", startUpdateTimestamp.toString());
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

	public String getExcludeResourceTypes() {
		return this.excludeResourceTypes;
	}

	public void setExcludeResourceTypes(String excludeResourceTypes) {
		this.excludeResourceTypes = excludeResourceTypes;
		if(excludeResourceTypes != null){
			putQueryParameter("ExcludeResourceTypes", excludeResourceTypes);
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
	public Class<ListDiscoveredResourcesResponse> getResponseClass() {
		return ListDiscoveredResourcesResponse.class;
	}

}
