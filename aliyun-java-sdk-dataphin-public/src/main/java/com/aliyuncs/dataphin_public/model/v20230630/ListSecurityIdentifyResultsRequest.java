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
public class ListSecurityIdentifyResultsRequest extends RpcAcsRequest<ListSecurityIdentifyResultsResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListSecurityIdentifyResultsRequest() {
		super("dataphin-public", "2023-06-30", "ListSecurityIdentifyResults");
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

		@SerializedName("ClassifyId")
		private Long classifyId;

		@SerializedName("ProjectNameList")
		private List<String> projectNameList;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("IsLocked")
		private Boolean isLocked;

		@SerializedName("DatasourceNameList")
		private List<String> datasourceNameList;

		@SerializedName("Env")
		private String env;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("BizUnitNameList")
		private List<String> bizUnitNameList;

		@SerializedName("Status")
		private String status;

		public Long getClassifyId() {
			return this.classifyId;
		}

		public void setClassifyId(Long classifyId) {
			this.classifyId = classifyId;
		}

		public List<String> getProjectNameList() {
			return this.projectNameList;
		}

		public void setProjectNameList(List<String> projectNameList) {
			this.projectNameList = projectNameList;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Boolean getIsLocked() {
			return this.isLocked;
		}

		public void setIsLocked(Boolean isLocked) {
			this.isLocked = isLocked;
		}

		public List<String> getDatasourceNameList() {
			return this.datasourceNameList;
		}

		public void setDatasourceNameList(List<String> datasourceNameList) {
			this.datasourceNameList = datasourceNameList;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public List<String> getBizUnitNameList() {
			return this.bizUnitNameList;
		}

		public void setBizUnitNameList(List<String> bizUnitNameList) {
			this.bizUnitNameList = bizUnitNameList;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public Class<ListSecurityIdentifyResultsResponse> getResponseClass() {
		return ListSecurityIdentifyResultsResponse.class;
	}

}
