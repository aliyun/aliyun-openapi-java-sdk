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
public class DeleteIpv6InternetBandwidthRequest extends RpcAcsRequest<DeleteIpv6InternetBandwidthResponse> {
	   

	private Long resourceOwnerId;

	private String ipv6InternetBandwidthId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String ipv6AddressId;
	public DeleteIpv6InternetBandwidthRequest() {
		super("Vpc", "2016-04-28", "DeleteIpv6InternetBandwidth", "vpc");
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

	public String getIpv6AddressId() {
		return this.ipv6AddressId;
	}

	public void setIpv6AddressId(String ipv6AddressId) {
		this.ipv6AddressId = ipv6AddressId;
		if(ipv6AddressId != null){
			putQueryParameter("Ipv6AddressId", ipv6AddressId);
		}
	}

	@Override
	public Class<DeleteIpv6InternetBandwidthResponse> getResponseClass() {
		return DeleteIpv6InternetBandwidthResponse.class;
	}

}
