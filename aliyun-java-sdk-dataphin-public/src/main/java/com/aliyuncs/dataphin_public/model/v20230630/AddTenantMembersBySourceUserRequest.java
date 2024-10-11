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
public class AddTenantMembersBySourceUserRequest extends RpcAcsRequest<AddTenantMembersBySourceUserResponse> {
	   

	private Long opTenantId;

	@SerializedName("addCommand")
	private AddCommand addCommand;
	public AddTenantMembersBySourceUserRequest() {
		super("dataphin-public", "2023-06-30", "AddTenantMembersBySourceUser");
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

		@SerializedName("SourceUserList")
		private List<SourceUserListItem> sourceUserList;

		public List<SourceUserListItem> getSourceUserList() {
			return this.sourceUserList;
		}

		public void setSourceUserList(List<SourceUserListItem> sourceUserList) {
			this.sourceUserList = sourceUserList;
		}

		public static class SourceUserListItem {

			@SerializedName("SourceId")
			private String sourceId;

			@SerializedName("AccountName")
			private String accountName;

			@SerializedName("Mail")
			private String mail;

			@SerializedName("DisplayName")
			private String displayName;

			@SerializedName("MobilePhone")
			private String mobilePhone;

			@SerializedName("DingNumber")
			private String dingNumber;

			public String getSourceId() {
				return this.sourceId;
			}

			public void setSourceId(String sourceId) {
				this.sourceId = sourceId;
			}

			public String getAccountName() {
				return this.accountName;
			}

			public void setAccountName(String accountName) {
				this.accountName = accountName;
			}

			public String getMail() {
				return this.mail;
			}

			public void setMail(String mail) {
				this.mail = mail;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
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
		}
	}

	@Override
	public Class<AddTenantMembersBySourceUserResponse> getResponseClass() {
		return AddTenantMembersBySourceUserResponse.class;
	}

}
