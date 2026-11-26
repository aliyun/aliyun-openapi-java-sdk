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

import com.aliyuncs.gpdb.model.v20160503.ListSupabaseBackupJobsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListSupabaseBackupJobsResponse.BackupJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSupabaseBackupJobsResponseUnmarshaller {

	public static ListSupabaseBackupJobsResponse unmarshall(ListSupabaseBackupJobsResponse listSupabaseBackupJobsResponse, UnmarshallerContext _ctx) {
		
		listSupabaseBackupJobsResponse.setRequestId(_ctx.stringValue("ListSupabaseBackupJobsResponse.RequestId"));
		listSupabaseBackupJobsResponse.setNextToken(_ctx.stringValue("ListSupabaseBackupJobsResponse.NextToken"));
		listSupabaseBackupJobsResponse.setMaxResults(_ctx.integerValue("ListSupabaseBackupJobsResponse.MaxResults"));

		List<BackupJob> items = new ArrayList<BackupJob>();
		for (int i = 0; i < _ctx.lengthValue("ListSupabaseBackupJobsResponse.Items.Length"); i++) {
			BackupJob backupJob = new BackupJob();
			backupJob.setBackupMode(_ctx.stringValue("ListSupabaseBackupJobsResponse.Items["+ i +"].BackupMode"));
			backupJob.setStartTime(_ctx.stringValue("ListSupabaseBackupJobsResponse.Items["+ i +"].StartTime"));
			backupJob.setProcess(_ctx.stringValue("ListSupabaseBackupJobsResponse.Items["+ i +"].Process"));
			backupJob.setBackupJobId(_ctx.stringValue("ListSupabaseBackupJobsResponse.Items["+ i +"].BackupJobId"));
			backupJob.setBackupStatus(_ctx.stringValue("ListSupabaseBackupJobsResponse.Items["+ i +"].BackupStatus"));

			items.add(backupJob);
		}
		listSupabaseBackupJobsResponse.setItems(items);
	 
	 	return listSupabaseBackupJobsResponse;
	}
}