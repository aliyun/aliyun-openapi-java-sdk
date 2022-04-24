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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.DescribeBackupPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupPeriod"));
		describeBackupPolicyResponse.setDataLevel1BackupRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel1BackupRetentionPeriod"));
		describeBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupTime"));
		describeBackupPolicyResponse.setBackupRetentionPolicyOnClusterDeletion(_ctx.stringValue("DescribeBackupPolicyResponse.BackupRetentionPolicyOnClusterDeletion"));
		describeBackupPolicyResponse.setBackupRetentionPeriod(_ctx.integerValue("DescribeBackupPolicyResponse.BackupRetentionPeriod"));
		describeBackupPolicyResponse.setPreferredNextBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredNextBackupTime"));
		describeBackupPolicyResponse.setDataLevel2BackupRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel2BackupRetentionPeriod"));
		describeBackupPolicyResponse.setBackupFrequency(_ctx.stringValue("DescribeBackupPolicyResponse.BackupFrequency"));
		describeBackupPolicyResponse.setDataLevel1BackupFrequency(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel1BackupFrequency"));
		describeBackupPolicyResponse.setDataLevel1BackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel1BackupPeriod"));
		describeBackupPolicyResponse.setDataLevel1BackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel1BackupTime"));
		describeBackupPolicyResponse.setDataLevel2BackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel2BackupPeriod"));
	 
	 	return describeBackupPolicyResponse;
	}
}