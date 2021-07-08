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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterRouteEntriesRequest extends RpcAcsRequest<ListTransitRouterRouteEntriesResponse> {
	   

	private Long resourceOwnerId;

	private String transitRouterRouteEntryDestinationCidrBlock;

	private String transitRouterRouteTableId;

	private String nextToken;

	private String transitRouterRouteEntryStatus;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> transitRouterRouteEntryNamess;

	private List<String> transitRouterRouteEntryIdss;

	private Long ownerId;

	private Integer maxResults;
	public ListTransitRouterRouteEntriesRequest() {
		super("Cbn", "2017-09-12", "ListTransitRouterRouteEntries", "cbn");
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

	public String getTransitRouterRouteEntryDestinationCidrBlock() {
		return this.transitRouterRouteEntryDestinationCidrBlock;
	}

	public void setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
		this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
		if(transitRouterRouteEntryDestinationCidrBlock != null){
			putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
		}
	}

	public String getTransitRouterRouteTableId() {
		return this.transitRouterRouteTableId;
	}

	public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
		this.transitRouterRouteTableId = transitRouterRouteTableId;
		if(transitRouterRouteTableId != null){
			putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
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

	public String getTransitRouterRouteEntryStatus() {
		return this.transitRouterRouteEntryStatus;
	}

	public void setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
		this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
		if(transitRouterRouteEntryStatus != null){
			putQueryParameter("TransitRouterRouteEntryStatus", transitRouterRouteEntryStatus);
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

	public List<String> getTransitRouterRouteEntryNamess() {
		return this.transitRouterRouteEntryNamess;
	}

	public void setTransitRouterRouteEntryNamess(List<String> transitRouterRouteEntryNamess) {
		this.transitRouterRouteEntryNamess = transitRouterRouteEntryNamess;	
		if (transitRouterRouteEntryNamess != null) {
			for (int i = 0; i < transitRouterRouteEntryNamess.size(); i++) {
				putQueryParameter("TransitRouterRouteEntryNames." + (i + 1) , transitRouterRouteEntryNamess.get(i));
			}
		}	
	}

	public List<String> getTransitRouterRouteEntryIdss() {
		return this.transitRouterRouteEntryIdss;
	}

	public void setTransitRouterRouteEntryIdss(List<String> transitRouterRouteEntryIdss) {
		this.transitRouterRouteEntryIdss = transitRouterRouteEntryIdss;	
		if (transitRouterRouteEntryIdss != null) {
			for (int i = 0; i < transitRouterRouteEntryIdss.size(); i++) {
				putQueryParameter("TransitRouterRouteEntryIds." + (i + 1) , transitRouterRouteEntryIdss.get(i));
			}
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
	public Class<ListTransitRouterRouteEntriesResponse> getResponseClass() {
		return ListTransitRouterRouteEntriesResponse.class;
	}

}
