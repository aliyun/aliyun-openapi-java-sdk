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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListBackupJobsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListBackupJobsResponse.BackupJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBackupJobsResponseUnmarshaller {

	public static ListBackupJobsResponse unmarshall(ListBackupJobsResponse listBackupJobsResponse, UnmarshallerContext _ctx) {
		
		listBackupJobsResponse.setRequestId(_ctx.stringValue("ListBackupJobsResponse.RequestId"));

		List<BackupJob> items = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("ListBackupJobsResponse.Items.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setBackupJobId(_ctx.stringValue("ListBackupJobsResponse.Items["+ i +"].BackupJobId"));
			backupJob.setBackupMode(_ctx.stringValue("ListBackupJobsResponse.Items["+ i +"].BackupMode"));
			backupJob.setBackupStatus(_ctx.stringValue("ListBackupJobsResponse.Items["+ i +"].BackupStatus"));
			backupJob.setProcess(_ctx.stringValue("ListBackupJobsResponse.Items["+ i +"].Process"));
			backupJob.setStartTime(_ctx.stringValue("ListBackupJobsResponse.Items["+ i +"].StartTime"));

			items.add(backupJob);
		}
		listBackupJobsResponse.setItems(items);
	 
	 	return listBackupJobsResponse;
	}
}