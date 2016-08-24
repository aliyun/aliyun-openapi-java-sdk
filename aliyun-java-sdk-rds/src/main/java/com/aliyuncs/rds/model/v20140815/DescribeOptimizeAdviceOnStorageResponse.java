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
import com.aliyuncs.rds.transform.v20140815.DescribeOptimizeAdviceOnStorageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 */
public class DescribeOptimizeAdviceOnStorageResponse extends AcsResponse {

    private String requestId;

    private String dBInstanceId;

    private Integer totalRecordsCount;

    private Integer pageNumber;

    private Integer pageRecordCount;

    private List<AdviceOnStorage> items;

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

    public Integer getTotalRecordsCount() {
        return this.totalRecordsCount;
    }

    public void setTotalRecordsCount(Integer totalRecordsCount) {
        this.totalRecordsCount = totalRecordsCount;
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

    public List<AdviceOnStorage> getItems() {
        return this.items;
    }

    public void setItems(List<AdviceOnStorage> items) {
        this.items = items;
    }

    public static class AdviceOnStorage {

        private String dBName;

        private String tableName;

        private String currentEngine;

        private String adviseEngine;

        public String getDBName() {
            return this.dBName;
        }

        public void setDBName(String dBName) {
            this.dBName = dBName;
        }

        public String getTableName() {
            return this.tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        public String getCurrentEngine() {
            return this.currentEngine;
        }

        public void setCurrentEngine(String currentEngine) {
            this.currentEngine = currentEngine;
        }

        public String getAdviseEngine() {
            return this.adviseEngine;
        }

        public void setAdviseEngine(String adviseEngine) {
            this.adviseEngine = adviseEngine;
        }
    }

    @Override
    public DescribeOptimizeAdviceOnStorageResponse getInstance(UnmarshallerContext context) {
        return DescribeOptimizeAdviceOnStorageResponseUnmarshaller.unmarshall(this, context);
    }
}
