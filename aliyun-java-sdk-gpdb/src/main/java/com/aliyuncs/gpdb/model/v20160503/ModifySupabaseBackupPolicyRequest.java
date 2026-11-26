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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySupabaseBackupPolicyRequest extends RpcAcsRequest<ModifySupabaseBackupPolicyResponse> {
	   

	private String recoveryPointPeriod;

	private String projectId;

	private Boolean enableRecoveryPoint;

	private String preferredBackupPeriod;

	private String preferredBackupTime;

	private Integer backupRetentionPeriod;
	public ModifySupabaseBackupPolicyRequest() {
		super("gpdb", "2016-05-03", "ModifySupabaseBackupPolicy", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRecoveryPointPeriod() {
		return this.recoveryPointPeriod;
	}

	public void setRecoveryPointPeriod(String recoveryPointPeriod) {
		this.recoveryPointPeriod = recoveryPointPeriod;
		if(recoveryPointPeriod != null){
			putQueryParameter("RecoveryPointPeriod", recoveryPointPeriod);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public Boolean getEnableRecoveryPoint() {
		return this.enableRecoveryPoint;
	}

	public void setEnableRecoveryPoint(Boolean enableRecoveryPoint) {
		this.enableRecoveryPoint = enableRecoveryPoint;
		if(enableRecoveryPoint != null){
			putQueryParameter("EnableRecoveryPoint", enableRecoveryPoint.toString());
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

	public String getPreferredBackupTime() {
		return this.preferredBackupTime;
	}

	public void setPreferredBackupTime(String preferredBackupTime) {
		this.preferredBackupTime = preferredBackupTime;
		if(preferredBackupTime != null){
			putQueryParameter("PreferredBackupTime", preferredBackupTime);
		}
	}

	public Integer getBackupRetentionPeriod() {
		return this.backupRetentionPeriod;
	}

	public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
		this.backupRetentionPeriod = backupRetentionPeriod;
		if(backupRetentionPeriod != null){
			putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod.toString());
		}
	}

	@Override
	public Class<ModifySupabaseBackupPolicyResponse> getResponseClass() {
		return ModifySupabaseBackupPolicyResponse.class;
	}

}
