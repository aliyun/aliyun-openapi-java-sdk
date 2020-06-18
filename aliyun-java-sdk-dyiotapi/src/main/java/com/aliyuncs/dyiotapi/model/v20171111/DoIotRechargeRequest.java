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

package com.aliyuncs.dyiotapi.model.v20171111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyiotapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DoIotRechargeRequest extends RpcAcsRequest<DoIotRechargeResponse> {
	   

	private Long resourceOwnerId;

	private String iccid;

	private Long amount;

	private String resourceOwnerAccount;

	private Integer orderNum;

	private Long ownerId;

	private String offerIds;

	private String outId;

	private String effCode;
	public DoIotRechargeRequest() {
		super("Dyiotapi", "2017-11-11", "DoIotRecharge", "dyiotapi");
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

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public Long getAmount() {
		return this.amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
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

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
		if(orderNum != null){
			putQueryParameter("OrderNum", orderNum.toString());
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

	public String getOfferIds() {
		return this.offerIds;
	}

	public void setOfferIds(String offerIds) {
		this.offerIds = offerIds;
		if(offerIds != null){
			putQueryParameter("OfferIds", offerIds);
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	public String getEffCode() {
		return this.effCode;
	}

	public void setEffCode(String effCode) {
		this.effCode = effCode;
		if(effCode != null){
			putQueryParameter("EffCode", effCode);
		}
	}

	@Override
	public Class<DoIotRechargeResponse> getResponseClass() {
		return DoIotRechargeResponse.class;
	}

}
