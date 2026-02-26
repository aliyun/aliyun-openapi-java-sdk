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
public class ApplyDataServiceAppRequest extends RpcAcsRequest<ApplyDataServiceAppResponse> {
	   

	private Long opTenantId;

	@SerializedName("applyCommand")
	private ApplyCommand applyCommand;

	private Integer projectId;
	public ApplyDataServiceAppRequest() {
		super("dataphin-public", "2023-06-30", "ApplyDataServiceApp");
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

	public ApplyCommand getApplyCommand() {
		return this.applyCommand;
	}

	public void setApplyCommand(ApplyCommand applyCommand) {
		this.applyCommand = applyCommand;	
		if (applyCommand != null) {
			putBodyParameter("ApplyCommand" , new Gson().toJson(applyCommand));
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

	public static class ApplyCommand {

		@SerializedName("Reason")
		private String reason;

		@SerializedName("AppId")
		private Integer appId;

		@SerializedName("ExpireDate")
		private String expireDate;

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

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}
	}

	@Override
	public Class<ApplyDataServiceAppResponse> getResponseClass() {
		return ApplyDataServiceAppResponse.class;
	}

}
