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
import com.aliyuncs.rds.transform.v20140815.DescribeBackupTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeBackupTasksResponse extends AcsResponse {

    private String requestId;

    private List<BackupJob> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<BackupJob> getItems() {
        return this.items;
    }

    public void setItems(List<BackupJob> items) {
        this.items = items;
    }

    public static class BackupJob {

        private String backupProgressStatus;

        private JobMode jobMode;

        private String process;

        private String taskAction;

        private String backupjobId;

        public String getBackupProgressStatus() {
            return this.backupProgressStatus;
        }

        public void setBackupProgressStatus(String backupProgressStatus) {
            this.backupProgressStatus = backupProgressStatus;
        }

        public JobMode getJobMode() {
            return this.jobMode;
        }

        public void setJobMode(JobMode jobMode) {
            this.jobMode = jobMode;
        }

        public String getProcess() {
            return this.process;
        }

        public void setProcess(String process) {
            this.process = process;
        }

        public String getTaskAction() {
            return this.taskAction;
        }

        public void setTaskAction(String taskAction) {
            this.taskAction = taskAction;
        }

        public String getBackupjobId() {
            return this.backupjobId;
        }

        public void setBackupjobId(String backupjobId) {
            this.backupjobId = backupjobId;
        }

        public enum JobMode {

            MANUAL("Manual"),
            AUTOMATED("Automated"),;

            private String stringValue;

            JobMode(String stringValue) {
                setStringValue(stringValue);
            }

            public String getStringValue() {
                return stringValue;
            }

            public void setStringValue(String stringValue) {
                this.stringValue = stringValue;
            }

            public static JobMode getEnum(String stringValue) {
                if (null == stringValue) {
                    return null;
                }

                for (JobMode jobMode : JobMode.values()) {
                    if (jobMode.getStringValue().equals(stringValue)) {
                        return jobMode;
                    }
                }
                return null;
            }
        }
    }

    @Override
    public DescribeBackupTasksResponse getInstance(UnmarshallerContext context) {
        return DescribeBackupTasksResponseUnmarshaller.unmarshall(this, context);
    }
}
