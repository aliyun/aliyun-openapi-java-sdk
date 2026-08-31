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
public class ListApprovalTasksByUserRequest extends RpcAcsRequest<ListApprovalTasksByUserResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListApprovalTasksByUserRequest() {
		super("dataphin-public", "2023-06-30", "ListApprovalTasksByUser", "Dataphin");
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

		@SerializedName("SubmittedFrom")
		private String submittedFrom;

		@SerializedName("RelationType")
		private String relationType;

		@SerializedName("ApprovalType")
		private String approvalType;

		@SerializedName("SubmittedTo")
		private String submittedTo;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("Status")
		private String status;

		public String getSubmittedFrom() {
			return this.submittedFrom;
		}

		public void setSubmittedFrom(String submittedFrom) {
			this.submittedFrom = submittedFrom;
		}

		public String getRelationType() {
			return this.relationType;
		}

		public void setRelationType(String relationType) {
			this.relationType = relationType;
		}

		public String getApprovalType() {
			return this.approvalType;
		}

		public void setApprovalType(String approvalType) {
			this.approvalType = approvalType;
		}

		public String getSubmittedTo() {
			return this.submittedTo;
		}

		public void setSubmittedTo(String submittedTo) {
			this.submittedTo = submittedTo;
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

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public Class<ListApprovalTasksByUserResponse> getResponseClass() {
		return ListApprovalTasksByUserResponse.class;
	}

}
