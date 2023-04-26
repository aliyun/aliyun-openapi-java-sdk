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
public class ListAggregateResourceRelationsRequest extends RpcAcsRequest<ListAggregateResourceRelationsResponse> {
	   

	private String targetResourceId;

	private String aggregatorId;

	private String relationType;

	private Long resourceAccountId;

	private String nextToken;

	private String targetResourceType;

	private String resourceId;

	private String resourceType;

	private Integer maxResults;

	private String region;
	public ListAggregateResourceRelationsRequest() {
		super("Config", "2020-09-07", "ListAggregateResourceRelations");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetResourceId() {
		return this.targetResourceId;
	}

	public void setTargetResourceId(String targetResourceId) {
		this.targetResourceId = targetResourceId;
		if(targetResourceId != null){
			putQueryParameter("TargetResourceId", targetResourceId);
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

	public String getRelationType() {
		return this.relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
		if(relationType != null){
			putQueryParameter("RelationType", relationType);
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

	public String getTargetResourceType() {
		return this.targetResourceType;
	}

	public void setTargetResourceType(String targetResourceType) {
		this.targetResourceType = targetResourceType;
		if(targetResourceType != null){
			putQueryParameter("TargetResourceType", targetResourceType);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<ListAggregateResourceRelationsResponse> getResponseClass() {
		return ListAggregateResourceRelationsResponse.class;
	}

}
