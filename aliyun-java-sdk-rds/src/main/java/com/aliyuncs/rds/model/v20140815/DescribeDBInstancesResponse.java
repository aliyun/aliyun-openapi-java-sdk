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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeDBInstancesResponse extends AcsResponse {

    private String requestId;

    private Integer pageNumber;

    private Integer totalRecordCount;

    private Integer pageRecordCount;

    private List<DBInstance> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public void setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public List<DBInstance> getItems() {
        return this.items;
    }

    public void setItems(List<DBInstance> items) {
        this.items = items;
    }

    public static class DBInstance {

        private Integer insId;

        private String dBInstanceId;

        private String dBInstanceDescription;

        private String payType;

        private DBInstanceType dBInstanceType;

        private String regionId;

        private String expireTime;

        private DBInstanceStatus dBInstanceStatus;

        private String engine;

        private DBInstanceNetType dBInstanceNetType;

        private ConnectionMode connectionMode;

        private LockMode lockMode;

        private String instanceNetworkType;

        private String lockReason;

        private String zoneId;

        private Boolean mutriORsignle;

        private String createTime;

        private String engineVersion;

        private String guardDBInstanceId;

        private String tempDBInstanceId;

        private String masterInstanceId;

        private String vpcId;

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

        public String getDBInstanceDescription() {
            return this.dBInstanceDescription;
        }

        public void setDBInstanceDescription(String dBInstanceDescription) {
            this.dBInstanceDescription = dBInstanceDescription;
        }

        public String getPayType() {
            return this.payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
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

        public String getExpireTime() {
            return this.expireTime;
        }

        public void setExpireTime(String expireTime) {
            this.expireTime = expireTime;
        }

        public DBInstanceStatus getDBInstanceStatus() {
            return this.dBInstanceStatus;
        }

        public void setDBInstanceStatus(DBInstanceStatus dBInstanceStatus) {
            this.dBInstanceStatus = dBInstanceStatus;
        }

        public String getEngine() {
            return this.engine;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public DBInstanceNetType getDBInstanceNetType() {
            return this.dBInstanceNetType;
        }

        public void setDBInstanceNetType(DBInstanceNetType dBInstanceNetType) {
            this.dBInstanceNetType = dBInstanceNetType;
        }

        public ConnectionMode getConnectionMode() {
            return this.connectionMode;
        }

        public void setConnectionMode(ConnectionMode connectionMode) {
            this.connectionMode = connectionMode;
        }

        public LockMode getLockMode() {
            return this.lockMode;
        }

        public void setLockMode(LockMode lockMode) {
            this.lockMode = lockMode;
        }

        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        public void setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
        }

        public String getLockReason() {
            return this.lockReason;
        }

        public void setLockReason(String lockReason) {
            this.lockReason = lockReason;
        }

        public String getZoneId() {
            return this.zoneId;
        }

        public void setZoneId(String zoneId) {
            this.zoneId = zoneId;
        }

        public Boolean getMutriORsignle() {
            return this.mutriORsignle;
        }

        public void setMutriORsignle(Boolean mutriORsignle) {
            this.mutriORsignle = mutriORsignle;
        }

        public String getCreateTime() {
            return this.createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getEngineVersion() {
            return this.engineVersion;
        }

        public void setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
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

        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public void setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
        }

        public String getVpcId() {
            return this.vpcId;
        }

        public void setVpcId(String vpcId) {
            this.vpcId = vpcId;
        }

        public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
            return this.readOnlyDBInstanceIds;
        }

        public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
            this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
        }

        public enum DBInstanceType {

            SHARED("Shared"),
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

            public static DBInstanceType getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (DBInstanceType dBInstanceType : DBInstanceType.values()) {
                    if (dBInstanceType.getStringValue().equals(stringValue)) {
                        return dBInstanceType;
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
            REBOOTING("Rebooting"),
            GUARD_SWITCHING("GuardSwitching"),
            LING_SWITCHING("LingSwitching"),
            TRANSING("Transing"),
            TRANSING_TO_OTHERS("TransingToOthers"),
            IMPORTING_FROM_OTHERS("ImportingFromOthers"),
            ENGINE_VERSION_UPGRADING("EngineVersionUpgrading"),
            D_B_INSTANCE_NET_TYPE_CHANGING("DBInstanceNetTypeChanging"),
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

            public static DBInstanceStatus getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (DBInstanceStatus dBInstanceStatus : DBInstanceStatus.values()) {
                    if (dBInstanceStatus.getStringValue().equals(stringValue)) {
                        return dBInstanceStatus;
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

            public static DBInstanceNetType getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (DBInstanceNetType dBInstanceNetType : DBInstanceNetType.values()) {
                    if (dBInstanceNetType.getStringValue().equals(stringValue)) {
                        return dBInstanceNetType;
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

            public static ConnectionMode getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (ConnectionMode connectionMode : ConnectionMode.values()) {
                    if (connectionMode.getStringValue().equals(stringValue)) {
                        return connectionMode;
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

            public static LockMode getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (LockMode lockMode : LockMode.values()) {
                    if (lockMode.getStringValue().equals(stringValue)) {
                        return lockMode;
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
    public DescribeDBInstancesResponse getInstance(UnmarshallerContext context) {
        return DescribeDBInstancesResponseUnmarshaller.unmarshall(this, context);
    }
}
