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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicy;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicy.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotPolicyExResponseUnmarshaller {

	public static DescribeAutoSnapshotPolicyExResponse unmarshall(DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExResponse, UnmarshallerContext _ctx) {
		
		describeAutoSnapshotPolicyExResponse.setRequestId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.RequestId"));
		describeAutoSnapshotPolicyExResponse.setPageSize(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.PageSize"));
		describeAutoSnapshotPolicyExResponse.setPageNumber(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.PageNumber"));
		describeAutoSnapshotPolicyExResponse.setTotalCount(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.TotalCount"));

		List<AutoSnapshotPolicy> autoSnapshotPolicies = new ArrayList<AutoSnapshotPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies.Length"); i++) {
			AutoSnapshotPolicy autoSnapshotPolicy = new AutoSnapshotPolicy();
			autoSnapshotPolicy.setTimePoints(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TimePoints"));
			autoSnapshotPolicy.setCreationTime(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].CreationTime"));
			autoSnapshotPolicy.setStatus(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Status"));
			autoSnapshotPolicy.setAutoSnapshotPolicyName(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyName"));
			autoSnapshotPolicy.setTargetCopyRegions(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TargetCopyRegions"));
			autoSnapshotPolicy.setCopiedSnapshotsRetentionDays(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].CopiedSnapshotsRetentionDays"));
			autoSnapshotPolicy.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyId"));
			autoSnapshotPolicy.setRetentionDays(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RetentionDays"));
			autoSnapshotPolicy.setRegionId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RegionId"));
			autoSnapshotPolicy.setDiskNums(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].DiskNums"));
			autoSnapshotPolicy.setEnableCrossRegionCopy(_ctx.booleanValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].EnableCrossRegionCopy"));
			autoSnapshotPolicy.setRepeatWeekdays(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RepeatWeekdays"));
			autoSnapshotPolicy.setVolumeNums(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].VolumeNums"));
			autoSnapshotPolicy.setResourceGroupId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			autoSnapshotPolicy.setTags(tags);

			autoSnapshotPolicies.add(autoSnapshotPolicy);
		}
		describeAutoSnapshotPolicyExResponse.setAutoSnapshotPolicies(autoSnapshotPolicies);
	 
	 	return describeAutoSnapshotPolicyExResponse;
	}
}