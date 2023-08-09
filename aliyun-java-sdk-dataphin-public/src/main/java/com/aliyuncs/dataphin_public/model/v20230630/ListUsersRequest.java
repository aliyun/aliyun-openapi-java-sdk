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
public class ListUsersRequest extends RpcAcsRequest<ListUsersResponse> {
	   

	private Long opTenantId;

	@SerializedName("userPagedQuery")
	private UserPagedQuery userPagedQuery;
	public ListUsersRequest() {
		super("dataphin-public", "2023-06-30", "ListUsers");
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

	public UserPagedQuery getUserPagedQuery() {
		return this.userPagedQuery;
	}

	public void setUserPagedQuery(UserPagedQuery userPagedQuery) {
		this.userPagedQuery = userPagedQuery;	
		if (userPagedQuery != null) {
			putQueryParameter("UserPagedQuery" , new Gson().toJson(userPagedQuery));
		}	
	}

	public static class UserPagedQuery {

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
	public Class<ListUsersResponse> getResponseClass() {
		return ListUsersResponse.class;
	}

}
