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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeAutoSnapshotPolicyResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotPolicyResponseUnmarshaller {

	public static DescribeAutoSnapshotPolicyResponse unmarshall(DescribeAutoSnapshotPolicyResponse describeAutoSnapshotPolicyResponse, UnmarshallerContext _ctx) {
		
		describeAutoSnapshotPolicyResponse.setRequestId(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.RequestId"));
		describeAutoSnapshotPolicyResponse.setNextToken(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.NextToken"));

		List<AutoSnapshotPolicy> autoSnapshotPolicies = new ArrayList<AutoSnapshotPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies.Length"); i++) {
			AutoSnapshotPolicy autoSnapshotPolicy = new AutoSnapshotPolicy();
			autoSnapshotPolicy.setTimePoints(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].TimePoints"));
			autoSnapshotPolicy.setCreationTime(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].CreationTime"));
			autoSnapshotPolicy.setStatus(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].Status"));
			autoSnapshotPolicy.setDesktopNum(_ctx.integerValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].DesktopNum"));
			autoSnapshotPolicy.setCronExpression(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].CronExpression"));
			autoSnapshotPolicy.setRetentionDays(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].RetentionDays"));
			autoSnapshotPolicy.setPolicyName(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].PolicyName"));
			autoSnapshotPolicy.setPolicyId(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].PolicyId"));
			autoSnapshotPolicy.setRegionId(_ctx.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicies["+ i +"].RegionId"));

			autoSnapshotPolicies.add(autoSnapshotPolicy);
		}
		describeAutoSnapshotPolicyResponse.setAutoSnapshotPolicies(autoSnapshotPolicies);
	 
	 	return describeAutoSnapshotPolicyResponse;
	}
}