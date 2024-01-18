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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterBackupListResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterBackupListResponse.ClusterBackup;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterBackupListResponse.ClusterBackup.Backup;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterBackupListResponse.ClusterBackup.Backup.ExtraInfo1;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeClusterBackupListResponse.ClusterBackup.ExtraInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterBackupListResponseUnmarshaller {

	public static DescribeClusterBackupListResponse unmarshall(DescribeClusterBackupListResponse describeClusterBackupListResponse, UnmarshallerContext _ctx) {
		
		describeClusterBackupListResponse.setRequestId(_ctx.stringValue("DescribeClusterBackupListResponse.RequestId"));
		describeClusterBackupListResponse.setMaxResults(_ctx.integerValue("DescribeClusterBackupListResponse.MaxResults"));
		describeClusterBackupListResponse.setPageNumber(_ctx.integerValue("DescribeClusterBackupListResponse.PageNumber"));
		describeClusterBackupListResponse.setPageSize(_ctx.integerValue("DescribeClusterBackupListResponse.PageSize"));

		List<ClusterBackup> clusterBackups = new ArrayList<ClusterBackup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterBackupListResponse.ClusterBackups.Length"); i++) {
			ClusterBackup clusterBackup = new ClusterBackup();
			clusterBackup.setIsAvail(_ctx.integerValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].IsAvail"));
			clusterBackup.setClusterBackupId(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ClusterBackupId"));
			clusterBackup.setClusterBackupStatus(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ClusterBackupStatus"));
			clusterBackup.setClusterBackupSize(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ClusterBackupSize"));
			clusterBackup.setClusterBackupStartTime(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ClusterBackupStartTime"));
			clusterBackup.setClusterBackupEndTime(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ClusterBackupEndTime"));
			clusterBackup.setClusterBackupMode(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ClusterBackupMode"));
			clusterBackup.setShardClassMemory(_ctx.integerValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ShardClassMemory"));
			clusterBackup.setProgress(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Progress"));

			ExtraInfo extraInfo = new ExtraInfo();
			extraInfo.setRegistryFromHistory(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].ExtraInfo.RegistryFromHistory"));
			clusterBackup.setExtraInfo(extraInfo);

			List<Backup> backups = new ArrayList<Backup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups.Length"); j++) {
				Backup backup = new Backup();
				backup.setBackupId(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupId"));
				backup.setInstanceName(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].InstanceName"));
				backup.setBackupDownloadURL(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupDownloadURL"));
				backup.setBackupIntranetDownloadURL(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupIntranetDownloadURL"));
				backup.setBackupStartTime(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupStartTime"));
				backup.setBackupEndTime(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupEndTime"));
				backup.setBackupSize(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupSize"));
				backup.setIsAvail(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].IsAvail"));
				backup.setBackupStatus(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupStatus"));
				backup.setBackupName(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].BackupName"));
				backup.setEngine(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].Engine"));

				ExtraInfo1 extraInfo1 = new ExtraInfo1();
				extraInfo1.setCustinsLevelId(_ctx.integerValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.CustinsLevelId"));
				extraInfo1.setCustinsDbVersion(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.CustinsDbVersion"));
				extraInfo1.setCustinsName(_ctx.stringValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.CustinsName"));
				extraInfo1.setCustinsId(_ctx.integerValue("DescribeClusterBackupListResponse.ClusterBackups["+ i +"].Backups["+ j +"].ExtraInfo.CustinsId"));
				backup.setExtraInfo1(extraInfo1);

				backups.add(backup);
			}
			clusterBackup.setBackups(backups);

			clusterBackups.add(clusterBackup);
		}
		describeClusterBackupListResponse.setClusterBackups(clusterBackups);
	 
	 	return describeClusterBackupListResponse;
	}
}