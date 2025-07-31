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

package com.aliyuncs.dds.transform.v20151201;

import com.aliyuncs.dds.model.v20151201.DescribeBackupPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupPeriod"));
		describeBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupTime"));
		describeBackupPolicyResponse.setBackupRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.BackupRetentionPeriod"));
		describeBackupPolicyResponse.setPreferredNextBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredNextBackupTime"));
		describeBackupPolicyResponse.setEnableBackupLog(_ctx.integerValue("DescribeBackupPolicyResponse.EnableBackupLog"));
		describeBackupPolicyResponse.setLogBackupRetentionPeriod(_ctx.integerValue("DescribeBackupPolicyResponse.LogBackupRetentionPeriod"));
		describeBackupPolicyResponse.setSnapshotBackupType(_ctx.stringValue("DescribeBackupPolicyResponse.SnapshotBackupType"));
		describeBackupPolicyResponse.setBackupInterval(_ctx.integerValue("DescribeBackupPolicyResponse.BackupInterval"));
		describeBackupPolicyResponse.setHighFrequencyBackupRetention(_ctx.stringValue("DescribeBackupPolicyResponse.HighFrequencyBackupRetention"));
		describeBackupPolicyResponse.setBackupRetentionPolicyOnClusterDeletion(_ctx.integerValue("DescribeBackupPolicyResponse.BackupRetentionPolicyOnClusterDeletion"));
		describeBackupPolicyResponse.setSrcRegion(_ctx.stringValue("DescribeBackupPolicyResponse.SrcRegion"));
		describeBackupPolicyResponse.setDestRegion(_ctx.stringValue("DescribeBackupPolicyResponse.DestRegion"));
		describeBackupPolicyResponse.setCrossRetentionType(_ctx.stringValue("DescribeBackupPolicyResponse.CrossRetentionType"));
		describeBackupPolicyResponse.setCrossRetentionValue(_ctx.integerValue("DescribeBackupPolicyResponse.CrossRetentionValue"));
		describeBackupPolicyResponse.setCrossBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.CrossBackupPeriod"));
		describeBackupPolicyResponse.setEnableCrossLogBackup(_ctx.integerValue("DescribeBackupPolicyResponse.EnableCrossLogBackup"));
		describeBackupPolicyResponse.setCrossLogRetentionType(_ctx.stringValue("DescribeBackupPolicyResponse.CrossLogRetentionType"));
		describeBackupPolicyResponse.setCrossLogRetentionValue(_ctx.integerValue("DescribeBackupPolicyResponse.CrossLogRetentionValue"));
		describeBackupPolicyResponse.setPreserveOneEachHour(_ctx.booleanValue("DescribeBackupPolicyResponse.PreserveOneEachHour"));
	 
	 	return describeBackupPolicyResponse;
	}
}