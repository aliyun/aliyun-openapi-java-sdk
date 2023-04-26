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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReAddMigrationTaskInPlanRequest extends RpcAcsRequest<ReAddMigrationTaskInPlanResponse> {
	   

	private Long resourceOwnerId;

	private String migrationPlanId;

	private String resourceOwnerAccount;

	private String migrationTime;

	private Long ownerId;

	private String instanceId;

	private String networkMigrationType;
	public ReAddMigrationTaskInPlanRequest() {
		super("Ecs", "2016-03-14", "ReAddMigrationTaskInPlan", "ecs");
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

	public String getMigrationPlanId() {
		return this.migrationPlanId;
	}

	public void setMigrationPlanId(String migrationPlanId) {
		this.migrationPlanId = migrationPlanId;
		if(migrationPlanId != null){
			putQueryParameter("MigrationPlanId", migrationPlanId);
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

	public String getMigrationTime() {
		return this.migrationTime;
	}

	public void setMigrationTime(String migrationTime) {
		this.migrationTime = migrationTime;
		if(migrationTime != null){
			putQueryParameter("MigrationTime", migrationTime);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getNetworkMigrationType() {
		return this.networkMigrationType;
	}

	public void setNetworkMigrationType(String networkMigrationType) {
		this.networkMigrationType = networkMigrationType;
		if(networkMigrationType != null){
			putQueryParameter("NetworkMigrationType", networkMigrationType);
		}
	}

	@Override
	public Class<ReAddMigrationTaskInPlanResponse> getResponseClass() {
		return ReAddMigrationTaskInPlanResponse.class;
	}

}
