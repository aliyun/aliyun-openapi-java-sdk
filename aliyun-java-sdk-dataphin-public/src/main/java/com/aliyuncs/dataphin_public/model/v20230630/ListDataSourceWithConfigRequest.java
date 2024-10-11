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
public class ListDataSourceWithConfigRequest extends RpcAcsRequest<ListDataSourceWithConfigResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListDataSourceWithConfigRequest() {
		super("dataphin-public", "2023-06-30", "ListDataSourceWithConfig");
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

		@SerializedName("TypeList")
		private List<String> typeList;

		@SerializedName("ScopeList")
		private List<String> scopeList;

		@SerializedName("Name")
		private String name;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("OwnerList")
		private List<String> ownerList;

		@SerializedName("Tag")
		private String tag;

		@SerializedName("Page")
		private Integer page;

		public List<String> getTypeList() {
			return this.typeList;
		}

		public void setTypeList(List<String> typeList) {
			this.typeList = typeList;
		}

		public List<String> getScopeList() {
			return this.scopeList;
		}

		public void setScopeList(List<String> scopeList) {
			this.scopeList = scopeList;
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

		public List<String> getOwnerList() {
			return this.ownerList;
		}

		public void setOwnerList(List<String> ownerList) {
			this.ownerList = ownerList;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}
	}

	@Override
	public Class<ListDataSourceWithConfigResponse> getResponseClass() {
		return ListDataSourceWithConfigResponse.class;
	}

}
