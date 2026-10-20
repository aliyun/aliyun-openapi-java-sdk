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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeAdvancedBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvancedBackupPolicyResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String snapshotBackupType;

	private Integer backupRetentionPolicyOnClusterDeletion;

	private String preferredBackupTime;

	private Boolean backupTamperProofEnabled;

	private String preferredNextBackupTime;

	private List<AdvancedBackupPolicy> advancedBackupDataPolicies;

	private List<AdvancedBackupLogPolicy> advancedBackupLogPolicies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getSnapshotBackupType() {
		return this.snapshotBackupType;
	}

	public void setSnapshotBackupType(String snapshotBackupType) {
		this.snapshotBackupType = snapshotBackupType;
	}

	public Integer getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
	}

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
	}

	public Boolean getBackupTamperProofEnabled() {
		return this.backupTamperProofEnabled;
	}

	public void setBackupTamperProofEnabled(Boolean backupTamperProofEnabled) {
		this.backupTamperProofEnabled = backupTamperProofEnabled;
	}

	public String getPreferredNextBackupTime() {
		return this.preferredNextBackupTime;
	}

	public void setPreferredNextBackupTime(String preferredNextBackupTime) {
		this.preferredNextBackupTime = preferredNextBackupTime;
	}

	public List<AdvancedBackupPolicy> getAdvancedBackupDataPolicies() {
		return this.advancedBackupDataPolicies;
	}

	public void setAdvancedBackupDataPolicies(List<AdvancedBackupPolicy> advancedBackupDataPolicies) {
		this.advancedBackupDataPolicies = advancedBackupDataPolicies;
	}

	public List<AdvancedBackupLogPolicy> getAdvancedBackupLogPolicies() {
		return this.advancedBackupLogPolicies;
	}

	public void setAdvancedBackupLogPolicies(List<AdvancedBackupLogPolicy> advancedBackupLogPolicies) {
		this.advancedBackupLogPolicies = advancedBackupLogPolicies;
	}

	public static class AdvancedBackupPolicy {

		private String destType;

		private String preferredBackupPeriod;

		private String actionType;

		private String srcRegion;

		private Boolean preserveOneEachHour;

		private String srcType;

		private Integer retentionPeriod;

		private String destRegion;

		private String policyId;

		private String backupPolicy;

		private String retentionType;

		public String getDestType() {
			return this.destType;
		}

		public void setDestType(String destType) {
			this.destType = destType;
		}

		public String getPreferredBackupPeriod() {
			return this.preferredBackupPeriod;
		}

		public void setPreferredBackupPeriod(String preferredBackupPeriod) {
			this.preferredBackupPeriod = preferredBackupPeriod;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getSrcRegion() {
			return this.srcRegion;
		}

		public void setSrcRegion(String srcRegion) {
			this.srcRegion = srcRegion;
		}

		public Boolean getPreserveOneEachHour() {
			return this.preserveOneEachHour;
		}

		public void setPreserveOneEachHour(Boolean preserveOneEachHour) {
			this.preserveOneEachHour = preserveOneEachHour;
		}

		public String getSrcType() {
			return this.srcType;
		}

		public void setSrcType(String srcType) {
			this.srcType = srcType;
		}

		public Integer getRetentionPeriod() {
			return this.retentionPeriod;
		}

		public void setRetentionPeriod(Integer retentionPeriod) {
			this.retentionPeriod = retentionPeriod;
		}

		public String getDestRegion() {
			return this.destRegion;
		}

		public void setDestRegion(String destRegion) {
			this.destRegion = destRegion;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getBackupPolicy() {
			return this.backupPolicy;
		}

		public void setBackupPolicy(String backupPolicy) {
			this.backupPolicy = backupPolicy;
		}

		public String getRetentionType() {
			return this.retentionType;
		}

		public void setRetentionType(String retentionType) {
			this.retentionType = retentionType;
		}
	}

	public static class AdvancedBackupLogPolicy {

		private String destType;

		private String srcRegion;

		private Integer enableLogBackup;

		private String srcType;

		private String retentionPeriod;

		private String destRegion;

		private String policyId;

		private String retentionType;

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

		public String getRetentionPeriod() {
			return this.retentionPeriod;
		}

		public void setRetentionPeriod(String retentionPeriod) {
			this.retentionPeriod = retentionPeriod;
		}

		public String getDestRegion() {
			return this.destRegion;
		}

		public void setDestRegion(String destRegion) {
			this.destRegion = destRegion;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getRetentionType() {
			return this.retentionType;
		}

		public void setRetentionType(String retentionType) {
			this.retentionType = retentionType;
		}
	}

	@Override
	public DescribeAdvancedBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeAdvancedBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
