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
import com.aliyuncs.rds.transform.v20140815.DescibeImportsFromDatabaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescibeImportsFromDatabaseResponse extends AcsResponse {

    private String requestId;

    private Integer totalRecordCount;

    private Integer pageNumber;

    private Integer pageRecordCount;

    private List<ImportResultFromDB> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public void setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
    }

    public List<ImportResultFromDB> getItems() {
        return this.items;
    }

    public void setItems(List<ImportResultFromDB> items) {
        this.items = items;
    }

    public static class ImportResultFromDB {

        private Integer importId;

        private ImportDataType importDataType;

        private ImportDataStatus importDataStatus;

        private String importDataStatusDescription;

        private String incrementalImportingTime;

        public Integer getImportId() {
            return this.importId;
        }

        public void setImportId(Integer importId) {
            this.importId = importId;
        }

        public ImportDataType getImportDataType() {
            return this.importDataType;
        }

        public void setImportDataType(ImportDataType importDataType) {
            this.importDataType = importDataType;
        }

        public ImportDataStatus getImportDataStatus() {
            return this.importDataStatus;
        }

        public void setImportDataStatus(ImportDataStatus importDataStatus) {
            this.importDataStatus = importDataStatus;
        }

        public String getImportDataStatusDescription() {
            return this.importDataStatusDescription;
        }

        public void setImportDataStatusDescription(String importDataStatusDescription) {
            this.importDataStatusDescription = importDataStatusDescription;
        }

        public String getIncrementalImportingTime() {
            return this.incrementalImportingTime;
        }

        public void setIncrementalImportingTime(String incrementalImportingTime) {
            this.incrementalImportingTime = incrementalImportingTime;
        }

        public enum ImportDataType {

            INCREMENTAL("Incremental"),
            FULL("Full"),;

            private String stringValue;

            ImportDataType(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static ImportDataType getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (ImportDataType importDataType : ImportDataType.values()) {
                    if (importDataType.getStringValue().equals(stringValue)) {
                        return importDataType;
                    }
                }
                return null;
            }
        }

        public enum ImportDataStatus {

            INCREMENTAL_IMPORTING("IncrementalImporting"),
            STOP_SYNCING("StopSyncing"),
            CANCELED("Canceled"),
            INCREMENTAL_WAITING("IncrementalWaiting"),
            CANCELING("Canceling"),
            FAILED("Failed"),
            FULL_IMPORTING("FullImporting"),
            SUCCESS("Success"),
            NOT_START("NotStart"),
            FULL_EXPORTING("FullExporting"),;

            private String stringValue;

            ImportDataStatus(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static ImportDataStatus getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (ImportDataStatus importDataStatus : ImportDataStatus.values()) {
                    if (importDataStatus.getStringValue().equals(stringValue)) {
                        return importDataStatus;
                    }
                }
                return null;
            }
        }
    }

    @Override
    public DescibeImportsFromDatabaseResponse getInstance(UnmarshallerContext context) {
        return DescibeImportsFromDatabaseResponseUnmarshaller.unmarshall(this, context);
    }
}
