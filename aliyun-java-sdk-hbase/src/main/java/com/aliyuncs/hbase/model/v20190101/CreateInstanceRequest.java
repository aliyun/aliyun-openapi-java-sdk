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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	   

	private String clusterName;

	private String dbInstanceConnType;

	private String engineVersion;

	private String depMode;

	private String backupId;

	private String dbInstanceType;

	private String vSwitchId;

	private String securityIPList;

	private String autoRenew;

	private String netType;

	private String zoneId;

	private String coreDiskType;

	private String pricingCycle;

	private String coreInstanceQuantity;

	private String duration;

	private String engine;

	private String restoreTime;

	private String srcDBInstanceId;

	private String masterInstanceType;

	private String coldStorageSize;

	private String coreDiskQuantity;

	private String isColdStorage;

	private String coreInstanceType;

	private String coreDiskSize;

	private String vpcId;

	private String dbType;

	private String payType;
	public CreateInstanceRequest() {
		super("HBase", "2019-01-01", "CreateInstance");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
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

	public String getBackupId() {
		return this.backupId;
	}

	public void setBackupId(String backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId);
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

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
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

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
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

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
		if(masterInstanceType != null){
			putQueryParameter("MasterInstanceType", masterInstanceType);
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
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
