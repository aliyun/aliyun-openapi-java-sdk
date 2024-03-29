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
public class AttachNetworkInterfaceRequest extends RpcAcsRequest<AttachNetworkInterfaceResponse> {
	   

	private Long resourceOwnerId;

	private String trunkNetworkInstanceId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Boolean waitForNetworkConfigurationReady;

	private Long ownerId;

	private Integer networkCardIndex;

	private String instanceId;

	private String networkInterfaceId;
	public AttachNetworkInterfaceRequest() {
		super("Ecs", "2014-05-26", "AttachNetworkInterface", "ecs");
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

	public String getTrunkNetworkInstanceId() {
		return this.trunkNetworkInstanceId;
	}

	public void setTrunkNetworkInstanceId(String trunkNetworkInstanceId) {
		this.trunkNetworkInstanceId = trunkNetworkInstanceId;
		if(trunkNetworkInstanceId != null){
			putQueryParameter("TrunkNetworkInstanceId", trunkNetworkInstanceId);
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

	public Boolean getWaitForNetworkConfigurationReady() {
		return this.waitForNetworkConfigurationReady;
	}

	public void setWaitForNetworkConfigurationReady(Boolean waitForNetworkConfigurationReady) {
		this.waitForNetworkConfigurationReady = waitForNetworkConfigurationReady;
		if(waitForNetworkConfigurationReady != null){
			putQueryParameter("WaitForNetworkConfigurationReady", waitForNetworkConfigurationReady.toString());
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

	public Integer getNetworkCardIndex() {
		return this.networkCardIndex;
	}

	public void setNetworkCardIndex(Integer networkCardIndex) {
		this.networkCardIndex = networkCardIndex;
		if(networkCardIndex != null){
			putQueryParameter("NetworkCardIndex", networkCardIndex.toString());
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
	public Class<AttachNetworkInterfaceResponse> getResponseClass() {
		return AttachNetworkInterfaceResponse.class;
	}

}
