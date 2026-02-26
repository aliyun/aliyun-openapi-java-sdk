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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVpcRequest extends RpcAcsRequest<CreateVpcResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private Boolean enableIpv6;

	private String description;

	private Integer ipv4CidrMask;

	private String vpcName;

	private String resourceGroupId;

	private Integer ipv6CidrMask;

	private String ipv4IpamPoolId;

	private String ipv6Isp;

	private String userCidr;

	private List<Tag> tags;

	private Boolean dryRun;

	private Boolean enableDnsHostname;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String ipv6CidrBlock;

	private String ipv6IpamPoolId;

	private String cidrBlock;
	public CreateVpcRequest() {
		super("Vpc", "2016-04-28", "CreateVpc", "vpc");
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

	public Boolean getEnableIpv6() {
		return this.enableIpv6;
	}

	public void setEnableIpv6(Boolean enableIpv6) {
		this.enableIpv6 = enableIpv6;
		if(enableIpv6 != null){
			putQueryParameter("EnableIpv6", enableIpv6.toString());
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

	public Integer getIpv4CidrMask() {
		return this.ipv4CidrMask;
	}

	public void setIpv4CidrMask(Integer ipv4CidrMask) {
		this.ipv4CidrMask = ipv4CidrMask;
		if(ipv4CidrMask != null){
			putQueryParameter("Ipv4CidrMask", ipv4CidrMask.toString());
		}
	}

	public String getVpcName() {
		return this.vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
		if(vpcName != null){
			putQueryParameter("VpcName", vpcName);
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

	public Integer getIpv6CidrMask() {
		return this.ipv6CidrMask;
	}

	public void setIpv6CidrMask(Integer ipv6CidrMask) {
		this.ipv6CidrMask = ipv6CidrMask;
		if(ipv6CidrMask != null){
			putQueryParameter("Ipv6CidrMask", ipv6CidrMask.toString());
		}
	}

	public String getIpv4IpamPoolId() {
		return this.ipv4IpamPoolId;
	}

	public void setIpv4IpamPoolId(String ipv4IpamPoolId) {
		this.ipv4IpamPoolId = ipv4IpamPoolId;
		if(ipv4IpamPoolId != null){
			putQueryParameter("Ipv4IpamPoolId", ipv4IpamPoolId);
		}
	}

	public String getIpv6Isp() {
		return this.ipv6Isp;
	}

	public void setIpv6Isp(String ipv6Isp) {
		this.ipv6Isp = ipv6Isp;
		if(ipv6Isp != null){
			putQueryParameter("Ipv6Isp", ipv6Isp);
		}
	}

	public String getUserCidr() {
		return this.userCidr;
	}

	public void setUserCidr(String userCidr) {
		this.userCidr = userCidr;
		if(userCidr != null){
			putQueryParameter("UserCidr", userCidr);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public Boolean getEnableDnsHostname() {
		return this.enableDnsHostname;
	}

	public void setEnableDnsHostname(Boolean enableDnsHostname) {
		this.enableDnsHostname = enableDnsHostname;
		if(enableDnsHostname != null){
			putQueryParameter("EnableDnsHostname", enableDnsHostname.toString());
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

	public String getIpv6CidrBlock() {
		return this.ipv6CidrBlock;
	}

	public void setIpv6CidrBlock(String ipv6CidrBlock) {
		this.ipv6CidrBlock = ipv6CidrBlock;
		if(ipv6CidrBlock != null){
			putQueryParameter("Ipv6CidrBlock", ipv6CidrBlock);
		}
	}

	public String getIpv6IpamPoolId() {
		return this.ipv6IpamPoolId;
	}

	public void setIpv6IpamPoolId(String ipv6IpamPoolId) {
		this.ipv6IpamPoolId = ipv6IpamPoolId;
		if(ipv6IpamPoolId != null){
			putQueryParameter("Ipv6IpamPoolId", ipv6IpamPoolId);
		}
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
		if(cidrBlock != null){
			putQueryParameter("CidrBlock", cidrBlock);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateVpcResponse> getResponseClass() {
		return CreateVpcResponse.class;
	}

}
