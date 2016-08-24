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
import com.aliyuncs.rds.transform.v20140815.DescribeBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeBackupsResponse extends AcsResponse {

    private String requestId;

    private String totalRecordCount;

    private String pageNumber;

    private String pageRecordCount;

    private Integer totalBackupSize;

    private List<Backup> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public void setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public String getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public void setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public Integer getTotalBackupSize() {
        return this.totalBackupSize;
    }

    public void setTotalBackupSize(Integer totalBackupSize) {
        this.totalBackupSize = totalBackupSize;
    }

    public List<Backup> getItems() {
        return this.items;
    }

    public void setItems(List<Backup> items) {
        this.items = items;
    }

    public static class Backup {

        private String backupId;

        private String dBInstanceId;

        private BackupStatus backupStatus;

        private String backupStartTime;

        private String backupEndTime;

        private BackupType backupType;

        private BackupMode backupMode;

        private BackupMethod backupMethod;

        private String backupDownloadURL;

        private String backupIntranetDownloadURL;

        private String backupLocation;

        private BackupExtractionStatus backupExtractionStatus;

        private BackupScale backupScale;

        private String backupDBNames;

        private Long totalBackupSize;

        private Long backupSize;

        private String hostInstanceID;

        public String getBackupId() {
            return this.backupId;
        }

        public void setBackupId(String backupId) {
            this.backupId = backupId;
        }

        public String getDBInstanceId() {
            return this.dBInstanceId;
        }

        public void setDBInstanceId(String dBInstanceId) {
            this.dBInstanceId = dBInstanceId;
        }

        public BackupStatus getBackupStatus() {
            return this.backupStatus;
        }

        public void setBackupStatus(BackupStatus backupStatus) {
            this.backupStatus = backupStatus;
        }

        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public void setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
        }

        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public void setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
        }

        public BackupType getBackupType() {
            return this.backupType;
        }

        public void setBackupType(BackupType backupType) {
            this.backupType = backupType;
        }

        public BackupMode getBackupMode() {
            return this.backupMode;
        }

        public void setBackupMode(BackupMode backupMode) {
            this.backupMode = backupMode;
        }

        public BackupMethod getBackupMethod() {
            return this.backupMethod;
        }

        public void setBackupMethod(BackupMethod backupMethod) {
            this.backupMethod = backupMethod;
        }

        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public void setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
        }

        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public void setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
        }

        public String getBackupLocation() {
            return this.backupLocation;
        }

        public void setBackupLocation(String backupLocation) {
            this.backupLocation = backupLocation;
        }

        public BackupExtractionStatus getBackupExtractionStatus() {
            return this.backupExtractionStatus;
        }

        public void setBackupExtractionStatus(BackupExtractionStatus backupExtractionStatus) {
            this.backupExtractionStatus = backupExtractionStatus;
        }

        public BackupScale getBackupScale() {
            return this.backupScale;
        }

        public void setBackupScale(BackupScale backupScale) {
            this.backupScale = backupScale;
        }

        public String getBackupDBNames() {
            return this.backupDBNames;
        }

        public void setBackupDBNames(String backupDBNames) {
            this.backupDBNames = backupDBNames;
        }

        public Long getTotalBackupSize() {
            return this.totalBackupSize;
        }

        public void setTotalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
        }

        public Long getBackupSize() {
            return this.backupSize;
        }

        public void setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
        }

        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public void setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
        }

        public enum BackupStatus {

            FAILED("Failed"),
            SUCCESS("Success"),;

            private String stringValue;

            BackupStatus(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static BackupStatus getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (BackupStatus backupStatus : BackupStatus.values()) {
                    if (backupStatus.getStringValue().equals(stringValue)) {
                        return backupStatus;
                    }
                }
                return null;
            }
        }

        public enum BackupType {

            INCREMENTAL_BACKUP("IncrementalBackup"),
            FULL_BACKUP("FullBackup"),;

            private String stringValue;

            BackupType(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static BackupType getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (BackupType backupType : BackupType.values()) {
                    if (backupType.getStringValue().equals(stringValue)) {
                        return backupType;
                    }
                }
                return null;
            }
        }

        public enum BackupMode {

            MANUAL("Manual"),
            AUTOMATED("Automated"),;

            private String stringValue;

            BackupMode(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static BackupMode getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (BackupMode backupMode : BackupMode.values()) {
                    if (backupMode.getStringValue().equals(stringValue)) {
                        return backupMode;
                    }
                }
                return null;
            }
        }

        public enum BackupMethod {

            PHYSICAL("Physical"),
            LOGICAL("Logical"),;

            private String stringValue;

            BackupMethod(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static BackupMethod getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (BackupMethod backupMethod : BackupMethod.values()) {
                    if (backupMethod.getStringValue().equals(stringValue)) {
                        return backupMethod;
                    }
                }
                return null;
            }
        }

        public enum BackupExtractionStatus {

            NOSTART("Nostart"),
            EXTRACING("Extracing"),
            FAILED("Failed"),
            SUCCESS("Success"),;

            private String stringValue;

            BackupExtractionStatus(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static BackupExtractionStatus getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (BackupExtractionStatus backupExtractionStatus : BackupExtractionStatus
                        .values()) {
                    if (backupExtractionStatus.getStringValue().equals(stringValue)) {
                        return backupExtractionStatus;
                    }
                }
                return null;
            }
        }

        public enum BackupScale {

            D_B_INSTANCE("DBInstance"),
            DATABASE("Database"),;

            private String stringValue;

            BackupScale(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static BackupScale getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (BackupScale backupScale : BackupScale.values()) {
                    if (backupScale.getStringValue().equals(stringValue)) {
                        return backupScale;
                    }
                }
                return null;
            }
        }
    }

    @Override
    public DescribeBackupsResponse getInstance(UnmarshallerContext context) {
        return DescribeBackupsResponseUnmarshaller.unmarshall(this, context);
    }
}
