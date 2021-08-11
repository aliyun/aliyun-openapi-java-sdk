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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCommodityOrderRequest extends RpcAcsRequest<CreateCommodityOrderResponse> {
	   

	private String components;

	private String clientToken;

	private Integer duration;

	private Integer quantity;

	private String commodityCode;

	private String bizType;

	private String instanceId;

	private String specCode;

	private String orderParams;

	private String chargeType;

	private String pricingCycle;

	private String orderType;
	public CreateCommodityOrderRequest() {
		super("Premiumpics", "2020-05-05", "CreateCommodityOrder");
		setMethod(MethodType.POST);
	}

	public String getComponents() {
		return this.components;
	}

	public void setComponents(String components) {
		this.components = components;
		if(components != null){
			putQueryParameter("Components", components);
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

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSpecCode() {
		return this.specCode;
	}

	public void setSpecCode(String specCode) {
		this.specCode = specCode;
		if(specCode != null){
			putQueryParameter("SpecCode", specCode);
		}
	}

	public String getOrderParams() {
		return this.orderParams;
	}

	public void setOrderParams(String orderParams) {
		this.orderParams = orderParams;
		if(orderParams != null){
			putQueryParameter("OrderParams", orderParams);
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

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<CreateCommodityOrderResponse> getResponseClass() {
		return CreateCommodityOrderResponse.class;
	}

}
