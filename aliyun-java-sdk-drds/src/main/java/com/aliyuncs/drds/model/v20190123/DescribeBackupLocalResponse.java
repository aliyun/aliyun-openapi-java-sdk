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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeBackupLocalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupLocalResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private BackupPolicyDO backupPolicyDO;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public BackupPolicyDO getBackupPolicyDO() {
		return this.backupPolicyDO;
	}

	public void setBackupPolicyDO(BackupPolicyDO backupPolicyDO) {
		this.backupPolicyDO = backupPolicyDO;
	}

	public static class BackupPolicyDO {

		private Long gmtCreate;

		private Long gmtModified;

		private String backupPolicyMode;

		private String backupType;

		private String backupLevel;

		private String backupDbName;

		private String preferredBackupTime;

		private String preferredBackupPeriod;

		private Long dataBackupRetentionPeriod;

		private Long logBackupRetentionPeriod;

		private Long backupRetentionPeriod;

		private String backupLog;

		private Long localLogRetentionHours;

		private Long localLogRetentionSpace;

		private Long highSpaceUsageProtection;

		private String backupAppName;

		private String backupMode;

		private String nextBackupActuallyTime;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getBackupPolicyMode() {
			return this.backupPolicyMode;
		}

		public void setBackupPolicyMode(String backupPolicyMode) {
			this.backupPolicyMode = backupPolicyMode;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getBackupLevel() {
			return this.backupLevel;
		}

		public void setBackupLevel(String backupLevel) {
			this.backupLevel = backupLevel;
		}

		public String getBackupDbName() {
			return this.backupDbName;
		}

		public void setBackupDbName(String backupDbName) {
			this.backupDbName = backupDbName;
		}

		public String getPreferredBackupTime() {
			return this.preferredBackupTime;
		}

		public void setPreferredBackupTime(String preferredBackupTime) {
			this.preferredBackupTime = preferredBackupTime;
		}

		public String getPreferredBackupPeriod() {
			return this.preferredBackupPeriod;
		}

		public void setPreferredBackupPeriod(String preferredBackupPeriod) {
			this.preferredBackupPeriod = preferredBackupPeriod;
		}

		public Long getDataBackupRetentionPeriod() {
			return this.dataBackupRetentionPeriod;
		}

		public void setDataBackupRetentionPeriod(Long dataBackupRetentionPeriod) {
			this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
		}

		public Long getLogBackupRetentionPeriod() {
			return this.logBackupRetentionPeriod;
		}

		public void setLogBackupRetentionPeriod(Long logBackupRetentionPeriod) {
			this.logBackupRetentionPeriod = logBackupRetentionPeriod;
		}

		public Long getBackupRetentionPeriod() {
			return this.backupRetentionPeriod;
		}

		public void setBackupRetentionPeriod(Long backupRetentionPeriod) {
			this.backupRetentionPeriod = backupRetentionPeriod;
		}

		public String getBackupLog() {
			return this.backupLog;
		}

		public void setBackupLog(String backupLog) {
			this.backupLog = backupLog;
		}

		public Long getLocalLogRetentionHours() {
			return this.localLogRetentionHours;
		}

		public void setLocalLogRetentionHours(Long localLogRetentionHours) {
			this.localLogRetentionHours = localLogRetentionHours;
		}

		public Long getLocalLogRetentionSpace() {
			return this.localLogRetentionSpace;
		}

		public void setLocalLogRetentionSpace(Long localLogRetentionSpace) {
			this.localLogRetentionSpace = localLogRetentionSpace;
		}

		public Long getHighSpaceUsageProtection() {
			return this.highSpaceUsageProtection;
		}

		public void setHighSpaceUsageProtection(Long highSpaceUsageProtection) {
			this.highSpaceUsageProtection = highSpaceUsageProtection;
		}

		public String getBackupAppName() {
			return this.backupAppName;
		}

		public void setBackupAppName(String backupAppName) {
			this.backupAppName = backupAppName;
		}

		public String getBackupMode() {
			return this.backupMode;
		}

		public void setBackupMode(String backupMode) {
			this.backupMode = backupMode;
		}

		public String getNextBackupActuallyTime() {
			return this.nextBackupActuallyTime;
		}

		public void setNextBackupActuallyTime(String nextBackupActuallyTime) {
			this.nextBackupActuallyTime = nextBackupActuallyTime;
		}
	}

	@Override
	public DescribeBackupLocalResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupLocalResponseUnmarshaller.unmarshall(this, context);
	}
}
