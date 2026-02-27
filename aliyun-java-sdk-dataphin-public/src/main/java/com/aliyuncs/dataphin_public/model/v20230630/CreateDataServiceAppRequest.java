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
public class CreateDataServiceAppRequest extends RpcAcsRequest<CreateDataServiceAppResponse> {
	   

	private Long opTenantId;

	@SerializedName("createCommand")
	private CreateCommand createCommand;
	public CreateDataServiceAppRequest() {
		super("dataphin-public", "2023-06-30", "CreateDataServiceApp");
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

	public CreateCommand getCreateCommand() {
		return this.createCommand;
	}

	public void setCreateCommand(CreateCommand createCommand) {
		this.createCommand = createCommand;	
		if (createCommand != null) {
			putBodyParameter("CreateCommand" , new Gson().toJson(createCommand));
		}	
	}

	public static class CreateCommand {

		@SerializedName("OwnerIds")
		private List<String> ownerIds;

		@SerializedName("AppName")
		private String appName;

		@SerializedName("AppSecret")
		private String appSecret;

		@SerializedName("AppKey")
		private String appKey;

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

		public String getAppSecret() {
			return this.appSecret;
		}

		public void setAppSecret(String appSecret) {
			this.appSecret = appSecret;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
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
	public Class<CreateDataServiceAppResponse> getResponseClass() {
		return CreateDataServiceAppResponse.class;
	}

}
