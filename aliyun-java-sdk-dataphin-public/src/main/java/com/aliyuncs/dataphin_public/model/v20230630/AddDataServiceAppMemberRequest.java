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
public class AddDataServiceAppMemberRequest extends RpcAcsRequest<AddDataServiceAppMemberResponse> {
	   

	private Long opTenantId;

	@SerializedName("addCommand")
	private AddCommand addCommand;
	public AddDataServiceAppMemberRequest() {
		super("dataphin-public", "2023-06-30", "AddDataServiceAppMember");
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

		@SerializedName("MemberList")
		private List<MemberListItem> memberList;

		@SerializedName("AppId")
		private Integer appId;

		public List<MemberListItem> getMemberList() {
			return this.memberList;
		}

		public void setMemberList(List<MemberListItem> memberList) {
			this.memberList = memberList;
		}

		public Integer getAppId() {
			return this.appId;
		}

		public void setAppId(Integer appId) {
			this.appId = appId;
		}

		public static class MemberListItem {

			@SerializedName("UserId")
			private String userId;

			@SerializedName("EffectiveEnd")
			private String effectiveEnd;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getEffectiveEnd() {
				return this.effectiveEnd;
			}

			public void setEffectiveEnd(String effectiveEnd) {
				this.effectiveEnd = effectiveEnd;
			}
		}
	}

	@Override
	public Class<AddDataServiceAppMemberResponse> getResponseClass() {
		return AddDataServiceAppMemberResponse.class;
	}

}
