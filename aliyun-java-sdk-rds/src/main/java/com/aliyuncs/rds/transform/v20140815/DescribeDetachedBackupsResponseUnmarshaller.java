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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDetachedBackupsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDetachedBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDetachedBackupsResponseUnmarshaller {

	public static DescribeDetachedBackupsResponse unmarshall(DescribeDetachedBackupsResponse describeDetachedBackupsResponse, UnmarshallerContext _ctx) {
		
		describeDetachedBackupsResponse.setRequestId(_ctx.stringValue("DescribeDetachedBackupsResponse.RequestId"));
		describeDetachedBackupsResponse.setTotalRecordCount(_ctx.stringValue("DescribeDetachedBackupsResponse.TotalRecordCount"));
		describeDetachedBackupsResponse.setPageNumber(_ctx.stringValue("DescribeDetachedBackupsResponse.PageNumber"));
		describeDetachedBackupsResponse.setPageRecordCount(_ctx.stringValue("DescribeDetachedBackupsResponse.PageRecordCount"));
		describeDetachedBackupsResponse.setTotalBackupSize(_ctx.longValue("DescribeDetachedBackupsResponse.TotalBackupSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDetachedBackupsResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupId"));
			backup.setDBInstanceId(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].DBInstanceId"));
			backup.setBackupStatus(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupStatus"));
			backup.setBackupStartTime(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupEndTime"));
			backup.setBackupType(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupType"));
			backup.setBackupMode(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupMode"));
			backup.setBackupMethod(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupMethod"));
			backup.setBackupDownloadURL(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupDownloadURL"));
			backup.setBackupIntranetDownloadURL(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupIntranetDownloadURL"));
			backup.setBackupLocation(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupLocation"));
			backup.setBackupExtractionStatus(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupExtractionStatus"));
			backup.setBackupScale(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupScale"));
			backup.setBackupDBNames(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupDBNames"));
			backup.setTotalBackupSize(_ctx.longValue("DescribeDetachedBackupsResponse.Items["+ i +"].TotalBackupSize"));
			backup.setBackupSize(_ctx.longValue("DescribeDetachedBackupsResponse.Items["+ i +"].BackupSize"));
			backup.setHostInstanceID(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].HostInstanceID"));
			backup.setStoreStatus(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].StoreStatus"));
			backup.setMetaStatus(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].MetaStatus"));
			backup.setSlaveStatus(_ctx.stringValue("DescribeDetachedBackupsResponse.Items["+ i +"].SlaveStatus"));
			backup.setConsistentTime(_ctx.longValue("DescribeDetachedBackupsResponse.Items["+ i +"].ConsistentTime"));

			items.add(backup);
		}
		describeDetachedBackupsResponse.setItems(items);
	 
	 	return describeDetachedBackupsResponse;
	}
}