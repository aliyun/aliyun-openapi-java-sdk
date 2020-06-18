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
public class DescribeDedicatedHostsRequest extends RpcAcsRequest<DescribeDedicatedHostsResponse> {
	   

	private Long resourceOwnerId;

	private String hostType;

	private String hostStatus;

	private String allocationStatus;

	private String dedicatedHostGroupId;

	private String resourceOwnerAccount;

	private Long orderId;

	private Long ownerId;

	private String zoneId;
	public DescribeDedicatedHostsRequest() {
		super("Rds", "2014-08-15", "DescribeDedicatedHosts", "rds");
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

	public String getHostType() {
		return this.hostType;
	}

	public void setHostType(String hostType) {
		this.hostType = hostType;
		if(hostType != null){
			putQueryParameter("HostType", hostType);
		}
	}

	public String getHostStatus() {
		return this.hostStatus;
	}

	public void setHostStatus(String hostStatus) {
		this.hostStatus = hostStatus;
		if(hostStatus != null){
			putQueryParameter("HostStatus", hostStatus);
		}
	}

	public String getAllocationStatus() {
		return this.allocationStatus;
	}

	public void setAllocationStatus(String allocationStatus) {
		this.allocationStatus = allocationStatus;
		if(allocationStatus != null){
			putQueryParameter("AllocationStatus", allocationStatus);
		}
	}

	public String getDedicatedHostGroupId() {
		return this.dedicatedHostGroupId;
	}

	public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
		this.dedicatedHostGroupId = dedicatedHostGroupId;
		if(dedicatedHostGroupId != null){
			putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
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

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	@Override
	public Class<DescribeDedicatedHostsResponse> getResponseClass() {
		return DescribeDedicatedHostsResponse.class;
	}

}
