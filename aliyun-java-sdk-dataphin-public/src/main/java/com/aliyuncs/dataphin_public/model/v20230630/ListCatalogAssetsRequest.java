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
public class ListCatalogAssetsRequest extends RpcAcsRequest<ListCatalogAssetsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listCatalogAssetsQuery")
	private ListCatalogAssetsQuery listCatalogAssetsQuery;
	public ListCatalogAssetsRequest() {
		super("dataphin-public", "2023-06-30", "ListCatalogAssets");
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

	public ListCatalogAssetsQuery getListCatalogAssetsQuery() {
		return this.listCatalogAssetsQuery;
	}

	public void setListCatalogAssetsQuery(ListCatalogAssetsQuery listCatalogAssetsQuery) {
		this.listCatalogAssetsQuery = listCatalogAssetsQuery;	
		if (listCatalogAssetsQuery != null) {
			putBodyParameter("ListCatalogAssetsQuery" , new Gson().toJson(listCatalogAssetsQuery));
		}	
	}

	public static class ListCatalogAssetsQuery {

		@SerializedName("QueryMode")
		private String queryMode;

		@SerializedName("Name")
		private String name;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("PageNum")
		private Integer pageNum;

		@SerializedName("AssetType")
		private String assetType;

		public String getQueryMode() {
			return this.queryMode;
		}

		public void setQueryMode(String queryMode) {
			this.queryMode = queryMode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public String getAssetType() {
			return this.assetType;
		}

		public void setAssetType(String assetType) {
			this.assetType = assetType;
		}
	}

	@Override
	public Class<ListCatalogAssetsResponse> getResponseClass() {
		return ListCatalogAssetsResponse.class;
	}

}
