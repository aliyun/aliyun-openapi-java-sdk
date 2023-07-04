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
public class StartDBInstanceRequest extends RpcAcsRequest<StartDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String specifiedTime;

	private String targetDedicatedHostIdForSlave;

	private String engineVersion;

	private Integer storage;

	private String effectiveTime;

	private Integer dBInstanceTransType;

	private String targetDedicatedHostIdForMaster;

	private String dBInstanceId;

	private String dedicatedHostGroupId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String targetDBInstanceClass;

	private String vSwitchId;

	private String targetDedicatedHostIdForLog;

	private String zoneId;
	public StartDBInstanceRequest() {
		super("Rds", "2014-08-15", "StartDBInstance", "rds");
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

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
		}
	}

	public Integer getStorage() {
		return this.storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
		if(storage != null){
			putQueryParameter("Storage", storage.toString());
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

	public Integer getDBInstanceTransType() {
		return this.dBInstanceTransType;
	}

	public void setDBInstanceTransType(Integer dBInstanceTransType) {
		this.dBInstanceTransType = dBInstanceTransType;
		if(dBInstanceTransType != null){
			putQueryParameter("DBInstanceTransType", dBInstanceTransType.toString());
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

	public String getTargetDBInstanceClass() {
		return this.targetDBInstanceClass;
	}

	public void setTargetDBInstanceClass(String targetDBInstanceClass) {
		this.targetDBInstanceClass = targetDBInstanceClass;
		if(targetDBInstanceClass != null){
			putQueryParameter("TargetDBInstanceClass", targetDBInstanceClass);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getTargetDedicatedHostIdForLog() {
		return this.targetDedicatedHostIdForLog;
	}

	public void setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
		this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
		if(targetDedicatedHostIdForLog != null){
			putQueryParameter("TargetDedicatedHostIdForLog", targetDedicatedHostIdForLog);
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
	public Class<StartDBInstanceResponse> getResponseClass() {
		return StartDBInstanceResponse.class;
	}

}
