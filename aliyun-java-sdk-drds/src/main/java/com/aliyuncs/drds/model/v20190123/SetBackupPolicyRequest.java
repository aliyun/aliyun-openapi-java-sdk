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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetBackupPolicyRequest extends RpcAcsRequest<SetBackupPolicyResponse> {
	   

	private String backupDbNames;

	private String backupLog;

	private String preferredBackupEndTime;

	private String preferredBackupPeriod;

	private String preferredBackupStartTime;

	private String backupLevel;

	private String drdsInstanceId;

	private String dataBackupRetentionPeriod;

	private String backupMode;

	private String logBackupRetentionPeriod;
	public SetBackupPolicyRequest() {
		super("Drds", "2019-01-23", "SetBackupPolicy", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBackupDbNames() {
		return this.backupDbNames;
	}

	public void setBackupDbNames(String backupDbNames) {
		this.backupDbNames = backupDbNames;
		if(backupDbNames != null){
			putQueryParameter("BackupDbNames", backupDbNames);
		}
	}

	public String getBackupLog() {
		return this.backupLog;
	}

	public void setBackupLog(String backupLog) {
		this.backupLog = backupLog;
		if(backupLog != null){
			putQueryParameter("BackupLog", backupLog);
		}
	}

	public String getPreferredBackupEndTime() {
		return this.preferredBackupEndTime;
	}

	public void setPreferredBackupEndTime(String preferredBackupEndTime) {
		this.preferredBackupEndTime = preferredBackupEndTime;
		if(preferredBackupEndTime != null){
			putQueryParameter("PreferredBackupEndTime", preferredBackupEndTime);
		}
	}

	public String getPreferredBackupPeriod() {
		return this.preferredBackupPeriod;
	}

	public void setPreferredBackupPeriod(String preferredBackupPeriod) {
		this.preferredBackupPeriod = preferredBackupPeriod;
		if(preferredBackupPeriod != null){
			putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
		}
	}

	public String getPreferredBackupStartTime() {
		return this.preferredBackupStartTime;
	}

	public void setPreferredBackupStartTime(String preferredBackupStartTime) {
		this.preferredBackupStartTime = preferredBackupStartTime;
		if(preferredBackupStartTime != null){
			putQueryParameter("PreferredBackupStartTime", preferredBackupStartTime);
		}
	}

	public String getBackupLevel() {
		return this.backupLevel;
	}

	public void setBackupLevel(String backupLevel) {
		this.backupLevel = backupLevel;
		if(backupLevel != null){
			putQueryParameter("BackupLevel", backupLevel);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getDataBackupRetentionPeriod() {
		return this.dataBackupRetentionPeriod;
	}

	public void setDataBackupRetentionPeriod(String dataBackupRetentionPeriod) {
		this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
		if(dataBackupRetentionPeriod != null){
			putQueryParameter("DataBackupRetentionPeriod", dataBackupRetentionPeriod);
		}
	}

	public String getBackupMode() {
		return this.backupMode;
	}

	public void setBackupMode(String backupMode) {
		this.backupMode = backupMode;
		if(backupMode != null){
			putQueryParameter("BackupMode", backupMode);
		}
	}

	public String getLogBackupRetentionPeriod() {
		return this.logBackupRetentionPeriod;
	}

	public void setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
		this.logBackupRetentionPeriod = logBackupRetentionPeriod;
		if(logBackupRetentionPeriod != null){
			putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
		}
	}

	@Override
	public Class<SetBackupPolicyResponse> getResponseClass() {
		return SetBackupPolicyResponse.class;
	}

}
