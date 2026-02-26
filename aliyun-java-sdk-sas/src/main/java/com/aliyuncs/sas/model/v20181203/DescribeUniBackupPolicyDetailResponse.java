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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeUniBackupPolicyDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUniBackupPolicyDetailResponse extends AcsResponse {

	private String requestId;

	private UniBackupPolicyDTO uniBackupPolicyDTO;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UniBackupPolicyDTO getUniBackupPolicyDTO() {
		return this.uniBackupPolicyDTO;
	}

	public void setUniBackupPolicyDTO(UniBackupPolicyDTO uniBackupPolicyDTO) {
		this.uniBackupPolicyDTO = uniBackupPolicyDTO;
	}

	public static class UniBackupPolicyDTO {

		private String policyStatus;

		private String databaseType;

		private Integer uniBackUpCount;

		private String instanceName;

		private Integer retention;

		private Long speedLimiter;

		private String policyName;

		private String instanceId;

		private Long policyId;

		private String agentStatus;

		private String accountName;

		private FullPlan fullPlan;

		private IncPlan incPlan;

		public String getPolicyStatus() {
			return this.policyStatus;
		}

		public void setPolicyStatus(String policyStatus) {
			this.policyStatus = policyStatus;
		}

		public String getDatabaseType() {
			return this.databaseType;
		}

		public void setDatabaseType(String databaseType) {
			this.databaseType = databaseType;
		}

		public Integer getUniBackUpCount() {
			return this.uniBackUpCount;
		}

		public void setUniBackUpCount(Integer uniBackUpCount) {
			this.uniBackUpCount = uniBackUpCount;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getRetention() {
			return this.retention;
		}

		public void setRetention(Integer retention) {
			this.retention = retention;
		}

		public Long getSpeedLimiter() {
			return this.speedLimiter;
		}

		public void setSpeedLimiter(Long speedLimiter) {
			this.speedLimiter = speedLimiter;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(Long policyId) {
			this.policyId = policyId;
		}

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}

		public String getAccountName() {
			return this.accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public FullPlan getFullPlan() {
			return this.fullPlan;
		}

		public void setFullPlan(FullPlan fullPlan) {
			this.fullPlan = fullPlan;
		}

		public IncPlan getIncPlan() {
			return this.incPlan;
		}

		public void setIncPlan(IncPlan incPlan) {
			this.incPlan = incPlan;
		}

		public static class FullPlan {

			private String startTime;

			private String planType;

			private Integer interval;

			private List<String> days;

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getPlanType() {
				return this.planType;
			}

			public void setPlanType(String planType) {
				this.planType = planType;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public List<String> getDays() {
				return this.days;
			}

			public void setDays(List<String> days) {
				this.days = days;
			}
		}

		public static class IncPlan {

			private String startTime;

			private String planType;

			private Integer interval;

			private List<String> days1;

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getPlanType() {
				return this.planType;
			}

			public void setPlanType(String planType) {
				this.planType = planType;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public List<String> getDays1() {
				return this.days1;
			}

			public void setDays1(List<String> days1) {
				this.days1 = days1;
			}
		}
	}

	@Override
	public DescribeUniBackupPolicyDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeUniBackupPolicyDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
