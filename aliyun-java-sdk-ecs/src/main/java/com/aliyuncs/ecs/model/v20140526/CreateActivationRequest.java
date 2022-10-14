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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateActivationRequest extends RpcAcsRequest<CreateActivationResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private Integer instanceCount;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String instanceName;

	private Long timeToLiveInHours;

	private String ipAddressRange;
	public CreateActivationRequest() {
		super("Ecs", "2014-05-26", "CreateActivation", "ecs");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(Integer instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putQueryParameter("InstanceCount", instanceCount.toString());
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public Long getTimeToLiveInHours() {
		return this.timeToLiveInHours;
	}

	public void setTimeToLiveInHours(Long timeToLiveInHours) {
		this.timeToLiveInHours = timeToLiveInHours;
		if(timeToLiveInHours != null){
			putQueryParameter("TimeToLiveInHours", timeToLiveInHours.toString());
		}
	}

	public String getIpAddressRange() {
		return this.ipAddressRange;
	}

	public void setIpAddressRange(String ipAddressRange) {
		this.ipAddressRange = ipAddressRange;
		if(ipAddressRange != null){
			putQueryParameter("IpAddressRange", ipAddressRange);
		}
	}

	@Override
	public Class<CreateActivationResponse> getResponseClass() {
		return CreateActivationResponse.class;
	}

}
