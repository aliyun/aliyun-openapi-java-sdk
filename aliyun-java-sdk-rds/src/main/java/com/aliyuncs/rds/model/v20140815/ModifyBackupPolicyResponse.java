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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.ModifyBackupPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyResponse extends AcsResponse {

	private String requestId;

	private String compressType;

	private String localLogRetentionSpace;

	private Integer logBackupLocalRetentionNumber;

	private String dBInstanceID;

	private String enableBackupLog;

	private Integer localLogRetentionHours;

	private String highSpaceUsageProtection;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCompressType() {
		return this.compressType;
	}

	public void setCompressType(String compressType) {
		this.compressType = compressType;
	}

	public String getLocalLogRetentionSpace() {
		return this.localLogRetentionSpace;
	}

	public void setLocalLogRetentionSpace(String localLogRetentionSpace) {
		this.localLogRetentionSpace = localLogRetentionSpace;
	}

	public Integer getLogBackupLocalRetentionNumber() {
		return this.logBackupLocalRetentionNumber;
	}

	public void setLogBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
		this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
	}

	public String getDBInstanceID() {
		return this.dBInstanceID;
	}

	public void setDBInstanceID(String dBInstanceID) {
		this.dBInstanceID = dBInstanceID;
	}

	public String getEnableBackupLog() {
		return this.enableBackupLog;
	}

	public void setEnableBackupLog(String enableBackupLog) {
		this.enableBackupLog = enableBackupLog;
	}

	public Integer getLocalLogRetentionHours() {
		return this.localLogRetentionHours;
	}

	public void setLocalLogRetentionHours(Integer localLogRetentionHours) {
		this.localLogRetentionHours = localLogRetentionHours;
	}

	public String getHighSpaceUsageProtection() {
		return this.highSpaceUsageProtection;
	}

	public void setHighSpaceUsageProtection(String highSpaceUsageProtection) {
		this.highSpaceUsageProtection = highSpaceUsageProtection;
	}

	@Override
	public ModifyBackupPolicyResponse getInstance(UnmarshallerContext context) {
		return	ModifyBackupPolicyResponseUnmarshaller.unmarshall(this, context);
	}
}
