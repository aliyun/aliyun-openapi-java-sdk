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
public class ListBizEntitiesRequest extends RpcAcsRequest<ListBizEntitiesResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListBizEntitiesRequest() {
		super("dataphin-public", "2023-06-30", "ListBizEntities");
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

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("FilterCriteria")
		private FilterCriteria filterCriteria;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public FilterCriteria getFilterCriteria() {
			return this.filterCriteria;
		}

		public void setFilterCriteria(FilterCriteria filterCriteria) {
			this.filterCriteria = filterCriteria;
		}

		public static class FilterCriteria {

			@SerializedName("SubTypeList")
			private List<String> subTypeList;

			@SerializedName("StatusList")
			private List<String> statusList;

			@SerializedName("HasTableRef")
			private Boolean hasTableRef;

			@SerializedName("OwnerUserIdList")
			private List<String> ownerUserIdList;

			@SerializedName("BizUnitIdList")
			private List<Long> bizUnitIdList;

			@SerializedName("DataDomainIdList")
			private List<Long> dataDomainIdList;

			@SerializedName("BizUnitNameList")
			private List<String> bizUnitNameList;

			@SerializedName("DataDomainNameList")
			private List<String> dataDomainNameList;

			public List<String> getSubTypeList() {
				return this.subTypeList;
			}

			public void setSubTypeList(List<String> subTypeList) {
				this.subTypeList = subTypeList;
			}

			public List<String> getStatusList() {
				return this.statusList;
			}

			public void setStatusList(List<String> statusList) {
				this.statusList = statusList;
			}

			public Boolean getHasTableRef() {
				return this.hasTableRef;
			}

			public void setHasTableRef(Boolean hasTableRef) {
				this.hasTableRef = hasTableRef;
			}

			public List<String> getOwnerUserIdList() {
				return this.ownerUserIdList;
			}

			public void setOwnerUserIdList(List<String> ownerUserIdList) {
				this.ownerUserIdList = ownerUserIdList;
			}

			public List<Long> getBizUnitIdList() {
				return this.bizUnitIdList;
			}

			public void setBizUnitIdList(List<Long> bizUnitIdList) {
				this.bizUnitIdList = bizUnitIdList;
			}

			public List<Long> getDataDomainIdList() {
				return this.dataDomainIdList;
			}

			public void setDataDomainIdList(List<Long> dataDomainIdList) {
				this.dataDomainIdList = dataDomainIdList;
			}

			public List<String> getBizUnitNameList() {
				return this.bizUnitNameList;
			}

			public void setBizUnitNameList(List<String> bizUnitNameList) {
				this.bizUnitNameList = bizUnitNameList;
			}

			public List<String> getDataDomainNameList() {
				return this.dataDomainNameList;
			}

			public void setDataDomainNameList(List<String> dataDomainNameList) {
				this.dataDomainNameList = dataDomainNameList;
			}
		}
	}

	@Override
	public Class<ListBizEntitiesResponse> getResponseClass() {
		return ListBizEntitiesResponse.class;
	}

}
