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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.UpdateBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateBackupPolicyResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Boolean success;

	private List<Account> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public List<Account> getData() {
		return this.data;
	}

	public void setData(List<Account> data) {
		this.data = data;
	}

	public static class Account {

		private Integer logLocalRetentionSpace;

		private String dBInstanceName;

		private String backupWay;

		private String backupPeriod;

		private Integer forceCleanOnHighSpaceUsage;

		private String backupType;

		private Integer localLogRetention;

		private Integer removeLogRetention;

		private String backupPlanBegin;

		private Integer backupSetRetention;

		private Integer isEnabled;

		private Integer coldDataBackupInterval;

		private Integer coldDataBackupRetention;

		private Integer localLogRetentionNumber;

		private Boolean isCrossRegionDataBackupEnabled;

		private Boolean isCrossRegionLogBackupEnabled;

		private String destCrossRegion;

		private Integer crossRegionDataBackupRetention;

		private Integer crossRegionLogBackupRetention;

		public Integer getLogLocalRetentionSpace() {
			return this.logLocalRetentionSpace;
		}

		public void setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
			this.logLocalRetentionSpace = logLocalRetentionSpace;
		}

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public String getBackupWay() {
			return this.backupWay;
		}

		public void setBackupWay(String backupWay) {
			this.backupWay = backupWay;
		}

		public String getBackupPeriod() {
			return this.backupPeriod;
		}

		public void setBackupPeriod(String backupPeriod) {
			this.backupPeriod = backupPeriod;
		}

		public Integer getForceCleanOnHighSpaceUsage() {
			return this.forceCleanOnHighSpaceUsage;
		}

		public void setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
			this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public Integer getLocalLogRetention() {
			return this.localLogRetention;
		}

		public void setLocalLogRetention(Integer localLogRetention) {
			this.localLogRetention = localLogRetention;
		}

		public Integer getRemoveLogRetention() {
			return this.removeLogRetention;
		}

		public void setRemoveLogRetention(Integer removeLogRetention) {
			this.removeLogRetention = removeLogRetention;
		}

		public String getBackupPlanBegin() {
			return this.backupPlanBegin;
		}

		public void setBackupPlanBegin(String backupPlanBegin) {
			this.backupPlanBegin = backupPlanBegin;
		}

		public Integer getBackupSetRetention() {
			return this.backupSetRetention;
		}

		public void setBackupSetRetention(Integer backupSetRetention) {
			this.backupSetRetention = backupSetRetention;
		}

		public Integer getIsEnabled() {
			return this.isEnabled;
		}

		public void setIsEnabled(Integer isEnabled) {
			this.isEnabled = isEnabled;
		}

		public Integer getColdDataBackupInterval() {
			return this.coldDataBackupInterval;
		}

		public void setColdDataBackupInterval(Integer coldDataBackupInterval) {
			this.coldDataBackupInterval = coldDataBackupInterval;
		}

		public Integer getColdDataBackupRetention() {
			return this.coldDataBackupRetention;
		}

		public void setColdDataBackupRetention(Integer coldDataBackupRetention) {
			this.coldDataBackupRetention = coldDataBackupRetention;
		}

		public Integer getLocalLogRetentionNumber() {
			return this.localLogRetentionNumber;
		}

		public void setLocalLogRetentionNumber(Integer localLogRetentionNumber) {
			this.localLogRetentionNumber = localLogRetentionNumber;
		}

		public Boolean getIsCrossRegionDataBackupEnabled() {
			return this.isCrossRegionDataBackupEnabled;
		}

		public void setIsCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
			this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
		}

		public Boolean getIsCrossRegionLogBackupEnabled() {
			return this.isCrossRegionLogBackupEnabled;
		}

		public void setIsCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
			this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
		}

		public String getDestCrossRegion() {
			return this.destCrossRegion;
		}

		public void setDestCrossRegion(String destCrossRegion) {
			this.destCrossRegion = destCrossRegion;
		}

		public Integer getCrossRegionDataBackupRetention() {
			return this.crossRegionDataBackupRetention;
		}

		public void setCrossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
			this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
		}

		public Integer getCrossRegionLogBackupRetention() {
			return this.crossRegionLogBackupRetention;
		}

		public void setCrossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
			this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
		}
	}

	@Override
	public UpdateBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	UpdateBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
