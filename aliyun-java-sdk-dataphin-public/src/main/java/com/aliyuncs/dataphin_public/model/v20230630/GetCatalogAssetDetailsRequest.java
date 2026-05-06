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
public class GetCatalogAssetDetailsRequest extends RpcAcsRequest<GetCatalogAssetDetailsResponse> {
	   

	private Long opTenantId;

	@SerializedName("getCatalogAssetDetailsQuery")
	private GetCatalogAssetDetailsQuery getCatalogAssetDetailsQuery;
	public GetCatalogAssetDetailsRequest() {
		super("dataphin-public", "2023-06-30", "GetCatalogAssetDetails");
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

	public GetCatalogAssetDetailsQuery getGetCatalogAssetDetailsQuery() {
		return this.getCatalogAssetDetailsQuery;
	}

	public void setGetCatalogAssetDetailsQuery(GetCatalogAssetDetailsQuery getCatalogAssetDetailsQuery) {
		this.getCatalogAssetDetailsQuery = getCatalogAssetDetailsQuery;	
		if (getCatalogAssetDetailsQuery != null) {
			putBodyParameter("GetCatalogAssetDetailsQuery" , new Gson().toJson(getCatalogAssetDetailsQuery));
		}	
	}

	public static class GetCatalogAssetDetailsQuery {

		@SerializedName("IncludeColumns")
		private Boolean includeColumns;

		@SerializedName("Guid")
		private String guid;

		@SerializedName("IncludeDetailedAttributes")
		private Boolean includeDetailedAttributes;

		public Boolean getIncludeColumns() {
			return this.includeColumns;
		}

		public void setIncludeColumns(Boolean includeColumns) {
			this.includeColumns = includeColumns;
		}

		public String getGuid() {
			return this.guid;
		}

		public void setGuid(String guid) {
			this.guid = guid;
		}

		public Boolean getIncludeDetailedAttributes() {
			return this.includeDetailedAttributes;
		}

		public void setIncludeDetailedAttributes(Boolean includeDetailedAttributes) {
			this.includeDetailedAttributes = includeDetailedAttributes;
		}
	}

	@Override
	public Class<GetCatalogAssetDetailsResponse> getResponseClass() {
		return GetCatalogAssetDetailsResponse.class;
	}

}
