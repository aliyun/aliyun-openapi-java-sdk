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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetBelongAssetMappingRequest extends RpcAcsRequest<GetBelongAssetMappingResponse> {
	   

	private Long opTenantId;

	@SerializedName("assetMappingQuery")
	private AssetMappingQuery assetMappingQuery;
	public GetBelongAssetMappingRequest() {
		super("dataphin-public", "2023-06-30", "GetBelongAssetMapping");
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

	public AssetMappingQuery getAssetMappingQuery() {
		return this.assetMappingQuery;
	}

	public void setAssetMappingQuery(AssetMappingQuery assetMappingQuery) {
		this.assetMappingQuery = assetMappingQuery;	
		if (assetMappingQuery != null) {
			putBodyParameter("AssetMappingQuery" , new Gson().toJson(assetMappingQuery));
		}	
	}

	public static class AssetMappingQuery {

		@SerializedName("RelationType")
		private String relationType;

		@SerializedName("BelongGuid")
		private String belongGuid;

		public String getRelationType() {
			return this.relationType;
		}

		public void setRelationType(String relationType) {
			this.relationType = relationType;
		}

		public String getBelongGuid() {
			return this.belongGuid;
		}

		public void setBelongGuid(String belongGuid) {
			this.belongGuid = belongGuid;
		}
	}

	@Override
	public Class<GetBelongAssetMappingResponse> getResponseClass() {
		return GetBelongAssetMappingResponse.class;
	}

}
