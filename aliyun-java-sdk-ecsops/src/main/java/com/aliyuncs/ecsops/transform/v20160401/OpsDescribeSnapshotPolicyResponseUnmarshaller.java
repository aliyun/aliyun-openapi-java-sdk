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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotPolicyResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSnapshotPolicyResponse.SnapshotPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSnapshotPolicyResponseUnmarshaller {

	public static OpsDescribeSnapshotPolicyResponse unmarshall(OpsDescribeSnapshotPolicyResponse opsDescribeSnapshotPolicyResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSnapshotPolicyResponse.setRequestId(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.RequestId"));
		opsDescribeSnapshotPolicyResponse.setTotalCount(_ctx.integerValue("OpsDescribeSnapshotPolicyResponse.TotalCount"));
		opsDescribeSnapshotPolicyResponse.setPageSize(_ctx.integerValue("OpsDescribeSnapshotPolicyResponse.PageSize"));
		opsDescribeSnapshotPolicyResponse.setPageNumber(_ctx.integerValue("OpsDescribeSnapshotPolicyResponse.PageNumber"));

		List<SnapshotPolicy> snapshotPolicys = new ArrayList<SnapshotPolicy>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys.Length"); i++) {
			SnapshotPolicy snapshotPolicy = new SnapshotPolicy();
			snapshotPolicy.setStatus(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].Status"));
			snapshotPolicy.setCreationTime(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].CreationTime"));
			snapshotPolicy.setDiskNums(_ctx.integerValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].DiskNums"));
			snapshotPolicy.setTimePoints(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].TimePoints"));
			snapshotPolicy.setSnapshotPolicyId(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].SnapshotPolicyId"));
			snapshotPolicy.setRepeatWeekdays(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].RepeatWeekdays"));
			snapshotPolicy.setAutoSnapshotPolicyName(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].AutoSnapshotPolicyName"));
			snapshotPolicy.setRetentionDays(_ctx.integerValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].RetentionDays"));
			snapshotPolicy.setVolumeNums(_ctx.integerValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].VolumeNums"));
			snapshotPolicy.setRegionId(_ctx.stringValue("OpsDescribeSnapshotPolicyResponse.SnapshotPolicys["+ i +"].RegionId"));

			snapshotPolicys.add(snapshotPolicy);
		}
		opsDescribeSnapshotPolicyResponse.setSnapshotPolicys(snapshotPolicys);
	 
	 	return opsDescribeSnapshotPolicyResponse;
	}
}