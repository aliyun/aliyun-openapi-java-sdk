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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyNodeSpecBatchRequest extends RpcAcsRequest<ModifyNodeSpecBatchResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String nodesInfo;

	private String targetSecondaryZoneId;

	private String couponNo;

	private String targetZoneId;

	private String effectiveTime;

	private String dBInstanceId;

	private String businessInfo;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String targetVswitchId;

	private Long ownerId;

	private String targetHiddenZoneId;

	private String orderType;
	public ModifyNodeSpecBatchRequest() {
		super("Dds", "2015-12-01", "ModifyNodeSpecBatch", "dds");
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

	public String getNodesInfo() {
		return this.nodesInfo;
	}

	public void setNodesInfo(String nodesInfo) {
		this.nodesInfo = nodesInfo;
		if(nodesInfo != null){
			putQueryParameter("NodesInfo", nodesInfo);
		}
	}

	public String getTargetSecondaryZoneId() {
		return this.targetSecondaryZoneId;
	}

	public void setTargetSecondaryZoneId(String targetSecondaryZoneId) {
		this.targetSecondaryZoneId = targetSecondaryZoneId;
		if(targetSecondaryZoneId != null){
			putQueryParameter("TargetSecondaryZoneId", targetSecondaryZoneId);
		}
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public String getTargetZoneId() {
		return this.targetZoneId;
	}

	public void setTargetZoneId(String targetZoneId) {
		this.targetZoneId = targetZoneId;
		if(targetZoneId != null){
			putQueryParameter("TargetZoneId", targetZoneId);
		}
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
		if(effectiveTime != null){
			putQueryParameter("EffectiveTime", effectiveTime);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
		if(businessInfo != null){
			putQueryParameter("BusinessInfo", businessInfo);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getTargetVswitchId() {
		return this.targetVswitchId;
	}

	public void setTargetVswitchId(String targetVswitchId) {
		this.targetVswitchId = targetVswitchId;
		if(targetVswitchId != null){
			putQueryParameter("TargetVswitchId", targetVswitchId);
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

	public String getTargetHiddenZoneId() {
		return this.targetHiddenZoneId;
	}

	public void setTargetHiddenZoneId(String targetHiddenZoneId) {
		this.targetHiddenZoneId = targetHiddenZoneId;
		if(targetHiddenZoneId != null){
			putQueryParameter("TargetHiddenZoneId", targetHiddenZoneId);
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
	public Class<ModifyNodeSpecBatchResponse> getResponseClass() {
		return ModifyNodeSpecBatchResponse.class;
	}

}
