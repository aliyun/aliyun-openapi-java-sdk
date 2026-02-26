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

import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyAssociationsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyAssociationsResponse.AutoSnapshotPolicyAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotPolicyAssociationsResponseUnmarshaller {

	public static DescribeAutoSnapshotPolicyAssociationsResponse unmarshall(DescribeAutoSnapshotPolicyAssociationsResponse describeAutoSnapshotPolicyAssociationsResponse, UnmarshallerContext _ctx) {
		
		describeAutoSnapshotPolicyAssociationsResponse.setRequestId(_ctx.stringValue("DescribeAutoSnapshotPolicyAssociationsResponse.RequestId"));
		describeAutoSnapshotPolicyAssociationsResponse.setNextToken(_ctx.stringValue("DescribeAutoSnapshotPolicyAssociationsResponse.NextToken"));

		List<AutoSnapshotPolicyAssociation> autoSnapshotPolicyAssociations = new ArrayList<AutoSnapshotPolicyAssociation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoSnapshotPolicyAssociationsResponse.AutoSnapshotPolicyAssociations.Length"); i++) {
			AutoSnapshotPolicyAssociation autoSnapshotPolicyAssociation = new AutoSnapshotPolicyAssociation();
			autoSnapshotPolicyAssociation.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeAutoSnapshotPolicyAssociationsResponse.AutoSnapshotPolicyAssociations["+ i +"].AutoSnapshotPolicyId"));
			autoSnapshotPolicyAssociation.setDiskId(_ctx.stringValue("DescribeAutoSnapshotPolicyAssociationsResponse.AutoSnapshotPolicyAssociations["+ i +"].DiskId"));

			autoSnapshotPolicyAssociations.add(autoSnapshotPolicyAssociation);
		}
		describeAutoSnapshotPolicyAssociationsResponse.setAutoSnapshotPolicyAssociations(autoSnapshotPolicyAssociations);
	 
	 	return describeAutoSnapshotPolicyAssociationsResponse;
	}
}