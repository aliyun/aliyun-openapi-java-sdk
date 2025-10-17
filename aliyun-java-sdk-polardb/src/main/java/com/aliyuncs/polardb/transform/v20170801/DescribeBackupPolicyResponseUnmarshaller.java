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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeBackupPolicyResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeBackupPolicyResponse.AdvancedDataPolicy;
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
		describeBackupPolicyResponse.setDataLevel2BackupAnotherRegionRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel2BackupAnotherRegionRetentionPeriod"));
		describeBackupPolicyResponse.setDataLevel2BackupAnotherRegionRegion(_ctx.stringValue("DescribeBackupPolicyResponse.DataLevel2BackupAnotherRegionRegion"));
		describeBackupPolicyResponse.setBackupPolicyLevel(_ctx.stringValue("DescribeBackupPolicyResponse.BackupPolicyLevel"));
		describeBackupPolicyResponse.setAdvancedPolicyOption(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedPolicyOption"));

		List<AdvancedDataPolicy> advancedDataPolicies = new ArrayList<AdvancedDataPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPolicyResponse.AdvancedDataPolicies.Length"); i++) {
			AdvancedDataPolicy advancedDataPolicy = new AdvancedDataPolicy();
			advancedDataPolicy.setOnlyPreserveOneEachHour(_ctx.booleanValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].OnlyPreserveOneEachHour"));
			advancedDataPolicy.setRetentionValue(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].RetentionValue"));
			advancedDataPolicy.setBakType(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].BakType"));
			advancedDataPolicy.setFilterKey(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].FilterKey"));
			advancedDataPolicy.setFilterValue(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].FilterValue"));
			advancedDataPolicy.setDestType(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].DestType"));
			advancedDataPolicy.setFilterType(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].FilterType"));
			advancedDataPolicy.setSrcRegion(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].SrcRegion"));
			advancedDataPolicy.setAutoCreated(_ctx.booleanValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].AutoCreated"));
			advancedDataPolicy.setSrcType(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].SrcType"));
			advancedDataPolicy.setOnlyPreserveOneEachDay(_ctx.booleanValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].OnlyPreserveOneEachDay"));
			advancedDataPolicy.setDumpAction(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].DumpAction"));
			advancedDataPolicy.setPolicyId(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].PolicyId"));
			advancedDataPolicy.setDestRegion(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].DestRegion"));
			advancedDataPolicy.setRetentionType(_ctx.stringValue("DescribeBackupPolicyResponse.AdvancedDataPolicies["+ i +"].RetentionType"));

			advancedDataPolicies.add(advancedDataPolicy);
		}
		describeBackupPolicyResponse.setAdvancedDataPolicies(advancedDataPolicies);
	 
	 	return describeBackupPolicyResponse;
	}
}