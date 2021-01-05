/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeBackupTasksResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeBackupTasksResponse.BackupJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupTasksResponseUnmarshaller {

	public static DescribeBackupTasksResponse unmarshall(DescribeBackupTasksResponse describeBackupTasksResponse, UnmarshallerContext _ctx) {
		
		describeBackupTasksResponse.setRequestId(_ctx.stringValue("DescribeBackupTasksResponse.RequestId"));
		describeBackupTasksResponse.setInstanceId(_ctx.stringValue("DescribeBackupTasksResponse.InstanceId"));

		List<BackupJob> backupJobs = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupTasksResponse.BackupJobs.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setBackupJobID(_ctx.integerValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].BackupJobID"));
			backupJob.setBackupProgressStatus(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].BackupProgressStatus"));
			backupJob.setJobMode(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].JobMode"));
			backupJob.setProcess(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].Process"));
			backupJob.setStartTime(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].StartTime"));
			backupJob.setTaskAction(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].TaskAction"));

			backupJobs.add(backupJob);
		}
		describeBackupTasksResponse.setBackupJobs(backupJobs);
	 
	 	return describeBackupTasksResponse;
	}
}