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

	public static DescribeBackupLocalResponse unmarshall(DescribeBackupLocalResponse describeBackupLocalResponse, UnmarshallerContext context) {
		
		describeBackupLocalResponse.setRequestId(context.stringValue("DescribeBackupLocalResponse.RequestId"));
		describeBackupLocalResponse.setSuccess(context.booleanValue("DescribeBackupLocalResponse.Success"));

		BackupPolicyDO backupPolicyDO = new BackupPolicyDO();
		backupPolicyDO.setGmtCreate(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.GmtCreate"));
		backupPolicyDO.setGmtModified(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.GmtModified"));
		backupPolicyDO.setBackupPolicyMode(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupPolicyMode"));
		backupPolicyDO.setBackupType(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupType"));
		backupPolicyDO.setBackupLevel(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupLevel"));
		backupPolicyDO.setBackupDbName(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupDbName"));
		backupPolicyDO.setPreferredBackupTime(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.PreferredBackupTime"));
		backupPolicyDO.setPreferredBackupPeriod(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.PreferredBackupPeriod"));
		backupPolicyDO.setDataBackupRetentionPeriod(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.DataBackupRetentionPeriod"));
		backupPolicyDO.setLogBackupRetentionPeriod(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.LogBackupRetentionPeriod"));
		backupPolicyDO.setBackupRetentionPeriod(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupRetentionPeriod"));
		backupPolicyDO.setBackupLog(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupLog"));
		backupPolicyDO.setLocalLogRetentionHours(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.LocalLogRetentionHours"));
		backupPolicyDO.setLocalLogRetentionSpace(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.LocalLogRetentionSpace"));
		backupPolicyDO.setHighSpaceUsageProtection(context.longValue("DescribeBackupLocalResponse.BackupPolicyDO.HighSpaceUsageProtection"));
		backupPolicyDO.setBackupAppName(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupAppName"));
		backupPolicyDO.setBackupMode(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.BackupMode"));
		backupPolicyDO.setNextBackupActuallyTime(context.stringValue("DescribeBackupLocalResponse.BackupPolicyDO.NextBackupActuallyTime"));
		describeBackupLocalResponse.setBackupPolicyDO(backupPolicyDO);
	 
	 	return describeBackupLocalResponse;
	}
}