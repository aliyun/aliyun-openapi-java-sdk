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
package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeBackupTasksResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBackupTasksResponse.BackupJob;
import com.aliyuncs.rds.model.v20140815.DescribeBackupTasksResponse.BackupJob.JobMode;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeBackupTasksResponseUnmarshaller {

    public static DescribeBackupTasksResponse unmarshall(
            DescribeBackupTasksResponse describeBackupTasksResponse, UnmarshallerContext context) {

        describeBackupTasksResponse
                .setRequestId(context.stringValue("DescribeBackupTasksResponse.RequestId"));

        List<BackupJob> items = new ArrayList<BackupJob>();
        for (int i = 0; i < context.lengthValue("DescribeBackupTasksResponse.Items.Length"); i++) {
            BackupJob backupJob = new BackupJob();
            backupJob.setBackupProgressStatus(context.stringValue(
                    "DescribeBackupTasksResponse.Items[" + i + "].BackupProgressStatus"));
            backupJob.setJobMode(JobMode.getEnum(
                    context.stringValue("DescribeBackupTasksResponse.Items[" + i + "].JobMode")));
            backupJob.setProcess(
                    context.stringValue("DescribeBackupTasksResponse.Items[" + i + "].Process"));
            backupJob.setTaskAction(
                    context.stringValue("DescribeBackupTasksResponse.Items[" + i + "].TaskAction"));
            backupJob.setBackupjobId(context.stringValue(
                    "DescribeBackupTasksResponse.Items[" + i + "].BackupjobId"));

            items.add(backupJob);
        }
        describeBackupTasksResponse.setItems(items);

        return describeBackupTasksResponse;
    }
}
