/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceAttribute> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceAttribute> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstanceAttribute> items) {
		this.items = items;
	}

	public static class DBInstanceAttribute {

		private Integer insId;

		private String dBInstanceId;

		private String payType;

		private String dBInstanceClassType;

		private DBInstanceType dBInstanceType;

		private String regionId;

		private String connectionString;

		private String port;

		private String engine;

		private String engineVersion;

		private String dBInstanceClass;

		private Long dBInstanceMemory;

		private Integer dBInstanceStorage;

		private DBInstanceNetType dBInstanceNetType;

		private DBInstanceStatus dBInstanceStatus;

		private String dBInstanceDescription;

		private LockMode lockMode;

		private String lockReason;

		private String readDelayTime;

		private Integer dBMaxQuantity;

		private Integer accountMaxQuantity;

		private String creationTime;

		private String expireTime;

		private String maintainTime;

		private String availabilityValue;

		private Integer maxIOPS;

		private Integer maxConnections;

		private String masterInstanceId;

		private String dBInstanceCPU;

		private String incrementSourceDBInstanceId;

		private String guardDBInstanceId;

		private String tempDBInstanceId;

		private String securityIPList;

		private String zoneId;

		private String instanceNetworkType;

		private AccountType accountType;

		private SupportUpgradeAccountType supportUpgradeAccountType;

		private String vpcId;

		private ConnectionMode connectionMode;

		private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

		public Integer getInsId() {
			return this.insId;
		}

		public void setInsId(Integer insId) {
			this.insId = insId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBInstanceClassType() {
			return this.dBInstanceClassType;
		}

		public void setDBInstanceClassType(String dBInstanceClassType) {
			this.dBInstanceClassType = dBInstanceClassType;
		}

		public DBInstanceType getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(DBInstanceType dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public Integer getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Integer dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public DBInstanceNetType getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(DBInstanceNetType dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public DBInstanceStatus getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(DBInstanceStatus dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public LockMode getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(LockMode lockMode) {
			this.lockMode = lockMode;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getReadDelayTime() {
			return this.readDelayTime;
		}

		public void setReadDelayTime(String readDelayTime) {
			this.readDelayTime = readDelayTime;
		}

		public Integer getDBMaxQuantity() {
			return this.dBMaxQuantity;
		}

		public void setDBMaxQuantity(Integer dBMaxQuantity) {
			this.dBMaxQuantity = dBMaxQuantity;
		}

		public Integer getAccountMaxQuantity() {
			return this.accountMaxQuantity;
		}

		public void setAccountMaxQuantity(Integer accountMaxQuantity) {
			this.accountMaxQuantity = accountMaxQuantity;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public Integer getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(Integer maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getDBInstanceCPU() {
			return this.dBInstanceCPU;
		}

		public void setDBInstanceCPU(String dBInstanceCPU) {
			this.dBInstanceCPU = dBInstanceCPU;
		}

		public String getIncrementSourceDBInstanceId() {
			return this.incrementSourceDBInstanceId;
		}

		public void setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
			this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
		}

		public String getGuardDBInstanceId() {
			return this.guardDBInstanceId;
		}

		public void setGuardDBInstanceId(String guardDBInstanceId) {
			this.guardDBInstanceId = guardDBInstanceId;
		}

		public String getTempDBInstanceId() {
			return this.tempDBInstanceId;
		}

		public void setTempDBInstanceId(String tempDBInstanceId) {
			this.tempDBInstanceId = tempDBInstanceId;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public AccountType getAccountType() {
			return this.accountType;
		}

		public void setAccountType(AccountType accountType) {
			this.accountType = accountType;
		}

		public SupportUpgradeAccountType getSupportUpgradeAccountType() {
			return this.supportUpgradeAccountType;
		}

		public void setSupportUpgradeAccountType(SupportUpgradeAccountType supportUpgradeAccountType) {
			this.supportUpgradeAccountType = supportUpgradeAccountType;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public ConnectionMode getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(ConnectionMode connectionMode) {
			this.connectionMode = connectionMode;
		}

		public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
			return this.readOnlyDBInstanceIds;
		}

		public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
			this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
		}

public enum DBInstanceType {

			GUARD("Guard"),
			PRIMARY("Primary"),
			READONLY("Readonly"),
			TEMP("Temp"),;
	
    private String stringValue;

	DBInstanceType(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static DBInstanceType getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (DBInstanceType dBInstanceType : DBInstanceType.values()) {
			if(dBInstanceType.getStringValue().equals(stringValue)){
				return dBInstanceType;
			}
		}
    	return null;
    }
}

public enum DBInstanceNetType {

			INTRANET("Intranet"),
			INTERNET("Internet"),;
	
    private String stringValue;

	DBInstanceNetType(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static DBInstanceNetType getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (DBInstanceNetType dBInstanceNetType : DBInstanceNetType.values()) {
			if(dBInstanceNetType.getStringValue().equals(stringValue)){
				return dBInstanceNetType;
			}
		}
    	return null;
    }
}

public enum DBInstanceStatus {

			TEMP_D_B_INSTANCE_CREATING("TempDBInstanceCreating"),
			RUNNING("Running"),
			DELETING("Deleting"),
			D_B_INSTANCE_CLASS_CHANGING("DBInstanceClassChanging"),
			CREATING("Creating"),
			GUARD_D_B_INSTANCE_CREATING("GuardDBInstanceCreating"),
			REBOOTING("Rebooting"),
			GUARD_SWITCHING("GuardSwitching"),
			SYSTEM_MAINTAINING("SystemMaintaining"),
			TRANSING("Transing"),
			TRANSING_TO_OTHERS("TransingToOthers"),
			IMPORTING_FROM_OTHERS("ImportingFromOthers"),
			ENGINE_VERSION_UPGRADING("EngineVersionUpgrading"),
			READ_INSTANCE_TRANSING("ReadInstanceTransing"),
			LINK_SWITCHING("LinkSwitching"),
			D_B_INSTANCE_NET_TYPE_CHANGING("DBInstanceNetTypeChanging"),
			INSTANCE_MAINTAINING("InstanceMaintaining"),
			IMPORTING("Importing"),
			RESTORING("Restoring"),;
	
    private String stringValue;

	DBInstanceStatus(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static DBInstanceStatus getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (DBInstanceStatus dBInstanceStatus : DBInstanceStatus.values()) {
			if(dBInstanceStatus.getStringValue().equals(stringValue)){
				return dBInstanceStatus;
			}
		}
    	return null;
    }
}

public enum LockMode {

			LOCK_BY_EXPIRATION("LockByExpiration"),
			LOCK_BY_RESTORATION("LockByRestoration"),
			LOCK_READ_INSTANCE_BY_DISK_QUOTA("LockReadInstanceByDiskQuota"),
			MANUAL_LOCK("ManualLock"),
			LOCK_BY_DISK_QUOTA("LockByDiskQuota"),
			UNLOCK("Unlock"),;
	
    private String stringValue;

	LockMode(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static LockMode getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (LockMode lockMode : LockMode.values()) {
			if(lockMode.getStringValue().equals(stringValue)){
				return lockMode;
			}
		}
    	return null;
    }
}

public enum AccountType {

			NORMAL("Normal"),
			SUPER("Super"),;
	
    private String stringValue;

	AccountType(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static AccountType getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (AccountType accountType : AccountType.values()) {
			if(accountType.getStringValue().equals(stringValue)){
				return accountType;
			}
		}
    	return null;
    }
}

public enum SupportUpgradeAccountType {

			YES("Yes"),
			NO("No"),;
	
    private String stringValue;

	SupportUpgradeAccountType(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static SupportUpgradeAccountType getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (SupportUpgradeAccountType supportUpgradeAccountType : SupportUpgradeAccountType.values()) {
			if(supportUpgradeAccountType.getStringValue().equals(stringValue)){
				return supportUpgradeAccountType;
			}
		}
    	return null;
    }
}

public enum ConnectionMode {

			STANDARD("Standard"),
			SAFE("Safe"),;
	
    private String stringValue;

	ConnectionMode(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static ConnectionMode getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (ConnectionMode connectionMode : ConnectionMode.values()) {
			if(connectionMode.getStringValue().equals(stringValue)){
				return connectionMode;
			}
		}
    	return null;
    }
}

		public static class ReadOnlyDBInstanceId {

			private String dBInstanceId;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
