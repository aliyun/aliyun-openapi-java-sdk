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
public class CreateTransitRouterMulticastDomainRequest extends RpcAcsRequest<CreateTransitRouterMulticastDomainResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String cenId;

	private String transitRouterMulticastDomainDescription;

	private String transitRouterMulticastDomainName;

	private Options options;

	private List<Tag> tags;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterId;
	public CreateTransitRouterMulticastDomainRequest() {
		super("Cbn", "2017-09-12", "CreateTransitRouterMulticastDomain", "cbn");
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

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getTransitRouterMulticastDomainDescription() {
		return this.transitRouterMulticastDomainDescription;
	}

	public void setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
		this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
		if(transitRouterMulticastDomainDescription != null){
			putQueryParameter("TransitRouterMulticastDomainDescription", transitRouterMulticastDomainDescription);
		}
	}

	public String getTransitRouterMulticastDomainName() {
		return this.transitRouterMulticastDomainName;
	}

	public void setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
		this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
		if(transitRouterMulticastDomainName != null){
			putQueryParameter("TransitRouterMulticastDomainName", transitRouterMulticastDomainName);
		}
	}

	public Options getOptions() {
		return this.options;
	}

	public void setOptions(Options options) {
		this.options = options;	
		if (options != null) {
			
				putQueryParameter("Options.StrictSourceControl" , options.getStrictSourceControl());
				putQueryParameter("Options.Igmpv2Support" , options.getIgmpv2Support());
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

	public String getTransitRouterId() {
		return this.transitRouterId;
	}

	public void setTransitRouterId(String transitRouterId) {
		this.transitRouterId = transitRouterId;
		if(transitRouterId != null){
			putQueryParameter("TransitRouterId", transitRouterId);
		}
	}

	public static class Options {

		private String strictSourceControl;

		private String igmpv2Support;

		public String getStrictSourceControl() {
			return this.strictSourceControl;
		}

		public void setStrictSourceControl(String strictSourceControl) {
			this.strictSourceControl = strictSourceControl;
		}

		public String getIgmpv2Support() {
			return this.igmpv2Support;
		}

		public void setIgmpv2Support(String igmpv2Support) {
			this.igmpv2Support = igmpv2Support;
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
	public Class<CreateTransitRouterMulticastDomainResponse> getResponseClass() {
		return CreateTransitRouterMulticastDomainResponse.class;
	}

}
