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

import com.aliyuncs.rds.model.v20140815.DescribeBackupsForSecurityResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBackupsForSecurityResponse.Backup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsForSecurityResponseUnmarshaller {

	public static DescribeBackupsForSecurityResponse unmarshall(DescribeBackupsForSecurityResponse describeBackupsForSecurityResponse, UnmarshallerContext context) {
		
		describeBackupsForSecurityResponse.setRequestId(context.stringValue("DescribeBackupsForSecurityResponse.RequestId"));
		describeBackupsForSecurityResponse.setTotalRecordCount(context.stringValue("DescribeBackupsForSecurityResponse.TotalRecordCount"));
		describeBackupsForSecurityResponse.setPageNumber(context.stringValue("DescribeBackupsForSecurityResponse.PageNumber"));
		describeBackupsForSecurityResponse.setPageRecordCount(context.stringValue("DescribeBackupsForSecurityResponse.PageRecordCount"));
		describeBackupsForSecurityResponse.setTotalBackupSize(context.longValue("DescribeBackupsForSecurityResponse.TotalBackupSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < context.lengthValue("DescribeBackupsForSecurityResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupId"));
			backup.setDBInstanceId(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].DBInstanceId"));
			backup.setBackupStatus(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupStatus"));
			backup.setBackupStartTime(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupEndTime"));
			backup.setBackupType(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupType"));
			backup.setBackupMode(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupMode"));
			backup.setBackupMethod(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupMethod"));
			backup.setBackupDownloadURL(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupDownloadURL"));
			backup.setBackupIntranetDownloadURL(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupIntranetDownloadURL"));
			backup.setBackupLocation(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupLocation"));
			backup.setBackupExtractionStatus(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupExtractionStatus"));
			backup.setBackupScale(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupScale"));
			backup.setBackupDBNames(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupDBNames"));
			backup.setTotalBackupSize(context.longValue("DescribeBackupsForSecurityResponse.Items["+ i +"].TotalBackupSize"));
			backup.setBackupSize(context.longValue("DescribeBackupsForSecurityResponse.Items["+ i +"].BackupSize"));
			backup.setHostInstanceID(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].HostInstanceID"));
			backup.setStoreStatus(context.stringValue("DescribeBackupsForSecurityResponse.Items["+ i +"].StoreStatus"));

			items.add(backup);
		}
		describeBackupsForSecurityResponse.setItems(items);
	 
	 	return describeBackupsForSecurityResponse;
	}
}