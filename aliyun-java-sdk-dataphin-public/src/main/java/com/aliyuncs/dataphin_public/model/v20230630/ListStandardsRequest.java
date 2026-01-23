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
public class ListStandardsRequest extends RpcAcsRequest<ListStandardsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListStandardsRequest() {
		super("dataphin-public", "2023-06-30", "ListStandards");
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

		@SerializedName("StandardTypeList")
		private List<String> standardTypeList;

		@SerializedName("StandardStage")
		private String standardStage;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("StandardStatusList")
		private List<String> standardStatusList;

		@SerializedName("StandardTemplateIdList")
		private List<Long> standardTemplateIdList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("StandardSetIdList")
		private List<Long> standardSetIdList;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("Directory")
		private String directory;

		@SerializedName("UserId")
		private String userId;

		public List<String> getStandardTypeList() {
			return this.standardTypeList;
		}

		public void setStandardTypeList(List<String> standardTypeList) {
			this.standardTypeList = standardTypeList;
		}

		public String getStandardStage() {
			return this.standardStage;
		}

		public void setStandardStage(String standardStage) {
			this.standardStage = standardStage;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public List<String> getStandardStatusList() {
			return this.standardStatusList;
		}

		public void setStandardStatusList(List<String> standardStatusList) {
			this.standardStatusList = standardStatusList;
		}

		public List<Long> getStandardTemplateIdList() {
			return this.standardTemplateIdList;
		}

		public void setStandardTemplateIdList(List<Long> standardTemplateIdList) {
			this.standardTemplateIdList = standardTemplateIdList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Long> getStandardSetIdList() {
			return this.standardSetIdList;
		}

		public void setStandardSetIdList(List<Long> standardSetIdList) {
			this.standardSetIdList = standardSetIdList;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public Class<ListStandardsResponse> getResponseClass() {
		return ListStandardsResponse.class;
	}

}
