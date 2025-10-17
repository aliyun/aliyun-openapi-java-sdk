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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupPolicyRequest extends RpcAcsRequest<ModifyBackupPolicyResponse> {
	   

	private Long resourceOwnerId;

	private String dataLevel2BackupRetentionPeriod;

	@SerializedName("advancedDataPolicies")
	private List<AdvancedDataPolicies> advancedDataPolicies;

	private String dataLevel1BackupPeriod;

	private String dataLevel2BackupPeriod;

	private String preferredBackupPeriod;

	private String dataLevel1BackupRetentionPeriod;

	private String backupRetentionPolicyOnClusterDeletion;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String dataLevel2BackupAnotherRegionRetentionPeriod;

	private String backupPolicyLevel;

	private Long ownerId;

	private String preferredBackupTime;

	private String backupFrequency;

	private String dataLevel1BackupFrequency;

	private String dataLevel2BackupAnotherRegionRegion;

	private String dataLevel1BackupTime;
	public ModifyBackupPolicyRequest() {
		super("polardb", "2017-08-01", "ModifyBackupPolicy", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDataLevel2BackupRetentionPeriod() {
		return this.dataLevel2BackupRetentionPeriod;
	}

	public void setDataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
		this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
		if(dataLevel2BackupRetentionPeriod != null){
			putQueryParameter("DataLevel2BackupRetentionPeriod", dataLevel2BackupRetentionPeriod);
		}
	}

	public List<AdvancedDataPolicies> getAdvancedDataPolicies() {
		return this.advancedDataPolicies;
	}

	public void setAdvancedDataPolicies(List<AdvancedDataPolicies> advancedDataPolicies) {
		this.advancedDataPolicies = advancedDataPolicies;	
		if (advancedDataPolicies != null) {
			putQueryParameter("AdvancedDataPolicies" , new Gson().toJson(advancedDataPolicies));
		}	
	}

	public String getDataLevel1BackupPeriod() {
		return this.dataLevel1BackupPeriod;
	}

	public void setDataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
		this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
		if(dataLevel1BackupPeriod != null){
			putQueryParameter("DataLevel1BackupPeriod", dataLevel1BackupPeriod);
		}
	}

	public String getDataLevel2BackupPeriod() {
		return this.dataLevel2BackupPeriod;
	}

	public void setDataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
		this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
		if(dataLevel2BackupPeriod != null){
			putQueryParameter("DataLevel2BackupPeriod", dataLevel2BackupPeriod);
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

	public String getDataLevel1BackupRetentionPeriod() {
		return this.dataLevel1BackupRetentionPeriod;
	}

	public void setDataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
		this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
		if(dataLevel1BackupRetentionPeriod != null){
			putQueryParameter("DataLevel1BackupRetentionPeriod", dataLevel1BackupRetentionPeriod);
		}
	}

	public String getBackupRetentionPolicyOnClusterDeletion() {
		return this.backupRetentionPolicyOnClusterDeletion;
	}

	public void setBackupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
		this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
		if(backupRetentionPolicyOnClusterDeletion != null){
			putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDataLevel2BackupAnotherRegionRetentionPeriod() {
		return this.dataLevel2BackupAnotherRegionRetentionPeriod;
	}

	public void setDataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
		this.dataLevel2BackupAnotherRegionRetentionPeriod = dataLevel2BackupAnotherRegionRetentionPeriod;
		if(dataLevel2BackupAnotherRegionRetentionPeriod != null){
			putQueryParameter("DataLevel2BackupAnotherRegionRetentionPeriod", dataLevel2BackupAnotherRegionRetentionPeriod);
		}
	}

	public String getBackupPolicyLevel() {
		return this.backupPolicyLevel;
	}

	public void setBackupPolicyLevel(String backupPolicyLevel) {
		this.backupPolicyLevel = backupPolicyLevel;
		if(backupPolicyLevel != null){
			putQueryParameter("BackupPolicyLevel", backupPolicyLevel);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getBackupFrequency() {
		return this.backupFrequency;
	}

	public void setBackupFrequency(String backupFrequency) {
		this.backupFrequency = backupFrequency;
		if(backupFrequency != null){
			putQueryParameter("BackupFrequency", backupFrequency);
		}
	}

	public String getDataLevel1BackupFrequency() {
		return this.dataLevel1BackupFrequency;
	}

	public void setDataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
		this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
		if(dataLevel1BackupFrequency != null){
			putQueryParameter("DataLevel1BackupFrequency", dataLevel1BackupFrequency);
		}
	}

	public String getDataLevel2BackupAnotherRegionRegion() {
		return this.dataLevel2BackupAnotherRegionRegion;
	}

	public void setDataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
		this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
		if(dataLevel2BackupAnotherRegionRegion != null){
			putQueryParameter("DataLevel2BackupAnotherRegionRegion", dataLevel2BackupAnotherRegionRegion);
		}
	}

	public String getDataLevel1BackupTime() {
		return this.dataLevel1BackupTime;
	}

	public void setDataLevel1BackupTime(String dataLevel1BackupTime) {
		this.dataLevel1BackupTime = dataLevel1BackupTime;
		if(dataLevel1BackupTime != null){
			putQueryParameter("DataLevel1BackupTime", dataLevel1BackupTime);
		}
	}

	public static class AdvancedDataPolicies {

		@SerializedName("ActionType")
		private String actionType;

		@SerializedName("SrcType")
		private String srcType;

		@SerializedName("RetentionValue")
		private String retentionValue;

		@SerializedName("DestRegion")
		private String destRegion;

		@SerializedName("BakType")
		private String bakType;

		@SerializedName("OnlyPreserveOneEachDay")
		private Boolean onlyPreserveOneEachDay;

		@SerializedName("FilterValue")
		private String filterValue;

		@SerializedName("DumpAction")
		private String dumpAction;

		@SerializedName("OnlyPreserveOneEachHour")
		private Boolean onlyPreserveOneEachHour;

		@SerializedName("SrcRegion")
		private String srcRegion;

		@SerializedName("FilterType")
		private String filterType;

		@SerializedName("RetentionType")
		private String retentionType;

		@SerializedName("FilterKey")
		private String filterKey;

		@SerializedName("AutoCreated")
		private Boolean autoCreated;

		@SerializedName("PolicyId")
		private String policyId;

		@SerializedName("DestType")
		private String destType;

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

		public String getRetentionValue() {
			return this.retentionValue;
		}

		public void setRetentionValue(String retentionValue) {
			this.retentionValue = retentionValue;
		}

		public String getDestRegion() {
			return this.destRegion;
		}

		public void setDestRegion(String destRegion) {
			this.destRegion = destRegion;
		}

		public String getBakType() {
			return this.bakType;
		}

		public void setBakType(String bakType) {
			this.bakType = bakType;
		}

		public Boolean getOnlyPreserveOneEachDay() {
			return this.onlyPreserveOneEachDay;
		}

		public void setOnlyPreserveOneEachDay(Boolean onlyPreserveOneEachDay) {
			this.onlyPreserveOneEachDay = onlyPreserveOneEachDay;
		}

		public String getFilterValue() {
			return this.filterValue;
		}

		public void setFilterValue(String filterValue) {
			this.filterValue = filterValue;
		}

		public String getDumpAction() {
			return this.dumpAction;
		}

		public void setDumpAction(String dumpAction) {
			this.dumpAction = dumpAction;
		}

		public Boolean getOnlyPreserveOneEachHour() {
			return this.onlyPreserveOneEachHour;
		}

		public void setOnlyPreserveOneEachHour(Boolean onlyPreserveOneEachHour) {
			this.onlyPreserveOneEachHour = onlyPreserveOneEachHour;
		}

		public String getSrcRegion() {
			return this.srcRegion;
		}

		public void setSrcRegion(String srcRegion) {
			this.srcRegion = srcRegion;
		}

		public String getFilterType() {
			return this.filterType;
		}

		public void setFilterType(String filterType) {
			this.filterType = filterType;
		}

		public String getRetentionType() {
			return this.retentionType;
		}

		public void setRetentionType(String retentionType) {
			this.retentionType = retentionType;
		}

		public String getFilterKey() {
			return this.filterKey;
		}

		public void setFilterKey(String filterKey) {
			this.filterKey = filterKey;
		}

		public Boolean getAutoCreated() {
			return this.autoCreated;
		}

		public void setAutoCreated(Boolean autoCreated) {
			this.autoCreated = autoCreated;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getDestType() {
			return this.destType;
		}

		public void setDestType(String destType) {
			this.destType = destType;
		}
	}

	@Override
	public Class<ModifyBackupPolicyResponse> getResponseClass() {
		return ModifyBackupPolicyResponse.class;
	}

}
