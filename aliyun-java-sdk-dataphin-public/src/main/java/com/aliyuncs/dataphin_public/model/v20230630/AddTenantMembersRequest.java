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
public class AddTenantMembersRequest extends RpcAcsRequest<AddTenantMembersResponse> {
	   

	private Long opTenantId;

	@SerializedName("addCommand")
	private AddCommand addCommand;
	public AddTenantMembersRequest() {
		super("dataphin-public", "2023-06-30", "AddTenantMembers");
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

		@SerializedName("UserList")
		private List<UserListItem> userList;

		public List<UserListItem> getUserList() {
			return this.userList;
		}

		public void setUserList(List<UserListItem> userList) {
			this.userList = userList;
		}

		public static class UserListItem {

			@SerializedName("RoleList")
			private List<String> roleList;

			@SerializedName("Id")
			private String id;

			public List<String> getRoleList() {
				return this.roleList;
			}

			public void setRoleList(List<String> roleList) {
				this.roleList = roleList;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public Class<AddTenantMembersResponse> getResponseClass() {
		return AddTenantMembersResponse.class;
	}

}
