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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiskSnapshotPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDiskSnapshotPolicyResponseUnmarshaller {

	public static OpsDescribeDiskSnapshotPolicyResponse unmarshall(OpsDescribeDiskSnapshotPolicyResponse opsDescribeDiskSnapshotPolicyResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDiskSnapshotPolicyResponse.setRequestId(_ctx.stringValue("OpsDescribeDiskSnapshotPolicyResponse.RequestId"));
		opsDescribeDiskSnapshotPolicyResponse.setSnapshotPolicyId(_ctx.stringValue("OpsDescribeDiskSnapshotPolicyResponse.SnapshotPolicyId"));
		opsDescribeDiskSnapshotPolicyResponse.setRegionId(_ctx.stringValue("OpsDescribeDiskSnapshotPolicyResponse.RegionId"));
		opsDescribeDiskSnapshotPolicyResponse.setAutoSnapshotPolicyName(_ctx.stringValue("OpsDescribeDiskSnapshotPolicyResponse.AutoSnapshotPolicyName"));
		opsDescribeDiskSnapshotPolicyResponse.setTimePoints(_ctx.stringValue("OpsDescribeDiskSnapshotPolicyResponse.TimePoints"));
		opsDescribeDiskSnapshotPolicyResponse.setRepeatWeekdays(_ctx.stringValue("OpsDescribeDiskSnapshotPolicyResponse.RepeatWeekdays"));
		opsDescribeDiskSnapshotPolicyResponse.setRetentionDays(_ctx.integerValue("OpsDescribeDiskSnapshotPolicyResponse.RetentionDays"));
		opsDescribeDiskSnapshotPolicyResponse.setDiskNums(_ctx.integerValue("OpsDescribeDiskSnapshotPolicyResponse.DiskNums"));
		opsDescribeDiskSnapshotPolicyResponse.setCreationTime(_ctx.stringValue("OpsDescribeDiskSnapshotPolicyResponse.CreationTime"));
	 
	 	return opsDescribeDiskSnapshotPolicyResponse;
	}
}