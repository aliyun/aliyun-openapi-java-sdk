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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ResourceOwnershipTransferRequest extends RpcAcsRequest<ResourceOwnershipTransferResponse> {
	
	public ResourceOwnershipTransferRequest() {
		super("EcsInc", "2016-03-14", "ResourceOwnershipTransfer", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String toVSwitchId;

	private String clientToken;

	private String channel;

	private String operator;

	private Long aliUid;

	private String proxyId;

	private Boolean dryRun;

	private List<String> privateIpss;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Boolean keepPublicIp;

	private Long ownerId;

	private String token;

	private String newOwnerId;

	private String toSecurityGroupId;

	private List<String> instanceIdss;

	private String appKey;

	private String bid;

	private Long toVSwitchAliUid;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getToVSwitchId() {
		return this.toVSwitchId;
	}

	public void setToVSwitchId(String toVSwitchId) {
		this.toVSwitchId = toVSwitchId;
		if(toVSwitchId != null){
			putQueryParameter("ToVSwitchId", toVSwitchId);
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

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("channel", channel);
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

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<String> getPrivateIpss() {
		return this.privateIpss;
	}

	public void setPrivateIpss(List<String> privateIpss) {
		this.privateIpss = privateIpss;	
		if (privateIpss != null) {
			for (int i = 0; i < privateIpss.size(); i++) {
				putQueryParameter("PrivateIps." + (i + 1) , privateIpss.get(i));
			}
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

	public Boolean getKeepPublicIp() {
		return this.keepPublicIp;
	}

	public void setKeepPublicIp(Boolean keepPublicIp) {
		this.keepPublicIp = keepPublicIp;
		if(keepPublicIp != null){
			putQueryParameter("KeepPublicIp", keepPublicIp.toString());
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("token", token);
		}
	}

	public String getNewOwnerId() {
		return this.newOwnerId;
	}

	public void setNewOwnerId(String newOwnerId) {
		this.newOwnerId = newOwnerId;
		if(newOwnerId != null){
			putQueryParameter("NewOwnerId", newOwnerId);
		}
	}

	public String getToSecurityGroupId() {
		return this.toSecurityGroupId;
	}

	public void setToSecurityGroupId(String toSecurityGroupId) {
		this.toSecurityGroupId = toSecurityGroupId;
		if(toSecurityGroupId != null){
			putQueryParameter("ToSecurityGroupId", toSecurityGroupId);
		}
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("appKey", appKey);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public Long getToVSwitchAliUid() {
		return this.toVSwitchAliUid;
	}

	public void setToVSwitchAliUid(Long toVSwitchAliUid) {
		this.toVSwitchAliUid = toVSwitchAliUid;
		if(toVSwitchAliUid != null){
			putQueryParameter("ToVSwitchAliUid", toVSwitchAliUid.toString());
		}
	}

	@Override
	public Class<ResourceOwnershipTransferResponse> getResponseClass() {
		return ResourceOwnershipTransferResponse.class;
	}

}
