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
public class AddUserGroupMemberRequest extends RpcAcsRequest<AddUserGroupMemberResponse> {
	   

	private Long opTenantId;

	@SerializedName("addCommand")
	private AddCommand addCommand;
	public AddUserGroupMemberRequest() {
		super("dataphin-public", "2023-06-30", "AddUserGroupMember");
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

	public AddCommand getAddCommand() {
		return this.addCommand;
	}

	public void setAddCommand(AddCommand addCommand) {
		this.addCommand = addCommand;	
		if (addCommand != null) {
			putBodyParameter("AddCommand" , new Gson().toJson(addCommand));
		}	
	}

	public static class AddCommand {

		@SerializedName("UserIdList")
		private List<String> userIdList;

		@SerializedName("UserGroupId")
		private String userGroupId;

		public List<String> getUserIdList() {
			return this.userIdList;
		}

		public void setUserIdList(List<String> userIdList) {
			this.userIdList = userIdList;
		}

		public String getUserGroupId() {
			return this.userGroupId;
		}

		public void setUserGroupId(String userGroupId) {
			this.userGroupId = userGroupId;
		}
	}

	@Override
	public Class<AddUserGroupMemberResponse> getResponseClass() {
		return AddUserGroupMemberResponse.class;
	}

}
