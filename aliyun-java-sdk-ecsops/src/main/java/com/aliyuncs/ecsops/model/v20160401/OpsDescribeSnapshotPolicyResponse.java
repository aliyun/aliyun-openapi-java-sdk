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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeSnapshotPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeSnapshotPolicyResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<SnapshotPolicy> snapshotPolicys;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<SnapshotPolicy> getSnapshotPolicys() {
		return this.snapshotPolicys;
	}

	public void setSnapshotPolicys(List<SnapshotPolicy> snapshotPolicys) {
		this.snapshotPolicys = snapshotPolicys;
	}

	public static class SnapshotPolicy {

		private String status;

		private String creationTime;

		private Integer diskNums;

		private String timePoints;

		private String snapshotPolicyId;

		private String repeatWeekdays;

		private String autoSnapshotPolicyName;

		private Integer retentionDays;

		private Integer volumeNums;

		private String regionId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getDiskNums() {
			return this.diskNums;
		}

		public void setDiskNums(Integer diskNums) {
			this.diskNums = diskNums;
		}

		public String getTimePoints() {
			return this.timePoints;
		}

		public void setTimePoints(String timePoints) {
			this.timePoints = timePoints;
		}

		public String getSnapshotPolicyId() {
			return this.snapshotPolicyId;
		}

		public void setSnapshotPolicyId(String snapshotPolicyId) {
			this.snapshotPolicyId = snapshotPolicyId;
		}

		public String getRepeatWeekdays() {
			return this.repeatWeekdays;
		}

		public void setRepeatWeekdays(String repeatWeekdays) {
			this.repeatWeekdays = repeatWeekdays;
		}

		public String getAutoSnapshotPolicyName() {
			return this.autoSnapshotPolicyName;
		}

		public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
			this.autoSnapshotPolicyName = autoSnapshotPolicyName;
		}

		public Integer getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Integer retentionDays) {
			this.retentionDays = retentionDays;
		}

		public Integer getVolumeNums() {
			return this.volumeNums;
		}

		public void setVolumeNums(Integer volumeNums) {
			this.volumeNums = volumeNums;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public OpsDescribeSnapshotPolicyResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeSnapshotPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
