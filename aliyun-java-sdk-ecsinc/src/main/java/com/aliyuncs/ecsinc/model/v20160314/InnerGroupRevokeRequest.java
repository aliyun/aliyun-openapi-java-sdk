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
public class InnerGroupRevokeRequest extends RpcAcsRequest<InnerGroupRevokeResponse> {
	
	public InnerGroupRevokeRequest() {
		super("EcsInc", "2016-03-14", "InnerGroupRevoke", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String sourceGroupNo;

	private String portRange;

	private String resourceOwnerAccount;

	private Integer level;

	private String ipProtocol;

	private String ownerAccount;

	private String sourceCidrIp;

	private String channel;

	private String nic;

	private String vpcInstanceId;

	private Long ownerId;

	private String destCidrIp;

	private String operator;

	private String token;

	private Boolean async;

	private Long sourceGroupOwnerAliUid;

	private Long aliUid;

	private String bid;

	private String groupNo;

	private String proxyId;

	private String policy;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSourceGroupNo() {
		return this.sourceGroupNo;
	}

	public void setSourceGroupNo(String sourceGroupNo) {
		this.sourceGroupNo = sourceGroupNo;
		if(sourceGroupNo != null){
			putQueryParameter("sourceGroupNo", sourceGroupNo);
		}
	}

	public String getPortRange() {
		return this.portRange;
	}

	public void setPortRange(String portRange) {
		this.portRange = portRange;
		if(portRange != null){
			putQueryParameter("portRange", portRange);
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

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		if(level != null){
			putQueryParameter("level", level.toString());
		}
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("ipProtocol", ipProtocol);
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

	public String getSourceCidrIp() {
		return this.sourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		this.sourceCidrIp = sourceCidrIp;
		if(sourceCidrIp != null){
			putQueryParameter("sourceCidrIp", sourceCidrIp);
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

	public String getNic() {
		return this.nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
		if(nic != null){
			putQueryParameter("nic", nic);
		}
	}

	public String getVpcInstanceId() {
		return this.vpcInstanceId;
	}

	public void setVpcInstanceId(String vpcInstanceId) {
		this.vpcInstanceId = vpcInstanceId;
		if(vpcInstanceId != null){
			putQueryParameter("vpcInstanceId", vpcInstanceId);
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

	public String getDestCidrIp() {
		return this.destCidrIp;
	}

	public void setDestCidrIp(String destCidrIp) {
		this.destCidrIp = destCidrIp;
		if(destCidrIp != null){
			putQueryParameter("destCidrIp", destCidrIp);
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

	public Long getSourceGroupOwnerAliUid() {
		return this.sourceGroupOwnerAliUid;
	}

	public void setSourceGroupOwnerAliUid(Long sourceGroupOwnerAliUid) {
		this.sourceGroupOwnerAliUid = sourceGroupOwnerAliUid;
		if(sourceGroupOwnerAliUid != null){
			putQueryParameter("sourceGroupOwnerAliUid", sourceGroupOwnerAliUid.toString());
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

	public String getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
		if(groupNo != null){
			putQueryParameter("groupNo", groupNo);
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

	public String getPolicy() {
		return this.policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
		if(policy != null){
			putQueryParameter("policy", policy);
		}
	}

	@Override
	public Class<InnerGroupRevokeResponse> getResponseClass() {
		return InnerGroupRevokeResponse.class;
	}

}
