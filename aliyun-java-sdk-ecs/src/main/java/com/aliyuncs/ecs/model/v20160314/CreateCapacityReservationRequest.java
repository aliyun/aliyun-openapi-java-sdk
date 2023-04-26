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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCapacityReservationRequest extends RpcAcsRequest<CreateCapacityReservationResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String networkType;

	private String resourceGroupId;

	private String instanceCount;

	private String instanceType;

	private List<Tag> tags;

	private String instancePlatform;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String endDateType;

	private String instanceMatchCriteria;

	private String timeSlot;

	private String capacityReservationName;

	private String zoneId;
	public CreateCapacityReservationRequest() {
		super("Ecs", "2016-03-14", "CreateCapacityReservation", "ecs");
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

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
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

	public String getInstanceCount() {
		return this.instanceCount;
	}

	public void setInstanceCount(String instanceCount) {
		this.instanceCount = instanceCount;
		if(instanceCount != null){
			putQueryParameter("InstanceCount", instanceCount);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getInstancePlatform() {
		return this.instancePlatform;
	}

	public void setInstancePlatform(String instancePlatform) {
		this.instancePlatform = instancePlatform;
		if(instancePlatform != null){
			putQueryParameter("InstancePlatform", instancePlatform);
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

	public String getEndDateType() {
		return this.endDateType;
	}

	public void setEndDateType(String endDateType) {
		this.endDateType = endDateType;
		if(endDateType != null){
			putQueryParameter("EndDateType", endDateType);
		}
	}

	public String getInstanceMatchCriteria() {
		return this.instanceMatchCriteria;
	}

	public void setInstanceMatchCriteria(String instanceMatchCriteria) {
		this.instanceMatchCriteria = instanceMatchCriteria;
		if(instanceMatchCriteria != null){
			putQueryParameter("InstanceMatchCriteria", instanceMatchCriteria);
		}
	}

	public String getTimeSlot() {
		return this.timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
		if(timeSlot != null){
			putQueryParameter("TimeSlot", timeSlot);
		}
	}

	public String getCapacityReservationName() {
		return this.capacityReservationName;
	}

	public void setCapacityReservationName(String capacityReservationName) {
		this.capacityReservationName = capacityReservationName;
		if(capacityReservationName != null){
			putQueryParameter("CapacityReservationName", capacityReservationName);
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

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateCapacityReservationResponse> getResponseClass() {
		return CreateCapacityReservationResponse.class;
	}

}
