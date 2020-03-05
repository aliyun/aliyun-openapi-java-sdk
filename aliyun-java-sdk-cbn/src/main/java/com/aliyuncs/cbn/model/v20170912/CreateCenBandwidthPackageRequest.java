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
public class CreateCenBandwidthPackageRequest extends RpcAcsRequest<CreateCenBandwidthPackageResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String description;

	private String bandwidthPackageChargeType;

	private String geographicRegionBId;

	private Integer period;

	private String geographicRegionAId;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private Integer bandwidth;

	private String ownerAccount;

	private Long ownerId;

	private String name;

	private String pricingCycle;
	public CreateCenBandwidthPackageRequest() {
		super("Cbn", "2017-09-12", "CreateCenBandwidthPackage", "Cbn");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBandwidthPackageChargeType() {
		return this.bandwidthPackageChargeType;
	}

	public void setBandwidthPackageChargeType(String bandwidthPackageChargeType) {
		this.bandwidthPackageChargeType = bandwidthPackageChargeType;
		if(bandwidthPackageChargeType != null){
			putQueryParameter("BandwidthPackageChargeType", bandwidthPackageChargeType);
		}
	}

	public String getGeographicRegionBId() {
		return this.geographicRegionBId;
	}

	public void setGeographicRegionBId(String geographicRegionBId) {
		this.geographicRegionBId = geographicRegionBId;
		if(geographicRegionBId != null){
			putQueryParameter("GeographicRegionBId", geographicRegionBId);
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getGeographicRegionAId() {
		return this.geographicRegionAId;
	}

	public void setGeographicRegionAId(String geographicRegionAId) {
		this.geographicRegionAId = geographicRegionAId;
		if(geographicRegionAId != null){
			putQueryParameter("GeographicRegionAId", geographicRegionAId);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
		}
	}

	@Override
	public Class<CreateCenBandwidthPackageResponse> getResponseClass() {
		return CreateCenBandwidthPackageResponse.class;
	}

}
