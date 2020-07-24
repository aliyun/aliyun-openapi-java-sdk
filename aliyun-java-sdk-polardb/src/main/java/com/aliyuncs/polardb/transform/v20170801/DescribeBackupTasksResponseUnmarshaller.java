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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeBackupTasksResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeBackupTasksResponse.BackupJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupTasksResponseUnmarshaller {

	public static DescribeBackupTasksResponse unmarshall(DescribeBackupTasksResponse describeBackupTasksResponse, UnmarshallerContext _ctx) {
		
		describeBackupTasksResponse.setRequestId(_ctx.stringValue("DescribeBackupTasksResponse.RequestId"));

		List<BackupJob> items = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupTasksResponse.Items.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setBackupJobId(_ctx.stringValue("DescribeBackupTasksResponse.Items["+ i +"].BackupJobId"));
			backupJob.setBackupProgressStatus(_ctx.stringValue("DescribeBackupTasksResponse.Items["+ i +"].BackupProgressStatus"));
			backupJob.setJobMode(_ctx.stringValue("DescribeBackupTasksResponse.Items["+ i +"].JobMode"));
			backupJob.setStartTime(_ctx.stringValue("DescribeBackupTasksResponse.Items["+ i +"].StartTime"));
			backupJob.setProcess(_ctx.stringValue("DescribeBackupTasksResponse.Items["+ i +"].Process"));
			backupJob.setTaskAction(_ctx.stringValue("DescribeBackupTasksResponse.Items["+ i +"].TaskAction"));

			items.add(backupJob);
		}
		describeBackupTasksResponse.setItems(items);
	 
	 	return describeBackupTasksResponse;
	}
}