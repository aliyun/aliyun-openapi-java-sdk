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
public class RemoveDataServiceAppMemberRequest extends RpcAcsRequest<RemoveDataServiceAppMemberResponse> {
	   

	private Long opTenantId;

	@SerializedName("removeCommand")
	private RemoveCommand removeCommand;
	public RemoveDataServiceAppMemberRequest() {
		super("dataphin-public", "2023-06-30", "RemoveDataServiceAppMember");
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

	public RemoveCommand getRemoveCommand() {
		return this.removeCommand;
	}

	public void setRemoveCommand(RemoveCommand removeCommand) {
		this.removeCommand = removeCommand;	
		if (removeCommand != null) {
			putBodyParameter("RemoveCommand" , new Gson().toJson(removeCommand));
		}	
	}

	public static class RemoveCommand {

		@SerializedName("AppId")
		private Integer appId;

		@SerializedName("MemberIds")
		private List<String> memberIds;

		public Integer getAppId() {
			return this.appId;
		}

		public void setAppId(Integer appId) {
			this.appId = appId;
		}

		public List<String> getMemberIds() {
			return this.memberIds;
		}

		public void setMemberIds(List<String> memberIds) {
			this.memberIds = memberIds;
		}
	}

	@Override
	public Class<RemoveDataServiceAppMemberResponse> getResponseClass() {
		return RemoveDataServiceAppMemberResponse.class;
	}

}
