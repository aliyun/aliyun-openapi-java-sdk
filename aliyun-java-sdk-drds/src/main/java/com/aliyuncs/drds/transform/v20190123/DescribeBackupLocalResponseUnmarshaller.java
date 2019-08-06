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

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.DescribeBackupLocalResponse;
import com.aliyuncs.drds.model.v20190123.DescribeBackupLocalResponse.BackupPolicyDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupLocalResponseUnmarshaller {

	public static DescribeBackupLocalResponse unmarshall(DescribeBackupLocalResponse describeBackupLocalResponse, UnmarshallerContext _ctx) {
		
		describeBackupLocalResponse.setRequestId(_ctx.stringValue("DescribeBackupLocalResponse.RequestId"));
		describeBackupLocalResponse.setSuccess(_ctx.booleanValue("DescribeBackupLocalResponse.Success"));

		BackupPolicyDO backupPolicyDO = new BackupPolicyDO();
		backupPolicyDO.setGmtCreate(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.GmtCreate"));
		backupPolicyDO.setGmtModified(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.GmtModified"));
		backupPolicyDO.setBackupPolicyMode(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupPolicyMode"));
		backupPolicyDO.setBackupType(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupType"));
		backupPolicyDO.setBackupLevel(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupLevel"));
		backupPolicyDO.setBackupDbName(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupDbName"));
		backupPolicyDO.setPreferredBackupTime(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.PreferredBackupTime"));
		backupPolicyDO.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.PreferredBackupPeriod"));
		backupPolicyDO.setDataBackupRetentionPeriod(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.DataBackupRetentionPeriod"));
		backupPolicyDO.setLogBackupRetentionPeriod(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.LogBackupRetentionPeriod"));
		backupPolicyDO.setBackupRetentionPeriod(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupRetentionPeriod"));
		backupPolicyDO.setBackupLog(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupLog"));
		backupPolicyDO.setLocalLogRetentionHours(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.LocalLogRetentionHours"));
		backupPolicyDO.setLocalLogRetentionSpace(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.LocalLogRetentionSpace"));
		backupPolicyDO.setHighSpaceUsageProtection(_ctx.longValue("DescribeBackupLocalResponse.BackupPolicyDO.HighSpaceUsageProtection"));
		backupPolicyDO.setBackupAppName(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupAppName"));
		backupPolicyDO.setBackupMode(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupMode"));
		backupPolicyDO.setNextBackupActuallyTime(_ctx.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.NextBackupActuallyTime"));
		describeBackupLocalResponse.setBackupPolicyDO(backupPolicyDO);
	 
	 	return describeBackupLocalResponse;
	}
}