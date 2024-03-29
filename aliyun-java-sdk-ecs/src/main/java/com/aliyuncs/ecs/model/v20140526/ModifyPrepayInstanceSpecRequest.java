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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPrepayInstanceSpecRequest extends RpcAcsRequest<ModifyPrepayInstanceSpecResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String operatorType;

	private String systemDiskCategory;

	private String rebootTime;

	private Boolean migrateAcrossZone;

	private String instanceType;

	private String modifyMode;

	private Boolean autoPay;

	private Boolean rebootWhenFinished;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String endTime;

	private Long ownerId;

	private List<Disk> disks;

	private String instanceId;
	public ModifyPrepayInstanceSpecRequest() {
		super("Ecs", "2014-05-26", "ModifyPrepayInstanceSpec", "ecs");
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

	public String getOperatorType() {
		return this.operatorType;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
		if(operatorType != null){
			putQueryParameter("OperatorType", operatorType);
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

	public String getRebootTime() {
		return this.rebootTime;
	}

	public void setRebootTime(String rebootTime) {
		this.rebootTime = rebootTime;
		if(rebootTime != null){
			putQueryParameter("RebootTime", rebootTime);
		}
	}

	public Boolean getMigrateAcrossZone() {
		return this.migrateAcrossZone;
	}

	public void setMigrateAcrossZone(Boolean migrateAcrossZone) {
		this.migrateAcrossZone = migrateAcrossZone;
		if(migrateAcrossZone != null){
			putQueryParameter("MigrateAcrossZone", migrateAcrossZone.toString());
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

	public String getModifyMode() {
		return this.modifyMode;
	}

	public void setModifyMode(String modifyMode) {
		this.modifyMode = modifyMode;
		if(modifyMode != null){
			putQueryParameter("ModifyMode", modifyMode);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Boolean getRebootWhenFinished() {
		return this.rebootWhenFinished;
	}

	public void setRebootWhenFinished(Boolean rebootWhenFinished) {
		this.rebootWhenFinished = rebootWhenFinished;
		if(rebootWhenFinished != null){
			putQueryParameter("RebootWhenFinished", rebootWhenFinished.toString());
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

	public List<Disk> getDisks() {
		return this.disks;
	}

	public void setDisks(List<Disk> disks) {
		this.disks = disks;	
		if (disks != null) {
			for (int depth1 = 0; depth1 < disks.size(); depth1++) {
				putQueryParameter("Disk." + (depth1 + 1) + ".PerformanceLevel" , disks.get(depth1).getPerformanceLevel());
				putQueryParameter("Disk." + (depth1 + 1) + ".DiskId" , disks.get(depth1).getDiskId());
				putQueryParameter("Disk." + (depth1 + 1) + ".Category" , disks.get(depth1).getCategory());
			}
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

	public static class Disk {

		private String performanceLevel;

		private String diskId;

		private String category;

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	@Override
	public Class<ModifyPrepayInstanceSpecResponse> getResponseClass() {
		return ModifyPrepayInstanceSpecResponse.class;
	}

}
