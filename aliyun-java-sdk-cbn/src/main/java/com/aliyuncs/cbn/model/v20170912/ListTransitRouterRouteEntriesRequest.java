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
	   

	private String transitRouterRouteEntryType;

	private Long resourceOwnerId;

	private String transitRouterRouteEntryNextHopResourceType;

	private String transitRouterRouteEntryNextHopType;

	private String transitRouterRouteEntryDestinationCidrBlock;

	private String transitRouterRouteTableId;

	private String nextToken;

	private String prefixListId;

	private String transitRouterRouteEntryNextHopId;

	private String transitRouterRouteEntryStatus;

	private List<RouteFilter> routeFilters;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> transitRouterRouteEntryNamess;

	private List<String> transitRouterRouteEntryIdss;

	private Long ownerId;

	private String transitRouterRouteEntryOriginResourceType;

	private Integer maxResults;

	private String transitRouterRouteEntryOriginResourceId;

	private String transitRouterRouteEntryNextHopResourceId;
	public ListTransitRouterRouteEntriesRequest() {
		super("Cbn", "2017-09-12", "ListTransitRouterRouteEntries");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTransitRouterRouteEntryType() {
		return this.transitRouterRouteEntryType;
	}

	public void setTransitRouterRouteEntryType(String transitRouterRouteEntryType) {
		this.transitRouterRouteEntryType = transitRouterRouteEntryType;
		if(transitRouterRouteEntryType != null){
			putQueryParameter("TransitRouterRouteEntryType", transitRouterRouteEntryType);
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

	public String getTransitRouterRouteEntryNextHopResourceType() {
		return this.transitRouterRouteEntryNextHopResourceType;
	}

	public void setTransitRouterRouteEntryNextHopResourceType(String transitRouterRouteEntryNextHopResourceType) {
		this.transitRouterRouteEntryNextHopResourceType = transitRouterRouteEntryNextHopResourceType;
		if(transitRouterRouteEntryNextHopResourceType != null){
			putQueryParameter("TransitRouterRouteEntryNextHopResourceType", transitRouterRouteEntryNextHopResourceType);
		}
	}

	public String getTransitRouterRouteEntryNextHopType() {
		return this.transitRouterRouteEntryNextHopType;
	}

	public void setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
		this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
		if(transitRouterRouteEntryNextHopType != null){
			putQueryParameter("TransitRouterRouteEntryNextHopType", transitRouterRouteEntryNextHopType);
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

	public String getPrefixListId() {
		return this.prefixListId;
	}

	public void setPrefixListId(String prefixListId) {
		this.prefixListId = prefixListId;
		if(prefixListId != null){
			putQueryParameter("PrefixListId", prefixListId);
		}
	}

	public String getTransitRouterRouteEntryNextHopId() {
		return this.transitRouterRouteEntryNextHopId;
	}

	public void setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
		this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
		if(transitRouterRouteEntryNextHopId != null){
			putQueryParameter("TransitRouterRouteEntryNextHopId", transitRouterRouteEntryNextHopId);
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

	public List<RouteFilter> getRouteFilters() {
		return this.routeFilters;
	}

	public void setRouteFilters(List<RouteFilter> routeFilters) {
		this.routeFilters = routeFilters;	
		if (routeFilters != null) {
			for (int depth1 = 0; depth1 < routeFilters.size(); depth1++) {
				if (routeFilters.get(depth1).getValues() != null) {
					for (int i = 0; i < routeFilters.get(depth1).getValues().size(); i++) {
						putQueryParameter("RouteFilter." + (depth1 + 1) + ".Value." + (i + 1) , routeFilters.get(depth1).getValues().get(i));
					}
				}
				putQueryParameter("RouteFilter." + (depth1 + 1) + ".Key" , routeFilters.get(depth1).getKey());
			}
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

	public String getTransitRouterRouteEntryOriginResourceType() {
		return this.transitRouterRouteEntryOriginResourceType;
	}

	public void setTransitRouterRouteEntryOriginResourceType(String transitRouterRouteEntryOriginResourceType) {
		this.transitRouterRouteEntryOriginResourceType = transitRouterRouteEntryOriginResourceType;
		if(transitRouterRouteEntryOriginResourceType != null){
			putQueryParameter("TransitRouterRouteEntryOriginResourceType", transitRouterRouteEntryOriginResourceType);
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

	public String getTransitRouterRouteEntryOriginResourceId() {
		return this.transitRouterRouteEntryOriginResourceId;
	}

	public void setTransitRouterRouteEntryOriginResourceId(String transitRouterRouteEntryOriginResourceId) {
		this.transitRouterRouteEntryOriginResourceId = transitRouterRouteEntryOriginResourceId;
		if(transitRouterRouteEntryOriginResourceId != null){
			putQueryParameter("TransitRouterRouteEntryOriginResourceId", transitRouterRouteEntryOriginResourceId);
		}
	}

	public String getTransitRouterRouteEntryNextHopResourceId() {
		return this.transitRouterRouteEntryNextHopResourceId;
	}

	public void setTransitRouterRouteEntryNextHopResourceId(String transitRouterRouteEntryNextHopResourceId) {
		this.transitRouterRouteEntryNextHopResourceId = transitRouterRouteEntryNextHopResourceId;
		if(transitRouterRouteEntryNextHopResourceId != null){
			putQueryParameter("TransitRouterRouteEntryNextHopResourceId", transitRouterRouteEntryNextHopResourceId);
		}
	}

	public static class RouteFilter {

		private List<String> values;

		private String key;

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListTransitRouterRouteEntriesResponse> getResponseClass() {
		return ListTransitRouterRouteEntriesResponse.class;
	}

}
