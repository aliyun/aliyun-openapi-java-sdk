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
public class ListRowPermissionByUserIdRequest extends RpcAcsRequest<ListRowPermissionByUserIdResponse> {
	   

	private Long opTenantId;

	@SerializedName("listRowPermissionByUserIdQuery")
	private ListRowPermissionByUserIdQuery listRowPermissionByUserIdQuery;
	public ListRowPermissionByUserIdRequest() {
		super("dataphin-public", "2023-06-30", "ListRowPermissionByUserId");
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

	public ListRowPermissionByUserIdQuery getListRowPermissionByUserIdQuery() {
		return this.listRowPermissionByUserIdQuery;
	}

	public void setListRowPermissionByUserIdQuery(ListRowPermissionByUserIdQuery listRowPermissionByUserIdQuery) {
		this.listRowPermissionByUserIdQuery = listRowPermissionByUserIdQuery;	
		if (listRowPermissionByUserIdQuery != null) {
			putBodyParameter("ListRowPermissionByUserIdQuery" , new Gson().toJson(listRowPermissionByUserIdQuery));
		}	
	}

	public static class ListRowPermissionByUserIdQuery {

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("PageNum")
		private Integer pageNum;

		@SerializedName("Operator")
		private String operator;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}
	}

	@Override
	public Class<ListRowPermissionByUserIdResponse> getResponseClass() {
		return ListRowPermissionByUserIdResponse.class;
	}

}
