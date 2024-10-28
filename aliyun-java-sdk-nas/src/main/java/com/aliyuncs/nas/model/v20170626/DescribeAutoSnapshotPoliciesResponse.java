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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeAutoSnapshotPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoSnapshotPoliciesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<AutoSnapshotPolicy> autoSnapshotPolicies;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<AutoSnapshotPolicy> getAutoSnapshotPolicies() {
		return this.autoSnapshotPolicies;
	}

	public void setAutoSnapshotPolicies(List<AutoSnapshotPolicy> autoSnapshotPolicies) {
		this.autoSnapshotPolicies = autoSnapshotPolicies;
	}

	public static class AutoSnapshotPolicy {

		private String timePoints;

		private String status;

		private String repeatWeekdays;

		private String autoSnapshotPolicyName;

		private String createTime;

		private String autoSnapshotPolicyId;

		private Integer retentionDays;

		private Integer fileSystemNums;

		private String regionId;

		private String fileSystemType;

		public String getTimePoints() {
			return this.timePoints;
		}

		public void setTimePoints(String timePoints) {
			this.timePoints = timePoints;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public Integer getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(Integer retentionDays) {
			this.retentionDays = retentionDays;
		}

		public Integer getFileSystemNums() {
			return this.fileSystemNums;
		}

		public void setFileSystemNums(Integer fileSystemNums) {
			this.fileSystemNums = fileSystemNums;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getFileSystemType() {
			return this.fileSystemType;
		}

		public void setFileSystemType(String fileSystemType) {
			this.fileSystemType = fileSystemType;
		}
	}

	@Override
	public DescribeAutoSnapshotPoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoSnapshotPoliciesResponseUnmarshaller.unmarshall(this, context);
	}
}
