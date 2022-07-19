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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryRMSUnifiedAlarmRuleRequest extends RpcAcsRequest<QueryRMSUnifiedAlarmRuleResponse> {
	   

	private String workspaceName;

	private String refDatasourceType;

	private Long pageSize;

	private String keyword;

	private Long level;

	private Long currentPage;

	private String ruleUniqueIdentity;

	private Boolean onlyMe;

	private Long alarmStatus;

	private String alarmTargetJsonStr;

	private Long ruleStatus;

	private Long ruleId;

	private String category;
	public QueryRMSUnifiedAlarmRuleRequest() {
		super("SOFA", "2019-08-15", "QueryRMSUnifiedAlarmRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public String getRefDatasourceType() {
		return this.refDatasourceType;
	}

	public void setRefDatasourceType(String refDatasourceType) {
		this.refDatasourceType = refDatasourceType;
		if(refDatasourceType != null){
			putBodyParameter("RefDatasourceType", refDatasourceType);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level.toString());
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getRuleUniqueIdentity() {
		return this.ruleUniqueIdentity;
	}

	public void setRuleUniqueIdentity(String ruleUniqueIdentity) {
		this.ruleUniqueIdentity = ruleUniqueIdentity;
		if(ruleUniqueIdentity != null){
			putBodyParameter("RuleUniqueIdentity", ruleUniqueIdentity);
		}
	}

	public Boolean getOnlyMe() {
		return this.onlyMe;
	}

	public void setOnlyMe(Boolean onlyMe) {
		this.onlyMe = onlyMe;
		if(onlyMe != null){
			putBodyParameter("OnlyMe", onlyMe.toString());
		}
	}

	public Long getAlarmStatus() {
		return this.alarmStatus;
	}

	public void setAlarmStatus(Long alarmStatus) {
		this.alarmStatus = alarmStatus;
		if(alarmStatus != null){
			putBodyParameter("AlarmStatus", alarmStatus.toString());
		}
	}

	public String getAlarmTargetJsonStr() {
		return this.alarmTargetJsonStr;
	}

	public void setAlarmTargetJsonStr(String alarmTargetJsonStr) {
		this.alarmTargetJsonStr = alarmTargetJsonStr;
		if(alarmTargetJsonStr != null){
			putBodyParameter("AlarmTargetJsonStr", alarmTargetJsonStr);
		}
	}

	public Long getRuleStatus() {
		return this.ruleStatus;
	}

	public void setRuleStatus(Long ruleStatus) {
		this.ruleStatus = ruleStatus;
		if(ruleStatus != null){
			putBodyParameter("RuleStatus", ruleStatus.toString());
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putBodyParameter("RuleId", ruleId.toString());
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putBodyParameter("Category", category);
		}
	}

	@Override
	public Class<QueryRMSUnifiedAlarmRuleResponse> getResponseClass() {
		return QueryRMSUnifiedAlarmRuleResponse.class;
	}

}
