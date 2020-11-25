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
public class ModifyInstanceSpecRequest extends RpcAcsRequest<ModifyInstanceSpecResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private Boolean allowMigrateAcrossZone;

	private Integer internetMaxBandwidthOut;

	private String systemDiskCategory;

	private String instanceType;

	private String temporaryEndTime;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Integer temporaryInternetMaxBandwidthOut;

	private String temporaryStartTime;

	private Boolean async;

	private String instanceId;

	private Integer internetMaxBandwidthIn;
	public ModifyInstanceSpecRequest() {
		super("Ecs", "2014-05-26", "ModifyInstanceSpec", "ecs");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Boolean getAllowMigrateAcrossZone() {
		return this.allowMigrateAcrossZone;
	}

	public void setAllowMigrateAcrossZone(Boolean allowMigrateAcrossZone) {
		this.allowMigrateAcrossZone = allowMigrateAcrossZone;
		if(allowMigrateAcrossZone != null){
			putQueryParameter("AllowMigrateAcrossZone", allowMigrateAcrossZone.toString());
		}
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
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

	public String getTemporaryEndTime() {
		return this.temporaryEndTime;
	}

	public void setTemporaryEndTime(String temporaryEndTime) {
		this.temporaryEndTime = temporaryEndTime;
		if(temporaryEndTime != null){
			putQueryParameter("Temporary.EndTime", temporaryEndTime);
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

	public Integer getTemporaryInternetMaxBandwidthOut() {
		return this.temporaryInternetMaxBandwidthOut;
	}

	public void setTemporaryInternetMaxBandwidthOut(Integer temporaryInternetMaxBandwidthOut) {
		this.temporaryInternetMaxBandwidthOut = temporaryInternetMaxBandwidthOut;
		if(temporaryInternetMaxBandwidthOut != null){
			putQueryParameter("Temporary.InternetMaxBandwidthOut", temporaryInternetMaxBandwidthOut.toString());
		}
	}

	public String getTemporaryStartTime() {
		return this.temporaryStartTime;
	}

	public void setTemporaryStartTime(String temporaryStartTime) {
		this.temporaryStartTime = temporaryStartTime;
		if(temporaryStartTime != null){
			putQueryParameter("Temporary.StartTime", temporaryStartTime);
		}
	}

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		if(async != null){
			putQueryParameter("Async", async.toString());
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

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
		}
	}

	@Override
	public Class<ModifyInstanceSpecResponse> getResponseClass() {
		return ModifyInstanceSpecResponse.class;
	}

}
