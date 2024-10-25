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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociateVpcCidrBlockRequest extends RpcAcsRequest<AssociateVpcCidrBlockResponse> {
	   

	private Long resourceOwnerId;

	private String ipamPoolId;

	private String ipv6Isp;

	private String ipVersion;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String iPv6CidrBlock;

	private Integer secondaryCidrMask;

	private String secondaryCidrBlock;

	private String vpcId;
	public AssociateVpcCidrBlockRequest() {
		super("Vpc", "2016-04-28", "AssociateVpcCidrBlock", "vpc");
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

	public String getIpamPoolId() {
		return this.ipamPoolId;
	}

	public void setIpamPoolId(String ipamPoolId) {
		this.ipamPoolId = ipamPoolId;
		if(ipamPoolId != null){
			putQueryParameter("IpamPoolId", ipamPoolId);
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

	public String getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
		if(ipVersion != null){
			putQueryParameter("IpVersion", ipVersion);
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

	public String getIPv6CidrBlock() {
		return this.iPv6CidrBlock;
	}

	public void setIPv6CidrBlock(String iPv6CidrBlock) {
		this.iPv6CidrBlock = iPv6CidrBlock;
		if(iPv6CidrBlock != null){
			putQueryParameter("IPv6CidrBlock", iPv6CidrBlock);
		}
	}

	public Integer getSecondaryCidrMask() {
		return this.secondaryCidrMask;
	}

	public void setSecondaryCidrMask(Integer secondaryCidrMask) {
		this.secondaryCidrMask = secondaryCidrMask;
		if(secondaryCidrMask != null){
			putQueryParameter("SecondaryCidrMask", secondaryCidrMask.toString());
		}
	}

	public String getSecondaryCidrBlock() {
		return this.secondaryCidrBlock;
	}

	public void setSecondaryCidrBlock(String secondaryCidrBlock) {
		this.secondaryCidrBlock = secondaryCidrBlock;
		if(secondaryCidrBlock != null){
			putQueryParameter("SecondaryCidrBlock", secondaryCidrBlock);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<AssociateVpcCidrBlockResponse> getResponseClass() {
		return AssociateVpcCidrBlockResponse.class;
	}

}
