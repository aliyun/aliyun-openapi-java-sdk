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

	private Integer crossRegionDataBackupRetention;

	private Integer forceCleanOnHighSpaceUsage;

	private String backupPlanBegin;

	private Integer removeLogRetention;

	private Integer coldDataBackupRetention;

	private Integer localLogRetentionNumber;

	private String backupType;

	private Integer isEnabled;

	private Integer coldDataBackupInterval;

	private String backupWay;

	private String destCrossRegion;

	private Integer backupSetRetention;

	private Boolean isCrossRegionDataBackupEnabled;

	private Integer crossRegionLogBackupRetention;

	private String backupPeriod;

	private Boolean isCrossRegionLogBackupEnabled;

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

	public Integer getCrossRegionDataBackupRetention() {
		return this.crossRegionDataBackupRetention;
	}

	public void setCrossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
		this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
		if(crossRegionDataBackupRetention != null){
			putQueryParameter("CrossRegionDataBackupRetention", crossRegionDataBackupRetention.toString());
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

	public Integer getColdDataBackupRetention() {
		return this.coldDataBackupRetention;
	}

	public void setColdDataBackupRetention(Integer coldDataBackupRetention) {
		this.coldDataBackupRetention = coldDataBackupRetention;
		if(coldDataBackupRetention != null){
			putQueryParameter("ColdDataBackupRetention", coldDataBackupRetention.toString());
		}
	}

	public Integer getLocalLogRetentionNumber() {
		return this.localLogRetentionNumber;
	}

	public void setLocalLogRetentionNumber(Integer localLogRetentionNumber) {
		this.localLogRetentionNumber = localLogRetentionNumber;
		if(localLogRetentionNumber != null){
			putQueryParameter("LocalLogRetentionNumber", localLogRetentionNumber.toString());
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

	public Integer getColdDataBackupInterval() {
		return this.coldDataBackupInterval;
	}

	public void setColdDataBackupInterval(Integer coldDataBackupInterval) {
		this.coldDataBackupInterval = coldDataBackupInterval;
		if(coldDataBackupInterval != null){
			putQueryParameter("ColdDataBackupInterval", coldDataBackupInterval.toString());
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

	public String getDestCrossRegion() {
		return this.destCrossRegion;
	}

	public void setDestCrossRegion(String destCrossRegion) {
		this.destCrossRegion = destCrossRegion;
		if(destCrossRegion != null){
			putQueryParameter("DestCrossRegion", destCrossRegion);
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

	public Boolean getIsCrossRegionDataBackupEnabled() {
		return this.isCrossRegionDataBackupEnabled;
	}

	public void setIsCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
		this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
		if(isCrossRegionDataBackupEnabled != null){
			putQueryParameter("IsCrossRegionDataBackupEnabled", isCrossRegionDataBackupEnabled.toString());
		}
	}

	public Integer getCrossRegionLogBackupRetention() {
		return this.crossRegionLogBackupRetention;
	}

	public void setCrossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
		this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
		if(crossRegionLogBackupRetention != null){
			putQueryParameter("CrossRegionLogBackupRetention", crossRegionLogBackupRetention.toString());
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

	public Boolean getIsCrossRegionLogBackupEnabled() {
		return this.isCrossRegionLogBackupEnabled;
	}

	public void setIsCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
		this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
		if(isCrossRegionLogBackupEnabled != null){
			putQueryParameter("IsCrossRegionLogBackupEnabled", isCrossRegionLogBackupEnabled.toString());
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
