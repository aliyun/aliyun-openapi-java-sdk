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
public class CreateDiskReplicaPairRequest extends RpcAcsRequest<CreateDiskReplicaPairResponse> {
	   

	private Long resourceOwnerId;

	private String pairName;

	private String destinationRegionId;

	private String description;

	private String diskId;

	private Integer asyncCycle;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String destinationDiskId;
	public CreateDiskReplicaPairRequest() {
		super("Ecs", "2014-05-26", "CreateDiskReplicaPair", "ecs");
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

	public String getPairName() {
		return this.pairName;
	}

	public void setPairName(String pairName) {
		this.pairName = pairName;
		if(pairName != null){
			putQueryParameter("PairName", pairName);
		}
	}

	public String getDestinationRegionId() {
		return this.destinationRegionId;
	}

	public void setDestinationRegionId(String destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
		if(destinationRegionId != null){
			putQueryParameter("DestinationRegionId", destinationRegionId);
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

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public Integer getAsyncCycle() {
		return this.asyncCycle;
	}

	public void setAsyncCycle(Integer asyncCycle) {
		this.asyncCycle = asyncCycle;
		if(asyncCycle != null){
			putQueryParameter("AsyncCycle", asyncCycle.toString());
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

	public String getDestinationDiskId() {
		return this.destinationDiskId;
	}

	public void setDestinationDiskId(String destinationDiskId) {
		this.destinationDiskId = destinationDiskId;
		if(destinationDiskId != null){
			putQueryParameter("DestinationDiskId", destinationDiskId);
		}
	}

	@Override
	public Class<CreateDiskReplicaPairResponse> getResponseClass() {
		return CreateDiskReplicaPairResponse.class;
	}

}
