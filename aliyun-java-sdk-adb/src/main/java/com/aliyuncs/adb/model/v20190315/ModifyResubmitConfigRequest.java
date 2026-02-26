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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyResubmitConfigRequest extends RpcAcsRequest<ModifyResubmitConfigResponse> {
	   

	private Long resourceOwnerId;

	@SerializedName("rules")
	private List<Rules> rules;

	private String resourceGroupId;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;
	public ModifyResubmitConfigRequest() {
		super("adb", "2019-03-15", "ModifyResubmitConfig", "ads");
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

	public List<Rules> getRules() {
		return this.rules;
	}

	public void setRules(List<Rules> rules) {
		this.rules = rules;	
		if (rules != null) {
			putQueryParameter("Rules" , new Gson().toJson(rules));
		}	
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public static class Rules {

		@SerializedName("PeakMemory")
		private String peakMemory;

		@SerializedName("TargetGroupName")
		private String targetGroupName;

		@SerializedName("ExceedMemoryException")
		private Boolean exceedMemoryException;

		@SerializedName("GroupName")
		private String groupName;

		@SerializedName("QueryTime")
		private String queryTime;

		public String getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(String peakMemory) {
			this.peakMemory = peakMemory;
		}

		public String getTargetGroupName() {
			return this.targetGroupName;
		}

		public void setTargetGroupName(String targetGroupName) {
			this.targetGroupName = targetGroupName;
		}

		public Boolean getExceedMemoryException() {
			return this.exceedMemoryException;
		}

		public void setExceedMemoryException(Boolean exceedMemoryException) {
			this.exceedMemoryException = exceedMemoryException;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(String queryTime) {
			this.queryTime = queryTime;
		}
	}

	@Override
	public Class<ModifyResubmitConfigResponse> getResponseClass() {
		return ModifyResubmitConfigResponse.class;
	}

}
