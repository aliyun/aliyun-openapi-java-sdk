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
public class ListQualityRulesRequest extends RpcAcsRequest<ListQualityRulesResponse> {
	   

	private Long opTenantId;

	@SerializedName("listQuery")
	private ListQuery listQuery;
	public ListQualityRulesRequest() {
		super("dataphin-public", "2023-06-30", "ListQualityRules");
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

		@SerializedName("CatalogList")
		private List<String> catalogList;

		@SerializedName("TestRunTaskValidateResultList")
		private List<String> testRunTaskValidateResultList;

		@SerializedName("WatchId")
		private Long watchId;

		@SerializedName("PageNo")
		private Integer pageNo;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("TemplateIdList")
		private List<Long> templateIdList;

		@SerializedName("RuleStrengthList")
		private List<String> ruleStrengthList;

		@SerializedName("Keyword")
		private String keyword;

		@SerializedName("TestRunTaskStatusList")
		private List<String> testRunTaskStatusList;

		public List<String> getStatusList() {
			return this.statusList;
		}

		public void setStatusList(List<String> statusList) {
			this.statusList = statusList;
		}

		public List<String> getCatalogList() {
			return this.catalogList;
		}

		public void setCatalogList(List<String> catalogList) {
			this.catalogList = catalogList;
		}

		public List<String> getTestRunTaskValidateResultList() {
			return this.testRunTaskValidateResultList;
		}

		public void setTestRunTaskValidateResultList(List<String> testRunTaskValidateResultList) {
			this.testRunTaskValidateResultList = testRunTaskValidateResultList;
		}

		public Long getWatchId() {
			return this.watchId;
		}

		public void setWatchId(Long watchId) {
			this.watchId = watchId;
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

		public List<Long> getTemplateIdList() {
			return this.templateIdList;
		}

		public void setTemplateIdList(List<Long> templateIdList) {
			this.templateIdList = templateIdList;
		}

		public List<String> getRuleStrengthList() {
			return this.ruleStrengthList;
		}

		public void setRuleStrengthList(List<String> ruleStrengthList) {
			this.ruleStrengthList = ruleStrengthList;
		}

		public String getKeyword() {
			return this.keyword;
		}

		public void setKeyword(String keyword) {
			this.keyword = keyword;
		}

		public List<String> getTestRunTaskStatusList() {
			return this.testRunTaskStatusList;
		}

		public void setTestRunTaskStatusList(List<String> testRunTaskStatusList) {
			this.testRunTaskStatusList = testRunTaskStatusList;
		}
	}

	@Override
	public Class<ListQualityRulesResponse> getResponseClass() {
		return ListQualityRulesResponse.class;
	}

}
