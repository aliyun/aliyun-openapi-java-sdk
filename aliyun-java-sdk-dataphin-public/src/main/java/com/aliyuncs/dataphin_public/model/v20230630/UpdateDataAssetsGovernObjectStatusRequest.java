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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataAssetsGovernObjectStatusRequest extends RpcAcsRequest<UpdateDataAssetsGovernObjectStatusResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateDataAssetsGovernObjectStatusRequest() {
		super("dataphin-public", "2023-06-30", "UpdateDataAssetsGovernObjectStatus", "Dataphin");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public UpdateCommand getUpdateCommand() {
		return this.updateCommand;
	}

	public void setUpdateCommand(UpdateCommand updateCommand) {
		this.updateCommand = updateCommand;	
		if (updateCommand != null) {
			putBodyParameter("UpdateCommand" , new Gson().toJson(updateCommand));
		}	
	}

	public static class UpdateCommand {

		@SerializedName("TargetStatus")
		private String targetStatus;

		@SerializedName("AlertOwners")
		private Boolean alertOwners;

		@SerializedName("Remark")
		private String remark;

		@SerializedName("GovernObjectIds")
		private List<Long> governObjectIds;

		public String getTargetStatus() {
			return this.targetStatus;
		}

		public void setTargetStatus(String targetStatus) {
			this.targetStatus = targetStatus;
		}

		public Boolean getAlertOwners() {
			return this.alertOwners;
		}

		public void setAlertOwners(Boolean alertOwners) {
			this.alertOwners = alertOwners;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public List<Long> getGovernObjectIds() {
			return this.governObjectIds;
		}

		public void setGovernObjectIds(List<Long> governObjectIds) {
			this.governObjectIds = governObjectIds;
		}
	}

	@Override
	public Class<UpdateDataAssetsGovernObjectStatusResponse> getResponseClass() {
		return UpdateDataAssetsGovernObjectStatusResponse.class;
	}

}
