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

package com.aliyuncs.hbase.model.v20170115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RpcAcsRequest<CreateClusterResponse> {
	
	public CreateClusterRequest() {
		super("HBase", "2017-01-15", "CreateCluster");
	}

	private String clientToken;

	private String clusterName;

	private String dbInstanceConnType;

	private String cloudType;

	private String engineVersion;

	private String coreInstanceQuantity;

	private String duration;

	private String depMode;

	private String engine;

	private String restoreTime;

	private String srcDBInstanceId;

	private String backupId;

	private String masterInstanceType;

	private String dbInstanceType;

	private String vSwitchId;

	private String securityIPList;

	private String coldStorageSize;

	private String coreDiskQuantity;

	private String autoRenew;

	private String isColdStorage;

	private String coreInstanceType;

	private String coreDiskSize;

	private String netType;

	private String vpcId;

	private String dbType;

	private String zoneId;

	private String coreDiskType;

	private String payType;

	private String pricingCycle;

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public String getDbInstanceConnType() {
		return this.dbInstanceConnType;
	}

	public void setDbInstanceConnType(String dbInstanceConnType) {
		this.dbInstanceConnType = dbInstanceConnType;
		if(dbInstanceConnType != null){
			putQueryParameter("DbInstanceConnType", dbInstanceConnType);
		}
	}

	public String getCloudType() {
		return this.cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
		if(cloudType != null){
			putQueryParameter("CloudType", cloudType);
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

	public String getCoreInstanceQuantity() {
		return this.coreInstanceQuantity;
	}

	public void setCoreInstanceQuantity(String coreInstanceQuantity) {
		this.coreInstanceQuantity = coreInstanceQuantity;
		if(coreInstanceQuantity != null){
			putQueryParameter("CoreInstanceQuantity", coreInstanceQuantity);
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

	public String getDepMode() {
		return this.depMode;
	}

	public void setDepMode(String depMode) {
		this.depMode = depMode;
		if(depMode != null){
			putQueryParameter("DepMode", depMode);
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

	public String getRestoreTime() {
		return this.restoreTime;
	}

	public void setRestoreTime(String restoreTime) {
		this.restoreTime = restoreTime;
		if(restoreTime != null){
			putQueryParameter("RestoreTime", restoreTime);
		}
	}

	public String getSrcDBInstanceId() {
		return this.srcDBInstanceId;
	}

	public void setSrcDBInstanceId(String srcDBInstanceId) {
		this.srcDBInstanceId = srcDBInstanceId;
		if(srcDBInstanceId != null){
			putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
		}
	}

	public String getBackupId() {
		return this.backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId);
		}
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
		if(masterInstanceType != null){
			putQueryParameter("MasterInstanceType", masterInstanceType);
		}
	}

	public String getDbInstanceType() {
		return this.dbInstanceType;
	}

	public void setDbInstanceType(String dbInstanceType) {
		this.dbInstanceType = dbInstanceType;
		if(dbInstanceType != null){
			putQueryParameter("DbInstanceType", dbInstanceType);
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

	public String getColdStorageSize() {
		return this.coldStorageSize;
	}

	public void setColdStorageSize(String coldStorageSize) {
		this.coldStorageSize = coldStorageSize;
		if(coldStorageSize != null){
			putQueryParameter("ColdStorageSize", coldStorageSize);
		}
	}

	public String getCoreDiskQuantity() {
		return this.coreDiskQuantity;
	}

	public void setCoreDiskQuantity(String coreDiskQuantity) {
		this.coreDiskQuantity = coreDiskQuantity;
		if(coreDiskQuantity != null){
			putQueryParameter("CoreDiskQuantity", coreDiskQuantity);
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

	public String getIsColdStorage() {
		return this.isColdStorage;
	}

	public void setIsColdStorage(String isColdStorage) {
		this.isColdStorage = isColdStorage;
		if(isColdStorage != null){
			putQueryParameter("IsColdStorage", isColdStorage);
		}
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
		if(coreInstanceType != null){
			putQueryParameter("CoreInstanceType", coreInstanceType);
		}
	}

	public String getCoreDiskSize() {
		return this.coreDiskSize;
	}

	public void setCoreDiskSize(String coreDiskSize) {
		this.coreDiskSize = coreDiskSize;
		if(coreDiskSize != null){
			putQueryParameter("CoreDiskSize", coreDiskSize);
		}
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
		if(dbType != null){
			putQueryParameter("DbType", dbType);
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

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
		if(coreDiskType != null){
			putQueryParameter("CoreDiskType", coreDiskType);
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
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
