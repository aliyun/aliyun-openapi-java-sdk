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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeSupabaseBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSupabaseBackupPolicyResponse extends AcsResponse {

	private String preferredBackupPeriod;

	private String requestId;

	private String preferredBackupTime;

	private Integer backupRetentionPeriod;

	private Boolean enableRecoveryPoint;

	private String recoveryPointPeriod;

	private Integer backupInterval;

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

	public Integer getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	public Boolean getEnableRecoveryPoint() {
		return this.enableRecoveryPoint;
	}

	public void setEnableRecoveryPoint(Boolean enableRecoveryPoint) {
		this.enableRecoveryPoint = enableRecoveryPoint;
	}

	public String getRecoveryPointPeriod() {
		return this.recoveryPointPeriod;
	}

	public void setRecoveryPointPeriod(String recoveryPointPeriod) {
		this.recoveryPointPeriod = recoveryPointPeriod;
	}

	public Integer getBackupInterval() {
		return this.backupInterval;
	}

	public void setBackupInterval(Integer backupInterval) {
		this.backupInterval = backupInterval;
	}

	@Override
	public DescribeSupabaseBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeSupabaseBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
