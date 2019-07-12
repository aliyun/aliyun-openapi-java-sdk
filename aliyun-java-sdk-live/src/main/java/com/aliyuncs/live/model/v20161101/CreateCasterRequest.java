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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateCasterRequest extends RpcAcsRequest<CreateCasterResponse> {
	
	public CreateCasterRequest() {
		super("live", "2016-11-01", "CreateCaster", "live");
	}

	private String casterTemplate;

	private String expireTime;

	private Integer normType;

	private String casterName;

	private String clientToken;

	private String chargeType;

	private Long ownerId;

	private String purchaseTime;

	public String getCasterTemplate() {
		return this.casterTemplate;
	}

	public void setCasterTemplate(String casterTemplate) {
		this.casterTemplate = casterTemplate;
		if(casterTemplate != null){
			putQueryParameter("CasterTemplate", casterTemplate);
		}
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime);
		}
	}

	public Integer getNormType() {
		return this.normType;
	}

	public void setNormType(Integer normType) {
		this.normType = normType;
		if(normType != null){
			putQueryParameter("NormType", normType.toString());
		}
	}

	public String getCasterName() {
		return this.casterName;
	}

	public void setCasterName(String casterName) {
		this.casterName = casterName;
		if(casterName != null){
			putQueryParameter("CasterName", casterName);
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

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
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

	public String getPurchaseTime() {
		return this.purchaseTime;
	}

	public void setPurchaseTime(String purchaseTime) {
		this.purchaseTime = purchaseTime;
		if(purchaseTime != null){
			putQueryParameter("PurchaseTime", purchaseTime);
		}
	}

	@Override
	public Class<CreateCasterResponse> getResponseClass() {
		return CreateCasterResponse.class;
	}

}
