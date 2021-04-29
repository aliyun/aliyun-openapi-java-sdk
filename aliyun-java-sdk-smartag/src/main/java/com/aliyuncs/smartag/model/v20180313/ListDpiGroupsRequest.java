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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDpiGroupsRequest extends RpcAcsRequest<ListDpiGroupsResponse> {
	   

	private List<String> dpiGroupIdss;

	private Long resourceOwnerId;

	private String nextToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> dpiGroupNamess;

	private Integer maxResults;
	public ListDpiGroupsRequest() {
		super("Smartag", "2018-03-13", "ListDpiGroups", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDpiGroupIdss() {
		return this.dpiGroupIdss;
	}

	public void setDpiGroupIdss(List<String> dpiGroupIdss) {
		this.dpiGroupIdss = dpiGroupIdss;	
		if (dpiGroupIdss != null) {
			for (int i = 0; i < dpiGroupIdss.size(); i++) {
				putQueryParameter("DpiGroupIds." + (i + 1) , dpiGroupIdss.get(i));
			}
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public List<String> getDpiGroupNamess() {
		return this.dpiGroupNamess;
	}

	public void setDpiGroupNamess(List<String> dpiGroupNamess) {
		this.dpiGroupNamess = dpiGroupNamess;	
		if (dpiGroupNamess != null) {
			for (int i = 0; i < dpiGroupNamess.size(); i++) {
				putQueryParameter("DpiGroupNames." + (i + 1) , dpiGroupNamess.get(i));
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
	public Class<ListDpiGroupsResponse> getResponseClass() {
		return ListDpiGroupsResponse.class;
	}

}
