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

import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsResponse.Backup.BackupDownloadLinkByDBItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsResponseUnmarshaller {

	public static DescribeBackupsResponse unmarshall(DescribeBackupsResponse describeBackupsResponse, UnmarshallerContext _ctx) {
		
		describeBackupsResponse.setRequestId(_ctx.stringValue("DescribeBackupsResponse.RequestId"));
		describeBackupsResponse.setPageNumber(_ctx.stringValue("DescribeBackupsResponse.PageNumber"));
		describeBackupsResponse.setPageRecordCount(_ctx.stringValue("DescribeBackupsResponse.PageRecordCount"));
		describeBackupsResponse.setTotalBackupSize(_ctx.longValue("DescribeBackupsResponse.TotalBackupSize"));
		describeBackupsResponse.setTotalEcsSnapshotSize(_ctx.longValue("DescribeBackupsResponse.TotalEcsSnapshotSize"));
		describeBackupsResponse.setTotalRecordCount(_ctx.stringValue("DescribeBackupsResponse.TotalRecordCount"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupsResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupDBNames(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupDBNames"));
			backup.setBackupDownloadURL(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupDownloadURL"));
			backup.setBackupEndTime(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupEndTime"));
			backup.setBackupExtractionStatus(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupExtractionStatus"));
			backup.setBackupId(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupId"));
			backup.setBackupInitiator(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupInitiator"));
			backup.setBackupIntranetDownloadURL(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupIntranetDownloadURL"));
			backup.setBackupLocation(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupLocation"));
			backup.setBackupMethod(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupMethod"));
			backup.setBackupMode(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupMode"));
			backup.setBackupScale(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupScale"));
			backup.setBackupSize(_ctx.longValue("DescribeBackupsResponse.Items["+ i +"].BackupSize"));
			backup.setBackupStartTime(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupStartTime"));
			backup.setBackupStatus(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupStatus"));
			backup.setBackupType(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupType"));
			backup.setChecksum(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].Checksum"));
			backup.setConsistentTime(_ctx.longValue("DescribeBackupsResponse.Items["+ i +"].ConsistentTime"));
			backup.setCopyOnlyBackup(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].CopyOnlyBackup"));
			backup.setDBInstanceId(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].DBInstanceId"));
			backup.setEncryption(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].Encryption"));
			backup.setEngine(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].Engine"));
			backup.setEngineVersion(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].EngineVersion"));
			backup.setHostInstanceID(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].HostInstanceID"));
			backup.setIsAvail(_ctx.integerValue("DescribeBackupsResponse.Items["+ i +"].IsAvail"));
			backup.setMetaStatus(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].MetaStatus"));
			backup.setResourceGroupId(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].ResourceGroupId"));
			backup.setSlaveStatus(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].SlaveStatus"));
			backup.setStorageClass(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].StorageClass"));
			backup.setStoreStatus(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].StoreStatus"));
			backup.setTotalBackupSize(_ctx.longValue("DescribeBackupsResponse.Items["+ i +"].TotalBackupSize"));
			backup.setExpectExpireTime(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].ExpectExpireTime"));

			List<BackupDownloadLinkByDBItem> backupDownloadLinkByDB = new ArrayList<BackupDownloadLinkByDBItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupsResponse.Items["+ i +"].BackupDownloadLinkByDB.Length"); j++) {
				BackupDownloadLinkByDBItem backupDownloadLinkByDBItem = new BackupDownloadLinkByDBItem();
				backupDownloadLinkByDBItem.setDataBase(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupDownloadLinkByDB["+ j +"].DataBase"));
				backupDownloadLinkByDBItem.setDownloadLink(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupDownloadLinkByDB["+ j +"].DownloadLink"));
				backupDownloadLinkByDBItem.setIntranetDownloadLink(_ctx.stringValue("DescribeBackupsResponse.Items["+ i +"].BackupDownloadLinkByDB["+ j +"].IntranetDownloadLink"));

				backupDownloadLinkByDB.add(backupDownloadLinkByDBItem);
			}
			backup.setBackupDownloadLinkByDB(backupDownloadLinkByDB);

			items.add(backup);
		}
		describeBackupsResponse.setItems(items);
	 
	 	return describeBackupsResponse;
	}
}