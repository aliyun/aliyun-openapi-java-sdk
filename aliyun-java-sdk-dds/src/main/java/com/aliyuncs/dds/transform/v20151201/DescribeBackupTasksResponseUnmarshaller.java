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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeBackupTasksResponse;
import com.aliyuncs.dds.model.v20151201.DescribeBackupTasksResponse.BackupTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupTasksResponseUnmarshaller {

	public static DescribeBackupTasksResponse unmarshall(DescribeBackupTasksResponse describeBackupTasksResponse, UnmarshallerContext _ctx) {
		
		describeBackupTasksResponse.setRequestId(_ctx.stringValue("DescribeBackupTasksResponse.RequestId"));

		List<BackupTask> backupJobs = new ArrayList<BackupTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupTasksResponse.BackupJobs.Length"); i++) {
			BackupTask backupTask = new BackupTask();
			backupTask.setBackupjobId(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].BackupjobId"));
			backupTask.setBackupSetStatus(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].BackupSetStatus"));
			backupTask.setBackupStartTime(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].BackupStartTime"));
			backupTask.setProgress(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].Progress"));
			backupTask.setJobMode(_ctx.stringValue("DescribeBackupTasksResponse.BackupJobs["+ i +"].JobMode"));

			backupJobs.add(backupTask);
		}
		describeBackupTasksResponse.setBackupJobs(backupJobs);
	 
	 	return describeBackupTasksResponse;
	}
}