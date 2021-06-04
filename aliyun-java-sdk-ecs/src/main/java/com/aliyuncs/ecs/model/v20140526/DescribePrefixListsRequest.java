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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePrefixListsRequest extends RpcAcsRequest<DescribePrefixListsResponse> {
	   

	private Long resourceOwnerId;

	private List<String> prefixListIds;

	private String nextToken;

	private String addressFamily;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String prefixListName;

	private Integer maxResults;
	public DescribePrefixListsRequest() {
		super("Ecs", "2014-05-26", "DescribePrefixLists", "ecs");
		setMethod(MethodType.POST);
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

	public List<String> getPrefixListIds() {
		return this.prefixListIds;
	}

	public void setPrefixListIds(List<String> prefixListIds) {
		this.prefixListIds = prefixListIds;	
		if (prefixListIds != null) {
			for (int i = 0; i < prefixListIds.size(); i++) {
				putQueryParameter("PrefixListId." + (i + 1) , prefixListIds.get(i));
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

	public String getAddressFamily() {
		return this.addressFamily;
	}

	public void setAddressFamily(String addressFamily) {
		this.addressFamily = addressFamily;
		if(addressFamily != null){
			putQueryParameter("AddressFamily", addressFamily);
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

	public String getPrefixListName() {
		return this.prefixListName;
	}

	public void setPrefixListName(String prefixListName) {
		this.prefixListName = prefixListName;
		if(prefixListName != null){
			putQueryParameter("PrefixListName", prefixListName);
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
	public Class<DescribePrefixListsResponse> getResponseClass() {
		return DescribePrefixListsResponse.class;
	}

}
