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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPolicyResponse extends AcsResponse {

	private String preferredBackupPeriod;

	private String requestId;

	private String preferredBackupTime;

	private String backupRetentionPeriod;

	private String preferredNextBackupTime;

	private Integer enableBackupLog;

	private Integer logBackupRetentionPeriod;

	private String snapshotBackupType;

	private Integer backupInterval;

	private String highFrequencyBackupRetention;

	private Integer backupRetentionPolicyOnClusterDeletion;

	private String srcRegion;

	private String destRegion;

	private String crossRetentionType;

	private Integer crossRetentionValue;

	private String crossBackupPeriod;

	private Integer enableCrossLogBackup;

	private String crossLogRetentionType;

	private Integer crossLogRetentionValue;

	private Boolean preserveOneEachHour;

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
	}

	public String getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(String backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	public String getPreferredNextBackupTime() {
		return this.preferredNextBackupTime;
	}

	public void setPreferredNextBackupTime(String preferredNextBackupTime) {
		this.preferredNextBackupTime = preferredNextBackupTime;
	}

	public Integer getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(Integer enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
	}

	public Integer getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
	}

	public String getSnapshotBackupType() {
		return this.snapshotBackupType;
	}

	public void setSnapshotBackupType(String snapshotBackupType) {
		this.snapshotBackupType = snapshotBackupType;
	}

	public Integer getBackupInterval() {
		return this.backupInterval;
	}

	public void setBackupInterval(Integer backupInterval) {
		this.backupInterval = backupInterval;
	}

	public String getHighFrequencyBackupRetention() {
		return this.highFrequencyBackupRetention;
	}

	public void setHighFrequencyBackupRetention(String highFrequencyBackupRetention) {
		this.highFrequencyBackupRetention = highFrequencyBackupRetention;
	}

	public Integer getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
	}

	public String getSrcRegion() {
		return this.srcRegion;
	}

	public void setSrcRegion(String srcRegion) {
		this.srcRegion = srcRegion;
	}

	public String getDestRegion() {
		return this.destRegion;
	}

	public void setDestRegion(String destRegion) {
		this.destRegion = destRegion;
	}

	public String getCrossRetentionType() {
		return this.crossRetentionType;
	}

	public void setCrossRetentionType(String crossRetentionType) {
		this.crossRetentionType = crossRetentionType;
	}

	public Integer getCrossRetentionValue() {
		return this.crossRetentionValue;
	}

	public void setCrossRetentionValue(Integer crossRetentionValue) {
		this.crossRetentionValue = crossRetentionValue;
	}

	public String getCrossBackupPeriod() {
		return this.crossBackupPeriod;
	}

	public void setCrossBackupPeriod(String crossBackupPeriod) {
		this.crossBackupPeriod = crossBackupPeriod;
	}

	public Integer getEnableCrossLogBackup() {
		return this.enableCrossLogBackup;
	}

	public void setEnableCrossLogBackup(Integer enableCrossLogBackup) {
		this.enableCrossLogBackup = enableCrossLogBackup;
	}

	public String getCrossLogRetentionType() {
		return this.crossLogRetentionType;
	}

	public void setCrossLogRetentionType(String crossLogRetentionType) {
		this.crossLogRetentionType = crossLogRetentionType;
	}

	public Integer getCrossLogRetentionValue() {
		return this.crossLogRetentionValue;
	}

	public void setCrossLogRetentionValue(Integer crossLogRetentionValue) {
		this.crossLogRetentionValue = crossLogRetentionValue;
	}

	public Boolean getPreserveOneEachHour() {
		return this.preserveOneEachHour;
	}

	public void setPreserveOneEachHour(Boolean preserveOneEachHour) {
		this.preserveOneEachHour = preserveOneEachHour;
	}

	@Override
	public DescribeBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
