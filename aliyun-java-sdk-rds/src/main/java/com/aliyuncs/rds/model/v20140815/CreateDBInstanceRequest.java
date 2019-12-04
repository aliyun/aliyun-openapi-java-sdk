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
public class CreateDBInstanceRequest extends RpcAcsRequest<CreateDBInstanceResponse> {
	   

	private Long resourceOwnerId;

	private Integer dBInstanceStorage;

	private String systemDBCharset;

	private String engineVersion;

	private String targetDedicatedHostIdForMaster;

	private String dBInstanceDescription;

	private String businessInfo;

	private String period;

	private String encryptionKey;

	private String dBInstanceClass;

	private String securityIPList;

	private String vSwitchId;

	private String privateIpAddress;

	private String targetDedicatedHostIdForLog;

	private String autoRenew;

	private String roleARN;

	private String zoneId;

	private String instanceNetworkType;

	private String connectionMode;

	private String clientToken;

	private String targetDedicatedHostIdForSlave;

	private String engine;

	private String dBInstanceStorageType;

	private String dedicatedHostGroupId;

	private String dBInstanceNetType;

	private String usedTime;

	private String vPCId;

	private String category;

	private String payType;
	public CreateDBInstanceRequest() {
		super("Rds", "2014-08-15", "CreateDBInstance", "rds");
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

	public Integer getDBInstanceStorage() {
		return this.dBInstanceStorage;
	}

	public void setDBInstanceStorage(Integer dBInstanceStorage) {
		this.dBInstanceStorage = dBInstanceStorage;
		if(dBInstanceStorage != null){
			putQueryParameter("DBInstanceStorage", dBInstanceStorage.toString());
		}
	}

	public String getSystemDBCharset() {
		return this.systemDBCharset;
	}

	public void setSystemDBCharset(String systemDBCharset) {
		this.systemDBCharset = systemDBCharset;
		if(systemDBCharset != null){
			putQueryParameter("SystemDBCharset", systemDBCharset);
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

	public String getTargetDedicatedHostIdForMaster() {
		return this.targetDedicatedHostIdForMaster;
	}

	public void setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
		this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
		if(targetDedicatedHostIdForMaster != null){
			putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
		}
	}

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public String getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
		if(businessInfo != null){
			putQueryParameter("BusinessInfo", businessInfo);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
		if(encryptionKey != null){
			putQueryParameter("EncryptionKey", encryptionKey);
		}
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
		if(dBInstanceClass != null){
			putQueryParameter("DBInstanceClass", dBInstanceClass);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
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

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getRoleARN() {
		return this.roleARN;
	}

	public void setRoleARN(String roleARN) {
		this.roleARN = roleARN;
		if(roleARN != null){
			putQueryParameter("RoleARN", roleARN);
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

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
		if(instanceNetworkType != null){
			putQueryParameter("InstanceNetworkType", instanceNetworkType);
		}
	}

	public String getConnectionMode() {
		return this.connectionMode;
	}

	public void setConnectionMode(String connectionMode) {
		this.connectionMode = connectionMode;
		if(connectionMode != null){
			putQueryParameter("ConnectionMode", connectionMode);
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

	public String getTargetDedicatedHostIdForSlave() {
		return this.targetDedicatedHostIdForSlave;
	}

	public void setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
		this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
		if(targetDedicatedHostIdForSlave != null){
			putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public String getDBInstanceStorageType() {
		return this.dBInstanceStorageType;
	}

	public void setDBInstanceStorageType(String dBInstanceStorageType) {
		this.dBInstanceStorageType = dBInstanceStorageType;
		if(dBInstanceStorageType != null){
			putQueryParameter("DBInstanceStorageType", dBInstanceStorageType);
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

	public String getDBInstanceNetType() {
		return this.dBInstanceNetType;
	}

	public void setDBInstanceNetType(String dBInstanceNetType) {
		this.dBInstanceNetType = dBInstanceNetType;
		if(dBInstanceNetType != null){
			putQueryParameter("DBInstanceNetType", dBInstanceNetType);
		}
	}

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
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

	@Override
	public Class<CreateDBInstanceResponse> getResponseClass() {
		return CreateDBInstanceResponse.class;
	}

}
