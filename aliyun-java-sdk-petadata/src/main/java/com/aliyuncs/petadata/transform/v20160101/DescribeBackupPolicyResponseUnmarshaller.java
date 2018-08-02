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

package com.aliyuncs.petadata.transform.v20160101;

import com.aliyuncs.petadata.model.v20160101.DescribeBackupPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext context) {
		
		describeBackupPolicyResponse.setRequestId(context.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setInstanceId(context.stringValue("DescribeBackupPolicyResponse.InstanceId"));
		describeBackupPolicyResponse.setDBName(context.stringValue("DescribeBackupPolicyResponse.DBName"));
		describeBackupPolicyResponse.setPreferredBackupPeriod(context.stringValue("DescribeBackupPolicyResponse.PreferredBackupPeriod"));
		describeBackupPolicyResponse.setPreferredBackupTime(context.stringValue("DescribeBackupPolicyResponse.PreferredBackupTime"));
		describeBackupPolicyResponse.setBackupRetentionPeriod(context.stringValue("DescribeBackupPolicyResponse.BackupRetentionPeriod"));
		describeBackupPolicyResponse.setEnableBinlogBackup(context.booleanValue("DescribeBackupPolicyResponse.EnableBinlogBackup"));
	 
	 	return describeBackupPolicyResponse;
	}
}