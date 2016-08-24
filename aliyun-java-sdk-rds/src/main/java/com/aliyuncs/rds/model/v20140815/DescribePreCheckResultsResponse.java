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
import com.aliyuncs.rds.transform.v20140815.DescribePreCheckResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribePreCheckResultsResponse extends AcsResponse {

    private String requestId;

    private String dBInstanceId;

    private List<PreCheckResult> items;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDBInstanceId() {
        return this.dBInstanceId;
    }

    public void setDBInstanceId(String dBInstanceId) {
        this.dBInstanceId = dBInstanceId;
    }

    public List<PreCheckResult> getItems() {
        return this.items;
    }

    public void setItems(List<PreCheckResult> items) {
        this.items = items;
    }

    public static class PreCheckResult {

        private String preCheckName;

        private String preCheckResult;

        private String failReasion;

        private String repairMethod;

        public String getPreCheckName() {
            return this.preCheckName;
        }

        public void setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
        }

        public String getPreCheckResult() {
            return this.preCheckResult;
        }

        public void setPreCheckResult(String preCheckResult) {
            this.preCheckResult = preCheckResult;
        }

        public String getFailReasion() {
            return this.failReasion;
        }

        public void setFailReasion(String failReasion) {
            this.failReasion = failReasion;
        }

        public String getRepairMethod() {
            return this.repairMethod;
        }

        public void setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
        }
    }

    @Override
    public DescribePreCheckResultsResponse getInstance(UnmarshallerContext context) {
        return DescribePreCheckResultsResponseUnmarshaller.unmarshall(this, context);
    }
}
