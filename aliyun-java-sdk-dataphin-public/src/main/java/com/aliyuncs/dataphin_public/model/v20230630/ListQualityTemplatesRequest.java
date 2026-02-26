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
public class ListQualityTemplatesRequest extends RpcAcsRequest<ListQualityTemplatesResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListQualityTemplatesRequest() {
		super("dataphin-public", "2023-06-30", "ListQualityTemplates");
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

	public ListQuery getListQuery() {
		return this.listQuery;
	}

	public void setListQuery(ListQuery listQuery) {
		this.listQuery = listQuery;	
		if (listQuery != null) {
			putBodyParameter("ListQuery" , new Gson().toJson(listQuery));
		}	
	}

	public static class ListQuery {

		@SerializedName("WatchTypeList")
		private List<String> watchTypeList;

		@SerializedName("TemplateTypeList")
		private List<String> templateTypeList;

		@SerializedName("CatalogList")
		private List<String> catalogList;

		@SerializedName("TemplateOwnerList")
		private List<String> templateOwnerList;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("TemplateSourceList")
		private List<String> templateSourceList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("SupportDataSourceTypeList")
		private List<String> supportDataSourceTypeList;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("CurrentUserOwned")
		private Boolean currentUserOwned;

		public List<String> getWatchTypeList() {
			return this.watchTypeList;
		}

		public void setWatchTypeList(List<String> watchTypeList) {
			this.watchTypeList = watchTypeList;
		}

		public List<String> getTemplateTypeList() {
			return this.templateTypeList;
		}

		public void setTemplateTypeList(List<String> templateTypeList) {
			this.templateTypeList = templateTypeList;
		}

		public List<String> getCatalogList() {
			return this.catalogList;
		}

		public void setCatalogList(List<String> catalogList) {
			this.catalogList = catalogList;
		}

		public List<String> getTemplateOwnerList() {
			return this.templateOwnerList;
		}

		public void setTemplateOwnerList(List<String> templateOwnerList) {
			this.templateOwnerList = templateOwnerList;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public List<String> getTemplateSourceList() {
			return this.templateSourceList;
		}

		public void setTemplateSourceList(List<String> templateSourceList) {
			this.templateSourceList = templateSourceList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<String> getSupportDataSourceTypeList() {
			return this.supportDataSourceTypeList;
		}

		public void setSupportDataSourceTypeList(List<String> supportDataSourceTypeList) {
			this.supportDataSourceTypeList = supportDataSourceTypeList;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public Boolean getCurrentUserOwned() {
			return this.currentUserOwned;
		}

		public void setCurrentUserOwned(Boolean currentUserOwned) {
			this.currentUserOwned = currentUserOwned;
		}
	}

	@Override
	public Class<ListQualityTemplatesResponse> getResponseClass() {
		return ListQualityTemplatesResponse.class;
	}

}
