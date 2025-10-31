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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTransitRouteTableAggregationRequest extends RpcAcsRequest<ModifyTransitRouteTableAggregationResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String transitRouteTableAggregationDescription;

	private String transitRouteTableAggregationName;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String transitRouteTableAggregationScope;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouteTableId;

	@SerializedName("transitRouteTableAggregationScopeList")
	private List<String> transitRouteTableAggregationScopeList;

	private String transitRouteTableAggregationCidr;
	public ModifyTransitRouteTableAggregationRequest() {
		super("Cbn", "2017-09-12", "ModifyTransitRouteTableAggregation", "cbn");
		setProtocol(ProtocolType.HTTPS);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getTransitRouteTableAggregationDescription() {
		return this.transitRouteTableAggregationDescription;
	}

	public void setTransitRouteTableAggregationDescription(String transitRouteTableAggregationDescription) {
		this.transitRouteTableAggregationDescription = transitRouteTableAggregationDescription;
		if(transitRouteTableAggregationDescription != null){
			putQueryParameter("TransitRouteTableAggregationDescription", transitRouteTableAggregationDescription);
		}
	}

	public String getTransitRouteTableAggregationName() {
		return this.transitRouteTableAggregationName;
	}

	public void setTransitRouteTableAggregationName(String transitRouteTableAggregationName) {
		this.transitRouteTableAggregationName = transitRouteTableAggregationName;
		if(transitRouteTableAggregationName != null){
			putQueryParameter("TransitRouteTableAggregationName", transitRouteTableAggregationName);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getTransitRouteTableAggregationScope() {
		return this.transitRouteTableAggregationScope;
	}

	public void setTransitRouteTableAggregationScope(String transitRouteTableAggregationScope) {
		this.transitRouteTableAggregationScope = transitRouteTableAggregationScope;
		if(transitRouteTableAggregationScope != null){
			putQueryParameter("TransitRouteTableAggregationScope", transitRouteTableAggregationScope);
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

	public String getTransitRouteTableId() {
		return this.transitRouteTableId;
	}

	public void setTransitRouteTableId(String transitRouteTableId) {
		this.transitRouteTableId = transitRouteTableId;
		if(transitRouteTableId != null){
			putQueryParameter("TransitRouteTableId", transitRouteTableId);
		}
	}

	public List<String> getTransitRouteTableAggregationScopeList() {
		return this.transitRouteTableAggregationScopeList;
	}

	public void setTransitRouteTableAggregationScopeList(List<String> transitRouteTableAggregationScopeList) {
		this.transitRouteTableAggregationScopeList = transitRouteTableAggregationScopeList;	
		if (transitRouteTableAggregationScopeList != null) {
			putQueryParameter("TransitRouteTableAggregationScopeList" , new Gson().toJson(transitRouteTableAggregationScopeList));
		}	
	}

	public String getTransitRouteTableAggregationCidr() {
		return this.transitRouteTableAggregationCidr;
	}

	public void setTransitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
		this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
		if(transitRouteTableAggregationCidr != null){
			putQueryParameter("TransitRouteTableAggregationCidr", transitRouteTableAggregationCidr);
		}
	}

	@Override
	public Class<ModifyTransitRouteTableAggregationResponse> getResponseClass() {
		return ModifyTransitRouteTableAggregationResponse.class;
	}

}
