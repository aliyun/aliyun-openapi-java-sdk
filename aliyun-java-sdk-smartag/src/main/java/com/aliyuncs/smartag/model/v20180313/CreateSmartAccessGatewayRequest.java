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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateSmartAccessGatewayRequest extends RpcAcsRequest<CreateSmartAccessGatewayResponse> {
	
	public CreateSmartAccessGatewayRequest() {
		super("Smartag", "2018-03-13", "CreateSmartAccessGateway", "smartag");
	}

	private Integer maxBandWidth;

	private Long resourceOwnerId;

	private String description;

	private String receiverTown;

	private String receiverDistrict;

	private String receiverAddress;

	private String buyerMessage;

	private String hardWareSpec;

	private String receiverEmail;

	private String receiverState;

	private String receiverCity;

	private Integer period;

	private Boolean autoPay;

	private String receiverMobile;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String receiverPhone;

	private String receiverName;

	private String haType;

	private String name;

	private String receiverCountry;

	private String chargeType;

	private String receiverZip;

	public Integer getMaxBandWidth() {
		return this.maxBandWidth;
	}

	public void setMaxBandWidth(Integer maxBandWidth) {
		this.maxBandWidth = maxBandWidth;
		if(maxBandWidth != null){
			putQueryParameter("MaxBandWidth", maxBandWidth.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getReceiverTown() {
		return this.receiverTown;
	}

	public void setReceiverTown(String receiverTown) {
		this.receiverTown = receiverTown;
		if(receiverTown != null){
			putQueryParameter("ReceiverTown", receiverTown);
		}
	}

	public String getReceiverDistrict() {
		return this.receiverDistrict;
	}

	public void setReceiverDistrict(String receiverDistrict) {
		this.receiverDistrict = receiverDistrict;
		if(receiverDistrict != null){
			putQueryParameter("ReceiverDistrict", receiverDistrict);
		}
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
		if(receiverAddress != null){
			putQueryParameter("ReceiverAddress", receiverAddress);
		}
	}

	public String getBuyerMessage() {
		return this.buyerMessage;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
		if(buyerMessage != null){
			putQueryParameter("BuyerMessage", buyerMessage);
		}
	}

	public String getHardWareSpec() {
		return this.hardWareSpec;
	}

	public void setHardWareSpec(String hardWareSpec) {
		this.hardWareSpec = hardWareSpec;
		if(hardWareSpec != null){
			putQueryParameter("HardWareSpec", hardWareSpec);
		}
	}

	public String getReceiverEmail() {
		return this.receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
		if(receiverEmail != null){
			putQueryParameter("ReceiverEmail", receiverEmail);
		}
	}

	public String getReceiverState() {
		return this.receiverState;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
		if(receiverState != null){
			putQueryParameter("ReceiverState", receiverState);
		}
	}

	public String getReceiverCity() {
		return this.receiverCity;
	}

	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
		if(receiverCity != null){
			putQueryParameter("ReceiverCity", receiverCity);
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

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
		if(receiverMobile != null){
			putQueryParameter("ReceiverMobile", receiverMobile);
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

	public String getReceiverPhone() {
		return this.receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
		if(receiverPhone != null){
			putQueryParameter("ReceiverPhone", receiverPhone);
		}
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
		if(receiverName != null){
			putQueryParameter("ReceiverName", receiverName);
		}
	}

	public String getHaType() {
		return this.haType;
	}

	public void setHaType(String haType) {
		this.haType = haType;
		if(haType != null){
			putQueryParameter("HaType", haType);
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

	public String getReceiverCountry() {
		return this.receiverCountry;
	}

	public void setReceiverCountry(String receiverCountry) {
		this.receiverCountry = receiverCountry;
		if(receiverCountry != null){
			putQueryParameter("ReceiverCountry", receiverCountry);
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

	public String getReceiverZip() {
		return this.receiverZip;
	}

	public void setReceiverZip(String receiverZip) {
		this.receiverZip = receiverZip;
		if(receiverZip != null){
			putQueryParameter("ReceiverZip", receiverZip);
		}
	}

	@Override
	public Class<CreateSmartAccessGatewayResponse> getResponseClass() {
		return CreateSmartAccessGatewayResponse.class;
	}

}
