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
public class CreateTransitRouterPeerAttachmentRequest extends RpcAcsRequest<CreateTransitRouterPeerAttachmentResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String cenId;

	private String transitRouterAttachmentName;

	private Boolean autoPublishRouteEnabled;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private Integer bandwidth;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterId;

	private String transitRouterAttachmentDescription;

	private String peerTransitRouterRegionId;

	private String cenBandwidthPackageId;

	private String peerTransitRouterId;
	public CreateTransitRouterPeerAttachmentRequest() {
		super("Cbn", "2017-09-12", "CreateTransitRouterPeerAttachment", "cbn");
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

	public String getTransitRouterAttachmentName() {
		return this.transitRouterAttachmentName;
	}

	public void setTransitRouterAttachmentName(String transitRouterAttachmentName) {
		this.transitRouterAttachmentName = transitRouterAttachmentName;
		if(transitRouterAttachmentName != null){
			putQueryParameter("TransitRouterAttachmentName", transitRouterAttachmentName);
		}
	}

	public Boolean getAutoPublishRouteEnabled() {
		return this.autoPublishRouteEnabled;
	}

	public void setAutoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
		this.autoPublishRouteEnabled = autoPublishRouteEnabled;
		if(autoPublishRouteEnabled != null){
			putQueryParameter("AutoPublishRouteEnabled", autoPublishRouteEnabled.toString());
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

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
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

	public String getTransitRouterAttachmentDescription() {
		return this.transitRouterAttachmentDescription;
	}

	public void setTransitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
		this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
		if(transitRouterAttachmentDescription != null){
			putQueryParameter("TransitRouterAttachmentDescription", transitRouterAttachmentDescription);
		}
	}

	public String getPeerTransitRouterRegionId() {
		return this.peerTransitRouterRegionId;
	}

	public void setPeerTransitRouterRegionId(String peerTransitRouterRegionId) {
		this.peerTransitRouterRegionId = peerTransitRouterRegionId;
		if(peerTransitRouterRegionId != null){
			putQueryParameter("PeerTransitRouterRegionId", peerTransitRouterRegionId);
		}
	}

	public String getCenBandwidthPackageId() {
		return this.cenBandwidthPackageId;
	}

	public void setCenBandwidthPackageId(String cenBandwidthPackageId) {
		this.cenBandwidthPackageId = cenBandwidthPackageId;
		if(cenBandwidthPackageId != null){
			putQueryParameter("CenBandwidthPackageId", cenBandwidthPackageId);
		}
	}

	public String getPeerTransitRouterId() {
		return this.peerTransitRouterId;
	}

	public void setPeerTransitRouterId(String peerTransitRouterId) {
		this.peerTransitRouterId = peerTransitRouterId;
		if(peerTransitRouterId != null){
			putQueryParameter("PeerTransitRouterId", peerTransitRouterId);
		}
	}

	@Override
	public Class<CreateTransitRouterPeerAttachmentResponse> getResponseClass() {
		return CreateTransitRouterPeerAttachmentResponse.class;
	}

}
