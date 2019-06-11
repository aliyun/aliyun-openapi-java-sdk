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

package com.aliyuncs.gdb.model.v20181129;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	
	public ModifyBackupPolicyRequest() {
		super("gdb", "2018-11-29", "ModifyBackupPolicy", "gdb");
	}

	private String preferredBackupPeriod;

	private String skipAuth;

	private String backupRetentionCopies;

	private String backupStartTime;

	private String backupRetentionDays;

	private String dbInstanceId;

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
		if(preferredBackupPeriod != null){
			putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
		}
	}

	public String getSkipAuth() {
		return this.skipAuth;
	}

	public void setSkipAuth(String skipAuth) {
		this.skipAuth = skipAuth;
		if(skipAuth != null){
			putQueryParameter("skipAuth", skipAuth);
		}
	}

	public String getBackupRetentionCopies() {
		return this.backupRetentionCopies;
	}

	public void setBackupRetentionCopies(String backupRetentionCopies) {
		this.backupRetentionCopies = backupRetentionCopies;
		if(backupRetentionCopies != null){
			putQueryParameter("BackupRetentionCopies", backupRetentionCopies);
		}
	}

	public String getBackupStartTime() {
		return this.backupStartTime;
	}

	public void setBackupStartTime(String backupStartTime) {
		this.backupStartTime = backupStartTime;
		if(backupStartTime != null){
			putQueryParameter("BackupStartTime", backupStartTime);
		}
	}

	public String getBackupRetentionDays() {
		return this.backupRetentionDays;
	}

	public void setBackupRetentionDays(String backupRetentionDays) {
		this.backupRetentionDays = backupRetentionDays;
		if(backupRetentionDays != null){
			putQueryParameter("BackupRetentionDays", backupRetentionDays);
		}
	}

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	@Override
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}
