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

package com.aliyuncs.hitsdb.model.v20170601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateHiTSDBInstanceRequest extends RpcAcsRequest<CreateHiTSDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String connectionString;

	private String instanceClass;

	private String duration;

	private String securityToken;

	private String maxSeriesPerDatabase;

	private String maxTimelineLimit;

	private String instanceStorage;

	private String engineType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String instanceAlias;

	private String maxDatabaseLimit;

	private Long ownerId;

	private String vSwitchId;

	private String securityIPList;

	private String instanceName;

	private String instanceTps;

	private String vPCId;

	private String zoneId;

	private String tSDBVersion;

	private String payType;

	private String pricingCycle;
	public CreateHiTSDBInstanceRequest() {
		super("hitsdb", "2017-06-01", "CreateHiTSDBInstance", "hitsdb");
		setMethod(MethodType.POST);
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

	public String getConnectionString() {
		return this.connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
		if(connectionString != null){
			putQueryParameter("ConnectionString", connectionString);
		}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putQueryParameter("InstanceClass", instanceClass);
		}
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getMaxSeriesPerDatabase() {
		return this.maxSeriesPerDatabase;
	}

	public void setMaxSeriesPerDatabase(String maxSeriesPerDatabase) {
		this.maxSeriesPerDatabase = maxSeriesPerDatabase;
		if(maxSeriesPerDatabase != null){
			putQueryParameter("MaxSeriesPerDatabase", maxSeriesPerDatabase);
		}
	}

	public String getMaxTimelineLimit() {
		return this.maxTimelineLimit;
	}

	public void setMaxTimelineLimit(String maxTimelineLimit) {
		this.maxTimelineLimit = maxTimelineLimit;
		if(maxTimelineLimit != null){
			putQueryParameter("MaxTimelineLimit", maxTimelineLimit);
		}
	}

	public String getInstanceStorage() {
		return this.instanceStorage;
	}

	public void setInstanceStorage(String instanceStorage) {
		this.instanceStorage = instanceStorage;
		if(instanceStorage != null){
			putQueryParameter("InstanceStorage", instanceStorage);
		}
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putQueryParameter("EngineType", engineType);
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

	public String getInstanceAlias() {
		return this.instanceAlias;
	}

	public void setInstanceAlias(String instanceAlias) {
		this.instanceAlias = instanceAlias;
		if(instanceAlias != null){
			putQueryParameter("InstanceAlias", instanceAlias);
		}
	}

	public String getMaxDatabaseLimit() {
		return this.maxDatabaseLimit;
	}

	public void setMaxDatabaseLimit(String maxDatabaseLimit) {
		this.maxDatabaseLimit = maxDatabaseLimit;
		if(maxDatabaseLimit != null){
			putQueryParameter("MaxDatabaseLimit", maxDatabaseLimit);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
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

	public String getInstanceTps() {
		return this.instanceTps;
	}

	public void setInstanceTps(String instanceTps) {
		this.instanceTps = instanceTps;
		if(instanceTps != null){
			putQueryParameter("InstanceTps", instanceTps);
		}
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
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

	public String getTSDBVersion() {
		return this.tSDBVersion;
	}

	public void setTSDBVersion(String tSDBVersion) {
		this.tSDBVersion = tSDBVersion;
		if(tSDBVersion != null){
			putQueryParameter("TSDBVersion", tSDBVersion);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
		}
	}

	@Override
	public Class<CreateHiTSDBInstanceResponse> getResponseClass() {
		return CreateHiTSDBInstanceResponse.class;
	}

}
