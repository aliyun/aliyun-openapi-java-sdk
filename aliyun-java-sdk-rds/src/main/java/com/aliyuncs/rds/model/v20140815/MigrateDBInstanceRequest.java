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
public class MigrateDBInstanceRequest extends RpcAcsRequest<MigrateDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String specifiedTime;

	private String targetDedicatedHostIdForSlave;

	private String effectiveTime;

	private String targetDedicatedHostIdForMaster;

	private String dBInstanceId;

	private String dedicatedHostGroupId;

	private String resourceOwnerAccount;

	private Long ownerId;
	public MigrateDBInstanceRequest() {
		super("Rds", "2014-08-15", "MigrateDBInstance", "rds");
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

	public String getSpecifiedTime() {
		return this.specifiedTime;
	}

	public void setSpecifiedTime(String specifiedTime) {
		this.specifiedTime = specifiedTime;
		if(specifiedTime != null){
			putQueryParameter("SpecifiedTime", specifiedTime);
		}
	}

	public String getTargetDedicatedHostIdForSlave() {
		return this.targetDedicatedHostIdForSlave;
	}

	public void setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
		this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
		if(targetDedicatedHostIdForSlave != null){
			putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
		}
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
		if(effectiveTime != null){
			putQueryParameter("EffectiveTime", effectiveTime);
		}
	}

	public String getTargetDedicatedHostIdForMaster() {
		return this.targetDedicatedHostIdForMaster;
	}

	public void setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
		this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
		if(targetDedicatedHostIdForMaster != null){
			putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<MigrateDBInstanceResponse> getResponseClass() {
		return MigrateDBInstanceResponse.class;
	}

}
