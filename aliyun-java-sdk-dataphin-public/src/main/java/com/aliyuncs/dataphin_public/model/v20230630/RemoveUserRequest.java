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
public class RemoveUserRequest extends RpcAcsRequest<RemoveUserResponse> {
	   

	private Long opTenantId;

	@SerializedName("removeUserCommand")
	private RemoveUserCommand removeUserCommand;
	public RemoveUserRequest() {
		super("dataphin-public", "2023-06-30", "RemoveUser");
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

	public RemoveUserCommand getRemoveUserCommand() {
		return this.removeUserCommand;
	}

	public void setRemoveUserCommand(RemoveUserCommand removeUserCommand) {
		this.removeUserCommand = removeUserCommand;	
		if (removeUserCommand != null) {
			putQueryParameter("RemoveUserCommand" , new Gson().toJson(removeUserCommand));
		}	
	}

	public static class RemoveUserCommand {

		@SerializedName("SourceId")
		private String sourceId;

		@SerializedName("SourceType")
		private String sourceType;

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}
	}

	@Override
	public Class<RemoveUserResponse> getResponseClass() {
		return RemoveUserResponse.class;
	}

}
