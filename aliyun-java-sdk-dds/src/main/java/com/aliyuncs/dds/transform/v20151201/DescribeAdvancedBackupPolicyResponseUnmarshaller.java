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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeAdvancedBackupPolicyResponse;
import com.aliyuncs.dds.model.v20151201.DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicy;
import com.aliyuncs.dds.model.v20151201.DescribeAdvancedBackupPolicyResponse.AdvancedBackupPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAdvancedBackupPolicyResponseUnmarshaller {

	public static DescribeAdvancedBackupPolicyResponse unmarshall(DescribeAdvancedBackupPolicyResponse describeAdvancedBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeAdvancedBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.RequestId"));
		describeAdvancedBackupPolicyResponse.setDBInstanceId(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.DBInstanceId"));
		describeAdvancedBackupPolicyResponse.setSnapshotBackupType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.SnapshotBackupType"));
		describeAdvancedBackupPolicyResponse.setBackupRetentionPolicyOnClusterDeletion(_ctx.integerValue("DescribeAdvancedBackupPolicyResponse.BackupRetentionPolicyOnClusterDeletion"));
		describeAdvancedBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.PreferredBackupTime"));
		describeAdvancedBackupPolicyResponse.setBackupTamperProofEnabled(_ctx.booleanValue("DescribeAdvancedBackupPolicyResponse.BackupTamperProofEnabled"));
		describeAdvancedBackupPolicyResponse.setPreferredNextBackupTime(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.PreferredNextBackupTime"));

		List<AdvancedBackupPolicy> advancedBackupDataPolicies = new ArrayList<AdvancedBackupPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies.Length"); i++) {
			AdvancedBackupPolicy advancedBackupPolicy = new AdvancedBackupPolicy();
			advancedBackupPolicy.setDestType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].DestType"));
			advancedBackupPolicy.setPreferredBackupPeriod(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].PreferredBackupPeriod"));
			advancedBackupPolicy.setActionType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].ActionType"));
			advancedBackupPolicy.setSrcRegion(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].SrcRegion"));
			advancedBackupPolicy.setPreserveOneEachHour(_ctx.booleanValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].PreserveOneEachHour"));
			advancedBackupPolicy.setSrcType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].SrcType"));
			advancedBackupPolicy.setRetentionPeriod(_ctx.integerValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].RetentionPeriod"));
			advancedBackupPolicy.setDestRegion(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].DestRegion"));
			advancedBackupPolicy.setPolicyId(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].PolicyId"));
			advancedBackupPolicy.setBackupPolicy(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].BackupPolicy"));
			advancedBackupPolicy.setRetentionType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupDataPolicies["+ i +"].RetentionType"));

			advancedBackupDataPolicies.add(advancedBackupPolicy);
		}
		describeAdvancedBackupPolicyResponse.setAdvancedBackupDataPolicies(advancedBackupDataPolicies);

		List<AdvancedBackupLogPolicy> advancedBackupLogPolicies = new ArrayList<AdvancedBackupLogPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies.Length"); i++) {
			AdvancedBackupLogPolicy advancedBackupLogPolicy = new AdvancedBackupLogPolicy();
			advancedBackupLogPolicy.setDestType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].DestType"));
			advancedBackupLogPolicy.setSrcRegion(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].SrcRegion"));
			advancedBackupLogPolicy.setEnableLogBackup(_ctx.integerValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].EnableLogBackup"));
			advancedBackupLogPolicy.setSrcType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].SrcType"));
			advancedBackupLogPolicy.setRetentionPeriod(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].RetentionPeriod"));
			advancedBackupLogPolicy.setDestRegion(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].DestRegion"));
			advancedBackupLogPolicy.setPolicyId(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].PolicyId"));
			advancedBackupLogPolicy.setRetentionType(_ctx.stringValue("DescribeAdvancedBackupPolicyResponse.AdvancedBackupLogPolicies["+ i +"].RetentionType"));

			advancedBackupLogPolicies.add(advancedBackupLogPolicy);
		}
		describeAdvancedBackupPolicyResponse.setAdvancedBackupLogPolicies(advancedBackupLogPolicies);
	 
	 	return describeAdvancedBackupPolicyResponse;
	}
}