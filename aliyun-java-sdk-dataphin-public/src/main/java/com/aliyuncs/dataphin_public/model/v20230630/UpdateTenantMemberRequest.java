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
public class UpdateTenantMemberRequest extends RpcAcsRequest<UpdateTenantMemberResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateCommand")
	private UpdateCommand updateCommand;
	public UpdateTenantMemberRequest() {
		super("dataphin-public", "2023-06-30", "UpdateTenantMember");
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

		@SerializedName("MemberList")
		private List<MemberListItem> memberList;

		public List<MemberListItem> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<MemberListItem> memberList) {
			this.memberList = memberList;
		}

		public static class MemberListItem {

			@SerializedName("RoleList")
			private List<String> roleList;

			@SerializedName("Mail")
			private String mail;

			@SerializedName("MobilePhone")
			private String mobilePhone;

			@SerializedName("DingNumber")
			private String dingNumber;

			@SerializedName("UserId")
			private String userId;

			public List<String> getRoleList() {
				return this.roleList;
			}

			public void setRoleList(List<String> roleList) {
				this.roleList = roleList;
			}

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

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public Class<UpdateTenantMemberResponse> getResponseClass() {
		return UpdateTenantMemberResponse.class;
	}

}
