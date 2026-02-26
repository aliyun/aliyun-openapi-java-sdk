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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeAutoSnapshotPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoSnapshotPolicyResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<AutoSnapshotPolicy> autoSnapshotPolicies;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AutoSnapshotPolicy> getAutoSnapshotPolicies() {
		return this.autoSnapshotPolicies;
	}

	public void setAutoSnapshotPolicies(List<AutoSnapshotPolicy> autoSnapshotPolicies) {
		this.autoSnapshotPolicies = autoSnapshotPolicies;
	}

	public static class AutoSnapshotPolicy {

		private String timePoints;

		private String creationTime;

		private String status;

		private Integer desktopNum;

		private String cronExpression;

		private String retentionDays;

		private String policyName;

		private String policyId;

		private String regionId;

		public String getTimePoints() {
			return this.timePoints;
		}

		public void setTimePoints(String timePoints) {
			this.timePoints = timePoints;
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

		public Integer getDesktopNum() {
			return this.desktopNum;
		}

		public void setDesktopNum(Integer desktopNum) {
			this.desktopNum = desktopNum;
		}

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getRetentionDays() {
			return this.retentionDays;
		}

		public void setRetentionDays(String retentionDays) {
			this.retentionDays = retentionDays;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeAutoSnapshotPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoSnapshotPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
