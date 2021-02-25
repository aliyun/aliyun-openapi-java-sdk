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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBackupPolicyRequest extends RpcAcsRequest<UpdateBackupPolicyResponse> {
	   

	private String dBInstanceName;

	private Integer forceCleanOnHighSpaceUsage;

	private String backupPlanBegin;

	private Integer removeLogRetention;

	private String backupType;

	private Integer isEnabled;

	private String backupWay;

	private Integer backupSetRetention;

	private String backupPeriod;

	private Integer localLogRetention;

	private Integer logLocalRetentionSpace;
	public UpdateBackupPolicyRequest() {
		super("polardbx", "2020-02-02", "UpdateBackupPolicy", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public Integer getForceCleanOnHighSpaceUsage() {
		return this.forceCleanOnHighSpaceUsage;
	}

	public void setForceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
		this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
		if(forceCleanOnHighSpaceUsage != null){
			putQueryParameter("ForceCleanOnHighSpaceUsage", forceCleanOnHighSpaceUsage.toString());
		}
	}

	public String getBackupPlanBegin() {
		return this.backupPlanBegin;
	}

	public void setBackupPlanBegin(String backupPlanBegin) {
		this.backupPlanBegin = backupPlanBegin;
		if(backupPlanBegin != null){
			putQueryParameter("BackupPlanBegin", backupPlanBegin);
		}
	}

	public Integer getRemoveLogRetention() {
		return this.removeLogRetention;
	}

	public void setRemoveLogRetention(Integer removeLogRetention) {
		this.removeLogRetention = removeLogRetention;
		if(removeLogRetention != null){
			putQueryParameter("RemoveLogRetention", removeLogRetention.toString());
		}
	}

	public String getBackupType() {
		return this.backupType;
	}

	public void setBackupType(String backupType) {
		this.backupType = backupType;
		if(backupType != null){
			putQueryParameter("BackupType", backupType);
		}
	}

	public Integer getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
		if(isEnabled != null){
			putQueryParameter("IsEnabled", isEnabled.toString());
		}
	}

	public String getBackupWay() {
		return this.backupWay;
	}

	public void setBackupWay(String backupWay) {
		this.backupWay = backupWay;
		if(backupWay != null){
			putQueryParameter("BackupWay", backupWay);
		}
	}

	public Integer getBackupSetRetention() {
		return this.backupSetRetention;
	}

	public void setBackupSetRetention(Integer backupSetRetention) {
		this.backupSetRetention = backupSetRetention;
		if(backupSetRetention != null){
			putQueryParameter("BackupSetRetention", backupSetRetention.toString());
		}
	}

	public String getBackupPeriod() {
		return this.backupPeriod;
	}

	public void setBackupPeriod(String backupPeriod) {
		this.backupPeriod = backupPeriod;
		if(backupPeriod != null){
			putQueryParameter("BackupPeriod", backupPeriod);
		}
	}

	public Integer getLocalLogRetention() {
		return this.localLogRetention;
	}

	public void setLocalLogRetention(Integer localLogRetention) {
		this.localLogRetention = localLogRetention;
		if(localLogRetention != null){
			putQueryParameter("LocalLogRetention", localLogRetention.toString());
		}
	}

	public Integer getLogLocalRetentionSpace() {
		return this.logLocalRetentionSpace;
	}

	public void setLogLocalRetentionSpace(Integer logLocalRetentionSpace) {
		this.logLocalRetentionSpace = logLocalRetentionSpace;
		if(logLocalRetentionSpace != null){
			putQueryParameter("LogLocalRetentionSpace", logLocalRetentionSpace.toString());
		}
	}

	@Override
	public Class<UpdateBackupPolicyResponse> getResponseClass() {
		return UpdateBackupPolicyResponse.class;
	}

}
