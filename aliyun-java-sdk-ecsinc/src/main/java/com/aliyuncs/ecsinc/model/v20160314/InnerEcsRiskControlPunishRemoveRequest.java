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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsRiskControlPunishRemoveRequest extends RpcAcsRequest<InnerEcsRiskControlPunishRemoveResponse> {
	
	public InnerEcsRiskControlPunishRemoveRequest() {
		super("EcsInc", "2016-03-14", "InnerEcsRiskControlPunishRemove", "ecs", "innerAPI");
	}

	private String reason;

	private String bussinessCode;

	private Long resourceOwnerId;

	private String coordinate;

	private String signatureCode;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String channel;

	private String punishResult;

	private String actionCode;

	private Long ownerId;

	private String operator;

	private String token;

	private Boolean async;

	private String instanceId;

	private Long aliUid;

	private String bid;

	private String proxyId;

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("reason", reason);
		}
	}

	public String getBussinessCode() {
		return this.bussinessCode;
	}

	public void setBussinessCode(String bussinessCode) {
		this.bussinessCode = bussinessCode;
		if(bussinessCode != null){
			putQueryParameter("bussinessCode", bussinessCode);
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

	public String getCoordinate() {
		return this.coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
		if(coordinate != null){
			putQueryParameter("coordinate", coordinate);
		}
	}

	public String getSignatureCode() {
		return this.signatureCode;
	}

	public void setSignatureCode(String signatureCode) {
		this.signatureCode = signatureCode;
		if(signatureCode != null){
			putQueryParameter("signatureCode", signatureCode);
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

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("channel", channel);
		}
	}

	public String getPunishResult() {
		return this.punishResult;
	}

	public void setPunishResult(String punishResult) {
		this.punishResult = punishResult;
		if(punishResult != null){
			putQueryParameter("punishResult", punishResult);
		}
	}

	public String getActionCode() {
		return this.actionCode;
	}

	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
		if(actionCode != null){
			putQueryParameter("actionCode", actionCode);
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

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("operator", operator);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("token", token);
		}
	}

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		if(async != null){
			putQueryParameter("async", async.toString());
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

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("aliUid", aliUid.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("bid", bid);
		}
	}

	public String getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
		if(proxyId != null){
			putQueryParameter("proxyId", proxyId);
		}
	}

	@Override
	public Class<InnerEcsRiskControlPunishRemoveResponse> getResponseClass() {
		return InnerEcsRiskControlPunishRemoveResponse.class;
	}

}
