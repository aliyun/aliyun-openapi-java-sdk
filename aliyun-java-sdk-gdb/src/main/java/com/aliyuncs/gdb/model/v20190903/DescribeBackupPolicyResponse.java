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

package com.aliyuncs.gdb.model.v20190903;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gdb.transform.v20190903.DescribeBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPolicyResponse extends AcsResponse {

	private String requestId;

	private Integer backupRetentionPeriod;

	private String preferredBackupTime;

	private String preferredBackupPeriod;

	private String enableBackupLog;

	private Integer logBackupRetentionPeriod;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
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

	public String getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(String enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
	}

	public Integer getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(Integer logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
	}

	@Override
	public DescribeBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
