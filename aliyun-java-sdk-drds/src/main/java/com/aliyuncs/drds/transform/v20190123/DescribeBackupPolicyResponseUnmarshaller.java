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

import com.aliyuncs.drds.model.v20190123.DescribeBackupPolicyResponse;
import com.aliyuncs.drds.model.v20190123.DescribeBackupPolicyResponse.BackupPolicyDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setSuccess(_ctx.booleanValue("DescribeBackupPolicyResponse.Success"));

		BackupPolicyDO backupPolicyDO = new BackupPolicyDO();
		backupPolicyDO.setGmtCreate(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.GmtCreate"));
		backupPolicyDO.setGmtModified(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.GmtModified"));
		backupPolicyDO.setBackupPolicyMode(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupPolicyMode"));
		backupPolicyDO.setBackupType(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupType"));
		backupPolicyDO.setBackupLevel(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupLevel"));
		backupPolicyDO.setBackupDbName(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupDbName"));
		backupPolicyDO.setPreferredBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.PreferredBackupTime"));
		backupPolicyDO.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.PreferredBackupPeriod"));
		backupPolicyDO.setDataBackupRetentionPeriod(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.DataBackupRetentionPeriod"));
		backupPolicyDO.setLogBackupRetentionPeriod(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.LogBackupRetentionPeriod"));
		backupPolicyDO.setBackupRetentionPeriod(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupRetentionPeriod"));
		backupPolicyDO.setBackupLog(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupLog"));
		backupPolicyDO.setLocalLogRetentionHours(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.LocalLogRetentionHours"));
		backupPolicyDO.setLocalLogRetentionSpace(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.LocalLogRetentionSpace"));
		backupPolicyDO.setHighSpaceUsageProtection(_ctx.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.HighSpaceUsageProtection"));
		backupPolicyDO.setBackupAppName(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupAppName"));
		backupPolicyDO.setBackupMode(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupMode"));
		backupPolicyDO.setNextBackupActuallyTime(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.NextBackupActuallyTime"));
		describeBackupPolicyResponse.setBackupPolicyDO(backupPolicyDO);
	 
	 	return describeBackupPolicyResponse;
	}
}