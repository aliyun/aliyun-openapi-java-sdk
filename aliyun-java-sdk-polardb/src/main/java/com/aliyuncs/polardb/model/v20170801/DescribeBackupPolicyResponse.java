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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPolicyResponse extends AcsResponse {

	private String preferredBackupPeriod;

	private String dataLevel1BackupRetentionPeriod;

	private String requestId;

	private String preferredBackupTime;

	private String backupRetentionPolicyOnClusterDeletion;

	private Integer backupRetentionPeriod;

	private String preferredNextBackupTime;

	private String dataLevel2BackupRetentionPeriod;

	private String backupFrequency;

	private String dataLevel1BackupFrequency;

	private String dataLevel1BackupPeriod;

	private String dataLevel1BackupTime;

	private String dataLevel2BackupPeriod;

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
	}

	public String getDataLevel1BackupRetentionPeriod() {
		return this.dataLevel1BackupRetentionPeriod;
	}

	public void setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
		this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
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

	public String getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
	}

	public Integer getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	public String getPreferredNextBackupTime() {
		return this.preferredNextBackupTime;
	}

	public void setPreferredNextBackupTime(String preferredNextBackupTime) {
		this.preferredNextBackupTime = preferredNextBackupTime;
	}

	public String getDataLevel2BackupRetentionPeriod() {
		return this.dataLevel2BackupRetentionPeriod;
	}

	public void setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
		this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
	}

	public String getBackupFrequency() {
		return this.backupFrequency;
	}

	public void setBackupFrequency(String backupFrequency) {
		this.backupFrequency = backupFrequency;
	}

	public String getDataLevel1BackupFrequency() {
		return this.dataLevel1BackupFrequency;
	}

	public void setDataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
		this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
	}

	public String getDataLevel1BackupPeriod() {
		return this.dataLevel1BackupPeriod;
	}

	public void setDataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
		this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
	}

	public String getDataLevel1BackupTime() {
		return this.dataLevel1BackupTime;
	}

	public void setDataLevel1BackupTime(String dataLevel1BackupTime) {
		this.dataLevel1BackupTime = dataLevel1BackupTime;
	}

	public String getDataLevel2BackupPeriod() {
		return this.dataLevel2BackupPeriod;
	}

	public void setDataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
		this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
	}

	@Override
	public DescribeBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
