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
public class UpdateTenantMembersRequest extends RpcAcsRequest<UpdateTenantMembersResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateTenantMembersCommand")
	private UpdateTenantMembersCommand updateTenantMembersCommand;
	public UpdateTenantMembersRequest() {
		super("dataphin-public", "2023-06-30", "UpdateTenantMembers");
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

	public UpdateTenantMembersCommand getUpdateTenantMembersCommand() {
		return this.updateTenantMembersCommand;
	}

	public void setUpdateTenantMembersCommand(UpdateTenantMembersCommand updateTenantMembersCommand) {
		this.updateTenantMembersCommand = updateTenantMembersCommand;	
		if (updateTenantMembersCommand != null) {
			putQueryParameter("UpdateTenantMembersCommand" , new Gson().toJson(updateTenantMembersCommand));
		}	
	}

	public static class UpdateTenantMembersCommand {

		@SerializedName("UserContactIncludeRolesList")
		private List<UserContactIncludeRolesListItem> userContactIncludeRolesList;

		public List<UserContactIncludeRolesListItem> getUserContactIncludeRolesList() {
			return this.userContactIncludeRolesList;
		}

		public void setUserContactIncludeRolesList(List<UserContactIncludeRolesListItem> userContactIncludeRolesList) {
			this.userContactIncludeRolesList = userContactIncludeRolesList;
		}

		public static class UserContactIncludeRolesListItem {

			@SerializedName("Mail")
			private String mail;

			@SerializedName("MobilePhone")
			private String mobilePhone;

			@SerializedName("DingNumber")
			private String dingNumber;

			@SerializedName("MemberRoles")
			private List<String> memberRoles;

			@SerializedName("UserId")
			private String userId;

			public String getMail() {
				return this.mail;
			}

			public void setMail(String mail) {
				this.mail = mail;
			}

			public String getMobilePhone() {
				return this.mobilePhone;
			}

			public void setMobilePhone(String mobilePhone) {
				this.mobilePhone = mobilePhone;
			}

			public String getDingNumber() {
				return this.dingNumber;
			}

			public void setDingNumber(String dingNumber) {
				this.dingNumber = dingNumber;
			}

			public List<String> getMemberRoles() {
				return this.memberRoles;
			}

			public void setMemberRoles(List<String> memberRoles) {
				this.memberRoles = memberRoles;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public Class<UpdateTenantMembersResponse> getResponseClass() {
		return UpdateTenantMembersResponse.class;
	}

}
