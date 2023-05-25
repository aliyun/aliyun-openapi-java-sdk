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
public class ModifyCapacityReservationRequest extends RpcAcsRequest<ModifyCapacityReservationResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String startTime;

	private String platform;

	private String privatePoolOptionsId;

	private String endTimeType;

	private String resourceOwnerAccount;

	private String privatePoolOptionsName;

	private String ownerAccount;

	private String endTime;

	private Long ownerId;

	private Integer instanceAmount;
	public ModifyCapacityReservationRequest() {
		super("Ecs", "2014-05-26", "ModifyCapacityReservation", "ecs");
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public String getPrivatePoolOptionsId() {
		return this.privatePoolOptionsId;
	}

	public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
		this.privatePoolOptionsId = privatePoolOptionsId;
		if(privatePoolOptionsId != null){
			putQueryParameter("PrivatePoolOptions.Id", privatePoolOptionsId);
		}
	}

	public String getEndTimeType() {
		return this.endTimeType;
	}

	public void setEndTimeType(String endTimeType) {
		this.endTimeType = endTimeType;
		if(endTimeType != null){
			putQueryParameter("EndTimeType", endTimeType);
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

	public String getPrivatePoolOptionsName() {
		return this.privatePoolOptionsName;
	}

	public void setPrivatePoolOptionsName(String privatePoolOptionsName) {
		this.privatePoolOptionsName = privatePoolOptionsName;
		if(privatePoolOptionsName != null){
			putQueryParameter("PrivatePoolOptions.Name", privatePoolOptionsName);
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public Integer getInstanceAmount() {
		return this.instanceAmount;
	}

	public void setInstanceAmount(Integer instanceAmount) {
		this.instanceAmount = instanceAmount;
		if(instanceAmount != null){
			putQueryParameter("InstanceAmount", instanceAmount.toString());
		}
	}

	@Override
	public Class<ModifyCapacityReservationResponse> getResponseClass() {
		return ModifyCapacityReservationResponse.class;
	}

}
