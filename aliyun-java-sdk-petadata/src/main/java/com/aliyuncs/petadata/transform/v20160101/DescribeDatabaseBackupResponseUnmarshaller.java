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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeDatabaseBackupResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeDatabaseBackupResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseBackupResponseUnmarshaller {

	public static DescribeDatabaseBackupResponse unmarshall(DescribeDatabaseBackupResponse describeDatabaseBackupResponse, UnmarshallerContext context) {
		
		describeDatabaseBackupResponse.setRequestId(context.stringValue("DescribeDatabaseBackupResponse.RequestId"));
		describeDatabaseBackupResponse.setInstanceId(context.stringValue("DescribeDatabaseBackupResponse.InstanceId"));
		describeDatabaseBackupResponse.setDBName(context.stringValue("DescribeDatabaseBackupResponse.DBName"));
		describeDatabaseBackupResponse.setPageNumber(context.integerValue("DescribeDatabaseBackupResponse.PageNumber"));
		describeDatabaseBackupResponse.setPageRecordCount(context.integerValue("DescribeDatabaseBackupResponse.PageRecordCount"));
		describeDatabaseBackupResponse.setTotalRecordCount(context.integerValue("DescribeDatabaseBackupResponse.TotalRecordCount"));
		describeDatabaseBackupResponse.setBackupTotalSize(context.longValue("DescribeDatabaseBackupResponse.BackupTotalSize"));

		List<Backup> backupItems = new ArrayList<Backup>();
		for (int i = 0; i < context.lengthValue("DescribeDatabaseBackupResponse.BackupItems.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(context.integerValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupId"));
			backup.setBackupStatus(context.stringValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupStatus"));
			backup.setBackupStartTime(context.stringValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(context.stringValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupEndTime"));
			backup.setBackupMode(context.stringValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupMode"));
			backup.setBackupDownloadURL(context.stringValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupDownloadURL"));
			backup.setBackupSize(context.longValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupSize"));
			backup.setBackupNodeNumber(context.integerValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupNodeNumber"));
			backup.setBackupNodeClass(context.stringValue("DescribeDatabaseBackupResponse.BackupItems["+ i +"].BackupNodeClass"));

			backupItems.add(backup);
		}
		describeDatabaseBackupResponse.setBackupItems(backupItems);
	 
	 	return describeDatabaseBackupResponse;
	}
}