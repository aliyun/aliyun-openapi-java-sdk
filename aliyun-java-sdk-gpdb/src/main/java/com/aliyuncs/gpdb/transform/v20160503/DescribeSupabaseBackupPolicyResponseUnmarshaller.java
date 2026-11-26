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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeSupabaseBackupPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSupabaseBackupPolicyResponseUnmarshaller {

	public static DescribeSupabaseBackupPolicyResponse unmarshall(DescribeSupabaseBackupPolicyResponse describeSupabaseBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeSupabaseBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeSupabaseBackupPolicyResponse.RequestId"));
		describeSupabaseBackupPolicyResponse.setPreferredBackupPeriod(_ctx.stringValue("DescribeSupabaseBackupPolicyResponse.PreferredBackupPeriod"));
		describeSupabaseBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeSupabaseBackupPolicyResponse.PreferredBackupTime"));
		describeSupabaseBackupPolicyResponse.setBackupRetentionPeriod(_ctx.integerValue("DescribeSupabaseBackupPolicyResponse.BackupRetentionPeriod"));
		describeSupabaseBackupPolicyResponse.setEnableRecoveryPoint(_ctx.booleanValue("DescribeSupabaseBackupPolicyResponse.EnableRecoveryPoint"));
		describeSupabaseBackupPolicyResponse.setRecoveryPointPeriod(_ctx.stringValue("DescribeSupabaseBackupPolicyResponse.RecoveryPointPeriod"));
		describeSupabaseBackupPolicyResponse.setBackupInterval(_ctx.integerValue("DescribeSupabaseBackupPolicyResponse.BackupInterval"));
	 
	 	return describeSupabaseBackupPolicyResponse;
	}
}