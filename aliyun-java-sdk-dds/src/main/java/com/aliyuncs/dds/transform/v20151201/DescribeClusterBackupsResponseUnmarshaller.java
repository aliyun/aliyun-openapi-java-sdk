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

import com.aliyuncs.dds.model.v20151201.DescribeClusterBackupsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeClusterBackupsResponse.ClusterBackup;
import com.aliyuncs.dds.model.v20151201.DescribeClusterBackupsResponse.ClusterBackup.Backup;
import com.aliyuncs.dds.model.v20151201.DescribeClusterBackupsResponse.ClusterBackup.Backup.ExtraInfo1;
import com.aliyuncs.dds.model.v20151201.DescribeClusterBackupsResponse.ClusterBackup.ExtraInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterBackupsResponseUnmarshaller {

	public static DescribeClusterBackupsResponse unmarshall(DescribeClusterBackupsResponse describeClusterBackupsResponse, UnmarshallerContext _ctx) {
		
		describeClusterBackupsResponse.setRequestId(_ctx.stringValue("DescribeClusterBackupsResponse.RequestId"));
		describeClusterBackupsResponse.setMaxResults(_ctx.integerValue("DescribeClusterBackupsResponse.MaxResults"));
		describeClusterBackupsResponse.setPageNumber(_ctx.integerValue("DescribeClusterBackupsResponse.PageNumber"));
		describeClusterBackupsResponse.setPageSize(_ctx.integerValue("DescribeClusterBackupsResponse.PageSize"));

		List<ClusterBackup> clusterBackups = new ArrayList<ClusterBackup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterBackupsResponse.ClusterBackups.Length"); i++) {
			ClusterBackup clusterBackup = new ClusterBackup();
			clusterBackup.setIsAvail(_ctx.integerValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].IsAvail"));
			clusterBackup.setClusterBackupId(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].ClusterBackupId"));
			clusterBackup.setClusterBackupStatus(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].ClusterBackupStatus"));
			clusterBackup.setClusterBackupStartTime(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].ClusterBackupStartTime"));
			clusterBackup.setClusterBackupSize(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].ClusterBackupSize"));
			clusterBackup.setClusterBackupEndTime(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].ClusterBackupEndTime"));
			clusterBackup.setClusterBackupMode(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].ClusterBackupMode"));
			clusterBackup.setProgress(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Progress"));
			clusterBackup.setAttachLogStatus(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].AttachLogStatus"));
			clusterBackup.setEngineVersion(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].EngineVersion"));
			clusterBackup.setBackupExpireTime(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].BackupExpireTime"));

			ExtraInfo extraInfo = new ExtraInfo();
			extraInfo.setRegistryFromHistory(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].ExtraInfo.RegistryFromHistory"));
			clusterBackup.setExtraInfo(extraInfo);

			List<Backup> backups = new ArrayList<Backup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups.Length"); j++) {
				Backup backup = new Backup();
				backup.setBackupId(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupId"));
				backup.setInstanceName(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].InstanceName"));
				backup.setBackupDownloadURL(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupDownloadURL"));
				backup.setBackupIntranetDownloadURL(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupIntranetDownloadURL"));
				backup.setBackupStartTime(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupStartTime"));
				backup.setBackupEndTime(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupEndTime"));
				backup.setBackupSize(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupSize"));
				backup.setIsAvail(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].IsAvail"));
				backup.setBackupStatus(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupStatus"));
				backup.setBackupName(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupName"));

				ExtraInfo1 extraInfo1 = new ExtraInfo1();
				extraInfo1.setNodeId(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.NodeId"));
				extraInfo1.setStorageSize(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.StorageSize"));
				extraInfo1.setInstanceClass(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.InstanceClass"));
				extraInfo1.setNodeType(_ctx.stringValue("DescribeClusterBackupsResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.NodeType"));
				backup.setExtraInfo1(extraInfo1);

				backups.add(backup);
			}
			clusterBackup.setBackups(backups);

			clusterBackups.add(clusterBackup);
		}
		describeClusterBackupsResponse.setClusterBackups(clusterBackups);
	 
	 	return describeClusterBackupsResponse;
	}
}