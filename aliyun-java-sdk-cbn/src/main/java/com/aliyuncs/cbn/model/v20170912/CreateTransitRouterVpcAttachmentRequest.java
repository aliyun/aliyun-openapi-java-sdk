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
public class CreateTransitRouterVpcAttachmentRequest extends RpcAcsRequest<CreateTransitRouterVpcAttachmentResponse> {
	   

	private Long resourceOwnerId;

	private Long vpcOwnerId;

	private String clientToken;

	private String cenId;

	private String transitRouterAttachmentName;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private List<ZoneMappings> zoneMappingss;

	private String ownerAccount;

	private Long ownerId;

	private String transitRouterId;

	private String transitRouterAttachmentDescription;

	private String vpcId;

	private String chargeType;
	public CreateTransitRouterVpcAttachmentRequest() {
		super("Cbn", "2017-09-12", "CreateTransitRouterVpcAttachment", "cbn");
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

	public Long getVpcOwnerId() {
		return this.vpcOwnerId;
	}

	public void setVpcOwnerId(Long vpcOwnerId) {
		this.vpcOwnerId = vpcOwnerId;
		if(vpcOwnerId != null){
			putQueryParameter("VpcOwnerId", vpcOwnerId.toString());
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

	public List<ZoneMappings> getZoneMappingss() {
		return this.zoneMappingss;
	}

	public void setZoneMappingss(List<ZoneMappings> zoneMappingss) {
		this.zoneMappingss = zoneMappingss;	
		if (zoneMappingss != null) {
			for (int depth1 = 0; depth1 < zoneMappingss.size(); depth1++) {
				putQueryParameter("ZoneMappings." + (depth1 + 1) + ".VSwitchId" , zoneMappingss.get(depth1).getVSwitchId());
				putQueryParameter("ZoneMappings." + (depth1 + 1) + ".ZoneId" , zoneMappingss.get(depth1).getZoneId());
			}
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public static class ZoneMappings {

		private String vSwitchId;

		private String zoneId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public Class<CreateTransitRouterVpcAttachmentResponse> getResponseClass() {
		return CreateTransitRouterVpcAttachmentResponse.class;
	}

}
