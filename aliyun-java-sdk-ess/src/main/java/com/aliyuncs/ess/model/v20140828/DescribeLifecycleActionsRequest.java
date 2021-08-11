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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecycleActionsRequest extends RpcAcsRequest<DescribeLifecycleActionsResponse> {
	   

	private String lifecycleActionStatus;

	private String nextToken;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String scalingActivityId;

	private Integer maxResults;
	public DescribeLifecycleActionsRequest() {
		super("Ess", "2014-08-28", "DescribeLifecycleActions", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLifecycleActionStatus() {
		return this.lifecycleActionStatus;
	}

	public void setLifecycleActionStatus(String lifecycleActionStatus) {
		this.lifecycleActionStatus = lifecycleActionStatus;
		if(lifecycleActionStatus != null){
			putQueryParameter("LifecycleActionStatus", lifecycleActionStatus);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getScalingActivityId() {
		return this.scalingActivityId;
	}

	public void setScalingActivityId(String scalingActivityId) {
		this.scalingActivityId = scalingActivityId;
		if(scalingActivityId != null){
			putQueryParameter("ScalingActivityId", scalingActivityId);
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
	public Class<DescribeLifecycleActionsResponse> getResponseClass() {
		return DescribeLifecycleActionsResponse.class;
	}

}
