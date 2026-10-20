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
		describeBackupPolicyResponse.setHighFrequencyBackupRetention(_ctx.stringValue("DescribeBackupPolicyResponse.HighFrequencyBackupRetention"));
		describeBackupPolicyResponse.setBackupRetentionPolicyOnClusterDeletion(_ctx.integerValue("DescribeBackupPolicyResponse.BackupRetentionPolicyOnClusterDeletion"));
		describeBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupTime"));
		describeBackupPolicyResponse.setCrossBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.CrossBackupPeriod"));
		describeBackupPolicyResponse.setPreferredNextBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredNextBackupTime"));
		describeBackupPolicyResponse.setCrossLogRetentionType(_ctx.stringValue("DescribeBackupPolicyResponse.CrossLogRetentionType"));
		describeBackupPolicyResponse.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupPeriod"));
		describeBackupPolicyResponse.setCrossRetentionValue(_ctx.integerValue("DescribeBackupPolicyResponse.CrossRetentionValue"));
		describeBackupPolicyResponse.setLogBackupRetentionPeriod(_ctx.integerValue("DescribeBackupPolicyResponse.LogBackupRetentionPeriod"));
		describeBackupPolicyResponse.setCrossLogRetentionValue(_ctx.integerValue("DescribeBackupPolicyResponse.CrossLogRetentionValue"));
		describeBackupPolicyResponse.setCrossRetentionType(_ctx.stringValue("DescribeBackupPolicyResponse.CrossRetentionType"));
		describeBackupPolicyResponse.setSrcRegion(_ctx.stringValue("DescribeBackupPolicyResponse.SrcRegion"));
		describeBackupPolicyResponse.setEnableCrossLogBackup(_ctx.integerValue("DescribeBackupPolicyResponse.EnableCrossLogBackup"));
		describeBackupPolicyResponse.setPreserveOneEachHour(_ctx.booleanValue("DescribeBackupPolicyResponse.PreserveOneEachHour"));
		describeBackupPolicyResponse.setSnapshotBackupType(_ctx.stringValue("DescribeBackupPolicyResponse.SnapshotBackupType"));
		describeBackupPolicyResponse.setEnableBackupLog(_ctx.integerValue("DescribeBackupPolicyResponse.EnableBackupLog"));
		describeBackupPolicyResponse.setBackupRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.BackupRetentionPeriod"));
		describeBackupPolicyResponse.setBackupTamperProofEnabled(_ctx.booleanValue("DescribeBackupPolicyResponse.BackupTamperProofEnabled"));
		describeBackupPolicyResponse.setDestRegion(_ctx.stringValue("DescribeBackupPolicyResponse.DestRegion"));
		describeBackupPolicyResponse.setBackupInterval(_ctx.integerValue("DescribeBackupPolicyResponse.BackupInterval"));
	 
	 	return describeBackupPolicyResponse;
	}
}