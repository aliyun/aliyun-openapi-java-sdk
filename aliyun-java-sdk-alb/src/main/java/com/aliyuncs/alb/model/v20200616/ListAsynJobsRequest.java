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
public class ListAsynJobsRequest extends RpcAcsRequest<ListAsynJobsResponse> {
	   

	private String nextToken;

	private Long endTime;

	private Long beginTime;

	private String resourceType;

	private String apiName;

	private List<String> jobIds;

	private Long maxResults;

	private List<String> resourceIds;
	public ListAsynJobsRequest() {
		super("Alb", "2020-06-16", "ListAsynJobs", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
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

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		if(apiName != null){
			putQueryParameter("ApiName", apiName);
		}
	}

	public List<String> getJobIds() {
		return this.jobIds;
	}

	public void setJobIds(List<String> jobIds) {
		this.jobIds = jobIds;	
		if (jobIds != null) {
			for (int depth1 = 0; depth1 < jobIds.size(); depth1++) {
				putQueryParameter("JobIds." + (depth1 + 1) , jobIds.get(depth1));
			}
		}	
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<String> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int depth1 = 0; depth1 < resourceIds.size(); depth1++) {
				putQueryParameter("ResourceIds." + (depth1 + 1) , resourceIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListAsynJobsResponse> getResponseClass() {
		return ListAsynJobsResponse.class;
	}

}
