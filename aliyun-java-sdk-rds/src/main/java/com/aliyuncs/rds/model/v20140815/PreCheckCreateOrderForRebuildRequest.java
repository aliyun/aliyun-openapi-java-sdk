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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PreCheckCreateOrderForRebuildRequest extends RpcAcsRequest<PreCheckCreateOrderForRebuildResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String resourceGroupId;

	private String dBInstanceId;

	private String dBInstanceDescription;

	private String businessInfo;

	private String agentId;

	private Boolean autoPay;

	private String resourceOwnerAccount;

	private String resource;

	private String ownerAccount;

	private String commodityCode;

	private Long ownerId;

	private String usedTime;

	private String dBInstanceClass;

	private String vSwitchId;

	private Boolean rebuildInstanceFlag;

	private String autoRenew;

	private String promotionCode;

	private String vPCId;

	private String zoneId;

	private String timeType;

	private String payType;

	private String instanceNetworkType;
	public PreCheckCreateOrderForRebuildRequest() {
		super("Rds", "2014-08-15", "PreCheckCreateOrderForRebuild", "rds");
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
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

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId);
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

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
		if(resource != null){
			putQueryParameter("Resource", resource);
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

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
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

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
		}
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public Boolean getRebuildInstanceFlag() {
		return this.rebuildInstanceFlag;
	}

	public void setRebuildInstanceFlag(Boolean rebuildInstanceFlag) {
		this.rebuildInstanceFlag = rebuildInstanceFlag;
		if(rebuildInstanceFlag != null){
			putQueryParameter("RebuildInstanceFlag", rebuildInstanceFlag.toString());
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getPromotionCode() {
		return this.promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
		if(promotionCode != null){
			putQueryParameter("PromotionCode", promotionCode);
		}
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getTimeType() {
		return this.timeType;
	}

	public void setTimeType(String timeType) {
		this.timeType = timeType;
		if(timeType != null){
			putQueryParameter("TimeType", timeType);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
		}
	}

	@Override
	public Class<PreCheckCreateOrderForRebuildResponse> getResponseClass() {
		return PreCheckCreateOrderForRebuildResponse.class;
	}

}
