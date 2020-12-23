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

package com.aliyuncs.hbase.transform.v20190101;

import com.aliyuncs.hbase.model.v20190101.DescribeBackupPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setBackupRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.BackupRetentionPeriod"));
		describeBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupTime"));
		describeBackupPolicyResponse.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupPeriod"));
		describeBackupPolicyResponse.setPreferredBackupStartTimeUTC(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupStartTimeUTC"));
		describeBackupPolicyResponse.setPreferredBackupEndTimeUTC(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupEndTimeUTC"));
	 
	 	return describeBackupPolicyResponse;
	}
}