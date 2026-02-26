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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterCidrAllocationRequest extends RpcAcsRequest<ListTransitRouterCidrAllocationResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String transitRouterCidrId;

	private String nextToken;

	private String cidr;

	private String dedicatedOwnerId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterId;

	private String attachmentName;

	private String cidrBlock;

	private Integer maxResults;

	private String attachmentId;
	public ListTransitRouterCidrAllocationRequest() {
		super("Cbn", "2017-09-12", "ListTransitRouterCidrAllocation", "cbn");
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

	public String getTransitRouterCidrId() {
		return this.transitRouterCidrId;
	}

	public void setTransitRouterCidrId(String transitRouterCidrId) {
		this.transitRouterCidrId = transitRouterCidrId;
		if(transitRouterCidrId != null){
			putQueryParameter("TransitRouterCidrId", transitRouterCidrId);
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

	public String getCidr() {
		return this.cidr;
	}

	public void setCidr(String cidr) {
		this.cidr = cidr;
		if(cidr != null){
			putQueryParameter("Cidr", cidr);
		}
	}

	public String getDedicatedOwnerId() {
		return this.dedicatedOwnerId;
	}

	public void setDedicatedOwnerId(String dedicatedOwnerId) {
		this.dedicatedOwnerId = dedicatedOwnerId;
		if(dedicatedOwnerId != null){
			putQueryParameter("DedicatedOwnerId", dedicatedOwnerId);
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

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
		if(attachmentName != null){
			putQueryParameter("AttachmentName", attachmentName);
		}
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
		if(cidrBlock != null){
			putQueryParameter("CidrBlock", cidrBlock);
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

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
		if(attachmentId != null){
			putQueryParameter("AttachmentId", attachmentId);
		}
	}

	@Override
	public Class<ListTransitRouterCidrAllocationResponse> getResponseClass() {
		return ListTransitRouterCidrAllocationResponse.class;
	}

}
