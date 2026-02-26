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
public class ModifyLogBackupPolicyRequest extends RpcAcsRequest<ModifyLogBackupPolicyResponse> {
	   

	private Long resourceOwnerId;

	@SerializedName("advancedLogPolicies")
	private List<AdvancedLogPolicies> advancedLogPolicies;

	private String logBackupAnotherRegionRegion;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String logBackupAnotherRegionRetentionPeriod;

	private String logBackupRetentionPeriod;
	public ModifyLogBackupPolicyRequest() {
		super("polardb", "2017-08-01", "ModifyLogBackupPolicy", "polardb");
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

	public List<AdvancedLogPolicies> getAdvancedLogPolicies() {
		return this.advancedLogPolicies;
	}

	public void setAdvancedLogPolicies(List<AdvancedLogPolicies> advancedLogPolicies) {
		this.advancedLogPolicies = advancedLogPolicies;	
		if (advancedLogPolicies != null) {
			putQueryParameter("AdvancedLogPolicies" , new Gson().toJson(advancedLogPolicies));
		}	
	}

	public String getLogBackupAnotherRegionRegion() {
		return this.logBackupAnotherRegionRegion;
	}

	public void setLogBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
		this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
		if(logBackupAnotherRegionRegion != null){
			putQueryParameter("LogBackupAnotherRegionRegion", logBackupAnotherRegionRegion);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getLogBackupAnotherRegionRetentionPeriod() {
		return this.logBackupAnotherRegionRetentionPeriod;
	}

	public void setLogBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
		this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
		if(logBackupAnotherRegionRetentionPeriod != null){
			putQueryParameter("LogBackupAnotherRegionRetentionPeriod", logBackupAnotherRegionRetentionPeriod);
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

	public static class AdvancedLogPolicies {

		@SerializedName("ActionType")
		private String actionType;

		@SerializedName("SrcType")
		private String srcType;

		@SerializedName("PolicyId")
		private String policyId;

		@SerializedName("DestRegion")
		private String destRegion;

		@SerializedName("LogRetentionValue")
		private String logRetentionValue;

		@SerializedName("LogRetentionType")
		private String logRetentionType;

		@SerializedName("SrcRegion")
		private String srcRegion;

		@SerializedName("DestType")
		private String destType;

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

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getDestRegion() {
			return this.destRegion;
		}

		public void setDestRegion(String destRegion) {
			this.destRegion = destRegion;
		}

		public String getLogRetentionValue() {
			return this.logRetentionValue;
		}

		public void setLogRetentionValue(String logRetentionValue) {
			this.logRetentionValue = logRetentionValue;
		}

		public String getLogRetentionType() {
			return this.logRetentionType;
		}

		public void setLogRetentionType(String logRetentionType) {
			this.logRetentionType = logRetentionType;
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

		public Integer getEnableLogBackup() {
			return this.enableLogBackup;
		}

		public void setEnableLogBackup(Integer enableLogBackup) {
			this.enableLogBackup = enableLogBackup;
		}
	}

	@Override
	public Class<ModifyLogBackupPolicyResponse> getResponseClass() {
		return ModifyLogBackupPolicyResponse.class;
	}

}
