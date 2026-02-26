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

import com.aliyuncs.ecs.model.v20140526.LockSnapshotResponse;
import com.aliyuncs.ecs.model.v20140526.LockSnapshotResponse.LockedSnapshotInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class LockSnapshotResponseUnmarshaller {

	public static LockSnapshotResponse unmarshall(LockSnapshotResponse lockSnapshotResponse, UnmarshallerContext _ctx) {
		
		lockSnapshotResponse.setRequestId(_ctx.stringValue("LockSnapshotResponse.RequestId"));

		LockedSnapshotInfo lockedSnapshotInfo = new LockedSnapshotInfo();
		lockedSnapshotInfo.setSnapshotId(_ctx.stringValue("LockSnapshotResponse.LockedSnapshotInfo.SnapshotId"));
		lockedSnapshotInfo.setLockStatus(_ctx.stringValue("LockSnapshotResponse.LockedSnapshotInfo.LockStatus"));
		lockedSnapshotInfo.setLockCreationTime(_ctx.stringValue("LockSnapshotResponse.LockedSnapshotInfo.LockCreationTime"));
		lockedSnapshotInfo.setCoolOffPeriod(_ctx.integerValue("LockSnapshotResponse.LockedSnapshotInfo.CoolOffPeriod"));
		lockedSnapshotInfo.setCoolOffPeriodExpiredTime(_ctx.stringValue("LockSnapshotResponse.LockedSnapshotInfo.CoolOffPeriodExpiredTime"));
		lockedSnapshotInfo.setLockDuration(_ctx.integerValue("LockSnapshotResponse.LockedSnapshotInfo.LockDuration"));
		lockedSnapshotInfo.setLockDurationStartTime(_ctx.stringValue("LockSnapshotResponse.LockedSnapshotInfo.LockDurationStartTime"));
		lockedSnapshotInfo.setLockExpiredTime(_ctx.stringValue("LockSnapshotResponse.LockedSnapshotInfo.LockExpiredTime"));
		lockSnapshotResponse.setLockedSnapshotInfo(lockedSnapshotInfo);
	 
	 	return lockSnapshotResponse;
	}
}