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
import com.aliyuncs.ecs.transform.v20140526.DescribeAutoSnapshotPolicyExResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoSnapshotPolicyExResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<AutoSnapshotPolicy> autoSnapshotPolicies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<AutoSnapshotPolicy> getAutoSnapshotPolicies() {
		return this.autoSnapshotPolicies;
	}

	public void setAutoSnapshotPolicies(List<AutoSnapshotPolicy> autoSnapshotPolicies) {
		this.autoSnapshotPolicies = autoSnapshotPolicies;
	}

	public static class AutoSnapshotPolicy {

		private String autoSnapshotPolicyId;

		private String regionId;

		private String autoSnapshotPolicyName;

		private String timePoints;

		private String repeatWeekdays;

		private Integer retentionDays;

		private Integer diskNums;

		private Integer volumeNums;

		private String creationTime;

		private String status;

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getAutoSnapshotPolicyName() {
			return this.autoSnapshotPolicyName;
		}

		public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
			this.autoSnapshotPolicyName = autoSnapshotPolicyName;
		}

		public String getTimePoints() {
			return this.timePoints;
		}

		public void setTimePoints(String timePoints) {
			this.timePoints = timePoints;
		}

		public String getRepeatWeekdays() {
			return this.repeatWeekdays;
		}

		public void setRepeatWeekdays(String repeatWeekdays) {
			this.repeatWeekdays = repeatWeekdays;
		}

		public Integer getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Integer retentionDays) {
			this.retentionDays = retentionDays;
		}

		public Integer getDiskNums() {
			return this.diskNums;
		}

		public void setDiskNums(Integer diskNums) {
			this.diskNums = diskNums;
		}

		public Integer getVolumeNums() {
			return this.volumeNums;
		}

		public void setVolumeNums(Integer volumeNums) {
			this.volumeNums = volumeNums;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeAutoSnapshotPolicyExResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoSnapshotPolicyExResponseUnmarshaller.unmarshall(this, context);
	}
}
