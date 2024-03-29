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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssignPrivateIpAddressesRequest extends RpcAcsRequest<AssignPrivateIpAddressesResponse> {
	   

	private Long resourceOwnerId;

	private List<String> ipv4Prefixs;

	private String clientToken;

	private Integer secondaryPrivateIpAddressCount;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer ipv4PrefixCount;

	private List<String> privateIpAddresss;

	private String networkInterfaceId;
	public AssignPrivateIpAddressesRequest() {
		super("Ecs", "2014-05-26", "AssignPrivateIpAddresses", "ecs");
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

	public List<String> getIpv4Prefixs() {
		return this.ipv4Prefixs;
	}

	public void setIpv4Prefixs(List<String> ipv4Prefixs) {
		this.ipv4Prefixs = ipv4Prefixs;	
		if (ipv4Prefixs != null) {
			for (int i = 0; i < ipv4Prefixs.size(); i++) {
				putQueryParameter("Ipv4Prefix." + (i + 1) , ipv4Prefixs.get(i));
			}
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

	public Integer getSecondaryPrivateIpAddressCount() {
		return this.secondaryPrivateIpAddressCount;
	}

	public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
		this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
		if(secondaryPrivateIpAddressCount != null){
			putQueryParameter("SecondaryPrivateIpAddressCount", secondaryPrivateIpAddressCount.toString());
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

	public Integer getIpv4PrefixCount() {
		return this.ipv4PrefixCount;
	}

	public void setIpv4PrefixCount(Integer ipv4PrefixCount) {
		this.ipv4PrefixCount = ipv4PrefixCount;
		if(ipv4PrefixCount != null){
			putQueryParameter("Ipv4PrefixCount", ipv4PrefixCount.toString());
		}
	}

	public List<String> getPrivateIpAddresss() {
		return this.privateIpAddresss;
	}

	public void setPrivateIpAddresss(List<String> privateIpAddresss) {
		this.privateIpAddresss = privateIpAddresss;	
		if (privateIpAddresss != null) {
			for (int i = 0; i < privateIpAddresss.size(); i++) {
				putQueryParameter("PrivateIpAddress." + (i + 1) , privateIpAddresss.get(i));
			}
		}	
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putQueryParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	@Override
	public Class<AssignPrivateIpAddressesResponse> getResponseClass() {
		return AssignPrivateIpAddressesResponse.class;
	}

}
