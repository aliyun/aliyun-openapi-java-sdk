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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RevokeDataServiceApiRequest extends RpcAcsRequest<RevokeDataServiceApiResponse> {
	   

	private Long opTenantId;

	@SerializedName("revokeCommand")
	private RevokeCommand revokeCommand;

	private Integer projectId;
	public RevokeDataServiceApiRequest() {
		super("dataphin-public", "2023-06-30", "RevokeDataServiceApi");
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

	public RevokeCommand getRevokeCommand() {
		return this.revokeCommand;
	}

	public void setRevokeCommand(RevokeCommand revokeCommand) {
		this.revokeCommand = revokeCommand;	
		if (revokeCommand != null) {
			putBodyParameter("RevokeCommand" , new Gson().toJson(revokeCommand));
		}	
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public static class RevokeCommand {

		@SerializedName("Reason")
		private String reason;

		@SerializedName("AppId")
		private Integer appId;

		@SerializedName("Env")
		private String env;

		@SerializedName("UserId")
		private String userId;

		@SerializedName("ApiId")
		private Long apiId;

		@SerializedName("AuthType")
		private String authType;

		@SerializedName("GranteeType")
		private String granteeType;

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Integer getAppId() {
			return this.appId;
		}

		public void setAppId(Integer appId) {
			this.appId = appId;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Long getApiId() {
			return this.apiId;
		}

		public void setApiId(Long apiId) {
			this.apiId = apiId;
		}

		public String getAuthType() {
			return this.authType;
		}

		public void setAuthType(String authType) {
			this.authType = authType;
		}

		public String getGranteeType() {
			return this.granteeType;
		}

		public void setGranteeType(String granteeType) {
			this.granteeType = granteeType;
		}
	}

	@Override
	public Class<RevokeDataServiceApiResponse> getResponseClass() {
		return RevokeDataServiceApiResponse.class;
	}

}
