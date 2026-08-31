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
public class ListGovernObjectsRequest extends RpcAcsRequest<ListGovernObjectsResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListGovernObjectsRequest() {
		super("dataphin-public", "2023-06-30", "ListGovernObjects", "Dataphin");
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

		@SerializedName("Owner")
		private String owner;

		@SerializedName("GovernItemType")
		private String governItemType;

		@SerializedName("StatusList")
		private List<String> statusList;

		@SerializedName("ProjectNames")
		private List<String> projectNames;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("ViewType")
		private String viewType;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("PageNumber")
		private Integer pageNumber;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getGovernItemType() {
			return this.governItemType;
		}

		public void setGovernItemType(String governItemType) {
			this.governItemType = governItemType;
		}

		public List<String> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
		}

		public List<String> getProjectNames() {
			return this.projectNames;
		}

		public void setProjectNames(List<String> projectNames) {
			this.projectNames = projectNames;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getViewType() {
			return this.viewType;
		}

		public void setViewType(String viewType) {
			this.viewType = viewType;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}
	}

	@Override
	public Class<ListGovernObjectsResponse> getResponseClass() {
		return ListGovernObjectsResponse.class;
	}

}
