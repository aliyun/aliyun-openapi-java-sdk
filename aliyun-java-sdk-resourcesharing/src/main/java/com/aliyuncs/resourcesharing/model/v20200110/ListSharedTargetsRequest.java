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

package com.aliyuncs.resourcesharing.model.v20200110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcesharing.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSharedTargetsRequest extends RpcAcsRequest<ListSharedTargetsResponse> {
	   

	private List<String> targetss;

	private String nextToken;

	private List<String> resourceShareIdss;

	private String resourceId;

	private String resourceOwner;

	private String resourceType;

	private Integer maxResults;
	public ListSharedTargetsRequest() {
		super("ResourceSharing", "2020-01-10", "ListSharedTargets", "ressharing");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTargetss() {
		return this.targetss;
	}

	public void setTargetss(List<String> targetss) {
		this.targetss = targetss;	
		if (targetss != null) {
			for (int i = 0; i < targetss.size(); i++) {
				putQueryParameter("Targets." + (i + 1) , targetss.get(i));
			}
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

	public List<String> getResourceShareIdss() {
		return this.resourceShareIdss;
	}

	public void setResourceShareIdss(List<String> resourceShareIdss) {
		this.resourceShareIdss = resourceShareIdss;	
		if (resourceShareIdss != null) {
			for (int i = 0; i < resourceShareIdss.size(); i++) {
				putQueryParameter("ResourceShareIds." + (i + 1) , resourceShareIdss.get(i));
			}
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

	public String getResourceOwner() {
		return this.resourceOwner;
	}

	public void setResourceOwner(String resourceOwner) {
		this.resourceOwner = resourceOwner;
		if(resourceOwner != null){
			putQueryParameter("ResourceOwner", resourceOwner);
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

	@Override
	public Class<ListSharedTargetsResponse> getResponseClass() {
		return ListSharedTargetsResponse.class;
	}

}
