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
public class BatchAddTenantMemberRequest extends RpcAcsRequest<BatchAddTenantMemberResponse> {
	   

	private Long opTenantId;

	@SerializedName("batchAddTenantMemberCommand")
	private BatchAddTenantMemberCommand batchAddTenantMemberCommand;
	public BatchAddTenantMemberRequest() {
		super("dataphin-public", "2023-06-30", "BatchAddTenantMember");
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

	public BatchAddTenantMemberCommand getBatchAddTenantMemberCommand() {
		return this.batchAddTenantMemberCommand;
	}

	public void setBatchAddTenantMemberCommand(BatchAddTenantMemberCommand batchAddTenantMemberCommand) {
		this.batchAddTenantMemberCommand = batchAddTenantMemberCommand;	
		if (batchAddTenantMemberCommand != null) {
			putQueryParameter("BatchAddTenantMemberCommand" , new Gson().toJson(batchAddTenantMemberCommand));
		}	
	}

	public static class BatchAddTenantMemberCommand {

		@SerializedName("UserIds")
		private List<String> userIds;

		@SerializedName("MemberRoles")
		private List<String> memberRoles;

		public List<String> getUserIds() {
			return this.userIds;
		}

		public void setUserIds(List<String> userIds) {
			this.userIds = userIds;
		}

		public List<String> getMemberRoles() {
			return this.memberRoles;
		}

		public void setMemberRoles(List<String> memberRoles) {
			this.memberRoles = memberRoles;
		}
	}

	@Override
	public Class<BatchAddTenantMemberResponse> getResponseClass() {
		return BatchAddTenantMemberResponse.class;
	}

}
