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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeLockedSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLockedSnapshotsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<LockedSnapshotInfo> lockedSnapshotsInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<LockedSnapshotInfo> getLockedSnapshotsInfo() {
		return this.lockedSnapshotsInfo;
	}

	public void setLockedSnapshotsInfo(List<LockedSnapshotInfo> lockedSnapshotsInfo) {
		this.lockedSnapshotsInfo = lockedSnapshotsInfo;
	}

	public static class LockedSnapshotInfo {

		private String snapshotId;

		private String lockStatus;

		private String lockCreationTime;

		private Integer coolOffPeriod;

		private String coolOffPeriodExpiredTime;

		private Integer lockDuration;

		private String lockDurationStartTime;

		private String lockExpiredTime;

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getLockStatus() {
			return this.lockStatus;
		}

		public void setLockStatus(String lockStatus) {
			this.lockStatus = lockStatus;
		}

		public String getLockCreationTime() {
			return this.lockCreationTime;
		}

		public void setLockCreationTime(String lockCreationTime) {
			this.lockCreationTime = lockCreationTime;
		}

		public Integer getCoolOffPeriod() {
			return this.coolOffPeriod;
		}

		public void setCoolOffPeriod(Integer coolOffPeriod) {
			this.coolOffPeriod = coolOffPeriod;
		}

		public String getCoolOffPeriodExpiredTime() {
			return this.coolOffPeriodExpiredTime;
		}

		public void setCoolOffPeriodExpiredTime(String coolOffPeriodExpiredTime) {
			this.coolOffPeriodExpiredTime = coolOffPeriodExpiredTime;
		}

		public Integer getLockDuration() {
			return this.lockDuration;
		}

		public void setLockDuration(Integer lockDuration) {
			this.lockDuration = lockDuration;
		}

		public String getLockDurationStartTime() {
			return this.lockDurationStartTime;
		}

		public void setLockDurationStartTime(String lockDurationStartTime) {
			this.lockDurationStartTime = lockDurationStartTime;
		}

		public String getLockExpiredTime() {
			return this.lockExpiredTime;
		}

		public void setLockExpiredTime(String lockExpiredTime) {
			this.lockExpiredTime = lockExpiredTime;
		}
	}

	@Override
	public DescribeLockedSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLockedSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
