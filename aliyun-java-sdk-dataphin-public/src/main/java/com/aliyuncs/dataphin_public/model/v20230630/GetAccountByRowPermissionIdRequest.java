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
public class GetAccountByRowPermissionIdRequest extends RpcAcsRequest<GetAccountByRowPermissionIdResponse> {
	   

	private Long opTenantId;

	@SerializedName("getAccountByRowPermissionIdQuery")
	private GetAccountByRowPermissionIdQuery getAccountByRowPermissionIdQuery;
	public GetAccountByRowPermissionIdRequest() {
		super("dataphin-public", "2023-06-30", "GetAccountByRowPermissionId");
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

	public GetAccountByRowPermissionIdQuery getGetAccountByRowPermissionIdQuery() {
		return this.getAccountByRowPermissionIdQuery;
	}

	public void setGetAccountByRowPermissionIdQuery(GetAccountByRowPermissionIdQuery getAccountByRowPermissionIdQuery) {
		this.getAccountByRowPermissionIdQuery = getAccountByRowPermissionIdQuery;	
		if (getAccountByRowPermissionIdQuery != null) {
			putBodyParameter("GetAccountByRowPermissionIdQuery" , new Gson().toJson(getAccountByRowPermissionIdQuery));
		}	
	}

	public static class GetAccountByRowPermissionIdQuery {

		@SerializedName("RuleIds")
		private List<Long> ruleIds;

		@SerializedName("RowPermissionId")
		private Long rowPermissionId;

		public List<Long> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<Long> ruleIds) {
			this.ruleIds = ruleIds;
		}

		public Long getRowPermissionId() {
			return this.rowPermissionId;
		}

		public void setRowPermissionId(Long rowPermissionId) {
			this.rowPermissionId = rowPermissionId;
		}
	}

	@Override
	public Class<GetAccountByRowPermissionIdResponse> getResponseClass() {
		return GetAccountByRowPermissionIdResponse.class;
	}

}
