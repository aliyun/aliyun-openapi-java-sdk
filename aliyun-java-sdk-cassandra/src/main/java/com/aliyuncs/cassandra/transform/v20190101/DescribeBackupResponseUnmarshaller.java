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

package com.aliyuncs.cassandra.transform.v20190101;

import com.aliyuncs.cassandra.model.v20190101.DescribeBackupResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeBackupResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupResponseUnmarshaller {

	public static DescribeBackupResponse unmarshall(DescribeBackupResponse describeBackupResponse, UnmarshallerContext _ctx) {
		
		describeBackupResponse.setRequestId(_ctx.stringValue("DescribeBackupResponse.RequestId"));

		Backup backup = new Backup();
		backup.setClusterId(_ctx.stringValue("DescribeBackupResponse.Backup.ClusterId"));
		backup.setDataCenterId(_ctx.stringValue("DescribeBackupResponse.Backup.DataCenterId"));
		backup.setBackupId(_ctx.stringValue("DescribeBackupResponse.Backup.BackupId"));
		backup.setBackupType(_ctx.stringValue("DescribeBackupResponse.Backup.BackupType"));
		backup.setStatus(_ctx.stringValue("DescribeBackupResponse.Backup.Status"));
		backup.setStartTime(_ctx.stringValue("DescribeBackupResponse.Backup.StartTime"));
		backup.setEndTime(_ctx.stringValue("DescribeBackupResponse.Backup.EndTime"));
		backup.setSize(_ctx.longValue("DescribeBackupResponse.Backup.Size"));
		backup.setDetails(_ctx.stringValue("DescribeBackupResponse.Backup.Details"));
		describeBackupResponse.setBackup(backup);
	 
	 	return describeBackupResponse;
	}
}