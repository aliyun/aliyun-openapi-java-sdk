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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeAutoSnapshotPoliciesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotPoliciesResponseUnmarshaller {

	public static DescribeAutoSnapshotPoliciesResponse unmarshall(DescribeAutoSnapshotPoliciesResponse describeAutoSnapshotPoliciesResponse, UnmarshallerContext _ctx) {
		
		describeAutoSnapshotPoliciesResponse.setRequestId(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.RequestId"));
		describeAutoSnapshotPoliciesResponse.setTotalCount(_ctx.integerValue("DescribeAutoSnapshotPoliciesResponse.TotalCount"));
		describeAutoSnapshotPoliciesResponse.setPageSize(_ctx.integerValue("DescribeAutoSnapshotPoliciesResponse.PageSize"));
		describeAutoSnapshotPoliciesResponse.setPageNumber(_ctx.integerValue("DescribeAutoSnapshotPoliciesResponse.PageNumber"));

		List<AutoSnapshotPolicy> autoSnapshotPolicies = new ArrayList<AutoSnapshotPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies.Length"); i++) {
			AutoSnapshotPolicy autoSnapshotPolicy = new AutoSnapshotPolicy();
			autoSnapshotPolicy.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyId"));
			autoSnapshotPolicy.setAutoSnapshotPolicyName(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyName"));
			autoSnapshotPolicy.setCreateTime(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].CreateTime"));
			autoSnapshotPolicy.setFileSystemNums(_ctx.integerValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].FileSystemNums"));
			autoSnapshotPolicy.setRegionId(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].RegionId"));
			autoSnapshotPolicy.setRepeatWeekdays(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].RepeatWeekdays"));
			autoSnapshotPolicy.setRetentionDays(_ctx.integerValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].RetentionDays"));
			autoSnapshotPolicy.setStatus(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].Status"));
			autoSnapshotPolicy.setTimePoints(_ctx.stringValue("DescribeAutoSnapshotPoliciesResponse.AutoSnapshotPolicies["+ i +"].TimePoints"));

			autoSnapshotPolicies.add(autoSnapshotPolicy);
		}
		describeAutoSnapshotPoliciesResponse.setAutoSnapshotPolicies(autoSnapshotPolicies);
	 
	 	return describeAutoSnapshotPoliciesResponse;
	}
}