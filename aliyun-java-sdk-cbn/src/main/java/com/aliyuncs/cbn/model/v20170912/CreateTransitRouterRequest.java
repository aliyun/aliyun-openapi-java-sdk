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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTransitRouterRequest extends RpcAcsRequest<CreateTransitRouterResponse> {
	   

	private String transitRouterName;

	private Long resourceOwnerId;

	private String clientToken;

	private String cenId;

	@SerializedName("transitRouterCidrList")
	private List<TransitRouterCidrList> transitRouterCidrList;

	private List<Tag> tags;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterDescription;

	private Boolean supportMulticast;
	public CreateTransitRouterRequest() {
		super("Cbn", "2017-09-12", "CreateTransitRouter");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTransitRouterName() {
		return this.transitRouterName;
	}

	public void setTransitRouterName(String transitRouterName) {
		this.transitRouterName = transitRouterName;
		if(transitRouterName != null){
			putQueryParameter("TransitRouterName", transitRouterName);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public List<TransitRouterCidrList> getTransitRouterCidrList() {
		return this.transitRouterCidrList;
	}

	public void setTransitRouterCidrList(List<TransitRouterCidrList> transitRouterCidrList) {
		this.transitRouterCidrList = transitRouterCidrList;	
		if (transitRouterCidrList != null) {
			putQueryParameter("TransitRouterCidrList" , new Gson().toJson(transitRouterCidrList));
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public String getTransitRouterDescription() {
		return this.transitRouterDescription;
	}

	public void setTransitRouterDescription(String transitRouterDescription) {
		this.transitRouterDescription = transitRouterDescription;
		if(transitRouterDescription != null){
			putQueryParameter("TransitRouterDescription", transitRouterDescription);
		}
	}

	public Boolean getSupportMulticast() {
		return this.supportMulticast;
	}

	public void setSupportMulticast(Boolean supportMulticast) {
		this.supportMulticast = supportMulticast;
		if(supportMulticast != null){
			putQueryParameter("SupportMulticast", supportMulticast.toString());
		}
	}

	public static class TransitRouterCidrList {

		@SerializedName("Name")
		private String name;

		@SerializedName("Description")
		private String description;

		@SerializedName("Cidr")
		private String cidr;

		@SerializedName("PublishCidrRoute")
		private Boolean publishCidrRoute;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public Boolean getPublishCidrRoute() {
			return this.publishCidrRoute;
		}

		public void setPublishCidrRoute(Boolean publishCidrRoute) {
			this.publishCidrRoute = publishCidrRoute;
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateTransitRouterResponse> getResponseClass() {
		return CreateTransitRouterResponse.class;
	}

}
