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
public class ListQualityRuleTasksRequest extends RpcAcsRequest<ListQualityRuleTasksResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListQualityRuleTasksRequest() {
		super("dataphin-public", "2023-06-30", "ListQualityRuleTasks");
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

		@SerializedName("StatusList")
		private List<String> statusList;

		@SerializedName("BizDate")
		private String bizDate;

		@SerializedName("CatalogList")
		private List<String> catalogList;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("RuleTagList")
		private List<String> ruleTagList;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("RuleStrengthList")
		private List<String> ruleStrengthList;

		@SerializedName("ValidateResultList")
		private List<String> validateResultList;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("WatchTaskId")
		private Long watchTaskId;

		public List<String> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public List<String> getCatalogList() {
			return this.catalogList;
		}

		public void setCatalogList(List<String> catalogList) {
			this.catalogList = catalogList;
		}

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public List<String> getRuleTagList() {
			return this.ruleTagList;
		}

		public void setRuleTagList(List<String> ruleTagList) {
			this.ruleTagList = ruleTagList;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<String> getRuleStrengthList() {
			return this.ruleStrengthList;
		}

		public void setRuleStrengthList(List<String> ruleStrengthList) {
			this.ruleStrengthList = ruleStrengthList;
		}

		public List<String> getValidateResultList() {
			return this.validateResultList;
		}

		public void setValidateResultList(List<String> validateResultList) {
			this.validateResultList = validateResultList;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public Long getWatchTaskId() {
			return this.watchTaskId;
		}

		public void setWatchTaskId(Long watchTaskId) {
			this.watchTaskId = watchTaskId;
		}
	}

	@Override
	public Class<ListQualityRuleTasksResponse> getResponseClass() {
		return ListQualityRuleTasksResponse.class;
	}

}
