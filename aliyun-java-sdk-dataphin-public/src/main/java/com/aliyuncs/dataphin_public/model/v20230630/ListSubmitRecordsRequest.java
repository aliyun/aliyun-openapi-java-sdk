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
public class ListSubmitRecordsRequest extends RpcAcsRequest<ListSubmitRecordsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListSubmitRecordsRequest() {
		super("dataphin-public", "2023-06-30", "ListSubmitRecords");
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

		@SerializedName("SearchFilter")
		private SearchFilter searchFilter;

		@SerializedName("Keyword")
		private String keyword;

		public SearchFilter getSearchFilter() {
			return this.searchFilter;
		}

		public void setSearchFilter(SearchFilter searchFilter) {
			this.searchFilter = searchFilter;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public static class SearchFilter {

			@SerializedName("ChangeTypeList")
			private List<Integer> changeTypeList;

			@SerializedName("SubmitStartTime")
			private String submitStartTime;

			@SerializedName("PageSize")
			private Integer pageSize;

			@SerializedName("SubmitEndTime")
			private String submitEndTime;

			@SerializedName("ProjectIdList")
			private List<Long> projectIdList;

			@SerializedName("SubmitterList")
			private List<String> submitterList;

			@SerializedName("Page")
			private Integer page;

			public List<Integer> getChangeTypeList() {
				return this.changeTypeList;
			}

			public void setChangeTypeList(List<Integer> changeTypeList) {
				this.changeTypeList = changeTypeList;
			}

			public String getSubmitStartTime() {
				return this.submitStartTime;
			}

			public void setSubmitStartTime(String submitStartTime) {
				this.submitStartTime = submitStartTime;
			}

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public String getSubmitEndTime() {
				return this.submitEndTime;
			}

			public void setSubmitEndTime(String submitEndTime) {
				this.submitEndTime = submitEndTime;
			}

			public List<Long> getProjectIdList() {
				return this.projectIdList;
			}

			public void setProjectIdList(List<Long> projectIdList) {
				this.projectIdList = projectIdList;
			}

			public List<String> getSubmitterList() {
				return this.submitterList;
			}

			public void setSubmitterList(List<String> submitterList) {
				this.submitterList = submitterList;
			}

			public Integer getPage() {
				return this.page;
			}

			public void setPage(Integer page) {
				this.page = page;
			}
		}
	}

	@Override
	public Class<ListSubmitRecordsResponse> getResponseClass() {
		return ListSubmitRecordsResponse.class;
	}

}
