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
public class ListKgEntityRequest extends RpcAcsRequest<ListKgEntityResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("listQuery")
	private ListQuery listQuery;

	private String entityType;

	private String workspaceId;
	public ListKgEntityRequest() {
		super("dataphin-public", "2023-06-30", "ListKgEntity", "Dataphin");
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

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putQueryParameter("EntityType", entityType);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class ListQuery {

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("PageNum")
		private Integer pageNum;

		@SerializedName("FilterList")
		private List<FilterListItem> filterList;

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

		public List<FilterListItem> getFilterList() {
			return this.filterList;
		}

		public void setFilterList(List<FilterListItem> filterList) {
			this.filterList = filterList;
		}

		public static class FilterListItem {

			@SerializedName("Op")
			private String op;

			@SerializedName("Value")
			private String value;

			@SerializedName("PropertyCode")
			private String propertyCode;

			public String getOp() {
				return this.op;
			}

			public void setOp(String op) {
				this.op = op;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getPropertyCode() {
				return this.propertyCode;
			}

			public void setPropertyCode(String propertyCode) {
				this.propertyCode = propertyCode;
			}
		}
	}

	@Override
	public Class<ListKgEntityResponse> getResponseClass() {
		return ListKgEntityResponse.class;
	}

}
