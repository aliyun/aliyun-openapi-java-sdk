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
public class GetAssetAttributesRequest extends RpcAcsRequest<GetAssetAttributesResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("queryCommand")
	private QueryCommand queryCommand;
	public GetAssetAttributesRequest() {
		super("dataphin-public", "2023-06-30", "GetAssetAttributes", "Dataphin");
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

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public QueryCommand getQueryCommand() {
		return this.queryCommand;
	}

	public void setQueryCommand(QueryCommand queryCommand) {
		this.queryCommand = queryCommand;	
		if (queryCommand != null) {
			putBodyParameter("QueryCommand" , new Gson().toJson(queryCommand));
		}	
	}

	public static class QueryCommand {

		@SerializedName("GuidList")
		private List<String> guidList;

		@SerializedName("AttributeCodeList")
		private List<String> attributeCodeList;

		public List<String> getGuidList() {
			return this.guidList;
		}

		public void setGuidList(List<String> guidList) {
			this.guidList = guidList;
		}

		public List<String> getAttributeCodeList() {
			return this.attributeCodeList;
		}

		public void setAttributeCodeList(List<String> attributeCodeList) {
			this.attributeCodeList = attributeCodeList;
		}
	}

	@Override
	public Class<GetAssetAttributesResponse> getResponseClass() {
		return GetAssetAttributesResponse.class;
	}

}
