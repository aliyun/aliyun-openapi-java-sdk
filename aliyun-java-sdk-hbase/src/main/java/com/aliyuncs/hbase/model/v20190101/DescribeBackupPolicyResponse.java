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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPolicyResponse extends AcsResponse {

	private String preferredBackupEndTimeUTC;

	private String backupRetentionPeriod;

	private String requestId;

	private String preferredBackupPeriod;

	private String preferredBackupTime;

	private String preferredBackupStartTimeUTC;

	public String getPreferredBackupEndTimeUTC() {
		return this.preferredBackupEndTimeUTC;
	}

	public void setPreferredBackupEndTimeUTC(String preferredBackupEndTimeUTC) {
		this.preferredBackupEndTimeUTC = preferredBackupEndTimeUTC;
	}

	public String getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(String backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
	}

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
	}

	public String getPreferredBackupStartTimeUTC() {
		return this.preferredBackupStartTimeUTC;
	}

	public void setPreferredBackupStartTimeUTC(String preferredBackupStartTimeUTC) {
		this.preferredBackupStartTimeUTC = preferredBackupStartTimeUTC;
	}

	@Override
	public DescribeBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
