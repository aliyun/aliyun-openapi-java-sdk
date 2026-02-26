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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeLogBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogBackupPolicyResponse extends AcsResponse {

	private Integer logBackupRetentionPeriod;

	private String requestId;

	private String logBackupAnotherRegionRetentionPeriod;

	private String logBackupAnotherRegionRegion;

	private Integer enableBackupLog;

	private List<AdvancedLogPolicy> advancedLogPolicies;

	public Integer getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogBackupAnotherRegionRetentionPeriod() {
		return this.logBackupAnotherRegionRetentionPeriod;
	}

	public void setLogBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
		this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
	}

	public String getLogBackupAnotherRegionRegion() {
		return this.logBackupAnotherRegionRegion;
	}

	public void setLogBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
		this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
	}

	public Integer getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(Integer enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
	}

	public List<AdvancedLogPolicy> getAdvancedLogPolicies() {
		return this.advancedLogPolicies;
	}

	public void setAdvancedLogPolicies(List<AdvancedLogPolicy> advancedLogPolicies) {
		this.advancedLogPolicies = advancedLogPolicies;
	}

	public static class AdvancedLogPolicy {

		private String logRetentionType;

		private String destType;

		private String srcRegion;

		private Integer enableLogBackup;

		private String srcType;

		private String policyId;

		private String logRetentionValue;

		private String destRegion;

		public String getLogRetentionType() {
			return this.logRetentionType;
		}

		public void setLogRetentionType(String logRetentionType) {
			this.logRetentionType = logRetentionType;
		}

		public String getDestType() {
			return this.destType;
		}

		public void setDestType(String destType) {
			this.destType = destType;
		}

		public String getSrcRegion() {
			return this.srcRegion;
		}

		public void setSrcRegion(String srcRegion) {
			this.srcRegion = srcRegion;
		}

		public Integer getEnableLogBackup() {
			return this.enableLogBackup;
		}

		public void setEnableLogBackup(Integer enableLogBackup) {
			this.enableLogBackup = enableLogBackup;
		}

		public String getSrcType() {
			return this.srcType;
		}

		public void setSrcType(String srcType) {
			this.srcType = srcType;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getLogRetentionValue() {
			return this.logRetentionValue;
		}

		public void setLogRetentionValue(String logRetentionValue) {
			this.logRetentionValue = logRetentionValue;
		}

		public String getDestRegion() {
			return this.destRegion;
		}

		public void setDestRegion(String destRegion) {
			this.destRegion = destRegion;
		}
	}

	@Override
	public DescribeLogBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
