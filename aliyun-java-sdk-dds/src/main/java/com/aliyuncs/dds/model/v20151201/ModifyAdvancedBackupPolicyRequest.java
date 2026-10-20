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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAdvancedBackupPolicyRequest extends RpcAcsRequest<ModifyAdvancedBackupPolicyResponse> {
	   

	@SerializedName("advancedBackupDataPolicies")
	private List<AdvancedBackupDataPolicies> advancedBackupDataPolicies;

	private String dBInstanceId;

	private Integer backupRetentionPolicyOnClusterDeletion;

	@SerializedName("advancedBackupLogPolicies")
	private List<AdvancedBackupLogPolicies> advancedBackupLogPolicies;

	private String snapshotBackupType;

	private String preferredBackupTime;
	public ModifyAdvancedBackupPolicyRequest() {
		super("Dds", "2015-12-01", "ModifyAdvancedBackupPolicy", "dds");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<AdvancedBackupDataPolicies> getAdvancedBackupDataPolicies() {
		return this.advancedBackupDataPolicies;
	}

	public void setAdvancedBackupDataPolicies(List<AdvancedBackupDataPolicies> advancedBackupDataPolicies) {
		this.advancedBackupDataPolicies = advancedBackupDataPolicies;	
		if (advancedBackupDataPolicies != null) {
			putQueryParameter("AdvancedBackupDataPolicies" , new Gson().toJson(advancedBackupDataPolicies));
		}	
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public Integer getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(Integer backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
		if(backupRetentionPolicyOnClusterDeletion != null){
			putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion.toString());
		}
	}

	public List<AdvancedBackupLogPolicies> getAdvancedBackupLogPolicies() {
		return this.advancedBackupLogPolicies;
	}

	public void setAdvancedBackupLogPolicies(List<AdvancedBackupLogPolicies> advancedBackupLogPolicies) {
		this.advancedBackupLogPolicies = advancedBackupLogPolicies;	
		if (advancedBackupLogPolicies != null) {
			putQueryParameter("AdvancedBackupLogPolicies" , new Gson().toJson(advancedBackupLogPolicies));
		}	
	}

	public String getSnapshotBackupType() {
		return this.snapshotBackupType;
	}

	public void setSnapshotBackupType(String snapshotBackupType) {
		this.snapshotBackupType = snapshotBackupType;
		if(snapshotBackupType != null){
			putQueryParameter("SnapshotBackupType", snapshotBackupType);
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

	public static class AdvancedBackupDataPolicies {

		@SerializedName("PreferredBackupPeriod")
		private String preferredBackupPeriod;

		@SerializedName("ActionType")
		private String actionType;

		@SerializedName("SrcType")
		private String srcType;

		@SerializedName("RetentionPeriod")
		private Integer retentionPeriod;

		@SerializedName("DestRegion")
		private String destRegion;

		@SerializedName("PolicyId")
		private String policyId;

		@SerializedName("SrcRegion")
		private String srcRegion;

		@SerializedName("DestType")
		private String destType;

		@SerializedName("PreserveOneEachHour")
		private Boolean preserveOneEachHour;

		@SerializedName("RetentionType")
		private String retentionType;

		@SerializedName("BackupPolicy")
		private String backupPolicy;

		public String getPreferredBackupPeriod() {
			return this.preferredBackupPeriod;
		}

		public void setPreferredBackupPeriod(String preferredBackupPeriod) {
			this.preferredBackupPeriod = preferredBackupPeriod;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getSrcType() {
			return this.srcType;
		}

		public void setSrcType(String srcType) {
			this.srcType = srcType;
		}

		public Integer getRetentionPeriod() {
			return this.retentionPeriod;
		}

		public void setRetentionPeriod(Integer retentionPeriod) {
			this.retentionPeriod = retentionPeriod;
		}

		public String getDestRegion() {
			return this.destRegion;
		}

		public void setDestRegion(String destRegion) {
			this.destRegion = destRegion;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getSrcRegion() {
			return this.srcRegion;
		}

		public void setSrcRegion(String srcRegion) {
			this.srcRegion = srcRegion;
		}

		public String getDestType() {
			return this.destType;
		}

		public void setDestType(String destType) {
			this.destType = destType;
		}

		public Boolean getPreserveOneEachHour() {
			return this.preserveOneEachHour;
		}

		public void setPreserveOneEachHour(Boolean preserveOneEachHour) {
			this.preserveOneEachHour = preserveOneEachHour;
		}

		public String getRetentionType() {
			return this.retentionType;
		}

		public void setRetentionType(String retentionType) {
			this.retentionType = retentionType;
		}

		public String getBackupPolicy() {
			return this.backupPolicy;
		}

		public void setBackupPolicy(String backupPolicy) {
			this.backupPolicy = backupPolicy;
		}
	}

	public static class AdvancedBackupLogPolicies {

		@SerializedName("ActionType")
		private String actionType;

		@SerializedName("SrcType")
		private String srcType;

		@SerializedName("RetentionPeriod")
		private Integer retentionPeriod;

		@SerializedName("DestRegion")
		private String destRegion;

		@SerializedName("PolicyId")
		private String policyId;

		@SerializedName("SrcRegion")
		private String srcRegion;

		@SerializedName("DestType")
		private String destType;

		@SerializedName("RetentionType")
		private String retentionType;

		@SerializedName("EnableLogBackup")
		private Integer enableLogBackup;

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getSrcType() {
			return this.srcType;
		}

		public void setSrcType(String srcType) {
			this.srcType = srcType;
		}

		public Integer getRetentionPeriod() {
			return this.retentionPeriod;
		}

		public void setRetentionPeriod(Integer retentionPeriod) {
			this.retentionPeriod = retentionPeriod;
		}

		public String getDestRegion() {
			return this.destRegion;
		}

		public void setDestRegion(String destRegion) {
			this.destRegion = destRegion;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getSrcRegion() {
			return this.srcRegion;
		}

		public void setSrcRegion(String srcRegion) {
			this.srcRegion = srcRegion;
		}

		public String getDestType() {
			return this.destType;
		}

		public void setDestType(String destType) {
			this.destType = destType;
		}

		public String getRetentionType() {
			return this.retentionType;
		}

		public void setRetentionType(String retentionType) {
			this.retentionType = retentionType;
		}

		public Integer getEnableLogBackup() {
			return this.enableLogBackup;
		}

		public void setEnableLogBackup(Integer enableLogBackup) {
			this.enableLogBackup = enableLogBackup;
		}
	}

	@Override
	public Class<ModifyAdvancedBackupPolicyResponse> getResponseClass() {
		return ModifyAdvancedBackupPolicyResponse.class;
	}

}
