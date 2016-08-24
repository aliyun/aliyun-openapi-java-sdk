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
import com.aliyuncs.rds.transform.v20140815.DescribeTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeTasksResponse extends AcsResponse {

    private String requestId;

    private Integer totalRecordCount;

    private Integer pageNumber;

    private Integer pageRecordCount;

    private List<TaskProgressInfo> items;

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

    public List<TaskProgressInfo> getItems() {
        return this.items;
    }

    public void setItems(List<TaskProgressInfo> items) {
        this.items = items;
    }

    public static class TaskProgressInfo {

        private String dBName;

        private String beginTime;

        private String progressInfo;

        private String finishTime;

        private String taskAction;

        private String taskId;

        private String progress;

        private String expectedFinishTime;

        private Status status;

        private String taskErrorCode;

        private String taskErrorMessage;

        public String getDBName() {
            return this.dBName;
        }

        public void setDBName(String dBName) {
            this.dBName = dBName;
        }

        public String getBeginTime() {
            return this.beginTime;
        }

        public void setBeginTime(String beginTime) {
            this.beginTime = beginTime;
        }

        public String getProgressInfo() {
            return this.progressInfo;
        }

        public void setProgressInfo(String progressInfo) {
            this.progressInfo = progressInfo;
        }

        public String getFinishTime() {
            return this.finishTime;
        }

        public void setFinishTime(String finishTime) {
            this.finishTime = finishTime;
        }

        public String getTaskAction() {
            return this.taskAction;
        }

        public void setTaskAction(String taskAction) {
            this.taskAction = taskAction;
        }

        public String getTaskId() {
            return this.taskId;
        }

        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public String getProgress() {
            return this.progress;
        }

        public void setProgress(String progress) {
            this.progress = progress;
        }

        public String getExpectedFinishTime() {
            return this.expectedFinishTime;
        }

        public void setExpectedFinishTime(String expectedFinishTime) {
            this.expectedFinishTime = expectedFinishTime;
        }

        public Status getStatus() {
            return this.status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public String getTaskErrorCode() {
            return this.taskErrorCode;
        }

        public void setTaskErrorCode(String taskErrorCode) {
            this.taskErrorCode = taskErrorCode;
        }

        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public void setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
        }

        public enum Status {

            PROCESSING("Processing"),
            NO_START("NoStart"),
            FAILED("Failed"),
            SUCCESS("Success"),
            PENDING("Pending"),;

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
    public DescribeTasksResponse getInstance(UnmarshallerContext context) {
        return DescribeTasksResponseUnmarshaller.unmarshall(this, context);
    }
}
