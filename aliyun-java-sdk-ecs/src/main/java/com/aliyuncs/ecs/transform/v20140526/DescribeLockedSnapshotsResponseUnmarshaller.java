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

import com.aliyuncs.ecs.model.v20140526.DescribeLockedSnapshotsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeLockedSnapshotsResponse.LockedSnapshotInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLockedSnapshotsResponseUnmarshaller {

	public static DescribeLockedSnapshotsResponse unmarshall(DescribeLockedSnapshotsResponse describeLockedSnapshotsResponse, UnmarshallerContext _ctx) {
		
		describeLockedSnapshotsResponse.setRequestId(_ctx.stringValue("DescribeLockedSnapshotsResponse.RequestId"));
		describeLockedSnapshotsResponse.setNextToken(_ctx.stringValue("DescribeLockedSnapshotsResponse.NextToken"));

		List<LockedSnapshotInfo> lockedSnapshotsInfo = new ArrayList<LockedSnapshotInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo.Length"); i++) {
			LockedSnapshotInfo lockedSnapshotInfo = new LockedSnapshotInfo();
			lockedSnapshotInfo.setSnapshotId(_ctx.stringValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].SnapshotId"));
			lockedSnapshotInfo.setLockStatus(_ctx.stringValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].LockStatus"));
			lockedSnapshotInfo.setLockCreationTime(_ctx.stringValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].LockCreationTime"));
			lockedSnapshotInfo.setCoolOffPeriod(_ctx.integerValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].CoolOffPeriod"));
			lockedSnapshotInfo.setCoolOffPeriodExpiredTime(_ctx.stringValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].CoolOffPeriodExpiredTime"));
			lockedSnapshotInfo.setLockDuration(_ctx.integerValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].LockDuration"));
			lockedSnapshotInfo.setLockDurationStartTime(_ctx.stringValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].LockDurationStartTime"));
			lockedSnapshotInfo.setLockExpiredTime(_ctx.stringValue("DescribeLockedSnapshotsResponse.LockedSnapshotsInfo["+ i +"].LockExpiredTime"));

			lockedSnapshotsInfo.add(lockedSnapshotInfo);
		}
		describeLockedSnapshotsResponse.setLockedSnapshotsInfo(lockedSnapshotsInfo);
	 
	 	return describeLockedSnapshotsResponse;
	}
}