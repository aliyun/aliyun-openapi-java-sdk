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

import com.aliyuncs.dds.model.v20151201.DescribeBackupsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsResponseUnmarshaller {

	public static DescribeBackupsResponse unmarshall(DescribeBackupsResponse describeBackupsResponse, UnmarshallerContext _ctx) {
		
		describeBackupsResponse.setRequestId(_ctx.stringValue("DescribeBackupsResponse.RequestId"));
		describeBackupsResponse.setPageNumber(_ctx.integerValue("DescribeBackupsResponse.PageNumber"));
		describeBackupsResponse.setPageSize(_ctx.integerValue("DescribeBackupsResponse.PageSize"));
		describeBackupsResponse.setTotalCount(_ctx.integerValue("DescribeBackupsResponse.TotalCount"));

		List<Backup> backups = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupsResponse.Backups.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupDBNames(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupDBNames"));
			backup.setBackupId(_ctx.integerValue("DescribeBackupsResponse.Backups["+ i +"].BackupId"));
			backup.setBackupStatus(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupStatus"));
			backup.setBackupStartTime(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupEndTime"));
			backup.setBackupType(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupType"));
			backup.setBackupMode(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupMode"));
			backup.setBackupMethod(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupMethod"));
			backup.setBackupDownloadURL(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupDownloadURL"));
			backup.setBackupIntranetDownloadURL(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupIntranetDownloadURL"));
			backup.setBackupSize(_ctx.longValue("DescribeBackupsResponse.Backups["+ i +"].BackupSize"));

			backups.add(backup);
		}
		describeBackupsResponse.setBackups(backups);
	 
	 	return describeBackupsResponse;
	}
}