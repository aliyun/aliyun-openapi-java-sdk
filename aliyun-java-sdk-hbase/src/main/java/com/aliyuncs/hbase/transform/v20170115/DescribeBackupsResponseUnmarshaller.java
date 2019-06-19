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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.DescribeBackupsResponse;
import com.aliyuncs.hbase.model.v20170115.DescribeBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsResponseUnmarshaller {

	public static DescribeBackupsResponse unmarshall(DescribeBackupsResponse describeBackupsResponse, UnmarshallerContext context) {
		
		describeBackupsResponse.setRequestId(context.stringValue("DescribeBackupsResponse.RequestId"));
		describeBackupsResponse.setEnableStatus(context.stringValue("DescribeBackupsResponse.EnableStatus"));
		describeBackupsResponse.setPageNumber(context.integerValue("DescribeBackupsResponse.PageNumber"));
		describeBackupsResponse.setPageSize(context.integerValue("DescribeBackupsResponse.PageSize"));
		describeBackupsResponse.setTotalCount(context.integerValue("DescribeBackupsResponse.TotalCount"));

		List<Backup> backups = new ArrayList<Backup>();
		for (int i = 0; i < context.lengthValue("DescribeBackupsResponse.Backups.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupDBNames(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupDBNames"));
			backup.setBackupId(context.integerValue("DescribeBackupsResponse.Backups["+ i +"].BackupId"));
			backup.setBackupStatus(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupStatus"));
			backup.setBackupStartTime(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupEndTime"));
			backup.setBackupType(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupType"));
			backup.setBackupMode(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupMode"));
			backup.setBackupMethod(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupMethod"));
			backup.setBackupDownloadURL(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupDownloadURL"));
			backup.setBackupSize(context.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupSize"));

			backups.add(backup);
		}
		describeBackupsResponse.setBackups(backups);
	 
	 	return describeBackupsResponse;
	}
}