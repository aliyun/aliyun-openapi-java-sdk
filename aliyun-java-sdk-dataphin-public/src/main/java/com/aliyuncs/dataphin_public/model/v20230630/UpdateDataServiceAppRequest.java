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
public class UpdateDataServiceAppRequest extends RpcAcsRequest<UpdateDataServiceAppResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateDataServiceAppRequest() {
		super("dataphin-public", "2023-06-30", "UpdateDataServiceApp");
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

		@SerializedName("OwnerIds")
		private List<String> ownerIds;

		@SerializedName("AppName")
		private String appName;

		@SerializedName("AppId")
		private Integer appId;

		@SerializedName("Scenarios")
		private String scenarios;

		@SerializedName("AppGroupId")
		private Integer appGroupId;

		public List<String> getOwnerIds() {
			return this.ownerIds;
		}

		public void setOwnerIds(List<String> ownerIds) {
			this.ownerIds = ownerIds;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getAppId() {
			return this.appId;
		}

		public void setAppId(Integer appId) {
			this.appId = appId;
		}

		public String getScenarios() {
			return this.scenarios;
		}

		public void setScenarios(String scenarios) {
			this.scenarios = scenarios;
		}

		public Integer getAppGroupId() {
			return this.appGroupId;
		}

		public void setAppGroupId(Integer appGroupId) {
			this.appGroupId = appGroupId;
		}
	}

	@Override
	public Class<UpdateDataServiceAppResponse> getResponseClass() {
		return UpdateDataServiceAppResponse.class;
	}

}
