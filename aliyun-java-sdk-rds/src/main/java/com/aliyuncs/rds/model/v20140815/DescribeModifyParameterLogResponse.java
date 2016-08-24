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
import com.aliyuncs.rds.transform.v20140815.DescribeModifyParameterLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeModifyParameterLogResponse extends AcsResponse {

    private String requestId;

    private String engine;

    private String dBInstanceId;

    private String engineVersion;

    private Integer totalRecordCount;

    private Integer pageNumber;

    private Integer pageRecordCount;

    private List<ParameterChangeLog> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDBInstanceId() {
        return this.dBInstanceId;
    }

    public void setDBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public String getEngineVersion() {
        return this.engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
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

    public List<ParameterChangeLog> getItems() {
        return this.items;
    }

    public void setItems(List<ParameterChangeLog> items) {
        this.items = items;
    }

    public static class ParameterChangeLog {

        private String modifyTime;

        private String oldParameterValue;

        private String newParameterValue;

        private String parameterName;

        private Status status;

        public String getModifyTime() {
            return this.modifyTime;
        }

        public void setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public void setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
        }

        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public void setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
        }

        public String getParameterName() {
            return this.parameterName;
        }

        public void setParameterName(String parameterName) {
            this.parameterName = parameterName;
        }

        public Status getStatus() {
            return this.status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public enum Status {

            APPLIED("Applied"),
            SYNCING("Syncing"),;

            private String stringValue;

            Status(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static Status getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (Status status : Status.values()) {
                    if (status.getStringValue().equals(stringValue)) {
                        return status;
                    }
                }
                return null;
            }
        }
    }

    @Override
    public DescribeModifyParameterLogResponse getInstance(UnmarshallerContext context) {
        return DescribeModifyParameterLogResponseUnmarshaller.unmarshall(this, context);
    }
}
