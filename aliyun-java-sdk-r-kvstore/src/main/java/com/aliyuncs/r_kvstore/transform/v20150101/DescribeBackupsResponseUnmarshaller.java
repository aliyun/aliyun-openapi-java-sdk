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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeBackupsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeBackupsResponse.AccessDeniedDetail;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupsResponseUnmarshaller {

	public static DescribeBackupsResponse unmarshall(DescribeBackupsResponse describeBackupsResponse, UnmarshallerContext _ctx) {
		
		describeBackupsResponse.setRequestId(_ctx.stringValue("DescribeBackupsResponse.RequestId"));
		describeBackupsResponse.setPageNumber(_ctx.integerValue("DescribeBackupsResponse.PageNumber"));
		describeBackupsResponse.setPageSize(_ctx.integerValue("DescribeBackupsResponse.PageSize"));
		describeBackupsResponse.setTotalCount(_ctx.integerValue("DescribeBackupsResponse.TotalCount"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setAuthAction(_ctx.stringValue("DescribeBackupsResponse.AccessDeniedDetail.AuthAction"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("DescribeBackupsResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("DescribeBackupsResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("DescribeBackupsResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("DescribeBackupsResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("DescribeBackupsResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setPolicyType(_ctx.stringValue("DescribeBackupsResponse.AccessDeniedDetail.PolicyType"));
		describeBackupsResponse.setAccessDeniedDetail(accessDeniedDetail);

		List<Backup> backups = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupsResponse.Backups.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupStatus(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupStatus"));
			backup.setBackupStartTime(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupStartTime"));
			backup.setBackupType(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupType"));
			backup.setBackupDownloadURL(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupDownloadURL"));
			backup.setNodeInstanceId(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].NodeInstanceId"));
			backup.setBackupEndTime(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupEndTime"));
			backup.setBackupId(_ctx.integerValue("DescribeBackupsResponse.Backups["+ i +"].BackupId"));
			backup.setBackupDBNames(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupDBNames"));
			backup.setEngineVersion(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].EngineVersion"));
			backup.setBackupIntranetDownloadURL(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupIntranetDownloadURL"));
			backup.setBackupSize(_ctx.longValue("DescribeBackupsResponse.Backups["+ i +"].BackupSize"));
			backup.setBackupMode(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupMode"));
			backup.setBackupMethod(_ctx.stringValue("DescribeBackupsResponse.Backups["+ i +"].BackupMethod"));
			backup.setBackupJobID(_ctx.integerValue("DescribeBackupsResponse.Backups["+ i +"].BackupJobID"));

			backups.add(backup);
		}
		describeBackupsResponse.setBackups(backups);
	 
	 	return describeBackupsResponse;
	}
}