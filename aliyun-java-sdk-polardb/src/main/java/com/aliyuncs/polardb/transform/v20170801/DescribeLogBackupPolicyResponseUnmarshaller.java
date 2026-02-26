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

import com.aliyuncs.polardb.model.v20170801.DescribeLogBackupPolicyResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeLogBackupPolicyResponse.AdvancedLogPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogBackupPolicyResponseUnmarshaller {

	public static DescribeLogBackupPolicyResponse unmarshall(DescribeLogBackupPolicyResponse describeLogBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeLogBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeLogBackupPolicyResponse.RequestId"));
		describeLogBackupPolicyResponse.setLogBackupRetentionPeriod(_ctx.integerValue("DescribeLogBackupPolicyResponse.LogBackupRetentionPeriod"));
		describeLogBackupPolicyResponse.setLogBackupAnotherRegionRetentionPeriod(_ctx.stringValue("DescribeLogBackupPolicyResponse.LogBackupAnotherRegionRetentionPeriod"));
		describeLogBackupPolicyResponse.setLogBackupAnotherRegionRegion(_ctx.stringValue("DescribeLogBackupPolicyResponse.LogBackupAnotherRegionRegion"));
		describeLogBackupPolicyResponse.setEnableBackupLog(_ctx.integerValue("DescribeLogBackupPolicyResponse.EnableBackupLog"));

		List<AdvancedLogPolicy> advancedLogPolicies = new ArrayList<AdvancedLogPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies.Length"); i++) {
			AdvancedLogPolicy advancedLogPolicy = new AdvancedLogPolicy();
			advancedLogPolicy.setLogRetentionType(_ctx.stringValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].LogRetentionType"));
			advancedLogPolicy.setDestType(_ctx.stringValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].DestType"));
			advancedLogPolicy.setSrcRegion(_ctx.stringValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].SrcRegion"));
			advancedLogPolicy.setEnableLogBackup(_ctx.integerValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].EnableLogBackup"));
			advancedLogPolicy.setSrcType(_ctx.stringValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].SrcType"));
			advancedLogPolicy.setPolicyId(_ctx.stringValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].PolicyId"));
			advancedLogPolicy.setLogRetentionValue(_ctx.stringValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].LogRetentionValue"));
			advancedLogPolicy.setDestRegion(_ctx.stringValue("DescribeLogBackupPolicyResponse.AdvancedLogPolicies["+ i +"].DestRegion"));

			advancedLogPolicies.add(advancedLogPolicy);
		}
		describeLogBackupPolicyResponse.setAdvancedLogPolicies(advancedLogPolicies);
	 
	 	return describeLogBackupPolicyResponse;
	}
}