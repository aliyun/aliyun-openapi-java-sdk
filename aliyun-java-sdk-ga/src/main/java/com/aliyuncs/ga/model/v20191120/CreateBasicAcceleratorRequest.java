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
public class CreateBasicAcceleratorRequest extends RpcAcsRequest<CreateBasicAcceleratorResponse> {
	   

	private String clientToken;

	private String autoUseCoupon;

	private Integer autoRenewDuration;

	private Integer duration;

	private String resourceGroupId;

	private Boolean autoPay;

	private Boolean dryRun;

	private String promotionOptionNo;

	private String bandwidthBillingType;

	private Boolean autoRenew;

	private String chargeType;

	private String pricingCycle;
	public CreateBasicAcceleratorRequest() {
		super("Ga", "2019-11-20", "CreateBasicAccelerator", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getAutoRenewDuration() {
		return this.autoRenewDuration;
	}

	public void setAutoRenewDuration(Integer autoRenewDuration) {
		this.autoRenewDuration = autoRenewDuration;
		if(autoRenewDuration != null){
			putQueryParameter("AutoRenewDuration", autoRenewDuration.toString());
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getPromotionOptionNo() {
		return this.promotionOptionNo;
	}

	public void setPromotionOptionNo(String promotionOptionNo) {
		this.promotionOptionNo = promotionOptionNo;
		if(promotionOptionNo != null){
			putQueryParameter("PromotionOptionNo", promotionOptionNo);
		}
	}

	public String getBandwidthBillingType() {
		return this.bandwidthBillingType;
	}

	public void setBandwidthBillingType(String bandwidthBillingType) {
		this.bandwidthBillingType = bandwidthBillingType;
		if(bandwidthBillingType != null){
			putQueryParameter("BandwidthBillingType", bandwidthBillingType);
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

	@Override
	public Class<CreateBasicAcceleratorResponse> getResponseClass() {
		return CreateBasicAcceleratorResponse.class;
	}

}
