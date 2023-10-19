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
public class QueryPagedAddableUsersRequest extends RpcAcsRequest<QueryPagedAddableUsersResponse> {
	   

	private Long opTenantId;

	@SerializedName("addableUserPagedQuery")
	private AddableUserPagedQuery addableUserPagedQuery;
	public QueryPagedAddableUsersRequest() {
		super("dataphin-public", "2023-06-30", "QueryPagedAddableUsers");
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

	public AddableUserPagedQuery getAddableUserPagedQuery() {
		return this.addableUserPagedQuery;
	}

	public void setAddableUserPagedQuery(AddableUserPagedQuery addableUserPagedQuery) {
		this.addableUserPagedQuery = addableUserPagedQuery;	
		if (addableUserPagedQuery != null) {
			putQueryParameter("AddableUserPagedQuery" , new Gson().toJson(addableUserPagedQuery));
		}	
	}

	public static class AddableUserPagedQuery {

		@SerializedName("SearchText")
		private String searchText;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Page")
		private Integer page;

		public String getSearchText() {
			return this.searchText;
		}

		public void setSearchText(String searchText) {
			this.searchText = searchText;
		}

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
	}

	@Override
	public Class<QueryPagedAddableUsersResponse> getResponseClass() {
		return QueryPagedAddableUsersResponse.class;
	}

}
