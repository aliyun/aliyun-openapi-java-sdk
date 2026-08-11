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
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicy.CopyEncryptionConfiguration;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicy.Tag;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicy.TargetTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotPolicyExResponseUnmarshaller {

	public static DescribeAutoSnapshotPolicyExResponse unmarshall(DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExResponse, UnmarshallerContext _ctx) {
		
		describeAutoSnapshotPolicyExResponse.setRequestId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.RequestId"));
		describeAutoSnapshotPolicyExResponse.setTotalCount(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.TotalCount"));
		describeAutoSnapshotPolicyExResponse.setPageSize(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.PageSize"));
		describeAutoSnapshotPolicyExResponse.setPageNumber(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.PageNumber"));

		List<AutoSnapshotPolicy> autoSnapshotPolicies = new ArrayList<AutoSnapshotPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies.Length"); i++) {
			AutoSnapshotPolicy autoSnapshotPolicy = new AutoSnapshotPolicy();
			autoSnapshotPolicy.setStatus(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Status"));
			autoSnapshotPolicy.setTimePoints(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TimePoints"));
			autoSnapshotPolicy.setVolumeNums(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].VolumeNums"));
			autoSnapshotPolicy.setResourceGroupId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].ResourceGroupId"));
			autoSnapshotPolicy.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyId"));
			autoSnapshotPolicy.setRetentionDays(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RetentionDays"));
			autoSnapshotPolicy.setRepeatWeekdays(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RepeatWeekdays"));
			autoSnapshotPolicy.setDiskNums(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].DiskNums"));
			autoSnapshotPolicy.setCopiedSnapshotsRetentionDays(_ctx.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].CopiedSnapshotsRetentionDays"));
			autoSnapshotPolicy.setType(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Type"));
			autoSnapshotPolicy.setTargetCopyRegions(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TargetCopyRegions"));
			autoSnapshotPolicy.setAssociationType(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].AssociationType"));
			autoSnapshotPolicy.setEnableCrossRegionCopy(_ctx.booleanValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].EnableCrossRegionCopy"));
			autoSnapshotPolicy.setCreationTime(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].CreationTime"));
			autoSnapshotPolicy.setRegionId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RegionId"));
			autoSnapshotPolicy.setAutoSnapshotPolicyName(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyName"));

			CopyEncryptionConfiguration copyEncryptionConfiguration = new CopyEncryptionConfiguration();
			copyEncryptionConfiguration.setKMSKeyId(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].CopyEncryptionConfiguration.KMSKeyId"));
			copyEncryptionConfiguration.setEncrypted(_ctx.booleanValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].CopyEncryptionConfiguration.Encrypted"));
			autoSnapshotPolicy.setCopyEncryptionConfiguration(copyEncryptionConfiguration);

			List<TargetTag> targetTags = new ArrayList<TargetTag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TargetTags.Length"); j++) {
				TargetTag targetTag = new TargetTag();
				targetTag.setTagKey(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TargetTags["+ j +"].TagKey"));
				targetTag.setTagValue(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TargetTags["+ j +"].TagValue"));

				targetTags.add(targetTag);
			}
			autoSnapshotPolicy.setTargetTags(targetTags);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			autoSnapshotPolicy.setTags(tags);

			autoSnapshotPolicies.add(autoSnapshotPolicy);
		}
		describeAutoSnapshotPolicyExResponse.setAutoSnapshotPolicies(autoSnapshotPolicies);
	 
	 	return describeAutoSnapshotPolicyExResponse;
	}
}