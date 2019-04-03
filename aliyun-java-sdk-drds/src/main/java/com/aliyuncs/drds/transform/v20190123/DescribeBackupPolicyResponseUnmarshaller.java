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

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext context) {
		
		describeBackupPolicyResponse.setRequestId(context.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setSuccess(context.booleanValue("DescribeBackupPolicyResponse.Success"));

		BackupPolicyDO backupPolicyDO = new BackupPolicyDO();
		backupPolicyDO.setGmtCreate(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.GmtCreate"));
		backupPolicyDO.setGmtModified(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.GmtModified"));
		backupPolicyDO.setBackupPolicyMode(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupPolicyMode"));
		backupPolicyDO.setBackupType(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupType"));
		backupPolicyDO.setBackupLevel(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupLevel"));
		backupPolicyDO.setBackupDbName(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupDbName"));
		backupPolicyDO.setPreferredBackupTime(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.PreferredBackupTime"));
		backupPolicyDO.setPreferredBackupPeriod(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.PreferredBackupPeriod"));
		backupPolicyDO.setDataBackupRetentionPeriod(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.DataBackupRetentionPeriod"));
		backupPolicyDO.setLogBackupRetentionPeriod(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.LogBackupRetentionPeriod"));
		backupPolicyDO.setBackupRetentionPeriod(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupRetentionPeriod"));
		backupPolicyDO.setBackupLog(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupLog"));
		backupPolicyDO.setLocalLogRetentionHours(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.LocalLogRetentionHours"));
		backupPolicyDO.setLocalLogRetentionSpace(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.LocalLogRetentionSpace"));
		backupPolicyDO.setHighSpaceUsageProtection(context.longValue("DescribeBackupPolicyResponse.BackupPolicyDO.HighSpaceUsageProtection"));
		backupPolicyDO.setBackupAppName(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupAppName"));
		backupPolicyDO.setBackupMode(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.BackupMode"));
		backupPolicyDO.setNextBackupActuallyTime(context.stringValue("DescribeBackupPolicyResponse.BackupPolicyDO.NextBackupActuallyTime"));
		describeBackupPolicyResponse.setBackupPolicyDO(backupPolicyDO);
	 
	 	return describeBackupPolicyResponse;
	}
}