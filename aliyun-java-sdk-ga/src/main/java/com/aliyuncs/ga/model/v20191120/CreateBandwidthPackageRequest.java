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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateBandwidthPackageRequest extends RpcAcsRequest<CreateBandwidthPackageResponse> {
	   

	private String bandwidthType;

	private String clientToken;

	private String autoUseCoupon;

	private String type;

	private Integer autoRenewDuration;

	private String duration;

	private String resourceGroupId;

	private Boolean autoPay;

	private Integer bandwidth;

	private String cbnGeographicRegionIdB;

	private String cbnGeographicRegionIdA;

	private Boolean autoRenew;

	private String billingType;

	private String chargeType;

	private String pricingCycle;

	private Integer ratio;
	public CreateBandwidthPackageRequest() {
		super("Ga", "2019-11-20", "CreateBandwidthPackage", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBandwidthType() {
		return this.bandwidthType;
	}

	public void setBandwidthType(String bandwidthType) {
		this.bandwidthType = bandwidthType;
		if(bandwidthType != null){
			putQueryParameter("BandwidthType", bandwidthType);
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

	public String getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(String autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Integer getAutoRenewDuration() {
		return this.autoRenewDuration;
	}

	public void setAutoRenewDuration(Integer autoRenewDuration) {
		this.autoRenewDuration = autoRenewDuration;
		if(autoRenewDuration != null){
			putQueryParameter("AutoRenewDuration", autoRenewDuration.toString());
		}
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getCbnGeographicRegionIdB() {
		return this.cbnGeographicRegionIdB;
	}

	public void setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
		this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
		if(cbnGeographicRegionIdB != null){
			putQueryParameter("CbnGeographicRegionIdB", cbnGeographicRegionIdB);
		}
	}

	public String getCbnGeographicRegionIdA() {
		return this.cbnGeographicRegionIdA;
	}

	public void setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
		this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
		if(cbnGeographicRegionIdA != null){
			putQueryParameter("CbnGeographicRegionIdA", cbnGeographicRegionIdA);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getBillingType() {
		return this.billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
		if(billingType != null){
			putQueryParameter("BillingType", billingType);
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

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
		}
	}

	public Integer getRatio() {
		return this.ratio;
	}

	public void setRatio(Integer ratio) {
		this.ratio = ratio;
		if(ratio != null){
			putQueryParameter("Ratio", ratio.toString());
		}
	}

	@Override
	public Class<CreateBandwidthPackageResponse> getResponseClass() {
		return CreateBandwidthPackageResponse.class;
	}

}
