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
public class DescribeIpv6AddressesRequest extends RpcAcsRequest<DescribeIpv6AddressesResponse> {
	   

	private Long resourceOwnerId;

	private String ipv6InternetBandwidthId;

	private String networkType;

	private Integer pageNumber;

	private String associatedInstanceType;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String vSwitchId;

	private String ipv6AddressId;

	private String vpcId;

	private String name;

	private String ipv6Address;

	private String associatedInstanceId;
	public DescribeIpv6AddressesRequest() {
		super("Vpc", "2016-04-28", "DescribeIpv6Addresses", "vpc");
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

	public String getIpv6InternetBandwidthId() {
		return this.ipv6InternetBandwidthId;
	}

	public void setIpv6InternetBandwidthId(String ipv6InternetBandwidthId) {
		this.ipv6InternetBandwidthId = ipv6InternetBandwidthId;
		if(ipv6InternetBandwidthId != null){
			putQueryParameter("Ipv6InternetBandwidthId", ipv6InternetBandwidthId);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getAssociatedInstanceType() {
		return this.associatedInstanceType;
	}

	public void setAssociatedInstanceType(String associatedInstanceType) {
		this.associatedInstanceType = associatedInstanceType;
		if(associatedInstanceType != null){
			putQueryParameter("AssociatedInstanceType", associatedInstanceType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getIpv6AddressId() {
		return this.ipv6AddressId;
	}

	public void setIpv6AddressId(String ipv6AddressId) {
		this.ipv6AddressId = ipv6AddressId;
		if(ipv6AddressId != null){
			putQueryParameter("Ipv6AddressId", ipv6AddressId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getIpv6Address() {
		return this.ipv6Address;
	}

	public void setIpv6Address(String ipv6Address) {
		this.ipv6Address = ipv6Address;
		if(ipv6Address != null){
			putQueryParameter("Ipv6Address", ipv6Address);
		}
	}

	public String getAssociatedInstanceId() {
		return this.associatedInstanceId;
	}

	public void setAssociatedInstanceId(String associatedInstanceId) {
		this.associatedInstanceId = associatedInstanceId;
		if(associatedInstanceId != null){
			putQueryParameter("AssociatedInstanceId", associatedInstanceId);
		}
	}

	@Override
	public Class<DescribeIpv6AddressesResponse> getResponseClass() {
		return DescribeIpv6AddressesResponse.class;
	}

}
